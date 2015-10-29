package com.wondersgroup.local.k3.f10301019.vs.impl;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301019.bs.F10301019BS;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301019.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301019.vs.F10301019VS;

public class F10301019VSImpl implements F10301019VS{
	
	private F10301019BS f10301019bs;
	
	public F10301019BS getF10301019bs() {
		return f10301019bs;
	}

	public void setF10301019bs(F10301019BS f10301019bs) {
		this.f10301019bs = f10301019bs;
	}

	public List<QueryApprovalVo> queryData(String aaz318) {
		if ("0" == aaz318) {
			throw new BusinessException("F10301019VSImpl:aaz318 is null");
		}
		return this.getF10301019bs().queryApproalData(aaz318);
	}

	public QueryApprovalVo operateApproval(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if(approvalVo.getAaz318()==null||approvalVo.getAaz318()==0){
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}
		
		UserContext userContext = BusinessContextUtils.getUserContext();
		String ailmen = userContext.getOperatorName();
		approvalVo.setAilmen(ailmen);
		approvalVo.setAiltime(new Date());
		ApprovalClassList acl = this.getF10301019bs().qryMaxApprovalId();
		if(approvalVo.getAclid().equals(acl.getAclid())){
			 String aae189 = approvalVo.getAilyj();
			 List<Af53DTO> af53Dtos = this.getF10301019bs().findCaseID(approvalVo.getAaz318()+"");

			 //修改审案状态和插入记录
			 for(Af53DTO af53Dto : af53Dtos){
				Af31DTO af31DTO= new Af31DTO();
				
				af31DTO.setAaz318(af53Dto.getAaz318());
				af31DTO.setAaa027(af53Dto.getAaa027());
			
				af31DTO.setAae036(new Date());
				af31DTO.setAae189(aae189);
				if("是".equals(approvalVo.getAiltg())){
					af53Dto.setAae426("3");
				}else if("否".equals(approvalVo.getAiltg())){
					af53Dto.setAae426("1");
				}
				approvalVo.setAilspfl(1);
				//更新审案状态
				this.getF10301019bs().updateAf53(af53Dto);
			}
		}
		return this.getF10301019bs().operateApproval(approvalVo);
	}
}
