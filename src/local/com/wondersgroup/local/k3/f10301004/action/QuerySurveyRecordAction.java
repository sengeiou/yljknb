package com.wondersgroup.local.k3.f10301004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301004.vo.SurveyRecordVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.wssip.util.StringTools;

public class QuerySurveyRecordAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301004VS f10301004VS;
	
	private SurveyRecordVO surveyRecordVO = new SurveyRecordVO();
	
	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	
	public SurveyRecordVO getSurveyRecordVO() {
		return surveyRecordVO;
	}

	public void setSurveyRecordVO(SurveyRecordVO surveyRecordVO) {
		this.surveyRecordVO = surveyRecordVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getSurveyRecordVO();
	}
	
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301004VS().querySurveyRecordWithPage(page, surveyRecordVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadSurveyRecordInfo(){
		
		String aaz148 = this.getServletRequest().getParameter("aaz148");
		
		if(StringTools.hasText(aaz148)){
			
			SurveyRecordVO resultVO = this.f10301004VS.querySurveyRecordInfo(aaz148);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
}
