package com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


import com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs.PlanManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af46;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af47;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af48;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af49;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af50;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.bo.Af51;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af47DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af48DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af49DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af50DTO;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af51DTO;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class PlanManageBSImpl implements PlanManageBS {
	RuleManageBS ruleManage;
	
	public RuleManageBS getRuleManage() {
		return ruleManage;
	}

	public void setRuleManage(RuleManageBS ruleManage) {
		this.ruleManage = ruleManage;
	}

	public Page queryPlanManageWithPage(Page page, PlanManageVO planManageVO) {
		
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append("select * from af51 a where a.aaz100 is not null ");
		//当前有效标志
		if (StringTools.hasText(planManageVO.getAae100())) {
			sqlBF.append(" and a.aae100 ='" + planManageVO.getAae100() + "'");
		}
		//方案名称
		if (StringTools.hasText(planManageVO.getAaa201())) {
			sqlBF.append(" and a.aaa201 like '%" + planManageVO.getAaa201() + "%'");
		}
		//方案分类
		if (StringTools.hasText(planManageVO.getAaa143())) {
			sqlBF.append(" and a.aaa143 ='" + planManageVO.getAaa143() + "'");
		}
		//经办人
		if (StringTools.hasText(planManageVO.getAae011())) {
			sqlBF.append(" and a.aae011 ='" + planManageVO.getAae011() + "'");
		}
		sqlBF.append("order by a.aae100 desc");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(),Af51.class);

		return result;

	}

	public Af51DTO addImplScheme(Af51DTO af51dto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz100");
		sqlBF.append("	 from af51");
		sqlBF.append("	where aaa201 = '" + af51dto.getAaa201() + "'");
		
		List<Af51> list = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af51.class);
		if (list != null&&list.size()>0) {
			throw new BusinessException("要增加的方案信息已经存在");
		}
		Af51 af51=new Af51();

		BeanTools.copyPropertiesIgnoreNull(af51dto, af51);
		
		//设置添加的方案有效
		af51.setAae100("1");
		CommonHibernateDaoUtils.save(af51);
		
		BeanTools.copyProperties(af51,af51dto);
		return af51dto;
		
		
	}

	public Af51DTO updateImplScheme(Af51DTO af51dto) {
 
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz100");
		sqlBF.append("	 from af51");
		sqlBF.append("	where aaa201 = '" + af51dto.getAaa201() + "'");
		sqlBF.append("    and aaz100 <> " + af51dto.getAaz100() + "");
		List<Af51> list = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af51.class);
		if (list != null&&list.size()>0) {
			throw new BusinessException("更改后要保存的方案信息已经存在");
		}
		Af51 af51 = new Af51();

		BeanTools.copyPropertiesIgnoreNull(af51dto, af51);
		
		
		af51.setAae100("1");

		CommonHibernateDaoUtils.update(af51);
		
		BeanTools.copyProperties(af51,af51dto);
		
		return af51dto;

	}

	public Af51DTO findaf51(String aaz100) {
		Af51DTO af51dto = new  Af51DTO();
		
		Af51 af51 = CommonHibernateDaoUtils.load(Af51.class, Long.valueOf(aaz100));
		
		if(af51!=null){
			BeanTools.copyProperties(af51, af51dto);
		}
		
		return af51dto;
	}
	public Af51DTO updateaf51Aae100(String aaz100, String aae100) {
		if (!"1".equals(aae100)) {
			aae100 = "1";
		} else {
		aae100="0";
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append("select aaz100	");
		sqlBF.append("  from af51 a	");
		sqlBF.append(" where a.aaa143 in ('1','2') ");
		sqlBF.append("	 and a.aaz100 = '" + aaz100 + "'");
		sqlBF.append("   and exists (select 'x'	");
		sqlBF.append("          	   from ka43 b	");
		sqlBF.append("        		  where b.aae100 = '1'	");
		sqlBF.append("           		and (a.aaz100 = b.aaz321 or a.aaz100 = b.aaz100))");
		List<Af51> result = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af51.class);
		if (result != null && result.size() > 0) {
			throw new BusinessException("要禁用的方案下存在有效的规则或者增量方案，无法禁用。");
		}
		sqlBF.setLength(0);
		sqlBF.append("select aaz100	");
		sqlBF.append("  from af51 a	");
		sqlBF.append(" where a.aaa143 in ('3') ");
		sqlBF.append("	 and a.aaz100 = '" + aaz100 + "'");
		sqlBF.append("   and exists (select 'x'	");
		sqlBF.append("          	   from af46 b	");
		sqlBF.append("        		  where b.aae100 = '1'	");
		sqlBF.append("           		and b.aaz100 = a.aaz100)");
		List<Af51> res = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af51.class);
		if (res != null && res.size() > 0) {
			throw new BusinessException("要禁用的方案下存在有效的规则或者增量方案，无法禁用。");
		}
		}
		UserContext userContext=BusinessContextUtils.getUserContext();
		String username=userContext.getOperatorName();
		Af51 af51=new Af51();
		Af51DTO af51dto=new Af51DTO();
		af51=CommonHibernateDaoUtils.load(Af51.class, Long.valueOf(aaz100));
		af51.setAae100(aae100);
		af51.setAae011(username);
		af51.setAae036(new Date());
		CommonHibernateDaoUtils.update(af51);
		BeanTools.copyProperties(af51, af51dto);
		return af51dto;
	}

	public Af47DTO addAf47(Af47DTO af47Dto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz325");
		sqlBF.append("	 from af47");
		sqlBF.append("	where aaa201 = '" + af47Dto.getAaa201() + "'");
		List<Af47> res = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af47.class);
		if (res != null && res.size() > 0) {
			throw new BusinessException("要添加的调度管理计划已经存在");
		}
		
		Af47 af47 = new Af47();
		
		BeanTools.copyPropertiesIgnoreNull(af47Dto, af47);
		af47.setAae100("1");
		CommonHibernateDaoUtils.save(af47);
		
		BeanTools.copyProperties(af47, af47Dto);
		
		return af47Dto;
		
	}

	public Af47DTO updateAf47(Af47DTO af47Dto) {
		
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select aaz325");
		sqlBF.append("	 from af47");
		sqlBF.append("	where aaa201 = '" + af47Dto.getAaa201() + "'");
		sqlBF.append("    and aaz325 <> '" + af47Dto.getAaz325() + "'");
		List<Af47> res = CommonJdbcDaoUtils
				.query(sqlBF.toString(), Af47.class);
		if (res != null && res.size() > 0) {
			throw new BusinessException("要更改保存的调度管理计划已经存在");
		}
		
		Af47 af47 = new Af47();
		
		BeanTools.copyPropertiesIgnoreNull(af47Dto, af47);
		
		af47.setAae100("1");
		
		CommonHibernateDaoUtils.update(af47);
		
		BeanTools.copyProperties(af47,af47Dto);
		
		return af47Dto;
	}

	public Page queryDispatchManageWithPage(Page page,
			DispatchManageVO dispatchManageVO) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append("select * from af47 a where a.aaa201 is not null ");
		//计划名称
		if (StringTools.hasText(dispatchManageVO.getAaa201())) {
			sqlBF.append(" and a.aaa201 like '%" + dispatchManageVO.getAaa201() + "%'");
		}
			  
		//当前有效标志
		if(StringTools.hasText(dispatchManageVO.getAae100())){
			sqlBF.append(" and a.aae100 ='" + dispatchManageVO.getAae100() + "'");
			
		}
		sqlBF.append("order by a.aae100 desc");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(),Af47.class);

		return result;
	}
	
	public Af47DTO findAf47(String aaz325) {
		Af47 af47 = new Af47();
		Af47DTO af47dto = new Af47DTO();
		af47 = CommonHibernateDaoUtils.load(Af47.class, Long.valueOf(aaz325));
		if(af47!=null){
			BeanTools.copyProperties(af47, af47dto);
		}
		return af47dto;
	}

	public Af47DTO updateAae100(String aaz325, String aae100) {
		UserContext userContext=BusinessContextUtils.getUserContext();
		String username=userContext.getOperatorName();
		Af47 af47=new Af47();
		Af47DTO af47Dto=new Af47DTO();
		if(!"1".equals(aae100)){
			aae100="1";
		}else{
			aae100="0";
		}
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append("update af47  set aae100 = '"+aae100+"' where aaz325 = "+aaz325+" ");
		CommonJdbcDaoUtils.update(sqlBF.toString());
		
		af47=CommonHibernateDaoUtils.load(Af47.class, Long.valueOf(aaz325));
		af47.setAae100(aae100);
		af47.setAae011(username);
		af47.setAae036(new Date());
		CommonHibernateDaoUtils.update(af47);
		BeanTools.copyProperties(af47, af47Dto);
		
		return af47Dto;
		
	}
	public Page findRules(Page page,String aaz325) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select t.aaz333,t.ake070,t.aaa156, t.aaz325, r.aaz319 , r.aaa168, r.aaa167, r.aaa133, r.aaa153, r.aaa154, r.aae100,r.apa709");
		sqlBF.append("	  from af49	t , ka44 r					");
		sqlBF.append("	 where t.aaz319 = r.aaz319			");
		sqlBF.append("    and t.aaz325 = '" + aaz325 + "'	");
		sqlBF.append("	   and r.aae100 = '1'				");
		sqlBF.append("	   and t.aaa156 = '2'				");
		
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(), Af49.class);
		//System.out.println(result+"mmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		return result;
		
	}

	public Af49DTO addRuleTask(Af49DTO af49Dto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select 1 aaz333	");
		sqlBF.append("	 from af49	");
		sqlBF.append("	where aaz325 = '" + af49Dto.getAaz325() + "'");
		sqlBF.append("	  and aaz319 = '" + af49Dto.getAaz319() + "'");
		sqlBF.append("	  and aaa156 = '2'");
		List<Af49DTO> result=CommonJdbcDaoUtils.query(sqlBF.toString(),Af49DTO.class);
		if(result!=null&&result.size()>0){
			throw new BusinessException("所选规则已经在本次计划之内！");
		}
		Af49 af49=new Af49();
		BeanTools.copyPropertiesIgnoreNull(af49Dto, af49);
		af49.setAaa156("2");
		CommonHibernateDaoUtils.save(af49);
		BeanTools.copyProperties(af49, af49Dto);
		return af49Dto;
	}
	public void deleteRuleTask(String idStr) {
		String[] ids=idStr.split(",");
		for (String id : ids) {
			Af49 af49=CommonHibernateDaoUtils.load(Af49.class, Long.valueOf(id));
//			BeanTools.copyPropertiesIgnoreNull(af49Dto, af49);
//			af49.setAaa156("2");
			CommonHibernateDaoUtils.getCommonHibernateDao().delete(af49);
//			BeanTools.copyProperties(af49, af49Dto);
		}
		
	}

	public Af49DTO checkManage(String aaz325, String aaa156) {
		String bz1, bz2;
		if ("2".equals(aaa156)) {
			bz1 = "规则任务";
			bz2 = "分析主题";
		} else {
			bz2 = "规则任务";
			bz1 = "分析主题";
		}
		
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append("select 'x' from af49 where  aaa156 = '"+aaa156+"' and aaz325 = "+aaz325+"");
		List<Af49> result=CommonJdbcDaoUtils.query(sqlBF.toString(),Af49.class);
		if (!result.isEmpty() || result.size() != 0) {
			if (result.get(0) != null || !"".equals(result.get(0))) {
				throw new BusinessException("本次调度计划已经配置了" + bz1 + "，不能同时配置" + bz2
						+ "。");
			}
		}
//		Af49 af49=CommonHibernateDaoUtils.load(Af49.class, Long.valueOf(aaz325));
		Af49DTO af49Dto=new Af49DTO();
//		BeanTools.copyProperties(af49, af49Dto);
		return af49Dto;
	}

	public Page findAnalyze(Page page ,String aaz325) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select t.aaz333, t.ake070, t.aaz325, r.aaz319 , r.aae417, r.apa709, r.ape032, r.aaa152, r.aaz100, r.aae100");
		sqlBF.append("	  from af49	t , af46 r					");
		sqlBF.append("	 where t.aaz319 = r.aaz319			");
		sqlBF.append("    and t.aaz325 = '" + aaz325 + "'	");
		sqlBF.append("	   and r.aae100 = '1'				");
		sqlBF.append("	   and t.aaa156 = '3'				");
		
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(), Af49.class);
		return result;
	}

	public Af49DTO addAnalyze(Af49DTO af49Dto) {
		StringBuffer sqlBF = new StringBuffer();
		sqlBF.append(" select 1 aaz333	");
		sqlBF.append("	 from af49	");
		sqlBF.append("	where aaz325 = '" + af49Dto.getAaz325() + "'");
		sqlBF.append("	  and aaz319 = '" + af49Dto.getAaz319() + "'");
		sqlBF.append("	  and aaa156 = '3'						");
		List<Af49DTO> result=CommonJdbcDaoUtils.query(sqlBF.toString(),Af49DTO.class);
		if (result != null && result.size() != 0) {
			throw new BusinessException("所选规则已经在本次计划之内！");
		}
		Af49 af49=new Af49();
		BeanTools.copyPropertiesIgnoreNull(af49Dto, af49);
		af49.setAaa156("3");
		CommonHibernateDaoUtils.save(af49);
		
		BeanTools.copyProperties(af49, af49Dto);
		
		return af49Dto;
	}
	public void deleteAnalyzeTask(String idStr) {
		String[] ids=idStr.split(",");
		for (String id : ids) {
			Af49 af49=CommonHibernateDaoUtils.load(Af49.class, Long.valueOf(id));
//			BeanTools.copyPropertiesIgnoreNull(af49Dto, af49);
//			af49.setAaa156("2");
			CommonHibernateDaoUtils.getCommonHibernateDao().delete(af49);
		}
	}

	public Page queryAnalyze(Page page, AnalysisRuleVO anlysisRuleVO) {
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append(" select aaz319 , aae417, apa709, aae043, ape032, aaa152, aaz100");
		sqlBF.append("	  from af46 t						");
		sqlBF.append("	 where 1 = 1					");
		if (anlysisRuleVO.getApa709() != null && !"".equals(anlysisRuleVO.getApa709())) {
			sqlBF.append(" and t.apa709 = '" + anlysisRuleVO.getApa709() + "'");
		}
		if (anlysisRuleVO.getAae417() != null && !"".equals(anlysisRuleVO.getAae417())) {
			sqlBF.append(" and (t.aaz319 like '%" + anlysisRuleVO.getAae417()
					+ "%' or t.aae417 like '%" + anlysisRuleVO.getAae417() + "%')");
		}
		sqlBF.append("  and aae100='1'");
		sqlBF.append(" order by aaz319");
		
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(), Af46.class);
		return result;
	}

	public void savePriority(String aaz333, String ake070) {
		if (ake070 == null || "".endsWith(ake070)) {
			ake070 = "1";
		}
		if (aaz333 == null) {
			aaz333 = "";
		}
		
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append("update af49  set ake070 = '"+ake070+"' where aaz333 =  "+aaz333+" ");
		
		CommonJdbcDaoUtils.update(sqlBF.toString());
	}

	public Page queryPlanWithPage(Page page, Af48DTO af48Dto) {
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append("select a.aaz327 ,a.aaz325 aaz325,b.aaa201 aaa201,to_char(a.aae310,'yyyy-MM-dd hh24:mi:ss') aae310,to_char(a.aae311,'yyyy-MM-dd hh24:mi:ss') aae311,a.aae312 aae312,a.aae013 aae013  from Af48 a,Af47 b where a.aaz325=b.aaz325");
//		sqlBF.append(" and b.aaa201 like '%"+af48Dto.get+"%'", "jhmc", LikeType.LIKE);
		if(af48Dto.getAaz325()!=0){
			sqlBF.append(" AND a.aaz325 = "+af48Dto.getAaz325()+"");
		}
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		
		sqlBF.append(" and a.aae310>=to_date('"+fmt.format(af48Dto.getAae310())+"','yyyy-mm-dd')");
		sqlBF.append(" and a.aae311<to_date('"+fmt.format(af48Dto.getAae311())+"','yyyy-mm-dd')+1");
		sqlBF.append(" order by a.aae310 desc, a.aaz325 desc");
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(), Af48.class);
		return result;
	}

	public Page queryTaskWithPage(Page page, Af50DTO af50Dto) {
		StringBuffer sqlBF=new StringBuffer();
		sqlBF.append("select * from ((select b.aaa167 aaa167,a.aaa156 aaa156,a.aae311 aae311,a.aae312 aae312,a.aae317 aae317"
						+ " from Af50 a,ka44 b where a.aaz319=b.aaz319"
						+ " and aaa156 in('1','2')");
		sqlBF.append(" and a.aaz327="+af50Dto.getAaz327()+"");
		sqlBF.append(" ) union (select c.aae417 aaa167,a.aaa156 aaa156,a.aae311 aae311,a.aae312 aae312,a.aae317 aae317");
		sqlBF.append(" from Af50 a,af46 c where a.aaz319=c.aaz319");
		sqlBF.append(" and aaa156 = '3'");
		sqlBF.append("and a.aaz327="+af50Dto.getAaz327()+"");
		sqlBF.append(" )) order by aae311");
		
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sqlBF.toString(), Af50.class);
		
		return result;
	}

	 
	public List<Map<String, Object>> queryAf51ForExport(Af51DTO queryDto) {
		/*StringBuffer sqlBF = new StringBuffer();
		sqlBF.append("select * from af51 a where a.aaz100 is not null ");
		//当前有效标志
		if (StringTools.hasText(queryDto.getAae100())) {
			sqlBF.append(" and a.aae100 ='" + queryDto.getAae100() + "'");
		}
		//方案名称
		if (StringTools.hasText(queryDto.getAaa201())) {
			sqlBF.append(" and a.aaa201 like '%" + queryDto.getAaa201() + "%'");
		}
		//方案分类
		if (StringTools.hasText(queryDto.getAaa143())) {
			sqlBF.append(" and a.aaa143 ='" + queryDto.getAaa143() + "'");
		}
		//经办人
		if (StringTools.hasText(queryDto.getAae011())) {
			sqlBF.append(" and a.aae011 ='" + queryDto.getAae011() + "'");
		}
		
		List<Map<String, Object>>   Listaf51 = CommonJdbcDaoUtils.queryForList(sqlBF.toString());
		for (Map<String,Object> af51Map : Listaf51){
//			String aaa153=loadDicDataByNameAndCode("AAE100", af51Map.get("AAE100").toString());
			String aae100=this.ruleManage.loadDicDataByNameAndCode("AAE100", af51Map.get("AAE100").toString());
			af51Map.put("AAE100", aae100);
		}
			 
		 
		return Listaf51;*/
		return null;
	}


}
