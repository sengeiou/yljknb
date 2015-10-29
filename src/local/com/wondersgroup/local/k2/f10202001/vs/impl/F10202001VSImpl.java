package com.wondersgroup.local.k2.f10202001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.util.DateUtils;
import com.wondersgroup.local.k2.f10202001.vo.MedAuditSummaryVO;
import com.wondersgroup.local.k2.f10202001.vs.F10202001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10202001VSImpl implements F10202001VS {

	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryHosMedCount(Page page,MedAuditSummaryVO medAuditSummaryVO) {
		
		if(medAuditSummaryVO == null){
			throw new BusinessException("F10202001VS-00:分页统计医疗机构单据信息传入medAuditSummaryVO为空!");
		}
		
		Kc63DTO queryDto = new Kc63DTO();
		
		BeanTools.copyProperties(medAuditSummaryVO,queryDto);
		
		if(StringTools.hasText(queryDto.getAc62Baz031())){
			queryDto.setAc62Exist(true);
			String[] str = new String[]{queryDto.getAc62Baz031()};
			queryDto.setAc62Baz031s(str);
		}else{
			queryDto.setAc62Exist(false);
		}
		
		Page result = this.getMedAuditBS().queryKc63HosMedCountWithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryHosMedDocument(Page page,MedAuditSummaryVO medAuditSummaryVO) {
		
		if(medAuditSummaryVO == null){
			throw new BusinessException("F10202001VS-01:分页查询医疗机构单据信息传入medAuditSummaryVO为空!");
		}
		
		Kc63DTO queryDto = new Kc63DTO();
		
		BeanTools.copyProperties(medAuditSummaryVO,queryDto);
		
		if(StringTools.hasText(medAuditSummaryVO.getStart())){
			queryDto.setAkc194Start(DateUtils.getDateFromYYYYMMDDString(medAuditSummaryVO.getStart()));
		}
		
		if(StringTools.hasText(medAuditSummaryVO.getEnd())){
			queryDto.setAkc194End(DateUtils.getDateFromYYYYMMDDString(medAuditSummaryVO.getEnd()));
		}
		
		if(StringTools.hasText(queryDto.getAc62Baz031())){
			queryDto.setAc62Exist(true);
			String[] str = new String[]{queryDto.getAc62Baz031()};
			queryDto.setAc62Baz031s(str);
		}else{
			queryDto.setAc62Exist(false);
		}
		
		Page result = this.getMedAuditBS().queryKc63WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryHosMedDocumentDetail(Page page,	MedAuditSummaryVO medAuditSummaryVO) {
		
		if(medAuditSummaryVO == null){
			throw new BusinessException("F10202001VS-02:分页查询违规单据明细统计信息传入medAuditSummaryVO为空!");
		}

		Kc62DTO queryDto = new Kc62DTO();
		
		BeanTools.copyProperties(medAuditSummaryVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc62WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
	}
	
}
