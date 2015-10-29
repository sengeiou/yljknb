package com.wondersgroup.local.k4.f10402002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;

public class UpdateRuleAae100Action extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10402002VS f10402002VS;
	
	@Override
	protected String operate() {

		RuleVO rule = new RuleVO();
		
		rule.setAaz319(Long.valueOf(getServletRequest().getParameter("aaz319")));
		
		rule.setAae100(getServletRequest().getParameter("aae100"));
		
		f10402002VS.updateRuleAae100(rule);
		
		return SUCCESS;
	}

	public F10402002VS getF10402002VS() {
		return f10402002VS;
	}

	public void setF10402002VS(F10402002VS f10402002vs) {
		f10402002VS = f10402002vs;
	}
	
}
