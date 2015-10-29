package com.wondersgroup.local.k3.f10301001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301001.vo.AuditProblemVO;
import com.wondersgroup.local.k3.f10301001.vs.F10301001VS;

public final class UpdateAuditProblemAction extends BaseAjaxAction{
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;

	private F10301001VS f10301001VS;

	public F10301001VS getF10301001VS() {
		return f10301001VS;
	}

	public void setF10301001VS(F10301001VS f10301001vs) {
		f10301001VS = f10301001vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditProblemVO resultVO = new AuditProblemVO();
		
		resultVO = (AuditProblemVO) VOUtils.getBeanFromJsonData(submitData, AuditProblemVO.class);
		
		resultVO = this.getF10301001VS().updateAuditProblem(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	}
	
	public String loadAuditProblemInfo(){
		
		String aaz281 = this.getServletRequest().getParameter("aaz281");
		
		if(aaz281 != null){
			
			AuditProblemVO resultVO = getF10301001VS().queryAuditProblemById(aaz281);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
	
	
	/**
	 * 简单处理
	 * @return
	 */
	public String simpExcute(){
		String aaz281s = this.getServletRequest().getParameter("aaz281s");
		String aae200 = this.getServletRequest().getParameter("aae200");
		AuditProblemVO resultVO = getF10301001VS().simpExcute(aaz281s,aae200);
		String result = VOUtils.getJsonData(resultVO);
		createJSonData(result);
		return AJAX;
	}
}
