package com.wondersgroup.bc.k3.f10301011.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;


public interface F10301011BS {
	/**
	 * 查询复议案件信息表af53
	 * 
	 * @param page
	 * @param af53Dto
	 * @return
	 */
	Page queryRecheckDetail(Page page, CaseInfoDTO af53Dto);
	
	/**
	 * 查询案件内容表af32
	 * 
	 * @param page
	 * @param af32Dto
	 * @return
	 */
	Page queryRegisterDetail(Page page, Af32DTO af32Dto);
	
	/**
	 * 根据id案件信息表af53
	 * 
	 * @param page
	 * @param af32Dto
	 * @return
	 */
	List<Af53DTO> findCaseID(String ids);
	
	/**
	 * 更新案件信息表af53
	 * 
	 * @param page
	 * @param af53Dto
	 * @return
	 */
	Af53DTO updateAf53(Af53DTO af53Dto);
	
	/**
	 * 保存操作日志Af31
	 * 
	 * @param page
	 * @param af31Dto
	 * @return
	 */
	Af31DTO saveAf31(Af31DTO af31dto);
	
	
	/**
	 * 查询审批信息
	 * @param approvalVo
	 * @return
	 */
	List<QueryApprovalVo> queryApprovalData(QueryApprovalVo approvalVo);
	
	
	/**
	 * 多重审批信息保存
	 * @param approvalVo
	 * @return
	 */
	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);
	
	
	/**
	 * 查询最大的审批类别id
	 * @return
	 */
	ApprovalClassList qryMaxApprovalId();
	/**
	 * 查询结论待审批的案件
	 * @return
	 */
	Page queryAf53ByIds(Page page, Af53DTO af53Dto);
	/**
	 * 查询结论待审批的案件信息
	 * @return
	 */
	public Page queryAf53WithPageInfo(Page page, Af53DTO af53Dto);

	List<Af31> getAf31ById(String aaz318);

	Page queryAf31WithPage(Page page, Af31DTO af31dto);
	
}
