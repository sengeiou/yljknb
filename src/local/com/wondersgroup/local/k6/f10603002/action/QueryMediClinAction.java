package com.wondersgroup.local.k6.f10603002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10603002.vo.MediClinVO;
import com.wondersgroup.local.k6.f10603002.vs.F10603002VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryMediClinAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10603002VS f10603002VS;

	public F10603002VS getF10603002VS() {
		return f10603002VS;
	}

	public void setF10603002VS(F10603002VS f10603002vs) {
		f10603002VS = f10603002vs;
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	//圖表
	public String loadMediClinCloumInfo(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		MediClinVO resultVO = new MediClinVO();
		
		resultVO = (MediClinVO) VOUtils.getBeanFromJsonData(submitData, MediClinVO.class);
		
		String jsonData = this.getF10603002VS().queryStrip(resultVO);
		
		createJSonData(jsonData);
		
		
		
		return AJAX;
	}
	
	//醫療類別
	public String loadMediClinMedicalInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediClinVO mediClinVO = new MediClinVO();
		
		mediClinVO = (MediClinVO) VOUtils.getBeanFromJsonData(submitData, MediClinVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediClinVO.setAaz107(aaz107);
		}
		
		resultVO = this.getF10603002VS().queryMediClinMediWithPage(page, mediClinVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//身份類別
	public String loadMediClinIdentifyInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediClinVO mediClinVO = new MediClinVO();
		
		mediClinVO = (MediClinVO) VOUtils.getBeanFromJsonData(submitData, MediClinVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediClinVO.setAaz107(aaz107.trim());
		}
		
		resultVO = this.getF10603002VS().queryMediClinIdentifyWithPage(page, mediClinVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	//疾病分類
	public String loadMediClinDiseaseInfo(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String aaz107 = this.getServletRequest().getParameter("aaz107");
		
		MediClinVO mediClinVO = new MediClinVO();
		
		mediClinVO = (MediClinVO) VOUtils.getBeanFromJsonData(submitData, MediClinVO.class);
		
		if(StringTools.hasText(aaz107)){
			mediClinVO.setAaz107(aaz107.trim());
		}
		
		resultVO = this.getF10603002VS().queryMediClinDiseaseWithPage(page, mediClinVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
}
