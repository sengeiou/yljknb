package com.wondersgroup.local.k3.f10301002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301002.vo.AuditCaseCecordVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vo.DoctorVO;
import com.wondersgroup.local.k3.f10301002.vo.OrganizeVO;
import com.wondersgroup.local.k3.f10301002.vo.PersonVO;
import com.wondersgroup.local.k3.f10301002.vo.StaffListVO;
import com.wondersgroup.local.k3.f10301002.vo.UnitListVO;

public interface F10301002VS {

	/**
	 * 分页查询稽核立案登记Af32信息
	 * 
	 * @param page
	 * @param queryVO
	 * @return
	 */
	Map<String, Object> queryAuditFileRegistrationWithPage(Page page,
			AuditFileVO auditFileRegistration);

	/**
	 * 根据id查询稽核立案登记
	 * 
	 * @param aaz281
	 * @return
	 */
	AuditFileVO getAuditFileById(String aaz281);

	/**
	 * 批量关闭疑点问题
	 * 
	 * @param resultVO
	 * @return
	 */
	int closeQuestion(AuditFileVO resultVO);

	/**
	 * 根据问题ID查询案件编号
	 * 
	 * @param aaz281
	 * @return
	 */
	List<Af53DTO> findCaseID(Long aaz281);

	/**
	 * 根据案件编号查询对应的参保人对象信息
	 * 
	 * @param dto
	 * @return
	 */
	List<Ac01DTO> findObj_Person(String caseID);

	/**
	 * 根据案件编号查询对应的医护人员对象信息
	 * 
	 * @param dto
	 * @return
	 */
	List<Kf05DTO> findObj_Doctor(String caseID);

	/**
	 * 根据案件编号查询对应的医疗机构对象信息
	 * 
	 * @param dto
	 * @return
	 */
	List<Kb01DTO> findObj_Organize(String caseID);

	/**
	 * 查询参保人信息(分页)
	 * 
	 * @param dto
	 * @return
	 */
	Map<String, Object> queryPerson(Page page, AuditFileVO auditFileQuery);

	/**
	 * 查询医护人信息(分页)
	 * 
	 * @param dto
	 * @return
	 */
	Map<String, Object> queryDoctor(Page page, AuditFileVO auditFileQuery);

	/**
	 * 查询医疗机构信息
	 * 
	 * @param dto
	 * @return
	 */
	Map<String, Object> queryOrganize(Page page, AuditFileVO auditFileQuery);

	/**
	 * 保存稽核立案登记信息
	 * 
	 * @param resultVO
	 * @return
	 */
	AuditCaseCecordVO saveOrUpdateAuditCaseCecord(AuditCaseCecordVO resultVO,
			List<PersonVO> personObjs, List<DoctorVO> doctorObjs,
			List<OrganizeVO> organizeObjs, List<StaffListVO> staffLists,
			List<UnitListVO> unitLists);

	/**
	 * 组装疑点问题稽核案件以及稽核对象信息
	 * 
	 * @param resultVO
	 * @return
	 */
	AuditCaseCecordVO queryAuditDetailInfo(AuditCaseCecordVO resultVO);

	/**
	 * 删除案件信息
	 * 
	 * @param resultVO
	 * @return
	 */
	AuditCaseCecordVO deleteCase(AuditCaseCecordVO resultVO);

}
