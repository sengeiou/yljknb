package com.wondersgroup.local.k5.f10503004.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503004.vs.F10503004VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10503004VSImpl implements F10503004VS {

	private AuditComplaintBS auditComplaintBS;
	
	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}

	public Map<String, Object> queryBreAuditCount(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503004VS-01:统计申诉情况传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryBreAuditCount(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryOrgAuditCount(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503004VS-02:统计医疗机构申诉情况传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryOrgAuditCount(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryDoctorAuditCount(Page page,
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503004VS-03:统计医师申诉情况传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryDoctorAuditCount(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	
	

}
