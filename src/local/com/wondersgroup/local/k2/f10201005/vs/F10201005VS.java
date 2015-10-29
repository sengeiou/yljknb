package com.wondersgroup.local.k2.f10201005.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10201005.vo.MedDeductPlanVO;

public interface F10201005VS {
	
	/**
	 * 批量生成医疗扣款计划
	 * @param returnVO
	 * @return
	 */
	MedDeductPlanVO saveMedDeductPlan(MedDeductPlanVO returnVO);
    /**
     * 分页查询批量扣款计划事件
     * @param page
     * @param medDeductPlanVO
     * @return
     */
	Map<String, Object> queryMedDeductPlan(Page page,MedDeductPlanVO medDeductPlanVO);
	/**
	 * 分页查询医院扣款汇总
	 * @param page
	 * @param medDeductPlanVO
	 * @return
	 */
	Map<String, Object> queryMedDeductHosPlan(Page page,MedDeductPlanVO medDeductPlanVO);
	/**
	 * 查询扣款计划详细信息
	 * @param page
	 * @param medDeductPlanVO
	 * @return
	 */
	Map<String, Object> queryMedDeductDetailPlan(Page page,MedDeductPlanVO medDeductPlanVO);

}
