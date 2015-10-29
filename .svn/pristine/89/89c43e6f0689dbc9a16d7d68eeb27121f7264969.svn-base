package com.wondersgroup.local.k5.f10503003.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503003.vs.F10503003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10503003VSImpl implements F10503003VS {

	private AuditComplaintBS auditComplaintBS;
	
	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}

	public Map<String, Object> queryBreAudit(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-01:查询申诉信息传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryBreAudit(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryBreAuditDetail(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-02:查询申诉信息详细传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryBreAuditDetail(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public ViolationComplaintVO toBreAuditPass(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-03:跳转审批通过传入violationComplaintVO为空!");
		}
		UserContext user=BusinessContextUtils.getUserContext();
		violationComplaintVO.setAae036(new Date());
		violationComplaintVO.setAae011(user.getOperatorName());
		violationComplaintVO.setAaz154(user.getOperatorId());
		return violationComplaintVO;
	}
	public ViolationComplaintVO toBreAuditNotPass(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-04:跳转审批不通过传入violationComplaintVO为空!");
		}
		UserContext user=BusinessContextUtils.getUserContext();
		violationComplaintVO.setAae036(new Date());
		violationComplaintVO.setAae011(user.getOperatorName());
		violationComplaintVO.setAaz154(user.getOperatorId());
		return violationComplaintVO;
	}

	public ViolationComplaintVO breAuditPass(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-05:审批通过传入violationComplaintVO为空!");
		}
		UserContext user=BusinessContextUtils.getUserContext();
		violationComplaintVO.setAae011(user.getOperatorName());
		violationComplaintVO.setAaz154(user.getOperatorId());
		violationComplaintVO=this.getAuditComplaintBS().breAuditPass(violationComplaintVO);
		return violationComplaintVO;
	}

	public ViolationComplaintVO breAuditNotPass(ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503003VS-06:审批不通过传入violationComplaintVO为空!");
		}
		UserContext user=BusinessContextUtils.getUserContext();
		violationComplaintVO.setAae011(user.getOperatorName());
		violationComplaintVO.setAaz154(user.getOperatorId());
		violationComplaintVO=this.getAuditComplaintBS().breAuditNotPass(violationComplaintVO);
		return violationComplaintVO;
	}

	

}
