package com.wondersgroup.local.k4.f10402004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402004.vo.ThresholdVO;
import com.wondersgroup.local.k4.f10402004.vs.F10402004VS;

public final class UpdateThresholdAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10402004VS f10402004VS;
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		ThresholdVO vo = new ThresholdVO();
		
		vo = (ThresholdVO) VOUtils.getBeanFromJsonData(submitData, ThresholdVO.class);
		
		f10402004VS.updateThreshold(vo);
		
		return SUCCESS;
	}

	public F10402004VS getF10402004VS() {
		return f10402004VS;
	}

	public void setF10402004VS(F10402004VS f10402004vs) {
		f10402004VS = f10402004vs;
	}

	
}
