package com.wondersgroup.local.k5.f10502004.vs.impl;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502004.vs.F10502004VS;

public class F10502004VSImpl implements F10502004VS {
	
private AuditComplaintBS auditComplaintBS;
	
	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}


	public F10502001VO AuditPass(F10502001VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-01:跳转审批通过传入resultVO为空!");
		}
//		UserContext user=BusinessContextUtils.getUserContext();
//		violationComplaintVO.setAae011(user.getOperatorName());
//		violationComplaintVO.setAaz154(user.getOperatorId());
		resultVO=this.getAuditComplaintBS().AuditPass(resultVO);
		return resultVO;
	}

	public F10502002VO auditPassks(F10502002VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-03:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditPassks(resultVO);
		return resultVO;
	}

	public F10502002VO auditNotPassks(F10502002VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-04:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditNotPassks(resultVO);
		return resultVO;
	}

	public F10502003VO auditPassys(F10502003VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-05:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditPassys(resultVO);
		return resultVO;
	}

	public F10502003VO auditNotPassys(F10502003VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-06:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditNotPassys(resultVO);
		return resultVO;
	}

	public F10502001VO auditPassyy(F10502001VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-07:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditPassyy(resultVO);
		return resultVO;
	}

	public F10502001VO auditNotPassyy(F10502001VO resultVO) {
		if(resultVO == null){
			throw new BusinessException("F10502004VS-08:跳转审批通过传入resultVO为空!");
		}
		resultVO=this.getAuditComplaintBS().auditNotPassyy(resultVO);
		return resultVO;
	}

}
