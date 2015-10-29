/** 
 * @(#)AjaxResult.java Jun 23, 2010
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.framework.core.web.struts2.views;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.inject.Inject;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.struts2.AjaxProvider;
/**
 * @author xieguojun
 * @version $Revision$ Jun 23, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class AjaxResult extends StrutsResultSupport {

	private static final long serialVersionUID = 1L;

	Log logger = LogFactory.getLog(AjaxResult.class);

	private Writer writer;

	private String defaultEncoding;

	public AjaxResult() {
		this.defaultEncoding = "UTF-8";
	}

	@Inject("struts.i18n.encoding")
	public void setDefaultEncoding(String encoding) {
		this.defaultEncoding = encoding;
	}

	protected void doExecute(String finalLocation, ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
		String responseData = "";
		if (action instanceof AjaxProvider) {
			AjaxProvider ajaxAction = (AjaxProvider) action;
			HttpServletResponse response = ServletActionContext.getResponse();
			String encoding = getEncoding(finalLocation);
			String contentType = getContentType(finalLocation);
			if (encoding != null) {
				contentType = contentType + ";charset=" + encoding;
			}
			response.setContentType(contentType);
			String successData = ajaxAction.getResponseData();
			if (successData != null) {
				if ("success".equals(successData)) {
					responseData = "{\"success\":true}";
				}
				else if (ajaxAction.isAjaxSuccess()) {
					responseData = "{\"success\":true,\"result\":[" + successData + "]}";
				}
				else {
					responseData = successData;
				}

			}else if (ajaxAction.hasAjaxErrors()) {
				// 设置状态码 2013-8-21
				//response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				
				String errorResultLocation = ajaxAction.getErrorResultLocation();
				// 调整对异常的处理 by xieguojun
				// String exceptionMessage = invocation.getStack().findString("exception.message");
				Exception exeption = (Exception) invocation.getStack().findValue("exception");
				String exceptionMessage = getExceptionMessage(exeption);
				
				exeption.printStackTrace();

				exceptionMessage = exceptionMessage.replaceAll("\r", " ");
				exceptionMessage = exceptionMessage.replaceAll("\n", " ");
				exceptionMessage = exceptionMessage.replaceAll("\t", " ");
				
				responseData = getFailureData(errorResultLocation, exceptionMessage);
			}
			if(logger.isDebugEnabled()){
				logger.debug(String.format("write:[%s]", getWriter().toString()));
				logger.debug(String.format("responseData:[%s]", responseData));
			}
			getWriter().write(responseData);
		}
	}

	private String getFailureData(String errorResultLocation, String exceptionMessage) {
		//String errors = "\"errors\":[{\"msg\":\"" + exceptionMessage + "\"}],";
		//String exception = "\"exception\":[{\"msg\":\"" + exceptionMessage + "\"}],";
		//String target = "\"target\":\"" + errorResultLocation;
		//String failureData = "{\"success\":\"false\",\"result\":[]," + errors + exception + target + "\"}";
		String failureData = "{\"success\":false,\"msg\":\"" + exceptionMessage + "\"}";

		return failureData;
	}
	

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	protected Writer getWriter() throws IOException {
		if (this.writer != null) {
			return this.writer;
		}
		return ServletActionContext.getResponse().getWriter();
	}

	protected String getContentType(String templateLocation) {
		return "application/json";
	}

	protected String getEncoding(String templateLocation) {
		String encoding = this.defaultEncoding;
		if (encoding == null) {
			encoding = System.getProperty("file.encoding");
		}
		if (encoding == null) {
			encoding = "UTF-8";
		}
		return encoding;
	}

	/**
	 * 获取实际的BusinessException或者FrameworkException的消息 xieguojun
	 * 
	 * @param exception
	 * @return
	 */
	private String getExceptionMessage(Exception exception) {

		Throwable throwable = exception;

		while (!(throwable instanceof BusinessException) && !(throwable instanceof BusinessException)) {
			throwable = visitException(throwable);

			if (throwable == null)
				return "";
		}

		return throwable.getMessage();
	}

	/**
	 * 访问当前异常的Throwable xieguojun
	 * 
	 * @param exception
	 * @return
	 */
	private Throwable visitException(Throwable exception) {
		return exception.getCause();
	}
}
