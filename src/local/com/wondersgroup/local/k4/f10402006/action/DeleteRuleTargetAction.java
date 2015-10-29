package com.wondersgroup.local.k4.f10402006.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;

import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;

public class DeleteRuleTargetAction extends BaseAjaxAction{
	

	private static final long serialVersionUID = 1L;

	private F10402006VS f10402006VS;
	
	
	public F10402006VS getF10402006VS() {
		return f10402006VS;
	}

	public void setF10402006VS(F10402006VS f10402006vs) {
		f10402006VS = f10402006vs;
	}

	protected String operate() {
		
		String idStr=this.getServletRequest().getParameter("idStr");
		
		this.f10402006VS.deleteRuleTarget(idStr);
		
		return SUCCESS;
		
		
	}


}
