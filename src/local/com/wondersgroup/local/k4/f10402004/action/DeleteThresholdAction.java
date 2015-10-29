package com.wondersgroup.local.k4.f10402004.action;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.local.k4.f10402004.vo.ThresholdVO;
import com.wondersgroup.local.k4.f10402004.vs.F10402004VS;

public class DeleteThresholdAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	F10402004VS f10402004VS;
	
	@Override
	protected String operate() {
		ThresholdVO vo=new ThresholdVO();
		BaseKa45Id id=new BaseKa45Id();
		id.setAaa155(Long.valueOf(getServletRequest().getParameter("aaa155")));
		id.setAaz319(Long.valueOf(getServletRequest().getParameter("aaz319")));
		vo.setId(id);
		f10402004VS.deleteThreshold(vo);
		return SUCCESS;
	}

	public F10402004VS getF10402004VS() {
		return f10402004VS;
	}

	public void setF10402004VS(F10402004VS f10402004vs) {
		f10402004VS = f10402004vs;
	}
}
