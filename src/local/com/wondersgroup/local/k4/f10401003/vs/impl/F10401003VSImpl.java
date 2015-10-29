package com.wondersgroup.local.k4.f10401003.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs.PlanManageBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10401003.vo.RuleTasksVO;
import com.wondersgroup.local.k4.f10401003.vo.RuleTracVO;
import com.wondersgroup.local.k4.f10401003.vs.F10401003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10401003VSImpl implements F10401003VS{
	
	private PlanManageBS planManageBS;
	

	public PlanManageBS getPlanManageBS() {
		return planManageBS;
	}

	public void setPlanManageBS(PlanManageBS planManageBS) {
		this.planManageBS = planManageBS;
	}

	public Map<String, Object> queryPlanWithPage(Page page,
			RuleTracVO ruleTracVO) {
		Page result=this.planManageBS.queryPlanWithPage(page, ruleTracVO);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryTaskWithPage(Page page,
			RuleTasksVO ruleTasksVO) {
		Page result=this.planManageBS.queryTaskWithPage(page, ruleTasksVO);
		
		return GridUtils.getGridData(result);
	}

}
