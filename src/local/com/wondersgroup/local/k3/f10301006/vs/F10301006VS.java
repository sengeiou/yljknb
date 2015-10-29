package com.wondersgroup.local.k3.f10301006.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301006.vo.Af38VO;
import com.wondersgroup.local.k3.f10301006.vo.Af39VO;
import com.wondersgroup.local.k3.f10301006.vo.AuditVerdictVO;
import com.wondersgroup.local.k3.f10301006.vo.CaseConclusionVO;

public interface F10301006VS {

	/**
	 *保存稽核结论登记（修改af31的表）
	 * 
	 */
	public AuditVerdictVO saveAuditVerdict(AuditVerdictVO returnVO);
	Af38VO saveConclusion(Af38VO af38vo);
	
	/***
	 *查询待稽核结论登记
	 *@author hry
	 *@param page
	 *@param returnVO
	 *@return returnVO
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page , CaseConclusionVO returnVO);
	
	/**
	 * 根据传入对象查询医稽核案件信息
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page , CaseConclusionVO returnVO);

	/**
	 * 调查完成
	 * @param resultVO
	 * @return
	 */
	public CaseDetailsVO registDone(CaseDetailsVO resultVO);
	
	/**
	 * 保存对象告知
	 * @param af39vo
	 * @return
	 */
	Af39VO saveNotify(Af39VO af39vo);
	/**
	 * 
	 * @param af39vo
	 * @return
	 */
	Map<String, Object> queryAf39WithMap(Af39VO af39vo);
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077, String apa709);
	
}
