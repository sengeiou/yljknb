package com.wondersgroup.local.k5.f10502001.action;



import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502001.vs.F10502001VS;



public class SaveHospMessageAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10502001VS f10502001VS;

	public void setF10502001VS(F10502001VS f10502001VS) {
		this.f10502001VS = f10502001VS;
	}

	public F10502001VS getF10502001VS() {
		return f10502001VS;
	}
	
	
	protected String operate() {
	String submitData=this.getServletRequest().getParameter("submitData");
		
		F10502001VO resultVO=new F10502001VO();
	
		resultVO=(F10502001VO) VOUtils.getBeanFromJsonData(submitData, F10502001VO.class);
	
		resultVO=this.getF10502001VS().updateHospMessage(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	
	}
}
