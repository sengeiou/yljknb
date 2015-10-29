package com.wondersgroup.local.k3.f10301015.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301015.vo.QueryInquiryInputInfoVO;
import com.wondersgroup.local.k3.f10301015.vs.F10301015VS;

public class QueryInquiryInputInfoAction  extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;

	private F10301015VS f10301015VS;
	private QueryInquiryInputInfoVO queryInquiryInputInfoVO = new QueryInquiryInputInfoVO();

	public F10301015VS getF10301015VS() {
		return f10301015VS;
	}

	public void setF10301015VS(F10301015VS f10301015vs) {
		f10301015VS = f10301015vs;
	}

	public QueryInquiryInputInfoVO getQueryInquiryInputInfoVO() {
		return queryInquiryInputInfoVO;
	}

	public void setQueryInquiryInputInfoVO(
			QueryInquiryInputInfoVO queryInquiryInputInfoVO) {
		this.queryInquiryInputInfoVO = queryInquiryInputInfoVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getQueryInquiryInputInfoVO();
	}
	
	/**
	 * 询问笔录生成查询
	 */
	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		resultVO = this.getF10301015VS().queryInquiryInputInfo(page,queryInquiryInputInfoVO);
		String result = VOUtils.getJsonData(resultVO);
		return result;
	}
}
