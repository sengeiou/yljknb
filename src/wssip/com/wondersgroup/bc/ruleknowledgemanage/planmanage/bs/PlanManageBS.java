package com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af47DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af48DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af49DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af50DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af51DTO;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;

public interface PlanManageBS {
	
	/**
	 * 方案管理
	 * @author dumingqiang 2014-07-09
	 * @param resultVO
	 * @return
	 */
	
	Page queryPlanManageWithPage(Page page,PlanManageVO planManageVO); 

	/**
	 *根据id查询方案信息
	 *@author dumingqiang 2014-07-09
	 *@param id
	 *@return
	 */ 
	
	Af51DTO addImplScheme(Af51DTO af51dto);
	
	/**
	 *增加方案信息
	 *@author dumingqiang 2014-07-09
	 *@param resultVO
	 *@return
	 */
	Af51DTO updateImplScheme(Af51DTO af51dto);
	
	/**
	 *更改方案信息
	 *@author dumingqiang 2014-07-09
	 *@param resultVO
	 *@return
	 */
	Af51DTO findaf51(String aaz100);
	
	/**
	 *启动方案
	 *@author dumingqiang 2014-07-09
	 *@param aaz100
	 *@return
	 */	
	Af51DTO updateaf51Aae100(String aaz100, String aae100);
	
	/**
	 * 根据传入的Af47DTO更改AF47表信息
	 * @author dumingqiang
	 * @param af32Dto
	 * @return
	 */
	Af47DTO addAf47(Af47DTO af47Dto);
	
	
	/**
	 * 根据传入的Af47DTO更改AF47表信息
	 * @author dumingqiang
	 * @param af32Dto
	 * @return
	 */
	Af47DTO updateAf47(Af47DTO af47Dto);
	
	/**
	 * 查询计划方案信息
	 * @param page
	 * @param dispatchManageVO
	 * @return
	 */
	Page queryDispatchManageWithPage(Page page, DispatchManageVO dispatchManageVO);
	
	/**
	 * 根据ID查询计划方案信息
	 * @param page
	 * @param dispatchManageVO
	 * @return
	 */
	Af47DTO findAf47(String aaz325);
	
	/**
	 * 根据计划ID和当前有效标志更改计划方案信息
	 * @param page
	 * @param dispatchManageVO
	 * @return
	 */
	Af47DTO updateAae100(String aaz325, String aae100);
	
	/**
	 * 进行计划方案中规则信息配置操作
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	Page findRules(Page page,String aaz325);
	
	/**
	 * 计划方案中规则信息添加
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	Af49DTO addRuleTask(Af49DTO af49Dto);
	
	/**
	 *计划方案中规则信息检查
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	void deleteRuleTask(String idStr);
	/**
	 *计划方案中规则任务删除
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	Af49DTO checkManage(String aaz325, String aaa156);
	
	/**
	 * 进行计划方案中分析信息配置操作
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	Page findAnalyze(Page page, String aaz325);
	
	/**
	 * 进行计划方案中分析信息配置添加
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	
	 Af49DTO addAnalyze(Af49DTO af49Dto);

	/**
	 * 进行计划方案中分析信息配置删除
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	 void deleteAnalyzeTask(String idStr);

	/**
	 * 进行计划方案中分析信息配置分页查询
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	 
	 Page queryAnalyze(Page page, AnalysisRuleVO analysisRuleVO);
		
	/**
	 * 保存计划方案中分析信息配置优先级
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	 void savePriority(String aaz333, String ake070);
	/**
	 * 查询计划执行情况
	 * @param page
	 * @param String aaz325
	 * @return
	 */
	 Page queryPlanWithPage(Page page,Af48DTO af48Dto);
	 /**
	  * 查询日志执行情况
	  * @param page
	  * @param String aaz325
	  * @return
	  */
	 Page queryTaskWithPage(Page page,Af50DTO af50Dto);
     /**
      * 查询方案数据导出Excel
      * @param queryDto
      * @return
      */
	 List<Map<String, Object>> queryAf51ForExport(Af51DTO queryDto);
}
