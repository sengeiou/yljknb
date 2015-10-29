package com.wondersgroup.local.k3.f10301005.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301005.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301005.vs.F10301005VS;

public class DesRegisterAction extends BaseAjaxAction{
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private static final long serialVersionUID = 1L;
	
	private F10301005VS f10301005VS;

	public F10301005VS getF10301005VS() {
		return f10301005VS;
	}

	public void setF10301005VS(F10301005VS f10301005vs) {
		f10301005VS = f10301005vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		BeAuditInfoVO returnVO = new BeAuditInfoVO();
		
		returnVO = (BeAuditInfoVO)VOUtils.getBeanFromJsonData(submitData, BeAuditInfoVO.class);
		
		returnVO = this.f10301005VS.desRegister(returnVO);
		
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}

}
