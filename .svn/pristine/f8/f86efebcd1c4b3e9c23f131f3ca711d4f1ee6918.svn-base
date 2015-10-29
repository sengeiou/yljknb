package com.wondersgroup.local.k3.f10301016.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;

public class DeleteInquiryAction extends BaseAjaxAction{
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;
	
	private F10301016VS f10301016VS;

	public F10301016VS getF10301016VS() {
		return f10301016VS;
	}

	public void setF10301016VS(F10301016VS f10301016vs) {
		f10301016VS = f10301016vs;
	}
	
	@Override
	protected String operate() {
		String aaz381s = this.getServletRequest().getParameter("submitIds");
		String result = null;
		if (aaz381s != null) {
			InquiryInputVO resultVO = this.getF10301016VS().deleteInquiryByIds(aaz381s);
			result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		}
		return result;
	}

}
