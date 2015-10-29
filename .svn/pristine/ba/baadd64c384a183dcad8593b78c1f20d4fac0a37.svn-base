package com.wondersgroup.local.k3.f10301003.action;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301003.vo.AuditCaseDetailsVO;
import com.wondersgroup.local.k3.f10301003.vs.F10301003VS;

//稽核立案确认
public class RegisterConfirmAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301003VS f10301003VS;
	
	private AuditCaseDetailsVO auditCaseDetailsVO = new AuditCaseDetailsVO();

	public F10301003VS getF10301003VS() {
		return f10301003VS;
	}

	public void setF10301003VS(F10301003VS f10301003vs) {
		f10301003VS = f10301003vs;
	}

	public AuditCaseDetailsVO getAuditCaseDetailsVO() {
		return auditCaseDetailsVO;
	}

	public void setAuditCaseDetailsVO(AuditCaseDetailsVO auditCaseDetailsVO) {
		this.auditCaseDetailsVO = auditCaseDetailsVO;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditCaseDetailsVO resultVO = new AuditCaseDetailsVO();
		
		resultVO = (AuditCaseDetailsVO)VOUtils.getBeanFromJsonData(submitData,AuditCaseDetailsVO.class);
		
		resultVO.setAae426(AuditConstants.AAE426_CODE_6);//设置案件 状态是 立案待查
		
		resultVO = this.getF10301003VS().updateAuditCaseDetails(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	}
	
	//立案否决
	public String registerRejectOperate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditCaseDetailsVO resultVO = new AuditCaseDetailsVO();
		
		resultVO = (AuditCaseDetailsVO)VOUtils.getBeanFromJsonData(submitData,AuditCaseDetailsVO.class);
		
		resultVO.setAae426(AuditConstants.AAE426_CODE_2);//设置案件状态  不予立案
		
		resultVO = this.getF10301003VS().updateAuditCaseDetails(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}
}
