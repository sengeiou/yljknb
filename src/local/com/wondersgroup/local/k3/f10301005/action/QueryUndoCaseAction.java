package com.wondersgroup.local.k3.f10301005.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301005.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301005.vs.F10301005VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryUndoCaseAction  extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private CaseDetailsVO caseDetailsVO = new CaseDetailsVO();
	public CaseDetailsVO getCaseDetailsVO() {
		return caseDetailsVO;
	}
	public void setCaseDetailsVO(CaseDetailsVO caseDetailsVO) {
		this.caseDetailsVO = caseDetailsVO;
	}
	public F10301005VS getF10301005VS() {
		return f10301005VS;
	}
	public void setF10301005VS(F10301005VS f10301005vs) {
		f10301005VS = f10301005vs;
	}
	private F10301005VS  f10301005VS;
	
	@Override
	public ValueObject getValueObject(){
		return this.getCaseDetailsVO();
	}
	
	@Override
	protected String operate(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301005VS().queryAuditCaseWithPage(page,caseDetailsVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadAuditCaseInfoByAbz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		if(StringTools.hasText(abz001)){
			
			caseDetailsVO.setAbz001(abz001);
			
			resultVO = this.getF10301005VS().queryAuditCaseWithPageInfo(page,caseDetailsVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
		
	}
	
	

}
