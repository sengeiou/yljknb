package com.wondersgroup.local.k4.f10401002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class UpdateDispatchManageAction extends BaseAjaxAction{

	 
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10401002VS f10401002VS;
	
	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}

	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}

	protected String operate() {
		String submitData=this.getServletRequest().getParameter("submitData");
		
		DispatchManageVO resultVO=new DispatchManageVO();
		
		resultVO=(DispatchManageVO) VOUtils.getBeanFromJsonData(submitData, DispatchManageVO.class);
		
		resultVO=this.getF10401002VS().updateDispatchManage(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	}

}
