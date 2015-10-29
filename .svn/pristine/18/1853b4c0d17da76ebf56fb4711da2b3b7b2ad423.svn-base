package com.wondersgroup.local.k4.f10402001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;

public interface F10402001VS{
	/**
	 * @author wangjunzhao
	 * 分页查询模板管理
	 */
	public Map<String, Object> queryModelManageWithPage(Page page,ModelManageVO modelManageVo);
	
	/**
	 * @author wangjunzhao
	 * 分页查询监控规则管理
	 */
	public Map<String, Object> queryRuleWithPageAndModel(Page page, RuleVO ruleVo);
	
	/**
	 * @author wangjunzhao
	 * 根据条件分页查询方案管理
	 */
	public Map<String, Object> querySchemeWithPage(Page page,PlanManageVO schemeVo,String type);
	
	/**
	 * @author wangjunzhao
	 * 保存模板
	 */
	public ModelManageVO saveModel(ModelManageVO modelVO);
	
	/**
	 * @author wangjunzhao
	 * 根据ID查询模板
	 */
	public ModelManageVO queryModelById(String id);
	
	/**
	 * @author wangjunzhao
	 * 更新模板
	 */
	public ModelManageVO updateModel(ModelManageVO modelVO);
	
	/**
	 * @author wangjunzhao
	 * 启用或者禁用模板
	 */
	public void updateModelManageAae100(ModelManageVO model);
	
	

}
