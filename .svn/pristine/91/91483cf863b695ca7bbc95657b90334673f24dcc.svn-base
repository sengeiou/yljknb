package com.wondersgroup.local.k6.f10602003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10602003.vo.DoctDrugVO;
import com.wondersgroup.local.k6.f10602003.vs.F10602003VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryDoctDrugAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10602003VS f10602003VS;

	public F10602003VS getF10602003VS() {
		return f10602003VS;
	}

	public void setF10602003VS(F10602003VS f10602003vs) {
		f10602003VS = f10602003vs;
	}
	
	@Override
	protected String operate(){
		
		return super.operate();
	}
	
	public String loadDoctDrugColumInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		DoctDrugVO doctDrugVO = new DoctDrugVO();
		
		doctDrugVO = (DoctDrugVO) VOUtils.getBeanFromJsonData(submitData, DoctDrugVO.class);
		
		String jsonData = this.getF10602003VS().queryStrip(doctDrugVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
	//甲类
	public String loadDoctDrugDiseaseInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctDrugVO doctDrugVO = new DoctDrugVO();
		
		doctDrugVO = (DoctDrugVO) VOUtils.getBeanFromJsonData(submitData, DoctDrugVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctDrugVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602003VS().queryDoctDrugDiseaseWithPage(page, doctDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//乙类
	public String loadDoctDrugMedicalInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctDrugVO doctDrugVO = new DoctDrugVO();
		
		doctDrugVO = (DoctDrugVO) VOUtils.getBeanFromJsonData(submitData, DoctDrugVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctDrugVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602003VS().queryDoctDrugMedicalWithPage(page, doctDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//丙类
	public String loadDoctDrugIdentifyInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz263 = this.getServletRequest().getParameter("aaz263");
		
		DoctDrugVO doctDrugVO = new DoctDrugVO();
		
		doctDrugVO = (DoctDrugVO) VOUtils.getBeanFromJsonData(submitData, DoctDrugVO.class);
		
		if(StringTools.hasText(aaz263)){
			doctDrugVO.setAaz263(aaz263);
		}
		
		resultVO = this.getF10602003VS().queryDoctDrugIdentifyWithPage(page, doctDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
