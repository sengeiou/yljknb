package com.wondersgroup.local.k4.f10401002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class DeleteAnalyzeTaskAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10401002VS f10401002VS;
	
	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}

	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}
	protected String operate() {
		
		String idStr=this.getServletRequest().getParameter("idStr");
		
		this.f10401002VS.deleteAnalyze(idStr);
		
		return SUCCESS;
		
	}

}
