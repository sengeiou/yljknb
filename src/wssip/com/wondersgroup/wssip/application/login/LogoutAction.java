/** 
 * @(#)LogoutAction.java 2008-10-16
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

import com.wondersgroup.framework.core.web.struts2.action.BaseAction;


/**
 * @author Yao Jianping
 * @version $Revision: 13 $ 2008-10-16
 * @author $Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ by $Author: Suhl $
 * @since 1.0
 */
public class LogoutAction extends BaseAction {
	
	private static final long serialVersionUID = 1L;

	//	private UserService userService;
//	
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
	/**
	 * @see com.wondersgroup.framework.core.web.struts2.action.BaseAction#execute()
	 */

	public String logout() throws Exception {
		//记录操作用户登出日志 ADD BY JYY 2013-4-11
		/*SecurityUser securityUser = (SecurityUser)getSession().get(SessionConstants.WSSIP_OPERATOR);
		UserLoginHistory userLoginHistory = new UserLoginHistory();
		this.recordUserLogin(userLoginHistory,securityUser);*/
		getSession().clear();
		getServletRequest().getSession().invalidate();
		return INPUT;
	}
	
/*	private void recordUserLogin(UserLoginHistory userLoginHistory, SecurityUser user) {
		if ( null != user) {
			userLoginHistory.setUserName(user.getName());
			userLoginHistory.setUser(user);
		}
		StringBuffer sql = new StringBuffer("");
		sql.append("select id as code,name as value from cs_webapp_node a where a.code='shybQxpt' ");
		List<YbbVO> reList = YbkrnlJdbcDaoUtils.query(sql.toString(), YbbVO.class);
		String webid = reList.get(0).getCode();
		String webname = reList.get(0).getValue();
		userLoginHistory.setAppId(Long.valueOf(webid));
		userLoginHistory.setAppName(webname);
		userLoginHistory.setLoginTime(new Date().getTime());
		userLoginHistory.setIpAddress(this.servletRequest.getRemoteAddr());
		userLoginHistory.setOperatingSys(this.servletRequest.getHeader("User-Agent"));
		userLoginHistory.setUserState(UserLoginHistory.USER_STATE_CLOSED);
		userService.addUserLoginHistory(userLoginHistory);
	}*/

	
}
