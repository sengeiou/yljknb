package com.wondersgroup.local.k4.f10402006.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzms;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402006.vs.F10402006VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10402006VSImpl implements F10402006VS{
	
	private RuleManageBS ruleManageBS;
	
	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}
	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}


	public RuleTargetVO addRuleTaget(RuleTargetVO resultVO) {
		
		ruleManageBS.addTbDicGzzb(resultVO);
		return resultVO;
	}
	public Map<String, Object> queryRuleTarget(Page page,RuleTargetVO ruleTargetVO) {
		
		Page result=this.getRuleManageBS().queryRuleTarget(page, ruleTargetVO);
		
		return GridUtils.getGridData(result);
	}
	public void deleteRuleTarget(String idStr) {
		this.ruleManageBS.deleteTbDicGzzb(idStr);
		
	}
	public Map<String, Object> queryCaseWithPage(Page page,
			RuleTargetVO ruleTargetVO) {
	   Page result=this.getRuleManageBS().queryRuleTarget(page, ruleTargetVO);
		
		return GridUtils.getGridData(result);
	}
	public List<TbDicGzms> queryMOdelFromGzms() {
		 return ruleManageBS.queryModelFromGzms();
	}

}
