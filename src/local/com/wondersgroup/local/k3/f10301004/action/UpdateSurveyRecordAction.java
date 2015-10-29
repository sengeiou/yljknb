package com.wondersgroup.local.k3.f10301004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301004.vo.SurveyRecordVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.wssip.util.StringTools;

public class UpdateSurveyRecordAction extends BaseAjaxAction{
	
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
		
		String aaz148 = this.getServletRequest().getParameter("aaz148");
		
		SurveyRecordVO resultVO = new SurveyRecordVO();
		
		String result = null;
		
		if(StringTools.hasText(aaz148)){
			
			resultVO.setAaz148(Long.valueOf(aaz148));
			
			resultVO = this.getF10301004VS().updateSurveyRecord(resultVO);
			
			result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		}
		
		return result;
	}
	
}
