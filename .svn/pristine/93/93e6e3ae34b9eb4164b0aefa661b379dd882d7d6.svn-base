package com.wondersgroup.local.k5.f10503001.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503001.vs.F10503001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10503001VSImpl implements F10503001VS {

	private AuditComplaintBS auditComplaintBS;
	
	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}

	public Map<String, Object> queryOrgDoubtList(Page page,
			ViolationComplaintVO violationComplaintVO) {
		
		if(violationComplaintVO == null){
			throw new BusinessException("F10503001VS-00:分页查询当前医疗机构申诉信息传入violationComplaintVO为空!");
		}
		Af73DTO queryDto=new Af73DTO();
		
		BeanTools.copyProperties(violationComplaintVO,queryDto);
		
		Page result=this.getAuditComplaintBS().queryOrgDoubtList(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public ViolationComplaintVO toOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503001VS-01:跳转申诉信息传入violationComplaintVO为空!");
		}
		violationComplaintVO=this.getAuditComplaintBS().findVioComp(violationComplaintVO);
		UserContext user=BusinessContextUtils.getUserContext();
		violationComplaintVO.setApe711(new Date());
		violationComplaintVO.setApe008(user.getOperatorName());
		violationComplaintVO.setAaa027("330299");
		return violationComplaintVO;
	}

	public ViolationComplaintVO consentBreach(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503001VS-02:同意违规传入violationComplaintVO为空!");
		}
		violationComplaintVO=this.getAuditComplaintBS().consentBreach(violationComplaintVO);
		return violationComplaintVO;
	}

	public ViolationComplaintVO saveOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503001VS-03:保存当前申诉信息传入violationComplaintVO为空!");
		}
		violationComplaintVO=this.getAuditComplaintBS().saveOrgVioCompReg(violationComplaintVO);
		return violationComplaintVO;
	}

	public Af31DTO getPersonAuditInfoAndBaseInfo(String aaz077) {
		if(aaz077 == null||"".equals(aaz077)){
			throw new BusinessException("F10503001VS-04:查询案件信息传入aaz077为空!");
		}
		Af31DTO resultVO=this.getAuditComplaintBS().getPersonAuditInfoAndBaseInfo(aaz077);
		return resultVO;
	}

	public ViolationComplaintVO addOrgVioCompReg(ViolationComplaintVO violationComplaintVO) {
		if(violationComplaintVO == null){
			throw new BusinessException("F10503001VS-05:保存当前申诉信息传入violationComplaintVO为空!");
		}
		violationComplaintVO=this.getAuditComplaintBS().addOrgVioCompReg(violationComplaintVO);
		return violationComplaintVO;
	}

}
