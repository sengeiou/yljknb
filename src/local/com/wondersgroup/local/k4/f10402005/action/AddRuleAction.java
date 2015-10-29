package com.wondersgroup.local.k4.f10402005.action;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;


import com.wondersgroup.local.k4.f10402005.vo.AddRuleVO;
import com.wondersgroup.local.k4.f10402005.vs.F10402005VS;

public class AddRuleAction extends BaseAjaxAction{
	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10402005VS f10402005VS;

	public void setF10402005VS(F10402005VS f10402005VS) {
		this.f10402005VS = f10402005VS;
	}

	public F10402005VS getF10402005VS() {
		return f10402005VS;
	}
	
	
	protected String operate() {
	String submitData=this.getServletRequest().getParameter("submitData");
	
	AddRuleVO resultVO=new AddRuleVO();
	
	resultVO=(AddRuleVO) VOUtils.getBeanFromJsonData(submitData, AddRuleVO.class);
	
	resultVO=this.getF10402005VS().addRule(resultVO);
	
	String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
	
	return result;
	
	}
}
