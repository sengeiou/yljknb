package com.wondersgroup.local.k3.f10301006.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301006.vo.AuditVerdictVO;
import com.wondersgroup.local.k3.f10301006.vo.CaseConclusionVO;
import com.wondersgroup.local.k3.f10301006.vs.F10301006VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryCaseConclusionAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private F10301006VS f10301006VS;
	private AuditVerdictVO auditVerdictVO = new AuditVerdictVO();
	private CaseConclusionVO caseConclusionVO = new CaseConclusionVO();
	public F10301006VS getF10301006VS() {
		return f10301006VS;
	}
	public void setF10301006VS(F10301006VS f10301006vs) {
		f10301006VS = f10301006vs;
	}
	public AuditVerdictVO getAuditVerdictVO() {
		return auditVerdictVO;
	}
	public void setAuditVerdictVO(AuditVerdictVO auditVerdictVO) {
		this.auditVerdictVO = auditVerdictVO;
	}
	public CaseConclusionVO getCaseConclusionVO() {
		return caseConclusionVO;
	}
	public void setCaseConclusionVO(CaseConclusionVO caseConclusionVO) {
		this.caseConclusionVO = caseConclusionVO;
	}
	
	
	@Override
	public ValueObject getValueObject(){
		return this.getCaseConclusionVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301006VS().queryAuditCaseWithPage(page, caseConclusionVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String queryAuditCaseInfoByAbz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		if(StringTools.hasText(abz001)){
			caseConclusionVO.setAbz001(abz001);//设置案件编号
			
			resultVO = this.getF10301006VS().queryAuditCaseWithPageInfo(page, caseConclusionVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
	

	
	
	
}
