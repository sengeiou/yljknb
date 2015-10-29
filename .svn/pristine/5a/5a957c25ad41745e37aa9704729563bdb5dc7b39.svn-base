package com.wondersgroup.local.k3.f10301004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;

public class DeleteObjectAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301004VS f10301004VS	;

	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	@Override
	public String operate() {
		String aaz077 = this.servletRequest.getParameter("aaz077");
		
		this.getF10301004VS().deleteObject(aaz077);
		String result = prefix + suffex;
		return result;
	}
}
