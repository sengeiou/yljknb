package com.wondersgroup.bc.auditadministrativedisposal.admindis.bs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af30DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af34DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af35DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af40DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af41DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af42DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af55DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af56DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af58DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af78DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af79DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditConveyDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditInfoDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditPersonDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CheckTaskDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CommonReviewDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CountDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.DoctorDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.HospitalDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.JhtzDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka06DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka59DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc23Kc22DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ke15DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf06DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.MissionFinishDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.PersonDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.PunishQueryDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.UnitListDto;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Af73;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af74DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka44DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.common.vo.GzSummaryVO;
import com.wondersgroup.local.common.vo.MedInstitutionVO;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vo.DoctorVO;
import com.wondersgroup.local.k3.f10301002.vo.StaffListVO;
import com.wondersgroup.local.k3.f10301002.vo.UnitListVO;

public interface AdminDisposalBS {

	/**
	 * 根据传入的Af32DTO保存AF32表信息
	 * @author rhx
	 * @param af32Dto
	 * @return Af32DTO
	 */
	Af32DTO SaveAf32(Af32DTO af32Dto);
	 
	/**
	 * 根据传入的Ke15DTO保存Ke15表信息
	 * @author rhx
	 * @param ke15Dto
	 * @return Ke15DTO
	 */
	Ke15DTO SavaKe15(Ke15DTO ke15Dto);

	/**
	 * 根据传入的Aa10DTO保存Aa10表信息
	 * @author rhx
	 * @param aa10Dto
	 * @return Aa10DTO
	 */
	Aa10DTO SavaAa10(Aa10DTO aa10Dto);

	/**
	 * 根据传入的Af56DTO保存Af56表信息
	 * @author rhx
	 * @param af56Dto
	 * @return Af56DTO
	 */
	Af56DTO savaAf56(Af56DTO af56Dto);
	
	/**
	 * 查询医护人信息(分页)
	 * @author ltt
	 * @param auditFileQuery
	 * @return Page
	 */
	Page queryDoctor(Page page, AuditFileVO auditFileQuery);
	
	/**
	 * 查询医疗机构信息
	 * @author ltt
	 * @param dto
	 * @return Page
	 */
	Page queryOrganize(Page page, AuditFileVO auditFileQuery);
	
	/**
	 * 查询参保人信息(分页)
	 * @author rhx
	 * @param dto
	 * @return Page
	 */
	Page queryPerson(Page page, AuditFileVO auditFileQuery);
	
	/**
	 * 修改保存
	 * 根据传入的Af32DTO保存AF32表信息
	 * @author ltt
	 * @param af32Dto
	 * @return Af32DTO
	 */
	Af32DTO updateAf32(Af32DTO af32Dto);
	
	/**
	 * 修改保存
	 * 根据传入的Ke15DTO保存Ke15表信息
	 * @author ltt
	 * @param ke15Dto
	 * @return Ke15DTO
	 */
	Ke15DTO updateKe15(Ke15DTO ke15Dto);
	
	/**
	 * 修改保存
	 * 根据传入的Af56DTO保存Af56表信息
	 * @author ltt
	 * @param ke15Dto
	 * @return Af56DTO
	 */
	Af56DTO updateAf56(Af56DTO af56Dto);
	
	/**
	 * 修改保存
	 * 根据传入的Aa10DTO保存Aa10表信息
	 * @author ltt
	 * @param aa10Dto
	 * @return Aa10DTO
	 */
	Aa10DTO updateAa10(Aa10DTO aa10Dto);
	
	/**
	 * 分页查询行疑点问题
	 * @author ltt
	 * @param page
	 * @param queryVO
	 * @return Page
	 */
	Page queryAuditProblemWithPage(Page page,Af32DTO af32Dto);
	
	/**
	 * 分页查询任务信息列表
	 * @author hanruyi
	 * @param page
	 * @param queryVO
	 * @return Page
	 */
	Page queryTaskInformationWithPage(Page page,Af79DTO af79Dto);
	
	/**
	 * 分页查询黑名单维护信息
	 * @author ltt
	 * @param page
	 * @param Ke15DTO
	 * @return Page
	 */
	Page queryBlackGrayListWithPage(Page page,Ke15DTO ke15Dto);
	
	/**
	 * 分页查询司法处理执行情况
	 * @author ltt
	 * @param page
	 * @param blackGrayListVO
	 * @return Page
	 */
	Page queryJudicialProcessWithPage(Page page,Af56DTO af56Dto);
		
	/**
	 * 分页查询稽核类型设置信息
	 * @author ltt
	 * @param page
	 * @param AuditTypeVO
	 * @return Page
	 */
	Page queryAuditTypeWithPage(Page page,Aa10DTO aa10Dto);
	
	/**
	 *查询稽核类型稽核
	 *@author ltt 
	 *@param aa10Dto
	 *@return List<Aa10DTO>
	 */
	List<Aa10DTO> getAa10List(Aa10DTO aa10Dto);
	
	/**
	 * 分页查询行政处理处罚
	 * @author ltt 
	 * @param page
	 * @param queryVO
	 * @return Page
	 */


	/**
	 * 分页查询稽核立案登记
	 * @author ltt 
	 * @param page
	 * @param queryVO
	 * @return Page
	 */
	Page queryAuditFileRegistrationWithPage(Page page,AuditFileVO auditFileRegistration);

	/**
	 * 根据Af55ID加载af55详细信息
	 * @author ltt 
	 * @param aaz322
	 * @return Af55DTO
	 */
	Af55DTO getAf55ById(String aaz322);
    
