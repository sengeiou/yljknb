package com.wondersgroup.local.k6.f10603004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10603004.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10603004.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10603004.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10603004.vs.F10603004VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryMediVisistAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10603004VS f10603004VS;
	
	public F10603004VS getF10603004VS() {
		return f10603004VS;
	}

	public void setF10603004VS(F10603004VS f10603004vs) {
		f10603004VS = f10603004vs;
	}

	@Override
	protected String operate() {
		return super.operate();
	}
	
	//就诊信息
	public String loadMediDrugVisistInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		VisitInfoVO visitInfoVO = new VisitInfoVO();
		
		visitInfoVO = (VisitInfoVO) VOUtils.getBeanFromJsonData(submitData,VisitInfoVO.class);
		
		resultVO = this.getF10603004VS().queryMediDrugVisitWithPage(page, visitInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//处方信息
	public String loadMediDrugPresInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String aaz217 = this.getServletRequest().getParameter("aaz217");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		PresInfoVO presInfoVO = new PresInfoVO();
		
		//presInfoVO = (PresInfoVO) VOUtils.getBeanFromJsonData(submitData,PresInfoVO.class);
		if(StringTools.hasText(aaz217)){
			presInfoVO.setAaz217(aaz217);
		}
		
		resultVO = this.getF10603004VS().queryMediDrugPresWithPage(page, presInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//违规记录
	public String loadMediDrugViolateInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		ViolRecdVO violRecdVO = new ViolRecdVO();
		
		violRecdVO = (ViolRecdVO) VOUtils.getBeanFromJsonData(submitData,ViolRecdVO.class);
		
		resultVO = this.getF10603004VS().queryMediDrugViolaWithPage(page, violRecdVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
