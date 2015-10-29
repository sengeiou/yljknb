package com.wondersgroup.local.k2.f10201003.vs.impl;

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
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke01DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10201003.vo.MedDocumentCheckVO;
import com.wondersgroup.local.k2.f10201003.vo.MedInteractiveVO;
import com.wondersgroup.local.k2.f10201003.vo.ReCheckVO;
import com.wondersgroup.local.k2.f10201003.vo.TalkVO;
import com.wondersgroup.local.k2.f10201003.vs.F10201003VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10201003VSImpl implements F10201003VS {
	
	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryCheckMedDocument(Page page,
			MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}
		
		Kc63DTO queryDto = new Kc63DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		queryDto.setAc62Exist(true);
		
		if(StringTools.hasText(queryDto.getAc62Baz031())){
			String[] str = new String[]{queryDto.getAc62Baz031()};
			queryDto.setAc62Baz031s(str);
		}else{
			String[] str = new String[]{MedConstants.BAZ031_CODE_05,MedConstants.BAZ031_CODE_06,MedConstants.BAZ031_CODE_07};
			queryDto.setAc62Baz031s(str);
		}
		
		Page result = this.getMedAuditBS().queryKc63WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}

	public Map<String, Object> queryCheckMedDocumentDetail(Page page,
			MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-01:分页查询违规单据明细统计信息传入medDocumentVO为空!");
		}

		Kc62DTO queryDto = new Kc62DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc62WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryCheckMedDocumentDetailIllegal(Page page,MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-02:分页查询单据明细违规信息传入medDocumentVO为空!");
		}

		Kc72DTO queryDto = new Kc72DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc72WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}
	
    public MedDocumentCheckVO queryCheckMedDocumentDetailIllegal(MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-12:查询单据明细违规信息传入medDocumentVO为空!");
		}
		
        Kc63DTO kc63Dto = this.getMedAuditBS().getKc63ById(medDocumentCheckVO.getBaz001());
		
		if(!StringTools.hasText(kc63Dto.getBaz001())){
			throw new BusinessException("F10201003VS-14:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		List<Kc72DTO> kc72List = this.getMedAuditBS().queryKc72(queryDto);
		
		BeanTools.copyProperties(kc63Dto, medDocumentCheckVO);
		
		medDocumentCheckVO.setKc72List(kc72List);
		
		return medDocumentCheckVO;
		
	}

	public Map<String, Object> queryCheckMedDocumentIllegal(Page page,MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-03:分页查询单据违规信息传入medDocumentVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		Page result = this.getMedAuditBS().queryKc73WithPage(page, queryDto);
		
		return GridUtils.getGridData(result);
		
	}
	
    public MedDocumentCheckVO queryCheckMedDocumentIllegal(MedDocumentCheckVO medDocumentCheckVO) {
		
		if(medDocumentCheckVO == null){
			throw new BusinessException("F10201003VS-11:查询单据违规信息传入medDocumentVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();
		
		BeanTools.copyProperties(medDocumentCheckVO,queryDto);
		
		List<Kc73DTO> kc73List = this.getMedAuditBS().queryKc73(queryDto);
		
		medDocumentCheckVO.setKc73List(kc73List);
		
		return medDocumentCheckVO;
		
	}

	@SuppressWarnings("unchecked")
	public ReCheckVO reCheckMedDocDetail(ReCheckVO returnVO) {
		
		if(!StringTools.hasText(returnVO.getMedDetailListStr())){
			throw new BusinessException("F10201003VS-04:审核单据明细信息传入medDetailListStr为空!");
		}
		if(!StringTools.hasText(returnVO.getBaz033())){
			throw new BusinessException("F10201003VS-05:审核单据明细信息传入违规类型baz033为空!");
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
			
			if(MedConstants.BAZ031_CODE_01.equals(returnVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_06.equals(kc62Dto.getBaz031()) && !MedConstants.BAZ031_CODE_07.equals(kc62Dto.getBaz031())){
					throw new BusinessException("F10201003VS-11:送复审和医院送复审状态的明细才能设置为正常!");
				}
			}else if(MedConstants.BAZ031_CODE_09.equals(returnVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_06.equals(kc62Dto.getBaz031()) && !MedConstants.BAZ031_CODE_07.equals(kc62Dto.getBaz031())){
					throw new BusinessException("F10201003VS-12:送复审和医院送复审状态的明细才能直接扣款!");
				}
			}else if(MedConstants.BAZ031_CODE_10.equals(returnVO.getBaz031())){
				if(!MedConstants.BAZ031_CODE_06.equals(kc62Dto.getBaz031()) && !MedConstants.BAZ031_CODE_07.equals(kc62Dto.getBaz031())){
					throw new BusinessException("F10201003VS-13:送复审和医院送复审状态的明细才能送稽核!");
				}
			}
			
			List<Kc81DTO> kc81Dtos = this.getMedAuditBS().queryKc81Info(queryDto);
			if(CollectionUtils.isNotEmpty(kc81Dtos)){
				for(Kc81DTO kc81:kc81Dtos){
					kc81.setAae100(AuditConstants.AAE100_CODE_0);
					this.getMedAuditBS().updateKc81(kc81);
					kc81Dto.setBae041(kc81.getBae041());
				}
			}
			
			
			BeanTools.copyProperties(kc62Dto, kc81Dto);
			kc81Dto.setBaz021(returnVO.getBaz021());
			kc81Dto.setBaz031(returnVO.getBaz031());
			kc81Dto.setBaz033(returnVO.getBaz033());
			if(returnVO.getBae041() != null){
				kc81Dto.setBae041(returnVO.getBae041());
			}
			kc81Dto.setBaz025(MedConstants.BAZ025_CODE_2);
			kc81Dto.setAae100(AuditConstants.AAE100_CODE_1);
			kc81Dto.setBaz023(new Date());
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
			kc81Dto.setBaz022(aae011);
			if(returnVO.getDeductAllFlag()){
				kc81Dto.setBaz041(kc62Dto.getAkb065());
			}else{
				if(returnVO.getBaz041() > kc62Dto.getAkb065()){
					throw new BusinessException("F10201003VS-06:扣除金额大于单据明细金额!单据明细编号:"+kc62Dto.getBaz003());
				}
				kc81Dto.setBaz041(returnVO.getBaz041());
			}
			this.getMedAuditBS().saveKc81(kc81Dto);
			
			//同步单据明细审核状态
			Kc62DTO kc62 = 	this.getMedAuditBS().getKc62ById(kc62Dto.getBaz003());
			kc62.setBaz031(returnVO.getBaz031());
			if(MedConstants.BAZ031_CODE_01.equals(returnVO.getBaz031())){
				kc62.setBaz032(MedConstants.BAZ032_CODE_0);
			}else{
				kc62.setBaz032(MedConstants.BAZ032_CODE_1);
			}
			this.getMedAuditBS().updateKc62(kc62);
			
		}
		
		return returnVO;
		
	}

	public MedInteractiveVO queryMedInteractiveInfo(MedInteractiveVO returnVO) {
		
		if(!StringTools.hasText(returnVO.getBaz003())){
			throw new BusinessException("F10201003VS-07:查询交互列表传入baz003为空!");
		}
		
		Ke01DTO queryDto = new Ke01DTO();
		BeanTools.copyProperties(returnVO, queryDto);
		
		List<Ke01DTO> ke01List = this.getMedAuditBS().queryKe01Info(queryDto);
		
		if(CollectionUtils.isNotEmpty(ke01List)){
			returnVO.setTalkList(ke01List);
		}
		
		return returnVO;
	}

	public TalkVO saveInteractiveInfo(TalkVO resultVO) {
		
		if(!StringTools.hasText(resultVO.getBaz003())){
			throw new BusinessException("F10201003VS-08:保存交互信息传入baz003为空!");
		}
		
		UserContext userContext = BusinessContextUtils.getUserContext();
		
		String aae011 = userContext.getOperatorName();
		
		Kc81DTO queryDto = new Kc81DTO();
		queryDto.setBaz003(resultVO.getBaz003());
		queryDto.setAae100(AuditConstants.AAE100_CODE_1);
		
		List<Kc81DTO> kc81List = this.getMedAuditBS().queryKc81Info(queryDto);
		
		if(CollectionUtils.isNotEmpty(kc81List)){
			if(kc81List.size() > 1){
				throw new BusinessException("F10201003VS-09:该违规明细存在多条当前有效审核记录!");
			}else{
				resultVO.setBaz005(kc81List.get(0).getBaz005());
				resultVO.setBaz001(kc81List.get(0).getBaz001());
			}
		}else{
			throw new BusinessException("F10201003VS-10:该违规明细没有对应的当前有效审核记录!");
		}
		
		Kc63DTO kc63Dto = this.getMedAuditBS().getKc63ById(resultVO.getBaz001());
		
		Ke01DTO ke01Dto = new Ke01DTO();
		BeanTools.copyProperties(resultVO, ke01Dto);
		ke01Dto.setBaz038(aae011);
		Date date = new Date();
		ke01Dto.setBaz039(date);
		ke01Dto.setAkb020(kc63Dto.getAkb020());
		ke01Dto = this.getMedAuditBS().saveKe01(ke01Dto);
		
		BeanTools.copyProperties(ke01Dto, resultVO);
		
		return resultVO;
		
	}

}