	/**
	 * 根据传入参数更新Af55信息
	 * @author ltt 
	 * @param af55Dto
	 * @return Af55DTO
	 */
	Af55DTO updateAf55(Af55DTO af55Dto);

	/**
	 * 保存af55信息
	 * @author ltt 
	 * @param aaz322
	 * @return Af55DTO
	 */
	Af55DTO saveAf55(Af55DTO af55Dto);


	/**
	 * 根据AF32ID家中AF32的详细信息
	 * @author ltt 
	 * @param aaz281
	 * @return Af32DTO
	 */
	Af32DTO getAf32ById(String aaz281);
	
	/**
	 * 根据KE15ID家中Ke15的详细信息
	 * @author ltt 
	 * @param aaz359 主键
	 * @return  Ke15DTO
	 */
	Ke15DTO getKe15ById(String aaz359);
	
	/**
	 * 根据aaa524查询任务内容的详细信息
	 * @author
	 * @param aaa524 主键
	 * @return  ProblemInfoDTO
	 */
	Page getProblemDetailsById(Page page,String aaa524);
	
	/**
	 * 根据aaz281查询案件内容的详细信息
	 * @author
	 * @param aaz281 
	 * @return  
	 */
	Page getQueryCasesById(Page page,String aaz281);
	/**
	 * 根据aaz318查询稽核对象内容的详细信息
	 * @author
	 * @param aaz318 
	 * @return  
	 */
	Page getQueryObjectById(Page page,String aaz318);
	 
	/**
	 * 根据Af56DTO家中Af56的详细信息
	 * @author ltt 
	 * @param aaz332 主键
	 * @return Af56DTO 
	 */
	Af56DTO getAf56ById(String aaz332);
	
	/**
	 * 根据Aa10ID中Aa10的详细信息
	 * @author ltt 
	 * @param aaa102 主键
	 * @return Aa10DTO
	 */
	 Aa10DTO getAa10ById(String aaa102);
	

	/**
	 * 根据问题ID关闭疑点问题
	 * @author ltt 
	 * @param resultVO
	 * @param aaz281
	 * @return int
	 */
	
	/**
	 * 校验案件状态
	 * @author rhx
	 * @param abz001
	 * @param flag
	 * @return null
	 */
	void checkCaseState(String abz001,String flag);

	/**
	 * 查询af53稽核案件记录
	 * @author ltt
	 * @param page
	 * @param caseVO
	 * @return Page
	 */

	/**
	 * 根据id 批量删除 疑点问题
	 * @author ltt
	 * @param aaz281s
	 * @return null
	 */
	void deleteAf32ByIds(String aaz281s);
	
	/**
	 * 根据id 批量稽核类型
	 * @author ltt
	 * @param aaa102s
	 * @return null
	 */
	void deleteAa10ByIds(String aaa102s);
	
	/**
	 *根据id 批量删除 司法处理执行情况信息
	 *@author ltt 2014-06-23
	 *@param aaz332s
	 *@return null
	 */
	void deleteAf56ByIds (String aaz332s);

	/**
	 * 根据Af53ID加载af53详细信息
	 * @author ltt 
	 * @param aaz318
	 * @return Af53DTO
	 */
	Af53DTO getAf53ById(String aaz318);
	
	/**
	 * 分页查询af53 稽核案件详情记录
	 * 而且与af31相关联
	 * @author litiantong
	 * @param page
	 * @param auditCaseDetailsVO
	 * @return Page
	 */
	
	Page queryAuditCaseDetailsWithPage(Page page,Af53DTO af53Dto);
	
	/**
	 * 根据稽核案件Id 查询Af31DTO详细信息
	 * @author litiantong
	 * @param aaz077
	 * @return Af31DTO
	 */
	Af31DTO getAf31ById(String aaz077);


    /**
     * 查询处罚执行结果信息AF58
     * @author litiantong
     * @param punQueryDto
     * @return List<Af58DTO>
     */
	List<Af58DTO> queryAf58Info(PunishQueryDTO punQueryDto);

	/**
	 * 根据问题ID查询案件编号
	 * @author litiantong
	 * @param aaz281
	 * @return List<Af53DTO>
	 */
	List<Af53DTO> findCaseID(Long aaz281);

	/**
	 * 根据案件编号查询对应的参保人对象信息
	 * @author rhx
	 * @param dto
	 * @return List<Ac01DTO>
	 */
	List<Ac01DTO> findObj_Person(String caseID);

	/**
	 * 根据案件编号查询对应的医护人员对象信息
	 * @author ltt
	 * @param dto
	 * @return List<Kf05DTO>
	 */
	List<Kf05DTO> findObj_Doctor(String caseID);

	/**
	 * 根据案件编号查询对应的医疗机构对象信息
	 * @author rhx
	 * @param dto
	 * @return List<Kb01DTO>
	 */
	List<Kb01DTO> findObj_Organize(String caseID);

	/**
	 * 查询参保人信息(分页)
	 * @author rhx
	 * @param dto
	 * @return Page
	 */
	
    /**
     * 删除af58对象
     * @author rhx
     * @param af58Dto
     */
	void deleteAf58(Af58DTO af58Dto);
	
	/**
     * 删除af55对象
     * @param af55Dto
     * @return null
     */
	void deleteAf55(Af55DTO af55Dto);

    /**
     * 更新af58对象
     *  @author ltt
     * @param af58Dto
     * @return Af58DTO
     */
	Af58DTO updateAf58(Af58DTO af58Dto);
	
