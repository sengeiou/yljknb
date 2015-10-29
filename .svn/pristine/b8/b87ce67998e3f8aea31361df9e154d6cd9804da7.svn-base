package com.wondersgroup.local.common.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.SurveyRecordVO;
import com.wondersgroup.local.common.vs.CommonVS;
import com.wondersgroup.wssip.util.StringTools;

public class QuerySurveyRecordAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private CommonVS commonVS;
	
	private SurveyRecordVO surveyRecordVO = new SurveyRecordVO();

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
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
		
		resultVO = this.getCommonVS().querySurveyRecordWithPage(page, surveyRecordVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadSurveyRecordInfoByAaz148(){
		
		String aaz148 = this.getServletRequest().getParameter("aaz148");
		
		if(StringTools.hasText(aaz148)){
			
			SurveyRecordVO resultVO = this.getCommonVS().querySurveyRecordInfoById(aaz148);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}

}
