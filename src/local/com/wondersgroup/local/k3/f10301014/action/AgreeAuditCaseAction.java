package com.wondersgroup.local.k3.f10301014.action;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301014.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301014.vs.F10301014VS;

public class AgreeAuditCaseAction extends BaseAjaxAction{
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;
	
	private F10301014VS f10301014VS;

	public F10301014VS getF10301014VS() {
		return f10301014VS;
	}

	public void setF10301014VS(F10301014VS f10301014vs) {
		f10301014VS = f10301014vs;
	}
	
	@Override
	protected String operate(){
		
		String aaz318s = this.getServletRequest().getParameter("submitIds");
		
		String result = "";
		
		if(aaz318s != null){
			
			StateCheckVO resultVO =  this.getF10301014VS().updateAuditCaseByIds(aaz318s);
			
			result = prefix + VOUtils.getJsonData(resultVO) + suffex;
			
		}
		return result;
		
	}
	
	//二次处理
	public String secondProcessOperate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		StateCheckVO resultVO = new StateCheckVO();
		
		resultVO = (StateCheckVO)VOUtils.getBeanFromJsonData(submitData,StateCheckVO.class);
		
		resultVO.setAae426(AuditConstants.AAE426_CODE_3);//设置案件状态 立案待查
		resultVO.setAae608("2");
		resultVO.setAae425("");
		resultVO.setApa168("");
		
		resultVO = this.getF10301014VS().updateAuditCaseInfo(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		createJSonData(result);
		
		return AJAX;
		
	}
	
	
	

}
