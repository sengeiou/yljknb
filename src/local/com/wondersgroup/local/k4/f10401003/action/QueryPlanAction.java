package com.wondersgroup.local.k4.f10401003.action;

import java.util.Map;


import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10401003.vo.RuleTracVO;
import com.wondersgroup.local.k4.f10401003.vs.F10401003VS;

public class QueryPlanAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10401003VS f10401003VS;
	
	private RuleTracVO ruleTracVO=new RuleTracVO();
	
	public RuleTracVO getRuleTracVOr() {
		return ruleTracVO;
	}

	public void setRuleTracVOr(RuleTracVO ruleTracVOr) {
		this.ruleTracVO = ruleTracVOr;
	}

	public F10401003VS getF10401003VS() {
		return f10401003VS;
	}

	public void setF10401003VS(F10401003VS f10401003vs) {
		f10401003VS = f10401003vs;
	}

	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		ruleTracVO.setAaz325(Long.valueOf(this.getServletRequest().getParameter("aaz325")));
		resultVO =this.f10401003VS.queryPlanWithPage(page, ruleTracVO);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	@Override
	public ValueObject getValueObject() {
		return getRuleTracVOr();
	}
	

}
