package com.wondersgroup.local.k3.f10301023.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301023.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301023.vs.F10301023VS;

public class QueryCaseAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private QueryRecheckVO queryRecheckVO = new QueryRecheckVO();
	private F10301023VS f10301023vs;


	public QueryRecheckVO getQueryRecheckVO() {
		return queryRecheckVO;
	}

	public void setQueryRecheckVO(QueryRecheckVO queryRecheckVO) {
		this.queryRecheckVO = queryRecheckVO;
	}
	
	public F10301023VS getF10301023vs() {
		return f10301023vs;
	}
	
	public void setF10301023vs(F10301023VS f10301023vs) {
		this.f10301023vs = f10301023vs;
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
		
		resultVO = this.getF10301023vs().queryReCheck(page, queryRecheckVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
}
