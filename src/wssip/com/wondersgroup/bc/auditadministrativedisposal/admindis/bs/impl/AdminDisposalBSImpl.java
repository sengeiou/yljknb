package com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseKc21;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af30;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af32;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af34;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af35;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af55;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af56;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af58;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af78;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af79;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ka59;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ke15;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf06;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.StaffList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.UnitList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac02DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af30DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af34DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af35DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af40DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af41DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af42DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af55DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af56DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af58DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af78DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af79DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditConveyDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditInfoDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditPersonDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CbrDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CheckTaskDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CommonReviewDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CountDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.DoctorDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.HospDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.HospitalDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.JhtzDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.JzjsxxDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka06DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka52Kc24DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ka59DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc23Kc22DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ke15DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf06DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.MissionConclusionDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.MissionFinishDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.PersonDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.ProblemInfoDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.PunishQueryDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.RulesDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.UnitListDto;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.YsDTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Af73;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Af74;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af74DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka44DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.common.vo.GzSummaryVO;
import com.wondersgroup.local.common.vo.MedInstitutionVO;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vo.DoctorVO;
import com.wondersgroup.local.k3.f10301002.vo.StaffListVO;
import com.wondersgroup.local.k3.f10301002.vo.UnitListVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateUtils;
import com.wondersgroup.wssip.util.StringTools;

public class AdminDisposalBSImpl implements AdminDisposalBS {

	public Af32DTO SaveAf32(Af32DTO af32Dto) {

		if (af32Dto == null) {
			throw new BusinessException("AdminDisposalBS-00:传入af32Dto为空!");
		}

		Af32 af32 = new Af32();

		BeanTools.copyProperties(af32Dto, af32);

		CommonHibernateDaoUtils.save(af32);

		BeanTools.copyProperties(af32, af32Dto);

		return af32Dto;

	}

	public Af32DTO updateAf32(Af32DTO af32Dto) {

		if (af32Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-01:修改af32Dto,传入af32Dto为空!");
		}

		if (af32Dto.getAaz281() == null) {
			throw new BusinessException(
					"AdminDisposalBS-02:修改af32Dto,传入af32Dto的主键为空!");
		}

		Af32 af32 = CommonHibernateDaoUtils.load(Af32.class,
				af32Dto.getAaz281());

		BeanTools.copyPropertiesIgnoreNull(af32Dto, af32);

		CommonHibernateDaoUtils.update(af32);

		BeanTools.copyProperties(af32, af32Dto);

		return af32Dto;
	}

	public Ke15DTO updateKe15(Ke15DTO ke15Dto) {

		if (ke15Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-99:修改ke15Dto,传入ke15Dto为空!");
		}

		if (ke15Dto.getAaz359() == null) {
			throw new BusinessException(
					"AdminDisposalBS-98:修改ke15Dto,传入ke15Dto的主键为空!");
		}

		Ke15 ke15 = CommonHibernateDaoUtils.load(Ke15.class,
				ke15Dto.getAaz359());

		BeanTools.copyPropertiesIgnoreNull(ke15Dto, ke15);

		CommonHibernateDaoUtils.update(ke15);

		BeanTools.copyProperties(ke15, ke15Dto);

		return ke15Dto;
	}

	public Page queryAuditFileRegistrationWithPage(Page page,
			AuditFileVO auditFileRegistration) {

		/*StringBuffer sql = new StringBuffer(" select a.*,b.abz001 from af32 a left join af53 b on "
						+ "(a.aaz281=b.aaz281) where a.aaz281 is not null ");*/
		StringBuffer sql = new StringBuffer("select a.* from af32 a where a.wtsc = '0' and a.aaz281 is not null");

		if (StringTools.hasText(auditFileRegistration.getApa703())) {
			sql.append(" and a.apa703=" + auditFileRegistration.getApa703()
					+ " ");
		}

		if (auditFileRegistration.getApe711() != null) {
			sql.append(" and a.ape711=" + auditFileRegistration.getApe711()
					+ " ");
		}

		if (StringTools.hasText(auditFileRegistration.getApa165())) {
			sql.append(" and a.apa165=" + auditFileRegistration.getApa165()
					+ " ");
		}

		if (StringTools.hasText(auditFileRegistration.getApa704())) {
			sql.append(" and a.apa704=" + auditFileRegistration.getApa704()
					+ " ");
		}

		if (StringTools.hasText(auditFileRegistration.getApe028())) {
			sql.append(" and a.ape028 LIKE '%"
					+ auditFileRegistration.getApe028() + "%' ");
		}

		if (StringTools.hasText(auditFileRegistration.getApe712())) {
			sql.append(" and a.ape712 LIKE '%"
					+ auditFileRegistration.getApe712() + "%' ");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af32DTO.class);

		return result;
	}

	public Af56DTO updateAf56(Af56DTO af56Dto) {

		if (af56Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-99:修改af56Dto,传入af56Dto为空!");
		}

		if (af56Dto.getAaz332() == null) {
			throw new BusinessException(
					"AdminDisposalBS-100:修改af56Dto,传入af56Dto的主键为空!");
		}

		Af56 af56 = CommonHibernateDaoUtils.load(Af56.class,
				af56Dto.getAaz332());

		BeanTools.copyPropertiesIgnoreNull(af56Dto, af56);

		CommonHibernateDaoUtils.update(af56);

		BeanTools.copyProperties(af56, af56Dto);

		return af56Dto;
	}

	public Aa10DTO updateAa10(Aa10DTO aa10Dto) {

		if (aa10Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-99:修改aa10Dto,传入aa10Dto为空!");
		}

		if (!StringTools.hasText(aa10Dto.getAaa102())) {
			throw new BusinessException(
					"AdminDisposalBS-98:修改aa10Dto,传入aa10Dto的主键为空!");
		}

		String s = "update aa10 a set a.aaa103 = '" + aa10Dto.getAaa103()
				+ "' , " + "a.aae100 = '" + aa10Dto.getAae100() + "' , "
				+ "a.aae013 = '" + aa10Dto.getAae013() + "' "
				+ "where a.aaa100 = 'APA701' and a.aaa102 = '"
				+ aa10Dto.getAaa102() + "'";

		StringBuffer sql = new StringBuffer(s);

		CommonJdbcDaoUtils.update(sql.toString());

		return aa10Dto;
	}

	public Page queryAuditProblemWithPage(Page page, Af32DTO af32Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af32 a where a.wtsc = '0' and a.aaz281 is not null");

		// 统筹区
		if (StringTools.hasText(af32Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + af32Dto.getAaa027() + "'");
		}

		// 受理方式
		if (StringTools.hasText(af32Dto.getApa703())) {
			sql.append(" and a.apa703 = '" + af32Dto.getApa703() + "'");
		}
		// 问题状态
		if (StringTools.hasText(af32Dto.getApa165())) {
			sql.append(" and a.apa165 = '" + af32Dto.getApa165() + "'");
		}
		// 来源方类型
		if (StringTools.hasText(af32Dto.getApa704())) {
			sql.append(" and a.apa704 = '" + af32Dto.getApa704() + "'");
		}
		// 来源方名称ape028
		if (StringTools.hasText(af32Dto.getApe028())) {
			sql.append(" and a.ape028 like '%" + af32Dto.getApe028() + "%'");
		}

		// 根据受理日期 ape711
		if (af32Dto.getApe711() != null) {
			sql.append(" and a.ape711 = '" + af32Dto.getApe711() + "'");
		}

		// 受理日期
		if (StringTools.hasText(af32Dto.getApe711_e())) {
			sql.append(" and a.ape711 <= " + af32Dto.getApe711_e());
		}

		if (StringTools.hasText(af32Dto.getApe711_s())) {
			sql.append(" and a.ape711 >= " + af32Dto.getApe711_s());
		}

		// 关闭日期 ape027
		if (StringTools.hasText(af32Dto.getApe027_s())) {
			sql.append(" and a.ape027 >= " + af32Dto.getApe027_s());
		}

		if (StringTools.hasText(af32Dto.getApe027_e())) {
			sql.append(" and a.ape027 <= " + af32Dto.getApe027_e());
		}

		// 问题记录ID aaz281
		if (af32Dto.getAaz281() != null) {
			sql.append(" and a.aaz281 = '" + af32Dto.getAaz281() + "'");
		}

		// 问题关键字
		if (StringTools.hasText(af32Dto.getApe712())) {
			sql.append(" and a.ape712 like '%" + af32Dto.getApe712() + "%'");
		}

		// 问题受理日期 开始时间
		if (af32Dto.getApe711Start() != null) {
			sql.append(" and ape711 >= '" + af32Dto.getApe711Start() + "'");
		}

		// 问题受理日期结束时间
		if (af32Dto.getApe711End() != null) {
			sql.append(" and ape711 <= '" + af32Dto.getApe711End() + "'");
		}

		// 疑点类型 aaa153
		if (StringTools.hasText(af32Dto.getAaa153())) {
			sql.append(" and a.aaz281 in (select b.aaz281 from ka59 b where b.aaa153 = '"
					+ af32Dto.getAaa153() + "') ");
		}

		// 規則名 aaz319
		if (af32Dto.getAaz319() != null) {
			sql.append(" and a.aaz281 in (select c.aaz281 from ka59 c where c.aaz319 = '"
					+ af32Dto.getAaz319() + "') ");
		}

		sql.append(" order by a.aae036 desc");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af32DTO.class);

