package com.wondersgroup.local.k3.f10301010.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301010.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301010.vs.F10301010VS;

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

	public F10301010VS f10301010VS;

	
	public F10301010VS getF10301010VS() {
		return f10301010VS;
	}

	public void setF10301010VS(F10301010VS f10301010vs) {
		f10301010VS = f10301010vs;
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
		
		resultVO = this.getF10301010VS().queryRecheck(page, queryRecheckVO);
		
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
		
		resultVO = this.getF10301010VS().queryRegister(page, queryRegisterVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
}
