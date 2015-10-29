package com.wondersgroup.bc.statisticalanalysis.statistic.bs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.CbrjyqsDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctDrugDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctTendDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc50DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke12DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke13DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kf27DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kf28DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.PresInfoDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.VisitInfoDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AcceptDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AnalAttenMediDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediClinDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediDrugDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediFeeTrendDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediMoveAvgDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.YlfwjgfxfyfzqsDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.YlfwjgfxfyzbDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603005.vo.AcceptPeopleVO;
import com.wondersgroup.local.k6.f10603007.vo.F10603007VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class StatisticBSImpl implements StatisticBS {

	public List<Kc50DTO> queryInsurWithPage(Kc50DTO kc50Dto) {

		StringBuffer sql = new StringBuffer("select aac001,aac003,valueA from  ");

		sql.append(" (SELECT aac001 ,aac003, decode(SIGN(SUM(akc264)-10000),-1,"
				+ "SUM(akc264),decode(sign(round(SUM(akc264)/10000,2)*10000-100000000),-1,"
				+ "round(SUM(akc264)/10000,2)*10000,ROUND(SUM(akc264)/100000000,2)*100000000)) as valueA , "
				+ "dense_rank() over(ORDER BY SUM(akc264) DESC) dense_rank FROM kc50 a where 1 = 1  ");

		// 起始年月 aae041
		if (StringTools.hasText(kc50Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + kc50Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kc50Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + kc50Dto.getAae042() + "'");
		}
		// ape032
		if (StringTools.hasText(kc50Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + kc50Dto.getApe032() + "'");
		}

		// 险种类型 aae140
		if (StringTools.hasText(kc50Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + kc50Dto.getAae140() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kc50Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kc50Dto.getAka130() + "'");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(kc50Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kc50Dto.getAaa027() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(kc50Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + kc50Dto.getAkc021() + "'");
		}
		// 医疗机构ID aaz107
		if (StringTools.hasText(kc50Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + kc50Dto.getAaz107() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kc50Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + kc50Dto.getAka122() + "'");
		}
		// 医疗机构类别: akb022
		if (StringTools.hasText(kc50Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + kc50Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kc50Dto.getAka101())) {
			sql.append("and a.aka101 = '" + kc50Dto.getAka101() + "'");
		}

		sql.append(" GROUP BY aac001 ,aac003 ) ");

		// 排名数量 rank 按总费用降序排序
		if (kc50Dto.getRank() != null) {
			sql.append(" where dense_rank <= " + kc50Dto.getRank());
		}

		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());

		List<Kc50DTO> list = new ArrayList<Kc50DTO>();

		for (Map<String, Object> map : mapList) {

			Kc50DTO kc50DTO = new Kc50DTO();

			kc50DTO.setAac001(String.valueOf(map.get("aac001")));

			kc50DTO.setAac003(String.valueOf(map.get("aac003")));

			kc50DTO.setValueA(Double.parseDouble(String.valueOf(map
					.get("valueA"))));

			list.add(kc50DTO);
		}

		return list;
	}

	public CbrjyqsDTO queryProccid(CbrjyqsDTO cbrjyqsDto) {
		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_anal_data.prc_PersMedi_anal", cbrjyqsDto);
		return cbrjyqsDto;
	}

	public Page querySeeDoctTrendWithPage(Page page, Kc50DTO kc50Dto) {
		StringBuffer sql = new StringBuffer(
				"select anal_id as proccid,memo as aae041,trunc(cur_pred,2) as cur_pred,trunc(pre_pred,2) as pre_pred," +
				"trunc(sam_pred,2) as sam_pred,trunc(pre_rate,2) as pre_rate,trunc(sam_rate,2) as sam_rate,tre_mean,aaa027," +
				"aae041 as querytime from anal_pers_medi a where 1=1");
		if (StringTools.hasText(kc50Dto.getProccid())) {
			sql.append("and a.anal_id='" + kc50Dto.getProccid() + "'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc50DTO.class);

		return result;
	}

	/****
	 * 查询移动平均
	 */
	public List<Kc50DTO> queryMoveAverage(Kc50DTO kc50Dto) {
		StringBuffer sql = new StringBuffer(
				"select memo as label,decode(SIGN(tre_mean-10000),-1,tre_mean," +
				"decode(sign(round(tre_mean/10000,2)*10000-100000000),-1,round(tre_mean/10000,2)*10000," +
				"ROUND(tre_mean/100000000,2)*100000000)) as valueC,decode(SIGN(cur_pred-10000),-1,cur_pred," +
				"decode(sign(round(cur_pred/10000,2)*10000-100000000),-1,round(cur_pred/10000,2)*10000," +
				"ROUND(cur_pred/100000000,2)*100000000)) as valueB from anal_pers_medi a where 1=1 ");
		if (StringTools.hasText(kc50Dto.getProccid())) {
			sql.append("and a.anal_id='" + kc50Dto.getProccid() + "'");
		}
		sql.append("order by aae041");
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());

		List<Kc50DTO> list = new ArrayList<Kc50DTO>();

		for (Map<String, Object> map : mapList) {

			Kc50DTO kc50DTO = new Kc50DTO();

			kc50DTO.setLabel(String.valueOf(map.get("label")));

			kc50DTO.setValueB(Float.parseFloat(String.valueOf(map
					.get("valueB"))));
			kc50DTO.setValueC(Float.parseFloat(String.valueOf(map
					.get("valueC"))));
			list.add(kc50DTO);
		}
		return list;
	}

	public Page queryMedicCateWithPage(Page page, Kc50DTO kc50Dto) {

		StringBuffer sql = new StringBuffer(
				" select a.aac001,a.aka130,a.aae041,a.akc021,"
						+ "sum(a.ake052) ake052,sum(a.akc264) akc264,sum(a.akc254) akc254,"
						+ "sum(a.akc253) akc253,round(sum(a.akc264)/sum(a.ake052),2) as cjfy  "
						+ "from kc50 a where 1 = 1 ");

		// 参保人编码 aac001
		if (StringTools.hasText(kc50Dto.getAac001())) {
			sql.append(" and a.aac001 = '" + kc50Dto.getAac001() + "'");
		}

		// 起始年月 aae041
		if (StringTools.hasText(kc50Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + kc50Dto.getAae041() + "'");
		}

		// 终止年月 aae042
		if (StringTools.hasText(kc50Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + kc50Dto.getAae042() + "'");
		}

		// ape032
		if (StringTools.hasText(kc50Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + kc50Dto.getApe032() + "'");
		}

		// 险种类型 aae140
		if (StringTools.hasText(kc50Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + kc50Dto.getAae140() + "'");
		}

		// 医疗类别:aka130
		if (StringTools.hasText(kc50Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kc50Dto.getAka130() + "'");
		}

		// 统筹区编码 aaa027
		if (StringTools.hasText(kc50Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kc50Dto.getAaa027() + "'");
		}

		// 身份类别: akc021
		if (StringTools.hasText(kc50Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + kc50Dto.getAkc021() + "'");
		}

		// 医疗机构ID aaz107
		if (StringTools.hasText(kc50Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + kc50Dto.getAaz107() + "'");
		}

		// 疾病分类 aka122
		if (StringTools.hasText(kc50Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + kc50Dto.getAka122() + "'");
		}

		// 医疗机构类别: akb022
		if (StringTools.hasText(kc50Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + kc50Dto.getAkb022() + "'");
		}

		// 医院等级 aka101
		if (StringTools.hasText(kc50Dto.getAka101())) {
			sql.append("and a.aka101 = '" + kc50Dto.getAka101() + "'");
		}

		sql.append(" group by a.aac001,a.aka130,a.aae041,"
				+ "a.akc021 order by a.aac001,a.aka130,a.aae041,a.akc021");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc50DTO.class);

		return result;
	}

	public Page queryDiseCateWithPage(Page page, Kc50DTO kc50Dto) {

		StringBuffer sql = new StringBuffer(
				" select a.aac001,b.aka121,a.aka122,a.aae041,a.akc021,sum(a.ake052) ake052,"
						+ "sum(a.akc264) akc264,sum(a.akc254) akc254,sum(a.akc253) akc253,"
						+ "round(sum(a.akc264)/sum(a.ake052),2) as cjfy  from ");

		sql.append(" kc50 a , ka06 b where 1 = 1 and a.aka122=b.aka122(+) ");

		// 参保人编码 aac001
		if (StringTools.hasText(kc50Dto.getAac001())) {
			sql.append(" and a.aac001 = '" + kc50Dto.getAac001() + "'");
		}

		// 起始年月 aae041
		if (StringTools.hasText(kc50Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + kc50Dto.getAae041() + "'");
		}

		// 终止年月 aae042
		if (StringTools.hasText(kc50Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + kc50Dto.getAae042() + "'");
		}

		// ape032
		if (StringTools.hasText(kc50Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + kc50Dto.getApe032() + "'");
		}

		// 险种类型 aae140
		if (StringTools.hasText(kc50Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + kc50Dto.getAae140() + "'");
		}

		// 医疗类别:aka130
		if (StringTools.hasText(kc50Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kc50Dto.getAka130() + "'");
		}

		// 统筹区编码 aaa027
		if (StringTools.hasText(kc50Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kc50Dto.getAaa027() + "'");
		}

		// 身份类别: akc021
		if (StringTools.hasText(kc50Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + kc50Dto.getAkc021() + "'");
		}

		// 医疗机构ID aaz107
		if (StringTools.hasText(kc50Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + kc50Dto.getAaz107() + "'");
		}

		// 疾病分类 aka122
		if (StringTools.hasText(kc50Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + kc50Dto.getAka122() + "'");
		}

		// 医疗机构类别: akb022
		if (StringTools.hasText(kc50Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + kc50Dto.getAkb022() + "'");
		}

		// 医院等级 aka101
		if (StringTools.hasText(kc50Dto.getAka101())) {
			sql.append("and a.aka101 = '" + kc50Dto.getAka101() + "'");
		}

		sql.append(" group by a.aac001,b.aka121,a.aka122,a.aae041,a.akc021 "
				+ "order by a.aac001,a.aka122,a.aae041");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc50DTO.class);

		return result;
	}
	
	public Ac01DTO getByAc01Id(String aac001){
		
		Ac01DTO ac01Dto = new Ac01DTO();
		
		Ac01 ac01 = CommonHibernateDaoUtils.load(Ac01.class, aac001);
		
		if(ac01 != null){
			BeanTools.copyProperties(ac01, ac01Dto);
		}
		
		return ac01Dto;
	}

	public Page queryInsurVisInfoByAac001(Page page, VisitInfoDTO visDto) {

		StringBuffer sql = new StringBuffer(
				"select akc190,aae030,aae031,"
						+ "to_char(akc194,'yyyy-mm-dd hh24:mi:ss') akc194,aac001,aac002,aac003,aac004,akb021 ,"
						+ "AAZ263,ake024,aka122,aka130,aaz217, SUM(akc264) akc264, "
						+ "SUM(ake038) ake038, SUM(akc254) akc254,SUM(akc253) akc253, "
						+ "SUM(ake039) ake039,SUM(ake029) ake029, SUM(ake035) ake035, "
						+ "SUM(ake043) ake043, SUM(ake032) ake032,SUM(ake042) ake042,"
						+ "max(aka151) aka151,max(aka153) aka153,max(ake092) ake092,aka030  from (");

		if (!StringTools.hasText(visDto.getAka065())
				&& !StringTools.hasText(visDto.getAka063())
				&& !StringTools.hasText(visDto.getAke003())) {
			sql.append(" SELECT distinct b.aaz308,a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031, a.aac001,c.akb021 ,a.akc194 akc194,"
					+ "a.AAZ263,a.ake024,a.aka122,a.aka130,a.aaz217,b.akc264 akc264,b.ake038 ake038,"
					+ "b.akc254 akc254, b.akc253 akc253,b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,"
					+ "b.ake043 ake043,b.ake032 ake032,b.ake042 ake042,b.aka151,b.aka153,b.ake092,"
					+ "a.aka030,a.aac004,a.aac003 , a.aac002,c.aae004,b.akc021,a.aaz307,b.akb067 "
					+ " FROM  kc21 a ,kc24 b,kb01 c where 1 = 1 and a.aaz217=b.aaz217 and a.akb020 = c.akb020 ");
		} else {
			sql.append(" SELECT distinct b.aaz308,a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031, a.aac001,c.akb021 ,a.akc194 akc194,"
					+ "a.AAZ263,a.ake024,a.aka122,a.aka130,a.aaz217,b.akc264 akc264,b.ake038 ake038,"
					+ "b.akc254 akc254, b.akc253 akc253,b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,"
					+ "b.ake043 ake043,b.ake032 ake032,b.ake042 ake042,b.aka151,b.aka153,b.ake092,"
					+ "a.aka030,a.aac004,a.aac003 , a.aac002,c.aae004,b.akc021,a.aaz307,b.akb067  "
					+ " FROM kc21 a ,kc24 b,kb01 c , kc22 d "
					+ "where 1 = 1 and  a.aaz217=b.aaz217 and a.akb020 = c.akb020 and a.aaz217=d.aaz217 ");
		}

		// 人员编号
		if (visDto.getAac001() != null) {
			sql.append(" and a.aac001 = '" + visDto.getAac001() + "'");
		}

		// 就诊起始日期 aae041
		if (StringTools.hasText(visDto.getAae041())) {
			sql.append(" and a.akc194>=to_date('" + visDto.getAae041()
					+ "' * 100 + 1,'yyyy-mm-dd')");
		}
		// 就诊结束日期 aae042
		if (StringTools.hasText(visDto.getAae042())) {
			sql.append(" and a.akc194 <add_months(to_date('"
					+ visDto.getAae042() + "' * 100 + 1,'yyyy-mm-dd'),1)");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(visDto.getAka130())) {
			sql.append(" and a.aka130 = '" + visDto.getAka130() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(visDto.getAkb022())) {
			sql.append(" and c.akb022 = '" + visDto.getAkb022() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(visDto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + visDto.getAaz107() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(visDto.getAka122())) {
			sql.append(" and a.aka122 = '" + visDto.getAka122() + "'");
		}

		// 收费项目等级 aka065
		if (StringTools.hasText(visDto.getAka065())) {
			sql.append(" and d.aka065 = '" + visDto.getAka065() + "'");
		}
		// 三大目录类别 ake003
		if (StringTools.hasText(visDto.getAke003())) {
			sql.append(" and d.ake003 = '" + visDto.getAke003() + "'");
		}
		// 发票项目类别 aka063
		if (StringTools.hasText(visDto.getAka063())) {
			sql.append(" and d.aka063 = '" + visDto.getAka063() + "'");
		}
		// 费用统计类别 tjlb

		sql.append(" ) group by akc190,aae030,aae031,akc194,aac001,akb021,aaz263,"
				+ "ake024,aka122,aka130,aaz217,aka030 ,aac003,aac004,aac002,aae004,"
				+ "akc021,aaz307  "
				+ "order by  aac001,akb021 ,AAZ263,ake024,aka122,aka130");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),VisitInfoDTO.class);

		return result;
	}

	public Page queryPresInfoByAaz217(Page page, PresInfoDTO presDto) {

		StringBuffer sql = new StringBuffer(
				" SELECT  a.ake001,b.aaz210,to_char(b.akc221,'yyyy-mm-dd hh24:mi:ss') akc221,"
						+ "b.aae019,b.aka017,a.ake002,a.aka081,a.aka029,a.aka031,a.aka032,a.aka033,aka070,a.ake004,a.aka064,"
						+ "a.aka166,a.aka184,a.aka187,a.aka169,a.aka170,a.aka196,a.aac004,a.aaz217,a.ake003,a.aka063,a.aka065,"
						+ "a.akc225, sum(a.akc226) akc226,sum(a.akb065) akb065,sum(a.akc229) akc229,sum(a.akc231) akc231 "
						+ "FROM kc22 a,kc23 b   ");

		sql.append(" where a.aaz217=b.aaz217 and a.aaz210=b.aaz210 and b.aaz217 IN ( '"
				+ presDto.getAaz217() + "' ) ");

		sql.append(" group by  a.ake001,b.aaz210,b.akc221,b.aae019,b.aka017,a.ake002,"
				+ "a.aka081,a.aka029,a.aka031,a.aka032,"
				+ "a.aka033,aka070,a.ake004,a.aka064,a.aka166,"
				+ "a.aka184,a.aka187,a.aka169,a.aka170,a.aka196,a.aac004,"
				+ "a.aaz217,a.ake003,a.aka063,a.aka065,a.akc225 order by b.aaz210 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				PresInfoDTO.class);

		return result;
	}

	public Page queryVoisRecdWithPage(Page page, Af31DTO af31Dto) {

		StringBuffer sql = new StringBuffer(
				" select * from af31 a where a.aaz077 is not null ");
//
//		if (StringTools.hasText(af31Dto.getAaz010())) {
//			sql.append(" and a.aaz010 = '" + af31Dto.getAaz010() + "'");
//		}

//		if (StringTools.hasText(af31Dto.getApa709())) {
//			sql.append(" and a.apa709 = '" + af31Dto.getApa709() + "'");
//		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af31DTO.class);

		return result;
	}

	public DoctTendDTO queryAnalidByDoctFee(DoctTendDTO dtDto) {

		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_anal_data.prc_DoctFee_top", dtDto);

		return dtDto;
	}

	public List<AnalTopDTO> queryDoctExpenWithPage(Ke13DTO ke13Dto) {

		StringBuffer sql = new StringBuffer(
				" select toplabel, decode(SIGN(topvalue-10000),-1,a.topvalue,"
						+ "decode(sign(round(topvalue/10000,2)*10000-100000000),-1,round(topvalue/10000,2)*10000,"
						+ "ROUND(topvalue/100000000,2)*100000000)) as valueA,a.topid from anal_top a where 1 = 1 ");

		if (StringTools.hasText(ke13Dto.getAnalid())) {
			sql.append(" and a.anal_id = '" + ke13Dto.getAnalid() + "'");
		}

		sql.append(" and a.toprank < = " + ke13Dto.getRank()
				+ " ORDER BY a.topvalue DESC");

		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql.toString());

		List<AnalTopDTO> list = new ArrayList<AnalTopDTO>();

		for (Map<String, Object> map : mapList) {

			AnalTopDTO analTopDto = new AnalTopDTO();

			analTopDto.setToplabel(String.valueOf(map.get("toplabel")));

			analTopDto.setTopid(String.valueOf(map.get("topid")));

			analTopDto.setValueA(Double.parseDouble(String.valueOf(map.get("valueA"))));

			list.add(analTopDto);
		}

		return list;
	}

	public Page queryDoctMediCateWithPage(Page page, Ke13DTO ke13Dto) {

		StringBuffer sql = new StringBuffer(
				"SELECT a.aaz263,a.aae041,a.aka130,SUM(a.ake098) ake098,"
						+ "sum(a.akc264) akc264,SUM(a.akc254) akc254,SUM(a.akc253) akc253,SUM(akb068) akb068,"
						+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2)  AS cjfy "
						+ "FROM ke13 a where 1 = 1 ");

		// 统计周期 ape032
		if (StringTools.hasText(ke13Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + ke13Dto.getApe032() + "'");
		}
		// 医护人员编号 aaz263
		if (StringTools.hasText(ke13Dto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + ke13Dto.getAaz263() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke13Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + ke13Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke13Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + ke13Dto.getAae042() + "'");
		}
		// 医疗服务机构类型 akb022
		if (StringTools.hasText(ke13Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + ke13Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke13Dto.getAka101())) {
			sql.append(" and a.aka101 = '" + ke13Dto.getAka101() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(ke13Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + ke13Dto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(ke13Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + ke13Dto.getAka130() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke13Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + ke13Dto.getAka122() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke13Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + ke13Dto.getAae140() + "'");
		}
		// 卫生技术人员专业技术职务 aaf009
		if (StringTools.hasText(ke13Dto.getAaf009())) {
			sql.append(" and a.aaf009 = '" + ke13Dto.getAaf009() + "'");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke13Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ke13Dto.getAaa027() + "'");
		}

		sql.append(" GROUP BY  a.aaz263,a.aae041,a.aka130 order by  a.aaz263,a.aae041,a.aka130 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Ke13DTO.class);

		return result;
	}

	public Page queryDoctStatuCateWithPage(Page page, Ke13DTO ke13Dto) {

		StringBuffer sql = new StringBuffer(
				" SELECT a.aaz263,a.aae041,a.akc021,SUM(a.ake098) ake098,"
						+ "sum(a.akc264) akc264,SUM(a.akc254) akc254,SUM(a.akc253) akc253, SUM(akb068) akb068,"
						+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2)  AS cjfy "
						+ "FROM ke13 a where 1 = 1 ");

		// 统计周期 ape032
		if (StringTools.hasText(ke13Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + ke13Dto.getApe032() + "'");
		}
		// 医护人员编号 aaz263
		if (StringTools.hasText(ke13Dto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + ke13Dto.getAaz263() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke13Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + ke13Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke13Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + ke13Dto.getAae042() + "'");
		}
		// 医疗服务机构类型 akb022
		if (StringTools.hasText(ke13Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + ke13Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke13Dto.getAka101())) {
			sql.append(" and a.aka101 = '" + ke13Dto.getAka101() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(ke13Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + ke13Dto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(ke13Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + ke13Dto.getAka130() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke13Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + ke13Dto.getAka122() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke13Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + ke13Dto.getAae140() + "'");
		}
		// 卫生技术人员专业技术职务 aaf009
		if (StringTools.hasText(ke13Dto.getAaf009())) {
			sql.append(" and a.aaf009 = '" + ke13Dto.getAaf009() + "'");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke13Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ke13Dto.getAaa027() + "'");
		}

		sql.append(" GROUP BY  a.aaz263,a.aae041,a.akc021 order by  a.aaz263,a.aae041,a.akc021 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ke13DTO.class);

		return result;
	}

	public Page queryDoctDiseCateWithPage(Page page, Ke13DTO ke13Dto) {

		StringBuffer sql = new StringBuffer(
				" SELECT a.aaz263,a.aae041,b.aka121, a.aka122,SUM(a.ake096) ake096,"
						+ "SUM(a.ake098) ake098,sum(a.akc264) akc264, SUM(a.akc254) akc254,SUM(a.akc253) akc253,"
						+ "SUM(akb068) akb068,ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2)  AS cjfy, "
						+ "ROUND(sum(a.akc264)/DECODE(NVL(sum(a.ake096),0),0,1,sum(a.ake096)),2) AS rjfy "
						+ "FROM ke13 a,ka06 b where 1 = 1 and a.aka122=b.aka122(+) ");

		// 统计周期 ape032
		if (StringTools.hasText(ke13Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + ke13Dto.getApe032() + "'");
		}
		// 医护人员编号 aaz263
		if (StringTools.hasText(ke13Dto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + ke13Dto.getAaz263() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke13Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + ke13Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke13Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + ke13Dto.getAae042() + "'");
		}
		// 医疗服务机构类型 akb022
		if (StringTools.hasText(ke13Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + ke13Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke13Dto.getAka101())) {
			sql.append(" and a.aka101 = '" + ke13Dto.getAka101() + "'");
		}
		// 结算身份类别 akc021
		if (StringTools.hasText(ke13Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + ke13Dto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(ke13Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + ke13Dto.getAka130() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke13Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + ke13Dto.getAka122() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke13Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + ke13Dto.getAae140() + "'");
		}
		// 卫生技术人员专业技术职务 aaf009
		if (StringTools.hasText(ke13Dto.getAaf009())) {
			sql.append(" and a.aaf009 = '" + ke13Dto.getAaf009() + "'");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke13Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ke13Dto.getAaa027() + "'");
		}

		sql.append(" GROUP BY  a.aaz263,a.aae041,b.aka121, a.aka122 order by  a.aaz263,a.aae041,b.aka121, a.aka122 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ke13DTO.class);

		return result;
	}

	public Page queryDoctVisitWithPage(Page page, VisitInfoDTO visitDto) {

		StringBuffer sql = new StringBuffer(
				" select akc190,aae030,aae031,max(to_char(akc194,'yyyy-mm-dd hh24:mi:ss')) akc194,"
						+ "aac001,akb021 ,aac003,aac004,aac002,AAZ263,ake024,aka122,aka130,aaz217, SUM(akc264) akc264,SUM(ake038) ake038, "
						+ "SUM(akc254) akc254,SUM(akc253) akc253, SUM(ake039) ake039,SUM(ake029) ake029, SUM(ake035) ake035,"
						+ " SUM(ake043) ake043, SUM(ake032) ake032,SUM(ake042) ake042,max(aka151) aka151,max(aka153) aka153,"
						+ "max(ake092) ake092,aka030  from ( ");

		if (StringTools.hasText(visitDto.getAka065())
				&& StringTools.hasText(visitDto.getAka063())
				&& StringTools.hasText(visitDto.getAke003())) {
			sql.append(" SELECT distinct b.aaz308, a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031,a.aac001,c.akb021 ,a.aac003,a.aac004,"
					+ "a.aac002,a.jzsj akc194,a.akc194 akc194D,a.AAZ263,a.ake024,a.aka122,a.aka130,"
					+ "a.aaz217,b.akc264 akc264,b.ake038 ake038,b.akc254 akc254, b.akc253 akc253,"
					+ "b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,b.ake043 ake043,b.ake032 ake032,"
					+ "b.ake042 ake042,b.aka151,b.aka153,b.ake092,a.aka030  FROM v_kc21 a ,kc24 b,kb01 c "
					+ "where 1 = 1 and a.aaz217=b.aaz217 and a.aaz107=c.aaz107  ");
		} else {
			sql.append(" SELECT distinct b.aaz308,a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031,a.aac001,c.akb021 ,a.aac003,a.aac004,"
					+ "a.aac002,a.jzsj akc194,a.akc194 akc194D,a.AAZ263,a.ake024,a.aka122,a.aka130,"
					+ "a.aaz217,b.akc264 akc264,b.ake038 ake038,b.akc254 akc254, b.akc253 akc253,"
					+ "b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,b.ake043 ake043,b.ake032 ake032,"
					+ "b.ake042 ake042,b.aka151,b.aka153,b.ake092,a.aka030  FROM v_kc21 a ,kc24 b,kb01 c,kc22 d "
					+ "where 1 = 1 and a.aaz217=b.aaz217 and a.aaz107=c.aaz107 and a.aaz217=d.aaz217 ");
		}
		// aaz263
		if (StringTools.hasText(visitDto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + visitDto.getAaz263() + "'");
		}
		// 就诊起始年月 aae041
		if (StringTools.hasText(visitDto.getAae041())) {
			sql.append(" and a.akc194>=to_date('" + visitDto.getAae041()
					+ "' * 100 + 1,'yyyy-mm-dd') ");
		}
		// 就诊终止年月 aae042
		if (StringTools.hasText(visitDto.getAae042())) {
			sql.append(" and a.akc194 <add_months(to_date('"
					+ visitDto.getAae042() + "' * 100 + 1,'yyyy-mm-dd'),1)");
		}
		// 医疗机构类别akb022
		if (StringTools.hasText(visitDto.getAkb022())) {
			sql.append(" c.akb022 = '" + visitDto.getAkb022() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(visitDto.getAka130())) {
			sql.append(" and a.aka130 = '" + visitDto.getAka130() + "'");
		}
		// 险种类型 akc140
		if (StringTools.hasText(visitDto.getAae140())) {
			sql.append(" a.aae140 = '" + visitDto.getAae140() + "'");
		}
		// 身份类别 akc021
		if (StringTools.hasText(visitDto.getAkc021())) {
			sql.append(" and a.akc021 = '" + visitDto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(visitDto.getAka130())) {
			sql.append(" a.aka130 = '" + visitDto.getAka130() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(visitDto.getAka122())) {
			sql.append(" and a.aka122 = '" + visitDto.getAka122() + "'");
		}
		// 收费项目等级 aka065
		if (StringTools.hasText(visitDto.getAka065())) {
			sql.append(" and d.aka065 = '" + visitDto.getAka065() + "'");
		}
		// 三大目录类别 ake003
		if (StringTools.hasText(visitDto.getAke003())) {
			sql.append(" and d.ake003 = '" + visitDto.getAke003() + "'");
		}
		// 发票项目类别 aka063
		if (StringTools.hasText(visitDto.getAka063())) {
			sql.append(" and d.aka063 = '" + visitDto.getAka063() + "'");
		}
		sql.append(" ) group by akc190,aae030,aae031,akc194D,aac001,akb021 ,aac003,aac004,"
				+ "aac002,AAZ263,ake024,aka122,aka130,aaz217,aka030 order by aaz217 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				VisitInfoDTO.class);

		return result;
	}

	public List<Ke12DTO> queryInvoice(Ke12DTO ke12Dto) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select b.aaa103 as label,decode(SIGN(sum(a.akc264)-10000),-1,sum(a.akc264)," +
				"decode(sign(round(sum(a.akc264)/10000,2)*10000-100000000),-1,round(sum(a.akc264)/10000,2)*10000," +
				"ROUND(sum(a.akc264)/100000000,2)*100000000)) as valueA,ake003 as id from ke12 a,aa10 b where 1=1");
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		// 统计周期 ape032
		if (StringTools.hasText(ke12Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + ke12Dto.getApe032() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and a.aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + ke12Dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and a.aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		// 专业技术职务
		if (StringTools.hasText(ke12Dto.getAaf009())) {
			sql.append(" and a.aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		sql.append(" and a.ake003=b.aaa102(+) and b.aaa100='AKE003' group by a.ake003,b.aaa103 order by id");
		
		List<Ke12DTO> list = new ArrayList<Ke12DTO>();
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		for (Map<String, Object> map : mapList) {
			Ke12DTO k = new Ke12DTO();
			k.setLabel(String.valueOf(map.get("label")));
			k.setValueA(Float.parseFloat(String.valueOf(map.get("valueA"))));
			k.setId(String.valueOf(map.get("id")));
			list.add(k);
		}
		return list;
	}
	public Page queryChargeWithPage(Page page, Ke12DTO ke12Dto) {
		StringBuffer sql = new StringBuffer("");
		//三大目录类别
		if (StringTools.hasText(ke12Dto.getAke003())) {
			sql.append("SELECT aka065,akc264,DECODE(lead,0,ratio+test2,ratio) as ratio,allratio as allratio FROM  (  ");
			sql.append("SELECT aka065,akc264, ratio,100 - SUM(ratio) over() test2,allratio, 100 - SUM(allratio) over() test," +
					" lead (aka065,1,0) OVER (ORDER BY aka065) LEAD from");
			sql.append("(select a.aka065 as aka065,trunc(sum(a.akc264),2) as akc264,ROUND((sum(a.akc264)/b.akc264),4)*100 as ratio," +
					"ROUND((sum(a.akc264)/c.akc264),4)*100 as allratio from ke12 a,(select sum(akc264) as akc264 from ke12 where 1=1 ");
		}
		else{
			sql.append("SELECT aka065,akc264, ratio + decode(hh, 2, 100 - SUM(ratio) over(), 0) as ratio,allratio  FROM (");
			sql.append("select a.aka065 as aka065,trunc(sum(a.akc264),2) as akc264," +
					"ROUND((sum(a.akc264)/b.akc264),4)*100 as ratio," +
					"ROUND((sum(a.akc264)/c.akc264),4)*100 as allratio," +
					"row_number() over(ORDER BY sum(a.akc264)DESC NULLS LAST) hh from ke12 a," +
					"(select sum(akc264) as akc264 from ke12 where 1=1");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		// 三大目录类别
		if (StringTools.hasText(ke12Dto.getAke003())) {
			sql.append(" and ake003 = '" + ke12Dto.getAke003() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//专业技术职务
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		sql.append(") b,(select sum(akc264) as akc264 from ke12 where 1=1 ");
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		//统计周期
		if (StringTools.hasText(ke12Dto.getApe032())) {
			sql.append(" and ape032 = '" + ke12Dto.getApe032() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//专业技术职务
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		sql.append(" )c where 1=1");
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		//统计周期
		if (StringTools.hasText(ke12Dto.getApe032())) {
			sql.append(" and a.ape032 = '" + ke12Dto.getApe032() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		// 三大目录类别
		if (StringTools.hasText(ke12Dto.getAke003())) {
			sql.append(" and ake003 = '" + ke12Dto.getAke003() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and c.akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and a.aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and a.aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and a.aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and a.aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and a.akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//专业技术职务
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and a.aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		// 三大目录类别
		if (StringTools.hasText(ke12Dto.getAke003())) {
			sql.append(" group by a.aka065,b.akc264,c.akc264)) ORDER BY aka065");
		}
		else{
			sql.append(" group by a.aka065,b.akc264,c.akc264) ORDER BY aka065");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ke12DTO.class);
		return result;
	}

	public List<Ke12DTO> queryDoctRank(Ke12DTO ke12Dto) {
		StringBuffer sql=new StringBuffer("");
		sql.append("select aac003 as label, ratio as valueA, dense_rank as id from (SELECT aac003 , " +
				"trunc((akc264/total),4)*100 as ratio , dense_rank() over(ORDER BY akc264/total DESC) " +
				"dense_rank from (select ke12.aac003,SUM(ke12.akc264) as akc264,sum(a.akc264) as total FROM ke12,");
		sql.append("(SELECT sum(akc264) akc264, aac003 FROM ke12 where 1=1 ");
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and ke12.aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		//统计周期
		if (StringTools.hasText(ke12Dto.getApe032())) {
			sql.append(" and ke12.ape032 = '" + ke12Dto.getApe032() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and ke12.aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and ke12.aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and ke12.aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and ke12.akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and ke12.aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and ke12.aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and ke12.aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and ke12.aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and ke12.aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and ke12.akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//专业技术职务
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and ke12.aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		sql.append(" group by ke12.aac003) a where ke12.aac003 = a.aac003");
		// 统筹区编码 aaa027
		if (StringTools.hasText(ke12Dto.getAaa027())) {
			sql.append(" and ke12.aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		//统计周期
		if (StringTools.hasText(ke12Dto.getApe032())) {
			sql.append(" and ke12.ape032 = '" + ke12Dto.getApe032() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(ke12Dto.getAae041())) {
			sql.append(" and ke12.aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(ke12Dto.getAae042())) {
			sql.append(" and ke12.aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		//收费项目等级
		if (StringTools.hasText(ke12Dto.getAka065())) {
			sql.append(" and ke12.aka065 = '" + ke12Dto.getAka065() + "'");
		}
		// 三大目录类别
		if (StringTools.hasText(ke12Dto.getAke003())) {
			sql.append(" and ke12.ake003 = '" + ke12Dto.getAke003() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(ke12Dto.getAaz107())) {
			sql.append(" and ke12.aaz107 = '" + ke12Dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(ke12Dto.getAkb022())) {
			sql.append(" and ke12.akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(ke12Dto.getAka101())) {
			sql.append("and ke12.aka101 = '" + ke12Dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(ke12Dto.getAka130())) {
			sql.append(" and ke12.aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//医疗发票项目
		if (StringTools.hasText(ke12Dto.getAka063())) {
			sql.append(" and ke12.aka063 = '" + ke12Dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(ke12Dto.getAae140())) {
			sql.append(" and ke12.aae140 = '" + ke12Dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(ke12Dto.getAka122())) {
			sql.append(" and ke12.aka122 = '" + ke12Dto.getAka122() + "'");
		}
		// 身份类别: akc021
		if (StringTools.hasText(ke12Dto.getAkc021())) {
			sql.append(" and ke12.akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//专业技术职务
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and ke12.aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		//排名数量
		if(ke12Dto.getRank()!=null){
			sql.append(" GROUP BY ke12.aac003)) where rownum <="+ke12Dto.getRank());
		}
		List<Ke12DTO> list = new ArrayList<Ke12DTO>();
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		for (Map<String, Object> map : mapList) {
			Ke12DTO k = new Ke12DTO();
			k.setLabel(String.valueOf(map.get("label")));
			k.setValueA(Float.parseFloat(String.valueOf(map.get("valueA"))));
			k.setId(String.valueOf(map.get("id")));
			list.add(k);
		}
		return list;
	}

	public DoctDrugDTO queryAnalidByDoctDrug(DoctDrugDTO ddDto) {

		CommonHibernateDaoUtils.executeStoreProcedure("pkg_anal_data.prc_DoctDrug_top", ddDto);

		return ddDto;
	}
	
	public Page queryDoctDrugCateWithPage(Page page, Ke12DTO ke12Dto) {
		
		StringBuffer sql = new StringBuffer(" SELECT  a.aaz263,a.aae041,a.akc021,a.aka130,a.aka063,sum(a.ake098) ake098,"
				+ "SUM(a.ake106) ake106,sum(a.akc264) akc264,ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,"
				+ "sum(a.ake098)),2)  AS cjfy  FROM ke12 a WHERE 1 = 1 ");
		//收费项目等级 aka065
		if(StringTools.hasText(ke12Dto.getAka065())){
			sql.append(" and a.aka065 = '" + ke12Dto.getAka065() + "'");
		}
		//统计周期 ape032
		if(StringTools.hasText(ke12Dto.getApe032())){
			sql.append(" and a.ape032 = '" + ke12Dto.getApe032() + "'");
		}
		//医师编号 aaz263
		if(StringTools.hasText(ke12Dto.getAaz263())){
			sql.append(" and a.aaz263 = '" + ke12Dto.getAaz263() + "'");
		}
		//起始年月 aae041
		if(StringTools.hasText(ke12Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + ke12Dto.getAae041() + "'");
		}
		//终止年月 aae042
		if(StringTools.hasText(ke12Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + ke12Dto.getAae042() + "'");
		}
		//医疗服务机构类型 akb022
		if(StringTools.hasText(ke12Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + ke12Dto.getAkb022() + "'");
		}
		//医疗类别 aka130
		if(StringTools.hasText(ke12Dto.getAka130())){
			sql.append(" and a.aka130 = '" + ke12Dto.getAka130() + "'");
		}
		//结算身份类别 akc021
		if(StringTools.hasText(ke12Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + ke12Dto.getAkc021() + "'");
		}
		//卫生技术人员专业技术职务 aaf009
		if(StringTools.hasText(ke12Dto.getAaf009())){
			sql.append(" and a.aaf009 = '" + ke12Dto.getAaf009() + "'");
		}
		//险种类型 aae140
		if(StringTools.hasText(ke12Dto.getAae140())){
			sql.append(" and a.aae140 = '" + ke12Dto.getAae140() + "'");
		}
		//医院等级 aka101
		if(StringTools.hasText(ke12Dto.getAka101())){
			sql.append(" and a.aka101 = '" + ke12Dto.getAka101() + "'");
		}
		//疾病分类 aka122
		if(StringTools.hasText(ke12Dto.getAka122())){
			sql.append(" and a.aka122 = '" + ke12Dto.getAka122() + "'");
		}
		//发票项目类别aka063
		if(StringTools.hasText(ke12Dto.getAka063())){
			sql.append(" and a.aka063 = '" + ke12Dto.getAka063() + "'");
		}else{
			sql.append(" and a.aka063 in ('01','02','03') ");
		}
		//统筹区编码 aaa027
		if(StringTools.hasText(ke12Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + ke12Dto.getAaa027() + "'");
		}
		//三大目录类别 ake003
		if(StringTools.hasText(ke12Dto.getAke003())){
			sql.append(" and a.ake003 = '" + ke12Dto.getAke003() + "'");
		}
		sql.append(" GROUP BY  a.aaz263,a.aae041,a.akc021,a.aka130,a.aka063 "
				+ "order by a.aaz263,a.aae041,a.akc021,a.aka130,a.aka063 ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Ke12DTO.class);
		return result;
	}

	public F10603007VO buildYLJGFXTYFZQSData(F10603007VO returnVO) {
		YlfwjgfxfyfzqsDTO dto = new YlfwjgfxfyfzqsDTO();
		BeanTools.copyProperties(returnVO, dto);
		dto.setAnalcode(returnVO.getFxqs());
		dto.setUserid(BusinessContextUtils.getUserContext().getOperatorId());
		dto.setAae041(dto.getAae041().replaceAll("-", ""));
		dto.setAae042(dto.getAae042().replaceAll("-", ""));
		dto.setIsdelete("1");
		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_anal_data.prc_MediItemFee_anal", dto);
		if (StringTools.hasText(dto.getAnalid())) {
			returnVO.setAnalid(dto.getAnalid());
		} else {
			returnVO.setAnalid("1000000000004509");
		}
		return returnVO;
	}

	public Page queryYLJGFXTYFZQSWithPage(Page page, F10603007VO returnVO) {
		StringBuffer sql = new StringBuffer(
				"select anal_id as analid,memo as aae041,trunc(cur_pred,2) as cur_pred,trunc(pre_pred,2) as pre_pred,"
				+ "trunc(sam_pred,2) as sam_pred,trunc(pre_rate,2) as pre_rate,trunc(sam_rate,2) as sam_rate,"
				+ "tre_mean,aaa027,aae041 as querytime from anal_itemfee_medi where 1 = 1");
		if (StringTools.hasText(returnVO.getAnalid())) {
			sql.append(" and anal_id= " + returnVO.getAnalid() + " ");
		}
		sql.append(" order by TO_NUMBER(querytime) ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				F10603007VO.class);

		return result;
	}

	public F10603007VO queryYLJGFXTYFZQSMoveAverage(F10603007VO f10603007vo) {
		StringBuffer sql=new StringBuffer(" select memo as label,decode(SIGN(tre_mean-10000),-1,tre_mean,decode(sign(round(tre_mean/10000,2)*10000-100000000),-1,round(tre_mean/10000,2)*10000,ROUND(tre_mean/100000000,2)*100000000)) as valueB, decode(SIGN(cur_pred-10000),-1,cur_pred,decode(sign(round(cur_pred/10000,2)*10000-100000000),-1,round(cur_pred/10000,2)*10000,ROUND(cur_pred/100000000,2)*100000000)) as valueA  ");
		sql.append(" from anal_itemfee_medi where anal_id="+f10603007vo.getAnalid()+" order by aae041");
		List<Map<String, Object>>  resultList=CommonJdbcDaoUtils.queryForList(sql.toString());
		String xAxisCategories="";
		String column="";
		String line="";
		for (Map<String, Object> map : resultList) {
			xAxisCategories=xAxisCategories+"\""+map.get("LABEL")+"\",";
			column=column+map.get("VALUEB")+",";
			line=line+map.get("VALUEA")+",";
		}
		if (StringTools.hasText(xAxisCategories)) {
			xAxisCategories=xAxisCategories.substring(0, xAxisCategories.length()-1);
			xAxisCategories="["+xAxisCategories+"]";
			f10603007vo.setxAxisCategories(xAxisCategories);
		}
		if (StringTools.hasText(column)) {
			column=column.substring(0, column.length()-1);
			column="["+column+"]";
			f10603007vo.setColumn(column);
		}
		if (StringTools.hasText(line)) {
			line=line.substring(0, line.length()-1);
			line="["+line+"]";
			f10603007vo.setLine(line);
		}
		return f10603007vo;
	}

	public MediFeeTrendDTO queryAnalidByMediFee(MediFeeTrendDTO mediFeeDto) {
		
		CommonHibernateDaoUtils.executeStoreProcedure("pkg_anal_data.prc_MediFee_anal", mediFeeDto);
		
		return mediFeeDto;
	}

	public List<MediMoveAvgDTO> queryMediFeeTrendList(Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer("select a.memo ,decode(SIGN(a.tre_mean-10000),-1,a.tre_mean,"
				+ "decode(sign(round(a.tre_mean/10000,2)*10000-100000000),-1,round(a.tre_mean/10000,2)*10000,"
				+ "ROUND(a.tre_mean/100000000,2)*100000000)) as valueB,decode(SIGN(a.cur_pred-10000),-1,a.cur_pred,"
				+ "decode(sign(round(a.cur_pred/10000,2)*10000-100000000),-1,round(a.cur_pred/10000,2)*10000,"
				+ "ROUND(a.cur_pred/100000000,2)*100000000)) as valueA from anal_fee_medi a where 1 = 1 ");
		
		if(StringTools.hasText(kf28Dto.getAnalid())){
			sql.append(" and a.anal_id = '" + kf28Dto.getAnalid() + "'");
		}
		
		sql.append(" order by a.aae041");
		
		List<Map<String , Object>> mapList = CommonJdbcDaoUtils.queryForList(sql.toString());
		
		List<MediMoveAvgDTO> list = new ArrayList<MediMoveAvgDTO>();
		
		for (Map<String, Object> map : mapList) {
			
			MediMoveAvgDTO mmaDto = new MediMoveAvgDTO();
			
			mmaDto.setMemo(String.valueOf(map.get("memo")));
			
			mmaDto.setValueA(Double.parseDouble(String.valueOf(map.get("valueA"))));
			
			mmaDto.setValueB(Double.parseDouble(String.valueOf(map.get("valueB"))));
			
			list.add(mmaDto);
		}
		
		return list;
	}

	public Page queryMediFeeTrendWithPage(Page page, Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer(" select a.anal_id as analid,a.memo as aae041,"
				+ "trunc(a.cur_pred,2) as cur_pred,trunc(a.pre_pred,2) as pre_pred,"
				+ "trunc(a.sam_pred,2) as sam_pred,trunc(a.pre_rate,2) as pre_rate,"
				+ "trunc(a.sam_rate,2) as sam_rate,a.tre_mean as tre_mean,a.aaa027 as aaa027,"
				+ "a.aae041 as querytime from anal_fee_medi a where 1 = 1 ");
		
		if(StringTools.hasText(kf28Dto.getAnalid())){
			sql.append(" and a.anal_id = '" + kf28Dto.getAnalid() + "'");
		}
		
		sql.append(" order by TO_NUMBER(querytime) ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), MediMoveAvgDTO.class);
		
		return result;
	}

	public MediDrugDTO queryAnalidByMediDrug(MediDrugDTO mediDrugDto) {
		
		CommonHibernateDaoUtils.executeStoreProcedure("pkg_anal_data.prc_MediDrug_top", mediDrugDto);
		
		return mediDrugDto;
	}

	public List<AnalTopDTO> queryMediDrugExpenList(Kf27DTO kf27Dto) {
		
		StringBuffer sql = new StringBuffer(" select a.toplabel, decode(SIGN(a.topvalue-10000),-1,"
				+ "a.topvalue,decode(sign(round(a.topvalue/10000,2)*10000-100000000),-1,"
				+ "round(a.topvalue/10000,2)*10000,ROUND(a.topvalue/100000000,2)*100000000)) as valueA,"
				+ "a.topid from anal_top a where 1 = 1 ");
		if(StringTools.hasText(kf27Dto.getAnalid())){
			sql.append(" and a.anal_id = '" + kf27Dto.getAnalid() + "'");
		}
		
		sql.append(" and  a.toprank <= " + kf27Dto.getRank() + " ORDER BY a.topvalue DESC");
		
		List<Map<String , Object>> mapList = CommonJdbcDaoUtils.queryForList(sql.toString());
		
		List<AnalTopDTO> list = new ArrayList<AnalTopDTO>();
		
		for (Map<String, Object> map : mapList) {
			
			AnalTopDTO analTopDto = new AnalTopDTO();
			
			analTopDto.setToplabel(String.valueOf(map.get("toplabel")));
			
			analTopDto.setValueA(Double.parseDouble(String.valueOf(map.get("valueA"))));
			
			analTopDto.setTopid(String.valueOf(map.get("topid")));
			
			list.add(analTopDto);
		}
		
		return list;
	}
	public List<Kf28DTO> queryMediPartFee(Kf28DTO dto) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select toplabel as LABEL, decode(SIGN(topvalue-10000),-1,topvalue," +
				"decode(sign(round(topvalue/10000,2)*10000-100000000),-1,round(topvalue/10000,2)*10000," +
				"ROUND(topvalue/100000000,2)*100000000)) as valueA,topid as ID from anal_top where 1=1 ");
		if(StringTools.hasText(dto.getAnalid())){
			sql.append("and anal_id='"+dto.getAnalid()+"'");
		}
		if(dto.getRank()!=null){
			sql.append("and toprank<='"+dto.getRank()+"'");
		}
		sql.append("ORDER BY topvalue DESC");
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		List<Kf28DTO> list = new ArrayList<Kf28DTO>();
		for (Map<String, Object> map : mapList) {
			Kf28DTO k = new Kf28DTO();
			k.setLabel(String.valueOf(map.get("label")));
			k.setValueA(Float.parseFloat(String.valueOf(map.get("valueA"))));
			k.setId(String.valueOf(map.get("id")));
			list.add(k);
		}
		return list;
	}
	public Page queryMedicalWithPage(Page page,Kf28DTO dto){
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT a.aaz107,a.aae041,a.aka130,SUM(a.akc264) akc264,SUM(a.akc254) akc254,SUM(a.akb068) akb068,SUM(a.akc253) akc253," +
				" sum(ake028) ake028,ROUND(SUM(a.ake065)/SUM(a.akc264)*100,2) ypfbl,ROUND(SUM(a.ake085)/SUM(a.akc264)*100,2) zlfbl," +
				" ROUND(SUM(a.akb068)/SUM(a.akc264)*100,2) bsbl FROM kf28 a where 1=1 ");
		if (StringTools.hasText(dto.getApe032())) {
			sql.append(" and a.ape032='"+dto.getApe032()+"'");
		}
		if (StringTools.hasText(dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + dto.getAaz107() + "'");
		}
		if (StringTools.hasText(dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + dto.getAae041() + "'");
		}
		if (StringTools.hasText(dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + dto.getAae042() + "'");
		}
		if(StringTools.hasText(dto.getAkb022()))
		{
			sql.append(" and a.akb022='"+dto.getAkb022()+"'");
		}		
		if(StringTools.hasText(dto.getAka130()))
		{
			sql.append(" and a.aka130='"+dto.getAka130()+"'");
		}
		else
		{
			sql.append(" and a.aka130 IN('21','22','23','25')");
		}
		if(StringTools.hasText(dto.getAae140()))
		{
			sql.append(" and a.aae140='"+dto.getAae140()+"'");
		}
		if(StringTools.hasText(dto.getAka122()))
		{
			sql.append(" and a.aka122='"+dto.getAka122()+"'");
		}
		if(StringTools.hasText(dto.getAaa027()))
		{
			sql.append(" and a.aaa027='"+dto.getAaa027()+"'");
		}
		if(StringTools.hasText(dto.getAka101()))
		{
			sql.append(" and a.aka101='"+dto.getAka101()+"'");
		}
		if(StringTools.hasText(dto.getAkc021()))
		{
			sql.append(" and a.akc021='"+dto.getAkc021()+"'");
		}
		sql.append(" GROUP BY a.aaz107,a.aae041,a.aka130 ORDER BY a.aaz107,a.aae041,a.aka130 ");
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf28DTO.class);
		return result;
	}

	public Page queryDiseaseWithPage(Page page, Kf28DTO dto) {
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT a.aaz107,a.aae041,b.aka121,a.aka122,SUM(a.akc264) akc264,SUM(a.akc254) akc254,SUM(a.akb068) akb068,SUM(a.akc253) akc253," +
				" sum(ake028) ake028 ,ROUND(SUM(a.ake065)/SUM(a.akc264)*100,2) ypfbl,ROUND(SUM(a.ake085)/SUM(a.akc264)*100,2) zlfbl," +
				" ROUND(SUM(a.akb068)/SUM(a.akc264)*100,2) bsbl FROM kf28 a,ka06 b WHERE a.aka122=b.aka122(+) ");
		if (StringTools.hasText(dto.getApe032())) {
			sql.append(" and a.ape032='"+dto.getApe032()+"'");
		}
		if (StringTools.hasText(dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + dto.getAaz107() + "'");
		}
		if (StringTools.hasText(dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + dto.getAae041() + "'");
		}
		if (StringTools.hasText(dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + dto.getAae042() + "'");
		}
		if(StringTools.hasText(dto.getAkb022()))
		{
			sql.append(" and a.akb022='"+dto.getAkb022()+"'");
		}
		if(StringTools.hasText(dto.getAka130()))
		{
			sql.append(" and a.aka130='"+dto.getAka130()+"'");
		}
		else
		{
			sql.append(" and a.aka130 IN('21','22','23','25')");
		}
		if(StringTools.hasText(dto.getAae140()))
		{
			sql.append(" and a.aae140='"+dto.getAae140()+"'");
		}
		if(StringTools.hasText(dto.getAka122()))
		{
			sql.append(" and a.aka122='"+dto.getAka122()+"'");
		}
		if(StringTools.hasText(dto.getAaa027()))
		{
			sql.append(" and a.aaa027='"+dto.getAaa027()+"'");
		}
		if(StringTools.hasText(dto.getAka101()))
		{
			sql.append(" and a.aka101='"+dto.getAka101()+"'");
		}
		if(StringTools.hasText(dto.getAkc021()))
		{
			sql.append(" and a.akc021='"+dto.getAkc021()+"'");
		}
		sql.append(" GROUP BY a.aaz107,a.aae041,b.aka121,a.aka122 ORDER BY a.aaz107,a.aae041,b.aka121,a.aka122 ");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf28DTO.class);
		
	}

	public Page queryIdentifyWithPage(Page page, Kf28DTO dto) {
		StringBuffer sql = new StringBuffer("");
		sql.append(" SELECT a.aaz107,a.aae041,a.akc021,SUM(a.akc264) akc264,SUM(a.akc254) akc254,SUM(a.akb068) akb068,SUM(a.akc253) akc253," +
				" sum(ake028) ake028,ROUND(SUM(a.ake065)/SUM(a.akc264)*100,2) ypfbl,ROUND(SUM(a.ake085)/SUM(a.akc264)*100,2) zlfbl," +
				" ROUND(SUM(a.akb068)/SUM(a.akc264)*100,2) bsbl FROM kf28 a where 1=1 ");
		if (StringTools.hasText(dto.getApe032())) {
			sql.append(" and a.ape032='"+dto.getApe032()+"'");
		}
		if (StringTools.hasText(dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + dto.getAaz107() + "'");
		}
		if (StringTools.hasText(dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + dto.getAae041() + "'");
		}
		if (StringTools.hasText(dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + dto.getAae042() + "'");
		}
		if(StringTools.hasText(dto.getAkb022()))
		{
			sql.append(" and a.akb022='"+dto.getAkb022()+"'");
		}
		if(StringTools.hasText(dto.getAka130()))
		{
			sql.append(" and a.aka130='"+dto.getAka130()+"'");
		}
		else
		{
			sql.append(" and a.aka130 IN('21','22','23','25')");
		}
		if(StringTools.hasText(dto.getAae140()))
		{
			sql.append(" and a.aae140='"+dto.getAae140()+"'");
		}
		if(StringTools.hasText(dto.getAka122()))
		{
			sql.append(" and a.aka122='"+dto.getAka122()+"'");
		}
		if(StringTools.hasText(dto.getAaa027()))
		{
			sql.append(" and a.aaa027='"+dto.getAaa027()+"'");
		}
		if(StringTools.hasText(dto.getAka101()))
		{
			sql.append(" and a.aka101='"+dto.getAka101()+"'");
		}
		if(StringTools.hasText(dto.getAkc021()))
		{
			sql.append(" and a.akc021='"+dto.getAkc021()+"'");
		}
		sql.append(" GROUP BY a.aaz107,a.aae041,a.akc021 ORDER BY a.aaz107,a.aae041,a.akc021 ");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf28DTO.class);
	}

	public YlfwjgfxfyzbDTO qureyAnalId(YlfwjgfxfyzbDTO dto) {
		CommonHibernateDaoUtils.executeStoreProcedure("pkg_anal_data.prc_MediHosFee_top",dto);
		return dto;
	}

	public List<Kf27DTO> queryInvoice(Kf27DTO kf27dto) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select b.aaa103 as label,decode(SIGN(sum(a.akc264) - 10000),-1, sum(a.akc264),decode(sign(round(sum(a.akc264) / 10000, 2) * 10000 - 100000000),-1," +
				"round(sum(a.akc264) / 10000, 2) * 10000,ROUND(sum(a.akc264) / 100000000, 2) * 100000000)) as valueA, ake003 as id" +
				" from kf27 a, aa10 b where 1 = 1");
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and a.aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and a.aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and a.aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and a.aka122 = '" + kf27dto.getAka122() + "'");
		}
		sql.append(" and a.ake003=b.aaa102(+) and b.aaa100='AKE003' group by a.ake003,b.aaa103 ");

		List<Kf27DTO> list = new ArrayList<Kf27DTO>();
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		for (Map<String, Object> map : mapList) {
			Kf27DTO k = new Kf27DTO();
			k.setLabel(String.valueOf(map.get("label")));
			k.setValueA(Float.parseFloat(String.valueOf(map.get("valueA"))));
			k.setId(String.valueOf(map.get("id")));
			list.add(k);
		}
		return list;
	}

	public Page queryChargeWithPage(Page page, Kf27DTO kf27dto) {
		StringBuffer sql = new StringBuffer("");
		//三大目录类别
		if (!StringTools.hasText(kf27dto.getAke003())) {
			sql.append("SELECT aka065,akc264,null as ratio,trim(DECODE(lead,0,allratio+test,allratio)) allratio FROM ( ");
			sql.append("SELECT aka065,akc264, allratio, 100 - SUM(allratio) over() test, lead (aka065,1,0) OVER (ORDER BY aka065) LEAD from (");
			sql.append("select a.aka065 as aka065,trunc(sum(a.akc264),2) as akc264,ROUND((sum(a.akc264)/c.akc264),4)*100 as allratio from kf27 a,(select sum(akc264) as akc264 from kf27 where 1=1");
		}else{
			sql.append("SELECT aka065,akc264, ratio + decode(hh, 2, 100 - SUM(ratio) over(), 0) as ratio,allratio  FROM (");
			sql.append("select a.aka065 as aka065,trunc(sum(a.akc264),2) as akc264,ROUND((sum(a.akc264)/b.akc264),4)*100 as ratio,ROUND((sum(a.akc264)/c.akc264),4)*100 as allratio,row_number() over(ORDER BY sum(a.akc264)DESC NULLS LAST) hh from kf27 a,(select sum(akc264) as akc264 from kf27 where 1=1");
		}
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		//三大目录类别
		if(StringTools.hasText(kf27dto.getAke003())){
			sql.append(" and ake003 = '" + kf27dto.getAke003() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and aka122 = '" + kf27dto.getAka122() + "'");
		}
		sql.append(") b,(select sum(akc264) as akc264 from kf27 where 1=1 ");
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and aka122 = '" + kf27dto.getAka122() + "'");
		}
		sql.append(" )c where 1=1");
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and a.aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and a.aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and a.akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and a.aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and a.aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and a.aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and a.aka122 = '" + kf27dto.getAka122() + "'");
		}
		//三大目录类别
		if(StringTools.hasText(kf27dto.getAke003())){
			sql.append(" and ake003 = '" + kf27dto.getAke003() + "'");
		}
		// 三大目录类别
		if (!StringTools.hasText(kf27dto.getAke003())) {
			sql.append(" group by a.aka065,b.akc264,c.akc264)) order by aka065");
		}
		else{
			sql.append(" group by a.aka065,b.akc264,c.akc264) ORDER BY aka065");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kf27DTO.class);
		return result;
	}

	public List<Kf27DTO> queryMedicalRank(Kf27DTO kf27dto) {
		StringBuffer sql=new StringBuffer("");
		sql.append("select akb021 as label, ratio as valueA, dense_rank as id from " +
				"(SELECT akb021 , trunc((akc264/total),4)*100 as ratio , dense_rank() " +
				"over(ORDER BY akc264/total DESC) dense_rank from (select akb021,SUM(kf27.akc264) as akc264,sum(a.akc264) as total " +
				"FROM kf27," +
				"(SELECT sum(akc264) akc264, aaz107 FROM kf27 where 1=1" );
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and aka122 = '" + kf27dto.getAka122() + "'");
		}
		sql.append(" group by kf27.aaz107) a where kf27.aaz107 = a.aaz107");
		// 统筹区编码 aaa027
		if (StringTools.hasText(kf27dto.getAaa027())) {
			sql.append(" and aaa027 = '" + kf27dto.getAaa027() + "'");
		}
		// 起始年月 aae041
		if (StringTools.hasText(kf27dto.getAae041())) {
			sql.append(" and aae041 >= '" + kf27dto.getAae041() + "'");
		}
		// 终止年月 aae042
		if (StringTools.hasText(kf27dto.getAae042())) {
			sql.append(" and aae042 <= '" + kf27dto.getAae042() + "'");
		}
		// 医疗机构id aaz107
		if (StringTools.hasText(kf27dto.getAaz107())) {
			sql.append(" and aaz107 = '" + kf27dto.getAaz107() + "'");
		}
		// 医疗机构类别 akb022
		if (StringTools.hasText(kf27dto.getAkb022())) {
			sql.append(" and akb022 = '" + kf27dto.getAkb022() + "'");
		}
		// 医院等级 aka101
		if (StringTools.hasText(kf27dto.getAka101())) {
			sql.append("and aka101 = '" + kf27dto.getAka101() + "'");
		}
		// 医疗类别:aka130
		if (StringTools.hasText(kf27dto.getAka130())) {
			sql.append(" and aka130 = '" + kf27dto.getAka130() + "'");
		}
		// 医疗发票项目
		if (StringTools.hasText(kf27dto.getAka063())) {
			sql.append(" and aka063 = '" + kf27dto.getAka063() + "'");
		}
		// 险种类型 aae140
		if (StringTools.hasText(kf27dto.getAae140())) {
			sql.append(" and aae140 = '" + kf27dto.getAae140() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(kf27dto.getAka122())) {
			sql.append(" and aka122 = '" + kf27dto.getAka122() + "'");
		}
		//排名数量
		if(kf27dto.getRank()!=null){
			sql.append(" GROUP BY kf27.akb021)) where rownum <="+kf27dto.getRank());
		}
		List<Kf27DTO> list = new ArrayList<Kf27DTO>();
		List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql
				.toString());
		for (Map<String, Object> map : mapList) {
			Kf27DTO k = new Kf27DTO();
			k.setLabel(String.valueOf(map.get("label")));
			k.setValueA(Float.parseFloat(String.valueOf(map.get("valueA"))));
			k.setId(String.valueOf(map.get("id")));
			list.add(k);
		}
		return list;
	}
	
	
	public Page queryMediDrugDiseaseWithPage(Page page , Kf27DTO kf27Dto){
		
		StringBuffer sql = new StringBuffer(" SELECT  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063, "
				+ "sum(a.ake106) as ake106,sum(a.ake098) as ake098, sum(a.akc264) as akc264,"
				+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2) AS cjfy  "
				+ "FROM kf27 a where 1 = 1 ");
		
		if(StringTools.hasText(kf27Dto.getAka065())){
			sql.append(" and a.aka065 = '" + kf27Dto.getAka065() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf27Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaz107())){
			sql.append(" and a.aaz107 = '" + kf27Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf27Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf27Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf27Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka101())){
			sql.append(" and aka101 = '" + kf27Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf27Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf27Dto.getAka130() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae140())){
			sql.append(" and a.aae140 = '" + kf27Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf27Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf27Dto.getAaa027() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka063())){
			sql.append(" and a.aka063 = '" + kf27Dto.getAka063() + "'");
		}else{
			//sql.append(" and a.aka063 in ('01','02','03') ");
		}
		
		if(StringTools.hasText(kf27Dto.getAke003())){
			sql.append(" and a.ake003 = '" + kf27Dto.getAke003() + "'");
		}
		
		sql.append(" GROUP BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 "
				+ " ORDER BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf27DTO.class);
		
		return result;
	}
	
	public Page queryMediDrugMedicalWithPage(Page page , Kf27DTO kf27Dto){
		
		StringBuffer sql = new StringBuffer(" SELECT  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063, "
				+ "sum(a.ake106) as ake106,sum(a.ake098) as ake098, sum(a.akc264) as akc264,"
				+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2) AS cjfy  "
				+ "FROM kf27 a where 1 = 1 ");
		
		if(StringTools.hasText(kf27Dto.getAka065())){
			sql.append(" and a.aka065 = '" + kf27Dto.getAka065() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf27Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaz107())){
			sql.append(" and a.aaz107 = '" + kf27Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf27Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf27Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf27Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka101())){
			sql.append(" and aka101 = '" + kf27Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf27Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf27Dto.getAka130() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae140())){
			sql.append(" and a.aae140 = '" + kf27Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf27Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf27Dto.getAaa027() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka063())){
			sql.append(" and a.aka063 = '" + kf27Dto.getAka063() + "'");
		}else{
			//sql.append(" and a.aka063 in ('01','02','03') ");
		}
		
		if(StringTools.hasText(kf27Dto.getAke003())){
			sql.append(" and a.ake003 = '" + kf27Dto.getAke003() + "'");
		}
		
		sql.append(" GROUP BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 "
				+ " ORDER BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf27DTO.class);
		
		return result;
		
	}
	
	public Page queryMediDrugIdentifyWithPage(Page page , Kf27DTO kf27Dto){
		
		StringBuffer sql = new StringBuffer(" SELECT  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063, "
				+ "sum(a.ake106) as ake106,sum(a.ake098) as ake098, sum(a.akc264) as akc264,"
				+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2) AS cjfy  "
				+ "FROM kf27 a where 1 = 1 ");
		
		if(StringTools.hasText(kf27Dto.getAka065())){
			sql.append(" and a.aka065 = '" + kf27Dto.getAka065() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf27Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaz107())){
			sql.append(" and a.aaz107 = '" + kf27Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf27Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf27Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf27Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka101())){
			sql.append(" and aka101 = '" + kf27Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf27Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf27Dto.getAka130() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAae140())){
			sql.append(" and a.aae140 = '" + kf27Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf27Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf27Dto.getAaa027() + "'");
		}
		
		if(StringTools.hasText(kf27Dto.getAka063())){
			sql.append(" and a.aka063 = '" + kf27Dto.getAka063() + "'");
		}else{
			//sql.append(" and a.aka063 in ('01','02','03') ");
		}
		
		if(StringTools.hasText(kf27Dto.getAke003())){
			sql.append(" and a.ake003 = '" + kf27Dto.getAke003() + "'");
		}
		
		sql.append(" GROUP BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 "
				+ " ORDER BY  a.aaz107, a.aae041,a.akc021, a.aka130, a.aka063 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf27DTO.class);
		
		return result;
	}
	
	public Page queryMediVisitWithPage(Page page, VisitInfoDTO visitDto) {

		StringBuffer sql = new StringBuffer(
				" select akc190,aae030,aae031,max(to_char(akc194,'yyyy-mm-dd hh24:mi:ss')) akc194,"
						+ "aac001,akb021 ,aac003,aac004,aac002,AAZ263,ake024,aka122,aka130,aaz217, SUM(akc264) akc264,SUM(ake038) ake038, "
						+ "SUM(akc254) akc254,SUM(akc253) akc253, SUM(ake039) ake039,SUM(ake029) ake029, SUM(ake035) ake035,"
						+ " SUM(ake043) ake043, SUM(ake032) ake032,SUM(ake042) ake042,max(aka151) aka151,max(aka153) aka153,"
						+ "max(ake092) ake092,aka030  from ( ");

		if (StringTools.hasText(visitDto.getAka065())
				&& StringTools.hasText(visitDto.getAka063())
				&& StringTools.hasText(visitDto.getAke003())) {
			sql.append(" SELECT distinct b.aaz308, a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031,a.aac001,c.akb021 ,a.aac003,a.aac004,"
					+ "a.aac002,a.akc194,a.akc194 akc194D,a.AAZ263,a.ake024,a.aka122,a.aka130,"
					+ "a.aaz217,b.akc264 akc264,b.ake038 ake038,b.akc254 akc254, b.akc253 akc253,"
					+ "b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,b.ake043 ake043,b.ake032 ake032,"
					+ "b.ake042 ake042,b.aka151,b.aka153,b.ake092,a.aka030  FROM kc21 a ,kc24 b,kb01 c "
					+ "where 1 = 1 and a.aaz217=b.aaz217 and a.akb020 = c.akb020  ");
		} else {
			sql.append(" SELECT distinct b.aaz308,a.akc190,to_date(a.aae030,'yyyy-mm-dd') aae030,"
					+ "to_date(a.aae031,'yyyy-mm-dd') aae031,a.aac001,c.akb021 ,a.aac003,a.aac004,"
					+ "a.aac002,a.akc194,a.akc194 akc194D,a.AAZ263,a.ake024,a.aka122,a.aka130,"
					+ "a.aaz217,b.akc264 akc264,b.ake038 ake038,b.akc254 akc254, b.akc253 akc253,"
					+ "b.ake039 ake039,b.ake029 ake029,b.ake035 ake035,b.ake043 ake043,b.ake032 ake032,"
					+ "b.ake042 ake042,b.aka151,b.aka153,b.ake092,a.aka030  FROM kc21 a ,kc24 b,kb01 c,kc22 d "
					+ "where 1 = 1 and a.aaz217=b.aaz217 and a.akb020 = c.akb020 and a.aaz217=d.aaz217 ");
		}
		// aaz107
		if (StringTools.hasText(visitDto.getAaz107())) {
			sql.append(" and a.akb020 = '" + visitDto.getAaz107() + "'");
		}
		// 就诊起始年月 aae041
		if (StringTools.hasText(visitDto.getAae041())) {
			sql.append(" and a.akc194>=to_date('" + visitDto.getAae041()
					+ "' * 100 + 1,'yyyy-mm-dd') ");
		}
		// 就诊终止年月 aae042
		if (StringTools.hasText(visitDto.getAae042())) {
			sql.append(" and a.akc194 <add_months(to_date('"
					+ visitDto.getAae042() + "' * 100 + 1,'yyyy-mm-dd'),1)");
		}
		// 医疗机构类别akb022
		if (StringTools.hasText(visitDto.getAkb022())) {
			sql.append(" c.akb022 = '" + visitDto.getAkb022() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(visitDto.getAka130())) {
			sql.append(" and a.aka130 = '" + visitDto.getAka130() + "'");
		}
		// 险种类型 akc140
		if (StringTools.hasText(visitDto.getAae140())) {
			sql.append(" a.aae140 = '" + visitDto.getAae140() + "'");
		}
		// 身份类别 akc021
		if (StringTools.hasText(visitDto.getAkc021())) {
			sql.append(" and a.akc021 = '" + visitDto.getAkc021() + "'");
		}
		// 医疗类别 aka130
		if (StringTools.hasText(visitDto.getAka130())) {
			sql.append(" a.aka130 = '" + visitDto.getAka130() + "'");
		}
		// 疾病分类 aka122
		if (StringTools.hasText(visitDto.getAka122())) {
			sql.append(" and a.aka122 = '" + visitDto.getAka122() + "'");
		}
		// 收费项目等级 aka065
		if (StringTools.hasText(visitDto.getAka065())) {
			sql.append(" and d.aka065 = '" + visitDto.getAka065() + "'");
		}
		// 三大目录类别 ake003
		if (StringTools.hasText(visitDto.getAke003())) {
			sql.append(" and d.ake003 = '" + visitDto.getAke003() + "'");
		}
		// 发票项目类别 aka063
		if (StringTools.hasText(visitDto.getAka063())) {
			sql.append(" and d.aka063 = '" + visitDto.getAka063() + "'");
		}
		sql.append(" ) group by akc190,aae030,aae031,akc194D,aac001,akb021 ,aac003,aac004,"
				+ "aac002,AAZ263,ake024,aka122,aka130,aaz217,aka030 order by aaz217 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				VisitInfoDTO.class);

		return result;
	}

	public MediClinDTO queryAnalidByMediClinFee(MediClinDTO mediPntDto) {
		
		CommonHibernateDaoUtils.executeStoreProcedure("pkg_anal_data.prc_MediClinFee_top", mediPntDto);
		
		return mediPntDto;
	}

	public List<AnalTopDTO> queryMediClinExpenList(Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer(" select a.toplabel, decode(SIGN(a.topvalue-10000),-1,"
				+ "a.topvalue,decode(sign(round(a.topvalue/10000,2)*10000-100000000),-1,"
				+ "round(a.topvalue/10000,2)*10000,ROUND(a.topvalue/100000000,2)*100000000)) as valueA,"
				+ "a.topid from anal_top a where 1 = 1 ");
		if(StringTools.hasText(kf28Dto.getAnalid())){
			sql.append(" and a.anal_id = '" + kf28Dto.getAnalid() + "'");
		}
		
		sql.append(" and  a.toprank <= " + kf28Dto.getRank() + " ORDER BY a.topvalue DESC");
		
		List<Map<String , Object>> mapList = CommonJdbcDaoUtils.queryForList(sql.toString());
		
		List<AnalTopDTO> list = new ArrayList<AnalTopDTO>();
		
		for (Map<String, Object> map : mapList) {
			
			AnalTopDTO analTopDto = new AnalTopDTO();
			
			analTopDto.setToplabel(String.valueOf(map.get("toplabel")));
			
			analTopDto.setValueA(Double.parseDouble(String.valueOf(map.get("valueA"))));
			
			analTopDto.setTopid(String.valueOf(map.get("topid")));
			
			list.add(analTopDto);
		}
		
		return list;
	}

	public Page queryMediClinMediWithPage(Page page, Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer(" SELECT a.aaz107,a.aae041,a.aka130,sum(a.ake098) ake098,"
				+ "sum(a.akc264) akc264,sum(a.akc254) akc254,sum(a.akc253) akc253,sum(a.akb068) akb068,"
				+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2) AS cjfy "
				+ "FROM kf28 a where 1 = 1 ");
		
		if(StringTools.hasText(kf28Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf28Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaz107())){
			sql.append(" and aaz107 = '" + kf28Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf28Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf28Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf28Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf28Dto.getAka130() + "'");
		}else{
			sql.append(" and a.aka130 in ('11','12','13','15','41')");
		}
		
		if(StringTools.hasText(kf28Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf28Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka101())){
			sql.append(" and a.aka101 = '" + kf28Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae140())){
			sql.append(" and aae140 = '" + kf28Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf28Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf28Dto.getAaa027() + "'");
		}
		
		sql.append(" GROUP BY a.aaz107,a.aae041,a.aka130 ORDER BY a.aaz107,a.aae041,a.aka130 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Kf28DTO.class);
		
		return result;
	}

	public Page queryMediClinIdentifyWithPage(Page page, Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer(" SELECT a.aaz107,a.aae041,a.akc021,sum(a.ake098) ake098,"
				+ "sum(a.akc264) akc264,sum(a.akc254) akc254,sum(a.akc253) akc253,sum(a.akb068) akb068,"
				+ "ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,sum(a.ake098)),2) AS cjfy "
				+ "FROM kf28 a where 1 = 1 ");
		
		if(StringTools.hasText(kf28Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf28Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaz107())){
			sql.append(" and aaz107 = '" + kf28Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf28Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf28Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf28Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf28Dto.getAka130() + "'");
		}else{
			sql.append(" and a.aka130 in ('11','12','13','15','41')");
		}
		
		if(StringTools.hasText(kf28Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf28Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka101())){
			sql.append(" and a.aka101 = '" + kf28Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae140())){
			sql.append(" and aae140 = '" + kf28Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf28Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf28Dto.getAaa027() + "'");
		}
		
		sql.append(" GROUP BY a.aaz107,a.aae041,a.akc021 ORDER BY a.aaz107,a.aae041,a.akc021 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Kf28DTO.class);
		
		return result;
	}

	public Page queryMediClinDiseaseWithPage(Page page, Kf28DTO kf28Dto) {
		
		StringBuffer sql = new StringBuffer(" SELECT a.aaz107,a.aae041,b.aka121,a.aka122,sum(a.akc264) akc264,"
				+ "sum(a.akc254) akc254,sum(a.akc253) akc253,sum(a.akb068) akb068,sum(a.ake098) ake098,"
				+ "sum(a.ake096) ake096,ROUND( SUM(a.akc264)/DECODE(NVL(sum(a.ake098),0),0,1,"
				+ "sum(a.ake098)),2)  AS cjfy,round(sum(a.akc264)/DECODE(NVL(sum(a.ake096),0),0,1,"
				+ "sum(a.ake096)),2) AS rjfy,a.akc021 as akc021,a.aka130 as aka130  FROM kf28 a,ka06 b "
				+ "where 1 = 1 and a.aka122=b.aka122(+) ");
		if(StringTools.hasText(kf28Dto.getApe032())){
			sql.append(" and a.ape032 = '" + kf28Dto.getApe032() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaz107())){
			sql.append(" and aaz107 = '" + kf28Dto.getAaz107() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae041())){
			sql.append(" and a.aae041 >= '" + kf28Dto.getAae041() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae042())){
			sql.append(" and a.aae042 <= '" + kf28Dto.getAae042() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAkb022())){
			sql.append(" and a.akb022 = '" + kf28Dto.getAkb022() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka130())){
			sql.append(" and a.aka130 = '" + kf28Dto.getAka130() + "'");
		}else{
			sql.append(" and a.aka130 in ('11','12','13','15','41')");
		}
		
		if(StringTools.hasText(kf28Dto.getAkc021())){
			sql.append(" and a.akc021 = '" + kf28Dto.getAkc021() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka101())){
			sql.append(" and a.aka101 = '" + kf28Dto.getAka101() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAae140())){
			sql.append(" and aae140 = '" + kf28Dto.getAae140() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAka122())){
			sql.append(" and a.aka122 = '" + kf28Dto.getAka122() + "'");
		}
		
		if(StringTools.hasText(kf28Dto.getAaa027())){
			sql.append(" and a.aaa027 = '" + kf28Dto.getAaa027() + "'");
		}
		
		sql.append(" GROUP BY  a.aaz107,a.aae041,b.aka121,a.aka122,a.akc021,a.aka130 "
				+ "order by  a.aaz107,a.aae041,b.aka121,a.aka122");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Kf28DTO.class);
		
		return result;
	}
	
	
	//接诊人次
	
	public AcceptDTO queryAnalidByAccept(AcceptDTO atDto) {

		CommonHibernateDaoUtils.executeStoreProcedure(
				"pkg_anal_data.prc_AttenMedi_anal", atDto);

		return atDto;
	}

	public List<AnalAttenMediDTO> queryAcceptPeopleList(AnalAttenMediDTO analAttenMediDTO) {
		
			StringBuffer sql = new StringBuffer("select a.memo as label,decode(SIGN(a.tre_mean-10000),-1," +
					"a.tre_mean,decode(sign(round(a.tre_mean/10000,2)*10000-100000000),-1,round(a.tre_mean/10000,2)*10000," +
					"ROUND(tre_mean/100000000,2)*100000000)) as valueB, decode(SIGN(cur_pred-10000),-1," +
					"a.cur_pred,decode(sign(round(a.cur_pred/10000,2)*10000-100000000),-1,round(a.cur_pred/10000,2)*10000," +
					"ROUND(a.cur_pred/100000000,2)*100000000)) as valueA from anal_atten_medi a where 1 = 1 ");

			if (StringTools.hasText(analAttenMediDTO.getAnalid())) {
				sql.append(" and a.anal_id = '" + analAttenMediDTO.getAnalid() + "'");
			}

			sql.append(" order by a.aae041");

			List<Map<String, Object>> mapList = CommonJdbcDaoUtils.queryForList(sql.toString());//把sql生成map集合

			List<AnalAttenMediDTO> list = new ArrayList<AnalAttenMediDTO>();

			for (Map<String, Object> map : mapList) {

				AnalAttenMediDTO AcceptDto = new AnalAttenMediDTO();

				AcceptDto.setLabel(String.valueOf(map.get("label")));

				AcceptDto.setValueB(Double.parseDouble(String.valueOf(map.get("valueB"))));

				AcceptDto.setValueA(Double.parseDouble(String.valueOf(map.get("valueA"))));

				list.add(AcceptDto);
			}

			return list;
		
	}


	public Page queryYLJGJZRCFZQSWithPage(Page page, AcceptPeopleVO returnVO) {
		StringBuffer sql = new StringBuffer("select anal_id as analid," +
				"memo as aae041,trunc(cur_pred,2) as cur_pred," +
				"trunc(pre_pred,2) as pre_pred,trunc(sam_pred,2) as sam_pred," +
				"trunc(pre_rate,2) as pre_rate,trunc(sam_rate,2) as sam_rate," +
				"tre_mean,aaa027,aae041 as querytime from anal_atten_medi where 1 = 1 ");
		if (StringTools.hasText(returnVO.getAnalid())) {
			sql.append(" and anal_id= " + returnVO.getAnalid() + " ");
		}
		sql.append(" order by TO_NUMBER(querytime) ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				AcceptPeopleVO.class);
		
		return result;
	}

}
