package com.wondersgroup.local.k4.f10401001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401001.vs.F10401001VS;

public class StartPlanManageAction extends BaseAjaxAction{
 
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10401001VS f10401001VS;
	
	public F10401001VS getF10401001VS() {
		return f10401001VS;
	}

	public void setF10401001VS(F10401001VS f10401001vs) {
		f10401001VS = f10401001vs;
	}



	protected String operate() {
		String aaz100 = this.getServletRequest().getParameter("aaz100");
		String aae100 = this.getServletRequest().getParameter("aae100");
		
		PlanManageVO resultVO=new PlanManageVO();
		
		resultVO = f10401001VS.updateAae100(aaz100,aae100);
		
		String result = prefix + VOUtils.getJsonData(resultVO)+suffex;
		
		return result ;
	}

}
