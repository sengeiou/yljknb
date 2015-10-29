package com.wondersgroup.local.k5.f10501001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10501001.vo.MedDocumentFeedbackVO;
import com.wondersgroup.local.k5.f10501001.vs.F10501001VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentFeedbackOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentFeedbackVO medDocumentFeedbackVO = new MedDocumentFeedbackVO();

	private F10501001VS f10501001VS;

	public F10501001VS getF10501001VS() {
		return f10501001VS;
	}

	public void setF10501001VS(F10501001VS f10501001vs) {
		f10501001VS = f10501001vs;
	}
	
	public MedDocumentFeedbackVO getMedDocumentFeedbackVO() {
		return medDocumentFeedbackVO;
	}

	public void setMedDocumentFeedbackVO(MedDocumentFeedbackVO medDocumentFeedbackVO) {
		this.medDocumentFeedbackVO = medDocumentFeedbackVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentFeedbackVO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String queryFeedbackMedDocument(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10501001VS().queryFeedbackMedDocument(page,medDocumentFeedbackVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	
    public String queryFeedbackMedDocumentIllegal(){
		
    	MedDocumentFeedbackVO resultVO = new MedDocumentFeedbackVO();
    	
    	BeanTools.copyProperties(medDocumentFeedbackVO,resultVO);
		
		resultVO = this.getF10501001VS().queryFeedbackMedDocumentIllegal(medDocumentFeedbackVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
		
		return AJAX;
		
	}
}