	/***
	 *根据主键查询af58
	 *@author ltt
	 *@param aaz323
	 *@return Af58DTO
	 */
	Af58DTO getAf58ById(String aaz323);
	
    /**
     * 保存af58对象
     * @author ltt
     * @param af58Dto
     * @return Af58DTO
     */
	Af58DTO saveAf58(Af58DTO af58Dto);
	
	/**
     * 更新af31对象
     * @author ltt
     * @param af31Dto
     * @return Af31DTO
     */
	Af31DTO updateAf31(Af31DTO af31Dto);
	
    /**
     * 保存af31对象
     * @author ltt
     * @param af31Dto
     * @return Af31DTO
     */
	Af31DTO saveAf31(Af31DTO af31Dto);
	
	/**
     * 保存af53对象
     * @author ltt
     * @param af53Dto
     * @return Af53DTO
     */
	Af53DTO saveAf53(Af53DTO af53Dto);

	/**
	 * 查询医护人信息(分页)
	 * @author ltt
	 * @param auditFileQuery
	 * @return Page
	 */

	/**
	 * 查询医疗机构信息
	 * @author ltt
	 * @param dto
	 * @return Page
	 */

    /**
     * 查询被稽核对象列表Af31
     * @author ltt
     * @param page
     * @param af31Dto
     * @return Page
     */
	Page queryAf31WithPage(Page page, Af31DTO af31Dto);

    /**
     * 根据主键查询Ac01
     * @author ltt
     * @param aaz010
     * @return Ac01DTO
     */
	Ac01DTO getAc01ById(String aaz010);

    /**
     * 根据主键查询Kf05
     * @author ltt
     * @param aaz010
     * @return Kf05DTO
     */
	Kf05DTO getKf05ById(String aaz010);

    /**
     * 根据主键查询kf06
     * @author ltt
     * @param aaz307
     * @return Kf06DTO
     */
	Kf06DTO getKf06ById(String aaz307);

    /**
     * 根据传入queryDto查询KB01List
     * @author rhx
     * @param queryDto
     * @return List<Kb01DTO>
     */
	List<Kb01DTO> queryKb01List(Kb01DTO queryDto);

    /**
     * 根据主键查询Kb01
     * @author ltt
     * @param aaz010
     * @return Kb01DTO
     */
	Kb01DTO getKb01ById(String aaz010);
	
	/**
     * 更新af3
     * @author ltt
     * @param af53DTO
     * @return Af53DTO
     */
	Af53DTO updateAf53(Af53DTO af53DTO);
	
    /**
     * 根据传入对象查询kf05分页信息
     * @author ltt
     * @param page
     * @param queryDto
     * @return Page
     */
	Page queryKf05WithPage(Page page, Kf05DTO queryDto);

    /**
     * 根据传入对象查询ac01分页信息
     * @author ltt
     * @param page
     * @param queryDto
     * @return Page
     */
	Page queryAc01WithPage(Page page, Ac01DTO queryDto);
    
	/**
	 * 根据传入对象查询kb01分页信息
	 * @author ltt
	 * @param page
	 * @param queryDto
	 * @return Page
	 */
	Page queryKb01WithPage(Page page, Kb01DTO queryDto);
	
	/**
	 * 根据传入对象查询af53分页信息
	 * @author ltt
	 * @param page
	 * @param af53Dto
	 * @return Page
	 */
	Page queryAf53WithPage(Page page, Af53DTO af53Dto);
	
	/**
	 * 分页查询Af53
	 * @author ltt
	 * @param page
	 * @param caseDetailsVO
	 * @return Page
	 */
	
	/**
	 * 根据传入的af30Dto保存AF32表信息
	 * @author ltt
	 * @param af30Dto
	 * @return Af30DTO
	 */
	Af30DTO saveAf30(Af30DTO af30Dto);
	
	/**
     * 查询被稽核对象列表Af30
     * @author ltt
     * @param page
     * @param af30Dto
     * @return Page
     */
	Page querySurveyRecordWithPage(Page page,Af30DTO af30Dto);
	
	/***
	 *根据主键查询 af30
	 *@author ltt
	 *@param aaz148
	 *@return Af30DTO
	 */
	Af30DTO getAf30ById(String aaz148);
	
	/**
	 * 根据传入的af30Dto 修改AF32表信息
	 * @author ltt
	 * @param af30Dto
	 * @return Af30DTO
	 */
	Af30DTO updateAf30(Af30DTO af30Dto);
	
    /**
     * 删除AF53信息
     * @author ltt
     * @param af53Dto
     * @return null
     */
	void deleteAf53(Af53DTO af53Dto);
	
    /**
     * 根据aaz318删除af31信息
     * @author ltt
     * @param aaz318
     * @return null
     */
	void deleteAf31ByAaz318(Long aaz318);
	
    /**
     * 删除Af31信息
     * @author ltt
     * @param af31Dto
     * @return null
     */
	void deleteAf31(Af31DTO af31Dto);
	
	/***
	 *根據案件Id查詢af31
	 *@author ltt
	 *@param af31Dto
	 *@return List<Af31DTO>
	 */
	public List<Af31DTO> queryAf31List(Af31DTO af31Dto);
	
	/**
	 *根据apa011查询 af31 得到 aaz318
	 *再去查询 af53
	 *@author ltt
	 *@param page
	 *@param af53Dto
	 *@return Page
	 */
	public Page queryAf53ByIds(Page page , Af53DTO af53Dto);
	
	
	/***
	 *获取该对象所有黑（灰）名单记录中终止日期超过当前日期的最高监控级别
	 *@author hanruyi
	 *@param aaz010
	 *@return String
	 */
	public String getKe15Apa151ByAaz010(String aaz010);
	
