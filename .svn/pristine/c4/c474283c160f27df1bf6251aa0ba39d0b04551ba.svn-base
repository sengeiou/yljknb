package com.wondersgroup.bc.k3.f10301020.bs;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.local.k3.f10301020.vo.QueryApprovalVo;

public interface F10301020BS {

	List<QueryApprovalVo> queryApprovalData(QueryApprovalVo approvalVo);

	ApprovalClassList qryMaxApprovalId();

	Af31DTO getAf31ByAaz077(String aaz077);

	Af53DTO getAf53ByAaz318(String aaz318);

	void updateAf53(Af53DTO af53Dto);

	List<Af31> getAf31ById(String aaz318);

	QueryApprovalVo operateApproval(QueryApprovalVo approvalVo);

	void jumpOut(String aaz318);

}
