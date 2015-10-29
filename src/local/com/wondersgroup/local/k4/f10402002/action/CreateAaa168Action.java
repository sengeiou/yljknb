package com.wondersgroup.local.k4.f10402002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;

public class CreateAaa168Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
		
	private F10402002VS f10402002VS;
	
	@Override
	protected String operate() {
		
		String result = "{\"aaa168\":\""+f10402002VS.getAaa168(getServletRequest().getParameter("aaa153"))+"\"}";
		return result;
	}
	
	public F10402002VS getF10402002VS() {
		return f10402002VS;
	}

	public void setF10402002VS(F10402002VS f10402002vs) {
		f10402002VS = f10402002vs;
	}
}