	/**
     * 更新ac01
     * @author ltt
     * @param ac01Dto
     * @return Ac01DTO
     */
	public Ac01DTO updateAc01(Ac01DTO ac01Dto);
	
	/**
     * 更新kf05
     * @author ltt
     * @param kf05Dto
     * @return Kf05DTO
     */
	public Kf05DTO updateKf05(Kf05DTO kf05Dto);
	
	/**
     * 更新kb01
     * @author ltt
     * @param kb01Dto
     * @return Kb01DTO
     */
	public Kb01DTO updateKb01(Kb01DTO kb01Dto);
	
	/**
     * 查询 稽核 结论 传达的对象
     * @author ltt
     * @param auditCaseDTO
     * @return Page
     */
	public Page queryAf53Convey(Page page , AuditCaseDTO  auditCaseDTO);
	
	/**
     * 查询 稽核  传达 af34
     * @author ltt
     * @param auditConveyDTO
     * @param page
     * @return Page
     */
	public Page queryAf34WinthPage(Page page,AuditConveyDTO auditConveyDTO);
	
	/***
	 *保存 af34
	 *@author ltt
	 *@param af34Dto
	 *@return Af34DTO
	 */
	public Af34DTO saveAf34(Af34DTO af34Dto);
	
	/***
	 *更新 af34
	 *@author  ltt
	 *@param af34Dto
	 *@return Af34DTO 
	 */
	public Af34DTO updateAf34(Af34DTO af34Dto);
	
	/***
	 *根据主键查询af34
	 *@author ltt
	 *@param aaz147
	 *@return Af34DTO
	 */
	public Af34DTO getAf34ById(String aaz147);
	
	/***
	 *批量删除af34
	 *@author ltt
	 *@param aaz147s
	 *@return null
	 */
	public void deleteAf34ByIds(String aaz147s);
	
	/***
	 *查询稽核传达的被稽核对象
	 *@author ltt
	 *@param page
	 *@param auditPersonDTO
	 *@return Page
	 */
	public Page queryConveyBeAudit(Page page , AuditPersonDTO auditPersonDTO);
	
	/***
	 *按查询条件查询出还未移交的，并且结论为行政处理处罚或司法处理的被稽核对象所属的案件 
	 *@author ltt
	 *@param page
	 *@param auditCaseDTO
	 *@return Page
	 */
	public Page queryAf53TransTurn(Page page , AuditCaseDTO auditCaseDTO);
	
	/***
	 *查询有经办处理或者行政处理标志的，并且已经移交转办的对象所属的案件
	 *@author ltt
	 *@param page
	 *@param auditCaseDTO
	 *@return  Page
	 */
	public Page queryAf53StateTrace(Page page , AuditCaseDTO auditCaseDTO);
	
	/***
	 *查询转办登记被稽核对象
	 *@author ltt
	 *@param page
	 *@param auditPersonDTO
	 *@return  Page
	 */
	public Page queryTranTurn(Page page, AuditPersonDTO auditPersonDTO);
	
	/***
	 *查询经办和行政处理被稽核对象
	 *@author ltt
	 *@param page
	 *@param auditPersonDTO
	 *@return Page
	 */
	public Page queryStateTrace(Page page, AuditPersonDTO auditPersonDTO);
	
	/**
	 *分页查询 af58
	 *@author ltt
	 *@param page
	 *@param af58Dto
	 *@return Page
	 */
	public Page queryAf58(Page page,Af58DTO af58Dto);
	
	/***
	 *查询 af35
	 *@author ltt
	 *@param af35Dto
	 *@return List<Af35DTO>
	 */
	public List<Af35DTO> getAf35List(Af35DTO af35Dto);
	
	/***
	 *保存af35
	 *@author ltt
	 *@param af35Dto
	 *@return Af35DTO
	 */
	public Af35DTO saveAf35(Af35DTO af35Dto);
	
	/***
	 *更新af35
	 *@author ltt
	 *@param af35Dto
	 *@return Af35DTO
	 */
	public Af35DTO updateAf35(Af35DTO af35Dto);
	
	/***
	 * 根据主键查询aaz302
	 *@author ltt
	 *@param aaz302
	 *@return Af35DTO
	 */
	public Af35DTO getAf35ById(String aaz302);
	
	/**
	 * 
	 * @Title: deleteAf40ByAaa027 
	 * @Description: 根据统筹区和台账年月删除登记问题台帐
	 * @param @param aaa027   统筹区
	 * @param @param aae149   台帐年月
	 * @return void    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午01:48:44
	 */
	public void deleteAf40ByAaa027(String aaa027,String aae149);
	
	/**
	 * 
	 * @Title: deleteAf41ByAaa027 
	 * @Description: 根据统筹区和台账年月删除稽核案件台帐
	 * @param @param aaa027   统筹区
	 * @param @param aae149   台帐年月
	 * @return void    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午01:50:15
	 */
	public void deleteAf41ByAaa027(String aaa027,String aae149);
	
	/**
	 * 
	 * @Title: deleteAf42ByAaa027 
	 * @Description: 根据统筹区和台账年月删除执行结果台帐
	 * @param @param aaa027   统筹区
	 * @param @param aae149   台帐年月 
	 * @return void    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午01:50:25
	 */
	public void deleteAf42ByAaa027(String aaa027,String aae149);
	
	/**
	 * 
	 * @Title: queryAf40ByAaa027 
	 * @Description: 根据统筹区和台账年月查询登记问题台帐
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:02:42
	 */
	public Page queryAf40ByAaa027(Page page,Af40DTO dto);
	
