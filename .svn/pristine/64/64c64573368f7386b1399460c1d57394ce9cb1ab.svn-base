package com.wondersgroup.local.k2.f10201002.vs.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc24DTO;
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
import com.wondersgroup.framework.core5.util.ModelUtils;
import com.wondersgroup.local.k2.f10201002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10201002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10201002.vs.F10201002VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10201002VSImpl implements F10201002VS {

	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public Map<String, Object> queryMedDocument(Page page,
			MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getMedAuditBS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);

	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-01:分页查询违规单据明细统计信息传入medDocumentVO为空!");
		}

		Kc62DTO queryDto = new Kc62DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getMedAuditBS().queryKc62WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedDocumentDetailIllegal(Page page,
			MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-02:分页查询单据明细违规信息传入medDocumentVO为空!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getMedAuditBS().queryKc72WithPage(page, queryDto);

		return GridUtils.getGridData(result);

	}

	public Map<String, Object> queryMedDocumentIllegal(Page page,
			MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-03:分页查询单据违规信息传入medDocumentVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getMedAuditBS().queryKc73WithPage(page, queryDto);

		return GridUtils.getGridData(result);

	}

	@SuppressWarnings("unchecked")
	public PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO) {

		if (!StringTools.hasText(returnVO.getMedDetailListStr())) {
			throw new BusinessException(
					"F10201002VS-04:审核单据明细信息传入medDetailListStr为空!");
		}
		if (!StringTools.hasText(returnVO.getBaz033())) {
			throw new BusinessException(
					"F10201002VS-05:审核单据明细信息传入违规类型baz033为空!");
		}

		UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();

		List<Kc62DTO> kc62Dtos = VOUtils.getBeanListFromJsonData(returnVO
				.getMedDetailListStr(), Kc62DTO.class);

		Kc81DTO queryDto = new Kc81DTO();
		Kc81DTO kc81Dto = new Kc81DTO();
		// 审核单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {

			queryDto.setBaz001(kc62Dto.getBaz001());
			queryDto.setBaz003(kc62Dto.getBaz003());
			queryDto.setAae100(AuditConstants.AAE100_CODE_1);
			queryDto.setBaz033(returnVO.getBaz033());

			if (MedConstants.BAZ031_CODE_01.equals(returnVO.getBaz031())) {
				if (!MedConstants.BAZ031_CODE_04.equals(kc62Dto.getBaz031())) {
					throw new BusinessException(
							"F10201002VS-10:人工初审状态的明细才能设置为正常!");
				}
			} else if (MedConstants.BAZ031_CODE_05.equals(returnVO.getBaz031())) {
				if (!MedConstants.BAZ031_CODE_01.equals(kc62Dto.getBaz031())
						&& !MedConstants.BAZ031_CODE_04.equals(kc62Dto
								.getBaz031())) {
					throw new BusinessException(
							"F10201002VS-11:人工初审和正常的明细才能送核查!");
				}
			} else if (MedConstants.BAZ031_CODE_07.equals(returnVO.getBaz031())) {
				if (!MedConstants.BAZ031_CODE_01.equals(kc62Dto.getBaz031())
						&& !MedConstants.BAZ031_CODE_04.equals(kc62Dto
								.getBaz031())) {
					throw new BusinessException(
							"F10201002VS-12:人工初审和正常的明细才能送复审!");
				}
			} else if (MedConstants.BAZ031_CODE_09.equals(returnVO.getBaz031())) {
				if (!MedConstants.BAZ031_CODE_01.equals(kc62Dto.getBaz031())
						&& !MedConstants.BAZ031_CODE_04.equals(kc62Dto
								.getBaz031())) {
					throw new BusinessException(
							"F10201002VS-13:人工初审和正常的明细才能直接扣款!");
				}
			}

			List<Kc81DTO> kc81Dtos = this.getMedAuditBS().queryKc81Info(
					queryDto);
			if (CollectionUtils.isNotEmpty(kc81Dtos)) {
				for (Kc81DTO kc81 : kc81Dtos) {
					kc81.setAae100(AuditConstants.AAE100_CODE_0);
					this.getMedAuditBS().updateKc81(kc81);
					kc81Dto.setBae041(kc81.getBae041());
				}
			}

			BeanTools.copyProperties(kc62Dto, kc81Dto);
			kc81Dto.setBaz021(returnVO.getBaz021());
			kc81Dto.setBaz031(returnVO.getBaz031());
			kc81Dto.setBaz033(returnVO.getBaz033());
			if (returnVO.getBae041() != null) {
				kc81Dto.setBae041(returnVO.getBae041());
			}
			kc81Dto.setBaz025(MedConstants.BAZ025_CODE_2);
			kc81Dto.setAae100(AuditConstants.AAE100_CODE_1);
			kc81Dto.setBaz023(new Date());
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
			kc81Dto.setBaz022(aae011);
			if (returnVO.getDeductAllFlag()) {
				kc81Dto.setBaz041(kc62Dto.getAkb065());
			} else {
				if (returnVO.getBaz041() > kc62Dto.getAkb065()) {
					throw new BusinessException(
							"F10201002VS-06:扣除金额大于单据明细金额!单据明细编号:"
									+ kc62Dto.getBaz003());
				}
				kc81Dto.setBaz041(returnVO.getBaz041());
			}
			this.getMedAuditBS().saveKc81(kc81Dto);

			// 同步单据明细审核状态
			Kc62DTO kc62 = this.getMedAuditBS()
					.getKc62ById(kc62Dto.getBaz003());
			kc62.setBaz031(returnVO.getBaz031());
			if (MedConstants.BAZ031_CODE_01.equals(returnVO.getBaz031())) {
				kc62.setBaz032(MedConstants.BAZ032_CODE_0);
			} else {
				kc62.setBaz032(MedConstants.BAZ032_CODE_1);
			}
			this.getMedAuditBS().updateKc62(kc62);

		}

		return returnVO;

	}

	public List<PreCheckVO> queryCheckRecordByBaz003(String baz003) {

		if (!StringTools.hasText(baz003)) {
			throw new BusinessException("F10201002VS-07:查询违规明细审核记录传入baz003为空!");
		}

		List<PreCheckVO> checkList = new ArrayList<PreCheckVO>();

		Kc81DTO queryDto = new Kc81DTO();
		queryDto.setBaz003(baz003);

		List<Kc81DTO> kc81List = this.getMedAuditBS().queryKc81Info(queryDto);

		if (CollectionUtils.isNotEmpty(kc81List)) {
			checkList = ModelUtils.copyAs(kc81List, PreCheckVO.class);
		}

		for (PreCheckVO checkVO : checkList) {
			checkVO.setBaz023Str(DateTools.getYYYYMMDD(checkVO.getBaz023()));
			checkVO.setBaz041Str("[扣款金额:" + checkVO.getBaz041() + "]");
			if (checkVO.getBae041() != null) {
				checkVO.setBae041Str("[医师扣分:" + checkVO.getBae041() + "分]");
			} else {
				checkVO.setBae041Str("[医师扣分:0分]");
			}
		}

		return checkList;
	}

	public MedDocumentVO queryMedDocumentDetailIllegal(
			MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-08:查询单据明细违规信息传入medDocumentVO为空!");
		}

		Kc63DTO kc63Dto = this.getMedAuditBS().getKc63ById(
				medDocumentVO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10201002VS-10:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		List<Kc72DTO> kc72List = this.getMedAuditBS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, medDocumentVO);

		medDocumentVO.setKc72List(kc72List);

		return medDocumentVO;

	}

	public MedDocumentVO queryMedDocumentIllegal(MedDocumentVO medDocumentVO) {

		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10201002VS-09:查询单据违规信息传入medDocumentVO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		List<Kc73DTO> kc73List = this.getMedAuditBS().queryKc73(queryDto);

		medDocumentVO.setKc73List(kc73List);

		return medDocumentVO;

	}

	public MedDocumentVO queryMedVisitInfo(MedDocumentVO resultVO) {

		if (!StringTools.hasText(resultVO.getAaz308())) {
			throw new BusinessException("F10201002VS-14:查询就诊信息传入aaz308为空!");
		}

		if (!StringTools.hasText(resultVO.getAaz217())) {
			throw new BusinessException("F10201002VS-15:查询就诊信息传入aaz217为空!");
		}
		Kc24DTO kc24Dto = this.getMedAuditBS().getKc24ById( resultVO.getAaz217());
		if (!StringTools.hasText(kc24Dto.getAaz308())) {

			throw new BusinessException("F10201002VS-16:没有查询到结算信息Kc24!");
		} else {
			if(kc24Dto.getAkc194() != null){
				kc24Dto.setAkc194Str(DateTools.getYYYYMMDD(kc24Dto.getAkc194()));
			}
			resultVO.setKc24(kc24Dto);
		}

		Kc21DTO queryDto = new Kc21DTO();
	//	queryDto.setAaz370(resultVO.getAaz370());
		queryDto.setAaz217(resultVO.getAaz217());
		List<Kc21DTO> kc21List = this.getMedAuditBS().queryKc21Info(queryDto);
		if (CollectionUtils.isEmpty(kc21List)) {
			throw new BusinessException("F10201002VS-17:没有查询到就诊信息Kc21!");
		} else {
			resultVO.setKc21(kc21List.get(0));
		}

		return resultVO;
		
	}

}
