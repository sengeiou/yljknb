package com.wondersgroup.local.k3.f10301003.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k3.f10301003.vo.AuditCaseDetailsVO;
import com.wondersgroup.local.k3.f10301003.vo.BeAuditTargetInfoVO;
import com.wondersgroup.local.k3.f10301003.vo.InsuredPersonInfoVO;
import com.wondersgroup.local.k3.f10301003.vo.MedicalMechanismVO;
import com.wondersgroup.local.k3.f10301003.vo.PhysicianVO;
import com.wondersgroup.local.k3.f10301003.vs.F10301003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301003VSImpl implements F10301003VS{
	
	private AdminDisposalBS adminDisposalBS;
	
	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public Map<String, Object> queryAuditCaseDetailsWithPage(Page page,AuditCaseDetailsVO auditCaseDetailsVO) {
		
		Page result = this.getAdminDisposalBS().queryAuditCaseDetailsWithPage(page, auditCaseDetailsVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAae034() != 0){
				
				String str = String.valueOf(af53Dto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAae034s(aae034s);
			}
			
			if(af53Dto.getAbb025() != 0){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryBeAuditTargetInfoById(Page page , String aaz318) {
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301003VS-01：根据aaz318查询被稽核对象，aaz318为空!");
		}
		
		BeAuditTargetInfoVO returnVO = new BeAuditTargetInfoVO();
		if(aaz318 != null){
			returnVO.setAaz318(Long.valueOf(aaz318));
		}
		
		Page result = this.getAdminDisposalBS().queryAf31WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public AuditCaseDetailsVO updateAuditCaseDetails(AuditCaseDetailsVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301003VS-02:修改的时候 案件對象 resultVO 参数为空!");
		}
		
		if(returnVO.getAaz318() == null){
			throw new BusinessException("F10301003VS-03:修改的时候 传入案件主鍵 318为空!");
		}
		
		Af53DTO af53DTO = this.getAdminDisposalBS().getAf53ById(String.valueOf(returnVO.getAaz318()));
		
		//aae426 1(立案待确认) 2(不予立案) 3(立案待查) 4(已结案) 5(案件撤销)
		if(AuditConstants.AAE426_CODE_2.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301003VS-08:案件状态已被其他管理员否决，不予立案!");
		}
		
		if(AuditConstants.AAE426_CODE_3.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301003VS-09:案件状态已被其他管理员立案待查!");
		}
		
		if(AuditConstants.AAE426_CODE_4.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301003VS-10:案件状态，已结案!");
		}
		
		if(AuditConstants.AAE426_CODE_5.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301003VS-10:案件状态，已撤销!");
		}
		
		if(returnVO.getAae034() == null || returnVO.getAae034() == 0){
			String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
			af53DTO.setAae034(Integer.valueOf(str));//设置日期
		}else{
			af53DTO.setAae034(returnVO.getAae034());
		}
		
		String aae012 = BusinessContextUtils.getUserContext().getOperatorName();//获取 当前操作人
		
		af53DTO.setAae012(aae012);//设置操作人
		
		BeanTools.copyPropertiesIgnoreNull(returnVO,af53DTO);
		
		af53DTO = this.getAdminDisposalBS().updateAf53(af53DTO);
		
		return returnVO;
	}

	public AuditCaseDetailsVO queryAuditCaseDetailsById(String aaz318) {
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301003VS-04:根據逐漸查詢af53對象，傳入參數，主鍵aaz318為空!");
		}
		
		AuditCaseDetailsVO returnVO = new AuditCaseDetailsVO();
		
		Af53DTO af53DTO = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af53DTO != null){
			BeanTools.copyProperties(af53DTO,returnVO);
		}
		
		return returnVO;
	}

	public InsuredPersonInfoVO queryInsuredPersonById(String aaz010) {
		
		if(!StringTools.hasText(aaz010)){
			throw new BusinessException("F10301003VS-05:根據逐漸查詢ac01對象，傳入參數，主鍵aaz077為空!");
		}
		
		InsuredPersonInfoVO returnVO = new InsuredPersonInfoVO();
		
		returnVO.setAac001(aaz010);
		//Ac01DTO ac01Dto = this.getAdminDisposalBS().getAc01ById(aaz010);
		Ac01DTO ac01Dto = this.getAdminDisposalBS().getAc01Dto(returnVO);
		
		if(ac01Dto != null){
			
			if(ac01Dto.getAac006() != 0){
				
				String str = String.valueOf(ac01Dto.getAac006());
				
				Date aac006s = DateTools.parseDate(str, "yyyyMMdd");
				
				ac01Dto.setAac006s(aac006s);
			}
			
			/*if(ac01Dto.getAac049() != 0){
				
				String str = String.valueOf(ac01Dto.getAac049());
				
				Date aac049s = DateTools.parseDate(str, "yyyyMM");
				
				ac01Dto.setAac049s(aac049s);
			}*/
			
			BeanTools.copyProperties(ac01Dto, returnVO);
		}
		
		return returnVO;
	}

	public PhysicianVO queryPhysicianById(String aaz010) {
		
		if(!StringTools.hasText(aaz010)){
			throw new BusinessException("F10301003VS-06:根據逐漸查詢kf05對象，傳入參數，主鍵aaz010為空!");
		}
		
		PhysicianVO returnVO = new PhysicianVO();
		
		Kf05DTO kf05Dto = this.getAdminDisposalBS().getKf05ByAaz027(aaz010);
		
		if(kf05Dto != null){
			BeanTools.copyProperties(kf05Dto, returnVO);
		}
		
		return returnVO;
	}

	public MedicalMechanismVO queryMedicalMechanismById(String aaz010) {
		
		if(!StringTools.hasText(aaz010)){
			throw new BusinessException("F10301003VS-07:根據逐漸查詢kb01對象，傳入參數，主鍵aaz010為空!");
		}
		
		MedicalMechanismVO returnVO = new MedicalMechanismVO();
		
		Kb01DTO kb01Dto = this.getAdminDisposalBS().getkb01ByAaz107(aaz010);
		
		if(kb01Dto != null){
			BeanTools.copyProperties(kb01Dto, returnVO);
		}
		
		return returnVO;
	}
}