	/**
	 * 
	 * @Title: queryAf41ByAaa027 
	 * @Description:  根据统筹区和台账年月查询稽核案件台帐
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:02:45
	 */
	public Page queryAf41ByAaa027(Page page,Af41DTO dto);
	
	/**
	 * 
	 * @Title: queryAf42ByAaa027 
	 * @Description:  根据统筹区和台账年月查询执行结果台帐
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:02:48
	 */
	public Page queryAf42ByAaa027(Page page,Af42DTO dto);
	
	/**
	 * 
	 * @Title: addAf40 
	 * @Description:   添加登记问题台帐
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return JhtzDTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:04:37
	 */
	public JhtzDTO addAf40(JhtzDTO dto);
	
	/**
	 * 
	 * @Title: addAf41 
	 * @Description:   添加稽核案件台帐
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return JhtzDTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:04:40
	 */
	public JhtzDTO addAf41(JhtzDTO dto);
	
	/**
	 * 
	 * @Title: addAf42 
	 * @Description:  添加执行结果台帐
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return JhtzDTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午02:04:44
	 */
	public JhtzDTO addAf42(JhtzDTO dto);
	

	/**
	 * 
	 * @Title: getAf40 
	 * @Description: 根据统筹区和台账年月统计登记问题台帐
	 * @param @param aaa027
	 * @param @param aae149
	 * @param @return    设定文件 
	 * @return Long    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午03:05:33
	 */
	public Long getAf40(String aaa027,String aae149);

	/**
	 *根据abz001 查询af53
	 *@author  ltt
	 *@param abz001
	 *@return List<Af53DTO>
	 */
	public List<Af53DTO> getAf53ByAbz001(String abz001);

	
	/**
	 * 
	 * @Title: getAf41 
	 * @Description: 根据统筹区和台账年月统计稽核案件台帐
	 * @param @param aaa027
	 * @param @param aae149
	 * @param @return    设定文件 
	 * @return Long    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午03:05:36
	 */
	public Long getAf41(String aaa027,String aae149);
	

	/**
	 * 
	 * @Title: getAf42 
	 * @Description: 根据统筹区和台账年月统计执行结果台帐
	 * @param @param aaa027
	 * @param @param aae149
	 * @param @return    设定文件 
	 * @return Long    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-22 下午03:05:40
	 */
	public Long getAf42(String aaa027,String aae149);
	
	/**
	 * 
	 * @Title: queryAf53ByAf31 
	 * @Description: 对象查询
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-24 下午01:45:35
	 */
	public Page queryAf53ByAf31(Page page,AuditInfoDTO dto);
	
	/**
	 * 
	 * @Title: queryAf31ByAaz318 
	 * @Description: 根据稽核案件ID查询被稽核对象
	 * @param @param page
	 * @param @param aaz318
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-24 下午04:36:29
	 */
	public Page queryAf31ByAaz318(Page page,String aaz318);
	
	/***
	 *获取af53的案件编号
	 *@author ltt
	 *@param  af53Dto
	 *@return List<Af53DTO>
	 */
	public List<Af53DTO> getaf53List(Af53DTO af53Dto);
	
	/**
	 * 
	 * @Title: queryAf31ByAaz077 
	 * @Description:  根据被稽核对象id查找稽核结论信息 
	 * @param @param aaz077
	 * @param @return    设定文件 
	 * @return Af31DTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-25 下午02:46:37
	 */
	public Af31DTO queryAf31ByAaz077(String aaz077);
	
	/**
	 * 
	 * @Title: queryAf35ByAaz077 
	 * @Description: 根据被稽核对象id查看经办处罚结果
	 * @param @param aaz077
	 * @param @return    设定文件 
	 * @return Af35DTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-25 下午04:31:10
	 */
	public Af35DTO queryAf35ByAaz077(String aaz077);
	/***
	 * 查询医疗机构
	 * @author ltt
	 * @param kb01Dto
	 * @return List<Kb01DTO>
	 */
	public List<Kb01DTO> getKb01List(Kb01DTO kb01Dto);
	
	/**
	 * 
	 * @Title: queryKa59WithPage 
	 * @Description: 根据条件查询 疑点明细信息
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-30 下午03:05:34
	 */
	public Page queryKa59WithPage(Page page,Ka59DTO dto);
	
	/**
	 * 
	 * @Title: getKa59ByAAz328 
	 * @Description:  根据ID查询ka59（疑点明细信息）
	 * @param @param aaz328
	 * @param @return    设定文件 
	 * @return Ka59DTO    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-30 下午04:56:03
	 */
	public Ka59DTO getKa59ByAAz328(Long aaz328);
	
	/**
	 * 
	 * @Title: queryKa54Kc24ByAaz328 
	 * @Description: 根据AAZ328查询就诊和结算信息
	 * @param @param aaz328
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-31 上午10:01:25
	 */
	public Page queryKa52Kc24ByAaz328(Page page,Long aaz328);
	
	/**
	 * 
	 * @Title: queryAf31ByAaz010 
	 * @Description:根据AAZ010查询历史违规记录
	 * @param @param page
	 * @param @param Aaz010
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-31 上午10:25:49
	 */
	public Page queryAf31ByAaz010(Page page,String aaz010);
	
	/**
	 * 
	 * @Title: queryKc23KC23 
	 * @Description: 根据AAZ328和AAZ217查询 kc23和kc22
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-7-31 下午03:02:02
	 */
	public Page queryKc23KC23(Page page,Kc23Kc22DTO dto);
	
