package com.wondersgroup.local.k3.f10301007.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301007.vo.AuditCaseInfoVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301007.vs.F10301007VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryWaitAffirmAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private F10301007VS f10301007VS;
	
	private AuditCaseInfoVO auditCaseInfoVO = new AuditCaseInfoVO();

	public F10301007VS getF10301007VS() {
		return f10301007VS;
	}

	public void setF10301007VS(F10301007VS f10301007vs) {
		f10301007VS = f10301007vs;
	}
	
	public AuditCaseInfoVO getAuditCaseInfoVO() {
		return auditCaseInfoVO;
	}

	public void setAuditCaseInfoVO(AuditCaseInfoVO auditCaseInfoVO) {
		this.auditCaseInfoVO = auditCaseInfoVO;
	}
	
	@Override
	public ValueObject getValueObject(){
		return this.getAuditCaseInfoVO();
	}

	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301007VS().queryAuditCaseWithPage(page, auditCaseInfoVO);
		
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
			
			auditCaseInfoVO.setAbz001(abz001);
			
			resultVO = this.getF10301007VS().queryAuditCaseWithPageInfo(page,auditCaseInfoVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
	
	
	public String loadAuditTargetInfoByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		String apa011 = this.getServletRequest().getParameter("apa011");
		String aae426 = this.getServletRequest().getParameter("aae426");
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		AuditConclusionVO auditConclusionVO = new AuditConclusionVO();
		
		if(StringTools.hasText(aaz318)){
			
			auditConclusionVO.setAaz318(Long.valueOf(aaz318));
			auditConclusionVO.setApa011(apa011);
			auditConclusionVO.setAae426(aae426);
			
			resultVO = this.getF10301007VS().queryBeAuditInfo(page, auditConclusionVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
	
	
}
