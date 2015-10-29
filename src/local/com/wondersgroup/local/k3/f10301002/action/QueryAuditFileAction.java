package com.wondersgroup.local.k3.f10301002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vs.F10301002VS;

public class QueryAuditFileAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301002VS f10301002VS;
	
	private AuditFileVO auditFileQuery=new AuditFileVO();
	
	public AuditFileVO getAuditFileQuery() {
		return auditFileQuery;
	}

	public void setAuditFileQuery(AuditFileVO auditFileQuery) {
		this.auditFileQuery = auditFileQuery;
	}

	public F10301002VS getF10301002VS() {
		return f10301002VS;
	}
	
	public void setF10301002VS(F10301002VS f10301002vs) {
		f10301002VS = f10301002vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getAuditFileQuery();
	}

	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301002VS().queryAuditFileRegistrationWithPage(page, auditFileQuery);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}

}
