package com.wondersgroup.local.k3.f10301004.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301004.vo.Ac01VO;
import com.wondersgroup.local.k3.f10301004.vo.Af61VO;
import com.wondersgroup.local.k3.f10301004.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vo.Kb01VO;
import com.wondersgroup.local.k3.f10301004.vo.Kf05VO;
import com.wondersgroup.local.k3.f10301004.vo.SurveyRecordVO;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;

public interface F10301004VS {
	
	/**
	 *分页查询稽核案件
	 *@author
	 *@param page
	 *@param caseDetailsVO
	 *@return
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page,CaseDetailsVO returnVO);
	
	/**
	 *根据编号查询
	 */
	public Map<String, Object> queryCaseInfoByAbz001(Page page,String abz001);
	
	/***
	 *查询被稽核对象
	 *@author 
	 *@param page
	 *@param aaz318
	 *@return
	 */
	public Map<String, Object> queryBeAuditInfoByAaz318(Page page , String aaz318);
	
	/**
	 *根据主键查询案件信息
	 *@author 
	 *@param aaz318
	 *@return
	 */
	public CaseDetailsVO queryAuditCaseDetailsById(String aaz318);
	
	/***
	 *查询被稽核对象详情
	 *@author 
	 *@param aaz077
	 *@return
	 */
	public BeAuditInfoVO queryBeAuditTargetInfoById(String aaz077);
	
	/**
	 *保存调查记录 
	 *@author 
	 *@param
	 *@retutn
	 */
	public SurveyRecordVO saveSurveyRecord(SurveyRecordVO returnVO);
	
	/**
	 *查询调查记录 
	 *@author 
	 *@param page
	 *@param returnVO
	 *@retutn
	 */
	public Map<String, Object> querySurveyRecordWithPage(Page page,SurveyRecordVO returnVO);
	
	/**
	 *查询调查记录详情
	 *@author 
	 *@param aaz148
	 *@retutn
	 */
	public SurveyRecordVO querySurveyRecordInfo(String aaz148);
	
	/**
	 *发单
	 *@author 
	 *@param returnVO
	 *@retutn
	 */
	public SurveyRecordVO updateSurveyRecord(SurveyRecordVO returnVO);

	/**
	 * 稽核调查完成
	 * @param resultVO
	 * @return
	 */
	public CaseDetailsVO surveyDone(CaseDetailsVO resultVO);

	/**
	 *  案件关联笔录
	 * @param resultVO
	 */
	public void relateRecord(CaseDetailsVO resultVO);

	public Map<String, Object> queryAf37WithPage(Page page,
			InquiryInputVO inquiryInputVO);
	/**
	 * 
	 * @param af61vo
	 * @return
	 */
	Af61VO queryApprovalInfo(Af61VO af61vo);
	/**
	 * 
	 * @param af61vo
	 * @return
	 */
	Af61VO saveAf61(Af61VO af61vo);
	/**
	 * 
	 * @param af61vo
	 * @return
	 */
	Map<String, Object> queryAf61WithMap(Af61VO af61vo);
	
	public Kf05VO queryKc05ByAaz077(Kf05VO kf05vo);

	public Ac01VO queryAc01ByAaz077(Ac01VO ac01vo);

	public Kb01VO queryKb01ByAaz077(Kb01VO kb01vo);

	public void deleteObject(String aaz077);
	
}
