package com.wondersgroup.local.k4.f10402002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;

public class QueryRuleAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
		
	private F10402002VS f10402002VS;
	
	private RuleVO ruleVo=new RuleVO();
	
	@Override
	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = f10402002VS.queryRuleWithPage(page, ruleVo);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getRuleVo();
	}
	
	public F10402002VS getF10402002VS() {
		return f10402002VS;
	}

	public void setF10402002VS(F10402002VS f10402002vs) {
		f10402002VS = f10402002vs;
	}

	public RuleVO getRuleVo() {
		return ruleVo;
	}

	public void setRuleVo(RuleVO ruleVo) {
		this.ruleVo = ruleVo;
	}

	
}
