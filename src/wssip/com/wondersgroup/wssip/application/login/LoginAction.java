/** 
 * @(#)LoginAction.java 2008-9-5
 * 
 * Copyright (c) 1995-2008 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Wonders Group.
 * (Social Security Department). You shall not disclose such
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with Wonders Group. 
 *
 * Distributable under GNU LGPL license by gnu.org
 */

package com.wondersgroup.wssip.application.login;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.core.web.struts2.action.BaseAction;
import com.wondersgroup.framework.core.web.struts2.interceptor.LoginInterceptor;
import com.wondersgroup.framework.core5.business.context.BusinessContext;
import com.wondersgroup.framework.core5.business.context.Environment;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.wssip.application.ApplicationConstants;
import com.wondersgroup.wssip.application.LoginConstants;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.StringTools;
import com.wondersgroup.wssuap.client.authentication.AuthenticactionService;
import com.wondersgroup.wssuap.client.authorization.AuthorizationProxy;
import com.wondersgroup.wssuap.client.authorization.AuthorizationService;
import com.wondersgroup.wssuap.client.domain.DomainService;
import com.wondersgroup.wssuap.client.menu.MenuResourceTreeUtils;
import com.wondersgroup.wssuap.client.menu.MenuService;
import com.wondersgroup.wssuap.client.organ.OrganService;
import com.wondersgroup.wssuap.client.resource.ResourceService;
import com.wondersgroup.wssuap.commons.tree.Tree;
import com.wondersgroup.wssuap.core.authentic.UapAuthenticException;
import com.wondersgroup.wssuap.core.authentic.connector.AuthenticationUser;
import com.wondersgroup.wssuap.core.base.model.BaseUapMenuResource;
import com.wondersgroup.wssuap.core.base.model.BaseUapOrganNode;
import com.wondersgroup.wssuap.core.base.model.bo.UapApplication;
import com.wondersgroup.wssuap.core.base.model.bo.UapDomain;
import com.wondersgroup.wssuap.core.base.model.bo.UapUser;
import com.wondersgroup.wssuap.core.base.organ.TreeOrganDataProvider;
import com.wondersgroup.wssuap.util.CollectionUtils;

/**
 * 登录action
 * 
 * @author Yao Jianping
 * @version $Revision: 13 $ 2008-9-5
 * @author $Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ by $Author: Suhl
 *         $
 * @since 1.0
 */

