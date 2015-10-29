package com.wondersgroup.local.k3.f10301001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301001.vo.AuditProblemVO;

public interface F10301001VS {

	/**
	 * 保存稽核问题信息
	 * @author rhx 2014-06-20
	 * @param resultVO
	 * @return
	 */
	public AuditProblemVO saveAuditProblem(AuditProblemVO resultVO);
	
	/**
	 *修改稽核问题信息
	 *@author ltt 2014-06-23
	 *@param redultVO
	 *@return
	 */
	public AuditProblemVO updateAuditProblem(AuditProblemVO resultVO);
	
	/**
	 *分页查询稽核疑点问题
	 *@author ltt 2014-06-23
	 *@param page
	 *@param auditProblemVO
	 *@return
	 */
	public Map<String, Object> queryAuditProblemWithPage(Page page,
			AuditProblemVO auditProblemVO);
	
	/**
	 *根据id查询稽核疑点问题
	 *@author ltt 2014-06-23
	 *@param id
	 *@return
	 */
	public AuditProblemVO queryAuditProblemById(String aaz281);
	
	/**
	 *根据id 批量 删除稽核疑点问题
	 *@author ltt 2014-06-23
	 *@param id
	 *@return
	 */
	public AuditProblemVO deleteAuditProblemByIds(String aaz281s);
	
	/**
	 * 简单处理
	 * @param aaz281
	 * @return
	 */
	public AuditProblemVO simpExcute(String aaz281s,String aae200);
	
	/**
	 * 根据ID查询af32
	 * @param auditProblemVO
	 * @return
	 */
	public Map<String, Object> queryAf32WithMap(AuditProblemVO auditProblemVO);


}
