package com.wondersgroup.local.k4.f10402003.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.local.k4.f10402003.vs.F10402003VS;

public class LoadAnalysisRuleAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10402003VS f10402003VS;	
	@Override
	protected String operate() {
		AnalysisRuleVO rule=f10402003VS.loadAnalysisRule(getServletRequest().getParameter("id"));
		return VOUtils.getJsonData(rule);
	}
	public F10402003VS getF10402003VS() {
		return f10402003VS;
	}
	public void setF10402003VS(F10402003VS f10402003vs) {
		f10402003VS = f10402003vs;
	}

}
