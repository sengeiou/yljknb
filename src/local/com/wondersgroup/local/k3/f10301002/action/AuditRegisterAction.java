package com.wondersgroup.local.k3.f10301002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301002.vo.AuditCaseCecordVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vs.F10301002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class AuditRegisterAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10301002VS f10301002VS;

	public F10301002VS getF10301002VS() {
		return f10301002VS;
	}

	public void setF10301002VS(F10301002VS f10301002vs) {
		f10301002VS = f10301002vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditFileVO resultVO = (AuditFileVO)VOUtils.getBeanFromJsonData(submitData,AuditFileVO.class);
		
		AuditCaseCecordVO caseVO=new AuditCaseCecordVO();
		
		BeanTools.copyProperties(resultVO, caseVO);
		
		caseVO = this.getF10301002VS().queryAuditDetailInfo(caseVO);
		
		String result = VOUtils.getJsonData(caseVO);
		
		return result;
	}
}