	/**
	 * 
	 * @Title: countKc22ByAKE003 
	 * @Description: 通过三目类别统计费用
	 * @param @param page
	 * @param @param aaz217
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-1 上午10:36:38
	 */
	public Page countKc22ByAKE003(Page page,String aaz217);
	
	/**
	 * 
	 * @Title: countKc22ByAKA063 
	 * @Description: 通过发票统计费用
	 * @param @param page
	 * @param @param aaz217
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-1 上午10:37:16
	 */
	public Page countKc22ByAKA063(Page page,String aaz217);
	
	/**
	 * 
	 * @Title: countKc22ByAKA032 
	 * @Description:  通过二级分类统计费用 
	 * @param @param page
	 * @param @param aaz217
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-1 上午10:37:55
	 */
	public Page countKc22ByAKA032(Page page,String aaz217);
	
	/**
	 * 
	 * @Title: countKc22ByAKA065 
	 * @Description: 通过收费项目等级统计费用
	 * @param @param page
	 * @param @param aaz217
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-1 上午10:37:59
	 */
	public Page countKc22ByAKA065(Page page,String aaz217);


	/**
	 * 
	 * @Title: queryKa06WithPage 
	 * @Description: 查询疾病信息 
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-4 上午11:22:03
	 */
	public Page queryKa06WithPage(Page page,Ka06DTO dto);

	/***
	 *查询af55
	 *@author ltt
	 *@param 
	 *@return  List<Af55DTO>
	 */
	public List<Af55DTO> getAf55List();
	
	/***
	 *分页查询af55
	 *@author ltt
	 *@param page
	 *@param af55Dto
	 *@return Page
	 */
	public Page queryAf55WithPage(Page page , Af55DTO af55Dto);
	
	/**
	 * 
	 * @Title: queryAc01ByAaa153 
	 * @Description: 根据AAA153（监控类型）查询参保人员信息
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-5 下午02:08:01
	 */
	public Page queryAc01ByAaa153(Page page ,Ka59DTO dto);
	
	
	/**
	 * 
	 * @Title: getKa59List 
	 * @Description: 根据查询条件统计
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return List<CountDTO>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-5 下午03:26:39
	 */
	public List<CountDTO> getKa59List(Ka59DTO dto);

	
	/**
	 * 
	 * @Title: queryRulesByPerson 
	 * @Description: 查询某个人违反的规则列表
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-6 上午09:27:46
	 */
	public Page queryRulesByPerson(Page page,PersonDTO dto);

	
	/***
	 *黑名单案件查询
	 *@author ltt
	 *@param page
	 *@param af53Dto
	 *@return af53Dto
	 */
	public Page getAf53WithPage(Page page , Af53DTO af53Dto);
	
	/**
	 * 
	 * @Title: queryAc02ByAac001 
	 * @Description:根据aac001查询参保信息
	 * @param @param page
	 * @param @param aac001
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-6 下午04:24:40
	 */
	public Page queryAc02ByAac001(Page page,String aac001);
	
	/**
	 * 
	 * @Title: queryDoctorList 
	 * @Description: 医师疑点分类初审统计饼图
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return List<CountDTO>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-7 上午09:53:22
	 */
	public List<CountDTO> queryDoctorList(DoctorDTO dto);
	
	/**
	 * 
	 * @Title: queryDoctorWithPage 
	 * @Description:  医师疑点分类初审   医师查询
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-7 上午10:25:35
	 */
	public Page queryDoctorWithPage(Page page,DoctorDTO dto);
	
	/**
	 * 
	 * @Title: queryRolesByDoctor 
	 * @Description: 根据医师查询医师违反的规则 
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-7 上午11:25:21
	 */
	public Page queryRolesByDoctor(Page page,DoctorDTO dto);
	
	/**
	 * 
	 * @Title: queryHospitalList 
	 * @Description: 查询医疗机构疑点分类初审的饼图
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return List<CountDTO>    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-7 下午02:53:13
	 */
	public List<CountDTO> queryHospitalList(HospitalDTO dto);
	
	/**
	 * 
	 * @Title: queryHospitalWithPage 
	 * @Description: 查询医疗机构疑点列表
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-12 下午03:47:56
	 */
	public Page queryHospitalWithPage(Page page,HospitalDTO dto);
	
	
	/**
	 * 
	 * @Title: queryRolesByHospital 
	 * @Description: 根据医疗机构查询机构违反的规则
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-12 下午04:05:20
	 */
	public Page queryRolesByHospital(Page page,HospitalDTO dto);
	
	/**
	 *立案确认被稽核对象
	 */
	public Ac01DTO getAc01Dto(Ac01DTO ac01Dto);
	/**
	 * 
	 * @Title: queryKA52KC24WithPage 
	 * @Description: 查询就诊和结算信息
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-14 下午02:14:18
	 */
	public Page queryKA52KC24WithPage(Page page,CommonReviewDTO dto);
	
	/**
	 * 
	 * @Title: queryKC23KC22YD 
	 * @Description: 通过疑点信息查处方和处方明细 
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-14 下午02:40:38
	 */
	public Page queryKC23KC22YD(Page page,CommonReviewDTO dto);
	
	/**
	 * 
	 * @Title: queryAF31ByAAZ010 
	 * @Description: 查询历史违规记录
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-14 下午03:09:56
	 */
	public Page queryAF31ByAAZ010(Page page,CommonReviewDTO dto);
	
	/**
	 * 
	 * @Title: getWtnr 
	 * @Description:获得违规内容和违规金额
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-15 下午03:41:20
	 */
	public String getWtnr(CommonReviewDTO dto);
	
