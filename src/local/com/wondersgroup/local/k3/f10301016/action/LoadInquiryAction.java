package com.wondersgroup.local.k3.f10301016.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;
import com.wondersgroup.wssip.util.DateTools;

public class LoadInquiryAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	private F10301016VS f10301016VS;

	public F10301016VS getF10301016VS() {
		return f10301016VS;
	}

	public void setF10301016VS(F10301016VS f10301016VS) {
		this.f10301016VS = f10301016VS;
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		String fname = this.getServletRequest().getParameter("fname");
		String fpath = this.getServletRequest().getParameter("fpath");
		String filedataFileName = this.getServletRequest().getParameter("filedataFileName");
		InquiryInputVO inquiryInputVO = new InquiryInputVO();
		inquiryInputVO = (InquiryInputVO) VOUtils.getBeanFromJsonData(submitData, InquiryInputVO.class);
		inquiryInputVO.setRealpath(fpath);
		inquiryInputVO.setTargetFileName(fname);
		inquiryInputVO.setFiledataFileName(filedataFileName);
		
		inquiryInputVO = this.getF10301016VS().updateAf37(inquiryInputVO);
		
		String result = prefix + suffex;
		
		return result;
	}
	public String loadInquiryProblemInfo() {
		
		Long aaz381 = Long.parseLong(this.getServletRequest().getParameter("aaz381"));
		
		InquiryInputVO inquiryInputVO = new InquiryInputVO();
		
		inquiryInputVO.setAaz381(aaz381);
		
		inquiryInputVO = this.getF10301016VS().loadInquiry(inquiryInputVO);
		
		String ape712 = String.valueOf(inquiryInputVO.getApe712());
		
		inquiryInputVO.setApe712Operate(DateTools.parseDate(ape712, "yyyyMMdd"));
		
		inquiryInputVO.setApe712s(DateTools.parseDate(ape712, "yyyyMMdd"));
		
		String result = VOUtils.getJsonData(inquiryInputVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}

}
