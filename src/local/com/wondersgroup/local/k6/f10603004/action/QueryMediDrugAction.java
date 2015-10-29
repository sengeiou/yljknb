package com.wondersgroup.local.k6.f10603004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10603004.vo.MediDrugVO;
import com.wondersgroup.local.k6.f10603004.vs.F10603004VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryMediDrugAction extends BaseAjaxAction{

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
	
	//图形
	public String loadMediDrugColumnInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		MediDrugVO resultVO = new MediDrugVO();
		
		resultVO = (MediDrugVO) VOUtils.getBeanFromJsonData(submitData, MediDrugVO.class);
		
		String jsonData = this.getF10603004VS().queryStrip(resultVO);
		
		createJSonData(jsonData);
		
		return AJAX;
	}
	
	//甲类
	public String loadMediDrugDiseaseInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediDrugVO mediDrugVO = new MediDrugVO();
		
		mediDrugVO = (MediDrugVO) VOUtils.getBeanFromJsonData(submitData, MediDrugVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediDrugVO.setAaz107(aaz107);
		}
		
		resultVO = this.getF10603004VS().queryMediDrugDiseaseWithPage(page, mediDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//乙类
	public String loadMediDrugMedicalInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediDrugVO mediDrugVO = new MediDrugVO();
		
		mediDrugVO = (MediDrugVO) VOUtils.getBeanFromJsonData(submitData, MediDrugVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediDrugVO.setAaz107(aaz107);
		}
		
		resultVO = this.getF10603004VS().queryMediDrugMedicalWithPage(page, mediDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//丙类
	public String loadMediDrugIdentifyInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediDrugVO mediDrugVO = new MediDrugVO();
		
		mediDrugVO = (MediDrugVO) VOUtils.getBeanFromJsonData(submitData, MediDrugVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediDrugVO.setAaz107(aaz107);
		}
		
		resultVO = this.getF10603004VS().queryMediDrugIdentifyWithPage(page, mediDrugVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
