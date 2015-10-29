package com.wondersgroup.local.k5.f10503002.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503002.vs.F10503002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10503002VSImpl implements F10503002VS {

	private AuditComplaintBS auditComplaintBS;
	
	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}

	public Map<String, Object> toOrgBreCompQuery(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503002VS-01:查询申诉信息传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().toOrgBreCompQuery(page,queryDto);
		
		return GridUtils.getGridData(result);
	}
	

	public Map<String, Object> queryBreAuditDetail(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503002VS-02:查询申诉信息详细传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryBreAuditDetail(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	

	

	

}
