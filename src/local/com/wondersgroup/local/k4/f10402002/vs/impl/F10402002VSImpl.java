package com.wondersgroup.local.k4.f10402002.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka44DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402002.vs.F10402002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10402002VSImpl implements F10402002VS {
	
	private RuleManageBS ruleManageBS;
	
	public Map<String, Object> queryRuleWithPage(Page page, RuleVO ruleVO) {
		page=ruleManageBS.queryRuleWithPage(page, ruleVO);
		return GridUtils.getGridData(page);
	}

	
	public RuleVO saveRuel(RuleVO ruleVo) {
		
		Ka44DTO ka44dto=new Ka44DTO();
		BeanTools.copyProperties(ruleVo,ka44dto);
		ka44dto=ruleManageBS.saveKa44(ka44dto);
		BeanTools.copyProperties(ka44dto, ruleVo);
		return ruleVo;
	}
	
	public RuleVO load(RuleVO ruleVo) {
		Ka44DTO ka44DTO=ruleManageBS.loadKa44(ruleVo);
		BeanTools.copyProperties(ka44DTO,ruleVo);
		return ruleVo;
	}
	
	public RuleVO updateRuel(RuleVO ruleVo) {
		Ka44DTO ka44dto=new Ka44DTO();
		BeanTools.copyProperties(ruleVo,ka44dto);
		ka44dto=ruleManageBS.updateKa44(ka44dto);
		BeanTools.copyProperties(ka44dto, ruleVo);
		return ruleVo;
	}

	
	public String getAaa168(String aaa153) {
		return ruleManageBS.getAaa168(aaa153);
	}
	

	public void updateRuleAae100(RuleVO rule) {
		Ka44DTO ka44Dto=new Ka44DTO();
		BeanTools.copyProperties(rule, ka44Dto);
		ruleManageBS.updateKa44Aae100(ka44Dto);
	}
	
	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}

	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}






	


	


}
