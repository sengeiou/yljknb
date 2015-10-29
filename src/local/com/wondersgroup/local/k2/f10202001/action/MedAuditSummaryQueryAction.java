package com.wondersgroup.local.k2.f10202001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10202001.vo.MedAuditSummaryVO;
import com.wondersgroup.local.k2.f10202001.vs.F10202001VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedAuditSummaryQueryAction extends BaseAjaxAction {

	private static final long serialVersionUID = 8410874393843003662L;
	
	private F10202001VS f10202001VS;
	
	private MedAuditSummaryVO medAuditSummaryVO = new MedAuditSummaryVO();
	
	public MedAuditSummaryVO getMedAuditSummaryVO() {
		return medAuditSummaryVO;
	}

	public void setMedAuditSummaryVO(MedAuditSummaryVO medAuditSummaryVO) {
		this.medAuditSummaryVO = medAuditSummaryVO;
	}

	public F10202001VS getF10202001VS() {
		return f10202001VS;
	}

	public void setF10202001VS(F10202001VS f10202001vs) {
		f10202001VS = f10202001vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedAuditSummaryVO();
	}
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10202001VS().queryHosMedCount(page, medAuditSummaryVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
		
	}
	

	public String queryHosMedDocument(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
        MedAuditSummaryVO paramVO = new MedAuditSummaryVO();
		
		BeanTools.copyProperties(medAuditSummaryVO, paramVO);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10202001VS().queryHosMedDocument(page,paramVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	
    public String queryHosMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
        MedAuditSummaryVO paramVO = new MedAuditSummaryVO();
		
		BeanTools.copyProperties(medAuditSummaryVO, paramVO);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10202001VS().queryHosMedDocumentDetail(page,paramVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
	

}
