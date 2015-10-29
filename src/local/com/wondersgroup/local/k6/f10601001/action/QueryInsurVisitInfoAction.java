package com.wondersgroup.local.k6.f10601001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10601001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10601001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10601001.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10601001.vs.F10601001VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryInsurVisitInfoAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10601001VS f10601001VS;

	public F10601001VS getF10601001VS() {
		return f10601001VS;
	}

	public void setF10601001VS(F10601001VS f10601001vs) {
		f10601001VS = f10601001vs;
	}
	
	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadInsurVisitInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		VisitInfoVO visitInfoVO = new VisitInfoVO();
		
		visitInfoVO = (VisitInfoVO) VOUtils.getBeanFromJsonData(submitData,VisitInfoVO.class);
		
		resultVO = this.getF10601001VS().queryInsurVisitWithPage(page, visitInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadInsurPresInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String aaz217 = this.getServletRequest().getParameter("aaz217");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		PresInfoVO presInfoVO = new PresInfoVO();
		
		if(StringTools.hasText(aaz217)){
			presInfoVO.setAaz217(aaz217);
		}
		
		resultVO = this.getF10601001VS().queryInsurPresWithPage(page, presInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadViolateRecordInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		ViolRecdVO violRecdVO = new ViolRecdVO();
		
		violRecdVO = (ViolRecdVO) VOUtils.getBeanFromJsonData(submitData,ViolRecdVO.class);
		
		resultVO = this.getF10601001VS().queryInsurViosRecdWithPage(page, violRecdVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	
}
