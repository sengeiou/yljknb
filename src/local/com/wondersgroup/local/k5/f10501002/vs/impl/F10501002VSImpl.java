package com.wondersgroup.local.k5.f10501002.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.medicarecostaudit.MedConstants;
import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10501002.vo.AppealVO;
import com.wondersgroup.local.k5.f10501002.vo.MedDocumentAppealVO;
import com.wondersgroup.local.k5.f10501002.vs.F10501002VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10501002VSImpl implements F10501002VS {
	
	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryAppealMedDocument(Page page,
			MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-00:分页查询申诉违规单据统计信息传入medDocumentAppealVO为空!");
		}
		
		Kc63DTO queryDto = new Kc63DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		queryDto.setAc62Exist(true);
		
		if(StringTools.hasText(queryDto.getAc62Baz031())){
			String[] str = new String[]{queryDto.getAc62Baz031()};
			queryDto.setAc62Baz031s(str);
		}else{
			String[] str = new String[]{MedConstants.BAZ031_CODE_12,MedConstants.BAZ031_CODE_08,MedConstants.BAZ031_CODE_09};
			queryDto.setAc62Baz031s(str);
		}
		
		Page result = this.getMedAuditBS().queryKc63WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryAppealMedDocumentDetail(Page page,
			MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-01:分页查询申诉违规单据明细统计信息传入medDocumentVO为空!");
		}

		Kc62DTO queryDto = new Kc62DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc62WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryAppealMedDocumentDetailIllegal(Page page,MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-02:分页查询申诉单据明细违规信息传入medDocumentAppealVO为空!");
		}

		Kc72DTO queryDto = new Kc72DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc72WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryAppealMedDocumentIllegal(Page page,MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-03:分页查询申诉单据违规信息传入medDocumentAppealVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc73WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	@SuppressWarnings("unchecked")
	public AppealVO appealMedDocDetail(AppealVO returnVO) {
		
		if(!StringTools.hasText(returnVO.getMedDetailListStr())){
			throw new BusinessException("F10501002VS-04:申诉单据明细信息传入medDetailListStr为空!");
		}
		if(!StringTools.hasText(returnVO.getBaz033())){
			throw new BusinessException("F10501002VS-05:申诉单据明细信息传入违规类型baz033为空!");
		}
		
		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();
		
		List<Kc62DTO> kc62Dtos = VOUtils.getBeanListFromJsonData(returnVO.getMedDetailListStr(), Kc62DTO.class);
		
		Kc81DTO queryDto = new Kc81DTO();
		Kc81DTO kc81Dto = new Kc81DTO();
		//审核单据明细
		for(Kc62DTO kc62Dto: kc62Dtos ){
			
			queryDto.setBaz001(kc62Dto.getBaz001());
			queryDto.setBaz003(kc62Dto.getBaz003());
			queryDto.setAae100(AuditConstants.AAE100_CODE_1);
			queryDto.setBaz033(returnVO.getBaz033());
			
			
			if(!MedConstants.BAZ031_CODE_09.equals(kc62Dto.getBaz031())){
				throw new BusinessException("F10501002VS-09:直接扣款状态的明细才能申诉复议!");
			}
			
			List<Kc81DTO> kc81Dtos = this.getMedAuditBS().queryKc81Info(queryDto);
			if(CollectionUtils.isNotEmpty(kc81Dtos)){
				for(Kc81DTO kc81:kc81Dtos){
					kc81.setAae100(AuditConstants.AAE100_CODE_0);
					this.getMedAuditBS().updateKc81(kc81);
					kc81Dto.setBae041(kc81.getBae041());
					kc81Dto.setBaz041(kc81.getBaz041());
				}
			}
			
			BeanTools.copyProperties(kc62Dto, kc81Dto);
			kc81Dto.setBaz021(returnVO.getBaz021());
			kc81Dto.setBaz031(returnVO.getBaz031());
			kc81Dto.setBaz033(returnVO.getBaz033());
			kc81Dto.setBaz025(MedConstants.BAZ025_CODE_2);
			kc81Dto.setAae100(AuditConstants.AAE100_CODE_1);
			kc81Dto.setBaz023(new Date());
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
			kc81Dto.setBaz022(aae011);
			this.getMedAuditBS().saveKc81(kc81Dto);
			
			//同步单据明细审核状态
			Kc62DTO kc62 = 	this.getMedAuditBS().getKc62ById(kc62Dto.getBaz003());
			kc62.setBaz031(returnVO.getBaz031());
			this.getMedAuditBS().updateKc62(kc62);
			
		}
		
		return returnVO;
		
	}

	public MedDocumentAppealVO queryAppealMedDocumentDetailIllegal(MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-06:查询单据明细违规信息传入medDocumentAppealVO为空!");
		}

		Kc63DTO kc63Dto = this.getMedAuditBS().getKc63ById(medDocumentAppealVO.getBaz001());
		
		if(!StringTools.hasText(kc63Dto.getBaz001())){
			throw new BusinessException("F10501002VS-10:没有查询到违规单据信息!");
		}
		
		Kc72DTO queryDto = new Kc72DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		List<Kc72DTO> kc72List = this.getMedAuditBS().queryKc72(queryDto);
		
		BeanTools.copyProperties(kc63Dto, medDocumentAppealVO);
		
		medDocumentAppealVO.setKc72List(kc72List);
		
		return medDocumentAppealVO;
		
	}

	public MedDocumentAppealVO queryAppealMedDocumentIllegal(MedDocumentAppealVO medDocumentAppealVO) {
		
		if(medDocumentAppealVO == null){
			throw new BusinessException("F10501002VS-07:查询单据违规信息传入medDocumentAppealVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();
		
		BeanTools.copyProperties(medDocumentAppealVO,queryDto);
		
		List<Kc73DTO> kc73List = this.getMedAuditBS().queryKc73(queryDto);
		
		medDocumentAppealVO.setKc73List(kc73List);
		
		return medDocumentAppealVO;
		
	}

}
