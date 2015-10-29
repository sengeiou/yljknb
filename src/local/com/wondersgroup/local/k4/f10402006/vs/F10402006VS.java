package com.wondersgroup.local.k4.f10402006.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzms;
import com.wondersgroup.framework.core.bo.Page;


import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;



public interface F10402006VS {
	
	/**
	 *添加规则指标
	 *@author 
	 *@param resultVO
	 *@return
	 */
	public RuleTargetVO addRuleTaget(RuleTargetVO resultVO);
	
	/**
	 *查询规则指标
	 *@author 
	 *@param resultVO
	 *@return
	 */
	
	public Map<String, Object> queryRuleTarget(Page page,
			RuleTargetVO ruleTargetVO);
	
	/**
	 *删除规则指标信息
	 *@author 
	 *@param resultVO
	 *@return
	 */
	public void deleteRuleTarget(String idStr);
	
	/**
	 * 查询tb_dic_gzms和TB_dic_gzzb信息
	 * @param page
	 * @param 
	 * @return
	 */
	Map<String, Object> queryCaseWithPage(Page page, RuleTargetVO ruleTargetVO);
	
	/**
	 * 查询gzms中得规则名称和规则代码
	 * @author 
	 * @param 
	 * @return
	 */
	public List<TbDicGzms> queryMOdelFromGzms();
	

}
