package com.wondersgroup.local.k3.f10301003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301003.vo.AuditCaseDetailsVO;
import com.wondersgroup.local.k3.f10301003.vs.F10301003VS;
import com.wondersgroup.wssip.util.StringTools;

//查询稽核案件信息
public class QueryAuditCaseDetailsAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
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
	public ValueObject getValueObject() {
		return this.getAuditCaseDetailsVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301003VS().queryAuditCaseDetailsWithPage(page, auditCaseDetailsVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadAuditCaseDetails(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		if(StringTools.hasText(aaz318)){
			
			AuditCaseDetailsVO resultVO = getF10301003VS().queryAuditCaseDetailsById(aaz318);
			
			createJSonData(VOUtils.getJsonData(resultVO));
		}
		
		return AJAX;
	}

}
