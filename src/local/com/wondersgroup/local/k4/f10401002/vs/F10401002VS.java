package com.wondersgroup.local.k4.f10401002.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10401002.vo.RuleTaskVO;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;

public interface F10401002VS {
	
	/**
	 * 调度计划管理
	 * @author dumingqiang 2014-07-16
	 * @param resultVO
	 * @return
	 */
	public Map<String, Object> queryDispatchManageWithPage(Page page,
			DispatchManageVO dispatchVO);
	
	/**
	 *分页查询调度计划信息
	 *@author dumingqiang 2014-07-09
	 *@param dispatchVO
	 *@return
	 */ 
	public DispatchManageVO addDispatchManage(DispatchManageVO resultVO);
	
	/**
	 *添加调度计划信息
	 *@author dumingqiang 2014-07-16
	 *@param resultVO
	 *@return
	 */ 
	public DispatchManageVO updateDispatchManage(DispatchManageVO resultVO);
	/**
	 *更改调度计划信息
	 *@author dumingqiang 2014-07-16
	 *@param resultVO
	 *@return
	 */ 
	public DispatchManageVO findById(String aaz325);
	/**
	 *通过Id查找调度计划信息
	 *@author dumingqiang 2014-07-16
	 *@param aaz325
	 *@return
	 */ 
	public DispatchManageVO updateAae100(String aaz325,String aae100);
	/**
	 *通过Id查找调度计划信息同 时更改有效状态
	 *@author dumingqiang 2014-07-17
	 *@param aaz100，aae100
	 *@return
	 */ 
	public Map<String, Object> findRuleWithPage(Page page,String aaz325);
	/**
	 *通过Id分页查找规则模版信息
	 *@author dumingqiang 2014-07-17
	 *@param aaz325
	 *@return
	 */ 
	public RuleTaskVO addRuleTask(RuleTaskVO resultVO); 
	/**
	 *添加规则任务模版
	 *@author dumingqiang 2014-07-17
	 *@param resultVO
	 *@return
	 */ 
	public void deleteRuleTask(String idStr);
	/**
	 *删除规则任务模版
	 *@author dumingqiang 2014-07-17
	 *@param resultVO
	 *@return
	 */ 
	public RuleTaskVO checkManage(String aaz325, String aaa156);
	/**
	 *任务配置判断
	 *@author dumingqiang 2014-07-22
	 *@param resultVO
	 *@return
	 */ 
	public Map<String, Object> findAnalyzeWithPage(Page page,String aaz325);
	/**
	 *通过Id分页查找规则模版信息
	 *@author dumingqiang 2014-07-23
	 *@param aaz325
	 *@return
	 */ 
	public RuleTaskVO addAnalyzeTask(RuleTaskVO resultVO);
	/**
	 *添加分析任务模版
	 *@author dumingqiang 2014-07-23
	 *@param resultVO
	 *@return
	 */  
	public void deleteAnalyze(String idStr);
	/**
	 *删除分析任务模版
	 *@author dumingqiang 2014-07-23
	 *@param resultVO
	 *@return
	 */  
	public Map<String,Object> queryAnalysisWithPage(Page page, AnalysisRuleVO resultVO);
	/**
	 *分页查询分析模版
	 *@author dumingqiang 2014-07-23
	 *@param resultVO
	 *@return
	 */ 
	public void savePriority(String aaz333,String ake070);
	/**
	 *设置优先级
	 *@author dumingqiang 2014-07-23
	 *@param aaz325，ake070
	 *@return
	 */ 
	
}
