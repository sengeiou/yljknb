package com.wondersgroup.local.k4.f10401001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401001.vs.F10401001VS;

public class AddPlanManageAction extends BaseAjaxAction{
 
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
	
	@Override
	protected String operate() {
		
		String submitData=this.getServletRequest().getParameter("submitData");
		
		PlanManageVO resultVO=new PlanManageVO();
		
		resultVO=(PlanManageVO) VOUtils.getBeanFromJsonData(submitData, PlanManageVO.class);
		
		resultVO=this.getF10401001VS().addPlanManage(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
	}

}