	/**
	 * 
	 * @Title: updateKA59 
	 * @Description:更新KA59
	 * @param @param dto    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-15 下午05:10:33
	 */
	public void updateKA59(CommonReviewDTO dto,String ape031);

	/**
	 * 
	 * @Title: queryKC21Info 
	 * @Description: 查询病历信息
	 * @author wjz
	 * @date 2014-9-2 
	 */
	public Kc21DTO queryKC21(String aaz217);
	
	/**
	 * 
	 * @Title: missionFinishDTO 
	 * @Description:核查任务提交(任务列表查询)
	 * @author dmq
	 * @date 2014-9-16
	 */
	public Page queryAsListInfo(Page page, MissionFinishDTO missionFinishDTO);
	/**
	 * 
	 * @Title: missionFinishDTO 
	 * @Description:核查任务提交(问题列表查询)
	 * @author dmq
	 * @date 2014-9-16
	 */
	public Boolean missionFinished(MissionFinishDTO missionFinishDTO);
	/**
	 * 
	 * @Title: missionFinishDTO 
	 * @Description:核查任务提交(问题列表查询)
	 * @author dmq
	 * @date 2014-9-16
	 */
	public Page queryMissionDitel(Page page, MissionFinishDTO missionFinishDTO);
	
	/**
	 * 
	 * @Title: queryAf78 
	 * @Description:核查任务统计
	 * @author dmq
	 * @date 2014-9-15 
	 */
	public Page queryPlanWithPage(Page page,CheckTaskDTO checkTaskDTO);
	/**
	 * 
	 * @Title: queryAf78 
	 * @Description:核查任务问题统计
	 * @author dmq
	 * @date 2014-9-15 
	 */
	public Page queryProblemWithPage(Page page,CheckTaskDTO checkTaskDTO);
	
	/**
	 * 
	 * @Title: queryAf78 
	 * @Description:核查任务问题统计
	 * @author dmq
	 * @date 2014-9-15 
	 */
	public Page queryCaseWithPage(Page page,CheckTaskDTO checkTaskDTO);
	
	
	
	/**
	 * 
	 * @Title: queryAjxxWithPage 
	 * @Description: 查询案件信息
	 * @author wjz
	 * @date 2014-9-15 
	 */

	/**
	 * 
	 * @Title: queryBjhDxxxWithPage 
	 * @Description: 查询被稽核对象信息
	 * @author wjz
	 * @date 2014-9-15 
	 */
	public Page queryBhcDxxxWithPage(Page page, String id);
	
	/**
	 * 根据监控类型 aaa153 查询规则名aaa167
	 * @author ltt
	 * @param af32Dto
	 * @return list
	 * @throws null
	 * */
	public List<Ka44DTO> getKa44List(Af32DTO af32Dto);
	
	/**
	 * 保存af79
	 * @author ltt
	 * @param af79Dto
	 * @return Af79DTO
	 * @throws
	 * */
	public Af79DTO saveAf79(Af79DTO af79Dto);
	
	/**
	 * 修改af79
	 * @author ltt
	 * @param af79Dto
	 * @return Af79DTO
	 * @throws
	 * */
	public Af79DTO updateAf79(Af79DTO af79Dto);
	
	/**
	 * 保存af78
	 * @author ltt
	 * @param af78Dto
	 * @return af78Dto
	 * @throws
	 * */
	public Af78DTO saveAf78(Af78DTO af78Dto);
	
	/**
	 * 核查任务生成查询
	 * */
	public Page queryCheckTaskBuildWithPage(Page page, Af32DTO af32Dto);
	
	/**
	 * 根据Aaz281查询疑点
	 * @author wjz
	 * @param aaz281
	 * @return
	 */
	public Ka59DTO queryKa59ByAaz281(String aaz281);
	
	/**
	 * 判断是否有医院系统平台
	 * @author wjz
	 * @return
	 */
	public int is_yyxtpt();
	

	/**
	 * 查询登记案件
	 * @author wjz
	 * @return
	 */
	
	/**
	 * 根据案件ID查询对象
	 * @author wjz
	 * @return
	 */
	public Page queryPersonByCase(Page page, String aaz318);
	
	/**
	 * 查询申诉信息
	 * @author wjz
	 * @return
	 */
	public Af73DTO getAf73(String aaz077, String aaz318);
	
	/**
	 * 查询申诉材料
	 * @author wjz
	 * @return
	 */
	public Page getAf74(Page page, String aaz529);
	
	/**
	 * 查询 af79
	 * */
	public Page queryMissionExamineWithPage(Page page , Af79DTO af79Dto);
	
	/**
	 * 根据ID查询申诉材料
	 * @author wjz
	 * @return
	 */
	Af74DTO getAf74(String aaz530);
	
	/**
	 * 根据SQL查询 返回MAP
	 * @author wjz
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	Map queryForMap(String sql);
	
	/**
	 * 根据SQL查询Af73 LIST
	 * @author wjz
	 * @return
	 */
	List<Af73> queryAf73ForList(String sql);
	
	/**
	 * 根据SQL更新
	 * @author wjz
	 * @return
	 */
	int updateBySql(String sql);
	
	/**
	 * 保存AF73
	 * @author wjz
	 * @return
	 */
	void saveAf73(Af73 af73);
	
	/**
	 * 根据任务编号 查询aaz281 af78
	 * */
	public List<Af78DTO> getAf78List(Af78DTO af78Dto);
	
	/**
	 * 根据aaz281 查询 af32
	 * */
	public Page queryPeoblrmByAaz281WithPage(Page page , Af32DTO af32Dto);
	
