package com.wondersgroup.local.k4.f10401002.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs.PlanManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af47DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af49DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10401002.vo.RuleTaskVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10401002VSImpl implements F10401002VS{
	
	private PlanManageBS planManageBS;
	
	public PlanManageBS getPlanManageBS() {
		return planManageBS;
	}

	public void setPlanManageBS(PlanManageBS planManageBS) {
		this.planManageBS = planManageBS;
	}

	public Map<String, Object> queryDispatchManageWithPage(Page page,
			DispatchManageVO dispatchVO) {
		
		Page result=this.getPlanManageBS().queryDispatchManageWithPage(page, dispatchVO);
		
		return GridUtils.getGridData(result);
	}

	public DispatchManageVO addDispatchManage(DispatchManageVO resultVO) {
		planManageBS.addAf47(resultVO);
		 return resultVO;
	}

	public DispatchManageVO updateDispatchManage(DispatchManageVO resultVO) {
		planManageBS.updateAf47(resultVO);
		return resultVO;
	}

	public DispatchManageVO findById(String aaz325) {
		DispatchManageVO resultVO=new DispatchManageVO();
		if(!StringTools.hasText(aaz325)){
			throw new BusinessException("F10401002VS-10:提示，根据主键查询一个af47对象，主键aaz325为空!");
		}
		Af47DTO af47Dto=this.planManageBS.findAf47(aaz325);
		BeanTools.copyProperties(af47Dto, resultVO);
		return resultVO;
	}

	public DispatchManageVO updateAae100(String aaz325, String aae100) {
		DispatchManageVO resultVO=new DispatchManageVO();
		if(!StringTools.hasText(aaz325)){
			throw new BusinessException("F10401002VS-10:提示，根据主键查询一个af47对象，主键aaz325为空!");
		}
		if(!StringTools.hasText(aae100)){
			throw new BusinessException("F10401002VS-10:提示，根据主键查询一个af47对象的aae100，对象aae100为空!");
		}
		Af47DTO af47Dto=this.planManageBS.updateAae100(aaz325, aae100);
		BeanTools.copyProperties(af47Dto, resultVO);
		return resultVO;
	}

	public Map<String, Object> findRuleWithPage(Page page, String aaz325) {
		Page result=this.planManageBS.findRules(page, aaz325);
		return GridUtils.getGridData(result);
	}

	public RuleTaskVO addRuleTask(RuleTaskVO resultVO) {
		this.planManageBS.addRuleTask(resultVO);
		return resultVO;
	}

	public void deleteRuleTask(String idStr) {
		this.planManageBS.deleteRuleTask(idStr);
	}

	public RuleTaskVO checkManage(String aaz325, String aaa156) {
		 RuleTaskVO resultVO=new RuleTaskVO();
		 if(!StringTools.hasText(aaz325)){
			 throw new BusinessException("F10401002VS-10:提示，传入的调度计划ID为空");
		 }
		 if(!StringTools.hasText(aaz325)){
			 throw new BusinessException("F10401002VS-10:提示，传入的任务类型为空");
		 }
		 
		 Af49DTO af49Dto=this.planManageBS.checkManage(aaz325, aaa156);
		 
		 BeanTools.copyProperties(af49Dto, resultVO);
		 
		return resultVO;
	}

	public Map<String, Object> findAnalyzeWithPage(Page page, String aaz325) {
		Page result=this.planManageBS.findAnalyze(page, aaz325);
		return GridUtils.getGridData(result);
	}

	public RuleTaskVO addAnalyzeTask(RuleTaskVO resultVO) {
		this.planManageBS.addAnalyze(resultVO);
		return resultVO;
	}

	public void deleteAnalyze(String idStr) {
		this.planManageBS.deleteAnalyzeTask(idStr);
	}

	public Map<String, Object> queryAnalysisWithPage(Page page,
			AnalysisRuleVO resultVO) {
		Page result=this.planManageBS.queryAnalyze(page, resultVO);
		return GridUtils.getGridData(result);
	}

	public void savePriority(String aaz333, String ake070) {
		this.planManageBS.savePriority(aaz333, ake070);
		
	}

}
