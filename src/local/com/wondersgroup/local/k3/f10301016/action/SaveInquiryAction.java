package com.wondersgroup.local.k3.f10301016.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;

public class SaveInquiryAction extends BaseAjaxAction{
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301016VS f10301016VS;

	public F10301016VS getF10301016VS() {
		return f10301016VS;
	}

	public void setF10301016VS(F10301016VS f10301016vs) {
		f10301016VS = f10301016vs;
	}


	@Override
	public ValueObject getValueObject() {
		return super.getValueObject();
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		InquiryInputVO inquiryInputVO = null;
		
		inquiryInputVO =  (InquiryInputVO) VOUtils.getBeanFromJsonData(submitData, InquiryInputVO.class);
		
		inquiryInputVO = this.getF10301016VS().saveInquiry(inquiryInputVO);
		
		String result = prefix + VOUtils.getJsonData(inquiryInputVO) + suffex;
		
		return result;
	}
}
