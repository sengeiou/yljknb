package com.wondersgroup.local.k3.f10301016.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;

public class F10301016Action extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private F10301016VS f10301016VS;
	private InquiryInputVO inquiryInputVO = new InquiryInputVO();

	public F10301016VS getF10301016VS() {
		return f10301016VS;
	}


	public void setF10301016VS(F10301016VS f10301016vs) {
		f10301016VS = f10301016vs;
	}


	public InquiryInputVO getInquiryInputVO() {
		return inquiryInputVO;
	}


	public void setInquiryInputVO(InquiryInputVO inquiryInputVO) {
		this.inquiryInputVO = inquiryInputVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getInquiryInputVO();
	}
	
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301016VS().queryAf37WithPage(page,inquiryInputVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
}
