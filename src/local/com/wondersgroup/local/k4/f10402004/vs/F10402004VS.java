package com.wondersgroup.local.k4.f10402004.vs;

import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402004.vo.ThresholdVO;

public interface F10402004VS {
	/**
	 * @author wangjunzhao
	 * 分页查询分类汇总信息
	 */
	Map<String, Object> queryAaa153WithPage(Page page, RuleVO ruleVO);
	
	/**
	 * @author wangjunzhao
	 * 根据Aaa153分页查询规则
	 */
	Map<String, Object> queryRuleByAaa153(Page page, RuleVO ruleVO);

	/**
	 * @author wangjunzhao
	 * 根据规则信息分页查询阈值
	 */
	Map<String, Object> queryThresholdWithPage(Page page, String parameter);
	
	/**
	 * @author wangjunzhao
	 * 保存阈值
	 */
	void saveThreshold(ThresholdVO thresholdVO);
	
	/**
	 * @author wangjunzhao
	 * 删除阈值
	 */
	void deleteThreshold(ThresholdVO vo);
	
	/**
	 * @author wangjunzhao
	 * 加载单个阈值
	 */
	ThresholdVO loadThreshold(BaseKa45Id id);

	/**
	 * @author wangjunzhao
	 * 更新阈值
	 */
	void updateThreshold(ThresholdVO vo);
}
