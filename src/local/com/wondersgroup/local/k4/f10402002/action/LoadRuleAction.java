package com.wondersgroup.local.k4.f10402002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;

public class LoadRuleAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
		
	private F10402002VS f10402002VS;
	
	private RuleVO ruleVo=new RuleVO();
	
	@Override
	protected String operate() {
		RuleVO rule=f10402002VS.load(ruleVo);
		
		String result = VOUtils.getJsonData(rule);
		
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
