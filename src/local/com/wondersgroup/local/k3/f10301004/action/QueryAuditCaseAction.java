package com.wondersgroup.local.k3.f10301004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryAuditCaseAction extends BaseAjaxAction {

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
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(abz001)){
			
			resultVO = this.getF10301004VS().queryCaseInfoByAbz001(page, abz001);
			
			result = VOUtils.getJsonData(resultVO);
		}
				
		return result;
	}
	
	public String loadAuditCaseInfo(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		if(StringTools.hasText(aaz318)){
			
			CaseDetailsVO resultVO = getF10301004VS().queryAuditCaseDetailsById(aaz318);
			
			createJSonData(VOUtils.getJsonData(resultVO));
		}
		
		return AJAX;
	}
	
}
