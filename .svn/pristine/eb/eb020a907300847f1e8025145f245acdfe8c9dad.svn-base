package com.wondersgroup.local.k4.f10401002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10401002.vo.RuleTaskVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class AddRuleTaskAction extends BaseAjaxAction{

	
	private static final long serialVersionUID = 1L;
	
 
	private F10401002VS f10401002VS;
	
	
	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}


	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}


	protected String operate() {
		
		RuleTaskVO resultVO=new RuleTaskVO();
		resultVO.setAaz319(Long.valueOf(getServletRequest().getParameter("aaz319")));
		resultVO.setAaz325(Long.valueOf(getServletRequest().getParameter("aaz325")));
		f10401002VS.addRuleTask(resultVO);
		return SUCCESS;
		
	}

}