		return result;
	}

	public Page queryTaskInformationWithPage(Page page, Af79DTO af79Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af79 a where a.aaz524 is not null");

		// 任务编号
		if (af79Dto.getAaz524() != null) {
			sql.append(" and a.aaz524 like '%" + af79Dto.getAaz524() + "%'");
		}

		// 任务审核人
		if (StringTools.hasText(af79Dto.getAae012())) {
			sql.append(" and a.aae012 like '%" + af79Dto.getAae012() + "%'");
		}
		// 任务状态
		if (StringTools.hasText(af79Dto.getApe140())) {
			sql.append(" and a.ape140 = '" + af79Dto.getApe140() + "'");
		}
		// 统筹区编码
		if (StringTools.hasText(af79Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + af79Dto.getAaa027() + "'");
		}
		// 任务发放时间 aae217 Integer
		if (af79Dto.getAae217() != null) {
			sql.append(" and a.aae217 = '" + af79Dto.getAae217() + "'");
		}
		// 发放时间
		if (af79Dto.getAae217End() != null) {
			sql.append(" and a.aae217 <= " + af79Dto.getAae217End());
		}

		if (af79Dto.getAae217Start() != null) {
			sql.append(" and a.aae217 >= " + af79Dto.getAae217Start());
		}
		// 任务完成时间 aae311 Date
		if (af79Dto.getAae311Starts() != null) {
			sql.append(" and a.aae311 >= to_date( '"
					+ af79Dto.getAae311Starts() + "','yyyy/mm/dd')");
		}

		if (af79Dto.getAae311Ends() != null) {
			sql.append(" and a.aae311 <=  to_date('" + af79Dto.getAae311Ends()
					+ "','yyyy/mm/dd')");
		}
		// 任务受理人
		if (StringTools.hasText(af79Dto.getAae014())) {
			sql.append(" and a.aae014 like '%" + af79Dto.getAae014() + "%'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af79DTO.class);
		return result;
	}

	public Af55DTO getAf55ById(String aaz322) {

		Af55DTO af55Dto = new Af55DTO();

		Af55 af55 = CommonHibernateDaoUtils.load(Af55.class,
				Long.parseLong(aaz322));

		if (af55 != null) {
			BeanTools.copyProperties(af55, af55Dto);
		}

		return af55Dto;

	}

	public void deleteAf55(Af55DTO af55Dto) {

		if (af55Dto.getAaz322() == null) {
			throw new BusinessException("AdminDisposalBS-60:删除af55传入AAZ322为空!");
		}
		Af55 af55 = CommonHibernateDaoUtils.load(Af55.class,
				af55Dto.getAaz322());

		CommonHibernateDaoUtils.getCommonHibernateDao().delete(af55);
	}

	public Af55DTO updateAf55(Af55DTO af55Dto) {

		if (af55Dto == null) {
			throw new BusinessException("AdminDisposalBS-50:传入参数af55Dto为空!");
		}
		if (af55Dto.getAaz322() == null) {
			throw new BusinessException("AdminDisposalBS-51:传入参数aaz322为空!");
		}

		Af55 af55 = CommonHibernateDaoUtils.load(Af55.class,
				af55Dto.getAaz322());

		BeanTools.copyPropertiesIgnoreNull(af55Dto, af55);

		if (AuditConstants.APA154_CODE_0.equals(af55.getApa154())) {

			af55.setAae031(null);

			af55.setApe727(null);
		}

		CommonHibernateDaoUtils.update(af55);

		BeanTools.copyProperties(af55, af55Dto);

		return af55Dto;
	}

	public Af55DTO saveAf55(Af55DTO af55Dto) {

		if (af55Dto == null) {
			throw new BusinessException("AdminDisposalBS-58:传入af55Dto为空!");
		}

		Af55 af55 = new Af55();

		BeanTools.copyProperties(af55Dto, af55);

		CommonHibernateDaoUtils.save(af55);

		BeanTools.copyProperties(af55, af55Dto);

		return af55Dto;
	}

	public Af32DTO getAf32ById(String aaz281) {

		Af32DTO af32DTO = new Af32DTO();

		Af32 af32 = CommonHibernateDaoUtils.load(Af32.class,
				Long.parseLong(aaz281));

		if (af32 != null) {
			BeanTools.copyProperties(af32, af32DTO);
		}

		return af32DTO;
	}

	public Ke15DTO getKe15ById(String aaz359) {
		Ke15DTO ke15DTO = new Ke15DTO();

		Ke15 ke15 = CommonHibernateDaoUtils.load(Ke15.class,
				Long.parseLong(aaz359));

		if (ke15 != null) {
			BeanTools.copyProperties(ke15, ke15DTO);
		}

		return ke15DTO;
	}

	public Af56DTO getAf56ById(String aaz332) {

		Af56DTO af56Dto = new Af56DTO();

		Af56 af56 = CommonHibernateDaoUtils.load(Af56.class,
				Long.parseLong(aaz332));

		if (af56 != null) {
			BeanTools.copyProperties(af56, af56Dto);
		}

		return af56Dto;
	}

	public Aa10DTO getAa10ById(String aaa102) {

		Aa10DTO aa10Dto = new Aa10DTO();

		StringBuffer sql = new StringBuffer(
				"select * from aa10 a where a.aaa100 = 'APA701' and a.aaa102 = '"
						+ aaa102 + "'");

		aa10Dto = CommonJdbcDaoUtils.getCommonJdbcDAO().getFirst(
				sql.toString(), Aa10DTO.class);

		return aa10Dto;
	}

	/**
	 * 根据aaz524查询任务内容的详细信息
	 * 
	 * @author
	 * @param aaz524
	 *            主键
	 * @return ProblemInfoDTO
	 */
	public Page getProblemDetailsById(Page page, String aaz524) {

		// ProblemInfoDTO problemInfoDto = new ProblemInfoDTO();

		StringBuffer sql = new StringBuffer(
				"select a.ape712,c.aaz524,a.apa703,a.ape711,a.apa704,a.aaa027,a.aaz281,a.aae005,a.aae006,a.aae007,a.apa705,"
						+ "c.aae014,c.aae217,c.ape140,c.aae218 from af32 a,af78 b,af79 c where 1=1 "
						+ "and a.aaz281 = b.aaz281 and b.aaz524 = c.aaz524 and c.aaz524 = '"
						+ aaz524 + "'");

		// problemInfoDto =
		// CommonJdbcDaoUtils.getCommonJdbcDAO().getFirst(sql.toString(),
		// ProblemInfoDTO.class);

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				ProblemInfoDTO.class);
		return result;
	}

	/**
	 * 根据aaz281查询案件内容的详细信息
	 * 
	 * @author
	 * @param aaz281
	 * @return ProblemInfoDTO
	 */
	public Page getQueryCasesById(Page page, String aaz281) {

		StringBuffer sql = new StringBuffer(
				"select a.aaa027,a.aaz318,a.abz001,a.abb006,a.apf094,a.aae426,a.aae189,a.aae011,a.aae012,"
						+ "to_char(a.aae036, 'YYYY-MM-DD HH24:MI:SS') as aae036s,to_char(to_date(a.aae034, 'YYYY-MM-DD'), 'YYYY-MM-DD') as aae034s,"
						+ "to_char(to_date(a.abb025, 'YYYY-MM-DD'), 'YYYY-MM-DD') as abb025s,acc789,a.apa047,a.aaz281,aae425 "
						+ "from af32 b, af53 a "
						+ "where a.aaz281 = b.aaz281 and a.aaz281='"
						+ aaz281
						+ "'");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				ProblemInfoDTO.class);

		return result;
	}

	/**
	 * 根据aaz318查询稽核对象内容的详细信息
	 * 
	 * @author
	 * @param aaz318
	 * @return
	 */
	public Page getQueryObjectById(Page page, String aaz318) {

		StringBuffer sql = new StringBuffer(" select a.*,"
				+ " to_date(a.ape727, 'YYYY-MM-DD') as ape727s,"
				+ "to_date(a.aae031, 'YYYY-MM-DD') as aae031s,"
				+ "to_date(a.aae034, 'YYYY-MM-DD') as aae034s,"
				+ "to_date(a.abb087, 'YYYY-MM-DD') as abb087s "
				+ "from af31 a where 1 = 1 and a.aaz318 = '" + aaz318 + "'");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af31DTO.class);

		return result;
	}

	public void checkCaseState(String abz001, String flag) {

		StringBuffer sb = new StringBuffer(
				"select a.* from af53 a where a.abz001 = '" + abz001 + "'");
		List<Af55> af55List = CommonJdbcDaoUtils.query(sb.toString(),
				Af55.class);
		if (af55List.size() == 0) {
			throw new BusinessException("AdminDisposalBS-52:案件不存在,请核对案件编号!");
		}
		sb.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_4 + "'");

		if (AuditConstants.FLAG_REG.equals(flag)) {
			sb.append(" and exists (select b.aaz077 from af31 b where a.aaz318 = b.aaz318 ");
			sb.append(" and b.apa155 = '" + AuditConstants.APA155_CODE_1
					+ "' and b.apa168 = '" + AuditConstants.APA168_CODE_1
					+ "') ");
			af55List = CommonJdbcDaoUtils.query(sb.toString(), Af55.class);
			if (af55List.size() == 0) {
				throw new BusinessException(
						"AdminDisposalBS-53:案件尚未立案确认或不存在移交行政部门处罚的稽核对象!");
			}
		}

		if (AuditConstants.FLAG_EXCU.equals(flag)) {
			sb.append(" and exists (select c.ape035 from af31 b,af55 c where a.aaz318 = b.aaz318 and b.aaz077 = c.aaz077 ");
			sb.append(" and b.apa168 = '" + AuditConstants.APA168_CODE_1
					+ "' and b.apa155 = '" + AuditConstants.APA155_CODE_1
					+ "' ");
			sb.append(" and c.akc175 = '" + AuditConstants.AKC175_CODE_1
					+ "') ");
			af55List = CommonJdbcDaoUtils.query(sb.toString(), Af55.class);
			if (af55List.size() == 0) {
				throw new BusinessException(
						"AdminDisposalBS-54:案件尚未立案确认或不存在移交行政部门处罚的对象!");
			}
		}
	}

	// 删除操作
	public void deleteAf32ByIds(String aaz281s) {

		if (aaz281s == null) {
			throw new BusinessException(
					"AdminDisposalBS-05:批量 删除af32Dto,传入af32Dto的主键为空!");
		}

		String sql = "update af32 a set a.wtsc = '1' where a.aaz281 in (" + aaz281s + ")";

		CommonJdbcDaoUtils.update(sql);
	}

	public void deleteAa10ByIds(String aaa102s) {

		if (aaa102s == null) {
			throw new BusinessException(
					"AdminDisposalBS-55:批量 删除Aa10Dto,传入aa10Dto的主键为空!");
		}

		String sql = "delete from aa10 a where a.aaa100 = 'APA701' and a.aaa102 in ("
				+ aaa102s + ")";

		CommonJdbcDaoUtils.delete(sql);

	}

	public void deleteAf56ByIds(String aaz332s) {

		if (aaz332s == null) {
			throw new BusinessException(
					"AdminDisposalBS-55:批量 删除Af56DTO,传入af56Dto的主键为空!");
		}

		String sql = "delete from af56 a where a.aaz332 in ('" + aaz332s + "')";

		CommonJdbcDaoUtils.delete(sql);
	}

	public Af53DTO getAf53ById(String aaz318) {

		Af53DTO af53Dto = new Af53DTO();

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				Long.parseLong(aaz318));

		if (af53 != null) {
			BeanTools.copyProperties(af53, af53Dto);
		}

		return af53Dto;
	}

	public List<Af58DTO> queryAf58Info(PunishQueryDTO punQueryDto) {

		StringBuffer sql = new StringBuffer(
				" select * from Af58 a where a.aaz323 is not null ");

		if (punQueryDto.getAaz322() != null) {
			sql.append(" and aaz322 = '" + punQueryDto.getAaz322() + "'");
		}

		List<Af58DTO> af58List = CommonJdbcDaoUtils.query(sql.toString(),
				Af58DTO.class);

		return af58List;
	}

	public List<Af53DTO> findCaseID(Long problemID) {

		StringBuffer s = new StringBuffer();

		s.append("select * from AF53 where aaz281 = '" + problemID + "'");

		List<Af53DTO> list = CommonJdbcDaoUtils.query(s.toString(),
				Af53DTO.class);

		return list;
	}

	public List<Ac01DTO> findObj_Person(String caseID) {
		StringBuffer s1 = new StringBuffer();

		s1.append("select aac001,aac002,aac003,aac004,aac006,aac084,apa151,aae005,apa701,AAZ077 from (select * from AC01 where AAC001 in (select AAZ010 from AF31 where APA709='1' AND AAZ318=");

		s1.append(caseID
				+ ")) a,(select AAZ077, AAZ010,APA701 from AF31 where APA709='1' AND AAZ318 = ");

		s1.append(caseID + ") b where a.AAC001=b.AAZ010");

		List<Ac01DTO> list = CommonJdbcDaoUtils.query(s1.toString(),
				Ac01DTO.class);

		return list;
	}

	public void deleteAf58(Af58DTO af58Dto) {

		if (af58Dto.getAaz323() == null) {
			throw new BusinessException("AdminDisposalBS-54:删除af58传入AAZ323为空!");
		}
		Af58 af58 = CommonHibernateDaoUtils.load(Af58.class,
				af58Dto.getAaz323());

		CommonHibernateDaoUtils.getCommonHibernateDao().delete(af58);

	}

	public Af58DTO saveAf58(Af58DTO af58Dto) {

		if (af58Dto == null) {
			throw new BusinessException("AdminDisposalBS-55:传入af58Dto为空!");
		}

		Af58 af58 = new Af58();

		BeanTools.copyProperties(af58Dto, af58);

		CommonHibernateDaoUtils.save(af58);

		BeanTools.copyProperties(af58, af58Dto);

		return af58Dto;

	}

	public Af31DTO saveAf31(Af31DTO af31Dto) {

		if (af31Dto == null) {
			throw new BusinessException("AdminDisposalBS-62:传入af31Dto为空!");
		}

		Af31 af31 = new Af31();

		BeanTools.copyProperties(af31Dto, af31);

		String aaz077 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ077");

		af31.setAaz077(aaz077);

		CommonHibernateDaoUtils.save(af31);

		BeanTools.copyProperties(af31, af31Dto);

		return af31Dto;

	}

	public Af31DTO updateAf31(Af31DTO af31Dto) {

		if (af31Dto == null) {
			throw new BusinessException("AdminDisposalBS-62:传入参数af31Dto为空!");
		}
		/*if (af31Dto.getAaz077() == null) {
			throw new BusinessException("AdminDisposalBS-63:传入参数aaz077为空!");
		}*/

		Af31 af31 = CommonHibernateDaoUtils.load(Af31.class,
				af31Dto.getAaz077());

		BeanTools.copyPropertiesIgnoreNull(af31Dto, af31);

		CommonHibernateDaoUtils.update(af31);

		BeanTools.copyProperties(af31, af31Dto);

		return af31Dto;

	}

	public Af53DTO saveAf53(Af53DTO af53Dto) {

		if (af53Dto == null) {
			throw new BusinessException("AdminDisposalBS-61:传入af53Dto为空!");
		}

		Af53 af53 = new Af53();

		BeanTools.copyProperties(af53Dto, af53);

		CommonHibernateDaoUtils.save(af53);

		BeanTools.copyProperties(af53, af53Dto);

		return af53Dto;

	}

	public Af58DTO updateAf58(Af58DTO af58Dto) {

		if (af58Dto == null) {
			throw new BusinessException("AdminDisposalBS-56:传入参数af58Dto为空!");
		}

		if (af58Dto.getAaz323() == null) {
			throw new BusinessException("AdminDisposalBS-57:传入参数aaz323为空!");
		}

		Af58 af58 = CommonHibernateDaoUtils.load(Af58.class,
				af58Dto.getAaz323());

		BeanTools.copyPropertiesIgnoreNull(af58Dto, af58);

		CommonHibernateDaoUtils.update(af58);

		BeanTools.copyProperties(af58, af58Dto);

		return af58Dto;
	}

	public List<Kf05DTO> findObj_Doctor(String caseID) {

		StringBuffer s1 = new StringBuffer();

		s1.append("select * from (select * from KF05 where aaz263 in (select AAZ010 from AF31 where APA709='2' AND AAZ318=");

		s1.append(caseID
				+ ")) a,(select AAZ077,AAZ010,APA701 from AF31 where APA709='2' AND AAZ318 = ");

		s1.append(caseID + ") b where a.aaz263=b.AAZ010");

		List<Kf05DTO> list = CommonJdbcDaoUtils.query(s1.toString(),
				Kf05DTO.class);

		return list;
	}

	public List<Kb01DTO> findObj_Organize(String caseID) {

		StringBuffer s1 = new StringBuffer();

		s1.append("select * from (select * from KB01 where akb020 in (select AAZ010 from AF31 where APA709='3' AND AAZ318=");

		s1.append(caseID
				+ ")) a,(select AAZ077,AAZ010,APA701 from AF31 where APA709='3' AND AAZ318 = ");

		s1.append(caseID + ") b where a.akb020=b.AAZ010");

		List<Kb01DTO> list = CommonJdbcDaoUtils.query(s1.toString(),
				Kb01DTO.class);

		return list;
	}

	public Page queryAuditCaseDetailsWithPage(Page page, Af53DTO af53Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from af53 a where a.aaz318 is not null");

		// 立案日期 ape047;
		if (af53Dto.getApe047() != null) {
			// String str = DateUtils.format(af53Dto.getAae036(), "yyyyMMdd");
			sql.append(" and a.ape047 = '" + af53Dto.getApe047() + "'");
		}
		// 立案日期 aae034;
		if (af53Dto.getAae034() != null) {
			// String str = DateUtils.format(af53Dto.getAae036(), "yyyyMMdd");
			sql.append(" and a.aae034 = '" + af53Dto.getAae034() + "'");
		}
		// 案件状态 aae426
		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}
		// 案件来源
		if (StringTools.hasText(af53Dto.getAbb006())) {
			sql.append(" and a.abb006 = '" + af53Dto.getAbb006() + "'");
		}
		// 案件编号 abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		// 案情关键字
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}

	public Af31DTO getAf31ById(String aaz077) {

		Af31DTO af31Dto = new Af31DTO();

		Af31 af31 = CommonHibernateDaoUtils.load(Af31.class, aaz077);

		if (af31 != null) {
			BeanTools.copyProperties(af31, af31Dto);
		}

		return af31Dto;
	}

	public Page queryAf31WithPage(Page page, Af31DTO af31Dto) {

		StringBuffer sb = null;
		if (StringTools.hasText(af31Dto.getAae426())) {
			sb = new StringBuffer(
					"select * from af31 a where a.aaz077 is not null and jlbz = '1' ");
		}else{
			sb = new StringBuffer(
					"select * from af31 a where a.aaz077 is not null");
		}

		if (af31Dto.getAaz318() != null) {
			sb.append(" and a.aaz318 = " + af31Dto.getAaz318());
		}

		/*if (StringTools.hasText(af31Dto.getApa011())) {
			sb.append(" and a.apa011 = '" + af31Dto.getApa011() + "'");
		}*/

		sb.append(" order by a.aaz077");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Af31.class);

		return result;

	}

	public Ac01DTO getAc01ById(String aaz010) {

		Ac01DTO ac01Dto = new Ac01DTO();

		Ac01 ac01 = CommonHibernateDaoUtils.load(Ac01.class, aaz010);

		if (ac01 != null) {
			BeanTools.copyProperties(ac01, ac01Dto);
		}

		return ac01Dto;
	}

	public Kf05DTO getKf05ById(String aaz010) {

		Kf05DTO kf05Dto = new Kf05DTO();

		Kf05 kf05 = CommonHibernateDaoUtils.load(Kf05.class, aaz010);

		if (kf05 != null) {
			BeanTools.copyProperties(kf05, kf05Dto);
		}

		return kf05Dto;
	}

	public Kf06DTO getKf06ById(String aaz307) {

		Kf06DTO kf06Dto = new Kf06DTO();

		Kf06 kf06 = CommonHibernateDaoUtils.load(Kf06.class, aaz307);

		if (kf06 != null) {
			BeanTools.copyProperties(kf06, kf06Dto);
		}

		return kf06Dto;
	}

	public List<Kb01DTO> queryKb01List(Kb01DTO queryDto) {

		StringBuffer sql = new StringBuffer(
				" select * from Kb01 a where a.aaz107 is not null ");

		if (StringTools.hasText(queryDto.getAkb020())) {
			sql.append(" and a.akb020 = '" + queryDto.getAkb020() + "' ");
		}

		List<Kb01DTO> kb01List = CommonJdbcDaoUtils.query(sql.toString(),
				Kb01DTO.class);

		return kb01List;
	}

	public Kb01DTO getKb01ById(String aaz010) {

		Kb01DTO kb01Dto = new Kb01DTO();

		Kb01 kb01 = CommonHibernateDaoUtils.load(Kb01.class, aaz010);

		if (kb01 != null) {
			BeanTools.copyProperties(kb01, kb01Dto);
		}

		return kb01Dto;
	}

	public Af53DTO updateAf53(Af53DTO af53Dto) {

		if (af53Dto == null) {
			throw new BusinessException("AdminDisposalBS-20:传入参数af53Dto为空!");
		}

		if (af53Dto.getAaz318() == null) {
			throw new BusinessException("AdminDisposalBS-21:传入参数af53Dto 主键为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

		BeanTools.copyProperties(af53, af53Dto);

		if (AuditConstants.AAE426_CODE_4.equals(af53Dto.getAae426())) {
			String s2 = "select * from APPROVAL_CLASS_LIST";
			List<ApprovalClassList> l2 = CommonJdbcDaoUtils.query(s2,
					ApprovalClassList.class);
			for (ApprovalClassList acl : l2) {
				ApprovalInfoList ail = new ApprovalInfoList();
				ail.setAclid(acl.getAclid());
				ail.setAilzt("未审批");
				ail.setAaz318(af53Dto.getAaz318());
				ail.setAilfl(2);
				ail.setAilspfl(0);
				CommonHibernateDaoUtils.save(ail);
			}
		} else if (AuditConstants.AAE426_CODE_6.equals(af53Dto.getAae426()) || AuditConstants.AAE426_CODE_5.equals(af53Dto.getAae426())) {
			String s2 = "select * from APPROVAL_CLASS_LIST";
			List<ApprovalClassList> l2 = CommonJdbcDaoUtils.query(s2,
					ApprovalClassList.class);
			for (ApprovalClassList acl : l2) {
				ApprovalInfoList ail = new ApprovalInfoList();
				ail.setAclid(acl.getAclid());
				ail.setAilzt("未审批");
				ail.setAaz318(af53Dto.getAaz318());
				ail.setAae427(af53.getAae427());
				ail.setAilfl(1);
				ail.setAilspfl(0);
				CommonHibernateDaoUtils.save(ail);
			}
		}

		return af53Dto;
	}

	public Page queryAc01WithPage(Page page, Ac01DTO queryDto) {

		//StringBuffer sb = new StringBuffer("select * from ac01 a where a.aac001 is not null ");
		StringBuffer sb = new StringBuffer("select * from YBOLTP.AC01 a where a.aac001 is not null");

		// 人员编号aac001
		if (StringTools.hasText(queryDto.getAac001())) {
			sb.append(" and a.aac001 = '" + queryDto.getAac001() + "'");
		}

		// 姓名aac003
		if (StringTools.hasText(queryDto.getAac003())) {
			sb.append(" and a.aac003 = '" + queryDto.getAac003() + "'");
		}

		// 社会保障号码aac002
		if (StringTools.hasText(queryDto.getAac002())) {
			sb.append(" and a.aac002 = '" + queryDto.getAac002() + "'");
		}

		//sb.append(" order by a.aac001 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Ac01DTO.class);

		return result;
	}

	public Page queryKb01WithPage(Page page, Kb01DTO queryDto) {

		StringBuffer sb = new StringBuffer(
				"select * from YBOLTP.KB01 a where a.aaz107 is not null ");

		// 医疗机构类型 akb022
		if (StringTools.hasText(queryDto.getAkb022())) {
			sb.append(" and a.akb022 = '" + queryDto.getAkb022() + "'");
		}

		// 医疗机构编号 akb020
		if (StringTools.hasText(queryDto.getAkb020())) {
			sb.append(" and a.akb020 like '%" + queryDto.getAkb020() + "%'");
		}

		// 医疗机构名称 akb021
		if (StringTools.hasText(queryDto.getAkb021())) {
			sb.append(" and a.akb021 like '%" + queryDto.getAkb021() + "%'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(queryDto.getAka101())) {
			sb.append(" and a.aka101 = '" + queryDto.getAka101() + "'");
		}

		// 统筹区 aaa027
		if (StringTools.hasText(queryDto.getAaa027())) {
			sb.append(" and a.aaa027 = '" + queryDto.getAaa027() + "'");
		}

		// 医疗机构类别 akb023
		if (StringTools.hasText(queryDto.getAkb023())) {
			sb.append(" and a.akb023 = '" + queryDto.getAkb023() + "'");
		}

		sb.append(" order by a.akb023 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Kb01.class);

		return result;
	}

	public Page queryKf05WithPage(Page page, Kf05DTO queryDto) {

		/*StringBuffer sb = new StringBuffer("select * from kf05 a left join kf06 b on (a.aaz307 = b.aaz307) "
						+ "left join kb01 c on (a.aaz107 = c.aaz107) where 1=1 ");*/
		StringBuffer sb = new StringBuffer("select a.aaz263, a.akb020, a.aac003, a.aab014, a.aae005, " +
				"a.aaf009, a.akc054, a.akc056, a.aaa027, a.aaz107, a.aae100, " +
				"a.akc049, b.aab112, b.akb021, b.aka101, b.akb011, b.akf015,  " +
				"b.aae004, b.aae006, b.aae030, b.aae031 from yboltp.kf05 a, yboltp.kb01 b " +
				"where a.aaz107 = b.aaz107 ");

		// 姓名: aac003
		if (StringTools.hasText(queryDto.getAac003())) {
			sb.append(" and a.aac003 like '%" + queryDto.getAac003() + "%'");
		}

		// 医疗机构名称 akb021 医疗服务机构ID aaz107
		if (StringTools.hasText(queryDto.getAkb021())) {
			sb.append(" and a.aaz107 in (select b.aaz107 from kb01 b where b.akb021 like '%"
					+ queryDto.getAkb021() + "%')");
		}

		// 公民身份号码 aab014
		if (StringTools.hasText(queryDto.getAab014())) {
			sb.append(" and a.aab014 like '%" + queryDto.getAab014() + "%'");
		}
		// 医护人员编号 aaz263
		if (StringTools.hasText(queryDto.getAaz263())) {
			sb.append(" and a.aaz263 = '" + queryDto.getAaz263() + "'");
		}

		sb.append(" order by a.aaz263");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Kf05DTO.class);
		

		return result;
	}

	public Page queryAf53WithPage(Page page, Af53DTO af53Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from af53 a where a.aaz318 is not null");

		// 编号abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}

		// 案件状态 立案待查 3 已结案4 aae426
		/*if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and (a.aae426 = '" + af53Dto.getAae426()
					+ "' or a.aae426 ='4' ) ");
		}*/
		 if (StringTools.hasText(af53Dto.getAae426())) {
			 sql.append(" and (a.aae426 = '" + af53Dto.getAae426() + "') ");
		 }
		// 办案责任人acc789
		if (StringTools.hasText(af53Dto.getAcc789())) {
			sql.append(" and a.acc789 like '%" + af53Dto.getAcc789() + "%'");
		}
		// 案情关键字apf094
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}
		// 统筹区aaa027
		if (StringTools.hasText(af53Dto.getAaa027())) {
			sql.append(" and aaa027 = '" + af53Dto.getAaa027() + "'");
		}

		// 立案确认人 aae012
		if (StringTools.hasText(af53Dto.getAae012())) {
			sql.append(" and aae012 = '" + af53Dto.getAae012() + "'");
		}
		// 督办期限 apa047
		if (af53Dto.getApa047() != null) {
			sql.append(" and apa047 = " + af53Dto.getApa047());
		}
		// 结案日期 abb025begin abb025end
		if (StringTools.hasText(af53Dto.getAbb025begin())) {
			sql.append(" and abb025 >= "
					+ af53Dto.getAbb025begin().replace("-", ""));
		}
		if (StringTools.hasText(af53Dto.getAbb025end())) {
			sql.append(" and abb025 <= "
					+ af53Dto.getAbb025end().replace("-", ""));
		}
		// 确认日期 aae034begin aae034end
		if (StringTools.hasText(af53Dto.getAae034begin())) {
			sql.append(" and aae034 >= "
					+ af53Dto.getAae034begin().replace("-", ""));
		}
		if (StringTools.hasText(af53Dto.getAae034end())) {
			sql.append(" and aae034 <= "
					+ af53Dto.getAae034end().replace("-", ""));
		}

		sql.append(" order by a.aaz318");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}

	public Af30DTO saveAf30(Af30DTO af30Dto) {

		if (af30Dto == null) {
			throw new BusinessException("AdminDisposalBS-30:传入af32Dto为空!");
		}

		Af30 af30 = new Af30();

		BeanTools.copyProperties(af30Dto, af30);

		CommonHibernateDaoUtils.save(af30);

		BeanTools.copyProperties(af30, af30Dto);

		return af30Dto;
	}

	public Page querySurveyRecordWithPage(Page page, Af30DTO af30Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from af30 a where a.aaz148 is not null");

		// aaz318和aaz077

		String aaz077 = String.valueOf(af30Dto.getAaz077());
		if (af30Dto.getAaz318() != null) {
			sql.append(" and a.aaz318 = " + af30Dto.getAaz318() + "");
		}
		if (StringTools.hasText(aaz077)) {
			sql.append(" and a.aaz077 = '" + aaz077 + "'");
			// sql.append(" and a.aaz077 = '" + aaz077 + "'");
		}

		sql.append(" order by a.aaz148 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af30DTO.class);

		return result;
	}

	public Af30DTO getAf30ById(String aaz148) {

		if (!StringTools.hasText(aaz148)) {
			throw new BusinessException("AdminDisposalBS-31:传入aaz148为空!");
		}

		Af30DTO af30Dto = new Af30DTO();

		Af30 af30 = CommonHibernateDaoUtils.load(Af30.class,
				Long.parseLong(aaz148));

		if (af30 != null) {
			BeanTools.copyProperties(af30, af30Dto);
		}
		return af30Dto;
	}

	public Af30DTO updateAf30(Af30DTO af30Dto) {

		if (af30Dto == null) {
			throw new BusinessException("AdminDisposalBS-32:修改af30 传入对象为空!");
		}

		if (!StringTools.hasText(String.valueOf(af30Dto.getAaz148()))) {
			throw new BusinessException("AdminDisposalBS-33:修改af30 传入主键 148为空!");
		}

		Af30 af30 = CommonHibernateDaoUtils.load(Af30.class,
				af30Dto.getAaz148());

		BeanTools.copyPropertiesIgnoreNull(af30Dto, af30);

		CommonHibernateDaoUtils.update(af30);

		BeanTools.copyProperties(af30, af30Dto);

		return af30Dto;
	}

	public void deleteAf53(Af53DTO af53Dto) {

		if (af53Dto.getAaz318() == null) {
			throw new BusinessException("AdminDisposalBS-64:删除af53传入AAZ318为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		CommonHibernateDaoUtils.getCommonHibernateDao().delete(af53);

	}

	public void deleteAf31ByAaz318(Long aaz318) {

		if (aaz318 == null) {
			throw new BusinessException(
					"AdminDisposalBS-65:删除af31,传入aaz318的为空!");
		}

		String sql = "delete from af31 a where a.aaz318 = " + aaz318;

		CommonJdbcDaoUtils.delete(sql);

	}

	public void deleteAf31(Af31DTO af31Dto) {

		if (!StringTools.hasText(af31Dto.getAaz077())) {
			throw new BusinessException("AdminDisposalBS-66:删除af31传入AAZ077为空!");
		}

		Af31 af31 = CommonHibernateDaoUtils.load(Af31.class,
				af31Dto.getAaz077());

		CommonHibernateDaoUtils.getCommonHibernateDao().delete(af31);

	}

	public List<Af31DTO> queryAf31List(Af31DTO af31Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af31 a where a.aaz077 is not null ");

		if (af31Dto.getAaz318() != null) {
			sql.append(" and a.aaz318 = '" + af31Dto.getAaz318() + "'");
		}

		List<Af31DTO> af31List = CommonJdbcDaoUtils.query(sql.toString(),
				Af31DTO.class);
		return af31List;
	}

	
	public Page queryAf53ByIds(Page page, Af53DTO af53Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af53 a where a.aaz318 is not null ");
		//案件编号
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		//案情描述
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}

		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}
		if (StringTools.hasText(af53Dto.getApa011())) {
			sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
					+ af53Dto.getApa011() + "')");
		} else {

			sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
					+ AuditConstants.APA011_CODE_0 + "')");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}

	public Ke15DTO SavaKe15(Ke15DTO ke15Dto) {
		if (ke15Dto == null) {
			throw new BusinessException("AdminDisposalBS-00:传入ke15Dto为空!");
		}

		Ke15 ke15 = new Ke15();

		BeanTools.copyProperties(ke15Dto, ke15);

		CommonHibernateDaoUtils.save(ke15);

		BeanTools.copyProperties(ke15, ke15Dto);

		return ke15Dto;
	}

	public Af56DTO savaAf56(Af56DTO af56Dto) {
		if (af56Dto == null) {
			throw new BusinessException("AdminDisposalBS-00:传入af56Dto为空!");
		}

		Af56 af56 = new Af56();

		BeanTools.copyProperties(af56Dto, af56);

		CommonHibernateDaoUtils.save(af56);

		BeanTools.copyProperties(af56, af56Dto);

		return af56Dto;
	}

	public Aa10DTO SavaAa10(Aa10DTO aa10Dto) {
		if (aa10Dto == null) {
			throw new BusinessException("AdminDisposalBS-00:传入aa10Dto为空!");
		}

		StringBuffer sql = new StringBuffer(
				" insert into aa10 (aaa100, aaa102, aaa101, aaa103, aaa104, aaa105, aae013, aae100, prseno) "
						+ "values ('APA701', '"
						+ aa10Dto.getAaa102()
						+ "', '稽核问题类型', '"
						+ aa10Dto.getAaa103()
						+ "', '', '', '"
						+ aa10Dto.getAae013()
						+ "', '"
						+ aa10Dto.getAae100() + "'," + " null)");

		CommonJdbcDaoUtils.insert(sql.toString());

		return aa10Dto;
	}

	public Page queryBlackGrayListWithPage(Page page, Ke15DTO ke15Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from ke15 a where a.aaz359 is not null");

		// 案件aaz318
		if (ke15Dto.getAaz318() != null) {
			sql.append(" and a.aaz318 = '" + ke15Dto.getAaz318() + "'");
		}

		// 对象类型
		if (StringTools.hasText(ke15Dto.getApa709())) {
			sql.append(" and a.apa709 = '" + ke15Dto.getApa709() + "'");
		}

		// 对象ID
		if (StringTools.hasText(ke15Dto.getAaz010())) {
			sql.append(" and a.aaz010 = '" + ke15Dto.getAaz010() + "'");
		}

		// 结论类型
		if (StringTools.hasText(ke15Dto.getApa005())) {
			sql.append(" and a.apa005 = '" + ke15Dto.getApa005() + "'");
		}

		// 开始日期
		if (ke15Dto.getAae030() != null) {
			sql.append(" and a.aae030 >= '" + ke15Dto.getAae030() + "'");
		}

		// 终止日期
		if (ke15Dto.getAae031() != null) {
			sql.append(" and a.aae031 <= " + ke15Dto.getAae031() + "");
		}

		// 监控等级
		if (StringTools.hasText(ke15Dto.getApa151())) {
			sql.append(" and a.apa151 = '" + ke15Dto.getApa151() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ke15DTO.class);

		return result;
	}

	public Page queryJudicialProcessWithPage(Page page, Af56DTO af56Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from af56 a where a.aaz332 is not null");

		// 统筹区
		if (StringTools.hasText(af56Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + af56Dto.getAaa027() + "'");
		}

		// 年月
		if (af56Dto.getAae149() != null) {
			String str = String.valueOf(af56Dto.getAae149());
			String s = str.substring(0, 6);
			sql.append(" and a.aae149 = '" + s + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af56DTO.class);

		return result;
	}

	public Page queryAuditTypeWithPage(Page page, Aa10DTO aa10Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from aa10 a where a.aaa100= 'APA701'");
		// 稽核 类型编码
		if (StringTools.hasText(aa10Dto.getAaa102())) {
			sql.append(" and a.aaa102  like '%" + aa10Dto.getAaa102() + "%'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Aa10DTO.class);

		return result;
	}

	public List<Aa10DTO> getAa10List(Aa10DTO aa10Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from aa10 a where a.aaa100= 'APA701'");

		List<Aa10DTO> aa10List = CommonJdbcDaoUtils.query(sql.toString(),
				Aa10DTO.class);

		return aa10List;
	}

	public String getKe15Apa151ByAaz010(String aaz010) {

		StringBuffer sql = new StringBuffer(
				"select min(a.apa151) from ke15 a where a.aaz359 is not null");

		if (StringTools.hasText(aaz010)) {
			sql.append(" and a.aaz010 = '" + aaz010 + "'");
		}

		sql.append(" and a.aae031 > to_char(sysdate,'YYYYMMDD')");

		List<Ke15DTO> ke15List = CommonJdbcDaoUtils.query(sql.toString(),
				Ke15DTO.class);

		String apa151 = null;

		if (ke15List.size() > 0) {

			apa151 = ke15List.get(0) != null ? ke15List.get(0).getApa151()
					: null;

		}

		return apa151;
	}

	public Ac01DTO updateAc01(Ac01DTO ac01Dto) {

		if (ac01Dto == null) {
			throw new BusinessException("AdminDisposalBS-99:修改ac01Dto传入对象为空!");
		}

		if (StringTools.hasText(ac01Dto.getAac001())) {
			throw new BusinessException(
					"AdminDisposalBS-98:修改ac01Dto传入对象 主键 aaz001为空!");
		}

		Ac01 ac01 = CommonHibernateDaoUtils.load(Ac01.class,
				ac01Dto.getAac001());

		BeanTools.copyPropertiesIgnoreNull(ac01Dto, ac01);

		CommonHibernateDaoUtils.update(ac01);

		BeanTools.copyProperties(ac01, ac01Dto);

		return ac01Dto;
	}

	public Kf05DTO updateKf05(Kf05DTO kf05Dto) {

		if (kf05Dto == null) {
			throw new BusinessException("AdminDisposalBS-97:修改ac01Dto传入对象为空!");
		}

		if (StringTools.hasText(kf05Dto.getAaz263())) {
			throw new BusinessException(
					"AdminDisposalBS-96:修改ac01Dto传入对象 主键 aaz263为空!");
		}

		Kf05 kf05 = CommonHibernateDaoUtils.load(Kf05.class,
				kf05Dto.getAaz263());

		BeanTools.copyPropertiesIgnoreNull(kf05Dto, kf05);

		CommonHibernateDaoUtils.update(kf05);

		BeanTools.copyProperties(kf05, kf05Dto);

		return kf05Dto;
	}

	public Kb01DTO updateKb01(Kb01DTO kb01Dto) {

		if (kb01Dto == null) {
			throw new BusinessException("AdminDisposalBS-95:修改ac01Dto传入对象为空!");
		}

		if (StringTools.hasText(kb01Dto.getAaz107())) {
			throw new BusinessException(
					"AdminDisposalBS-94:修改ac01Dto传入对象 主键 aaz107为空!");
		}

		Kb01 kb01 = CommonHibernateDaoUtils.load(Kb01.class,
				kb01Dto.getAaz107());

		BeanTools.copyPropertiesIgnoreNull(kb01Dto, kb01);

		CommonHibernateDaoUtils.update(kb01);

		BeanTools.copyProperties(kb01, kb01Dto);

		return kb01Dto;
	}

	public Page queryAf53Convey(Page page, AuditCaseDTO auditCaseDTO) {

		StringBuffer sql = new StringBuffer(
				"select a.aaz318 ,a.abz001,a.abb006, a.apf094, a.aae426, a.aae189, " +
				"a.aae012, a.aae034, a.acc789,a.apa047, a.abb025, a.aae425, a.ape047, a.apa048, " +
				"a.aae187, a.apa168, a.aae608, b.* from af53 a, af32 b where a.aaz281 = b.aaz281 ");

		// 案件编号
		if (StringTools.hasText(auditCaseDTO.getAbz001())) {
			sql.append(" and a.abz001 like '%" + auditCaseDTO.getAbz001()
					+ "%'");
		}
		// 案件编号
		if (StringTools.hasText(auditCaseDTO.getApf094())) {
			sql.append(" and a.apf094 like '%" + auditCaseDTO.getApf094()
					+ "%'");
		}

		sql.append(" and a.aaz318 is not null and b.aaz281 is not null ");

		sql.append(" and a.aae426 in ('" + AuditConstants.AAE426_CODE_10 + "','"
				+ AuditConstants.AAE426_CODE_5 + "')");

		sql.append(" and a.aae425 in ('" + AuditConstants.AAE425_CODE_0 + "','" + AuditConstants.AAE425_CODE_2 + "')");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditCaseDTO.class);

		return result;
	}

	public Page queryAf34WinthPage(Page page, AuditConveyDTO auditConveyDTO) {

		StringBuffer sql = new StringBuffer(
				"select a.aaz147, a.aaz077, a.aaz318, b.ape008, a.apa709, a.ape724, a.apa708, a.ape741, a.ape728" +
				" from af34 a full join af31 b on a.aaz077 = b.aaz077 where 1=1 ");

		// 根据aaz318
		if (auditConveyDTO.getAaz318() != null) {
			sql.append(" and a.aaz318 = " + auditConveyDTO.getAaz318() + "");
		}

		sql.append(" order by a.aaz147");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditConveyDTO.class);

		return result;
	}

	public Af34DTO saveAf34(Af34DTO af34Dto) {

		if (af34Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-90:保存af34 传入af34Dto为空!");
		}

		Af34 af34 = new Af34();

		BeanTools.copyProperties(af34Dto, af34);

		CommonHibernateDaoUtils.save(af34);

		BeanTools.copyProperties(af34, af34Dto);

		return af34Dto;
	}

	public Af34DTO updateAf34(Af34DTO af34Dto) {

		if (af34Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-89:修改 af34  传入 af34Dto为空!");
		}

		if (!StringTools.hasText(String.valueOf(af34Dto.getAaz147()))) {
			throw new BusinessException(
					"AdminDisposalBS-88:修改 af34  传入 af34Dto 主键 aaz147为空!");
		}

		Af34 af34 = CommonHibernateDaoUtils.load(Af34.class,
				af34Dto.getAaz147());

		BeanTools.copyPropertiesIgnoreNull(af34Dto, af34);

		CommonHibernateDaoUtils.update(af34);

		BeanTools.copyProperties(af34, af34Dto);

		return af34Dto;
	}

	public Af34DTO getAf34ById(String aaz147) {

		Af34DTO af34Dto = new Af34DTO();

		Af34 af34 = CommonHibernateDaoUtils.load(Af34.class,
				Long.parseLong(aaz147));

		if (af34 != null) {
			BeanTools.copyProperties(af34, af34Dto);
		}

		return af34Dto;
	}

	public void deleteAf34ByIds(String aaz147s) {

		if (!StringTools.hasText(aaz147s)) {
			throw new BusinessException(
					"AdminDisposalBS-87:删除 af34  传入 主键 aaz147为空!");
		}

		StringBuffer sql = new StringBuffer(
				"delete from af34 a where 1=1 and a.aaz147 in (" + aaz147s
						+ ")");

		CommonJdbcDaoUtils.delete(sql.toString());
	}

	public Page queryConveyBeAudit(Page page, AuditPersonDTO auditPersonDTO) {

		StringBuffer sql = new StringBuffer(
				"select * from af31 a where a.jlbz = 1 and a.aaz077 is not null ");

		if (auditPersonDTO.getAaz318() == null) {
			throw new BusinessException(
					"AdminDisposalBS-86:根据aaz318  查询 af31 aaz318 为空!");
		}

		if (StringTools.hasText(String.valueOf(auditPersonDTO.getAaz318()))) {
			sql.append(" and a.aaz318 = '" + auditPersonDTO.getAaz318() + "'");
		}

		sql.append(" and a.aae425 in ('" + AuditConstants.AAE425_CODE_0 + "','"
				+ AuditConstants.AAE425_CODE_2 + "')");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditPersonDTO.class);

		return result;
	}

	public Page queryAf53TransTurn(Page page, AuditCaseDTO auditCaseDTO) {

		StringBuffer sql = new StringBuffer("select * from af53 a where 1 = 1 ");

		// 案件编号
		if (StringTools.hasText(auditCaseDTO.getAbz001())) {
			sql.append(" and a.abz001 like '%" + auditCaseDTO.getAbz001()
					+ "%'");
		}
		// 案件状态结论审批通过
		sql.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_10 + "'");

		// 案件 未移交 并且结论为行政处理处罚或司法处理的被稽核对象
		String selectAf31 = "select b.aaz318 from af31 b where b.apa168='"
				+ AuditConstants.APA168_CODE_0 + "' " + "and (b.apa155='"
				+ AuditConstants.APA155_CODE_1 + "' or b.apa158='"
				+ AuditConstants.APA158_CODE_1 + "')";

		sql.append(" and a.aaz318 in (" + selectAf31 + ")");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditCaseDTO.class);

		return result;
	}

	public Page queryAf53StateTrace(Page page, AuditCaseDTO auditCaseDTO) {

		StringBuffer sql = new StringBuffer("select * from af53 a where 1=1 ");

		// 案件编号
		if (StringTools.hasText(auditCaseDTO.getAbz001())) {
			sql.append(" and a.abz001 like '%" + auditCaseDTO.getAbz001()
					+ "%'");
		}
		// 案件状态 已结案
		sql.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_4 + "'");

		// 查询af53中aae426案件状态为4（已结案）,
		// 经办处理处罚标志APA156=1,或者行政处理处罚标志APA155=1并且移交标志apa168='1'(已移交)
		String selectAf31 = "select b.aaz318 from af31 b where "
				+ "b.apa156 = '" + AuditConstants.APA156_CODE_1 + "' or "
				+ "(b.apa155 = '" + AuditConstants.APA155_CODE_1 + "' and "
				+ "b.apa168 = '" + AuditConstants.APA168_CODE_1 + "')";

		sql.append(" and a.aaz318 in (" + selectAf31 + ")");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditCaseDTO.class);

		return result;
	}

	public Page queryTranTurn(Page page, AuditPersonDTO auditPersonDTO) {

		StringBuffer sql = new StringBuffer("select * from af31 a where 1=1 ");

		if (auditPersonDTO.getAaz318() == null) {
			throw new BusinessException(
					"AdminDisposalBS-85:根据aaz318  查询 af31 aaz318 为空!");
		}

		sql.append(" and a.aaz318 = '" + auditPersonDTO.getAaz318() + "'");

		// af31中行政处理处罚标志apa155=1或者司法处理标志apa158=1
		sql.append(" and (a.apa155 = '" + AuditConstants.APA155_CODE_1 + "' "
				+ "or a.apa158 = '" + AuditConstants.APA158_CODE_1 + "')");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditPersonDTO.class);

		return result;
	}

	public Page queryStateTrace(Page page, AuditPersonDTO auditPersonDTO) {

		StringBuffer sql = new StringBuffer("select * from af31 a where 1 = 1 ");

		if (auditPersonDTO.getAaz318() == null) {
			throw new BusinessException(
					"AdminDisposalBS-84:根据aaz318  查询 af31 aaz318 为空!");
		}

		sql.append(" and a.aaz318 = '" + auditPersonDTO.getAaz318() + "'");

		// af31中存在经办处理处罚标志APA156=1,或者行政处理处罚标志APA155=1并且移交标志apa168='1'(已移交)
		sql.append(" and (a.apa156 = '" + AuditConstants.APA156_CODE_1
				+ "' or " + "(a.apa155 = '" + AuditConstants.APA155_CODE_1
				+ "' " + "and a.apa168 = '" + AuditConstants.APA168_CODE_1
				+ "'))");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AuditPersonDTO.class);

		return result;
	}

	public Page queryAf58(Page page, Af58DTO af58Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af58 a where a.aaz323 is not null");

		if (StringTools.hasText(af58Dto.getAaz077())) {
			sql.append(" and a.aaz077 = '" + af58Dto.getAaz077() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af58DTO.class);

		return result;
	}

	public List<Af35DTO> getAf35List(Af35DTO af35Dto) {

		if (af35Dto == null) {
			return null;
		}

		if (af35Dto.getAaz049() == null && af35Dto.getAaz318() == null) {
			return null;
		}

		StringBuffer sql = new StringBuffer(
				" select * from af35 a where a.aaz302 is not null");

		if (af35Dto.getAaz049() != null) {
			sql.append(" and a.aaz077 = '" + af35Dto.getAaz049() + "'");
		}

		if (StringTools.hasText(String.valueOf(af35Dto.getAaz318()))) {
			sql.append(" and a.aaz318 = '" + af35Dto.getAaz318() + "'");
		}

		List<Af35DTO> af35List = CommonJdbcDaoUtils.query(sql.toString(),
				Af35DTO.class);

		return af35List;
	}

	public Af35DTO saveAf35(Af35DTO af35Dto) {

		if (af35Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-83:保存af35 传入 af35Dto 为空!");
		}

		Af35 af35 = new Af35();

		BeanTools.copyProperties(af35Dto, af35);

		CommonHibernateDaoUtils.save(af35);

		BeanTools.copyProperties(af35, af35Dto);

		return af35Dto;
	}

	public Af35DTO updateAf35(Af35DTO af35Dto) {

		if (af35Dto == null) {
			throw new BusinessException("AdminDisposalBS-82:修改af53 传入对象为空!");
		}

		if (af35Dto.getAaz049() == null) {
			throw new BusinessException(
					"AdminDisposalBS-81:修改af53 传入 主键 aaz302为空!");
		}

		Af35 af35 = CommonHibernateDaoUtils.load(Af35.class,
				af35Dto.getAaz049());

		BeanTools.copyPropertiesIgnoreNull(af35Dto, af35);

		CommonHibernateDaoUtils.update(af35);

		BeanTools.copyProperties(af35, af35Dto);

		return af35Dto;
	}

	public Af35DTO getAf35ById(String aaz302) {

		if (!StringTools.hasText(aaz302)) {
			throw new BusinessException(
					"AdminDisposalBS-80:查询 af35 传入 主键 aaz302为空!");
		}

		Af35DTO af35Dto = new Af35DTO();

		Af35 af35 = CommonHibernateDaoUtils.load(Af35.class,
				Long.parseLong(aaz302));

		if (af35 != null) {
			BeanTools.copyProperties(af35, af35Dto);
		}

		return af35Dto;
	}

	public void deleteAf40ByAaa027(String aaa027, String aae149) {
		String sql = "delete from af40 a where a.aae149=" + aae149
				+ " and a.aaa027='" + aaa027 + "'";
		CommonJdbcDaoUtils.delete(sql);
	}

	public void deleteAf41ByAaa027(String aaa027, String aae149) {
		String sql = "delete from af41 a where a.aae149=" + aae149
				+ " and a.aaa027='" + aaa027 + "'";
		CommonJdbcDaoUtils.delete(sql);
	}

	public void deleteAf42ByAaa027(String aaa027, String aae149) {
		String sql = "delete from af42 a where a.aae149=" + aae149
				+ " and a.aaa027='" + aaa027 + "'";
		CommonJdbcDaoUtils.delete(sql);
	}

	public JhtzDTO addAf40(JhtzDTO dto) {
		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_audit_account.prc_Audit_question", dto);
		return dto;
	}

	public JhtzDTO addAf41(JhtzDTO dto) {
		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_audit_account.prc_AuditCaseData", dto);
		return dto;
	}

	public JhtzDTO addAf42(JhtzDTO dto) {
		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_audit_account.prc_execresult_account", dto);
		return dto;
	}

	public Page queryAf40ByAaa027(Page page, Af40DTO dto) {
		String sql = " select * from af40 where aaa027 = '" + dto.getAaa027()
				+ "' and aae149 = " + dto.getAae149();

		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af40DTO.class,
				new Object[] {});
	}

	public Page queryAf41ByAaa027(Page page, Af41DTO dto) {
		String sql = " select * from af41 where aaa027 = '" + dto.getAaa027()
				+ "' and aae149 = " + dto.getAae149();

		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af41DTO.class,
				new Object[] {});
	}

	public Page queryAf42ByAaa027(Page page, Af42DTO dto) {

		String sql = " select * from af42 where aaa027 = '" + dto.getAaa027()
				+ "' and aae149 = " + dto.getAae149();

		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af42DTO.class,
				new Object[] {});
	}

	public Af58DTO getAf58ById(String aaz323) {

		if (!StringTools.hasText(aaz323)) {
			throw new BusinessException(
					"AdminDisposalBS-79:查询 af58 传入 主键 aaz323为空!");
		}

		Af58DTO af58Dto = new Af58DTO();

		Af58 af58 = CommonHibernateDaoUtils.load(Af58.class,
				Long.parseLong(aaz323));

		if (af58 != null) {
			BeanTools.copyProperties(af58, af58Dto);
		}

		return af58Dto;
	}

	public Long getAf40(String aaa027, String aae149) {
		String sql = "select Count(*) from af40 where aaa027 = '" + aaa027
				+ "' and aae149 = " + aae149;
		return CommonJdbcDaoUtils.queryObject(sql, Long.class, new Object[] {});
	}

	public Long getAf41(String aaa027, String aae149) {
		String sql = "select Count(*) from af41 where aaa027 = '" + aaa027
				+ "' and aae149 = " + aae149;
		return CommonJdbcDaoUtils.queryObject(sql, Long.class, new Object[] {});
	}

	public Long getAf42(String aaa027, String aae149) {
		String sql = "select Count(*) from af42 where aaa027 = '" + aaa027
				+ "' and aae149 = " + aae149;
		return CommonJdbcDaoUtils.queryObject(sql, Long.class, new Object[] {});
	}

	public List<Af53DTO> getAf53ByAbz001(String abz001) {

		if (!StringTools.hasText(abz001)) {
			throw new BusinessException(
					"AdminDisposalBS-78:查询 af53 传入 abz001为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from af53 a where a.aaz318 is not null");

		if (StringTools.hasText(abz001)) {
			sql.append(" and a.abz001 = '" + abz001 + "'");
		}

		List<Af53DTO> af53List = CommonJdbcDaoUtils.query(sql.toString(),
				Af53DTO.class);

		return af53List;
	}

	public Page queryAf53ByAf31(Page page, AuditInfoDTO dto) {
		StringBuffer sql = new StringBuffer(
				"select distinct a.* from Af53 a,Af31 b where a.aaz318 = b.aaz318");
		// aaa027 统筹区
		if (StringTools.hasText(dto.getAaa027())) {
			sql.append(" and b.aaa027 = '" + dto.getAaa027() + "'");
		}
		// 经办日期 aae036begin aae036end
		if (StringTools.hasText(dto.getAae036begin())) {
			sql.append(" and b.aae036 >= to_date('" + dto.getAae036begin()
					+ " 00:00:00','yyyy-mm-dd HH24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAae036end())) {
			sql.append(" and b.aae036 <= to_date('" + dto.getAae036end()
					+ " 23:59:59','yyyy-mm-dd HH24:mi:ss')");
		}
		// 结论确认日期 aae034begin
		if (StringTools.hasText(dto.getAae034begin())) {
			sql.append(" and b.aae034 >= "
					+ dto.getAae034begin().replace("-", ""));
		}
		if (StringTools.hasText(dto.getAae034end())) {
			sql.append(" and b.aae034 <= "
					+ dto.getAae034end().replace("-", ""));
		}
		// 移交日期abb087begin
		if (StringTools.hasText(dto.getAbb087begin())) {
			sql.append(" and b.abb087 >= "
					+ dto.getAbb087begin().replace("-", ""));
		}
		if (StringTools.hasText(dto.getAbb087end())) {
			sql.append(" and b.abb087 <= "
					+ dto.getAbb087end().replace("-", ""));
		}
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class, new Object[] {});
	}

	public Page queryAf31ByAaz318(Page page, String aaz318) {
		String sql = "select * from af31 where 1=1";
		if (!StringTools.hasText(aaz318)) {
			throw new BusinessException(
					"AdminDisposalBS-106:查询 af31 传入 aaz318为空!");
		}
		sql += " and aaz318 = " + aaz318;

		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af31DTO.class);
	}

	public List<Af53DTO> getaf53List(Af53DTO af53Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af53 a where a.aaz318 is not null");

		sql.append(" and a.abz001 is not null ");

		List<Af53DTO> af53List = CommonJdbcDaoUtils.query(sql.toString(),
				Af53DTO.class);

		return af53List;
	}

	public Af31DTO queryAf31ByAaz077(String aaz077) {
		String sql = "select * from af31 where aaz077 = '" + aaz077 + "'";
		return CommonJdbcDaoUtils.get(sql, Af31DTO.class);
	}

	public Af35DTO queryAf35ByAaz077(String aaz077) {
		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException(
					"AdminDisposalBS-107:查询 af35 传入 aaz077为空!");
		}
		String sql = "select * from af35 where aaz077 = '" + aaz077 + "'";
		return CommonJdbcDaoUtils.get(sql, Af35DTO.class);
	}

	public List<Kb01DTO> getKb01List(Kb01DTO kb01Dto) {

		StringBuffer sql = new StringBuffer(" select * from kb01 a where 1=1 ");

		if (StringTools.hasText(kb01Dto.getAkb021())) {
			sql.append(" and a.akb021 like '%" + kb01Dto.getAkb021() + "'");
		}

		List<Kb01DTO> kb01List = CommonJdbcDaoUtils.query(sql.toString(),
				Kb01DTO.class);

		return kb01List;
	}

	public Page queryAf53WithUserId(Page page, Af53DTO dto) {
		// StringBuffer sql = new
		// StringBuffer("select  aaa027,aaz318,abz001,abb006,apf094,aae426,aae189,aae011,aae036,aae012,aae034,(select b.name from uap_user b where b.USERID=a.acc789) acc789,apa047,aaz281,aae425,abb025  from Af53 a where 1=1 ");
		return null;
	}

	public Page queryKa59WithPage(Page page, Ka59DTO dto) {
		StringBuffer sql = new StringBuffer("select * from ka59 where 1=1");
		// 统筹区 aaa027
		if (StringTools.hasText(dto.getAaa027())) {
			sql.append(" and aaa027 = '" + dto.getAaa027() + "'");
		}
		// 对象类型apa709
		if (StringTools.hasText(dto.getApa709())) {
			sql.append(" and apa709 = '" + dto.getApa709() + "'");
		}
		// 对象ID aaz010
		if (dto.getAaz010() != null && dto.getAaz010() > 0L) {
			sql.append(" and aaz010 = " + dto.getAaz010());
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and ape031 = '" + dto.getApe031() + "'");
		}
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}

		// 监控类型 aaa153
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and aaa153 = '" + dto.getAaa153() + "'");
		}
		// 执行批次号 aae319
		if (dto.getAae319() != null && dto.getAae319() > 0) {
			sql.append(" and aae319 = " + dto.getAae319());
		}
		// 规则ID aaz319
		if (dto.getAaz319() != null && dto.getAaz319() > 0) {
			sql.append(" and aaz319 = " + dto.getAaz319());
		}

		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and aka122 = '" + dto.getAka122() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and aka130 = '" + dto.getAka130() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and akc021 = '" + dto.getAkc021() + "'");
		}
		// 权值范围 ape735

		if (dto.getApe735() != null && dto.getApe735() > 0) {
			sql.append(" and ape735 = " + dto.getApe735());
		}
		// 问题记录ID aaz281
		if (dto.getAaz281() != null && dto.getAaz281() > 0) {
			sql.append(" and aaz281 = " + dto.getAaz281());
		}
		// 经办时间 AAE036
		if (StringTools.hasText(dto.getAae036begin())) {
			sql.append(" and aae036 >= to_date('" + dto.getAae036begin()
					+ " 00:00:00','yyyy-mm-dd:hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAae036end())) {
			sql.append(" and aae036 >= to_date('" + dto.getAae036end()
					+ " 23:59:59','yyyy-mm-dd:hh24:mi:ss')");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka59DTO.class, new Object[] {});
	}

	public Ka59DTO getKa59ByAAz328(Long aaz328) {
		if (aaz328 == null || aaz328 <= 0) {
			throw new BusinessException(
					"AdminDisposalBS-107:查询 ka59 传入 aaz328为空!");
		}
		String sql = "select * from ka59 where aaz328 = " + aaz328;
		return CommonJdbcDaoUtils.get(sql, Ka59DTO.class);
	}

	public Page queryKa52Kc24ByAaz328(Page page, Long aaz328) {
		if (aaz328 == null || aaz328 <= 0) {
			throw new BusinessException(
					"AdminDisposalBS-107:查询 ka54 kc24 传入 aaz328为空!");
		}
		String sql = "SELECT A.aac003,A.aac004,A.aac002,A.akb021,"
				+ "A.aae004,A.aka130,A.akc194,A.aae030,A.aae031,"
				+ "B.akc264,B.ake039,B.akc194 as akc194j,B.akc021,A.aka122,A.aaz217,A.aaz328,"
				+ "A.ake024,B.ake038,B.akb067,B.akc254,B.akc253,"
				+ "B.ake029,B.ake035,B.ake043,B.ake032,B.ake042 "
				+ "FROM ka52 A,Kc24 B  where A.aaz217 = B.aaz217(+)"
				+ " and A.aaz328 = '" + aaz328 + "' order by A.akc194";
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Ka52Kc24DTO.class);
	}

	public Page queryAf31ByAaz010(Page page, String aaz010) {
		if (!StringTools.hasText(aaz010)) {
			throw new BusinessException(
					"AdminDisposalBS-108:查询 af31 传入 aaz010为空!");
		}
		String sql = "select * from af31 where aaz010 = '" + aaz010 + "'";
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af31DTO.class);
	}

	public Page queryKc23KC23(Page page, Kc23Kc22DTO dto) {
		if (!StringTools.hasText(dto.getAaz328())) {
			throw new BusinessException(
					"AdminDisposalBS-109:查询 KC23,KC22 传入 aaz328为空!");
		}
		if (!StringTools.hasText(dto.getAaz217())) {
			throw new BusinessException(
					"AdminDisposalBS-110:查询 KC23,KC22 传入 aaz217为空!");
		}
		String sql = "select a.aaz210,a.aaz217,a.aaz263,a.akc221,a.aae019,a.aka017,"
				+ "(select '1' from ka53 c where c.aaz210 = a.aaz210 and c.aaz328 = '"
				+ dto.getAaz328()
				+ "' and rownum = 1) aaz328k,"
				+ "(select t.aae317 from ka59 t where t.aaz328 = '"
				+ dto.getAaz328()
				+ "' and rownum = 1) as aae317k,"
				+ "(select '1' from ka54 d where d.aaz213 = b.aaz213 and d.aaz328 = '"
				+ dto.getAaz328()
				+ "' and rownum = 1) as aaz328m,"
				+ "(select t.aae317 from ka59 t where t.aaz328 = '"
				+ dto.getAaz328()
				+ "' and rownum = 1) as aae317m,"
				+ "b.ake002,b.aaz213,b.ake003,b.aka063,b.akc226,b.akc225,b.akb065,"
				+ "b.akc229,b.aka065,b.aka081,b.ake135,b.aka072,b.aka071,b.akc231,"
				+ "b.ake131,b.aka029,b.aka031,b.aka032,b.aka033,b.aka070,b.aka064,"
				+ "b.aka184,b.aka166,b.aka172,b.aka187,b.aac004,b.aka169,b.aka170,"
				+ "b.aka196,b.aka197,b.ake001 "
				+ "from kc23 a,kc22 b "
				+ "where a.aaz210 = b.aaz210 and a.aaz217 = b.aaz217 and a.aaz217 in("
				+ dto.getAaz217() + ") order by aaz328k,aaz328m,akc221";
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Kc23Kc22DTO.class);
	}

	public Page countKc22ByAKE003(Page page, String aaz217) {
		String sql = "";
		if (StringTools.hasText(aaz217)) {
			if ("0".equals(aaz217)) {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKE003 = d.AAA102  and d.AAA100 = 'AKE003'   GROUP BY a.AKE003 ";
			} else {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKE003 = d.AAA102  and d.AAA100 = 'AKE003'  and a.AAZ217 IN ("
						+ aaz217 + ") GROUP BY a.AKE003 ";
			}
		} else {
			throw new BusinessException(
					"AdminDisposalBS-111:查询 KC22 传入 aaz217为空!");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql, CountDTO.class);
	}

	public Page countKc22ByAKA063(Page page, String aaz217) {
		String sql = "";
		if (StringTools.hasText(aaz217)) {
			if ("0".equals(aaz217)) {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA063 = d.AAA102  and d.AAA100 = 'AKA063' GROUP BY a.AKA063 ";
			} else {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA063 = d.AAA102  and d.AAA100 = 'AKA063'  and a.AAZ217 IN ("
						+ aaz217 + ") GROUP BY a.AKA063";
			}
		} else {
			throw new BusinessException(
					"AdminDisposalBS-112:查询 KC22 传入 aaz217为空!");
		}

		return CommonJdbcDaoUtils.queryWithPage(page, sql, CountDTO.class);
	}

	public Page countKc22ByAKA032(Page page, String aaz217) {
		String sql = "";
		if (StringTools.hasText(aaz217)) {
			if ("0".equals(aaz217)) {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA032 = d.AAA102  and d.AAA100 = 'AKA032' GROUP BY a.AKA032";
			} else {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA032 = d.AAA102  and d.AAA100 = 'AKA032'  and a.AAZ217 IN ("
						+ aaz217 + ") GROUP BY a.AKA032 ";
			}
		} else {
			throw new BusinessException(
					"AdminDisposalBS-113:查询 KC22 传入 aaz217为空!");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql, CountDTO.class);
	}

	public Page countKc22ByAKA065(Page page, String aaz217) {
		String sql = "";
		if (StringTools.hasText(aaz217)) {
			if ("0".equals(aaz217)) {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA065 = d.AAA102  and d.AAA100 = 'AKA065' GROUP BY a.AKA065";
			} else {
				sql = "select MAX(d.AAA103) as label, SUM(a.akb065) as value, '合计' as sum_text from KC22 a, AA10 d where 1=1  and a.AKA065 = d.AAA102  and d.AAA100 = 'AKA065'  and a.AAZ217 IN ("
						+ aaz217 + ") GROUP BY a.AKA065";
			}
		} else {
			throw new BusinessException(
					"AdminDisposalBS-114:查询 KC22 传入 aaz217为空!");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql, CountDTO.class);
	}

	public List<Af55DTO> getAf55List() {

		StringBuffer sql = new StringBuffer(
				" select * from af55 a where a.aaz322 is not null ");

		List<Af55DTO> af55List = CommonJdbcDaoUtils.query(sql.toString(),
				Af55DTO.class);

		return af55List;
	}

	public Page queryKa06WithPage(Page page, Ka06DTO dto) {
		if (dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-114:查询 KA06 传入 Ka06DTO为空!");
		}
		String sql = "Select t.AKA120,t.AKA121,t.AKA122 from Ka06 t where t.aae100 = '1' ";
		if (StringTools.hasText(dto.getAka122())) {
			sql += " and t.aka122 = '" + dto.getAka122() + "'";
		}
		if (StringTools.hasText(dto.getAka121())) {
			sql += " and t.aka121 = '" + dto.getAka121() + "'";
		}
		if (StringTools.hasText(dto.getAka120())) {
			sql += " and t.aka120 = '" + dto.getAka120() + "'";
		}
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Ka06DTO.class);
	}

	public Page queryAf55WithPage(Page page, Af55DTO af55Dto) {

		StringBuffer sql = new StringBuffer(
				"select * from af55 a where a.aaz322 is not null");

		// 处理对象名称 ape035
		if (StringTools.hasText(af55Dto.getApe035())) {
			sql.append(" and a.ape035 like '%" + af55Dto.getApe035() + "%'");
		}

		// 处理对象类型 apa709
		if (StringTools.hasText(af55Dto.getApa709())) {
			sql.append(" and a.apa709 = '" + af55Dto.getApa709() + "'");
		}

		// 审批标志 akc175
		if (StringTools.hasText(af55Dto.getAkc175())) {
			sql.append(" and a.akc175 = '" + af55Dto.getAkc175() + "'");
		}

		// 处理决定类型 apa152
		if (StringTools.hasText(af55Dto.getApa152())) {
			sql.append(" and a.apa152 = '" + af55Dto.getApa152() + "'");
		}

		// 不予处理标志 apa154
		if (StringTools.hasText(af55Dto.getApa154())) {
			sql.append(" and a.apa154 = '" + af55Dto.getApa154() + "'");
		}

		// 违规情节 apf094
		if (StringTools.hasText(af55Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af55Dto.getApf094() + "%'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af55DTO.class);

		return result;
	}

	public Page queryAc01ByAaa153(Page page, Ka59DTO dto) {
		if (dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-115:查询 AC01 传入 Ka59DTO为空!");
		}
		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT cc.*,");
		sql.append(" c.AAC003 as rymc, ");
		sql.append(" c.AAC003 as aac003, ");
		sql.append(" c.AAC004 as aac004, ");
		sql.append(" c.AAC006 as aac006, ");
		sql.append(" c.AAC084 as aac084, ");
		sql.append(" c.AAC002 as aac002, ");
		sql.append(" c.APA151 as apa151 ");
		sql.append(" FROM ( SELECT ");
		sql.append(" bb.AAZ010 as rybh, ");
		sql.append(" max(bb.APE031) as ape031, ");
		sql.append(" COUNT(bb.AAZ010) as wgs, ");
		sql.append(" SUM(NVL(bb.APE735, 0)) as qzz");
		sql.append(" FROM (SELECT a.AAZ010 as aaz010, ");
		sql.append(" MAX(a.AAZ328) as aaz328, ");
		sql.append(" MAX(a.APE031) as ape031, ");
		sql.append(" a.AAZ319 as aaz319, ");
		sql.append(" SUM(NVL(a.APE735, 0)) as ape735 ");
		sql.append(" FROM KA59 a ");

		sql.append(" WHERE a.APA709 = '1' ");// 对象类型为 个人
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// getAaa153
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.aaa153 = '" + dto.getAaa153() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + dto.getAkc021() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}
		// aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.aka130 = '" + dto.getAka130() + "'");
		}
		// 对象ID aaz010
		if (dto.getAaz010() != null && dto.getAaz010() > 0L) {
			sql.append(" and a.aaz010 = " + dto.getAaz010());
		}
		// aka101
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and a.aka101 = '" + dto.getAka101() + "'");
		}
		// aae140
		if (StringTools.hasText(dto.getAae140())) {
			sql.append(" and a.aae140 = '" + dto.getAae140() + "'");
		}

		sql.append(" GROUP BY a.AAZ010,a.AAZ319,a.AAA155 ");// 按对象编号AAZ010、规则idAAZ319、阈值级别统计AAA155
		sql.append(" )  bb ");
		sql.append(" GROUP BY bb.AAZ010 ) cc,AC01 c ");
		sql.append(" where cc.rybh = c.aac001 ");
		sql.append(" order by qzz DESC,rybh DESC ");
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				CbrDTO.class);
	}

	public List<CountDTO> getKa59List(Ka59DTO dto) {
		if (dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-115:查询 AC01 传入 Ka59DTO为空!");
		}
		StringBuffer sql = new StringBuffer("");
		sql.append("select max(btemp.AAA103) as  label,COUNT(1) as  value,btemp.AAA153 as sum_text  FROM ( ");
		sql.append(" SELECT a.AAZ010 as aaz010,a.AAA153 as aaa153,max(c.AAA103) as aaa103 ");
		sql.append(" FROM KA59 a,AA10 c ");
		sql.append(" WHERE 1=1  ");
		sql.append(" AND a.AAA153 = c.AAA102 "); // 码表关联 规则分类
		sql.append(" AND c.AAA100 = 'AAA153' "); // 码表类型
		sql.append(" AND a.APA709 = '1' "); // 对象类型为 个人

		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + dto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.aka130 = '" + dto.getAka130() + "'");
		}
		// aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// aka101
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and a.aka101 = '" + dto.getAka101() + "'");
		}
		// 对象ID aaz010
		if (dto.getAaz010() != null && dto.getAaz010() > 0L) {
			sql.append(" and a.aaz010 = " + dto.getAaz010());
		}
		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}
		// aae140
		if (StringTools.hasText(dto.getAae140())) {
			sql.append(" and a.aae140 = '" + dto.getAae140() + "'");
		}
		sql.append(" GROUP BY a.aaz010,a.aaa153 ");
		sql.append(" ) btemp ");
		sql.append(" GROUP BY btemp.aaa153");
		// System.out.println(sql);
		return CommonJdbcDaoUtils.query(sql.toString(), CountDTO.class);
	}

	public Page queryRulesByPerson(Page page, PersonDTO dto) {
		if (dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-116:查询 KA59KA44 传入 PersonDTO为空!");
		}

		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT a. AAZ319 as gzid, MAX(b.AAA167) as gzmc,MAX(a.AAA005) as yz,"
				+ "SUM(a.APE735) as qz,MAX(a.AAA153) as aaa153,to_char(a.AAA155) as aaa155,MAX(a.ABB057) as sj,MAX(a.AAE317) as sm,MAX(a.AAE420) as sjz,"
				+ "COUNT(a.AAZ319) as wgs  ");
		sql.append(" FROM KA59 a,KA44 b ");
		sql.append(" WHERE a.AAZ319 = b.AAZ319 ");
		sql.append(" AND a.APA709 = '1' "); // 对象类型为 个人
		// 人员编号
		if (StringTools.hasText(dto.getAac001())) {
			sql.append(" and a.AAZ010 = '" + dto.getAac001() + "'");
		}
		// 规则分类
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153 = '" + dto.getAaa153() + "'");
		}
		// 阈值级别
		if (StringTools.hasText(dto.getAaa155())) {
			sql.append(" and a.AAA155 = '" + dto.getAaa155() + "'");
		}
		// 监控日期
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 规则
		if (dto.getRules() != null && dto.getRules().trim().length() > 1) {
			sql.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}
		// 监控医疗类别
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + dto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.aka130 = '" + dto.getAka130() + "'");
		}
		// aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// aka101
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and a.aka101 = '" + dto.getAka101() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}
		// aae140
		if (StringTools.hasText(dto.getAae140())) {
			sql.append(" and a.aae140 = '" + dto.getAae140() + "'");
		}
		// 医疗类别
		sql.append(" GROUP BY a.AAZ319,a.AAA155 "); // 增加对阈值级别的分类
		sql.append(" ORDER BY qz DESC,sjz DESC");

		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				RulesDTO.class);
	}

	public Page getAf53WithPage(Page page, Af53DTO af53Dto) {

		StringBuffer sql = new StringBuffer("select * from af53 a where 1 = 1 ");

		// 案件编号 abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		String strAf31 = "select b.aaz318 from af31 b where b.aaz077 is not null and b.apa011 = '"
				+ AuditConstants.APA011_CODE_1 + "'";

		sql.append(" and a.aaz318 in (" + strAf31 + ")");

		sql.append(" order by a.aaz318 desc");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}

	public Page queryAc02ByAac001(Page page, String aac001) {
		if (!StringTools.hasText(aac001)) {
			throw new BusinessException(
					"AdminDisposalBS-117:查询 AC02 传入 aac001为空!");
		}
		String sql = "select * from ac02 where aac001 = '" + aac001 + "'";
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Ac02DTO.class);
	}

	public List<CountDTO> queryDoctorList(DoctorDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-118:传入 DTO为空!");
		}
		String aka101 = dto.getAka101(); // 医院等级
		String akb021 = dto.getAkb021(); // 医院名称
		String akb020 = dto.getAkb020(); // 医院编号
		StringBuffer sql = new StringBuffer("");
		sql.append("select MAX(btemp.aaa103) label,COUNT(1) value,btemp.aaa153 sum_text  FROM ( ");
		sql.append(" SELECT a.AAZ010 as aaz010,a.AAA153 as aaa153,MAX(c.AAA103) as aaa103 ");
		sql.append(" FROM KA59 a,KF05 b,AA10 c ");
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb020 != null && akb020.length() > 0)) {
			sql.append(",KB01 d ");
		}
		sql.append(" WHERE 1=1  ");
		sql.append(" AND a.AAZ010 = b.AAZ263 ");
		sql.append(" AND a.AAA153 = c.AAA102 "); // 码表关联 规则分类
		sql.append(" AND c.AAA100 = 'AAA153' "); // 码表类型
		sql.append(" AND a.APA709 = '2' "); // 对象类型为 医师
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb020 != null && akb020.length() > 0)) {
			sql.append(" AND b.AAZ107 = d.AAZ107 ");
		}
		// 监控日期
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 医师名称(对象名称)
		if (StringTools.hasText(dto.getAac003())) {
			sql.append(" and a.APE035 = '" + dto.getAac003() + "'");
		}
		// 医师编号(对象ID)
		if (StringTools.hasText(dto.getAaz263())) {
			sql.append(" and a.AAZ010 = '" + dto.getAaz263() + "'");
		}
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and d.AKA101 = '" + dto.getAka101() + "'");
		}
		// 医院名称
		if (StringTools.hasText(dto.getAkb021())) {
			sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
		}
		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and d.AKB020 = '" + dto.getAkb020() + "'");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}
		sql.append(" GROUP BY a.AAZ010,a.AAA153 ");
		sql.append(" ) btemp ");
		sql.append(" GROUP BY btemp.AAA153");

		return CommonJdbcDaoUtils.query(sql.toString(), CountDTO.class);
	}

	public Page queryDoctorWithPage(Page page, DoctorDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-119:传入 DTO为空!");
		}

		String aka101 = dto.getAka101(); // 医院等级
		String akb021 = dto.getAkb021(); // 医院名称
		String akb020 = dto.getAkb020(); // 医院编号

		StringBuffer sql = new StringBuffer("");

		sql.append(" SELECT  ");
		sql.append(" bb.AAZ010 as ysbh, ");
		sql.append(" max(bb.APE031) as ape031, ");

		sql.append(" MAX((select aac003 from KF05 where aaz263=bb.aaz010)) as ysmc, ");
		sql.append(" MAX((select aae386 from KF06 where aaz307=bb.aaz307)) as aae386 , ");
		sql.append(" MAX((select akb020 from KB01 where aaz107=bb.aaz107)) as akb020 , ");
		sql.append(" MAX((select akb021 from KB01 where aaz107=bb.aaz107)) as akb021 , ");
		sql.append(" MAX((select akc057 from KF05 where aaz263=bb.aaz010)) as akc057, ");
		sql.append(" MAX((select apa151 from KF05 where aaz263=bb.aaz010)) as apa151, ");

		sql.append(" COUNT(bb.AAZ010) as wgs, ");
		sql.append(" SUM(NVL(bb.APE735, 0)) as qzz ");
		sql.append(" FROM (SELECT a.AAZ010 as aaz010, ");
		sql.append(" MAX(a.APE031) as ape031, ");
		sql.append(" a.AAZ319 as aaz319, ");
		sql.append(" MAX(c.aaz307) as aaz307, ");
		sql.append(" MAX(c.aaz107) as aaz107, ");
		sql.append(" SUM(NVL(a.APE735,0)) as ape735 ");
		sql.append(" FROM KA59 a, KF05 c ");
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb020 != null && akb020.length() > 0)) {
			sql.append(",KB01 d ");
		}
		sql.append(" WHERE 1=1 ");
		sql.append(" AND a.AAZ010 = c.AAZ263 "); // 对象ID和医师ID关联
		sql.append(" AND a.APA709 = '2' "); // 对象类型为 医师
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb020 != null && akb020.length() > 0)) {
			sql.append(" AND c.aaz107 = d.aaz107 ");
		}
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 规则分类
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153 = '" + dto.getAaa153() + "'");
		}
		// 医师名称(对象名称)
		if (StringTools.hasText(dto.getAac003())) {
			sql.append(" and a.APE035 = '" + dto.getAac003() + "'");
		}
		// 医师编号(对象ID)
		if (StringTools.hasText(dto.getAaz263())) {
			sql.append(" and a.AAZ010 = '" + dto.getAaz263() + "'");
		}
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and d.AKA101 = '" + dto.getAka101() + "'");
		}
		// 医院名称
		if (StringTools.hasText(dto.getAkb021())) {
			sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
		}
		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and d.AKB020 = '" + dto.getAkb020() + "'");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}

		sql.append(" GROUP BY a.AAZ010,a.AAZ319,a.AAA155 ");
		sql.append(" ) bb ");
		sql.append(" GROUP BY bb.AAZ010 ");
		sql.append(" ORDER BY qzz DESC,ysbh DESC ");

		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				YsDTO.class);
	}

	public Page queryRolesByDoctor(Page page, DoctorDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-120:传入 DTO为空!");
		}
		// String aaa153 = dto.getAaa153(); //疑点类别
		String aka101 = dto.getAka101(); // 医院等级
		String akb021 = dto.getAkb021(); // 医院名称
		String akb020 = dto.getAkb020(); // 医院编号
		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT a. AAZ319   as gzid, MAX(b.AAA167)  as gzmc, MAX(a.AAA005) as yz,"
				+ "SUM(a.APE735) as qz, to_char(a.AAA155) as aaa155, MAX(a.ABB057) as sj,MAX(a.AAE317) as sm, MAX(a.AAE420)   as sjz,"
				+ "COUNT(a.AAZ319) as wgs  ");
		sql.append(" FROM KA59 a,KA44 b ");
		sql.append(" WHERE a.AAZ319 = b.AAZ319 ");
		sql.append(" AND a.APA709 = '2' "); // 对象类型为 医师
		// 医师编号(对象ID)
		if (StringTools.hasText(dto.getAaz263())) {
			sql.append(" and a.AAZ010 = '" + dto.getAaz263() + "'");
		}
		// 规则分类
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153 = '" + dto.getAaa153() + "'");
		}

		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 规则
		if (dto.getRules() != null && dto.getRules().trim().length() > 1) {
			sql.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}

		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.AKA130 = '" + dto.getAka130() + "'");
		}
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.AKC021 = '" + dto.getAkc021() + "'");
		}
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.AKA122 = '" + dto.getAka122() + "'");
		}
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb020 != null && akb020.length() > 0)) {
			sql.append(" and  exists ");
			sql.append(" ( select 'x' from kf05 b,kb01 d where a.aaz010 = b.aaz263 AND b.aaz107 = d.aaz107 ");
			// 医院等级
			if (StringTools.hasText(dto.getAka101())) {
				sql.append(" and d.AKA101 = '" + dto.getAka101() + "'");
			}
			// 医院名称
			if (StringTools.hasText(dto.getAkb021())) {
				sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
			}
			// 医院编号
			if (StringTools.hasText(dto.getAkb020())) {
				sql.append(" and d.AKB020 = '" + dto.getAkb020() + "'");
			}

			sql.append(" ) ");
		}
		sql.append(" GROUP BY a.AAZ319,a.AAA155 ");// 增加对阈值级别的分类
		sql.append(" ORDER BY MAX(a.APE735) DESC");
		// System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				RulesDTO.class);
	}

	public List<CountDTO> queryHospitalList(HospitalDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-121:传入 DTO为空!");
		}
		String aka101 = dto.getAka101(); // 医院等级
		String akb021 = dto.getAkb021(); // 医院名称
		String akb022 = dto.getAkb022(); // 医院名称
		StringBuffer sql = new StringBuffer("");
		sql.append("select max(btemp.aaa103) as label,COUNT(1) as  value,btemp.aaa153 as sum_text  FROM ( ");
		sql.append(" SELECT a.aaz010 as aaz010,a.aaa153 as aaa153,max(c.aaa103) as aaa103 ");
		sql.append(" FROM KA59 a,AA10 c");
		sql.append(" WHERE 1=1  ");
		sql.append(" AND a.AAA153 = c.AAA102 "); // 码表关联 规则分类
		sql.append(" AND c.AAA100 = 'AAA153' "); // 码表类型
		sql.append(" AND a.APA709 = '3' "); // 对象类型为 医院

		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and a.AAZ010 = '" + dto.getAkb020() + "'");
		}
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb022 != null && akb022.length() > 0)) {
			sql.append(" and  exists ");
			sql.append(" ( select 'x' from kb01 d where a.aaz010 = d.akb020 ");
			// 医院等级
			if (StringTools.hasText(dto.getAka101())) {
				sql.append(" and d.AKA101 = '" + dto.getAka101() + "'");
			}
			// 医院名称
			if (StringTools.hasText(dto.getAkb021())) {
				sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
			}
			// 医院编号
			if (StringTools.hasText(dto.getAkb020())) {
				sql.append(" and d.AKB020 = '" + dto.getAkb020() + "'");
			}
			// 医疗服务机构类型
			if (StringTools.hasText(dto.getAkb022())) {
				sql.append(" and d.AKB022 = '" + dto.getAkb022() + "'");
			}
			sql.append(" ) ");
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}

		sql.append(" GROUP BY a.aaz010,a.aaa153 ");
		sql.append(" ) btemp ");
		sql.append(" GROUP BY btemp.aaa153");
		// System.out.println(sql);

		return CommonJdbcDaoUtils.query(sql.toString(), CountDTO.class);
	}

	public Page queryHospitalWithPage(Page page, HospitalDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-122:传入 DTO为空!");
		}

		StringBuffer sql = new StringBuffer("");

		sql.append("SELECT  ");
		sql.append(" bb.AAZ010 as yybh,");
		sql.append(" COUNT(bb.AAZ010) as wgs, ");
		sql.append(" SUM(NVL(APE735, 0)) as qzz, ");
		sql.append(" MAX(d.AKB021) as yymc, ");
		sql.append(" MAX(d.AKB022) as akb022, ");
		sql.append(" MAX(d.AKA101) as aka101, ");
		sql.append(" MAX(d.AKB012) as akb012, ");
		sql.append(" MAX(d.AKB026) as akb026, ");
		sql.append(" MAX(d.AKB020) as akb020, ");
		sql.append(" MAX(BB.APE031) as ape031");
		sql.append(" FROM (SELECT a.AAZ010 as aaz010, ");
		sql.append(" MAX(a.AAZ328) as aaz328, ");
		sql.append(" MAX(a.APE031) as ape031, ");
		sql.append(" a.AAZ319 as aaz319, ");
		sql.append(" SUM(NVL(a.APE735, 0)) as ape735 ");
		sql.append(" FROM KA59 a");
		sql.append(" WHERE 1=1 ");
		sql.append(" AND a.APA709 = '3' "); // 对象类型为 医院

		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}

		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 规则分类
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153 = '" + dto.getAaa153() + "'");
		}
		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and a.AAZ010 = '" + dto.getAkb020() + "'");
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.AKA122 = '" + dto.getAka122() + "'");
		}

		sql.append(" GROUP BY a.AAZ010,a.AAZ319,a.AAA155 ");
		sql.append(" )  bb , KB01 d ");
		sql.append(" where bb.AAZ010 = d.AAZ107 "); // 对象ID和医院ID关联
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and d.AKA101 = '" + dto.getAka101() + "'");
		}
		// 医疗服务机构类型
		if (StringTools.hasText(dto.getAkb022())) {
			sql.append(" and d.AKB022 = '" + dto.getAkb022() + "'");
		}
		// 医院名称
		if (StringTools.hasText(dto.getAkb021())) {
			sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
		}
		sql.append(" GROUP BY bb.AAZ010 ");
		sql.append(" order by qzz DESC,yybh DESC ");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				HospDTO.class);
	}

	public Page queryRolesByHospital(Page page, HospitalDTO dto) {
		if (dto == null) {
			throw new BusinessException("AdminDisposalBS-122:传入 DTO为空!");
		}

		String aka101 = dto.getAka101(); // 医院等级
		String akb021 = dto.getAkb021(); // 医院名称
		String akb022 = dto.getAkb022(); // 医疗服务机构类型
		StringBuffer sql = new StringBuffer("");
		sql.append("SELECT a. AAZ319   as gzid, MAX(b.AAA167)  as gzmc, MAX(a.AAA005) as yz,"
				+ "SUM(a.APE735) as qz,MAX(a.aaa153) as aaa153, to_char(a.AAA155) as aaa155, MAX(a.ABB057) as sj, MAX(a.AAE317) as sm, MAX(a.AAE420)   as sjz,"
				+ "COUNT(a.AAZ319) as wgs  ");
		sql.append(" FROM KA59 a,KA44 b ");
		sql.append(" WHERE a.AAZ319 = b.AAZ319 ");
		sql.append(" AND a.APA709 = '3' "); // 对象类型为医院

		// 人员编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and a.AAZ010 = '" + dto.getAkb020() + "'");
		}
		// 规则分类
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153= '" + dto.getAaa153() + "'");
		}
		// 监控日期
		// 监控日期 abb057
		if (StringTools.hasText(dto.getAbb057begin())) {
			sql.append(" and a.abb057 >= to_date('" + dto.getAbb057begin()
					+ " 00:00:00','yyyy-mm-dd hh24:mi:ss')");
		}
		if (StringTools.hasText(dto.getAbb057end())) {
			sql.append(" and a.abb057 <= to_date('" + dto.getAbb057end()
					+ " 23:59:59','yyyy-mm-dd hh24:mi:ss')");
		}
		// 规则
		if (dto.getRules() != null && dto.getRules().trim().length() > 1) {
			sql.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}

		// 疑点状态 ape031
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 医疗类别 aaa178
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}

		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sql.append(" and a.AAZ010 = '" + dto.getAkb020() + "'");
		}
		// 如果有医院相关信息
		if ((aka101 != null && aka101.length() > 0)
				|| (akb021 != null && akb021.length() > 0)
				|| (akb022 != null && akb022.length() > 0)) {
			sql.append(" and  exists ");
			sql.append(" ( select 'x' from kb01 d where a.aaz010 = d.akb020 ");
			// 医院名称
			if (StringTools.hasText(dto.getAkb021())) {
				sql.append(" and d.AKB021 like '%" + dto.getAkb021() + "%'");
			}
			// 医疗服务机构类型
			if (StringTools.hasText(dto.getAkb022())) {
				sql.append(" and d.AKB022 = '" + dto.getAkb022() + "'");
			}
			sql.append(" ) ");
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.AKA122 = '" + dto.getAka122() + "'");
		}
		sql.append(" GROUP BY a.AAZ319,a.AAA155 ");// 增加对阈值级别的分类
		sql.append(" ORDER BY MAX(a.APE735) DESC");

		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				RulesDTO.class);
	}

	public Ac01DTO getAc01Dto(Ac01DTO ac01Dto) {

		if (!StringTools.hasText(ac01Dto.getAac001())) {
			throw new BusinessException("AdminDisposalBS-123:传入 aaz010主键为空!");
		}

		//StringBuffer sql = new StringBuffer(" select * from ac01 a left join  ac02 b on a.aac001 = b.aac001 where 1 = 1");
		StringBuffer sql = new StringBuffer(" select * from YBOLTP.ac01 a where 1 = 1");

		if (StringTools.hasText(ac01Dto.getAac001())) {
			sql.append(" and a.aac001 = '" + ac01Dto.getAac001() + "'");
		}

		/*if (StringTools.hasText(ac01Dto.getAac002())) {
			sql.append(" and a.aac002 = b.aac002");
		}*/

		ac01Dto = CommonJdbcDaoUtils.get(sql.toString(), Ac01DTO.class);

		return ac01Dto;
	}

	public Page queryKA52KC24WithPage(Page page, CommonReviewDTO dto) {
		String mid = dto.getMid();
		String rules = dto.getRules();
		String apa709 = dto.getApa709();
		String aaz010 = dto.getAaz010();
		StringBuffer sb = new StringBuffer("");
		sb.append("select distinct * from ( ");
		sb.append("SELECT  a.aaz217,MAX(a.aac001) as aac001, MAX(a.akc190) as akc190, MAX(a.aac003) as aac003,MAX(a.aac004) as aac004,MAX(a.aac002) as aac002,MIN(to_char(a.akc194,'yyyy-mm-dd hh24:mi:ss')) as akc194,"
				+ "MAX(to_date(a.aae030,'yyyy-mm-dd')) as aae030,MAX(to_date(a.aae031,'yyyy-mm-dd')) as aae031,MAX(a.aaz307) as aaz307,"
				+ "MAX(a.ake024) as ake024,MAX(g.aka121) as aka122,MAX(a.aka130) as aka130,MAX(a.akb020) as akb020,"
				+ "MAX(e.akb021) as akb021,MAX(a.aaz263) as aaz263,MAX(f.aac003) as aae004,"
				+ "SUM(b.akc264) as akc264,SUM(b.ake038) as ake038,SUM(b.akb067) as akb067,SUM(b.akc254) as akc254,SUM(b.akc253) as akc253,SUM(b.ake039) as ake039,"
				+ "SUM(b.ake029) as ake029,SUM(b.ake035) as ake035,SUM(b.ake043) as ake043,SUM(b.ake032) as ake032,"
				+ "SUM(b.ake042) as ake042,MAX(b.aka151) as aka151,MAX(b.aka153) as aka153,MAX(b.ake092) as ake092,"
				+ "MAX(b.akc021) as akc021,MIN(to_char(b.akc194,'yyyy-mm-dd hh24:mi:ss')) as akc194j FROM  kc21 a,kc24 b,kb01 e,kf05 f,ka06 g  WHERE  a.aaz217 = b.aaz217(+) and a.aka122=g.aka122(+) and a.aaz107 = e.aaz107 and a.aaz263 =f.aaz263(+) ");
		sb.append(" and  exists ");
		sb.append(" ( select 'x' from ka59 d,ka52 c where a.aaz217 = c.aaz217 and d.aaz328 = c.aaz328 ");
		// 日期.如果选择了日期就不用IN
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sb.append(" AND  (d.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sb.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}
		if (apa709 != null && apa709.trim().length() > 0) {
			if (aaz010 != null && aaz010.trim().length() > 0) {
				sb.append(" and d.APA709= '" + apa709 + "' ");
				sb.append(" and d.AAZ010= " + aaz010 + " ");
			}
		}
		// 监控类型-规则大类
		if (dto.getAaa153() != null && dto.getAaa153().length() > 0) {
			sb.append(" and d.AAA153 = '" + dto.getAaa153() + "' ");
		}
		// 规则医疗类别
		if (dto.getAaa178() != null && dto.getAaa178().length() > 0) {
			sb.append(" and d.AAA178 =  '" + dto.getAaa178() + "'  ");
		}
		// 险种
		if (dto.getAae140() != null && dto.getAae140().length() > 0) {
			sb.append(" and d.AAE140 =  '" + dto.getAae140() + "'  ");
		}
		// 阈值级别
		if (dto.getAaa155() != null && dto.getAaa155().length() > 0) {
			sb.append(" and d.AAA155 =  " + dto.getAaa155() + "  ");
		}
		// 规则ID
		if (dto.getAaz319() != null && dto.getAaz319().length() > 0) {
			sb.append(" and d.AAZ319 = " + dto.getAaz319() + " ");
		}
		if (rules != null && rules.length() > 0) {
			sb.append(" and d.AAZ319 IN ( " + rules + " ) ");
		}
		// 疑点状态
		if (dto.getApe031() != null && dto.getApe031().length() > 0) {
			sb.append(" and d.APE031 = '" + dto.getApe031() + "' ");
		}
		// 疑点明细ID
		if (dto.getAaz328() != null && dto.getAaz328().length() > 0) {
			sb.append(" and d.aaz328 = '" + dto.getAaz328() + "' ");
		}
		if (mid != null && mid.length() > 0) {
			sb.append(" and d.AAZ328 IN ( " + mid + " ) ");
		}
		sb.append(" ) ");

		// 人员编号
		if (StringTools.hasText(dto.getAac001())) {
			sb.append(" and a.AAC001 = '" + dto.getAac001() + "'");
		}
		// 医师编号
		if (StringTools.hasText(dto.getAaz263())) {
			sb.append(" and a.AAZ263= '" + dto.getAaz263() + "'");
		}
		// 医院编号
		if (StringTools.hasText(dto.getAkb020())) {
			sb.append("and a.AKB020= '" + dto.getAkb020() + "'");
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sb.append("and a.AKA122 = '" + dto.getAka122() + "'");
		}
		// 医师名称
		if (StringTools.hasText(dto.getAae004())) {
			sb.append("and a.AAE004 = '" + dto.getAae004() + "'");
		}
		// 人员分类
		if (StringTools.hasText(dto.getAkc021())) {
			sb.append("and b.AKC021 = '" + dto.getAkc021() + "'");
		}
		// 医疗类别
		if (StringTools.hasText(dto.getAka130())) {
			sb.append("and a.AKA130 = '" + dto.getAka130() + "'");
		}
		sb.append(" GROUP BY a.aaz217 ");
		sb.append(" ) cc ");
		sb.append(" ORDER BY akc194,aac001 ");
		// System.out.println(sb);
		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				JzjsxxDTO.class);
	}

	public Page queryKC23KC22YD(Page page, CommonReviewDTO dto) {
		String mid = dto.getMid();
		String apa709 = dto.getApa709();
		String aaz010 = dto.getAaz010();

		String rules = dto.getRules();
		StringBuffer sb = new StringBuffer("");
		sb.append("select a.aaz210,a.aaz217,(select aac003 from kf05 t where t.aaz263=a.aaz263) as aac003,to_char(a.akc221,'yyyy-mm-dd hh24:mi:ss') akc221,a.aae019,a.aka017,");

		// 如果有规则
		// 查ka53处方
		sb.append("(select '1' from ka53 c where c.aaz210 = a.aaz210 and c.AAZ328 IN ");
		sb.append(" ( ");
		sb.append(" select aaz328 from ka59 where 1=1 ");
		if (rules != null && rules.trim().length() > 0) {
			sb.append(" and aaz319 IN (" + rules + ") ");
		}
		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sb.append(" AND  (ABB057 BETWEEN  to_date('" + dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sb.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}
		if (StringTools.hasText(dto.getAaz319())) {
			sb.append("and aaz319 = '" + dto.getAaz319() + "'");
		}
		if (StringTools.hasText(dto.getAaa153())) {
			sb.append("and aaa153 = '" + dto.getAaa153() + "'");
		}
		if (StringTools.hasText(dto.getApa709())) {
			sb.append("and apa709 = '" + dto.getApa709() + "'");
		}
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append("and aaz010 = '" + dto.getAaz010() + "'");
		}
		if (StringTools.hasText(dto.getAaa155())) {
			sb.append("and aaa155 = '" + dto.getAaa155() + "'");
		}
		sb.append(" ) ");
		sb.append(" and rownum = 1 ");
		sb.append(" ) as aaz328k, ");
		// 查处方违规提示
		sb.append("(select t.aae317 from ka59 t,ka53 m where t.aaz328 = m.aaz328 and m.aaz210 = a.aaz210 ");
		if (rules != null && rules.trim().length() > 0) {
			sb.append(" and t.aaz319 IN (" + rules + ") ");
		}
		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sb.append(" AND  (t.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sb.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}
		if (StringTools.hasText(dto.getAaz319())) {
			sb.append("and aaz319 = '" + dto.getAaz319() + "'");
		}
		if (StringTools.hasText(dto.getAaa153())) {
			sb.append("and aaa153 = '" + dto.getAaa153() + "'");
		}
		if (StringTools.hasText(dto.getApa709())) {
			sb.append("and t.apa709 = '" + dto.getApa709() + "'");
		}
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append("and t.aaz010 = '" + dto.getAaz010() + "'");
		}
		if (StringTools.hasText(dto.getAaa155())) {
			sb.append("and t.aaa155 = '" + dto.getAaa155() + "'");
		}
		sb.append(" and rownum = 1 ");
		sb.append(" ) as aae317k, ");
		// 查ka54处方明细
		sb.append("(select '1' from ka54 d where d.aaz213 = b.aaz213 and d.AAZ328 IN ");
		sb.append(" ( ");
		sb.append(" select aaz328 from ka59 where 1=1 ");
		if (rules != null && rules.trim().length() > 0) {
			sb.append(" and aaz319 IN (" + rules + ") ");
		}
		if (StringTools.hasText(dto.getAaz319())) {
			sb.append("and aaz319 = '" + dto.getAaz319() + "'");
		}
		if (StringTools.hasText(dto.getAaa153())) {
			sb.append("and aaa153 = '" + dto.getAaa153() + "'");
		}
		if (StringTools.hasText(dto.getApa709())) {
			sb.append("and apa709 = '" + dto.getApa709() + "'");
		}
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append("and aaz010 = '" + dto.getAaz010() + "'");
		}
		if (StringTools.hasText(dto.getAaa155())) {
			sb.append("and aaa155 = '" + dto.getAaa155() + "'");
		}
		sb.append(" ) ");
		sb.append(" and rownum = 1 ");
		sb.append(" ) as aaz328m, ");
		// 查处方明细违规提示
		sb.append("(select t.aae317 from ka59 t,ka54 m where t.aaz328 = m.aaz328 and m.aaz213 = b.aaz213 ");
		if (rules != null && rules.trim().length() > 0) {
			sb.append(" and t.aaz319 IN (" + rules + ") ");
		}
		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sb.append(" AND  (t.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sb.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}
		if (StringTools.hasText(dto.getAaz319())) {
			sb.append("and t.aaz319 = '" + dto.getAaz319() + "'");
		}
		if (StringTools.hasText(dto.getAaa153())) {
			sb.append("and t.aaa153 = '" + dto.getAaa153() + "'");
		}
		if (StringTools.hasText(dto.getApa709())) {
			sb.append("and t.apa709 = '" + dto.getApa709() + "'");
		}
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append("and t.aaz010 = '" + dto.getAaz010() + "'");
		}
		if (StringTools.hasText(dto.getAaa155())) {
			sb.append("and t.aaa155 = '" + dto.getAaa155() + "'");
		}
		sb.append(" and rownum = 1 ");
		sb.append(" ) as aae317m, ");

		// End
		sb.append(" b.ake002,b.aaz213,b.ake003,b.ake004,b.aka063,b.akc226,b.akc225,b.akb065, ");
		sb.append(" b.akc229,b.aka065,b.aka081,b.ake135,b.aka072,b.aka071,b.akc231,b.ake131, ");
		sb.append(" b.aka029,b.aka031,b.aka032,b.aka033,b.aka070,b.aka064,b.aka184, ");
		sb.append(" b.aka166,b.aka172,b.aka187,b.aac004,b.aka169,b.aka170,b.aka196, ");
		sb.append(" b.aka197,b.ake001 ");
		sb.append(" from KC23 a, KC22 b where 1=1 ");
		sb.append(" AND a.AAZ210 = b.AAZ210 ");
		sb.append(" AND a.AAZ217 = b.AAZ217 ");
		// 社保三大目录名称
		if (StringTools.hasText(dto.getAke002())) {
			sb.append("and b.AKE002 = '" + dto.getAke002() + "'");
		}
		// 如果是查询全部
		if (dto.getQueryall() != null
				&& dto.getQueryall().equalsIgnoreCase("true")) {
			sb.append(" AND a.AAZ217 IN ( SELECT distinct f.AAZ217  FROM KA59 e, KA52 f  ");
			sb.append(" WHERE e.AAZ328 = f.AAZ328 ");
			// 加上关联 20120504
			if (apa709.equalsIgnoreCase("1")) {
				sb.append(" AND f.AAC001 = e.AAZ010 ");
			} else if (apa709.equalsIgnoreCase("2")) {
				sb.append(" AND f.AAZ263 = e.AAZ010 ");
			} else if (apa709.equalsIgnoreCase("3")) {
				sb.append(" AND f.AAZ107 = e.AAZ010 ");
			}
			// 日期.如果选择了日期
			if (StringTools.hasText(dto.getAbb057begin())
					&& StringTools.hasText(dto.getAbb057end())) {
				sb.append(" AND  (e.ABB057 BETWEEN  to_date('"
						+ dto.getAbb057begin()
						+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
				sb.append(" AND to_date('" + dto.getAbb057end()
						+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
			}
			if (apa709 != null && apa709.trim().length() > 0) {
				if (aaz010 != null && aaz010.trim().length() > 0) {
					sb.append(" and e.APA709= '" + apa709 + "' ");
					sb.append(" and e.AAZ010= " + aaz010 + " ");
				}
			}
			// 疑点状态
			// --------------
			if (StringTools.hasText(dto.getApe031())) {
				sb.append(" and e.APE031= '" + dto.getApe031() + "'");
			}
			// 监控类型-规则大类
			if (StringTools.hasText(dto.getAaa153())) {
				sb.append(" and e.AAA153= '" + dto.getAaa153() + "'");
			}
			// 规则医疗类别
			if (StringTools.hasText(dto.getAaa178())) {
				sb.append(" and e.AAA178= '" + dto.getAaa178() + "'");
			}
			// 阈值级别
			if (StringTools.hasText(dto.getAaa155())) {
				sb.append(" and e.AAA155= '" + dto.getAaa155() + "'");
			}
			// 规则ID
			if (StringTools.hasText(dto.getAaz319())) {
				sb.append(" and e.AAZ319= '" + dto.getAaz319() + "'");
			}
			// 规则ID串
			if (rules != null && rules.length() > 0) {
				sb.append(" and e.AAZ319 IN ( " + rules + " ) ");
			}
			// ---------------------
			// 疾病分类
			if (StringTools.hasText(dto.getAka122())) {
				sb.append(" and f.AKA122= '" + dto.getAka122() + "'");
			}
			// 人员名称
			if (StringTools.hasText(dto.getAac003())) {
				sb.append(" and f.AAC003= '" + dto.getAac003() + "'");
			}
			// 人员编号
			if (StringTools.hasText(dto.getAac001())) {
				sb.append(" and f.AAC001= '" + dto.getAac001() + "'");
			}
			// 医疗类别
			if (StringTools.hasText(dto.getAka130())) {
				sb.append(" and f.AKA130= '" + dto.getAka130() + "'");
			}
			// 医院编号
			if (StringTools.hasText(dto.getAkb020())) {
				sb.append(" and f.AKB020= '" + dto.getAkb020() + "'");
			}
			// 医师编号

			if (StringTools.hasText(dto.getAaz263())) {
				sb.append(" and f.AAZ263= '" + dto.getAaz263() + "'");
			}
			sb.append(" ) ");
		} else {
			if (null != mid && mid.trim().length() > 0) {
				sb.append(" and a.AAZ217 IN ( " + mid + " ) ");
			}
		}
		// 下面这句ORDER BY 很耗性能
		sb.append(" ORDER BY aaz328k,aaz328m,akc221 ");
		// System.out.println(sb);
		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Kc23Kc22DTO.class);
	}

	public Page queryAF31ByAAZ010(Page page, CommonReviewDTO dto) {

		StringBuffer sb = new StringBuffer("");
		sb.append("select a.* from AF31 a where 1=1 ");
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append(" and aaz010 = '" + dto.getAaz010() + "'");
		}
		if (StringTools.hasText(dto.getApa709())) {
			sb.append(" and apa709 = '" + dto.getApa709() + "'");
		}
		// System.out.println(sb);
		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Af31DTO.class);
	}

	public String getWtnr(CommonReviewDTO dto) {
		StringBuffer sb = new StringBuffer("");
		StringBuffer sql = new StringBuffer("");

		sql.append("select distinct aae317 ,aaa027, rownum r from KA59 a where 1=1 ");
		// 对象ID
		if (StringTools.hasText(dto.getAac001())) {
			sql.append(" and a.AAZ010= " + dto.getAac001());
		}
		// 对象类型
		if (StringTools.hasText(dto.getApa709())) {
			sql.append(" and a.APA709= " + dto.getApa709());
		}
		// 规则类型
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153= " + dto.getAaa153());
		}
		// 阈值级别
		if (StringTools.hasText(dto.getAaa155())) {
			sql.append(" and a.AAA155= " + dto.getAaa155());
		}
		// 规则
		if (StringTools.hasText(dto.getAaz319())) {
			sql.append(" and a.AAZ319= " + dto.getAaz319());
		}
		if (dto.getRules() != null && dto.getRules().length() > 0) {

			sql.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}

		// 疑点状态
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031= " + dto.getApe031());
		}
		// 结算身份类别
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.akc021= " + dto.getAkc021());
		}
		// 规则医疗分类
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178= " + dto.getAaa178());
		}
		// 医疗类别
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.aka130= " + dto.getAka130());
		}
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and a.aka101= " + dto.getAka101());
		}
		// 险种
		if (StringTools.hasText(dto.getAae140())) {
			sql.append(" and a.aae140= " + dto.getAae140());
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122= " + dto.getAka122());
		}

		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sql.append(" AND  (a.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sql.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}

		sql.append(" AND rownum < =30 ");
		String aaa027 = "";

		List<Ka59DTO> ka59List = CommonJdbcDaoUtils.query(sql.toString(),
				Ka59DTO.class);
		if (ka59List != null) {
			for (int yy = 0; yy < ka59List.size(); yy++) {
				Ka59DTO ka = (Ka59DTO) ka59List.get(yy);
				sb.append(ka.getAae317() + "\n");

				if (!StringTools.hasText(aaa027)) {
					aaa027 = ka.getAaa027();
				}
			}
		}
		String nr = sb.toString();
		if (nr.length() > 1950) {
			nr = nr.substring(0, 1950);
		}
		Double wgje = this.getWgje(dto);
		nr += "wgje:" + wgje.toString();
		nr = nr + "-" + aaa027;
		return nr;
	}

	// 获得违规总金额
	public Double getWgje(CommonReviewDTO dto) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select sum(akb065) as wgje from kc22 where aaz213 in (");
		sql.append(" select aaz213 from ka54 b,ka59 a where 1=1 and a.aaz328=b.aaz328 ");
		// 对象ID
		if (StringTools.hasText(dto.getAac001())) {
			sql.append(" and a.AAZ010= " + dto.getAac001());
		}
		// 对象类型
		if (StringTools.hasText(dto.getApa709())) {
			sql.append(" and a.APA709= " + dto.getApa709());
		}
		// 规则类型
		if (StringTools.hasText(dto.getAaa153())) {
			sql.append(" and a.AAA153= " + dto.getAaa153());
		}
		// 阈值级别
		if (StringTools.hasText(dto.getAaa155())) {
			sql.append(" and a.AAA155= " + dto.getAaa155());
		}
		// 规则
		if (StringTools.hasText(dto.getAaz319())) {
			sql.append(" and a.AAZ319= " + dto.getAaz319());
		}
		if (dto.getRules() != null && dto.getRules().length() > 0) {

			sql.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}

		// 疑点状态
		if (StringTools.hasText(dto.getApe031())) {
			sql.append(" and a.ape031= " + dto.getApe031());
		}
		// 结算身份类别
		if (StringTools.hasText(dto.getAkc021())) {
			sql.append(" and a.akc021= " + dto.getAkc021());
		}
		// 规则医疗分类
		if (StringTools.hasText(dto.getAaa178())) {
			sql.append(" and a.aaa178= " + dto.getAaa178());
		}
		// 医疗类别
		if (StringTools.hasText(dto.getAka130())) {
			sql.append(" and a.aka130= " + dto.getAka130());
		}
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sql.append(" and a.aka101= " + dto.getAka101());
		}
		// 险种
		if (StringTools.hasText(dto.getAae140())) {
			sql.append(" and a.aae140= " + dto.getAae140());
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sql.append(" and a.aka122= " + dto.getAka122());
		}

		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sql.append(" AND  (a.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sql.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}

		sql.append(" )");
		List<Ka59DTO> ka59List = CommonJdbcDaoUtils.query(sql.toString(),
				Ka59DTO.class);
		if (ka59List != null && ka59List.size() > 0) {
			Ka59DTO ka59 = (Ka59DTO) ka59List.get(0);
			Double wgje = ka59.getWgje();
			if (wgje != null) {
				return wgje;
			}
		}
		return 0.0;
	}

	public void updateKA59(CommonReviewDTO dto, String ape031) {
		String aaz281 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ281");
		// 更改疑点状态
		StringBuffer sb = new StringBuffer("");
		sb.append("update KA59 a SET APE031 = '" + ape031 + "' ,AAZ281 = "
				+ Long.valueOf(aaz281) + ",  ");
		sb.append(" AAE011 = '" + dto.getAae011() + "',  ");
		sb.append(" AAE036 = SYSDATE  ");
		sb.append("  WHERE 1=1 ");
		// 对象ID
		if (StringTools.hasText(dto.getAaz010())) {
			sb.append(" and a.AAZ010 = '" + dto.getAaz010() + "'");
		}
		// 对象类型
		if (StringTools.hasText(dto.getApa709())) {
			sb.append(" and a.APA709 = '" + dto.getApa709() + "'");
		}
		// 规则类型
		if (StringTools.hasText(dto.getAaa153())) {
			sb.append(" and a.AAA153 = '" + dto.getAaa153() + "'");
		}
		// 阈值级别
		if (StringTools.hasText(dto.getAaa155())) {
			sb.append(" and a.AAA155 = '" + dto.getAaa155() + "'");
		}
		// 规则
		if (StringTools.hasText(dto.getAaz319())) {
			sb.append(" and a.AAZ319 = '" + dto.getAaz319() + "'");
		}
		if (dto.getRules() != null && dto.getRules().length() > 0) {
			sb.append(" and a.AAZ319 IN (" + dto.getRules() + ") ");
		}

		// 疑点状态
		if (StringTools.hasText(dto.getApe031())) {
			sb.append(" and a.ape031 = '" + dto.getApe031() + "'");
		}
		// 结算身份类别
		if (StringTools.hasText(dto.getAkc021())) {
			sb.append(" and a.akc021 = '" + dto.getAkc021() + "'");
		}
		// 规则医疗分类
		if (StringTools.hasText(dto.getAaa178())) {
			sb.append(" and a.aaa178 = '" + dto.getAaa178() + "'");
		}
		// 医疗类别
		if (StringTools.hasText(dto.getAka130())) {
			sb.append(" and a.aka130 = '" + dto.getAka130() + "'");
		}
		// 医院等级
		if (StringTools.hasText(dto.getAka101())) {
			sb.append(" and a.aka101 = '" + dto.getAka101() + "'");
		}
		// 疾病分类
		if (StringTools.hasText(dto.getAka122())) {
			sb.append(" and a.aka122 = '" + dto.getAka122() + "'");
		}
		// 险种
		if (StringTools.hasText(dto.getAae140())) {
			sb.append(" and a.aae140 = '" + dto.getAae140() + "'");
		}
		// 日期.如果选择了日期
		if (StringTools.hasText(dto.getAbb057begin())
				&& StringTools.hasText(dto.getAbb057end())) {
			sb.append(" AND  (a.ABB057 BETWEEN  to_date('"
					+ dto.getAbb057begin()
					+ "'||' 00:00:00', 'yyyy-mm-dd hh24:mi:ss' ) ");
			sb.append(" AND to_date('" + dto.getAbb057end()
					+ "'||' 23:59:59', 'yyyy-mm-dd hh24:mi:ss' ) ) ");
		}
		// System.out.println(sb);
		CommonJdbcDaoUtils.update(sb.toString());
	}

	public Kc21DTO queryKC21(String aaz217) {
		StringBuffer sb = new StringBuffer("");
		sb.append(" SELECT a.*,b.aac006 as aac006,c.akb021,d.aac003 as aac003y,f.aka121 as aka121,e.aae386 as aae386 ");
		sb.append(" FROM kc21 a,AC01 b,KB01 c,KF05 d,KF06 e,KA06 f");
		sb.append(" WHERE a.aac001 = b.aac001(+) ");
		sb.append(" AND a.aaz107=c.aaz107(+) ");
		sb.append(" AND a.aaz263=d.aaz263(+) ");
		sb.append(" AND a.aaz307=e.aaz307(+) ");
		sb.append(" AND a.aka122=f.aka122(+) ");
		// sb.append(" AND a.aaz370=g.aaz370 ");
		sb.append(" AND a.aaz217= " + aaz217);
		BaseKc21 kc21 = CommonJdbcDaoUtils.getFirst(sb.toString(),
				BaseKc21.class);
		Kc21DTO dto = new Kc21DTO();
		BeanTools.copyProperties(kc21, dto);
		return dto;
	}

	public Boolean missionFinished(MissionFinishDTO missionFinishDTO) {

		String sql = "select count(1) from af53 a,af78 b where b.aaz524 = "
				+ missionFinishDTO.getAaz524() + " and b.aaz281 = a.aaz281(+)";
		;// 加入左连接
		/*
		 * JdbcTemplate jdbc=new JdbcTemplate();
		 * 
		 * int num=jdbc.queryForInt(sql); String
		 * sql2="select count(1) from af53 a,af78 b where b.aaz524 = "
		 * +missionFinishDTO.getAaz524()
		 * +" and b.aaz281 = a.aaz281(+) and a.aae426 = '4'"; int
		 * finished=jdbc.queryForInt(sql2);
		 */
		List<MissionFinishDTO> num = CommonJdbcDaoUtils.query(sql.toString(),
				MissionFinishDTO.class);
		String sql2 = "select count(1) from af53 a,af78 b where b.aaz524 = "
				+ missionFinishDTO.getAaz524()
				+ " and b.aaz281 = a.aaz281(+) and a.aae426 = '4'";
		List<MissionFinishDTO> finished = CommonJdbcDaoUtils.query(
				sql2.toString(), MissionFinishDTO.class);
		if (num.size() == finished.size()) {
			Date date = new Date(System.currentTimeMillis());
			String updateAf79 = "update af79 set ape140 = '5',aae311 = to_date('"
					+ date
					+ "','YYYY-MM-DD') where aaz524 = '"
					+ missionFinishDTO.getAaz524() + "'";
			CommonJdbcDaoUtils.update(updateAf79);
			return true;
		} else {
			return false;
		}
	}

	public List<Ka44DTO> getKa44List(Af32DTO af32Dto) {

		if (af32Dto == null) {
			throw new BusinessException("AdminDisposalBS-124:传入 af32Dto对象为空!");
		}

		if (!StringTools.hasText(af32Dto.getAaa153())) {
			throw new BusinessException("AdminDisposalBS-125:传入 aaa153为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from ka44 a where a.aaz319 is not null ");

		if (StringTools.hasText(af32Dto.getAaa153())) {
			sql.append(" and a.aaa153 = '" + af32Dto.getAaa153() + "'");
		}

		List<Ka44DTO> ka44List = CommonJdbcDaoUtils.query(sql.toString(),
				Ka44DTO.class);

		return ka44List;
	}

	public Af79DTO saveAf79(Af79DTO af79Dto) {

		if (af79Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-126:保存af79 传入 对象af79Dto为空!");
		}

		Af79 af79 = new Af79();

		BeanTools.copyProperties(af79Dto, af79);

		CommonHibernateDaoUtils.save(af79);

		BeanTools.copyProperties(af79, af79Dto);

		return af79Dto;
	}

	public Af79DTO updateAf79(Af79DTO af79Dto) {

		if (af79Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-127:修改af79 传入 对象af79Dto为空!");
		}

		if (af79Dto.getAaz524() == null) {
			throw new BusinessException(
					"AdminDisposalBS-128:修改af79 传入 主键 aaz524为空!");
		}

		Af79 af79 = CommonHibernateDaoUtils.load(Af79.class,
				af79Dto.getAaz524());

		BeanTools.copyPropertiesIgnoreNull(af79Dto, af79);

		CommonHibernateDaoUtils.update(af79);

		BeanTools.copyProperties(af79, af79Dto);

		return af79Dto;
	}

	public Af78DTO saveAf78(Af78DTO af78Dto) {

		if (af78Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-129:保存af78 传入 对象af78Dto为空!");
		}

		Af78 af78 = new Af78();

		BeanTools.copyProperties(af78Dto, af78);

		CommonHibernateDaoUtils.save(af78);

		BeanTools.copyProperties(af78, af78Dto);

		return af78Dto;
	}

	public Page queryAsListInfo(Page page, MissionFinishDTO missionFinishDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append("select a.aaz524,b.aaz281, a.aaa027,  a.aae012, "
				+ "to_date(a.aae217,'yyyy-MM-dd') as aae217,  a.aae014, a.ape140, a.aae036, a.aae218, "
				+ "a.aae013, a.ape723 from af79 a, af78 b, af32 c, af53 d");

		sb.append(" where 1=1 and a.ape140 in ('4','5') and a.aaz524 = b.aaz524 and b.aaz281 = c.aaz281 and c.aaz281 = d.aaz281");
		sb.append(" and not exists (select 'x' from af79, af78, af32, af53 where af79.aaz524 = af78.aaz524 and af78.aaz281 = af32.aaz281 ");
		sb.append(" and af32.aaz281 = af53.aaz281 and af53.aae426 <> '4' and af79.aaz524 = a.aaz524 and af79.ape140 = '4') ");
		sb.append(" and not exists (select 'x' from af79, af78, af32, af53 where af79.aaz524 = af78.aaz524 and af78.aaz281 = af32.aaz281");
		sb.append(" and af32.aaz281 = af53.aaz281(+) and af53.aaz281 is null and af79.aaz524 = a.aaz524 and af79.ape140 = '4')");
		/*
		 * if (missionFinishDTO.getAae012() != null) {
		 * sb.append(" and a.aae012 = b.USERID");
		 * sb.append(" and b.USERID = '"+missionFinishDTO.getAae012()+"'" ); }
		 */
		if (missionFinishDTO.getAaz524() != null
				&& missionFinishDTO.getAaz524() != 0L) {
			sb.append(" and a.aaz524 = '" + missionFinishDTO.getAaz524() + "'");
		}
		if (!StringUtils.isEmpty(missionFinishDTO.getAae012())) {
			sb.append(" and a.aae012 = '" + missionFinishDTO.getAae012() + "'");
		}

		sb.append(" and a.ape140 = '" + missionFinishDTO.getApe140() + "'");

		if (!StringUtils.isEmpty(missionFinishDTO.getAae217())) {

			sb.append(" and aae217 = '" + missionFinishDTO.getAae217() + "'");
		}
		/*
		 * if (!StringUtils.isEmpty(missionFinishDTO.getAae217end())) {
		 * 
		 * sb.append (" and aae217 <=to_number(replace(:aae217end,'-',''))"); }
		 * if (!StringUtils.isEmpty(missionFinishDTO.getAae218begin() )) {
		 * 
		 * sb.append(
		 * " and to_number(to_char(aae218,'yyyymmdd')) >=to_number(replace(:aae218begin,'-',''))"
		 * );
		 * 
		 * } if (!StringUtils.isEmpty(missionFinishDTO.getAae218end())) {
		 * 
		 * sb.append(
		 * " and to_number(to_char(aae218,'yyyymmdd')) <=to_number(replace(:aae218end,'-',''))"
		 * );
		 * 
		 * }
		 */

		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				MissionFinishDTO.class);
	}

	public Page queryMissionDitel(Page page, MissionFinishDTO missionFinishDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append("select a.aaz281,a.aaa027,a.apa703,to_date(a.ape711,'yyyy-mm-dd') ape711s,a.apa704,a.ape028,a.ape713,a.aae006,"
				+ "a.aae007,a.aae005,a.aae159,a.ape712,a.apa165,a.apa166,a.ape133,a.ape027,a.aae011,to_char(a.aae036,'yyyy-mm-dd hh24:mi:ss') aae036s,"
				+ "a.apa705,d.abz001,d.aae426  FROM AF32 A, af78 B, af79 C,AF53 d where 1=1 and A.AAZ281 = B.AAZ281 AND B.aaz524 = C.aaz524 AND A.AAZ281 = D.AAZ281(+) ");
		if (missionFinishDTO.getAaz524() != null) {
			sb.append(" and c.aaz524 = '" + missionFinishDTO.getAaz524() + "'");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				MissionFinishDTO.class);
	}

	@SuppressWarnings("unchecked")
	public Page queryPlanWithPage(Page page, CheckTaskDTO checkTaskDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append("select a.aaa027,\n"
				+ "       aa.aaa103 ape140,\n"
				+ "       count(a.aaz524) as aaz524s,\n"
				+ "		  nvl(sum((select max(rownum) from af78 b, af32 c where a.aaz524 = b.aaz524 and b.aaz281 = c.aaz281)), 0) as aaz281s,"
				+ "		  nvl(sum((select max(rownum) from af78 b, af32 c, af53 d where a.aaz524 = b.aaz524 and b.aaz281 = c.aaz281 and c.aaz281 = d.aaz281)),0) as aaz318s"
				+ "  from af79 a,aa10 aa\n"
				+ " where 1=1 and a.ape140=aa.aaa102 and aa.aaa100='APE140'\n");
		// 任务发放时间 aae217 Integer
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217())) {
			sb.append(" and a.aae217 = '" + checkTaskDTO.getAae217() + "'");
		}
		// 发放时间
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217begin())) {
			sb.append(" and a.aae217 >= '" + checkTaskDTO.getAae217begin()
					+ "'");
		}

		if (!StringUtils.isEmpty(checkTaskDTO.getAae217end())) {
			sb.append(" and a.aae217 <= '" + checkTaskDTO.getAae217end() + "'");
		}
		// 统筹区编码
		if (checkTaskDTO.getAaa027() != null) {
			sb.append(" and a.aaa027= '" + checkTaskDTO.getAaa027() + "'");
		}
		sb.append(" group by a.aaa027, aa.aaa103");
		// System.out.println();
		page = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				CheckTaskDTO.class);
		List<CheckTaskDTO> list = page.getResult();
		CheckTaskDTO cdto = new CheckTaskDTO();
		cdto.setAaz281s("0");
		cdto.setAaz318s("0");
		cdto.setAaz524s("0");
		for (CheckTaskDTO dto : list) {
			Integer aaz218sCount = Integer.parseInt(cdto.getAaz281s())
					+ Integer.parseInt(dto.getAaz281s());
			cdto.setAaz281s(aaz218sCount.toString());
			Integer aaz524sCount = Integer.parseInt(cdto.getAaz524s())
					+ Integer.parseInt(dto.getAaz524s());
			cdto.setAaz524s(aaz524sCount.toString());
			Integer aaz318sCount = Integer.parseInt(cdto.getAaz318s())
					+ Integer.parseInt(dto.getAaz318s());
			cdto.setAaz318s(aaz318sCount.toString());
		}
		cdto.setApe140("合计：");
		list.add(cdto);
		page.setResult(list);
		return page;
	}

	@SuppressWarnings("unchecked")
	public Page queryProblemWithPage(Page page, CheckTaskDTO checkTaskDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append("select a.aaa027, aa.aaa103 as apa165, count(a.aaz281) as aaz281s \n "
				+ "  from af32 a , aa10 aa\n"
				+ " where exists ( select 1 from af78 b,af79 c  where  b.aaz524= c.aaz524 and  b.aaz281 = a.aaz281 and a.apa165 = aa.aaa102 and aa.aaa100='APA165' ");
		// 任务发放时间 aae217 Integer
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217())) {
			sb.append(" and c.aae217 = '" + checkTaskDTO.getAae217() + "'");
		}
		// 发放时间
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217begin())) {
			sb.append(" and c.aae217 >= '" + checkTaskDTO.getAae217begin()
					+ "'");
		}

		if (!StringUtils.isEmpty(checkTaskDTO.getAae217end())) {
			sb.append(" and c.aae217 <= '" + checkTaskDTO.getAae217end() + "'");
		}
		// 统筹区编码
		if (checkTaskDTO.getAaa027() != null) {
			sb.append(" and a.aaa027= '" + checkTaskDTO.getAaa027() + "'");
		}
		if (checkTaskDTO.getAaa027() != null) {
			sb.append(" and a.aaa027= '" + checkTaskDTO.getAaa027() + "'");
		}
		sb.append(")");
		sb.append(" group by a.aaa027, aa.aaa103");
		page = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				CheckTaskDTO.class);
		List<CheckTaskDTO> list = page.getResult();
		CheckTaskDTO cdto = new CheckTaskDTO();
		cdto.setAaz281s("0");
		cdto.setApa165("0");
		for (CheckTaskDTO dto : list) {
			Integer aaz218sCount = Integer.parseInt(cdto.getAaz281s())
					+ Integer.parseInt(dto.getAaz281s());
			cdto.setAaz281s(aaz218sCount.toString());

		}
		cdto.setApa165("合计：");
		list.add(cdto);
		page.setResult(list);
		return page;
	}

	@SuppressWarnings("unchecked")
	public Page queryCaseWithPage(Page page, CheckTaskDTO checkTaskDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append("select aa.aaa103 as aae426, c.aaa027, count(c.aaz318) as aaz318s \n"
				+ "  from af53 c ,aa10 aa\n"
				+ " where exists (select 1 from af78 b,af79 d  where b.aaz524= d.aaz524 and  b.aaz281 = c.aaz281  and c.aae426 = aa.aaa102 and aa.aaa100='AAE426'\n");
		// 任务发放时间 aae217 Integer
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217())) {
			sb.append(" and d.aae217 = '" + checkTaskDTO.getAae217() + "'");
		}
		// 发放时间
		if (!StringUtils.isEmpty(checkTaskDTO.getAae217begin())) {
			sb.append(" and d.aae217 >= '" + checkTaskDTO.getAae217begin()
					+ "'");
		}

		if (!StringUtils.isEmpty(checkTaskDTO.getAae217end())) {
			sb.append(" and d.aae217 <= '" + checkTaskDTO.getAae217end() + "'");
		}

		// 统筹区编码

		if (checkTaskDTO.getAaa027() != null) {
			sb.append(" and d.aaa027= '" + checkTaskDTO.getAaa027() + "'");
		}
		sb.append(")");
		sb.append("  group by aa.aaa103 , c.aaa027");
		page = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				CheckTaskDTO.class);
		List<CheckTaskDTO> list = page.getResult();
		CheckTaskDTO cdto = new CheckTaskDTO();
		cdto.setAaz318s("0");
		cdto.setAae426("0");
		for (CheckTaskDTO dto : list) {
			Integer aaz318sCount = Integer.parseInt(cdto.getAaz318s())
					+ Integer.parseInt(dto.getAaz318s());
			cdto.setAaz318s(aaz318sCount.toString());

		}
		cdto.setAae426("合计：");
		list.add(cdto);
		page.setResult(list);
		return page;
	}

	// 核查任务生成查询
	public Page queryCheckTaskBuildWithPage(Page page, Af32DTO af32Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af32 a where a.aaz281 is not null");

		// 统筹区
		if (StringTools.hasText(af32Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + af32Dto.getAaa027() + "'");
		}

		// 受理方式
		if (StringTools.hasText(af32Dto.getApa703())) {
			sql.append(" and a.apa703 = '" + af32Dto.getApa703() + "'");
		}
		// 问题关键字
		if (StringTools.hasText(af32Dto.getApe712())) {
			sql.append(" and a.ape712 like '%" + af32Dto.getApe712() + "%'");
		}

		// 问题受理日期 开始时间
		if (af32Dto.getApe711Start() != null) {
			sql.append(" and ape711 >= '" + af32Dto.getApe711Start() + "'");
		}

		// 问题受理日期结束时间
		if (af32Dto.getApe711End() != null) {
			sql.append(" and ape711 <= '" + af32Dto.getApe711End() + "'");
		}

		// 疑點類型 aaa153
		if (StringTools.hasText(af32Dto.getAaa153())) {
			sql.append(" and a.aaz281 in (select b.aaz281 from ka59 b where b.aaa153 = '"
					+ af32Dto.getAaa153() + "') ");
		}

		// 規則名 aaz319
		if (af32Dto.getAaz319() != null) {
			sql.append(" and a.aaz281 in (select c.aaz281 from ka59 c where c.aaz319 = '"
					+ af32Dto.getAaz319() + "') ");
		}
		sql.append(" and a.aaz281 not in (select d.aaz281 from af78 d )");

		sql.append(" order by a.aae036 desc");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af32DTO.class);

		return result;

	}

	public Page queryBhcDxxxWithPage(Page page, String id) {
		String sql = "select * from Af31 tt where tt.aaz318='" + id + "'";
		return CommonJdbcDaoUtils.queryWithPage(page, sql,
				MissionConclusionDTO.class);
	}

	public int is_yyxtpt() {
		String sql = "select nvl(aaa102,0) as aaa102 from aa10 where aaa100='YYXTPT'";
		Integer is_yyxtpt = CommonJdbcDaoUtils.queryObject(sql, Integer.class);
		if (is_yyxtpt == null) {
			return 0;
		} else {
			return is_yyxtpt;
		}
	}

	public Ka59DTO queryKa59ByAaz281(String aaz281) {
		String sql = "select aaz328,aaz010,apa709,aaz319 from KA59 where aaz281="
				+ aaz281 + "";
		Ka59DTO dto = new Ka59DTO();
		List<Ka59> ka59s = CommonJdbcDaoUtils.query(sql, Ka59.class);
		if (ka59s.size() > 0) {
			BeanTools.copyProperties(ka59s.get(0), dto);
		}
		return dto;
	}

	public Page queryPersonByCase(Page page, String aaz318) {
		StringBuffer sql = new StringBuffer();
		sql.append("select a.*,to_char(to_date(a.ape727,'YYYY-MM-DD'),'YYYY-MM-DD') as ape727s,to_char(to_date(a.aae031,'YYYY-MM-DD'),'YYYY-MM-DD') as aae031s,to_char(to_date(a.aae034,'YYYY-MM-DD'),'YYYY-MM-DD') as aae034s,to_char(to_date(a.abb087,'YYYY-MM-DD'),'YYYY-MM-DD') as abb087s from af31 a where 1=1 ");
		sql.append(" and a.aaz318='" + aaz318 + "' ");
		sql.append(" and a.apa011 = '0'");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				MissionConclusionDTO.class);
	}

	public Page queryPerson(Page page, AuditFileVO auditFileQuery) {
		StringBuffer sql = new StringBuffer(
				"select a.aac001,a.aac002,a.aac003,a.aac004,a.aac006,a.aac084,a.apa151,a.aae005,a.aae138,a.aac060 from AC01 a  where 1=1");
		if (StringTools.hasText(auditFileQuery.getAac001())) {
			sql.append(" and aac001 LIKE '%" + auditFileQuery.getAac001()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAac002())) {
			sql.append(" and aac002 LIKE '%" + auditFileQuery.getAac002()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAac003())) {
			sql.append(" and aac003 LIKE '%" + auditFileQuery.getAac003()
					+ "%' ");
		}

		sql.append(" order by a.aac001");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ac01.class);
		return result;
	}

	public Page queryDoctor(Page page, AuditFileVO auditFileQuery) {
		StringBuffer sql = new StringBuffer(
				"select a.aac003,a.aae005,a.aab014,a.aaz263,a.akb020,a.akc049,a.aaf009,a.akc054,a.akc056,a.akc057,a.akc051,a.akc052,a.aae100,a.akc053,a.aae013,b.aae386 aaz307,c.akb021 akb021 FROM kf05 a left join kf06 b on (a.aaz307 = b.aaz307) left join kb01 c on (a.aaz107 = c.aaz107) where 1=1 ");
		if (StringTools.hasText(auditFileQuery.getAac003())) {
			sql.append(" and aac003 LIKE '%" + auditFileQuery.getAac003()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAab014())) {
			sql.append(" and aab014 LIKE '%" + auditFileQuery.getAab014()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAkb021())) {
			sql.append(" and akb021 LIKE '%" + auditFileQuery.getAkb021()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAaz263())) {
			sql.append(" and aaz263 LIKE '%" + auditFileQuery.getAaz263()
					+ "%' ");
		}

		sql.append(" order by a.aaz263 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kf05.class);
		return result;
	}

	public Page queryOrganize(Page page, AuditFileVO auditFileQuery) {
		StringBuffer sql = new StringBuffer(
				" select a.* from KB01 a  where 1=1 ");
		if (StringTools.hasText(auditFileQuery.getAkb022())) {
			sql.append(" and akb022 LIKE '%" + auditFileQuery.getAkb022()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAka101())) {
			sql.append(" and aka101 LIKE '%" + auditFileQuery.getAka101()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAkb021())) {
			sql.append(" and akb021 LIKE '%" + auditFileQuery.getAkb021()
					+ "%' ");
		}
		if (StringTools.hasText(auditFileQuery.getAkb020())) {
			sql.append(" and akb020 LIKE '%" + auditFileQuery.getAkb020()
					+ "%' ");
		}

		sql.append(" order by a.aaz107 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kb01.class);
		return result;
	}

	public Af73DTO getAf73(String aaz077, String aaz318) {
		StringBuffer sql = new StringBuffer();
		sql.append("select aaz529,aaz281,ape138,aaz010, ape008, ape711,aae036, aaz154, aae011,aaz008,ape139,aaa027, aaz318, ape727,aaz077, apa709, aae100, aaz107");
		sql.append(" from af73 where aaz529=(select MAX(aaz529) from af73 where aaz077='"
				+ aaz077 + "' and aaz318='" + aaz318 + "')");
		List<Af73> af73s = CommonJdbcDaoUtils.query(sql.toString(), Af73.class);
		Af73DTO dto = new Af73DTO();
		if (af73s.size() > 0) {
			BeanTools.copyProperties(af73s.get(0), dto);
		}
		return dto;
	}

	public Page getAf74(Page page, String aaz529) {
		String sql = "select aaz529,ape023,aae011,aae036,aaz530  from af74 where 1=1 and aaz529="
				+ aaz529;
		return CommonJdbcDaoUtils.queryWithPage(page, sql, Af74.class);
	}

	public Page queryMissionExamineWithPage(Page page, Af79DTO af79Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af79 a where a.aaz524 is not null ");

		// 任务编号 aaz524
		if (af79Dto.getAaz524() != null) {
			sql.append(" and a.aaz524 like '%" + af79Dto.getAaz524() + "%'");
		}

		// 任务生成人 aae011
		if (StringTools.hasText(af79Dto.getAae011())) {
			sql.append(" and a.aae011 like '%" + af79Dto.getAae011() + "%'");
		}

		// 任务状态 ape140
		if (StringTools.hasText(af79Dto.getApe140())) {
			sql.append(" and a.ape140 = '" + af79Dto.getApe140() + "'");
		}

		// 任务生成时间 开始 aae310 Date
		if (StringTools.hasText(af79Dto.getAae310Starts())) {
			sql.append(" and a.aae310 >= to_date( '"
					+ af79Dto.getAae310Starts() + "','yyyy/mm/dd')");
		}

		// 任务生成时间 结束 aae310 Date
		if (StringTools.hasText(af79Dto.getAae310Ends())) {
			sql.append(" and a.aae310 <= to_date( '" + af79Dto.getAae310Ends()
					+ "' ,'yyyy/mm/dd')");
		}

		// 任务发放人aae012
		if (StringTools.hasText(af79Dto.getAae012())) {
			sql.append(" and a.aae012 like '%" + af79Dto.getAae012() + "%'");
		}

		// 任务发放时间aae217
		if (af79Dto.getAae217Start() != null) {
			sql.append(" and a.aae217 >= '" + af79Dto.getAae217Start() + "'");
		}

		if (af79Dto.getAae217End() != null) {
			sql.append(" and a.aae217 <= '" + af79Dto.getAae217End() + "'");
		}

		sql.append(" and a.aaz524 in (select b.aaz524 from af78 b)");

		sql.append(" order by a.aaz524 desc");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af79DTO.class);

		return result;
	}

	public List<Af78DTO> getAf78List(Af78DTO af78Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af78 a where a.aaz523 is not null ");

		// 任务编号 查询
		if (af78Dto.getAaz524() != null) {

			sql.append(" and a.aaz524 = '" + af78Dto.getAaz524() + "'");
		}

		List<Af78DTO> af78List = CommonJdbcDaoUtils.query(sql.toString(),
				Af78DTO.class);

		return af78List;
	}

	public Page queryPeoblrmByAaz281WithPage(Page page, Af32DTO af32Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af32 a where 1 = 1 ");

		if (StringTools.hasText(af32Dto.getAaz281Str())) {

			sql.append(" and a.aaz281 in (" + af32Dto.getAaz281Str() + ")");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af32DTO.class);

		return result;
	}

	public void deleteAf78(Af78DTO af78Dto) {

		if (af78Dto == null) {
			throw new BusinessException(
					"AdminDisposalBS-129: 删除af78 传入 af78 为空!");
		}

		StringBuffer sql = new StringBuffer(" delete from af78 a where 1 = 1");

		if (af78Dto.getAaz524() != null) {
			sql.append(" and a.aaz524 = '" + af78Dto.getAaz524() + "'");
		}

		if (StringTools.hasText(af78Dto.getAaz281Ids())) {
			sql.append(" and a.aaz281 in (" + af78Dto.getAaz281Ids() + ")");
		}

		CommonJdbcDaoUtils.delete(sql.toString());
	}

	public Af74DTO getAf74(String aaz530) {
		String sql = "select *  from af74 where aaz530=" + aaz530;
		Af74 af74 = CommonJdbcDaoUtils.getFirst(sql, Af74.class);
		Af74DTO af74dto = new Af74DTO();
		if (af74 != null) {
			BeanTools.copyProperties(af74, af74dto);
		}
		return af74dto;
	}

	public Map<String, Object> queryForMap(String sql) {
		return CommonJdbcDaoUtils.queryForMap(sql);
	}

	public List<Af73> queryAf73ForList(String sql) {
		return CommonJdbcDaoUtils.query(sql, Af73.class);
	}

	public void saveAf73(Af73 af73) {
		CommonHibernateDaoUtils.save(af73);

	}

	public int updateBySql(String sql) {
		return CommonJdbcDaoUtils.update(sql);
	}

	public int queryCountForInt(String sql) {
		Integer count = CommonJdbcDaoUtils.queryObject(sql, int.class);
		if (count == null) {
			count = 0;
		}
		return count;
	}

	public String is_existsAf73(String aaz318, final String aaz077) {
		if (aaz318 != null && aaz077 != null) {
			String sql = "select A.ape139 AS ape139 FROM AF73 A WHERE 1=1  and  a.aaz318="
					+ aaz318
					+ " and a.aaz077="
					+ aaz077
					+ "and a.ape139!=5 and rownum=1";
			List<Map<String, Object>> list = CommonJdbcDaoUtils
					.queryForList(sql);
			if (list.size() != 0) {
				return list.get(0).get("ape139").toString();
			} else {
				return "no_data";
			}
		} else {
			return "no_data";
		}
	}

	public int confirm_pass_ds(String aaz318, String aaz077, String ape139) {
		int temp = 0;
		String sql = "";
		if (aaz318 != null && aaz077 != null) {
			if ("0".equals(ape139)) {// 待受理状态 sysdate-登记时间 验证是否通过确认通过
				sql = "select case\n"
						+ "         when (TRUNC(SYSDATE) -\n"
						+ "              NVL(TO_DATE(A.APE727, 'YYYYMMDD'), TRUNC(SYSDATE))) >\n"
						+ "              (select aaa005 from aa01 where aaa001 = 'SSQX') THEN\n"
						+ "          0\n" + "         ELSE\n" + "          1\n"
						+ "       END AS FLAG\n" + "  from af73 a\n"
						+ " where a.aaz318 =" + aaz318 + "   and a.aaz077 = "
						+ aaz077 + "   and a.ape139 = 0";

			} else if ("2".equals(ape139)) {// 审核不通过 sysdate-审批时间 验证是否通过确认通过
				sql = "select decode(a.aae100,\n"
						+ "              '0',\n"
						+ // 重复提交标志为0 表明 没有上传材料,或者在初次申诉中上传了材料（表明在第一次审批环节之前）
						"              case\n"
						+ "                when (TRUNC(SYSDATE) - NVL(TRUNC(A.aae036), TRUNC(SYSDATE))) >\n"
						+ "                     (select aaa005 from aa01 where aaa001 = 'CLBCSJ') THEN\n"
						+ "                 0\n"
						+ // 已经超过期限,可以确认通过
						"                ELSE\n"
						+ "                 2\n"
						+ // 还在补充材料期限之中,不能确认通过
						"              END,\n"
						+ "              '1',\n"
						+ // 重复提交标志为1 说明 是在第二次审批中被判定为审批不通过,则直接可以确认问题,确认通过。
						"              '0',\n"
						+ "              '2') AS FLAG\n"
						+ // 默认不能确认通过
						"  from af73 a\n" + " where a.aaz318 = " + aaz318
						+ "   and a.aaz077 = " + aaz077 + "   and a.ape139 = 2";

			}
			temp = queryCountForInt(sql);
		}
		return temp;
	}

	public String findHighestMonitorRank(String aaz010) {
		String apa151 = null;
		List<?> list = CommonHibernateDaoUtils
				.find("select min(a.apa151) from Ke15 a where a.aaz010 = ? and a.aae031 > to_char(sysdate,'YYYYMMDD')",
						new Object[] { aaz010 });
		if (list != null && list.size() > 0) {

			apa151 = list.get(0) != null ? list.get(0).toString() : null;
			;
		}
		return apa151;
	}

	public Af79DTO getAf79ById(String aaz524) {

		Af79DTO af79Dto = new Af79DTO();

		Af79 af79 = CommonHibernateDaoUtils.load(Af79.class,
				Long.parseLong(aaz524));

		if (af79 != null) {
			BeanTools.copyProperties(af79, af79Dto);
		}

		return af79Dto;

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object queryStringBySql(String sql, Class clazz) {
		String result = (String) CommonJdbcDaoUtils.queryObject(sql, clazz);
		return result;
	}

	public Page queryDiseaseWithPage(Page page, Ka06DTO ka06Dto) {

		StringBuffer sql = new StringBuffer("select * from ka06 a where 1 = 1");

		// 疾病分类 aka122
		if (StringTools.hasText(ka06Dto.getAka122())) {
			sql.append(" and a.aka122 like '%" + ka06Dto.getAka122() + "%'");
		}

		// 疾病编号 aka120
		if (StringTools.hasText(ka06Dto.getAka120())) {
			sql.append(" and a.,aka120 like '%" + ka06Dto.getAka120() + "%'");
		}
		// 疾病名称: aka121
		if (StringTools.hasText(ka06Dto.getAka121())) {
			sql.append(" and a.aka121 like '%" + ka06Dto.getAka121() + "%'");
		}
		// 特殊病种类别 aka035
		if (StringTools.hasText(ka06Dto.getAka035())) {
			sql.append(" and a.aka035 = '" + ka06Dto.getAka035() + "'");
		}
		// 有效标志 aae100
		if (StringTools.hasText(ka06Dto.getAae100())) {
			sql.append(" and a.aae100 = '" + ka06Dto.getAae100() + "'");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(ka06Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ka06Dto.getAaa027() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka06DTO.class);

		return result;
	}

	public QueryHistoryVO querySZJ(QueryHistoryVO queryHistoryVO) {
		String curyear = "";
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日HH:mm:ss");
		String sql = " select t.baz005,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ031' and aa10.aaa102=t.baz031) baz031,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ101' and aa10.aaa102=t.baz101) baz101,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ102' and aa10.aaa102=t.baz102) baz102,t.baz021,t.aae002,t.baz023,t2.baz010,t2.baz035,t2.baz036,t2.baz037,t.baz026,t.baz022 from (select * from kc81 where kc81.baz003= ? ) t left join ke02 t2 on (t.baz005=t2.baz005 ) order by t.baz023 asc ";
		List<QueryHistoryVO> resultList = CommonJdbcDaoUtils.query(sql,
				QueryHistoryVO.class, queryHistoryVO.getBaz003());
		if (resultList.size() > 0) {
			String sjz = "[{\"year\":\""
					+ resultList.get(0).getAae002().substring(0, 4)
					+ "\",\"flg\":\"1\",child:[";
			curyear = resultList.get(0).getAae002().substring(0, 4);
			for (int i = 0; i < resultList.size(); i++) {
				if (!curyear.equals(resultList.get(i).getAae002()
						.substring(0, 4))) {
					curyear = resultList.get(i).getAae002().substring(0, 4);
					sjz += "]},{\"year\":\""
							+ resultList.get(i).getAae002().substring(0, 4)
							+ "\",\"flg\":\"1\",child:[";
				}
				QueryHistoryVO vo = resultList.get(i);
				if (vo.getBaz021() != null) {
					vo.setBaz021(changezhuanyifu(vo.getBaz021()));// 内容转义
					if ("1".equals(queryHistoryVO.getFlag())) {
						if (StringTools.hasText(vo.getBaz022())) {
							vo.setBaz021(vo.getBaz022() + " "
									+ vo.getBaz021().trim());
						}
					}
					if (StringTools.hasText(vo.getBaz026())) {
						vo.setBaz021(vo.getBaz026() + " " + vo.getBaz021());
					}
				} else {
					vo.setBaz021("");
				}
				if (vo.getBaz037() == null) {
					sjz += "{\"month\":\"" + sdf.format(vo.getBaz023())
							+ "\",\"fj\":\"\",\"fjurl\":\"\",\"txt\":\""
							+ vo.getBaz021() + "\"}";
				} else {
					sjz += "{\"month\":\"" + sdf.format(vo.getBaz023())
							+ "\",\"fj\":\"" + vo.getBaz037()
							+ "\",\"fjurl\":\"" + vo.getBaz010()
							+ "\",\"txt\":\"" + vo.getBaz021() + "\"}";
				}
				if ((i + 1) != resultList.size()) {
					sjz += ",";
				}
			}
			sjz += "]}]";
			queryHistoryVO.setSjz(sjz);
		}
		return queryHistoryVO;
	}

	/**
	 * 对txt内容转义
	 * 
	 * @param baz021
	 * @return
	 */
	private String changezhuanyifu(String baz021) {
		baz021 = baz021.replaceAll("\n", "");
		baz021 = baz021.replaceAll("\r", "");
		baz021 = baz021.replaceAll("<", "&lt;");
		baz021 = baz021.replaceAll(">", "&gt;");
		baz021 = baz021.replaceAll("&", "&amp;");
		baz021 = baz021.replaceAll("\"", "&quot;");
		return baz021;
	}

	public List<GzSummaryVO> queryGzSummary(GzSummaryVO vo) {
		StringBuffer sql = new StringBuffer("");
		if ("04".equals(vo.getBaz031())) {// 医保办医师端
			sql.append("select a.*,b.YBFGZFLBM gzflbm from(select b.aaa168 gzbm,b.aaa167 gzmc,count(1) dsss from kc63 c,kc62 a,kc72 b where c.baz001=a.baz001 and a.baz003=b.baz003 ");
			if (StringTools.hasText(vo.getBaz031())) {
				sql.append("and a.baz031='" + vo.getBaz031() + "'");
			}
			if (StringTools.hasText(vo.getBaz101())) {
				sql.append(" and a.baz101='" + vo.getBaz101() + "'");
			}
			sql.append(" group by b.aaa168,b.aaa167 order by dsss desc)a,ybgz_ybgzfl b where a.gzbm=b.YBGZFLBM");
		} else if ("05".equals(vo.getBaz031())) {// 中心-人工审核
			sql.append("select a.*,b.YBFGZFLBM gzflbm from(select nvl(a.gzbm, b.gzbm) gzbm,\n"
					+ "       nvl(a.gzmc, b.gzmc) gzmc,\n"
					+ "       nvl(a.dsss, 0) drgcs,\n"
					+ "       nvl(b.cqs, 0) cqs\n"
					+ "  from (select b.aaa168 gzbm, b.aaa167 gzmc, count(1) dsss\n"
					+ "          from kc63 c, kc62 a, kc72 b\n"
					+ "         where c.baz001 = a.baz001\n"
					+ "           and a.baz003 = b.baz003\n"
					+ "           and a.baz031 = '05'\n"
					+ "           and c.baz021 = '3'\n"
					+ "         group by b.aaa168, b.aaa167\n"
					+ "         order by dsss desc) a\n"
					+ "  full outer join (select b.aaa168 gzbm, b.aaa167 gzmc, count(1) cqs\n"
					+ "                     from kc63 c, kc62 a, kc72 b\n"
					+ "                    where c.baz001 = a.baz001\n"
					+ "                      and a.baz003 = b.baz003\n"
					+ "                      and a.baz031 = '05'\n"
					+ "                      and c.baz021 = '3'\n"
					+ "                      and c.baz020 < sysdate - 15\n"
					+ "                    group by b.aaa168, b.aaa167\n"
					+ "                    order by cqs desc) b on a.gzbm = b.gzbm)a,ybgz_ybgzfl b\n"
					+ "where a.gzbm=b.YBGZFLBM");
		} else if ("03".equals(vo.getBaz031())) {// 中心-申述审核
			sql.append("select a.*,b.YBFGZFLBM gzflbm from (select nvl(a.gzbm, b.gzbm) gzbm,\n"
					+ "       nvl(a.gzmc, b.gzmc) gzmc,\n"
					+ "       nvl(a.sssh, 0) dsssh,\n"
					+ "       nvl(b.cqs, 0) cqs from (select b.aaa168 gzbm, b.aaa167 gzmc, count(1) sssh\n"
					+ "  from kc63 c, kc62 a, kc72 b\n"
					+ " where c.baz001 = a.baz001\n"
					+ "   and a.baz003 = b.baz003\n"
					+ "   and a.baz031 = '03'\n"
					+ " group by b.aaa168, b.aaa167\n"
					+ " order by sssh desc) a\n"
					+ "\n"
					+ "full outer join\n"
					+ "(select b.aaa168 gzbm, b.aaa167 gzmc, count(1) cqs\n"
					+ "  from kc63 c,\n"
					+ "       (select *\n"
					+ "          from kc62 a,\n"
					+ "               (select a.baz003 baz003s, max(a.baz023) baz023,a.baz031 baz031s\n"
					+ "                  from kc81 a\n"
					+ "                 where a.baz031 = '03'\n"
					+ "                 group by baz003, a.baz031) b\n"
					+ "         where a.baz003 = b.baz003s\n"
					+ "           and 15 < sysdate - b.baz023\n"
					+ "           and a.baz031 = '03') a,\n"
					+ "       kc72 b\n"
					+ " where c.baz001 = a.baz001\n"
					+ "   and a.baz003 = b.baz003\n"
					+ "   and a.baz031 = '03'\n"
					+ " group by b.aaa168, b.aaa167\n"
					+ " order by cqs desc) b\n"
					+ "on a.gzbm=b.gzbm)a,ybgz_ybgzfl b\n"
					+ "where a.gzbm=b.YBGZFLBM");
		} else if ("99".equals(vo.getBaz031())) {
			sql.append("select a.*,b.YBFGZFLBM gzflbm from (select nvl(a.gzbm, b.gzbm) gzbm,\n"
					+ "       nvl(a.gzmc, b.gzmc) gzmc,\n"
					+ "       nvl(a.sssh, 0) dsssh,\n"
					+ "       nvl(b.cqs, 0) cqs from (select b.aaa168 gzbm, b.aaa167 gzmc, count(1) sssh\n"
					+ "  from kc63 c, kc62 a, kc72 b\n"
					+ " where c.baz001 = a.baz001\n"
					+ "   and a.baz003 = b.baz003\n"
					+ "   and a.baz031 in ('03','05')\n"
					+ " group by b.aaa168, b.aaa167\n"
					+ " order by sssh desc) a\n"
					+ "\n"
					+ "full outer join\n"
					+ "(select b.aaa168 gzbm, b.aaa167 gzmc, count(1) cqs\n"
					+ "  from kc63 c,\n"
					+ "       (select *\n"
					+ "          from kc62 a,\n"
					+ "               (select a.baz003 baz003s, max(a.baz023) baz023,a.baz031 baz031s\n"
					+ "                  from kc81 a\n"
					+ "                 where a.baz031 in ('03','05')\n"
					+ "                 group by baz003, a.baz031) b\n"
					+ "         where a.baz003 = b.baz003s\n"
					+ "           and 15 < sysdate - b.baz023\n"
					+ "           and a.baz031 in ('03','05')) a,\n"
					+ "       kc72 b\n"
					+ " where c.baz001 = a.baz001\n"
					+ "   and a.baz003 = b.baz003\n"
					+ "   and a.baz031 in ('03','05')\n"
					+ " group by b.aaa168, b.aaa167\n"
					+ " order by cqs desc) b\n"
					+ "on a.gzbm=b.gzbm)a,ybgz_ybgzfl b\n"
					+ "where a.gzbm=b.YBGZFLBM");
		}
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		List<GzSummaryVO> result = new ArrayList<GzSummaryVO>();
		for (Map<String, Object> map : mapList) {
			GzSummaryVO gzSummaryVO = new GzSummaryVO();
			gzSummaryVO.setGzflbm(String.valueOf(map.get("gzflbm")));
			gzSummaryVO.setGzbm(String.valueOf(map.get("gzbm")));
			gzSummaryVO.setGzmc(String.valueOf(map.get("gzmc")));
			if ("04".equals(vo.getBaz031())) {
				gzSummaryVO
						.setDsss(Long.valueOf(String.valueOf(map.get("dsss"))));
			} else if ("03".equals(vo.getBaz031())) {
				gzSummaryVO.setDsssh(Long.valueOf(String.valueOf(map
						.get("dsssh"))));
				gzSummaryVO
						.setCqs(Long.valueOf(String.valueOf(map.get("cqs"))));
			} else if ("05".equals(vo.getBaz031())) {
				gzSummaryVO.setDrgcs(Long.valueOf(String.valueOf(map
						.get("drgcs"))));
				gzSummaryVO
						.setCqs(Long.valueOf(String.valueOf(map.get("cqs"))));
			} else if ("99".equals(vo.getBaz031())) {
				gzSummaryVO.setDsssh(Long.valueOf(String.valueOf(map
						.get("dsssh"))));
				gzSummaryVO
						.setCqs(Long.valueOf(String.valueOf(map.get("cqs"))));
			}
			result.add(gzSummaryVO);
		}
		return result;
	}

	public Ke02DTO getKe02ById(String baz010) {
		Ke02DTO kc02 = CommonJdbcDaoUtils.get(
				"select * from ke02 where baz010=?", Ke02DTO.class, baz010);
		return kc02;
	}

	public Page queryHospitalWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select a.akb020,a.akb021  from kc63 a, kc62 b where 1 = 1   and a.baz001 = b.baz001 ");
		if (StringTools.hasText(medInstitutionVO.getBaz031())) {
			sql.append(" and b.baz031 in (" + medInstitutionVO.getBaz031()
					+ ") ");
		}
		if (StringTools.hasText(medInstitutionVO.getBaz101())) {
			sql.append(" and b.baz101 in (" + medInstitutionVO.getBaz101()
					+ ") ");
		}
		// 医疗机构编号 akb020
		if (StringTools.hasText(medInstitutionVO.getAkb020())) {
			sql.append(" and a.akb020 in (" + medInstitutionVO.getAkb020()
					+ ") ");
		}
		if (StringTools.hasText(medInstitutionVO.getBaz102())) {
			sql.append(" and b.baz102 in (" + medInstitutionVO.getBaz102()
					+ ") ");
		}
		// 医疗机构名称 akb021
		if (StringTools.hasText(medInstitutionVO.getAkb021())) {
			sql.append(" and a.akb021 like '%" + medInstitutionVO.getAkb021()
					+ "%'");
		}
		sql.append(" group by a.akb020,a.akb021 ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				MedInstitutionVO.class);

		return result;
	}

	public Page queryZSDWithPage(Page page, MedInstitutionVO medInstitutionVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select  kc62.ake001 zsdbm, kc62.ake002 ake008,kc72.aaa167 ybgzflmc  from kc62,kc72,kc63 where 1 = 1  and kc62.baz001=kc63.baz001 and  kc62.baz003=kc72.baz003 ");
		if (StringTools.hasText(medInstitutionVO.getBaz031())) {
			sql.append(" and kc62.baz031 in (" + medInstitutionVO.getBaz031()
					+ ") ");
		}
		if (StringTools.hasText(medInstitutionVO.getBaz101())) {
			sql.append(" and kc62.baz101 in (" + medInstitutionVO.getBaz101()
					+ ") ");
		}
		if (StringTools.hasText(medInstitutionVO.getBaz102())) {
			sql.append(" and kc62.baz102 in (" + medInstitutionVO.getBaz102()
					+ ") ");
		}
		// 医疗机构编号 akb020
		if (StringTools.hasText(medInstitutionVO.getAkb020())) {
			sql.append(" and kc63.akb020 in (" + medInstitutionVO.getAkb020()
					+ ") ");
		}
		// 知识点名称 zsdmc
		if (StringTools.hasText(medInstitutionVO.getZsdmc())) {
			sql.append(" and kc62.ake008 like '%" + medInstitutionVO.getZsdmc()
					+ "%'");
		}
		sql.append("  group by kc62.ake001, kc62.ake002,kc72.aaa167 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				MedInstitutionVO.class);

		return result;
	}

	public void updateAf32Byid(String aaz281s, String aae200) {
		if (aaz281s == null || "".equals(aaz281s)) {
			throw new BusinessException("AdminDisposalBS-05:传入af32Dto的主键为空!");
		}
		UserContext uc = BusinessContextUtils.getUserContext();
		String user = uc.getOperatorName();
		java.util.Date date = new java.util.Date();
		String ape027 = DateUtils.format(date, "yyyyMMdd");
		String sql = "update af32 a set apa165 = '5', aae200 = '" + aae200
				+ "',ape133 = '" + user + "' , ape027 = " + ape027
				+ " where a.aaz281 in ( " + aaz281s + ")";
		CommonJdbcDaoUtils.update(sql);
	}

	public StaffListVO addPerson(StaffListVO resultVO) {
		StaffList sl = new StaffList();
		BeanTools.copyProperties(resultVO, sl);
		CommonHibernateDaoUtils.save(sl);
		BeanTools.copyProperties(sl, resultVO);
		return resultVO;
	}

	public DoctorVO updateDoctor(DoctorVO doctorVO) {
		Kf05 kf05 = new Kf05();
		BeanTools.copyProperties(doctorVO, kf05);
		CommonHibernateDaoUtils.update(kf05);
		BeanTools.copyProperties(kf05, doctorVO);
		return doctorVO;
	}

	public DoctorVO addDoctor(DoctorVO doctorVO) {
		Kf05 kf05 = new Kf05();
		BeanTools.copyProperties(doctorVO, kf05);
		CommonHibernateDaoUtils.save(kf05);
		BeanTools.copyProperties(kf05, doctorVO);
		return doctorVO;
	}

	public Page queryUnitWithPage(Page page, UnitListVO resultVO) {

		StringBuffer sb = new StringBuffer(
				"select a.* from unit_list a  where a.aaz107  is not null ");

		// 医疗机构类型 akb022
		if (StringTools.hasText(resultVO.getAkb022())) {
			sb.append(" and a.akb022 = '" + resultVO.getAkb022() + "'");
		}

		// 医疗机构编号 akb020
		if (StringTools.hasText(resultVO.getAkb020())) {
			sb.append(" and a.akb020 like '%" + resultVO.getAkb020() + "%'");
		}

		// 医疗机构名称 akb021
		if (StringTools.hasText(resultVO.getAkb021())) {
			sb.append(" and a.akb021 like '%" + resultVO.getAkb021() + "%'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(resultVO.getAka101())) {
			sb.append(" and a.aka101 = '" + resultVO.getAka101() + "'");
		}

		// 统筹区 aaa027
		if (StringTools.hasText(resultVO.getAaa027())) {
			sb.append(" and a.aaa027 = '" + resultVO.getAaa027() + "'");
		}

		// 医疗机构类别 akb023
		if (StringTools.hasText(resultVO.getAkb023())) {
			sb.append(" and a.akb023 = '" + resultVO.getAkb023() + "'");
		}

		sb.append(" order by a.akb023 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				UnitListDto.class);

		return result;
	}

	public UnitListDto getUnitByAaz107(String aaz010) {
		StringBuffer sb = new StringBuffer(
				"select a.* from Unit_list a  where a.aaz107  is not null ");

		// 医疗机构类型 akb022
		if (StringTools.hasText(aaz010)) {
			sb.append(" and a.aaz107 = " + aaz010);
		}
		return CommonJdbcDaoUtils.get(sb.toString(), UnitListDto.class);
	}

	public UnitListVO updateMedInstitution(UnitListVO unitListVO) {
		UnitList ul = new UnitList();
		BeanTools.copyProperties(unitListVO, ul);
		CommonHibernateDaoUtils.update(ul);
		BeanTools.copyProperties(ul, unitListVO);
		return unitListVO;
	}

	public UnitListVO addMedInstitution(UnitListVO unitListVO) {
		UnitList ul = new UnitList();
		BeanTools.copyProperties(unitListVO, ul);
		CommonHibernateDaoUtils.save(ul);
		BeanTools.copyProperties(ul, unitListVO);
		return unitListVO;
	}

	public boolean isAddObject(Af31DTO af31DtoP) {
		String sql = "select * from af31 where aaz318 = "
				+ af31DtoP.getAaz318() + " and ape008 = '"
				+ af31DtoP.getApe008() + "'";
		List<Af31> list = CommonJdbcDaoUtils.query(sql, Af31.class);
		if (list == null || list.size() == 0) {
			return false;
		}
		return true;
	}

	public Kf05DTO getKf05ByAaz027(String aaz010) {
		/*StringBuffer sb = new StringBuffer("select * from kf05 a  left join kf06 b on (a.aaz307 = b.aaz307) "
						+ "left join kb01 c on (a.aaz107 = c.aaz107) where 1=1 ");*/
		StringBuffer sb = new StringBuffer("select * from YBOLTP.kf05 a left join YBOLTP.kb01 c on (a.aaz107 = c.aaz107) where 1=1 ");
		if (aaz010 != null && !"".equals(aaz010)) {
			sb.append(" and a.aaz263 = '" + aaz010 + "'");
		}
		return CommonJdbcDaoUtils.get(sb.toString(), Kf05DTO.class);
	}

	public Kb01DTO getkb01ByAaz107(String aaz010) {
		StringBuffer sb = new StringBuffer(
				"select a.* from yboltp.kb01 a  where a.aaz107  is not null ");

		// 医疗机构类型 akb022
		if (StringTools.hasText(aaz010)) {
			//sb.append(" and a.aaz107 = " + aaz010);
			sb.append(" and a.aaz107 = "+"'"+ aaz010+"'");
		}
		return CommonJdbcDaoUtils.get(sb.toString(), Kb01DTO.class);
	}

	public QueryHistoryVO querySZJDBZ(QueryHistoryVO queryHistoryVO) {
		String curyear = "";
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日HH:mm:ss");
		String sql = " select t.baz013,(select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ031' and aa10.aaa102 = t.baz031) baz031,to_char(baz023,'yyyymm') aae002,t.baz021,t.baz023,t2.baz014,t2.baz035,t2.baz036,t2.baz037,t.baz026,t.baz022 from (select * from kc83 where kc83.baz011 = ?) t  left join ke03 t2  on (t.baz013 = t2.baz013) order by t.baz023 asc ";
		List<QueryHistoryVO> resultList = CommonJdbcDaoUtils.query(sql,
				QueryHistoryVO.class, queryHistoryVO.getBaz011());
		if (resultList.size() > 0) {
			String sjz = "[{\"year\":\""
					+ resultList.get(0).getAae002().substring(0, 4)
					+ "\",\"flg\":\"1\",child:[";
			curyear = resultList.get(0).getAae002().substring(0, 4);
			for (int i = 0; i < resultList.size(); i++) {
				if (!curyear.equals(resultList.get(i).getAae002()
						.substring(0, 4))) {
					curyear = resultList.get(i).getAae002().substring(0, 4);
					sjz += "]},{\"year\":\""
							+ resultList.get(i).getAae002().substring(0, 4)
							+ "\",\"flg\":\"1\",child:[";
				}
				QueryHistoryVO vo = resultList.get(i);
				if (vo.getBaz021() != null) {
					vo.setBaz021(changezhuanyifu(vo.getBaz021()));// 内容转义
					if ("1".equals(queryHistoryVO.getFlag())) {
						if (StringTools.hasText(vo.getBaz022())) {
							vo.setBaz021(vo.getBaz022() + " "
									+ vo.getBaz021().trim());
						}
					}
					if (StringTools.hasText(vo.getBaz026())) {
						vo.setBaz021(vo.getBaz026() + " " + vo.getBaz021());
					}
				} else {
					vo.setBaz021("");
				}
				if (vo.getBaz037() == null) {
					sjz += "{\"month\":\"" + sdf.format(vo.getBaz023())
							+ "\",\"fj\":\"\",\"fjurl\":\"\",\"txt\":\""
							+ vo.getBaz021() + "\"}";
				} else {
					sjz += "{\"month\":\"" + sdf.format(vo.getBaz023())
							+ "\",\"fj\":\"" + vo.getBaz037()
							+ "\",\"fjurl\":\"" + vo.getBaz010()
							+ "\",\"txt\":\"" + vo.getBaz021() + "\"}";
				}
				if ((i + 1) != resultList.size()) {
					sjz += ",";
				}
			}
			sjz += "]}]";
			queryHistoryVO.setSjz(sjz);
		}
		return queryHistoryVO;
	}

	public Af53DTO surveyDone(Af53DTO af53dto) {
		
		
		
		Af53 af53 = new Af53();
		
		af53 = CommonHibernateDaoUtils.load(Af53.class, af53dto.getAaz318());
		
		String sql = "from Af31 a where a.aaz318 = ?  and a.dcbz = '1'";
		
		String sql2 = "from Af31 a where a.aaz318 = ? ";
		
		List<Af31> af31a = CommonHibernateDaoUtils.find(sql, af53dto.getAaz318());
		
		List<Af31> af31b = CommonHibernateDaoUtils.find(sql2, af53dto.getAaz318());
		
		int i = af31a.size();
		int j = af31b.size();
		
		if (i != j) {
			
			throw new BusinessException("F10301004BS-SURVEY:请全部调查完成再提交案件");
		}
		
		af53.setAae426(AuditConstants.AAE426_CODE_7);
		af53.setAae427(AuditConstants.AAE426_CODE_7);
		
		CommonHibernateDaoUtils.update(af53);
		
		BeanTools.copyProperties(af53, af53dto);
		
		return af53dto;
	}
	public Ke03DTO getKe03ById(String baz014) {
		Ke03DTO kc03 = CommonJdbcDaoUtils.get(
				"select * from ke03 where baz014=?", Ke03DTO.class, baz014);
		return kc03;
	}
	public Map<String, Object> queryAf32WithMap(Long aaz281) {
		String sql = "select a.*,b.aaa103 as aac004,(select c.aaa103 as apa705 from af32 d,aa10 c where d.apa705 = c.aaa102 and c.aaa100 = 'APA705' and d.aaz281 = a.aaz281) as apa705,(select e.aaa103 as aaa027 from af32 f,aa10 e where f.aaa027 = e.aaa102 and e.aaa100 = 'AAA027' and f.aaz281 = a.aaz281) as aaa027 from af32 a , aa10 b where a.aac004 = b.aaa102 and b.aaa100 = 'AAC004' and a.aaz281 = ? ";
		return CommonJdbcDaoUtils.queryForMap(sql, aaz281);
	}

	public Af32DTO getMaxAaz171() {
		String sql = "SELECT substr(nvl(max(a.aaz171),'0000000'),-7,7) as aaz171 from af32 a";
		return CommonJdbcDaoUtils.getFirst(sql, Af32DTO.class);
	}

	public void updateAf31ByAaz318(String aaz318) {
		String str = DateUtils.format(new Date(0), "yyyyMMdd");//获取当前日期
		
		Integer currentDate = Integer.valueOf(str);//將日期轉換成 Integer類型
		
		//af31Dto.setAae034(currentDate);
		String sql = "update af31 a set a.dcbz = " + Integer.valueOf(AuditConstants.DCBZ_CODE_0) + ", a.aae012 = " + BusinessContextUtils.getUserContext().getOperatorName() +
				", a.aae034 = " + currentDate + "where a.aaz318 = " + aaz318 ;
		CommonJdbcDaoUtils.update(sql);
	}

	public Af38DTO queryAf38ByAaz077(String aaz077) {
		
		StringBuffer sql = new StringBuffer("select * from af38 a where a.aaz077 = '" + aaz077 + "' order by a.baz024 desc ");
		
		Af38DTO af38dto = CommonJdbcDaoUtils.getFirst(sql.toString(), Af38DTO.class);
		
		return af38dto;
	}

	public Page queryHospitalDBZWithPage(Page page,
			MedInstitutionVO medInstitutionVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select a.akb020,a.akb021  from kc65 a where 1 = 1  ");
		if (StringTools.hasText(medInstitutionVO.getBaz031())) {
			sql.append(" and a.baz031 in (" + medInstitutionVO.getBaz031()
					+ ") ");
		}
		// 医疗机构编号 akb020
		if (StringTools.hasText(medInstitutionVO.getAkb020())) {
			sql.append(" and a.akb020 in (" + medInstitutionVO.getAkb020()
					+ ") ");
		}
		// 医疗机构名称 akb021
		if (StringTools.hasText(medInstitutionVO.getAkb021())) {
			sql.append(" and a.akb021 like '%" + medInstitutionVO.getAkb021()
					+ "%'");
		}
		sql.append(" group by a.akb020,a.akb021 ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				MedInstitutionVO.class);

		return result;
	}

	public Af31DTO getAf31ByAaz077(String aaz077, String apa709) {
		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException("F10301008:aaz077 is null.");
		}
		
		String sql = "";
		if ("1".equals(apa709)) {
			sql = "select a.ape008, a.aaz010, b.ape726, (SELECT t.aaa103 FROM aa10 t WHERE t.aaa100 = 'APE701' AND t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701, a.ape726 from af31 a,af38 b where a.aaz077 = b.aaz077 and a.aaz077 = '" + aaz077 + "' ";

		}
		if ("2".equals(apa709)) {
			sql = "select a.ape008, a.aaz010, b.ape726, (SELECT t.aaa103 FROM aa10 t WHERE t.aaa100 = 'APE702' AND t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701, a.ape726 from af31 a,af38 b where a.aaz077 = b.aaz077 and a.aaz077 = '" + aaz077 + "' ";

		}
		if ("3".equals(apa709)) {
			sql = "select a.ape008, a.aaz010, b.ape726, (SELECT t.aaa103 FROM aa10 t WHERE t.aaa100 = 'APA701' AND t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701, a.ape726 from af31 a,af38 b where a.aaz077 = b.aaz077 and a.aaz077 = '" + aaz077 + "' ";

		}/*else{
			sql = "select a.ape008, a.aaz010, b.ape726, (SELECT t.aaa103 FROM aa10 t WHERE t.aaa100 = 'APA701' AND t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701, a.ape726 from af31 a,af38 b where a.aaz077 = b.aaz077 and a.aaz077 = '" + aaz077 + "' ";

		}*/
		
		Af31DTO af31dto = CommonJdbcDaoUtils.getFirst(sql, Af31DTO.class);
		
		return af31dto;
	}

}
