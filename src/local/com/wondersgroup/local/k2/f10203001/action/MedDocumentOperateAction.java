package com.wondersgroup.local.k2.f10203001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203001.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203001.vs.F10203001VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentVO medDocumentVO = new MedDocumentVO();

	private F10203001VS f10203001VS;
	
	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}
	
	
	public F10203001VS getF10203001VS() {
		return f10203001VS;
	}

	public void setF10203001VS(F10203001VS f10203001vs) {
		f10203001VS = f10203001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentVO();
	}
	

	
	//查询违规明细
	public String queryMedDocumentDetailIllegal(){
		MedDocumentVO resultVO = new MedDocumentVO();
		
		BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10203001VS().queryMedDocumentDetailIllegal(resultVO);
		
	    String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}
}
