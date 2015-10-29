package com.wondersgroup.local.k3.f10301015.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301015.vo.QueryAuditTargetInfoVO;
import com.wondersgroup.local.k3.f10301015.vs.F10301015VS;

public class QueryAuditTargetInfoAction  extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;

	private F10301015VS f10301015VS;
	private QueryAuditTargetInfoVO queryAuditTargetInfoVO = new QueryAuditTargetInfoVO();

	public F10301015VS getF10301015VS() {
		return f10301015VS;
	}

	public void setF10301015VS(F10301015VS f10301015vs) {
		f10301015VS = f10301015vs;
	}
	
	public QueryAuditTargetInfoVO getQueryAuditTargetInfoVO() {
		return queryAuditTargetInfoVO;
	}

	public void setQueryAuditTargetInfoVO(
			QueryAuditTargetInfoVO queryAuditTargetInfoVO) {
		this.queryAuditTargetInfoVO = queryAuditTargetInfoVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getQueryAuditTargetInfoVO();
	}
	
	/**
	 * 外部受理疑点登记查询
	 */
	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		resultVO = this.getF10301015VS().queryAuditTargetInfo(page,queryAuditTargetInfoVO);
		String result = VOUtils.getJsonData(resultVO);
		return result;
	}
}
