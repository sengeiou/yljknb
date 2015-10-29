package com.wondersgroup.local.k4.f10402004.action;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402004.vo.ThresholdVO;
import com.wondersgroup.local.k4.f10402004.vs.F10402004VS;

public class LoadThresholdAction extends BaseAjaxAction{
	
	
	private static final long serialVersionUID = 1L;

	F10402004VS f10402004VS;
	
	@Override
	protected String operate() {
		
		BaseKa45Id id=new BaseKa45Id();
		
		
		id.setAaa155(Long.valueOf(getServletRequest().getParameter("aaa155")));
		
		id.setAaz319(Long.valueOf(getServletRequest().getParameter("aaz319")));
		
		ThresholdVO vo = f10402004VS.loadThreshold(id);
		
		return VOUtils.getJsonData(vo);
	}
	
	public F10402004VS getF10402004VS() {
		return f10402004VS;
	}

	public void setF10402004VS(F10402004VS f10402004vs) {
		f10402004VS = f10402004vs;
	}

}
