package com.wondersgroup.local.k6.f10602001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10602001.vo.DoctExpenVO;
import com.wondersgroup.local.k6.f10602001.vs.F10602001VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryDoctorExpenAction extends BaseAjaxAction{

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
	
	public String loadDoctExpenColumInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		DoctExpenVO resultVO = new DoctExpenVO();
		
		resultVO = (DoctExpenVO) VOUtils.getBeanFromJsonData(submitData, DoctExpenVO.class);
		
		String jsonData = this.getF10602001VS().queryStrip(resultVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
	public String loadDoctMediCateInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctExpenVO doctExpenVO = new DoctExpenVO();
		
		doctExpenVO = (DoctExpenVO) VOUtils.getBeanFromJsonData(submitData, DoctExpenVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctExpenVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602001VS().queryDoctMediWithPage(page, doctExpenVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadDoctDiseCateInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctExpenVO doctExpenVO = new DoctExpenVO();
		
		doctExpenVO = (DoctExpenVO) VOUtils.getBeanFromJsonData(submitData, DoctExpenVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctExpenVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602001VS().queryDoctDiseWithPage(page, doctExpenVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String loadDoctStatuCateInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctExpenVO doctExpenVO = new DoctExpenVO();
		
		doctExpenVO = (DoctExpenVO) VOUtils.getBeanFromJsonData(submitData, DoctExpenVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctExpenVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602001VS().queryDoctStatuWithPage(page, doctExpenVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