@SuppressWarnings( { "unchecked", "serial" })
public class LoginAction extends BaseAction implements LoginConstants,
		ApplicationConstants {
	private String domainCode;
	private String applicationCode;

	private AuthenticactionService authenticactionService;
	private AuthorizationService authorizationService;
	// private MenuService menuService;
	private OrganService organService;
	private DomainService domainService;

	@SuppressWarnings({ "unused", "rawtypes" })
	private TreeOrganDataProvider treeOrganDataProvider;
	private MenuService menuService;

	private LoginInfo loginInfo = new LoginInfo();

	public String login() {
		String loginName = getServletRequest().getParameter("loginName");
		String password = getServletRequest().getParameter("password");

		String macAddress = getServletRequest().getParameter("macAddress");

		// 用户验证
		AuthenticationUser user = null;

		try {
			user = authenticactionService.authenticate(loginName, password);
		} catch (UapAuthenticException ex) {
			String errMessage = loginName + " 登录失败:" + ex.getMessage();
			logger.error(errMessage);
			loginInfo.setErrorMessage(errMessage);
			return INPUT;
		}

		if (!(user instanceof UapUser)) {
			String errMessage = loginName + " 登录失败:不能使用外部用户登录!";
			logger.error(errMessage);
			loginInfo.setErrorMessage(errMessage);
			return INPUT;
		}
		UapUser uapUser = (UapUser) user;
		try {
			// 权限验证（验证是否有子系统权限）
			AuthorizationProxy authorizationProxy = authorizationService
					.getAuthorizationProxy(user);

			ResourceService<UapApplication> resourceService = authorizationProxy
					.getResourceService(UapApplication.class, "APPLICATION",
							"ACCESS", domainCode, applicationCode);
			List<UapApplication> applications = resourceService
					.getResources(null);

			if (CollectionUtils.isEmpty(applications)) {
				String errMessage = loginName + " 没有权限访问本系统";
				logger.error(errMessage);
				loginInfo.setErrorMessage(errMessage);
				return INPUT;
			}
			createBusinessContext(uapUser);

			//cl 20140827
			Tree<BaseUapMenuResource> applicationMenus = menuService
					.getAuthMenuResources(uapUser, domainCode, applicationCode);
			Map<String, List<BaseUapMenuResource>> applicationMenusMap = MenuResourceTreeUtils
					.convert(applicationMenus);
			getSession().put("menu", applicationMenusMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(String.format("当前登录人:%s[%s][%s][%s]", uapUser
				.getLoginName(), uapUser.getName(), getServletRequest()
				.getRemoteAddr(), macAddress));

		return SUCCESS;

	}
	
	public String loginByAjax() {
		String jsonData=null;
		String loginname = getServletRequest().getParameter("loginname");
		String userid = getServletRequest().getParameter("userid");
		String realname = getServletRequest().getParameter("realname");
		String orgid = getServletRequest().getParameter("orgid");
		String orgname = getServletRequest().getParameter("orgname");
		String xzqhid = getServletRequest().getParameter("xzqhid");
		String check = getServletRequest().getParameter("check");
		String type = getServletRequest().getParameter("type");
		String dwybh = getServletRequest().getParameter("dwybh");
		String dwdm = getServletRequest().getParameter("dwdm");
		String uncheck="";
		getSession().put(SessionConstants.WSSIP_OPERATOR_ID,userid);
		getSession().put(SessionConstants.WSSIP_OPERATOR_LOGINNAME,loginname);
		getSession().put(SessionConstants.WSSIP_OPERATOR_NAME,realname);
		getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANNAME,orgname);
		getSession().put(SessionConstants.WSSIP_OPERATOR_SECURITYAGENT,xzqhid);
		try {
			uncheck=encodeToMD5(userid + loginname + realname + orgid + orgname + xzqhid+type+dwybh+dwdm);
		} catch (Exception e1) {
			jsonData=e1.toString();
		}
		if (StringTools.hasText(dwdm)) {
			String newdwdm=dwdm.trim();
			for (int i = 0; i < 16-dwdm.length(); i++) {
				newdwdm=newdwdm+" ";
			}
			dwdm="'"+newdwdm+"'";
		}
		if ("1".equals(type)) {
			String result=getLoginInfo(xzqhid,userid);
			getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANCODE, result);
		} else if ("2".equals(type)) {
			getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANCODE, dwdm);
		}
		System.out.println("dwdm.length="+dwdm.length());
		System.out.println("loginname="+loginname+",userid="+userid+",realname="+realname+",orgid="+orgid+",orgname="+orgname+",xzqhid="+xzqhid+",type="+type+",check="+check+",dwybh="+dwybh+",dwdm="+dwdm);
		System.out.println(uncheck);
		if (check!=null) {
			if (check.equals(uncheck)) {
				jsonData= "success";
				newLogin(userid,loginname,realname,orgid,orgname,xzqhid);
			}else {
				jsonData= "false";
			}
		}
		System.out.println(jsonData);
		try {
			returnAjax(jsonData);
			System.out.println(jsonData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String getLoginInfo(String xzqhid, String userid) {
		String res="";
		try {
			String sql=" select yboltp.PK_ZNSH.Func_CheckSh('"+xzqhid+"', '"+userid+"') res from dual  ";
			Map<String, Object>  result=CommonJdbcDaoUtils.queryForMap(sql);
			JSONObject json =new JSONObject();
			if (result!=null) {
				json.accumulateAll(result);
				JSONObject json1=json.getJSONObject("RES");
				String flag=json1.getString("success");
				if ("true".equals(flag)) {
					JSONArray array=json1.getJSONArray("result");
					for (int i = 0; i < array.size(); i++) {
						JSONObject obj=(JSONObject) array.get(i);
						res=res+"'"+obj.get("yydm")+"',";
					}
					res=res.substring(0, res.length()-1);
				}else {
					return null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			res="'000000'";
		}
		return res;
	}

	private void newLogin(String userid, String loginname, String realname, String orgid, String orgname, String xzqhid) {
		// 用户验证
		UapUser uapUser = new UapUser();
		uapUser.setUserid(Long.parseLong(userid));
		uapUser.setLoginName(loginname);
		uapUser.setName(realname);
		uapUser.setEnable(true);
		UserContext userContext = BusinessContextUtils.getUserContext();
		userContext.setOperator(uapUser);
		userContext.setOperatorId(String.valueOf(uapUser.getUserid()));
		userContext.setOperatorName(uapUser.getLoginName());
		Environment environment = BusinessContextUtils.getEnvironment();
		environment.setIpAddress(getServletRequest().getRemoteAddr());
		environment.setMacAddress("UNKNOWN");
		applicationCode="YLFWJK";
		domainCode="YLFWJK";
		getSession().put(LoginInterceptor.SECURITY_LOGIN_NAME,
				uapUser.getLoginName());
		getSession().put(SessionConstants.WSSIP_SYSTEM_APPLICATIONCODE,
				applicationCode);
		getSession().put(SessionConstants.WSSIP_SYSTEM_DOMAINCODE, domainCode);
		getSession().put(SessionConstants.WSSIP_OPERATOR, uapUser);
		createBusinessContextEx(uapUser, userContext, environment,
				BusinessContextUtils.getContext());
	}

	private void returnAjax(String msg) throws Exception
	{
		HttpServletResponse response = getServletResponse();
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(msg.getBytes());
		outputStream.flush();
	}

	protected void createBusinessContext(UapUser uapUser) {
		String macAddress = getServletRequest().getParameter("macAddress");
		// String password = getServletRequest().getParameter("password");
		// 设置应用上下文
		UserContext userContext = BusinessContextUtils.getUserContext();
		userContext.setOperator(uapUser);
		userContext.setOperatorId(String.valueOf(uapUser.getUserid()));
		userContext.setOperatorName(uapUser.getLoginName());
		//查询登录人的角色
		Map<String, Object> uapGroup=CommonJdbcDaoUtils.queryForMap(" select * from UAP_GROUP t where t.groupid in(select t.groupid from UAP_GROUP_USER t where t.userid=? ) and t.group_type='NORMAL'", uapUser.getUserid());
		
		Environment environment = BusinessContextUtils.getEnvironment();
		environment.setIpAddress(getServletRequest().getRemoteAddr());
		environment.setMacAddress("UNKNOWN");

		
		if (StringUtils.isNotEmpty(macAddress)) {
			environment.setMacAddress(macAddress);
		}
		// 获取组织信息(可以通过organData获取到机构编码及机构名称)
		BaseUapOrganNode[] organNodes = organService.getUserOrgans(uapUser
				.getUserid());
		BaseUapOrganNode organNode = null;
		// OrganData organData = null;

		if (organNodes != null && organNodes.length != 0) {
			organNode = organNodes[0];
		} else {
			UapDomain domian = domainService.getDomain(domainCode);
			long rootNodeId = domian.getRootNodeid();
			BaseUapOrganNode rootOrganNode = organService
					.getOrganNode(rootNodeId);
			organNode = rootOrganNode;
		}
		getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANNAME,
				organNode.getName());
		if ("1003".equals(uapGroup.get("CODE"))) {
			getSession().put(SessionConstants.WSSIP_OPERATOR_GROUPNAME,
					uapUser.getName());
		}else {
			getSession().put(SessionConstants.WSSIP_OPERATOR_GROUPNAME,
					organNode.getName());
		}
		getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANCODE,
				"'101600          '");

		// 设置Session
		getSession().put(LoginInterceptor.SECURITY_LOGIN_NAME,
				uapUser.getLoginName());
		getSession().put(SessionConstants.WSSIP_OPERATOR_ID,
				String.valueOf(uapUser.getUserid()));
		getSession().put(SessionConstants.WSSIP_OPERATOR_NAME,
				uapUser.getName());

		getSession().put(SessionConstants.WSSIP_OPERATOR, uapUser);

		if (StringUtils.isNotEmpty(macAddress)) {
			getSession().put(SessionConstants.WSSIP_CLIENT_MACADDRESS,
					macAddress);
		}

		getSession().put(SessionConstants.WSSIP_SYSTEM_APPLICATIONCODE,
				applicationCode);
		getSession().put(SessionConstants.WSSIP_SYSTEM_DOMAINCODE, domainCode);

		List<Map<String,Object>> resList=CommonJdbcDaoUtils.queryForList(" select akb020 from kc63 group by akb020 ");
		String res="";
		if (resList!=null) {
			for (int i = 0; i < resList.size(); i++) {
				Map<String, Object> map=resList.get(i);
				if ((i+1)==resList.size()) {
					res=res+"'"+(String) map.get("AKB020")+"'";
				}else {
					res=res+"'"+(String) map.get("AKB020")+"',";
				}
			}
		}
		getSession().put(SessionConstants.WSSIP_OPERATOR_ORGANCODE, res);
		
		createBusinessContextEx(uapUser, userContext, environment,
				BusinessContextUtils.getContext());
	}

	/**
	 * 扩展业务上下文
	 * 
	 * 
	 * @param securityUser
	 * @param userContext
	 * @param environment
	 * @param businessContext
	 */
	protected void createBusinessContextEx(UapUser uapUser,
			UserContext userContext, Environment environment,
			BusinessContext businessContext) {

	}

	public void setAuthenticactionService(
			AuthenticactionService authenticactionService) {
		this.authenticactionService = authenticactionService;
	}

	public void setAuthorizationService(
			AuthorizationService authorizationService) {
		this.authorizationService = authorizationService;
	}

	// public void setMenuService(MenuService menuService) {
	// this.menuService = menuService;
	// }
	public void setOrganService(OrganService organService) {
		this.organService = organService;
	}

	public void setDomainService(DomainService domainService) {
		this.domainService = domainService;
	}

	@SuppressWarnings("rawtypes")
	public void setTreeOrganDataProvider(
			TreeOrganDataProvider treeOrganDataProvider) {
		this.treeOrganDataProvider = treeOrganDataProvider;
	}

	public String getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
	private static String encodeToMD5(String s) throws Exception{
		if (s == null)
		return null;
		    String digstr = "";
		java.security.MessageDigest MD = java.security.MessageDigest.getInstance("MD5");

		byte[] oldbyte = new byte[s.length()];
		for (int i = 0; i < s.length(); i++) {
		        oldbyte[i] = (byte) s.charAt(i);
		    }
		    MD.update(oldbyte);
		byte[] newbyte = MD.digest(oldbyte);
		for (int i = 0; i < newbyte.length; i++) {
		        digstr = digstr + newbyte[i];
		    }

		return digstr;
		}


}
