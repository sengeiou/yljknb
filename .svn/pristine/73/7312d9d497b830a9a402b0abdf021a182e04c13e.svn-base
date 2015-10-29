package com.wondersgroup.local.k6.f10601001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10601001.vo.InsurVisitVO;
import com.wondersgroup.local.k6.f10601001.vs.F10601001VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryInsurExpendAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10601001VS f10601001VS;
	
	private InsurVisitVO InsurVisitVO = new InsurVisitVO();

	public F10601001VS getF10601001VS() {
		return f10601001VS;
	}

	public void setF10601001VS(F10601001VS f10601001vs) {
		f10601001VS = f10601001vs;
	}
	
	public InsurVisitVO getInsurVisitVO() {
		return InsurVisitVO;
	}

	public void setInsurVisitVO(InsurVisitVO insurVisitVO) {
		InsurVisitVO = insurVisitVO;
	}
	
	@Override
	public ValueObject getValueObject(){
		return this.getInsurVisitVO();
	}

	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadInsurVisitInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		InsurVisitVO resultVO= new InsurVisitVO();
		
		resultVO = (InsurVisitVO) VOUtils.getBeanFromJsonData(submitData, InsurVisitVO.class);
		
		String jsonData = this.getF10601001VS().queryStrip(resultVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
	public String loadInsurCensuInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aac001 = this.getServletRequest().getParameter("aac001");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		InsurVisitVO invisVO= new InsurVisitVO();
		
		invisVO = (InsurVisitVO) VOUtils.getBeanFromJsonData(submitData, InsurVisitVO.class);
		
		if(StringTools.hasText(aac001)){
			
			invisVO.setAac001(aac001.trim());
		}
		
		resultVO = this.getF10601001VS().queryInsurVistWithPage(page, invisVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadInsurDiseInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aac001 = this.getServletRequest().getParameter("aac001");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		InsurVisitVO invisVO= new InsurVisitVO();
		
		invisVO = (InsurVisitVO) VOUtils.getBeanFromJsonData(submitData, InsurVisitVO.class);
		
		if(StringTools.hasText(aac001)){
			
			invisVO.setAac001(aac001.trim());
		}
		
		resultVO = this.getF10601001VS().queryInsurDiseWithPage(page, invisVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
