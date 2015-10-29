package com.wondersgroup.local.k3.f10301001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301001.vo.AuditProblemVO;
import com.wondersgroup.local.k3.f10301001.vs.F10301001VS;

public final class QueryAuditProblemAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301001VS f10301001VS;
	
	private AuditProblemVO auditProblemVO = new AuditProblemVO();

	public F10301001VS getF10301001VS() {
		return f10301001VS;
	}

	public void setF10301001VS(F10301001VS f10301001vs) {
		f10301001VS = f10301001vs;
	}
	
	public AuditProblemVO getAuditProblemVO() {
		return auditProblemVO;
	}

	public void setAuditProblemVO(AuditProblemVO auditProblemVO) {
		this.auditProblemVO = auditProblemVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getAuditProblemVO();
	}

	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301001VS().queryAuditProblemWithPage(page, auditProblemVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
}
