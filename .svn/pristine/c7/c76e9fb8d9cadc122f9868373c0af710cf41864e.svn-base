package com.wondersgroup.local.k3.f10301004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vo.SurveyRecordVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;

public class SaveSurveyRecordAction extends BaseAjaxAction{
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private static final long serialVersionUID = 1L;
	
	private F10301004VS f10301004VS;

	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		SurveyRecordVO resultVO = new SurveyRecordVO();
		
		resultVO = (SurveyRecordVO)VOUtils.getBeanFromJsonData(submitData,SurveyRecordVO.class);
		
		resultVO = this.getF10301004VS().saveSurveyRecord(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	}

	public String surveyDone() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		CaseDetailsVO resultVO = new CaseDetailsVO();
		
		resultVO.setAaz318(Long.parseLong(aaz318));
		
		resultVO = this.getF10301004VS().surveyDone(resultVO);
		
		String text = prefix + suffex;
		
		createJSonData(text);
		
		return AJAX;
	}
}
