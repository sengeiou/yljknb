package com.wondersgroup.local.k3.f10301004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;

public class QueryAuditCaseNumberAction  extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	
	private F10301004VS f10301004VS;
	
	private CaseDetailsVO caseDetailsVO = new CaseDetailsVO();

	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	public CaseDetailsVO getCaseDetailsVO() {
		return caseDetailsVO;
	}

	public void setCaseDetailsVO(CaseDetailsVO caseDetailsVO) {
		this.caseDetailsVO = caseDetailsVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getCaseDetailsVO();
	}
	
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301004VS().queryAuditCaseWithPage(page, caseDetailsVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}

}
