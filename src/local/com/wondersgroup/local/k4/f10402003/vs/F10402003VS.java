package com.wondersgroup.local.k4.f10402003.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;

public interface F10402003VS {
	/**
	 * @author wangjunzhao
	 * 分页查询分析规则
	 */
	Map<String, Object> queryAnalysisRuleWithPage(Page page,
			AnalysisRuleVO analysisRuleVO);
	
	/**
	 * @author wangjunzhao
	 * 加载单个分析规则
	 */
	AnalysisRuleVO loadAnalysisRule(String id);
	
	/**
	 * @author wangjunzhao
	 * 保存分析规则
	 */
	void saveAnalysisRule(AnalysisRuleVO analysisRuleVO);
	
	/**
	 * @author wangjunzhao
	 * 更新分析规则
	 */
	void updateAnalysisRule(AnalysisRuleVO rule);
	
	/**
	 * @author wangjunzhao
	 * 更新Aae043
	 */
	void updateAnalysisRuleAae043(AnalysisRuleVO rule);
	
	/**
	 * @author wangjunzhao
	 * 禁用或启用监控规则
	 */
	void updateAnalysisRuleAae100(AnalysisRuleVO rule);
}
