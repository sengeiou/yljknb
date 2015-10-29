package com.wondersgroup.local.k3.f10301007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301007.vs.F10301007VS;

//确认通过
public class ConfirmPassAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301007VS f10301007VS;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	public F10301007VS getF10301007VS() {
		return f10301007VS;
	}

	public void setF10301007VS(F10301007VS f10301007vs) {
		f10301007VS = f10301007vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditConclusionVO returnVO = new AuditConclusionVO();
		
		returnVO = (AuditConclusionVO)VOUtils.getBeanFromJsonData(submitData, AuditConclusionVO.class);
		
		returnVO = this.getF10301007VS().confirmPass(returnVO);
		
		String result = prefix + suffex;
		
		return result;
	}

	public String confirmToSurvey() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		CaseDetailsVO resultVO = new CaseDetailsVO();
		
		resultVO.setAaz318(Long.parseLong(aaz318));
		
		resultVO = this.getF10301007VS().confirmToSurvey(resultVO);
		
		String text = prefix + suffex;
		
		createJSonData(text);
		
		return AJAX;
	}
}
