package com.wondersgroup.local.k3.f10301007.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditCaseInfoVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;

public interface F10301007VS {

	/***
	 *查询稽核结论待确认
	 *@author ltt
	 *@param page
	 *@param returnVO
	 *@return returnVO
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page , AuditCaseInfoVO returnVO);
	
	/***
	 *查询被稽核对象
	 *@author ltt
	 *@param page
	 *@param returnVO
	 *@return returnVO
	 */
	public Map<String, Object> queryBeAuditInfo(Page page,AuditConclusionVO returnVO);
	
	/**
	 *调查重审
	 *@author ltt
	 *@param returnVO
	 *@return
	 */
	public AuditConclusionVO surveyReview(String aaz318);
	//public AuditConclusionVO surveyReview(String aaz318);
	
	/**
	 *确认通过
	 *@author ltt
	 *@param returnVO
	 *@return returnVO
	 */
	public AuditConclusionVO confirmPass(AuditConclusionVO returnVO);
	
	
	/**
	 *案件信息
	 */
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page ,AuditCaseInfoVO returnVO);

	/**
	 * 确认待审批
	 * @param resultVO
	 * @return
	 */
	public CaseDetailsVO confirmToSurvey(CaseDetailsVO resultVO);

}
