package com.wondersgroup.local.k2.f10201005.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd30DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd33DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd34DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.MedDeductPlanDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10201005.vo.MedDeductPlanVO;
import com.wondersgroup.local.k2.f10201005.vs.F10201005VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10201005VSImpl implements F10201005VS {
	
	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public MedDeductPlanVO saveMedDeductPlan(MedDeductPlanVO returnVO) {
		
		if(!StringTools.hasText(returnVO.getAaa027())){
			throw new BusinessException("F10201005VS-00:生成扣款计划传入aaa027为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAae002Str())){
			throw new BusinessException("F10201005VS-01:生成扣款计划传入aae002Str为空!");
		}
		
		UserContext userContext = BusinessContextUtils.getUserContext();
		
		Kd30DTO kd30Dto = new Kd30DTO();
		kd30Dto.setAae002(Integer.parseInt(returnVO.getAae002Str()));
		kd30Dto.setAaa027(returnVO.getAaa027());
		kd30Dto.setAae011(userContext.getOperatorName());
		kd30Dto.setAae036(DateTools.getSystemDate());
		kd30Dto.setBaz045(MedConstants.BAZ045_CODE_0);
		
		kd30Dto = this.getMedAuditBS().saveKd30(kd30Dto);
		
		if(!StringTools.hasText(kd30Dto.getBaz007())){
			throw new BusinessException("F10201005VS-02:保存扣款计划事件kd30失败!");
		}
		
		MedDeductPlanDTO medDeductPlanDto = new MedDeductPlanDTO();
		BeanTools.copyProperties(kd30Dto,medDeductPlanDto);
		
		this.getMedAuditBS().saveMedDeductPlan(medDeductPlanDto);
		
		BeanTools.copyProperties(kd30Dto, returnVO);
		
		return returnVO;
		
	}

	public Map<String, Object> queryMedDeductPlan(Page page, MedDeductPlanVO medDeductPlanVO) {
		
		if(medDeductPlanVO == null){
			throw new BusinessException("F10201005VS-03:分页查询扣款计划事件传入medDeductPlanVO为空!");
		}

		Kd30DTO queryDto = new Kd30DTO();
		
		BeanTools.copyProperties(medDeductPlanVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKd30WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryMedDeductHosPlan(Page page,	MedDeductPlanVO medDeductPlanVO) {
		
		if(!StringTools.hasText(medDeductPlanVO.getBaz007())){
			throw new BusinessException("F10201005VS-04:分页查询医院扣款汇总传入baz007为空!");
		}

		Kd33DTO queryDto = new Kd33DTO();
		
		BeanTools.copyProperties(medDeductPlanVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKd33WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryMedDeductDetailPlan(Page page, MedDeductPlanVO medDeductPlanVO) {
		
		if(!StringTools.hasText(medDeductPlanVO.getBaz008())){
			throw new BusinessException("F10201005VS-05:分页查询医院扣款汇总传入baz008为空!");
		}

		Kd34DTO queryDto = new Kd34DTO();
		
		BeanTools.copyProperties(medDeductPlanVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKd34WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}
	
}
