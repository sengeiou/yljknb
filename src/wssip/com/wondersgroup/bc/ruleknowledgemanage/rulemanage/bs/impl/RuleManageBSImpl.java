package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af46;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af51;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af46DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.BaseKa45Id;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.Ka43;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.Ka44;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.Ka45;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzms;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbDicGzzb;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.bo.TbRuleDxzb;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka43DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka44DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka45DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbDicGzmsDTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbDicGzzbDTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbRuleDxzbDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.local.k4.f10402006.vo.RuleTargetVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402008.vo.F10402008VO;
import com.wondersgroup.local.k4.f10402008.vo.TjljVO;
import com.wondersgroup.local.k4.f10402008.vo.Tjlj_CgVO;
import com.wondersgroup.local.k4.f10402008.vo.YbgzmxVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class RuleManageBSImpl implements RuleManageBS {

	@SuppressWarnings("unchecked")
	public Page queryModelManageWithPage(Page page, ModelManageVO modelManageVo) {
		StringBuffer sql = new StringBuffer();
		sql.append("select k4.* ");
		sql.append("from ka43 k4,(select t.aaz320,rownum rm from (select ka43.aaz320 from ka43 order by aae100 desc)t ) k ");
		sql.append("where k4.aaz320=k.aaz320 ");
		if (!StringUtils.isEmpty(modelManageVo.getAaa169())) {
			sql.append(" and k.aaa169 like '%" + modelManageVo.getAaa169()
					+ "%'");
		}
		if (!StringUtils.isEmpty(modelManageVo.getAaa153())) {
			sql.append(" and k.aaa153 = '" + modelManageVo.getAaa153() + "'");
		}
		if (!StringUtils.isEmpty(modelManageVo.getAae100())) {
			sql.append(" and k.aae100 = '" + modelManageVo.getAae100() + "'");
		}
		sql.append("order by k.rm");
		page = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka43.class);
		List<Ka43> ka43List = page.getResult();
		List<Ka43DTO> ka43DtoList = new ArrayList<Ka43DTO>();
		for (Ka43 ka43 : ka43List) {
			Ka43DTO ka43Dto = new Ka43DTO();
			BeanTools.copyProperties(ka43, ka43Dto);
			// 增量方案
			Af51 zlfa = CommonHibernateDaoUtils.load(Af51.class, Long
					.valueOf(ka43.getAaz321()));
			// 实现方案
			Af51 sxfa = CommonHibernateDaoUtils.load(Af51.class, Long
					.valueOf(ka43.getAaz100()));
			if (zlfa != null) {
				ka43Dto.setZlfamc(zlfa.getAaa201());
			}
			if (sxfa != null) {
				ka43Dto.setSxfamc(sxfa.getAaa201());
			}
			ka43DtoList.add(ka43Dto);
		}
		page.setResult(ka43DtoList);
		return page;
	}

	// public List<Map<String,Object>> queryModelManageForExport(Ka43DTO dto) {
	// StringBuffer sql=new StringBuffer();
	// sql.append("select k.* from ka43 k where 1=1 ");
	// if(!StringUtils.isEmpty(dto.getAaa169())){
	// sql.append(" and k.aaa169 like '%"+dto.getAaa169()+"%'");
	// }
	// if(!StringUtils.isEmpty(dto.getAaa153())){
	// sql.append(" and k.aaa153 = '"+dto.getAaa153()+"'");
	// }
	// if(!StringUtils.isEmpty(dto.getAae100())){
	// sql.append(" and k.aae100 = '"+dto.getAae100()+"'");
	// }
	// sql.append(" order by k.aaz320,k.aae100");
	// List<Map<String,Object>>
	// ka43List=CommonJdbcDaoUtils.queryForList(sql.toString());
	// for (Map<String,Object> ka43Map : ka43List) {
	// //增量方案k
	// Af51 zlfa=CommonHibernateDaoUtils.load(Af51.class,
	// Long.valueOf(ka43Map.get("AAZ321").toString()));
	// //实现方案
	// Af51 sxfa=CommonHibernateDaoUtils.load(Af51.class,
	// Long.valueOf(ka43Map.get("AAZ100").toString()));
	// //监控类型
	// String aaa153=loadDicDataByNameAndCode("AAA153",
	// ka43Map.get("AAA153").toString());
	// if(zlfa!=null){
	// ka43Map.put("zlfamc", zlfa.getAaa201());
	// }
	// if(sxfa!=null){
	// ka43Map.put("sxfamc", sxfa.getAaa201());
	// }
	// ka43Map.put("AAA153", aaa153);
	// }
	// return ka43List;
	// }
	// //
	// // public String loadDicDataByNameAndCode(String name,String code){
	// String value=new String();
	// if(!StringUtils.isEmpty(name) && !StringUtils.isEmpty(code)){
	// String
	// dicSql="select bc_sql from IP_BUSINESS_CODE t where bc_type='"+name+"'";
	// String dataSql=CommonJdbcDaoUtils.queryObject(dicSql, String.class);
	// if(!StringUtils.isEmpty(dataSql)){
	// dataSql="select "+dataSql.substring(dataSql.indexOf(",")+1,dataSql.length());
	// dataSql+=" and aaa102='"+code+"'";
	// value=CommonJdbcDaoUtils.queryObject(dataSql,String.class);
	// }
	// }
	// return value;
	// }

	public Page queryRuleWithPageAndModel(Page page, String aaz320) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ka44 where");
		if (!StringUtils.isEmpty(aaz320)) {
			sql.append(" AAZ320=" + aaz320 + "");
		} else {
			sql.append(" 1=2");
		}
		sql.append("order by aaz319");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka44.class);
	}

	public Page querySchemeWithPage(Page page, PlanManageVO schemeVo,
			String type) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from af51 where 1=1");
		if (!StringUtils.isEmpty(schemeVo.getAaa201())) {
			sql.append(" and aaa201 like '%" + schemeVo.getAaa201() + "%'");
		}
		if (!StringUtils.isEmpty(type)) {
			sql.append(" and aaa143 = " + type + "");
		}
		if (!StringUtils.isEmpty(schemeVo.getAae100())) {
			sql.append(" and AAE100 = " + schemeVo.getAae100() + "");
		}
		sql.append(" order by aae100 desc");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af51.class);
	}

	public Ka43DTO SaveKa43(Ka43DTO dto) {

		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz320");
		sqlBF.append("	 from ka43");
		sqlBF.append("	where aaa169 = '" + dto.getAaa169() + "'");
		List<Af51> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
				Af51.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要保存的规则模板在系统中存在。");
		}
		Ka43 ka43 = new Ka43();
		BeanTools.copyProperties(dto, ka43);
		CommonHibernateDaoUtils.save(ka43);
		return dto;

	}

	public void updateKa43(Ka43DTO dto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz320");
		sqlBF.append("	 from ka43");
		sqlBF.append("	where aaa169 = '" + dto.getAaa169() + "'");
		// sqlBF.append("	  and aaa153 = '" + dto.getAaa153() + "'");
		sqlBF.append("    and aaz320 <> '" + dto.getAaz320() + "'");
		List<Af51> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
				Af51.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要保存的规则模板在系统中存在。");
		}
		Ka43 ka43 = new Ka43();
		BeanTools.copyProperties(dto, ka43);
		// // 修改要注意有效标志
		// ka43.setAae100("1");
		CommonHibernateDaoUtils.update(ka43);
	}

	public Ka43DTO queryModelById(Long id) {
		Ka43 ka43 = CommonHibernateDaoUtils.load(Ka43.class, id);
		Ka43DTO ka43Dto = new Ka43DTO();
		BeanTools.copyProperties(ka43, ka43Dto);
		// 增量方案
		Af51 zlfa = CommonHibernateDaoUtils.load(Af51.class, Long.valueOf(ka43
				.getAaz321()));
		// 实现方案
		Af51 sxfa = CommonHibernateDaoUtils.load(Af51.class, Long.valueOf(ka43
				.getAaz100()));
		if (zlfa != null) {
			ka43Dto.setZlfamc(zlfa.getAaa201());
		}
		if (sxfa != null) {
			ka43Dto.setSxfamc(sxfa.getAaa201());
		}
		return ka43Dto;
	}

	public Page queryRuleWithPage(Page page, RuleVO ruleVO) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ka44 ka44 where 1=1 ");
		if (!StringUtils.isEmpty(ruleVO.getAaa027())) {
			sql.append("and ka44.aaa027 = '" + ruleVO.getAaa027() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa153())) {
			sql.append("and ka44.aaa153 = '" + ruleVO.getAaa153() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getApa709())) {
			sql.append("and ka44.apa709 = '" + ruleVO.getApa709() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa168())) {
			sql.append("and ka44.AAA168 like '%" + ruleVO.getAaa168() + "%' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa133())) {
			sql.append("and ka44.aaa133 like '%" + ruleVO.getAaa133() + "%' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa178())) {
			sql.append("and ka44.AAA178 = '" + ruleVO.getAaa178() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa167())) {
			sql.append("and ka44.AAA167 like '%" + ruleVO.getAaa167() + "%' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAae100())) {
			sql.append("and ka44.AAE100 = '" + ruleVO.getAae100() + "' ");
		}
		sql.append("order by ka44.aae100 desc,ka44.aaz319");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka44.class);
	}

	public Ka44DTO saveKa44(Ka44DTO ka44dto) {
		if (ka44dto == null) {
			throw new BusinessException("Ka44DTO-00:传入ka44Dto为空!");
		}

		Ka44 ka44 = new Ka44();

		BeanTools.copyProperties(ka44dto, ka44);

		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz319");
		sqlBF.append("	 from ka44");
		sqlBF.append("	where aaa167 = '" + ka44.getAaa167() + "'");
		sqlBF.append("	  and aaa027 = '" + ka44.getAaa027() + "'");
		List<Ka44> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
				Ka44.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要保存的规则在系统中存在!");
		}
		StringBuffer sql = new StringBuffer();
		sql.append(" select *");
		sql.append("	 from ka44");
		sql.append("	where aaa168 = '" + ka44.getAaa168() + "'");
		List<Ka44> res = CommonJdbcDaoUtils.query(sql.toString(), Ka44.class);
		if (res != null && res.size() > 0) {
			String aaa168 = getAaa168(ka44.getAaa153());
			ka44.setAaa168(aaa168);
			CommonHibernateDaoUtils.save(ka44);
		} else {
			CommonHibernateDaoUtils.save(ka44);
		}
		BeanTools.copyProperties(ka44, ka44dto);

		return ka44dto;
	}

	public String getAaa168(String aaa153) {
		String sql = "select aaa103  from aa10 where aaa100 = 'AAA153' and aaa102 = '"
				+ aaa153 + "'";
		String str1 = CommonJdbcDaoUtils.queryObject(sql, String.class);
		str1 = 'R' + str1.substring(0, 1);
		StringBuffer bn1 = new StringBuffer();
		bn1.append(" select '000'||(max(substr(aaa168,3)+1)) str");
		bn1.append("	 from ka44			");
		bn1.append("	where aaa168 like '" + str1 + "%'");
		String result = CommonJdbcDaoUtils.queryObject(bn1.toString(),
				String.class);
		String str2;
		if (result == null) {
			str2 = "001";
		}
		str2 = result;
		if (str2.length() == 3) {
			str2 = "001";
		}
		String aaa168 = str1 + str2.substring(str2.length() - 3);
		return aaa168;
	}

	public Ka44DTO loadKa44(RuleVO ruleVo) {
		if (ruleVo.getAaz319() == null) {
			throw new BusinessException("Ka44DTO-00:传入ka44Dto为空!");
		}
		Ka44 ka44 = CommonHibernateDaoUtils
				.load(Ka44.class, ruleVo.getAaz319());
		Ka43 ka43 = CommonHibernateDaoUtils.load(Ka43.class, ka44.getAaz320());
		if (ka43 == null) {
			ka43 = new Ka43();
		}
		Ka44DTO ka44Dto = new Ka44DTO();
		ka44Dto.setAaa169(ka43.getAaa169());
		BeanTools.copyProperties(ka44, ka44Dto);
		return ka44Dto;
	}

	public Ka44DTO updateKa44(Ka44DTO dto) {
		if (dto == null) {
			throw new BusinessException("Ka44DTO-00:传入ka44Dto为空!");
		}

		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz319");
		sqlBF.append("	 from ka44");
		sqlBF.append("	where aaa167 = '" + dto.getAaa167() + "'");
		sqlBF.append("	  and aaa027 = '" + dto.getAaa027() + "'");
		sqlBF.append("    and aaz319 <> '" + dto.getAaz319() + "'");
		List<Ka44> res = CommonJdbcDaoUtils.query(sqlBF.toString(), Ka44.class);
		if (res != null && res.size() > 0) {
			throw new BusinessException("要保存的规则在系统中存在。");
		}
		Ka44 ka44 = new Ka44();
		StringBuffer bn1 = new StringBuffer();
		bn1.append(" select aaa153");
		bn1.append("	 from ka44			");
		bn1.append("	where aaz319 = '" + dto.getAaz319() + "'");
		String result = CommonJdbcDaoUtils.queryObject(bn1.toString(),
				String.class);
		if (result == null) {
			throw new BusinessException("传入的数据有误。");
		}
		String str = result;
		if (!str.equals(dto.getAaa153())) {
			String aaa168 = getAaa168(dto.getAaa153());
			dto.setAaa168(aaa168);
		}

		BeanTools.copyProperties(dto, ka44);
		// ka44.setAae100("1");// 此处不修改有效标志
		CommonHibernateDaoUtils.update(ka44);
		BeanTools.copyProperties(ka44, dto);
		return dto;
	}

	public Af46DTO loadAf46(String id) {
		if (StringUtils.isEmpty(id)) {
			throw new BusinessException("Af46DTO-00:传入ka44Dto.id为空!");
		}
		Af46 af46 = CommonHibernateDaoUtils.load(Af46.class, Long.valueOf(id));
		Af46DTO af46Dto = new Af46DTO();
		if (af46.getAaz100() != null && af46.getAaz100() != 0) {
			Af51 af51 = CommonHibernateDaoUtils.load(Af51.class, Long
					.valueOf(af46.getAaz100()));
			af46Dto.setSchemeName(af51.getAaa201());
		}
		BeanTools.copyProperties(af46, af46Dto);
		return af46Dto;
	}

	public Page queryAnalysisRuleWithPage(Page page,
			AnalysisRuleVO analysisRuleVO) {

		StringBuffer sql = new StringBuffer();
		sql.append("select * from af46 where 1=1 ");
		if (!StringUtils.isEmpty(analysisRuleVO.getAaa027())) {
			sql.append("and aaa027 = '" + analysisRuleVO.getAaa027() + "' ");
		}
		if (!StringUtils.isEmpty(analysisRuleVO.getAae417())) {
			sql.append("and AAE417 like '%" + analysisRuleVO.getAae417()
					+ "%' ");
		}
		if (!StringUtils.isEmpty(analysisRuleVO.getApa709())) {
			sql.append("and Apa709 = '" + analysisRuleVO.getApa709() + "' ");
		}
		if (!StringUtils.isEmpty(analysisRuleVO.getAae100())) {
			sql.append("and AAE100 = '" + analysisRuleVO.getAae100() + "' ");
		}
		sql.append(" order by aae100 desc");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af46.class);
	}

	public void saveAf46(Af46DTO Af46Dto) {
		if (Af46Dto == null) {
			throw new BusinessException("Af46DTO-00:传入ka44Dto为空!");
		}
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz319");
		sqlBF.append("	 from af46");
		sqlBF.append("	where aae417 = '" + Af46Dto.getAae417() + "'");
		sqlBF.append("	  and aaa027 = '" + Af46Dto.getAaa027() + "'");
		List<Af46> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
				Af46.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要保存的分析在系统中存在。");
		}
		Af46 af46 = new Af46();
		BeanTools.copyProperties(Af46Dto, af46);
		CommonHibernateDaoUtils.save(af46);
	}

	public void updateKa46(Af46DTO dto) {
		if (dto == null) {
			throw new BusinessException("Af46DTO-00:传入ka44Dto为空!");
		}
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz319");
		sqlBF.append("	 from af46");
		sqlBF.append("	where aae417 = '" + dto.getAae417() + "'");
		sqlBF.append("	  and aaa027 = '" + dto.getAaa027() + "'");
		sqlBF.append("    and aaz319 <> '" + dto.getAaz319() + "'");
		List<Af46> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
				Af46.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要保存的分析在系统中存在。");
		}
		Af46 af46 = new Af46();
		BeanTools.copyProperties(dto, af46);
		CommonHibernateDaoUtils.update(af46);

	}

	public void updateAf46Aae043(Af46DTO dto) {
		if (dto == null) {
			throw new BusinessException("Af46DTO-00:传入Af46DTO为空!");
		}
		Af46 ka46 = CommonHibernateDaoUtils.load(Af46.class, dto.getAaz319());
		ka46.setAae043(dto.getAae043());
		CommonHibernateDaoUtils.update(ka46);
	}

	public void updateAf46Aae100(Af46DTO dto) {
		if (dto == null) {
			throw new BusinessException("Af46DTO-00:传入Af46DTO为空!");
		}
		Af46 ka46 = CommonHibernateDaoUtils.load(Af46.class, dto.getAaz319());
		ka46.setAae100(dto.getAae100());
		CommonHibernateDaoUtils.update(ka46);
	}

	public void updateKa44Aae100(Ka44DTO dto) {
		if (dto == null) {
			throw new BusinessException("Ka44DTO-00:传入Ka44DTO为空!");
		}
		Ka44 ka44 = CommonHibernateDaoUtils.load(Ka44.class, dto.getAaz319());
		ka44.setAae100(dto.getAae100());
		CommonHibernateDaoUtils.update(ka44);
	}

	public void updateKa43Aae100(Ka43DTO dto) {
		@SuppressWarnings("unused")
		String aae100 = "";
		if ("1".equals(dto.getAae100())) {
			aae100 = "1";
		} else {
			aae100 = "0";
			StringBuffer sqlBF = new StringBuffer();
			sqlBF.append("select aaz320	");
			sqlBF.append("  from ka43 a	");
			sqlBF.append(" where exists (select 'x'	");
			sqlBF.append("          	   from ka44 b	");
			sqlBF.append("        		  where b.aae100 = '1'	");
			sqlBF.append("           		and a.aaz320 = b.aaz320)");
			sqlBF.append("	 and a.aaz320 = '" + dto.getAaz320() + "'");
			List<Ka43> result = CommonJdbcDaoUtils.query(sqlBF.toString(),
					Ka43.class);
			if (result != null && result.size() > 0) {
				throw new BusinessException("要禁用的规则模板下存在有效的规则或者增量方案，无法禁用。");
			}
		}
		Ka43 ka43 = CommonHibernateDaoUtils.load(Ka43.class, dto.getAaz320());
		ka43.setAae100(dto.getAae100());
		CommonHibernateDaoUtils.update(ka43);

	}

	public Page queryAaa153WithPage(Page page, RuleVO ruleVO) {
		StringBuffer sql = new StringBuffer();
		sql.append("select aaa153,count(*) as count from KA44 where aae100=1 ");
		if (!StringUtils.isEmpty(ruleVO.getAaa153())) {
			sql.append("and aaa153='" + ruleVO.getAaa153() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa168())) {
			sql.append("and aaa168='" + ruleVO.getAaa168() + "' ");
		}
		if (ruleVO.getAaz320() != null) {
			sql.append("and Aaz320='" + ruleVO.getAaz320() + "' ");
		}
		sql.append("group by aaa153");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka44.class);
	}

	public Page queryKa44ByAaa153(Page page, RuleVO ruleVO) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ka44 where 1=1");
		if (!StringUtils.isEmpty(ruleVO.getAaa153())) {
			sql.append("and aaa153='" + ruleVO.getAaa153() + "' ");
		}
		if (!StringUtils.isEmpty(ruleVO.getAaa168())) {
			sql.append("and aaa168='" + ruleVO.getAaa168() + "' ");
		}
		if (ruleVO.getAaz320() != null) {
			sql.append("and Aaz320='" + ruleVO.getAaz320() + "' ");
		}
		if (ruleVO.getAae100() != null) {
			sql.append("and Aae100='" + ruleVO.getAae100() + "' ");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka44.class);
	}

	public void saveKa45(Ka45DTO dto) {
		List<Ka45> result = find(dto);
		long ape735 = dto.getApe735(), temp;
		long aaa155 = dto.getId().getAaa155(), yzjb;
		if (result != null && result.size() > 0) {
			throw new BusinessException("该级别阈值已经设置");
		}

		String sql = "select aaa155 from ka45 where aaz319='"
				+ dto.getId().getAaz319() + "' and aaa005 = '"
				+ dto.getAaa005() + "'";

		List<Ka45> res = CommonJdbcDaoUtils.query(sql, Ka45.class);
		if (res != null && res.size() > 0) {
			yzjb = res.get(0).getAaa155();
			if (yzjb > 0) {
				throw new BusinessException("该规则下的" + String.valueOf(yzjb)
						+ "级阈值已经设置为" + String.valueOf(dto.getAaa005()) + "。");
			}
		}

		sql = "select nvl(max(aaa155),0) aaa155 from ka45 where aaz319='"
				+ dto.getId().getAaz319() + "' and aaa155 < '"
				+ dto.getId().getAaa155() + "'";
		List<Ka45> ka45s = CommonJdbcDaoUtils.query(sql, Ka45.class);
		if (ka45s != null && ka45s.size() > 0) {
			yzjb = ka45s.get(0).getAaa155();
			if (yzjb + 1 < aaa155) {
				throw new BusinessException("该规则下的" + String.valueOf(yzjb + 1)
						+ "级阈值尚未设置。");
			}
		}

		checkVal(dto);
		sql = " select min(ape735) ape735";
		sql += "  from ka45					";
		sql += " where aaz319 = '" + dto.getId().getAaz319() + "'";
		sql += "       and ape735<=" + ape735 + " and aaa155<" + aaa155;
		res = CommonJdbcDaoUtils.query(sql, Ka45.class);

		temp = res.get(0) == null ? -1 : (res.get(0).getApe735() == null ? 0
				: res.get(0).getApe735());
		if (temp > 0) {
			throw new BusinessException("您输入的权重应低于系统中已有权重：" + temp + "，请重新设置。");
		}

		Ka45 ka45 = new Ka45();
		BeanTools.copyProperties(dto, ka45);
		CommonHibernateDaoUtils.save(ka45);
	}

	private List<Ka45> find(Ka45DTO dto) {
		List<Ka45> result = new ArrayList<Ka45>();
		StringBuffer bn = new StringBuffer();
		bn.append(" select aaz319,aaa155,aaa005,ape735");
		bn.append("	  from ka45					");
		bn.append("	 where aaz319 = " + dto.getId().getAaz319() + "");
		if (dto.getId().getAaa155() != null
				&& !"".equals(dto.getId().getAaa155())) {
			bn.append(" and aaa155 like '%" + dto.getId().getAaa155() + "%'");
		}
		result = CommonJdbcDaoUtils.query(bn.toString(), Ka45.class);
		return result;
	}

	private void checkVal(Ka45DTO dto) {
		@SuppressWarnings("unused")
		boolean val = true;
		long aaa155 = 0;
		long aaa155top = 0;
		double aaa005 = 0;
		String sql = "select aaa154 from ka44 where aaz319='"
				+ dto.getId().getAaz319() + "'";

		String comp = CommonJdbcDaoUtils.queryObject(sql, String.class);

		String sql1 = "select * from ka45 where aaz319='"
				+ dto.getId().getAaz319() + "'";
		List<Ka45> list = CommonJdbcDaoUtils.query(sql1, Ka45.class);
		if (comp != null) {
			if ((comp.toString()).equals("1")) {
				for (int i = 0; i < list.size(); i++) {
					aaa155top = list.get(i).getAaa155();
					aaa155 = dto.getId().getAaa155() - 1;
					aaa005 = list.get(i).getAaa005();

					if (aaa155top == aaa155 && aaa005 < dto.getAaa005()) {
						throw new BusinessException("该规则下的"
								+ String.valueOf(dto.getId().getAaa155())
								+ "级阈值必须小于" + list.get(i).getAaa155() + "级阈值。");
					}
				}
			} else if ((comp.toString()).equals("2")) {

				for (int i = 0; i < list.size(); i++) {
					aaa155top = list.get(i).getAaa155();
					aaa155 = dto.getId().getAaa155() - 1;
					aaa005 = list.get(i).getAaa005();

					if (aaa155top == aaa155 && aaa005 > dto.getAaa005()) {
						throw new BusinessException("该规则下的"
								+ String.valueOf(dto.getId().getAaa155())
								+ "级阈值必须大于" + list.get(i).getAaa155() + "级阈值。");
					}
				}
			} else if ((comp.toString()).equals("3")) {
				if (list.size() == 1) {

					throw new BusinessException("该规则下的阈值比较方式不允许在添加阈值。");
				}

			}
		}
	}

	public void updateKa45(Ka45DTO dto) {
		RuleVO rule = new RuleVO();
		rule.setAaz319(dto.getId().getAaz319());
		Ka44 ka44 = loadKa44(rule);
		int aaa155 = Integer.parseInt(dto.getId().getAaa155().toString());
		String aaa154 = ka44.getAaa154();
		switch (aaa155) {
		case 1:
			long ape735_1 = getWeight(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() + 1));
			long aaa005_1 = getVal(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() + 1));
			if (ape735_1 != -1 && dto.getApe735() < ape735_1) {
				throw new BusinessException("该规则下的一级权重必须大于二级权重。");
			} else if (aaa005_1 != -1) {
				if (aaa154.equals("1") && dto.getAaa005() <= aaa005_1) {
					throw new BusinessException("该规则下的一级阈值必须大于二级阈值。");
				} else if (aaa154.equals("2") && dto.getAaa005() >= aaa005_1) {
					throw new BusinessException("该规则下的一级阈值必须小于于二级阈值。");
				}
			}
			break;

		case 2:
			long ape735_a = getWeight(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() + 1));
			long aaa005_a = getVal(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() + 1));
			long ape735_b = getWeight(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() - 1));
			long aaa005_b = getVal(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() - 1));

			if (ape735_a == -1 && dto.getApe735() >= ape735_b && ape735_b != -1) {
				throw new BusinessException("该规则下的二级权重必须小于一级权重之间。");
			} else if ((ape735_a != -1 && dto.getApe735() <= ape735_a)
					|| (dto.getApe735() >= ape735_b && ape735_b != -1)) {
				throw new BusinessException("该规则下的二级权重必须介于一级与三级权重之间。");
			} else if (aaa005_a != -1) {
				if (aaa154.equals("1")) {
					if (dto.getAaa005() <= aaa005_a
							|| dto.getAaa005() >= aaa005_b) {
						throw new BusinessException(
								"该规则下的阈值比较方式要求二级阈值必须大于三级阈值小于一级阈值。");
					}
				}
				if (aaa154.equals("2")) {
					if (dto.getAaa005() >= aaa005_a
							|| dto.getAaa005() <= aaa005_b) {
						throw new BusinessException(
								"该规则下的阈值比较方式要求二级阈值必须小于三级阈值大于一级阈值");
					}
				}
			} else if (aaa005_a == -1) {
				if (aaa154.equals("1") && dto.getAaa005() >= aaa005_b) {
					throw new BusinessException("该规则下的阈值比较方式要求二级阈值必须小于一级阈值。");
				} else if (aaa154.equals("2") && dto.getAaa005() <= aaa005_b) {
					throw new BusinessException("该规则下的阈值比较方式要求二级阈值必须大于一级阈值");
				}
			}

			break;
		case 3:

			long ape735_3 = getWeight(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() - 1));
			long aaa005_3 = getVal(String.valueOf(dto.getId().getAaz319()),
					String.valueOf(dto.getId().getAaa155() - 1));
			if (ape735_3 != -1 && dto.getApe735() > ape735_3) {
				throw new BusinessException("该规则下的三级权重必须小于二级权重。");
			} else if (aaa005_3 != -1) {
				if (aaa154.equals("1") && dto.getAaa005() >= aaa005_3) {
					throw new BusinessException("该规则下的三级阈值必须小于二级阈值。");
				} else if (aaa154.equals("2") && dto.getAaa005() <= aaa005_3) {
					throw new BusinessException("该规则下的三级阈值必须大于二级阈值。");
				}
			}
			break;
		}

		Ka45 ka45 = new Ka45();

		BeanTools.copyProperties(dto, ka45);
		CommonHibernateDaoUtils.update(ka45);
	}

	private long getWeight(String aaz319, String aaa155) {
		long aaa = -1;
		Long ape735;
		String sql = "select ape735 from ka45 where aaa155='" + aaa155
				+ "' and aaz319 ='" + aaz319 + "'";

		List<Ka45> list = CommonJdbcDaoUtils.query(sql, Ka45.class);

		if (list != null && list.size() != 0) {
			BigDecimal comp = BigDecimal.valueOf(list.get(0).getApe735());
			ape735 = new Long(comp.longValue());
			String a = ape735.toString();
			aaa = Long.valueOf(a);
		}
		return aaa;
	}

	private long getVal(String aaz319, String aaa155) {
		long aaa005 = -1;
		String sql = "select aaa005 from ka45 where aaa155='" + aaa155
				+ "' and aaz319 ='" + aaz319 + "'";

		List<Ka45> list = CommonJdbcDaoUtils.query(sql, Ka45.class);

		if (list != null && list.size() != 0) {
			BigDecimal comp = BigDecimal.valueOf(list.get(0).getAaa005());
			aaa005 = Long.valueOf(new Long(comp.longValue()).toString());
		}
		return aaa005;
	}

	public Page queryKa45WithPage(Page page, String aaz319) {
		String sql = "select * from ka45 where aaz319=" + aaz319 + "";
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Ka45.class);
	}

	public void deleteKa45(Ka45DTO dto) {
		StringBuffer bn = new StringBuffer();
		bn.append(" select aaa155 ");
		bn.append("	  from ka45					");
		bn.append("	 where aaz319 = " + dto.getId().getAaz319() + "");
		bn.append("    and aaa155 > " + dto.getId().getAaa155() + "");
		List<Ka45> ka45s = CommonJdbcDaoUtils.query(bn.toString(), Ka45.class);
		if (ka45s != null && ka45s.size() > 0) {
			throw new BusinessException("要删除的阈值是" + dto.getId().getAaa155()
					+ "级，不是最低的阈值");
		}
		Ka45 ka45 = new Ka45();
		BeanTools.copyProperties(dto, ka45);
		CommonHibernateDaoUtils.getCommonHibernateDao().delete(ka45);
	}

	public Ka45DTO loadKa45(BaseKa45Id id) {
		Ka45 ka45 = CommonHibernateDaoUtils.load(Ka45.class, id);
		Ka45DTO dto = new Ka45DTO();
		BeanTools.copyProperties(ka45, dto);
		return dto;
	}

	/**
	 * TbDicGzmsDTO
	 * 
	 */

	public TbDicGzmsDTO addTbDicGzms(TbDicGzmsDTO tgDto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select gzdm");
		sqlBF.append("	 from tb_dic_gzms");
		sqlBF.append("	where gzdm = '" + tgDto.getGzdm() + "'");

		List<TbDicGzms> list = CommonJdbcDaoUtils.query(sqlBF.toString(),
				TbDicGzms.class);
		if (list != null && list.size() > 0) {
			throw new BusinessException("要增加的方案信息已经存在");
		}

		TbDicGzms tbDicGzms = new TbDicGzms();
		BeanTools.copyPropertiesIgnoreNull(tgDto, tbDicGzms);
		String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_ID");
		tbDicGzms.setId(id);
		CommonHibernateDaoUtils.save(tbDicGzms);
		BeanTools.copyProperties(tbDicGzms, tgDto);
		return tgDto;

	}

	public TbDicGzzbDTO addTbDicGzzb(TbDicGzzbDTO tdDto) {

		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select gzdm");
		sqlBF.append("	 from tb_dic_gzzb");
		sqlBF.append("	where zbdm = '" + tdDto.getZbdm() + "'");

		List<TbDicGzms> list = CommonJdbcDaoUtils.query(sqlBF.toString(),
				TbDicGzms.class);
		if (list != null && list.size() > 0) {
			throw new BusinessException("要保存的指标在系统中存在。");
		}
		TbDicGzzb tbDicGzzb = new TbDicGzzb();
		BeanTools.copyPropertiesIgnoreNull(tdDto, tbDicGzzb);
		String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_ID");
		tbDicGzzb.setId(id);
		tbDicGzzb.setZt("0");
		CommonHibernateDaoUtils.save(tbDicGzzb);
		BeanTools.copyProperties(tbDicGzzb, tdDto);
		return tdDto;
	}

	public void deleteTbDicGzms(String idStr) {
		String[] ids = idStr.split(",");
		for (String id : ids) {
			TbDicGzms tbDicGzms = CommonHibernateDaoUtils.load(TbDicGzms.class,
					id);
			CommonHibernateDaoUtils.getCommonHibernateDao().delete(tbDicGzms);

		}
	}

	public void deleteTbDicGzzb(String idStr) {
		String[] ids = idStr.split(",");
		for (String id : ids) {
			TbDicGzzb tbDicGzzb = CommonHibernateDaoUtils.load(TbDicGzzb.class,
					id);
			CommonHibernateDaoUtils.getCommonHibernateDao().delete(tbDicGzzb);

		}
	}

	public TbDicGzmsDTO findtbdicgzms(String id) {
		TbDicGzmsDTO tgDto = new TbDicGzmsDTO();

		TbDicGzms tbdicgzms = CommonHibernateDaoUtils.load(TbDicGzms.class, id);

		if (tbdicgzms != null) {
			BeanTools.copyProperties(tbdicgzms, tgDto);
		}

		return tgDto;
	}

	public Page queryRuleMessage(Page page, TbDicGzmsDTO tgDto) {
		StringBuffer sql = new StringBuffer();
		sql
				.append(" select id,mc,gzdm,gzms,cjrmc,cjsj,zt from TB_DIC_GZMS where 1=1 ");
		if (StringUtils.isNotEmpty(tgDto.getMc())) {
			sql.append(" and mc='" + tgDto.getMc() + "'");
		}
		if (StringUtils.isNotEmpty(tgDto.getGzdm())) {
			sql.append(" and gzdm='" + tgDto.getGzdm() + "'");
		}
		if (StringUtils.isNotEmpty(tgDto.getZt())) {
			sql.append(" and zt='" + tgDto.getZt() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbDicGzms.class);

		return result;
	}

	public Page queryRuleTarget(Page page, TbDicGzzbDTO tdDto) {

		StringBuffer sql = new StringBuffer();

		sql.append(" select b.id,m.mc,");

		sql.append(" b.gzdm,b.zbmc,b.zbdm,b.zbms,b.cjrmc,to_char(b.cjsj,'YYYY-mm-dd HH24:MI:SS') cjsj,b.zt from TB_DIC_GZZB b,TB_DIC_GZMS m where b.gzdm=m.gzdm");

		if (StringUtils.isNotEmpty(tdDto.getZbmc())) {

			sql.append(" and b.zbmc like '%" + tdDto.getZbmc() + "%'");
		}
		if (StringUtils.isNotEmpty(tdDto.getMc())) {

			sql.append(" and m.mc like '%" + tdDto.getMc() + "%'");
		}

		if (StringUtils.isNotEmpty(tdDto.getGzdm())) {

			sql.append(" and b.gzdm = '" + tdDto.getGzdm() + "'");
		}

		if (StringUtils.isNotEmpty(tdDto.getZbdm())) {
			sql.append(" and b.zbdm= '" + tdDto.getZbdm() + "'");
		}

		if (StringUtils.isNotEmpty(tdDto.getZt())) {
			sql.append(" and b.zt= '" + tdDto.getZt() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbDicGzzb.class);

		return result;
	}

	public void updateTbDicGzms(TbDicGzmsDTO tgDto, String gzdm1) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select zt from TB_DIC_GZMS where gzdm='" + tgDto.getGzdm()
				+ "'");
		List<TbDicGzms> list = CommonJdbcDaoUtils.query(sql.toString(),
				TbDicGzms.class);
		if (list != null && list.size() > 0) {
			if (list.get(0).getZt().equals("1")) {
				throw new BusinessException("要保存的规则已被禁用。");
			}
		}
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select gzdm");
		sqlBF.append("	 from tb_dic_gzms");
		sqlBF.append("	where gzdm = '" + tgDto.getGzdm() + "'");

		List<TbDicGzms> list1 = CommonJdbcDaoUtils.query(sqlBF.toString(),
				TbDicGzms.class);
		if (list1 != null && list1.size() > 1) {
			throw new BusinessException("要增加的方案信息已经存在");
		}

		if (!tgDto.getGzdm().equals(gzdm1)) {
			Integer count = CommonJdbcDaoUtils.queryObject(
					"select count(*) from TB_DIC_GZMS where gzdm='"
							+ tgDto.getGzdm() + "'", Integer.class);
			if (count >= 1) {
				throw new BusinessException("要保存的规则代码已存在。");
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" update TB_DIC_GZMS set mc='" + tgDto.getMc() + "',gzdm='"
				+ tgDto.getGzdm() + "',gzms='" + tgDto.getGzms() + "'");
		sb.append(" ,zt='" + tgDto.getZt() + "' where id='" + tgDto.getId()
				+ "'");

		CommonJdbcDaoUtils.update(sb.toString());

	}

	public TbRuleDxzbDTO SaveTbRuleDxzb(TbRuleDxzbDTO trDto) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select * from TB_RULE_DXZB where dxid='" + trDto.getDxid()
				+ "'" + " and gzdm='" + trDto.getGzdm() + "' and zbdm='"
				+ trDto.getZbdm() + "'");
		List<TbRuleDxzb> list = CommonJdbcDaoUtils.query(sql.toString(),
				TbRuleDxzb.class);
		if (CollectionUtils.isNotEmpty(list)) {
			throw new BusinessException("要增加的对象监控已经存在");
		}
		if (trDto.getDxid() == null) {
			throw new BusinessException(
					"*监控对象ID：该输入项为必输项。录入数据校验未通过，请根据提示修改数据后重试。");
		}
		TbRuleDxzb tbRuleDxzb = new TbRuleDxzb();
		BeanTools.copyPropertiesIgnoreNull(trDto, tbRuleDxzb);
		String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_ID");
		tbRuleDxzb.setId(id);
		CommonHibernateDaoUtils.save(tbRuleDxzb);
		BeanTools.copyProperties(tbRuleDxzb, trDto);
		return trDto;
	}

	public Page queryCaseNumberWithPage(Page page, RuleTargetVO ruleTargetVO) {
		StringBuffer sql = new StringBuffer(
				" select a.*,b.mc from tb_dic_gzzb a"
						+ " join tb_dic_gzms b on a.gzdm = b.gzdm where 1=1");

		if (StringTools.hasText(ruleTargetVO.getZbmc())) {
			sql.append(" and a.zbmc = '" + ruleTargetVO.getZbmc() + "' ");
		}

		if (StringTools.hasText(ruleTargetVO.getZt())) {
			sql.append(" and a.zt = '" + ruleTargetVO.getZt() + "' ");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbDicGzzb.class);

		return result;
	}

	public Page queryCLMl(Page page, DxzbVO dxzbVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ake001 as dxid,ake002 as dxmc,'" + dxzbVO.getDxlx()
				+ "' as dxlx from KA41 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001='" + dxzbVO.getDxid() + "'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and ake002='" + dxzbVO.getDxmc() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbRuleDxzb.class);

		return result;
	}

	public Page queryYpMl(Page page, DxzbVO dxzbVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ake001 as dxid,aka061 as dxmc,'" + dxzbVO.getDxlx()
				+ "' as dxlx from KA02 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001 like '%" + dxzbVO.getDxid() + "%'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and aka061='" + dxzbVO.getDxmc() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbRuleDxzb.class);

		return result;
	}

	public Page queryFwxmMl(Page page, DxzbVO dxzbVO) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select ake001 as dxid,ake002 as dxmc,'" + dxzbVO.getDxlx()
				+ "' as dxlx from KA03 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001='" + dxzbVO.getDxid() + "'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and ake002='" + dxzbVO.getDxmc() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbRuleDxzb.class);

		return result;
	}

	public Page queryAllMl(Page page, DxzbVO dxzbVO) {
		StringBuffer sql = new StringBuffer();
		sql
				.append(" select ake001 as dxid,ake002 as dxmc,'CL' as dxlx from KA41 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001 like '%" + dxzbVO.getDxid() + "'%");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and ake002='" + dxzbVO.getDxmc() + "'");
		}
		sql.append(" union ");
		sql
				.append(" select ake001 as dxid,ake002 as dxmc,'FWXM' as dxlx from KA03 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001 like '%" + dxzbVO.getDxid() + "'%");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and ake002='" + dxzbVO.getDxmc() + "'");
		}
		sql.append(" union ");
		sql
				.append(" select ake001 as dxid,aka061 as dxmc,'YP' as dxlx from KA02 where 1=1 ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and ake001 like '%" + dxzbVO.getDxid() + "'%");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and aka061='" + dxzbVO.getDxmc() + "'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbRuleDxzb.class);

		return result;
	}

	public Page queryDxzbMessage(Page page, DxzbVO dxzbVO) {
		if (StringUtils.isEmpty(dxzbVO.getZbmc())) {
			dxzbVO.setZbmc("");
		}
		if (StringUtils.isEmpty(dxzbVO.getMc())) {
			dxzbVO.setMc("");
		}
		StringBuffer sql = new StringBuffer();
		sql.append(" select b.id,b.dxid,b.dxlx,b.dxmc,b.cs,");
		sql.append(" (select mc from TB_DIC_GZMS where gzdm=b.gzdm) mc,");
		sql
				.append(" (select zbmc from TB_DIC_GZZB where zbdm=b.zbdm and gzdm=b.gzdm) zbmc,");
		sql
				.append(" (select zbms from TB_DIC_GZZB where zbdm=b.zbdm and gzdm=b.gzdm) zbms,");
		sql.append(" b.gzdm,b.zbdm,b.zbz,b.gzly,b.sm,b.cjrmc,b.cjsj,b.zt ");
		sql
				.append(" from TB_RULE_DXZB b  where 1=1 and b.gzdm in (select gzdm from TB_DIC_GZMS where mc like '%"
						+ dxzbVO.getMc() + "%') ");
		sql
				.append(" and b.zbdm in (select zbdm from TB_DIC_GZZB where zbmc like '%"
						+ dxzbVO.getZbmc() + "%') ");
		if (StringUtils.isNotEmpty(dxzbVO.getDxid())) {
			sql.append(" and b.dxid like '%" + dxzbVO.getDxid() + "%'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxmc())) {
			sql.append(" and b.dxmc like '%" + dxzbVO.getDxmc() + "%'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getZt())) {
			sql.append(" and b.zt='" + dxzbVO.getZt() + "'");
		}
		if (StringUtils.isNotEmpty(dxzbVO.getDxlx())) {
			sql.append(" and b.dxlx='" + dxzbVO.getDxlx() + "'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				TbRuleDxzb.class);

		return result;
	}

	public TbDicGzmsDTO updateTbRuleDxzb(TbRuleDxzbDTO tgDto) {
		StringBuffer sql = new StringBuffer();
		sql.append(" update TB_RULE_DXZB set zbz='" + tgDto.getZbz()
				+ "',gzly='" + tgDto.getGzly() + "',sm='" + tgDto.getSm()
				+ "',cs='" + tgDto.getCs() + "' where id='" + tgDto.getId()
				+ "'");
		int cnt = CommonJdbcDaoUtils.update(sql.toString());
		if (cnt < 1) {
			throw new BusinessException("未找到需要更新的数据!");
		}
		return null;
	}

	public TbRuleDxzbDTO findtbruledxzb(String id) {
		TbRuleDxzbDTO tgDto = new TbRuleDxzbDTO();
		StringBuffer sql = new StringBuffer();
		sql.append("select t.* ,");
		sql.append("(select zbmc from TB_DIC_GZZB where zbdm=t.zbdm) zbmc,");
		sql.append("(select zbms from TB_DIC_GZZB where zbdm=t.zbdm) zbms");
		sql.append(" from TB_RULE_DXZB t");
		sql.append(" where id='" + id + "'");
		TbRuleDxzb tbruledxzb = CommonJdbcDaoUtils.getFirst(sql.toString(),
				TbRuleDxzb.class);
		if (tbruledxzb != null) {
			BeanTools.copyProperties(tbruledxzb, tgDto);
		}
		return tgDto;
	}

	public void deleteTbRuleDxzb(String idStr) {
		String[] ids = idStr.split(",");

		for (String id : ids) {

			TbRuleDxzb tbruledxzb = CommonHibernateDaoUtils.load(
					TbRuleDxzb.class, id);

			CommonHibernateDaoUtils.getCommonHibernateDao().delete(tbruledxzb);
		}
	}

	public Page queryGzzbByGzmsId(Page page, String gzdm) {
		String sql = "select zb.*,(select mc from TB_DIC_GZMS where gzdm=zb.gzdm) mc"
				+ " from TB_DIC_GZZB zb where zb.gzdm='" + gzdm + "'";
		return CommonJdbcDaoUtils.queryWithPage(page, sql, TbDicGzzb.class);
	}

	public List<TbDicGzms> queryModelFromGzms() {
		String sql = "select gzdm,mc from tb_dic_gzms";
		return CommonJdbcDaoUtils.query(sql, TbDicGzms.class);
	}

	public Integer checkDm(String sql) {
		return CommonJdbcDaoUtils.queryObject(sql, Integer.class);
	}

	public List<F10402008VO> getYbgzfl() {
		String sql="select ybgzfl_id as ybgzflid,ybgzflbm,ybgzflmc from ybgz_ybgzfl where ybgzflbm in (select ybfgzflbm from ybgz_ybgzfl group by ybfgzflbm)";
		return CommonJdbcDaoUtils.query(sql, F10402008VO.class);
	}
	
	
	public List<F10402008VO> getYbgzflxx(String bm) {
		String sql="select ybgzfl_id as ybgzflid,ybgzflbm,ybgzflmc from ybgz_ybgzfl where ybfgzflbm='"+bm+"'";
		return CommonJdbcDaoUtils.query(sql, F10402008VO.class); 
	}

	public Page queryZsdWithPage(Page page, F10402008VO vo) {
		StringBuffer sb=new StringBuffer();
		sb.append("select  (select ybgzflmc from ybgz_ybgzfl where ybgzflbm=z.ybgzflbm)ybgzflmc,");
		sb.append("(select ybgzflmc from ybgz_ybgzfl where ybgzflbm=(select ybfgzflbm from ybgz_ybgzfl where ybgzflbm =z.ybgzflbm))ybfgzflmc,ybgzbm,z.ybgzflbm,z.ybgzmx_id as ybgzmxid,z.zsdbm,z.zsdmc,z.zsdlb,z.zsdgzms,z.sfyx");
		sb.append(" from yhk.yhk_ybgzmx z where 1=1 ");
		
		if(!StringUtils.isEmpty(vo.getYbfgzflbm())){
			if(!StringUtils.isEmpty(vo.getYbgzflbm())){
				sb.append(" and z.ybgzflbm='"+vo.getYbgzflbm()+"'");
			}else{
				sb.append(" and z.ybgzflbm in (select ybgzflbm from  ybgz_ybgzfl where ybfgzflbm='"+vo.getYbfgzflbm()+"')");
			}
		}
		if(!StringUtils.isEmpty(vo.getSfyx())){
			sb.append(" and z.sfyx='"+vo.getSfyx()+"'");
		}
		if(!StringUtils.isEmpty(vo.getZsdlb())){
			sb.append(" and z.zsdlb='"+vo.getZsdlb()+"'");
		}
		if(!StringUtils.isEmpty(vo.getZsdmc())){
			sb.append(" and z.zsdmc like '%"+vo.getZsdmc()+"%'");
		}
		if(!StringUtils.isEmpty(vo.getZsdgzms())){
			sb.append(" and z.zsdgzms like '%"+vo.getZsdgzms()+"%'");
		}
		
		return CommonJdbcDaoUtils.queryWithPage(page, sb.toString(), F10402008VO.class);
	}

	public YbgzmxVO loadZsdxx(String zsdid) {
		return CommonJdbcDaoUtils.getFirst("select t.ybgzmx_id as ybgzmxid,t.* from yhk.yhk_ybgzmx t where t.ybgzmx_id='"+zsdid+"'", YbgzmxVO.class);
	}

	public List<Map<String, Object>> queryBySql(String sql) {
		return CommonJdbcDaoUtils.queryForList(sql);
	}

	public Page queryLjsjWithPage(Page page, String sjzdb, String sjtjzd,String sjzszd,String sjzdlx) {
		
		String sql=null;
		if("5".equals(sjzdlx)){
			sql="select "+sjzszd+" as sjzszd,max("+sjtjzd+") as sjtjzd from  "+sjzdb+" group by "+sjzszd+"";
		}else{
			sql="select csbm as sjtjzd,zwms as sjzszd from   "+sjzdb+" where cslb='"+sjtjzd+"'";
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql, TjljVO.class);
	}
	
	public Object getObjBySql(String sql){
		return CommonJdbcDaoUtils.queryObject(sql, Object.class);
	}

	public void saveSjnr(Tjlj_CgVO vo) {
		CommonHibernateDaoUtils.executeStoreProcedure("pkg_tools_save.prc_saveAndUpdate_tjljsj", vo);

	}

	public void updateZsdmx(YbgzmxVO mxvo) {
		CommonJdbcDaoUtils.update("update yhk.yhk_ybgzmx set txfs='"+mxvo.getTxfs()+"',shjg='"+mxvo.getShjg()+"',zsdgzms='"+mxvo.getZsdgzms()+"' where ybgzmx_id='"+mxvo.getYbgzmxid()+"'");
	}

	public void updateZsdmxYxbz(String id) {
		Map<String, Object> zsdmx=CommonJdbcDaoUtils.queryForMap("select * from yhk.yhk_ybgzmx where ybgzmx_id='"+id+"'");
		String yxbz=(String) zsdmx.get("sfyx");
		if(yxbz.equals("1")){
			yxbz="0";
		}else{
			yxbz="1";
		}
		CommonJdbcDaoUtils.update("update yhk.yhk_ybgzmx set sfyx='"+yxbz+"' where ybgzmx_id='"+id+"'");
	}
	
}
