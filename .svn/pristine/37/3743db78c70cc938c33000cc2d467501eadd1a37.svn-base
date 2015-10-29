package com.wondersgroup.bc.k3.f10301024.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301024.vo.QueryApprovalVo;

public interface F10301024BS {

	Page queryRecheckDetail(Page page, CaseInfoDTO queryDto);

	List<QueryApprovalVo> queryApproalData(String aaz318);

	ApprovalClassList qryMaxApprovalId();

	List<Af53DTO> findCaseID(String string);

	void updateAf53(Af53DTO af53Dto);

	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);

	void jumpOut(String aaz318);

}
