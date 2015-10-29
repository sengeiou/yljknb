package com.wondersgroup.local.k2.f10201005.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201005.vo.MedDeductPlanVO;
import com.wondersgroup.local.k2.f10201005.vs.F10201005VS;

public class MedDeductPlanOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10201005VS f10201005VS;
	
	private MedDeductPlanVO medDeductPlanVO = new MedDeductPlanVO();

	public MedDeductPlanVO getMedDeductPlanVO() {
		return medDeductPlanVO;
	}

	public void setMedDeductPlanVO(MedDeductPlanVO medDeductPlanVO) {
		this.medDeductPlanVO = medDeductPlanVO;
	}

	public F10201005VS getF10201005VS() {
		return f10201005VS;
	}

	public void setF10201005VS(F10201005VS f10201005vs) {
		f10201005VS = f10201005vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDeductPlanVO();
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		MedDeductPlanVO returnVO = new MedDeductPlanVO();
		
		returnVO = (MedDeductPlanVO) VOUtils.getBeanFromJsonData(submitData, MedDeductPlanVO.class);
		
		returnVO = this.getF10201005VS().saveMedDeductPlan(returnVO);
		
        String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
		
	}
	
	public String queryMedDeductPlan(){

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201005VS().queryMedDeductPlan(page,medDeductPlanVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	
	public String queryMedDeductHosPlan(){

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201005VS().queryMedDeductHosPlan(page,medDeductPlanVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	
	public String queryMedDeductDetailPlan(){

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201005VS().queryMedDeductDetailPlan(page,medDeductPlanVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	

}
