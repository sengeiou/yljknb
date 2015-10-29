package com.wondersgroup.local.k2.f10201002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10201002.vs.F10201002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentVO medDocumentVO = new MedDocumentVO();

	private F10201002VS f10201002VS;

	public F10201002VS getF10201002VS() {
		return f10201002VS;
	}

	public void setF10201002VS(F10201002VS f10201002vs) {
		f10201002VS = f10201002vs;
	}
	
	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentVO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String queryMedDocument(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201002VS().queryMedDocument(page,medDocumentVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	
    public String queryMedDocumentIllegal(){
		
    	MedDocumentVO resultVO = new MedDocumentVO();
    	
    	BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10201002VS().queryMedDocumentIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
    public String queryMedVisitInfo(){

    	MedDocumentVO resultVO = new MedDocumentVO();
    	
    	BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10201002VS().queryMedVisitInfo(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
    }
}
