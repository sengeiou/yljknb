package com.wondersgroup.local.k4.f10401002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class CheckManageAction extends BaseAjaxAction{

	 
	private static final long serialVersionUID = 1L;
	
	private F10401002VS f10401002VS;
	
	@Override
	protected String operate() {
		f10401002VS.checkManage(getServletRequest().getParameter("aaz325"), getServletRequest().getParameter("type"));
		return SUCCESS;
	}

	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}

	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}
	
	
	

}
