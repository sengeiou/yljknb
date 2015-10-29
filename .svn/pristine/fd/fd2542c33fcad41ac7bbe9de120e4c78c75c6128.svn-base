package com.wondersgroup.local.k3.f10301024.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301024.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301024.vs.F10301024VS;

public class QueryCaseAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private QueryRecheckVO queryRecheckVO = new QueryRecheckVO();
	private F10301024VS f10301024vs;


	public QueryRecheckVO getQueryRecheckVO() {
		return queryRecheckVO;
	}

	public void setQueryRecheckVO(QueryRecheckVO queryRecheckVO) {
		this.queryRecheckVO = queryRecheckVO;
	}
	
	public F10301024VS getF10301024vs() {
		return f10301024vs;
	}
	
	public void setF10301024vs(F10301024VS f10301024vs) {
		this.f10301024vs = f10301024vs;
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
		
		resultVO = this.getF10301024vs().queryReCheck(page, queryRecheckVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
}
