package com.wondersgroup.local.k5.f10501001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10501001.vo.FeedbackVO;
import com.wondersgroup.local.k5.f10501001.vo.MedDocumentFeedbackVO;
import com.wondersgroup.local.k5.f10501001.vs.F10501001VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentDetailFeedbackOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentFeedbackVO medDocumentFeedbackVO = new MedDocumentFeedbackVO();
	
	private F10501001VS f10501001VS;

	public F10501001VS getF10501001VS() {
		return f10501001VS;
	}

	public void setF10501001VS(F10501001VS f10501001VS) {
		this.f10501001VS = f10501001VS;
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
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		FeedbackVO returnVO = (FeedbackVO) VOUtils.getBeanFromJsonData(submitData,FeedbackVO.class);
		
		returnVO = this.getF10501001VS().feedbackMedDocDetail(returnVO);
		
		String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}
	
    public String queryFeedbackMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10501001VS().queryFeedbackMedDocumentDetail(page,medDocumentFeedbackVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
    
    public String queryFeedbackMedDocumentDetailIllegal(){
		
    	MedDocumentFeedbackVO resultVO = new MedDocumentFeedbackVO();
		
    	BeanTools.copyProperties(medDocumentFeedbackVO, resultVO);
    	
		resultVO = this.getF10501001VS().queryFeedbackMedDocumentDetailIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
		
		return AJAX;
		
	}
    
}
