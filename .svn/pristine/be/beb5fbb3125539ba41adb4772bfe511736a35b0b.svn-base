package com.wondersgroup.local.k6.f10602001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10602001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10602001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10602001.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10602001.vs.F10602001VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryDoctorVisitAction  extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10602001VS f10602001VS;

	public F10602001VS getF10602001VS() {
		return f10602001VS;
	}

	public void setF10602001VS(F10602001VS f10602001vs) {
		f10602001VS = f10602001vs;
	}
	
	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadDoctVisitInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		VisitInfoVO visitInfoVO = new VisitInfoVO();
		
		visitInfoVO = (VisitInfoVO) VOUtils.getBeanFromJsonData(submitData,VisitInfoVO.class);
		
		resultVO = this.getF10602001VS().queryDoctVisitWithPage(page, visitInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadDoctPresInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String aaz217 = this.getServletRequest().getParameter("aaz217");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		PresInfoVO presInfoVO = new PresInfoVO();
		
		if(StringTools.hasText(aaz217)){
			presInfoVO.setAaz217(aaz217);
		}
		
		resultVO = this.getF10602001VS().queryDoctPresWithPage(page, presInfoVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadDoctViolaInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		ViolRecdVO violRecdVO = new ViolRecdVO();
		
		violRecdVO = (ViolRecdVO) VOUtils.getBeanFromJsonData(submitData,ViolRecdVO.class);
		
		resultVO = this.getF10602001VS().queryDoctViolaWithPage(page, violRecdVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}

}
