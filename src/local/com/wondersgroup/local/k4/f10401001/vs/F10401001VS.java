package com.wondersgroup.local.k4.f10401001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;

public interface F10401001VS {
	/**
	 * 方案管理
	 * @author dumingqiang 2014-07-09
	 * @param resultVO
	 * @return
	 */
	public Map<String, Object> queryPlanManageWithPage(Page page,
			PlanManageVO planManageVO);
	
	/**
	 *根据id查询方案信息
	 *@author dumingqiang 2014-07-09
	 *@param id
	 *@return
	 */ 
	public PlanManageVO addPlanManage(PlanManageVO resultVO);
	
	/**
	 *增加方案信息
	 *@author dumingqiang 2014-07-09
	 *@param resultVO
	 *@return
	 */
	public  PlanManageVO updatePlanManage(PlanManageVO resultVO);
	
	/**
	 *更改方案信息
	 *@author dumingqiang 2014-07-09
	 *@param resultVO
	 *@return
	 */
	public PlanManageVO find(String aaz100);
	
	/**
	 *加载要修改方案的数据
	 *@author dumingqiang 2014-07-09
	 *@param aaz100
	 *@return
	 */	
	
	public PlanManageVO updateAae100(String aaz100,String aae100);
	
	/**
	 *启动方案根据方案Id和当前有效标志更改
	 *@author dumingqiang 2014-07-09
	 *@param aaz100
	 *@return
	 */	
}
