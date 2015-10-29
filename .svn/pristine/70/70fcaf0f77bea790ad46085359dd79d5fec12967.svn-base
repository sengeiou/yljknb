package com.wondersgroup.local.k2.f10201007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201005.vo.MedDeductPlanVO;
import com.wondersgroup.local.k2.f10201007.vs.F10201007VS;

public class F10201007Action extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10201007VS f10201007VS;
	
	private MedDeductPlanVO medDeductPlanVO = new MedDeductPlanVO();

	public MedDeductPlanVO getMedDeductPlanVO() {
		return medDeductPlanVO;
	}

	public void setMedDeductPlanVO(MedDeductPlanVO medDeductPlanVO) {
		this.medDeductPlanVO = medDeductPlanVO;
	}

	public F10201007VS getF10201007VS() {
		return f10201007VS;
	}

	public void setF10201007VS(F10201007VS f10201007vs) {
		f10201007VS = f10201007vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDeductPlanVO();
	}
	
	
	public String querydata(){
		
		createJSonData("{\"data\":[{\"id\": \"1\",\"lc\":\"人工初审\"},{\"id\": \"2\",\"lc\":\"送核查\"},{\"id\": \"3\",\"lc\":\"复查\"},{\"id\": \"4\",\"lc\":\"终审\"}]}");
		
		return AJAX;
		
	}
	

}
