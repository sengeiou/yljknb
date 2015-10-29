package com.wondersgroup.local.k4.f10402003.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af46DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.local.k4.f10402003.vs.F10402003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10402003VSImpl implements F10402003VS{
	private RuleManageBS ruleManageBS;
	

	public AnalysisRuleVO loadAnalysisRule(String id) {
		Af46DTO af46Dto=ruleManageBS.loadAf46(id);
		AnalysisRuleVO ruleVo=new AnalysisRuleVO();
		BeanTools.copyProperties(af46Dto, ruleVo);
		return ruleVo;
	}

	public Map<String, Object> queryAnalysisRuleWithPage(Page page,
			AnalysisRuleVO analysisRuleVO) {
		return GridUtils.getGridData(ruleManageBS.queryAnalysisRuleWithPage(page,analysisRuleVO));
	}

	public void saveAnalysisRule(AnalysisRuleVO analysisRuleVO) {
		Af46DTO Af46Dto = new Af46DTO();
		BeanTools.copyProperties(analysisRuleVO, Af46Dto);
		ruleManageBS.saveAf46(Af46Dto);
	}
	
	public void updateAnalysisRule(AnalysisRuleVO rule) {
		Af46DTO af46Dto=new Af46DTO();
		BeanTools.copyProperties(rule, af46Dto);
		ruleManageBS.updateKa46(af46Dto);
	}
	
	public void updateAnalysisRuleAae043(AnalysisRuleVO rule) {
		Af46DTO dto=new Af46DTO();
		BeanTools.copyProperties(rule, dto);
		ruleManageBS.updateAf46Aae043(dto);
	}
	
	public void updateAnalysisRuleAae100(AnalysisRuleVO rule) {
		Af46DTO dto=new Af46DTO();
		BeanTools.copyProperties(rule, dto);
		ruleManageBS.updateAf46Aae100(dto);
	}

	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}

	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}

	

	

	

}
