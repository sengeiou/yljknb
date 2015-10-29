package com.wondersgroup.local.k3.f10301005.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301005.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301005.vo.CaseDetailsVO;


public interface F10301005VS {
	
	/***
	 *案件撤销 更新状态
	 *@author
	 *@param returnVO
	 *@return
	 */
	public BeAuditInfoVO desRegister(BeAuditInfoVO returnVO);
	/***
	 *查询待撤销的案件
	 *@author
	 *@param caseDetailsVO
	 *@return
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page ,CaseDetailsVO caseDetailsVO);
	
	/**
	 * 根据传入对象查询医稽核案件信息
	 * @param page
	 * @param caseDetailsVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page,CaseDetailsVO caseDetailsVO);
}
