package com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf06;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf06DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Af73;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Kb41;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Kf65;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.bo.Kf66;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af73DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Af74DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kb41DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kf65DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kf66DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class AuditComplaintBSImpl implements AuditComplaintBS {

	public Page queryOrgDoubtList(Page page, Af73DTO queryDto) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		String now=sdf.format(new Date(System.currentTimeMillis()));
		StringBuffer sql=new StringBuffer("select a.aaz107,a.aaz529,a.aaz281,c.aaa027, b.abz001,c.ape008,a.aaz077 ");
		sql.append(" ,to_date(a.ape727,'yyyy-MM-dd') as ape727s, case when a.ape139 = 0 then (to_date(a.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1) ");
		sql.append(" when a.ape139 in ('2', '6') and a.aae036 is not null then (a.aae036 + (select aaa005 from aa01 where aaa001 = 'CLBCSJ') + 1) end ape727e ");
		sql.append(" ,c.apa701,b.apf094,c.ape752 ");
		sql.append(" , a.ape139 , a.aae100 ");
		sql.append(" from af73 a,Af53 b,af31 c where 1=1 and c.aaz318=b.aaz318 and b.aaz281=a.aaz281 ");
		if (null != queryDto.getApa709() && !"".equals(queryDto.getApa709())) {
			sql.append(" and a.ape139 = "+queryDto.getApa709()+" ");
		}
		sql.append(" and c.aaz010= a.aaz010  and (a.aae100 is null or a.aae100=0) ");
		if (null == queryDto.getApe139() || "".equals(queryDto.getApe139())) {
			sql.append(" and a.ape139 in('0','2') ");
		}else {
			sql.append(" and a.ape139 = "+queryDto.getApe139()+" ");
		}
		sql.append(" and (case when a.ape139 = 0 and (to_date(a.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1 >= to_date("+now+", 'yyyy-MM-dd')) then 1 ");
		sql.append(" when a.ape139 in ('2','6') and a.aae036 is not null and (a.aae036 + (select aaa005 from aa01 where aaa001 = 'CLBCSJ') + 1) >= to_date("+now+", 'yyyy-MM-dd') then 1 else 0 end) = 1 ");
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and c.ape727>=to_number(replace('" + queryDto.getApe711s() + "','-','')) ");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and c.ape727<=to_number(replace('" + queryDto.getApe711e() + "','-','')) ");
		}
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}

	public ViolationComplaintVO consentBreach(
			ViolationComplaintVO violationComplaintVO) {
		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-00:传入Aaz529为空!");
		}
		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529=?", Af73.class, violationComplaintVO.getAaz529());
		ViolationComplaintVO resultVO=new ViolationComplaintVO();
		if (af73!=null) {
			BeanTools.copyProperties(violationComplaintVO,resultVO);
			UserContext user=BusinessContextUtils.getUserContext();
			af73.setApe008(user.getOperatorName());
			af73.setApe138(violationComplaintVO.getApe138());
			af73.setApe139("4");
			af73.setAae100("0");
			af73.setApe711(new Date());
			CommonHibernateDaoUtils.update(af73);
		}
		return resultVO;
	}

	public ViolationComplaintVO saveOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO) {
		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-01:传入Aaz529为空!");
		}
		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529=?", Af73.class, violationComplaintVO.getAaz529());
		ViolationComplaintVO resultVO=new ViolationComplaintVO();
		if (af73!=null) {
			BeanTools.copyProperties(violationComplaintVO,resultVO);
			UserContext user=BusinessContextUtils.getUserContext();
			af73.setApe008(user.getOperatorName());
			af73.setApe138(violationComplaintVO.getApe138());
			af73.setApe139("1");
			af73.setAae100("0");
			af73.setApe711(new Date());
			CommonHibernateDaoUtils.update(af73);
		}
		return resultVO;
	}

	public Af31DTO getPersonAuditInfoAndBaseInfo(String aaz077) {
		Af31 af31 =CommonJdbcDaoUtils.get(" select * from af31 where aaz077="+aaz077+" ", Af31.class);
		Af31DTO resultVO=new Af31DTO();
		if (af31!=null) {
			BeanTools.copyProperties(af31,resultVO);
		}
		return resultVO;
	}


	public Page queryKb41Message(Page page, Kb41DTO queryDto) {
		StringBuffer sql = new StringBuffer();
		 sql.append(" select * from KB41 k where 1=1 ");
		 
		if (!StringUtils.isEmpty(queryDto.getAae016())) {
			sql.append("and k.aae016 = '" + queryDto.getAae016() + "' ");
		}
		if (!StringUtils.isEmpty(queryDto.getAkb021())) {
			sql.append(" and k.akb021 like '%" + queryDto.getAkb021() + "%'");
		}
		if (!StringUtils.isEmpty(queryDto.getAka101())) {
			sql.append("and k.aka101 = '" + queryDto.getAka101()+ "' ");
		}
		if (!StringUtils.isEmpty(queryDto.getAkb020())) {
			sql.append("and k.akb020 = '" + queryDto.getAkb020() + "' ");
		}
		 
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kb41DTO.class);
	}
	


	public Kb41DTO findKb41(String aaz107) {
		
	//	StringBuffer sql=new StringBuffer(" select * from kb01 where 1=1 and aaz107='"+aaz107+"' ");
		Kb01 kb01= CommonHibernateDaoUtils.load(Kb01.class, aaz107);
	
		Kb41DTO kb41Dto = new Kb41DTO();
		if (kb01 != null) {
			BeanTools.copyProperties(kb01, kb41Dto);
		}
	
		StringBuffer sql2=new StringBuffer(" select * from kb41 where aae016=0 and aaz107='"+aaz107+"'");
		Kb41 kb41= CommonJdbcDaoUtils.getFirst(sql2.toString(), Kb41.class);
	
		if (kb41 != null) {
			BeanTools.copyProperties(kb41, kb41Dto);
		}
		return kb41Dto;
	}

	public Kb41DTO updateHospMessage(Kb41DTO tgDto) {
		Integer count = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kb41 where aaz107='"+tgDto.getAaz107()+"' and aae016='0' ", Integer.class);
		if (count >= 1) {
			Kb41 kb41 =CommonJdbcDaoUtils.get(" select * from kb41 where aaz107='"+tgDto.getAaz107()+"' and aae016=0 ", Kb41.class);
			BeanTools.copyPropertiesIgnoreNull(tgDto, kb41);
			UserContext user=BusinessContextUtils.getUserContext();
			kb41.setAae011(user.getOperatorName());
			kb41.setAae036(new Date());
			//kb41.setAae016("1");
			kb41.setApa120("2");
			CommonHibernateDaoUtils.update(kb41);

		   }else{
			Kb41 kb41 = new Kb41();
			BeanTools.copyPropertiesIgnoreNull(tgDto, kb41);
			String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ048");
			kb41.setBaz048(id);
			UserContext user=BusinessContextUtils.getUserContext();
			kb41.setAae011(user.getOperatorName());
			kb41.setAae036(new Date());
			kb41.setAae016("0");
			kb41.setApa120("1");
		//	kb41.setAaz107(CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ107"));
			CommonHibernateDaoUtils.save(kb41);
			
		}
		return tgDto;
		

		
	}
	public Page queryKf66Message(Page page, Kf66DTO Kf66Dto) {
		StringBuffer sql = new StringBuffer();
		 sql.append(" select t2.akb021,t.* from kf66 t ,kb01 t2 where 1=1 and t.aaz107=t2.aaz107 ");
//		List<Kf66> result = CommonJdbcDaoUtils.query(sql.toString(),
//				Kf66.class);
		 if (!StringUtils.isEmpty(Kf66Dto.getApa120())) {
				sql.append("and t.apa120 = '" + Kf66Dto.getApa120() + "' ");
		}
		if (!StringUtils.isEmpty(Kf66Dto.getAaz107())) {
			sql.append("and t.aaz107 = '" + Kf66Dto.getAaz107() + "' ");
		}
		if (!StringUtils.isEmpty(Kf66Dto.getAae016())) {
			sql.append("and t.aae016 = '" + Kf66Dto.getAae016() + "' ");
		}
		if (!StringUtils.isEmpty(Kf66Dto.getAaa027())) {
			sql.append("and t.aaa027 = '" + Kf66Dto.getAaa027() + "' ");
		}
		if (!StringUtils.isEmpty(Kf66Dto.getAaz307())) {
			sql.append("and t.aaz307 = '" + Kf66Dto.getAaz307() + "' ");
		}
		if (StringUtils.isNotEmpty(Kf66Dto.getAae036s())) {
			sql.append(" and t.aae036>= to_date('"+Kf66Dto.getAae036s()+"', 'yyyy-MM-dd')");
		}
		if (StringUtils.isNotEmpty(Kf66Dto.getAae036e())) {
			sql.append(" and t.aae036<= to_date('"+Kf66Dto.getAae036e()+"', 'yyyy-MM-dd')");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf66DTO.class);
	}

	public Page queryKf65Message(Page page, Kf65DTO Kf65Dto) {
		StringBuffer sql = new StringBuffer();
		 sql.append("select distinct a.*, c.aae386,b.akb021 from kf65 a,kb41 b,kf66 c where 1=1 and a.aaz107=b.aaz107  and a.aaz307=c.aaz307  " );
		
		 if (!StringUtils.isEmpty(Kf65Dto.getAaz107())) {
			sql.append(" and a.aaz107 = '" + Kf65Dto.getAaz107() + "' ");
		}
		if (!StringUtils.isEmpty(Kf65Dto.getAac003())) {
			sql.append(" and a.aac003 like '%" + Kf65Dto.getAac003() + "%' ");
		}
		if (!StringUtils.isEmpty(Kf65Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + Kf65Dto.getAaa027() + "' ");
		}
		if (!StringUtils.isEmpty(Kf65Dto.getAae016())) {
			sql.append(" and a.aae016 = '" + Kf65Dto.getAae016() + "' ");
		}
		if (Kf65Dto.getAaz307()!=null) {
			sql.append(" and a.aaz307 = '" + Kf65Dto.getAaz307() + "' ");
		}
		if (StringUtils.isNotEmpty(Kf65Dto.getAae036s())) {
			sql.append(" and a.aae036>= to_date('"+Kf65Dto.getAae036s()+"', 'yyyy-MM-dd')");
		}
		if (StringUtils.isNotEmpty(Kf65Dto.getAae036e())) {
			sql.append(" and a.aae036<= to_date('"+Kf65Dto.getAae036e()+"', 'yyyy-MM-dd')");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf65DTO.class);
	}

	public Kf66DTO saveKf66Message(Kf66DTO tgDto) {
		Integer count = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf66 where aae386='"+tgDto.getAae386()+"' and aae016=0 and aae100=1", Integer.class);
		if (count >= 1) {
			throw new BusinessException("科室名称已经存在");
		}
		Integer count2 = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf06 where aae386='"+tgDto.getAae386()+"' and aae100=1", Integer.class);
		if (count2 >= 1) {
			throw new BusinessException("科室名称已经存在");
		}
		Kf66 kf66 = new Kf66();
		BeanTools.copyPropertiesIgnoreNull(tgDto, kf66);
		String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ047");
		kf66.setBaz047(id);
		UserContext user=BusinessContextUtils.getUserContext();
		kf66.setAae011(user.getOperatorName());
		kf66.setAae036(new Date());
		kf66.setAae100("1");
		kf66.setAae016("0");
		kf66.setApa120("1");
		kf66.setAaz307(CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ307"));
		CommonHibernateDaoUtils.save(kf66);
		
		return tgDto;
	}

	public Page queryBreAudit(Page page, Af73DTO queryDto) {
		StringBuffer sql=new StringBuffer(" select a.aaz107,b.abz001,a.ape138,a.ape008,a.ape711,a.aae036,c.apa701,b.apf094,c.ape752,a.aaz529, a.aaz010,a.ape139,a.aaz077,b.aaz281 ");
		sql.append(" from af73 a, Af53 b, af31 c ");
		sql.append(" where 1 = 1   and c.aaz318 = b.aaz318   and b.aaz281 = a.aaz281   and c.aaz010 = a.aaz010  ");
		if (null != queryDto.getAaa027() && !"".equals(queryDto.getAaa027())) {
			sql.append(" and a.aaa027='"+queryDto.getAaa027()+"'");
		}
		if (null != queryDto.getApa709() && !"".equals(queryDto.getApa709())) {
			sql.append(" and a.apa709 = "+queryDto.getApa709()+" ");
		}
		if ("1".equals(queryDto.getApe139())) {
			sql.append(" and a.ape139 in('1','6') ");
		}else if ("2".equals(queryDto.getApe139())) {
			sql.append(" and a.ape139 in('2','3') ");
		}else {
			sql.append(" and a.ape139 in('1','2','3','6') ");
		}
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and a.ape711>=to_date('" + queryDto.getApe711s() + "','yyyy-mm-dd')");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and a.ape711<=to_date('" + queryDto.getApe711e() + "','yyyy-mm-dd')");
		}
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}

	public Page queryBreAuditDetail(Page page, Af73DTO queryDto) {
		if (queryDto.getAaz529() == null||queryDto.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-02:传入Aaz529为空!");
		}
		StringBuffer sql=new StringBuffer(" select a.aaz530,a.ape023,a.aae011,a.aae036 from AF74 a where 1=1 ");
		if (null != queryDto.getAaz529() && !"".equals(queryDto.getAaz529())) {
			sql.append(" and a.aaz529='"+queryDto.getAaz529()+"'");
		}
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af74DTO.class);
		return result;
	}

	public ViolationComplaintVO breAuditPass(
			ViolationComplaintVO violationComplaintVO) {
//		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
//			throw new BusinessException("AuditComplaintBS-03:传入Aaz529为空!");
//		}
//		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529="+violationComplaintVO.getAaz529()+" ", Af73.class);
//		af73.setApe139("3");
//		af73.setAae011(violationComplaintVO.getAae011());
//		af73.setAaz008(violationComplaintVO.getAaz008());
//		af73.setAaz154(violationComplaintVO.getAaz154());
//		af73.setAae036(new Date());
//		CommonHibernateDaoUtils.update(af73);
//		Af31 af31 =CommonJdbcDaoUtils.get(" select * from af31 where aaz318=? and aaz077=? and aaz010=? ", Af31.class,af73.getAaz318(),af73.getAaz077(),af73.getAaz010());
//		af31.setApa157("0");
//		af31.setAae031(null);
//		af31.setApa005("01");
//		af31.setApa154("1");
//		af31.setApa156("0");
//		af31.setApa155("0");
//		af31.setApa158("0");
//		af31.setApa162("0");
//		af31.setApa163("0");
//		af31.setApa161("0");
//		af31.setApe726(af31.getApe726()+" 医院申诉通过不予处理");
//		CommonHibernateDaoUtils.update(af31);
		return violationComplaintVO;
	}

	public ViolationComplaintVO breAuditNotPass(
			ViolationComplaintVO violationComplaintVO) {
		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-04:传入Aaz529为空!");
		}
		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529="+violationComplaintVO.getAaz529()+" ", Af73.class);
		af73.setApe139("2");
		af73.setAae011(violationComplaintVO.getAae011());
		af73.setAaz008(violationComplaintVO.getAaz008());
		af73.setAaz154(violationComplaintVO.getAaz154());
		af73.setAae036(new Date());
		CommonHibernateDaoUtils.update(af73);
		return violationComplaintVO;
	}

	public ViolationComplaintVO findVioComp(
			ViolationComplaintVO violationComplaintVO) {
		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-05:传入Aaz529为空!");
		}
		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529="+violationComplaintVO.getAaz529()+" ", Af73.class);
		if(af73!=null){
			BeanTools.copyProperties(af73, violationComplaintVO);
		}
		return violationComplaintVO;
	}

	public ViolationComplaintVO addOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO) {
		if (violationComplaintVO.getAaz529() == null||violationComplaintVO.getAaz529()==0) {
			throw new BusinessException("AuditComplaintBS-06:传入Aaz529为空!");
		}
		Af73 af73 =CommonJdbcDaoUtils.get(" select * from af73 where aaz529=?", Af73.class, violationComplaintVO.getAaz529());
		ViolationComplaintVO resultVO=new ViolationComplaintVO();
		if (af73!=null) {
			BeanTools.copyProperties(violationComplaintVO,resultVO);
			UserContext user=BusinessContextUtils.getUserContext();
			af73.setApe008(user.getOperatorName());
			af73.setApe138(violationComplaintVO.getApe138());
			af73.setApe139("6");
			af73.setAae100("1");
			af73.setApe711(new Date());
			CommonHibernateDaoUtils.update(af73);
		}
		return resultVO;
	}

	public Page toOrgBreCompQuery(Page page, Af73DTO queryDto) {
		StringBuffer sql=new StringBuffer(" select a.aaz107,b.abz001,a.ape138,a.ape008,a.ape711,a.aae036,c.apa701,b.apf094,c.ape752,a.aaz529, a.aaz010,a.ape139,a.aaz077,b.aaz281,c.ape008 as ape008s ");
		sql.append(" from af73 a, Af53 b, af31 c ");
		sql.append(" where 1 = 1  and c.aaz318 = b.aaz318  and b.aaz281 = a.aaz281  and c.aaz010 = a.aaz010  ");
		if (null != queryDto.getApa701() && !"".equals(queryDto.getApa701())) {
			sql.append(" and c.apa701='"+queryDto.getApa701()+"'");
		}
		if (null != queryDto.getApa709() && !"".equals(queryDto.getApa709())) {
			sql.append(" and a.apa709 = "+queryDto.getApa709()+" ");
		}
		if (null != queryDto.getApe139() && !"".equals(queryDto.getApe139())) {
			sql.append(" and a.ape139 = "+queryDto.getApe139()+" ");
		}
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and a.ape711>=to_date('" + queryDto.getApe711s() + "','yyyy-mm-dd')");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and a.ape711<=to_date('" + queryDto.getApe711e() + "','yyyy-mm-dd')");
		}
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}



	public Page queryBreAuditCount(Page page, Af73DTO queryDto) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select af73.apa709 ,af73.aaa027,af31.apa701 , ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,0,decode(APE139,0,1,0))) dsb, ");
		sql.append(" sum(decode(APE139,1,1,0)) dsp, sum(decode(APE139,2,1,0)) spbtg,sum(decode(APE139,3,1,0)) sptg, ");
		sql.append(" sum(decode(APE139,4,1,0)) wg,sum(decode(APE139,5,1,0)) zf,sum(decode(APE139,6,1,0)) clsc, ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,decode(APE139,0,1,0),0)) cswsb ");
		sql.append("  from af73, af32,af31 where af73.aaz281 = af32.aaz281  and af31.aaz077=af73.aaz077  ");
		if (null != queryDto.getAaa027() && !"".equals(queryDto.getAaa027())) {
			sql.append(" and af73.aaa027='"+queryDto.getAaa027()+"'");
		}
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and af73.ape727>=to_number(replace('" + queryDto.getApe711s() + "','-','')) ");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and af73.ape727<=to_number(replace('" + queryDto.getApe711e() + "','-','')) ");
		}
		sql.append(" group by af73.aaa027, af73.apa709,af32.apa165,af31.apa701 ");
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}

	public Page queryOrgAuditCount(Page page, Af73DTO queryDto) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select af31.ape008,af73.aaa027, af73.apa709,af31.apa701, ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,0,decode(APE139,0,1,0))) dsb, ");
		sql.append(" sum(decode(APE139,1,1,0)) dsp, sum(decode(APE139,2,1,0)) spbtg,sum(decode(APE139,3,1,0)) sptg, ");
		sql.append(" sum(decode(APE139,4,1,0)) wg,sum(decode(APE139,5,1,0)) zf,sum(decode(APE139,6,1,0)) clsc, ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,decode(APE139,0,1,0),0)) cswsb ");
		sql.append("  from af73, af32 ,af31 where af73.aaz281 = af32.aaz281  and af31.aaz077=af73.aaz077  and af73.apa709=3  ");
		if (null != queryDto.getAaa027() && !"".equals(queryDto.getAaa027())) {
			sql.append(" and af73.aaa027='"+queryDto.getAaa027()+"'");
		}
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and af73.ape727>=to_number(replace('" + queryDto.getApe711s() + "','-','')) ");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and af73.ape727<=to_number(replace('" + queryDto.getApe711e() + "','-','')) ");
		}
		sql.append(" group by af31.ape008,af73.aaa027, af73.apa709,af31.apa701 ");
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}

	public Page queryDoctorAuditCount(Page page, Af73DTO queryDto) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select af73.aaz107,af31.ape008,af73.aaa027, af73.APA709,af31.apa701 , ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,0,decode(APE139,0,1,0))) dsb, ");
		sql.append(" sum(decode(APE139,1,1,0)) dsp, sum(decode(APE139,2,1,0)) spbtg,sum(decode(APE139,3,1,0)) sptg, ");
		sql.append(" sum(decode(APE139,4,1,0)) wg,sum(decode(APE139,5,1,0)) zf,sum(decode(APE139,6,1,0)) clsc, ");
		sql.append(" sum(decode( sign(to_char(to_date(af73.ape727, 'yyyy-MM-dd') + (select aaa005 from aa01 where aaa001 = 'SSQX') + 1,'yyyymmdd') - to_char(sysdate,'yyyymmdd')),-1,decode(APE139,0,1,0),0)) cswsb ");
		sql.append("  from af73, af32 ,af31 where af73.aaz281 = af32.aaz281  and af31.aaz077=af73.aaz077  and af73.apa709=2  ");
		if (null != queryDto.getAaa027() && !"".equals(queryDto.getAaa027())) {
			sql.append(" and af73.aaa027='"+queryDto.getAaa027()+"'");
		}
		if (null != queryDto.getApe711s() && !"".equals(queryDto.getApe711s())) {
			sql.append(" and af73.ape727>=to_number(replace('" + queryDto.getApe711s() + "','-','')) ");
		}
		if (null != queryDto.getApe711e() && !"".equals(queryDto.getApe711e())) {
			sql.append(" and af73.ape727<=to_number(replace('" + queryDto.getApe711e() + "','-','')) ");
		}
		sql.append(" group by af73.aaz107,af31.ape008,af73.aaa027, af73.APA709,af31.apa701 ");
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af73DTO.class);
		return result;
	}

	public Kf65DTO saveKf65Message(Kf65DTO tgDto) {
		Integer count = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf65 where aaz263='"+tgDto.getAaz263()+"' and baz046<>'"
						+ tgDto.getBaz046() + "' and aae016=0 ", Integer.class);
		if (count >= 1) {
			throw new BusinessException("该用户有待审核未处理");
		}
		Kf65 kf65 = new Kf65();
		BeanTools.copyPropertiesIgnoreNull(tgDto, kf65);
		String BAZ046 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ046");
		String AAZ263 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ263");
		kf65.setBaz046(BAZ046);
		kf65.setAaz263(AAZ263);
		UserContext user=BusinessContextUtils.getUserContext();
		kf65.setAae011(user.getOperatorName());
		kf65.setAae036(new Date());
		kf65.setAae100("1");
		kf65.setAae016("0");
		kf65.setApa120("1");
		CommonHibernateDaoUtils.save(kf65);
		return tgDto;
	}

	public Kf06DTO findKf06UpdateMessage(String aaz307) {
		Kf06DTO tgDto = new Kf06DTO();
		Kf06 kf06 = CommonHibernateDaoUtils.load(Kf06.class, aaz307);
		Kb01 kb01 = CommonHibernateDaoUtils.load(Kb01.class, kf06.getAaz107());
		Kf66 kf66 =CommonJdbcDaoUtils.get(" select * from kf66 where aae016=0 and aaz307='"+kf06.getAaz307()+"'", Kf66.class);
		if (kb01 != null) {
			BeanTools.copyProperties(kb01, tgDto);
		}
		if (kf06 != null) {
			BeanTools.copyProperties(kf06, tgDto);
		}
		if (kf66 != null) {
			BeanTools.copyProperties(kf66, tgDto);
		}
		tgDto.setAaz307(aaz307);
		return tgDto;
	}

	public void updateKf66(Kf66DTO tgDto) {
		if (StringTools.hasText(tgDto.getBaz047())) {
			Integer count = CommonJdbcDaoUtils.queryObject(
					"select count(*) from kf66 where aae386='"+tgDto.getAae386()+"' and baz047<>'"
							+ tgDto.getBaz047() + "' and aae016=0 and aae100=1", Integer.class);
			if (count >= 1) {
				throw new BusinessException("科室名称已经存在");
			}
			Integer count2 = CommonJdbcDaoUtils.queryObject(
					"select count(*) from kf06 where aae386='"+tgDto.getAae386()+"' and aae100=1 and aaz307<>'"+tgDto.getAaz307()+"'", Integer.class);
			if (count2 >= 1) {
				throw new BusinessException("科室名称已经存在");
			}
			Kf66 kf66 = CommonHibernateDaoUtils.load(Kf66.class, tgDto.getBaz047());
			kf66.setAae386(tgDto.getAae386());
			kf66.setAkf015(tgDto.getAkf015());
			kf66.setAkf001(tgDto.getAkf001());
			CommonHibernateDaoUtils.update(kf66);
			return;
		}else {
			if (StringTools.hasText(tgDto.getBaz047())) {
				Integer count = CommonJdbcDaoUtils.queryObject(
						"select count(*) from kf66 where aae386='"+tgDto.getAae386()+"' and baz047<>'"
								+ tgDto.getBaz047() + "' and aae016=0 and aae100=1", Integer.class);
				if (count >= 1) {
					throw new BusinessException("科室名称已经存在");
				}
			}
			Integer count2 = CommonJdbcDaoUtils.queryObject(
					"select count(*) from kf06 where aae386='"+tgDto.getAae386()+"' and aae100=1 and aaz307<>'"+tgDto.getAaz307()+"'", Integer.class);
			if (count2 >= 1) {
				throw new BusinessException("科室名称已经存在");
			}
			Kf66 kf66 = new Kf66();
			BeanTools.copyPropertiesIgnoreNull(tgDto, kf66);
			String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ047");
			kf66.setBaz047(id);
			UserContext user=BusinessContextUtils.getUserContext();
			kf66.setAae011(user.getOperatorName());
			kf66.setAae036(new Date());
			kf66.setAae100("1");
			kf66.setAae016("0");
			kf66.setApa120("2");
			CommonHibernateDaoUtils.save(kf66);
		}
	}

	public F10502001VO AuditPass(F10502001VO resultVO) {
		if (resultVO.getAaz107() == null) {
			throw new BusinessException("AuditComplaintBS-01:传入Aaz107为空!");
		}
		Kb01 kb01 =CommonJdbcDaoUtils.get(" select * from kb01 where aaz107="+resultVO.getAaz107()+" ", Kb01.class);
		kb01.setAab304(resultVO.getAab304());
		kb01.setAab062(resultVO.getAab062());
		kb01.setAae004(resultVO.getAae004());
		kb01.setAkf015(resultVO.getAkf015());
		kb01.setAae006(resultVO.getAae006());
		kb01.setAae005(resultVO.getAae005());
		kb01.setAae007(resultVO.getAae007());
		CommonHibernateDaoUtils.update(kb01);
		
		Kb41 kb41 =CommonJdbcDaoUtils.get(" select * from kb41 where aae016=0 and aaz107='"+resultVO.getAaz107()+"'", Kb41.class);
		kb41.setAae016("1");
		UserContext user=BusinessContextUtils.getUserContext();
		kb41.setAae012(user.getOperatorName());
		kb41.setAae034(new Date());
		CommonHibernateDaoUtils.update(kb41);
		return resultVO;
	}

	public F10502002VO loadAddMessage(F10502002VO f10502002vo) {
		Kb01 kb01=CommonHibernateDaoUtils.load(Kb01.class, f10502002vo.getAaz107());
		if (kb01!=null) {
			BeanTools.copyProperties(kb01, f10502002vo);
			f10502002vo.setAkf015(null);
		}
		return f10502002vo;
	}

	public Page queryKf06Message(Page page, F10502002VO queryDto) {
		StringBuffer sql=new StringBuffer(" select * from Kf06 where 1=1 and aae100='1' ");
		if (null != queryDto.getAae386() && !"".equals(queryDto.getAae386())) {
			sql.append(" and aae386 like'%"+queryDto.getAae386()+"%'");
		}
		if (null != queryDto.getAaz107() && !"".equals(queryDto.getAaz107())) {
			sql.append(" and aaz107='"+queryDto.getAaz107()+"' ");
		}
		if (null != queryDto.getAkf001() && !"".equals(queryDto.getAkf001())) {
			sql.append(" and akf001 ='"+queryDto.getAkf001()+"'");
		}
		Page result=CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Kf06.class);
		return result;
	}

	public Page queryKf05Message(Page page, Kf65DTO Kf65Dto) {
		StringBuffer sql = new StringBuffer();
		 sql.append("select a.*,b.aae386,c.akb021 from Kf05 a,Kf06 b,Kb01 c where 1=1 and a.aaz107=c.aaz107 and a.aaz307=b.aaz307 " );
		
		 if (!StringUtils.isEmpty(Kf65Dto.getAaz307())) {
			sql.append("and a.aaz307 = '" + Kf65Dto.getAaz307() + "' ");
		}
		if (!StringUtils.isEmpty(Kf65Dto.getAac003())) {
			sql.append("and a.aac003 = '" + Kf65Dto.getAac003() + "' ");
		}
		if (!StringUtils.isEmpty(Kf65Dto.getAkc049())) {
			sql.append("and a.akc049 = '" + Kf65Dto.getAkc049() + "' ");
		}

		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kf65DTO.class);
	}

	public F10502002VO auditPassks(F10502002VO resultVO) {
		Kf66 kf66=CommonHibernateDaoUtils.load(Kf66.class, resultVO.getBaz047());
		if ("1".equals(resultVO.getApa120())) {
			Kf06 kf06 =new Kf06();
			BeanTools.copyProperties(kf66, kf06);
			CommonHibernateDaoUtils.save(kf06);
			kf66.setAae016("1");
			CommonHibernateDaoUtils.update(kf66);
		}else if("2".equals(resultVO.getApa120())){
			Kf06 kf06=CommonHibernateDaoUtils.load(Kf06.class, kf66.getAaz307());
			BeanTools.copyProperties(kf66, kf06);
			CommonHibernateDaoUtils.update(kf06);
			kf66.setAae016("1");
			CommonHibernateDaoUtils.update(kf66);
		}else if("3".equals(resultVO.getApa120())){
			Kf06 kf06=CommonHibernateDaoUtils.load(Kf06.class, kf66.getAaz307());
			kf06.setAae100("0");
			CommonHibernateDaoUtils.update(kf06);
			kf66.setAae016("1");
			CommonHibernateDaoUtils.update(kf66);
		}
		return resultVO;
	}

	public F10502002VO auditNotPassks(F10502002VO resultVO) {
		Kf66 kf66=CommonHibernateDaoUtils.load(Kf66.class, resultVO.getBaz047());
		kf66.setAae016("2");
		CommonHibernateDaoUtils.update(kf66);
		return resultVO;
	}

	public F10502003VO loadUpdateMessage(F10502003VO f10502003vo) {
		Kf05 kf05=CommonHibernateDaoUtils.load(Kf05.class, f10502003vo.getAaz107());
		if (kf05!=null) {
			BeanTools.copyProperties(kf05, f10502003vo);
//			f10502003vo.setAkf015(null);
		}
		return f10502003vo;
	}

	public Kf05DTO find(String aaz263) {
		Kf05DTO kf05dto = new  Kf05DTO();
		Kf05 kf05=CommonJdbcDaoUtils.get("select a.akb021,b.* from Kb01 a,kf05 b where 1=1 and a.aaz107=b.aaz107 and b.aaz263='"+aaz263+"'", Kf05.class);
		if(kf05!=null){
			BeanTools.copyProperties(kf05, kf05dto);
		}
		
		return kf05dto;
	}

	public void deleteKf05ById(String aaz263) {
		Kf05 kf05=CommonHibernateDaoUtils.load(Kf05.class, aaz263);
		CommonHibernateDaoUtils.getCommonHibernateDao().delete(kf05);
	}

	public F10502002VO deleteKf06Message(F10502002VO resultVO) {
		Kf06 kf06=CommonHibernateDaoUtils.load(Kf06.class, resultVO.getAaz307());
		Kf66 kf66=CommonJdbcDaoUtils.get("select * from Kf66 where 1=1 and aae100='1' and aae016='0' and aaz307='"+resultVO.getAaz307()+"' ", Kf66.class);
		if (kf66!=null) {
			throw new BusinessException("科室维护信息未审批不允许删除");
		}
		Integer count = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf05 where aaz307='"+resultVO.getAaz307()+"' and aae100=1  ", Integer.class);
		if (count >= 1) {
			throw new BusinessException("科室下有医护人员不允许删除");
		}
		Integer count2 = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf65 where aaz307='"+resultVO.getAaz307()+"' and aae100=1 and aae016='0' ", Integer.class);
		if (count2 >= 1) {
			throw new BusinessException("科室下有带审批的医护人员不允许删除");
		}
		Kf66 dbkf66=new Kf66();
		BeanTools.copyProperties(kf06, dbkf66);
		UserContext user=BusinessContextUtils.getUserContext();
		dbkf66.setAae011(user.getOperatorName());
		dbkf66.setAae036(new Date());
		dbkf66.setAae100("1");
		dbkf66.setAae016("0");
		dbkf66.setApa120("3");
		dbkf66.setBaz047(CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ047"));
		CommonHibernateDaoUtils.save(dbkf66);
		return resultVO;
	}

	public F10502003VO auditPassys(F10502003VO resultVO) {
		Kf65 kf65=CommonHibernateDaoUtils.load(Kf65.class, resultVO.getBaz046());
		if ("1".equals(resultVO.getApa120())) {
			Kf05 kf05 =new Kf05();
			BeanTools.copyProperties(kf65, kf05);
			String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ263");
			kf65.setAaz263(id);
			CommonHibernateDaoUtils.save(kf05);
			kf65.setAae016("1");
			CommonHibernateDaoUtils.update(kf65);
		}else if("2".equals(resultVO.getApa120())){
			Kf05 kf05=CommonHibernateDaoUtils.load(Kf05.class, kf65.getAaz263());
			BeanTools.copyProperties(kf65, kf05);
			CommonHibernateDaoUtils.update(kf05);
			kf65.setAae016("1");
			CommonHibernateDaoUtils.update(kf65);
		}else if("3".equals(resultVO.getApa120())){
			Kf05 kf05=CommonHibernateDaoUtils.load(Kf05.class, kf65.getAaz263());
			kf05.setAae100("0");
			CommonHibernateDaoUtils.update(kf05);
			kf65.setAae016("1");
			CommonHibernateDaoUtils.update(kf65);
		}
		return resultVO;
	}

	public F10502003VO auditNotPassys(F10502003VO resultVO) {
		if (resultVO.getBaz046() == null||"".equals(resultVO.getBaz046())) {
			throw new BusinessException("AuditComplaintBS-10:传入Baz046为空!");
		}
		Kf65 kf65=CommonHibernateDaoUtils.load(Kf65.class, resultVO.getBaz046());
		kf65.setAae016("2");
		CommonHibernateDaoUtils.update(kf65);
		return resultVO;
	}

	public void updateKf65(Kf65DTO tgDto) {
		if (StringTools.hasText(tgDto.getBaz046())) {
			Integer count = CommonJdbcDaoUtils.queryObject(
					"select count(*) from kf65 where aac003='"+tgDto.getAac003()+"' and baz046<>'"
							+ tgDto.getBaz046() + "' and aae016=0 and aae100=1", Integer.class);
			if (count >= 1) {
				throw new BusinessException("医护人员姓名已经存在");
			}
			Integer count2 = CommonJdbcDaoUtils.queryObject(
					"select count(*) from kf05 where aac003='"+tgDto.getAac003()+"' and aae100=1 and aaz307<>'"+tgDto.getAaz307()+"'", Integer.class);
			if (count2 >= 1) {
				throw new BusinessException("医护人员姓名已经存在");
			}
			Kf65 kf65 = CommonHibernateDaoUtils.load(Kf65.class, tgDto.getBaz046());
			BeanTools.copyPropertiesIgnoreNull(tgDto, kf65);
			CommonHibernateDaoUtils.update(kf65);
			return;
		}else {
			if (StringTools.hasText(tgDto.getBaz046())) {
				Integer count = CommonJdbcDaoUtils.queryObject(
						"select count(*) from kf65 where aac003='"+tgDto.getAac003()+"' and baz046<>'"
								+ tgDto.getBaz046() + "' and aae016=0 and aae100=1", Integer.class);
				if (count >= 1) {
					throw new BusinessException("医护人员姓名已经存在");
				  }
				}
				Integer count2 = CommonJdbcDaoUtils.queryObject(
						"select count(*) from kf05 where aac003='"+tgDto.getAac003()+"' and aae100=1 and aaz307<>'"+tgDto.getAaz307()+"'", Integer.class);
				if (count2 >= 1) {
					throw new BusinessException("医护人员姓名已经存在");
				}
			Kf65 kf65 = new Kf65();
			BeanTools.copyPropertiesIgnoreNull(tgDto, kf65);
			String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ046");
			kf65.setBaz046(id);
			UserContext user=BusinessContextUtils.getUserContext();
			kf65.setAae011(user.getOperatorName());
			kf65.setAae036(new Date());
			kf65.setAae100("1");
			kf65.setAae016("0");
			kf65.setApa120("2");
			CommonHibernateDaoUtils.save(kf65);
		
	
		}
		
}

	public F10502001VO auditNotPassyy(F10502001VO resultVO) {
		if (resultVO.getBaz048() == null||"".equals(resultVO.getBaz048())) {
			throw new BusinessException("AuditComplaintBS-13:传入Baz048为空!");
		}
		Kb41 kb41=CommonHibernateDaoUtils.load(Kb41.class, resultVO.getBaz048());
		kb41.setAae016("2");
		CommonHibernateDaoUtils.update(kb41);
		return resultVO;
	}

	public F10502001VO auditPassyy(F10502001VO resultVO) {
		if (resultVO.getBaz048() == null||"".equals(resultVO.getBaz048())) {
			throw new BusinessException("AuditComplaintBS-14:传入Baz048为空!");
		}
		Kb41 kb41=CommonHibernateDaoUtils.load(Kb41.class, resultVO.getBaz048());
		Kb01 kb01=CommonHibernateDaoUtils.load(Kb01.class, kb41.getAaz107());
		kb01.setAab304(kb41.getAab304());
		kb01.setAab062(kb41.getAab062());
		kb01.setAae004(kb41.getAae004());
		kb01.setAkf015(kb41.getAkf015());
		kb01.setAae006(kb41.getAae006());
		kb01.setAae005(kb41.getAae005());
		kb01.setAae007(kb41.getAae007());
		CommonHibernateDaoUtils.update(kb01);
		kb41.setAae016("1");
		CommonHibernateDaoUtils.update(kb41);
		return resultVO;
	}

	public F10502003VO deleteKf05Message(F10502003VO resultVO) {
		Kf05 kf05=CommonHibernateDaoUtils.load(Kf05.class, resultVO.getAaz263());
		Integer count = CommonJdbcDaoUtils.queryObject(
				"select count(*) from kf65 where aaz263='"+resultVO.getAaz263()+"' and apa120='3' and aae016='0' ", Integer.class);
		if (count >= 1) {
			throw new BusinessException("已有待审核的该条删除信息");
		}
		Kf65 dbkf65=new Kf65();
		BeanTools.copyProperties(kf05, dbkf65);
		UserContext user=BusinessContextUtils.getUserContext();
		dbkf65.setAae011(user.getOperatorName());
		dbkf65.setAae036(new Date());
		dbkf65.setAae100("1");
		dbkf65.setAae016("0");
		dbkf65.setApa120("3");
		dbkf65.setBaz046(CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ046"));
		CommonHibernateDaoUtils.save(dbkf65);
		return resultVO;
	}
}

