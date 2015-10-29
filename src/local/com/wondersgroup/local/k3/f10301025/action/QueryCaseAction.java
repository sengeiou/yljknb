package com.wondersgroup.local.k3.f10301025.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301025.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301025.vs.F10301025VS;

public class QueryCaseAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private QueryRecheckVO queryRecheckVO = new QueryRecheckVO();
	private F10301025VS f10301025vs;


	public QueryRecheckVO getQueryRecheckVO() {
		return queryRecheckVO;
	}

	public void setQueryRecheckVO(QueryRecheckVO queryRecheckVO) {
		this.queryRecheckVO = queryRecheckVO;
	}
	
	public F10301025VS getF10301025vs() {
		return f10301025vs;
	}
	
	public void setF10301025vs(F10301025VS f10301025vs) {
		this.f10301025vs = f10301025vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return getQueryRecheckVO();
	}
	
	public String queryRecheckDetail() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit +1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301025vs().queryReCheck(page, queryRecheckVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
}