	/***
	 * 删除 af78
	 * */
	public void deleteAf78(Af78DTO af78Dto);
	
	/**
	 * 同过SQL查询总数
	 * @param sql
	 * @return
	 */
	public int queryCountForInt(String sql);
	
	/**
	 * 获取该对象所有黑（灰）名单记录中终止日期超过当前日期的最高监控级别
	 */
	public String findHighestMonitorRank(String aaz010);
	
	/**
	 * AF73是否存在该数据
	 * @param aaz318
	 * @param aaz077
	 * @return
	 */
	public String is_existsAf73(String aaz318, final String aaz077);
	
	/**
	 * 验证审核信息，af73状态为0待受理状态2审核不通过6补充材料
	 * 
	 * @param aaz318
	 * @param aaz077
	 * @return String
	 */
	public int confirm_pass_ds(String aaz318, String aaz077, String ape139);
	
	/**
	 * 根据 主键 查询af79
	 * */
	public Af79DTO getAf79ById(String aaz524);
	
	/**
	 * 通过SQL查询单个字段
	 * @param sql
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Object queryStringBySql(String sql,Class clazz);
	
	/***
	 * 分页查询疾病信息
	 * 
	 * */
	public Page queryDiseaseWithPage(Page page , Ka06DTO ka06Dto);
	/**
	 * 审核历史查询
	 * @param queryHistoryVO
	 * @return
	 */
	QueryHistoryVO querySZJ(QueryHistoryVO queryHistoryVO);

	/***
	 * 查询 规则汇总
	 * 
	 * */
	List<GzSummaryVO> queryGzSummary(GzSummaryVO vo);

	/**
	 * 根据id查询ke02附件
	 * @param baz010
	 * @return
	 */
	Ke02DTO getKe02ById(String baz010);

	/**
	 * 根据条件分页查询结果集中的医疗机构信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Page queryHospitalWithPage(Page page, MedInstitutionVO medInstitutionVO);

	/**
	 * 根据条件分页查询结果集中的知识点信息
	 * @param page
	 * @param medInstitutionVO
	 * @return
	 */
	Page queryZSDWithPage(Page page, MedInstitutionVO medInstitutionVO);
	/**
	 * 问题录入新增简单处理
	 * 
	 * @param aaz281
	 */
	void updateAf32Byid(String aaz281s, String aae200);

	public Kf05DTO getKf05ByAaz027(String aaz010);

	public Kb01DTO getkb01ByAaz107(String aaz010);

	/**
	 * 新增参保人信息
	 * 
	 * @param ac0102Vo
	 * @return
	 */
	public StaffListVO addPerson(StaffListVO resultVO);

	/**
	 * 修改医师信息
	 * 
	 * @param doctorVO
	 * @return
	 */
	public DoctorVO updateDoctor(DoctorVO doctorVO);

	/**
	 * 新增医师信息
	 * 
	 * @param doctorVO
	 * @return
	 */
	public DoctorVO addDoctor(DoctorVO doctorVO);
	
	
	/**
	 * 查询单位信息
	 * 
	 * @param page
	 * @param resultVO
	 * @return
	 */
	Page queryUnitWithPage(Page page, UnitListVO resultVO);
	
	/**
	 * 根据id得到单位详细信息
	 * @param aaz010
	 * @return
	 */
	public UnitListDto getUnitByAaz107(String aaz010);
	
	
	/**
	 * 修改两定机构信息
	 * 
	 * @param medInstitutionVO
	 * @return
	 */
	public UnitListVO updateMedInstitution(UnitListVO unitListVO);
	

	/**
	 * 新增两定机构信息
	 * 
	 * @param medInstitutionVO
	 * @return
	 */
	public UnitListVO addMedInstitution(UnitListVO unitListVO);

	/**
	 * 根据案件id和调查人姓名查询该案件是否已绑定了该稽核对象
	 * 
	 * @return
	 */
	public boolean isAddObject(Af31DTO af31DtoP);

	/**
	 * 单病种历史查询
	 * @param queryHistoryVO
	 * @return
	 */
	QueryHistoryVO querySZJDBZ(QueryHistoryVO queryHistoryVO);

	/**
	 * 根据id查询ke03附件
	 * @param baz014
	 * @return
	 */
	Ke03DTO getKe03ById(String baz014);
	/**
	 * 稽核调查完成
	 * @param af53dto
	 * @return
	 */
	public Af53DTO surveyDone(Af53DTO af53dto);

	/**
	 * 
	 * @Title: queryHospitalWithPage 
	 * @Description: 查询医疗机构疑点列表
	 * @param @param page
	 * @param @param dto
	 * @param @return    设定文件 
	 * @return Page    返回类型 
	 * @throws 
	 * @author chenlin
	 * @date 2014-8-12 下午03:47:56
	 */
	public Page queryHospitalDBZWithPage(Page page, MedInstitutionVO medInstitutionVO);

	/**
	 * 结论确认完成
	 * @param af53dto
	 * @return
	 */
	//Af53DTO registDone(Af53DTO af53dto);
	 Map<String, Object> queryAf32WithMap(Long aaz281);
	 
	 Af32DTO getMaxAaz171();
	 
	 /**
	  * 调查重审
	  */
	 public void updateAf31ByAaz318(String aaz318);

	 /**
	  * 查询AF38
	  * @param aaz077
	  * @return
	  */
	public Af38DTO queryAf38ByAaz077(String aaz077);

	Af31DTO getAf31ByAaz077(String aaz077, String apa709);
}