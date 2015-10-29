/** 
 * @(#)BaseUploadAction.java Jun 29, 2010
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

package com.wondersgroup.wssip.web;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wondersgroup.framework.core.web.struts2.AjaxProvider;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

/**
 * @author xieguojun
 * @version $Revision$ Jun 29, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@SuppressWarnings({ "serial", "rawtypes" })
public abstract class BaseUploadAction extends ActionSupport 
	implements AjaxProvider, ModelDriven, SessionAware,
		ParameterAware, ServletRequestAware, ServletResponseAware {

	@SuppressWarnings("unused")
	private Writer writer;

	private String defaultEncoding;

	public static final String ERRORS = "{success:false,result:[{}],exception:[{msg:'%s'}]}";
	
	protected Map session;
	protected Map parameters;
	protected HttpServletRequest servletRequest;
	protected HttpServletResponse servletResponse;
	
	private String responseData;
	private String errorResultLocation;
	private boolean ajaxSuccess;

	public BaseUploadAction() {

		this.defaultEncoding = "UTF-8";
	}

	@Override
	public String execute() throws Exception {

		String result = null;

		try {
			result = operate();
		}
		catch (Exception e) {
			writerJson(String.format(ERRORS, e.getMessage()));
			return null;
		}

		writerJson(result);

		return null;
	}

	public void writerJson(String json) throws IOException {

		HttpServletResponse response = ServletActionContext.getResponse();

		String contentType = "text/html" + ";charset=" + defaultEncoding;

		response.setContentType(contentType);

		response.getWriter().write(json);
		response.getWriter().flush();
	}

	public Object getModel() {
		return getValueObject();
	}

	public Map getSession() {
		return this.session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public Map getParameters() {
		return this.parameters;
	}

	public void setParameters(Map parameters) {
		this.parameters = parameters;
	}

	public HttpServletRequest getServletRequest() {
		return this.servletRequest;
	}

	public HttpServletResponse getServletResponse() {
		return this.servletResponse;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#getErrorResultLocation()
	 */
	public String getErrorResultLocation() {
		 
		return this.errorResultLocation;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#getResponseData()
	 */
	public String getResponseData() {
		 
		return this.responseData;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#hasAjaxErrors()
	 */
	public boolean hasAjaxErrors() {
		 
		String object = (String)ActionContext.getContext().get("com.wondersgroup.framework.core.web.ajax.errors.flag");
	    return Boolean.parseBoolean(object);
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#isAjaxSuccess()
	 */
	public boolean isAjaxSuccess() {
		 
		return this.ajaxSuccess;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#setAjaxSuccess(boolean)
	 */
	public void setAjaxSuccess(boolean ajaxSuccess) {
	    this.ajaxSuccess = ajaxSuccess;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#setErrorResultLocation(java.lang.String)
	 */
	public void setErrorResultLocation(String errorResultLocation) {
		this.errorResultLocation = errorResultLocation;
	}

	/** 
	 * @see com.wondersgroup.framework.core.web.struts2.AjaxProvider#setResponseData(java.lang.String)
	 */
	public void setResponseData(String arg0) {
		this.responseData = arg0;
	}

	protected abstract String operate();

	protected abstract ValueObject getValueObject();

}
