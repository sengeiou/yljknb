package com.wondersgroup.local.k3.f10301011.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301011.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301011.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301011.vs.F10301011VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryRecheckAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
//	private static final String prefix = "{\"success\":true,\"result\":[";
//
//	private static final String suffex = "]}";
	
	private QueryRecheckVO queryRecheckVO = new QueryRecheckVO();
	private QueryRegisterVO queryRegisterVO = new QueryRegisterVO();
	
	public QueryRegisterVO getQueryRegisterVO() {
		return queryRegisterVO;
	}

	public void setQueryRegisterVO(QueryRegisterVO queryRegisterVO) {
		this.queryRegisterVO = queryRegisterVO;
	}

	public QueryRecheckVO getQueryRecheckVO() {
		return queryRecheckVO;
	}

	public void setQueryRecheckVO(QueryRecheckVO queryRecheckVO) {
		this.queryRecheckVO = queryRecheckVO;
	}

	public F10301011VS f10301011VS;

	
	public F10301011VS getf10301011VS() {
		return f10301011VS;
	}

	public void setf10301011VS(F10301011VS f10301011vs) {
		f10301011VS = f10301011vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getQueryRecheckVO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
    public String queryRecheckDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getf10301011VS().queryRecheck(page, queryRecheckVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
    
    public String queryRegisterAction(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		String ids=this.getServletRequest().getParameter("ids");
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		queryRegisterVO.setAaz318s(ids);
		
		resultVO = this.getf10301011VS().queryRegister(page, queryRegisterVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
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
			
			resultVO = this.getf10301011VS().queryBeAuditInfo(page, auditConclusionVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
}
