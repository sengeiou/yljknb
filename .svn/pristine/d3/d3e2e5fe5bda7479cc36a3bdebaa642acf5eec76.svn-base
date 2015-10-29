package com.wondersgroup.local.k4.f10402007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class UpdataDxzbMessage extends BaseAjaxAction{
	 
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10402007VS f10402007VS;
	

	public F10402007VS getF10402007VS() {
		return f10402007VS;
	}

	public void setF10402007VS(F10402007VS f10402007vs) {
		f10402007VS = f10402007vs;
	}

	protected String operate() {
		
		String submitData=this.getServletRequest().getParameter("submitData");
		
		DxzbVO resultVO=new DxzbVO();
	
		resultVO=(DxzbVO) VOUtils.getBeanFromJsonData(submitData, DxzbVO.class);
	
		resultVO=this.getF10402007VS().updateDxzbMessage(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;

}
}


