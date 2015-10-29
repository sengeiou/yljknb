package com.wondersgroup.local.common.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.common.vo.AuditCaseVO;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.common.vo.DiseaseVO;
import com.wondersgroup.local.common.vo.DoctorVO;
import com.wondersgroup.local.common.vo.GzSummaryVO;
import com.wondersgroup.local.common.vo.InsuPersonVO;
import com.wondersgroup.local.common.vo.MedInstitutionVO;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.common.vo.SickLeverVO;
import com.wondersgroup.local.common.vo.SurveyRecordVO;

public interface CommonVS {

	/**
	 * 根据传入条件查询医师对象信息
	 * @param page
	 * @param doctorVO
	 * @return
	 */
	Map<String, Object> queryDoctorObjWithPage(Page page, DoctorVO doctorVO);
    /**
     * 根据传入对象查询人员信息
     * @param page
     * @param insuPersonVO
     * @return
     */
	Map<String, Object> queryInsuPersonObjWithPage(Page page,InsuPersonVO insuPersonVO);
	/**
	 * 根据传入对象查询医疗机构信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Map<String, Object> queryMedInstitutionObjWithPage(Page page,MedInstitutionVO medInstitutionVO);
	
	/**
	 * 根据传入对象查询医稽核案件信息
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Map<String, Object> queryAuditCaseWithPage(Page page,AuditCaseVO returnVO);
	
	/**
	 * 根据传入主键 aaz318 查询医稽核案件信息
	 * @param aaz318
	 * @return
	 */
	public AuditCaseVO queryAuditCaseDetailsById(String aaz318);
	
	/**
	 * 根据传入对象查询被稽核对像
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Map<String, Object> queryBeAuditInfo(Page page,BeAuditTargetVO returnVO);
	
	/**
	 * 根据传入主键 aaz077 查询被稽核案件详情
	 * @param aaz077
	 * @return
	 */
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077);
	
	/**
	 * 根据传入对象查询案件记录
	 * @param page
	 * @param returnVO
	 * @return
	 */
	public Map<String, Object> querySurveyRecordWithPage(Page page,SurveyRecordVO returnVO);
	
	/**
	 * 根据传入主键 aaz148 查询案件记录详情
	 * @param aaz148
	 * @return
	 */
	public SurveyRecordVO querySurveyRecordInfoById(String aaz148);
	
	/**
	 * 
	 * @Title: queryKa06WithPage 
	 * @Description: 疾病信息
	 * @param @param page
	 * @param @param vo
	 * @param @return    设定文件 
	 * @return Map<String,Object>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-4 下午02:18:56
	 */
	public Map<String,Object> queryKa06WithPage(Page page,SickLeverVO vo);
	
	/***
	 * 查询 疾病信息
	 * */
	public Map<String, Object> queryDiseaseWithPage(Page page , DiseaseVO returnVO);
	/**
	 * 审核历史查询
	 * @param queryHistoryVO
	 * @return
	 */
	QueryHistoryVO querySZJ(QueryHistoryVO queryHistoryVO);
	
	/***
	 * 查询 规则汇总
	 * */
	List<GzSummaryVO> queryGzSummary(GzSummaryVO gzsummaryVO);
	/**
	 * 判断文件是否存在
	 * @param queryHistoryVO
	 * @return
	 */
	Ke02DTO getKe02ById(QueryHistoryVO queryHistoryVO);
	
	/**
	 * 根据条件分页查询结果集中的医疗机构信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Map<String, Object> queryHospitalWithPage(Page page,
			MedInstitutionVO medInstitutionVO);
	/**
	 * 根据条件分页查询结果集中的知识点信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Map<String, Object> queryZSDWithPage(Page page,
			MedInstitutionVO medInstitutionVO);
	/**
	 * 单病种历史查询
	 * @param queryHistoryVO
	 * @return
	 */
	QueryHistoryVO querySZJDBZ(QueryHistoryVO queryHistoryVO);
	
	/**
	 * 判断文件是否存在
	 * @param queryHistoryVO
	 * @return
	 */
	Ke03DTO getKe03ById(QueryHistoryVO queryHistoryVO);
	
	/**
	 * 根据条件分页查询结果集中的医疗机构信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Map<String, Object> queryHospitalDBZWithPage(Page page,
			MedInstitutionVO medInstitutionVO);
}
