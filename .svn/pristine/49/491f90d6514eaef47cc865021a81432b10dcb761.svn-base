package com.wondersgroup.local.k4.f10402004.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka45DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402004.vo.ThresholdVO;
import com.wondersgroup.local.k4.f10402004.vs.F10402004VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;


public class F10402004VSImpl implements F10402004VS{

	private RuleManageBS ruleManageBS;
	
	public Map<String, Object> queryAaa153WithPage(Page page, RuleVO ruleVO) {
		return GridUtils.getGridData(ruleManageBS.queryAaa153WithPage(page,ruleVO));
	}
	

	public Map<String, Object> queryRuleByAaa153(Page page, RuleVO ruleVO) {
		return GridUtils.getGridData(ruleManageBS.queryKa44ByAaa153(page,ruleVO));
	}

	public void deleteThreshold(ThresholdVO vo) {
		Ka45DTO dto=new Ka45DTO();
		BeanTools.copyProperties(vo, dto);
		ruleManageBS.deleteKa45(dto);
	}


	public Map<String, Object> queryThresholdWithPage(Page page,
			String aaz319) {
		return GridUtils.getGridData(ruleManageBS.queryKa45WithPage(page,aaz319));
	}


	public void saveThreshold(ThresholdVO thresholdVO) {
		Ka45DTO dto=new Ka45DTO();
		BeanTools.copyProperties(thresholdVO,dto);
		ruleManageBS.saveKa45(dto);
	}

	public ThresholdVO loadThreshold(BaseKa45Id id) {
		Ka45DTO dto=new Ka45DTO();
		dto=ruleManageBS.loadKa45(id);
		ThresholdVO vo = new ThresholdVO();
		BeanTools.copyProperties(dto, vo);
		return vo;
	}
	
	public void updateThreshold(ThresholdVO vo) {
		Ka45DTO dto=new Ka45DTO();
		BeanTools.copyProperties(vo, dto);
		ruleManageBS.updateKa45(dto);
	}
	
	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}

	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}


	

}
