package com.wondersgroup.local.k2.f10201003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201003.vo.MedDocumentCheckVO;
import com.wondersgroup.local.k2.f10201003.vo.ReCheckVO;
import com.wondersgroup.local.k2.f10201003.vs.F10201003VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentDetailCheckOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentCheckVO medDocumentCheckVO = new MedDocumentCheckVO();
	
	private F10201003VS f10201003VS;

	public F10201003VS getF10201003VS() {
		return f10201003VS;
	}

	public void setF10201003VS(F10201003VS f10201003vs) {
		f10201003VS = f10201003vs;
	}
	
	public MedDocumentCheckVO getMedDocumentCheckVO() {
		return medDocumentCheckVO;
	}

	public void setMedDocumentCheckVO(MedDocumentCheckVO medDocumentCheckVO) {
		this.medDocumentCheckVO = medDocumentCheckVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentCheckVO();
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		ReCheckVO returnVO = (ReCheckVO) VOUtils.getBeanFromJsonData(submitData,ReCheckVO.class);
		
		returnVO = this.getF10201003VS().reCheckMedDocDetail(returnVO);
		
		String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}
	
    public String queryCheckMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201003VS().queryCheckMedDocumentDetail(page,medDocumentCheckVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
    
    public String queryCheckMedDocumentDetailIllegal(){
		
    	MedDocumentCheckVO resultVO = new MedDocumentCheckVO();
    	
    	BeanTools.copyProperties(medDocumentCheckVO, resultVO);
		
		resultVO = this.getF10201003VS().queryCheckMedDocumentDetailIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
		
		return AJAX;
		
	}
    
}
