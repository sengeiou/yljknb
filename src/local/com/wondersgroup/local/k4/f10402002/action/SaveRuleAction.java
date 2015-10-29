package com.wondersgroup.local.k4.f10402002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;

public class SaveRuleAction extends BaseAjaxAction{

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;
		
	private F10402002VS f10402002VS;
	
	@Override
	protected String operate() {
		String submitData = this.getServletRequest().getParameter("submitData");
		
		RuleVO ruleVo=new RuleVO();
		
		ruleVo = (RuleVO) VOUtils.getBeanFromJsonData(submitData, RuleVO.class);
		
		ruleVo.setAae100("1");
		
		ruleVo = f10402002VS.saveRuel(ruleVo);
		
		String result = prefix + VOUtils.getJsonData(ruleVo) + suffex;
		
		return result;
	}
	
	
	public F10402002VS getF10402002VS() {
		return f10402002VS;
	}

	public void setF10402002VS(F10402002VS f10402002vs) {
		f10402002VS = f10402002vs;
	}

	
}
