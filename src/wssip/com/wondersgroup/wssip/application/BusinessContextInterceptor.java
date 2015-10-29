/** 
 * @(#)BusinessContextInterceptor.java 2008-10-31
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

package com.wondersgroup.wssip.application;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeanUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.wondersgroup.framework.core5.business.context.Environment;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.wssip.application.context.YljkUserContext;
import com.wondersgroup.wssuap.core.base.model.bo.UapUser;

/**
 * @author Yao Jianping
 * @version $Revision: 13 $ 2008-10-31
 * @author $Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ by $Author: Suhl $
 * @since 1.0
 */
public class BusinessContextInterceptor extends MethodFilterInterceptor {
	
	private static final long serialVersionUID = 1L;
	
	private final Logger log = Logger.getLogger("struts2.businesscontext.log");

	protected void log() {
		UserContext userContext = BusinessContextUtils.getUserContext();
		Environment environment = BusinessContextUtils.getEnvironment();
		if (StringUtils.isEmpty(userContext.getOperatorId())) {
			log.error(String.format("%s[%s][#%d]:lost business context!", environment.getIpAddress(), environment
					.getMacAddress(), Thread.currentThread().getId()));
		}
	}

	/**
	 * @see com.opensymphony.xwork2.interceptor.MethodFilterInterceptor#doIntercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		ActionContext actionContext = invocation.getInvocationContext();
		Map session = actionContext.getSession();

		UserContext userContext = BusinessContextUtils.getUserContext();
		Environment environment = BusinessContextUtils.getEnvironment();
		
        YljkUserContext ysxtUserContext = new YljkUserContext();		
		BeanUtils.copyProperties(userContext,ysxtUserContext);

		UapUser operator = (UapUser) session.get(SessionConstants.WSSIP_OPERATOR);
		ysxtUserContext.setOperator(operator);

		String operatorId = (String) session.get(SessionConstants.WSSIP_OPERATOR_ID);
		ysxtUserContext.setOperatorId(operatorId);

		String operatorName = (String) session.get(SessionConstants.WSSIP_OPERATOR_NAME);
		ysxtUserContext.setOperatorName(operatorName);
		
		//ysxtUserContext.setOrgancode(session.get(SessionConstants.WSSIP_OPERATOR_ORGANCODE).toString());
		ysxtUserContext.setOrganname(session.get(SessionConstants.WSSIP_OPERATOR_ORGANNAME).toString());
		
		BusinessContextUtils.setUserContext(ysxtUserContext); 

		String businesstype = (String) session.get(SessionConstants.WSSIP_ENVIRONMENT_BUSINESSTYPE);

		environment.setBusinessType(businesstype);

		environment.setCurrentDate(new Date());

		environment.setIpAddress(ServletActionContext.getRequest().getRemoteAddr());

		String macAddress = (String) session.get(SessionConstants.WSSIP_CLIENT_MACADDRESS);
		environment.setMacAddress(macAddress);

		log();
		try {
			return invocation.invoke();
		}
		finally {
			BusinessContextUtils.clearContext();
		}
	}
}
