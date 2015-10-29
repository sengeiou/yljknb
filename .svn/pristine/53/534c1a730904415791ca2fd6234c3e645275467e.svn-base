package com.wondersgroup.local.k4.f10402004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402004.vs.F10402004VS;

public class QueryRuleByAaa153Action extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	F10402004VS f10402004VS;
	
	RuleVO ruleVO=new RuleVO();
	
	@Override
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO =f10402004VS.queryRuleByAaa153(page, ruleVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
		
	}
	@Override
	public ValueObject getValueObject() {
		return getRuleVO();
	}
	
	
	public F10402004VS getF10402004VS() {
		return f10402004VS;
	}

	public void setF10402004VS(F10402004VS f10402004vs) {
		f10402004VS = f10402004vs;
	}
	public RuleVO getRuleVO() {
		return ruleVO;
	}
	public void setRuleVO(RuleVO ruleVO) {
		this.ruleVO = ruleVO;
	}
}
