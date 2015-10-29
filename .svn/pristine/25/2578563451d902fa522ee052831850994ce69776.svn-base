package com.wondersgroup.local.common.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af30DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka06DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.common.vo.AuditCaseVO;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.common.vo.DiseaseVO;
import com.wondersgroup.local.common.vo.DoctorVO;
import com.wondersgroup.local.common.vo.GzSummaryVO;
import com.wondersgroup.local.common.vo.InsuPersonVO;
import com.wondersgroup.local.common.vo.MedInstitutionVO;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.common.vo.SickLeverVO;
import com.wondersgroup.local.common.vo.SurveyRecordVO;
import com.wondersgroup.local.common.vs.CommonVS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class CommonVSImpl implements CommonVS {

	private AdminDisposalBS adminDisposalBS;

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public Map<String, Object> queryDoctorObjWithPage(Page page,
			DoctorVO doctorVO) {

		Page result = this.getAdminDisposalBS().queryKf05WithPage(page,
				doctorVO);

		return GridUtils.getGridData(result);

	}

	public Map<String, Object> queryInsuPersonObjWithPage(Page page,
			InsuPersonVO insuPersonVO) {

		Ac01DTO queryDto = new Ac01DTO();

		BeanTools.copyProperties(insuPersonVO, queryDto);

		Page result = this.getAdminDisposalBS().queryAc01WithPage(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedInstitutionObjWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {

		Kb01DTO queryDto = new Kb01DTO();

		BeanTools.copyProperties(medInstitutionVO, queryDto);

		Page result = this.getAdminDisposalBS().queryKb01WithPage(page,
				queryDto);

		return GridUtils.getGridData(result);
	}

	// 分页
	public Map<String, Object> queryAuditCaseWithPage(Page page,
			AuditCaseVO returnVO) {

		returnVO.setAae426(AuditConstants.AAE426_CODE_3);

		Page result = this.getAdminDisposalBS().queryAf53WithPage(page,
				returnVO);

		for (int i = 0; i < result.getResult().size(); i++) {

			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);

			if (af53Dto.getAbb025() != 0 && af53Dto.getAae034() != null) {

				String str = String.valueOf(af53Dto.getAbb025());

				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");

				af53Dto.setAbb025s(abb025s);
			}

			if (af53Dto.getAae034() != null && af53Dto.getAae034() != 0) {

				String str = String.valueOf(af53Dto.getAae034());

				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");

				af53Dto.setAae034s(aae034s);
			}
		}

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	// 查询一个对象
	public AuditCaseVO queryAuditCaseDetailsById(String aaz318) {

		if (!StringTools.hasText(aaz318)) {
			throw new BusinessException(
					"CommonVSImpl：根据aaz318查询对案件  af53 详情，aaz318为空!");
		}

		AuditCaseVO returnVO = new AuditCaseVO();

		Af53DTO af53DTO = this.getAdminDisposalBS().getAf53ById(aaz318);

		if (af53DTO == null) {
			throw new BusinessException("CommonVSImpl:根據逐漸查詢af53對象失敗!");
		}

		if (af53DTO.getAae034() != null) {

			String str = String.valueOf(af53DTO.getAae034());

			Date aae034s = DateTools.parseDate(str, "yyyyMMdd");

			af53DTO.setAae034s(aae034s);
		}

		return returnVO;
	}

	// 分页
	public Map<String, Object> queryBeAuditInfo(Page page,
			BeAuditTargetVO returnVO) {

		Page result = this.getAdminDisposalBS().queryAf31WithPage(page,
				returnVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	// 详情
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077) {

		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException(
					"CommonVSImpl:根據主键查詢被稽核对象     af31 详情 ，傳入參數，主鍵aaz077為空!");
		}

		BeAuditTargetVO returnVO = new BeAuditTargetVO();

		Af31DTO af31Dto = getAdminDisposalBS().getAf31ById(aaz077);
		//Af31DTO af31Dto = getAdminDisposalBS().getAf31ByAaz077(aaz077);

		if (af31Dto == null) {
			throw new BusinessException("CommonVSImpl:根據主键aaz077查詢af31對象为空!");
		}
		BeanTools.copyProperties(af31Dto, returnVO);

		return returnVO;
	}

	// 分页
	public Map<String, Object> querySurveyRecordWithPage(Page page,
			SurveyRecordVO returnVO) {

		Page result = this.getAdminDisposalBS().querySurveyRecordWithPage(page,
				returnVO);

		for (int i = 0; i < result.getResult().size(); i++) {

			Af30DTO af30Dto = (Af30DTO) result.getResult().get(i);

			if (af30Dto.getApe722() != 0) {

				String str = String.valueOf(af30Dto.getApe722());

				Date ape722 = DateTools.parseDate(str, "yyyyMMdd");

				af30Dto.setApe722s(ape722);
			}
		}

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	// 详情
	public SurveyRecordVO querySurveyRecordInfoById(String aaz148) {

		if (!StringTools.hasText(aaz148)) {
			throw new BusinessException("F10301004VS-09:查询 稽核调查记录 详情aaz148 为空！");
		}

		SurveyRecordVO returnVO = new SurveyRecordVO();

		Af30DTO af30Dto = this.getAdminDisposalBS().getAf30ById(aaz148);

		if (af30Dto != null) {

			if (af30Dto.getApe722() != null) {

				String str = String.valueOf(af30Dto.getApe722());

				Date ape722s = DateTools.parseDate(str, "yyyyMMdd");

				af30Dto.setApe722s(ape722s);
			}

			BeanTools.copyProperties(af30Dto, returnVO);
		}

		return returnVO;
	}

	public Map<String, Object> queryKa06WithPage(Page page, SickLeverVO vo) {
		Ka06DTO dto = new Ka06DTO();
		BeanTools.copyPropertiesIgnoreNull(vo, dto);
		page = this.adminDisposalBS.queryKa06WithPage(page, dto);
		return GridUtils.getGridData(page);

	}

	public Map<String, Object> queryDiseaseWithPage(Page page,
			DiseaseVO returnVO) {

		Page result = this.getAdminDisposalBS().queryDiseaseWithPage(page,
				returnVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	public QueryHistoryVO querySZJ(QueryHistoryVO queryHistoryVO) {
		queryHistoryVO = this.getAdminDisposalBS().querySZJ(queryHistoryVO);
		return queryHistoryVO;
	}

	public List<GzSummaryVO> queryGzSummary(GzSummaryVO vo) {
		if (vo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		List<GzSummaryVO> list = this.getAdminDisposalBS().queryGzSummary(vo);
		return list;
	}

	public Ke02DTO getKe02ById(QueryHistoryVO queryHistoryVO) {
		Ke02DTO ke02 = this.getAdminDisposalBS().getKe02ById(
				queryHistoryVO.getBaz010());
		return ke02;
	}

	public Map<String, Object> queryHospitalWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {
		Page result = this.getAdminDisposalBS().queryHospitalWithPage(page,
				medInstitutionVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	public Map<String, Object> queryZSDWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {
		Page result = this.getAdminDisposalBS().queryZSDWithPage(page,
				medInstitutionVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

	public QueryHistoryVO querySZJDBZ(QueryHistoryVO queryHistoryVO) {
		queryHistoryVO = this.getAdminDisposalBS().querySZJDBZ(queryHistoryVO);
		return queryHistoryVO;
	}

	public Ke03DTO getKe03ById(QueryHistoryVO queryHistoryVO) {
		Ke03DTO ke03 = this.getAdminDisposalBS().getKe03ById(
				queryHistoryVO.getBaz014());
		return ke03;
	}

	public Map<String, Object> queryHospitalDBZWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {
		Page result = this.getAdminDisposalBS().queryHospitalDBZWithPage(page,
				medInstitutionVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
	}

}
