package com.wondersgroup.bc.medicarecostaudit.medaudit.bs.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseKc24;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CountDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc24DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc72;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc73;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kd30;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kd33;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kd34;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke01;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FxTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyYyTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyZTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd30DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd33DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd34DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke01DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.MedDeductPlanDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.PmTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshMxTjDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.ZnshTjDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10201006.vo.F10201006VO;
import com.wondersgroup.local.k2.f10201006.vo.Kc62VO;
import com.wondersgroup.local.k2.f10202002.vo.F10202002VO;
import com.wondersgroup.local.k6.f10604001.vo.FyVO;
import com.wondersgroup.local.k6.f10604001.vo.PmVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class MedAuditBSImpl implements MedAuditBS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(
				" select a.* from kc63 a");
		if(StringTools.hasText(kc63Dto.getYbfgzflbm())){
			if(StringTools.hasText(kc63Dto.getYbgzflbm())){
				sql.append(",(select k2.baz001 from kc62 k2, kc72 k7 where k2.baz003 = k7.baz003 and k7.aaa168 ='"+kc63Dto.getYbgzflbm()+"' group by k2.baz001) t ");
			}else{
				sql.append(",(select k2.baz001 from kc62 k2, kc72 k7 where k2.baz003 = k7.baz003 and k7.aaa168 in (select ybgzflbm from  ybgz_ybgzfl where ybfgzflbm='"+kc63Dto.getYbfgzflbm()+"') group by k2.baz001) t ");
			}
		}
		if(StringTools.hasText(kc63Dto.getZsdmc())){
			sql.append(",(select k2.baz001 from kc72 k7,kc62 k2 where  k2.baz003 = k7.baz003 and k7.aaa168 in (select zsd.ybgzflbm from  ybgz_ybgzzsd zsd where zsd.zsdmc like '%"+kc63Dto.getZsdmc()+"%' group by zsd.ybgzflbm)) s");
		}
		sql.append(" where 1=1 ");
		if(StringTools.hasText(kc63Dto.getYbfgzflbm())){
			sql.append(" and t.baz001 = a.baz001");
		}
		if(StringTools.hasText(kc63Dto.getZsdmc())){
			sql.append(" and s.baz001 = a.baz001");
		}
		if (StringTools.hasText(kc63Dto.getBaz031())) {
			sql.append(" and a.baz031 = '" + kc63Dto.getBaz031() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getBaz021())) {
			sql.append(" and a.baz021 = '" + kc63Dto.getBaz021() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kc63Dto.getAaa027() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getAka130())) {
			sql.append(" and a.aka130 = '" + kc63Dto.getAka130() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getAkb020())) {
			sql.append(" and a.akb020 like '%" + kc63Dto.getAkb020() + "%' ");
		}
		if (StringTools.hasText(kc63Dto.getAkb021())) {
			sql.append(" and a.akb021 like '%" + kc63Dto.getAkb021() + "%' ");
		}
		if (StringTools.hasText(kc63Dto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + kc63Dto.getAaz263() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getBac003())) {
			sql.append(" and a.bac003 like '%" + kc63Dto.getBac003() + "%' ");
		}
		if (StringTools.hasText(kc63Dto.getAac003())) {
			sql.append(" and a.aac003 like '%" + kc63Dto.getAac003() + "%' ");
		}
		if (kc63Dto.getAkc194Start() != null) {
			sql.append(" and a.akc194 >= to_date('"
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194Start())
					+ "','yyyyMMdd')");
		}
		if (kc63Dto.getAkc194End() != null) {
			sql.append(" and a.akc194 <= to_date('"
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194End())
					+ "','yyyyMMdd')");
		}
		if (kc63Dto.getAc62Exist()) {
			sql.append(" and exists ( ");

			sql.append(" select 'x' from kc62 b where a.baz001 = b.baz001 ");

			if (kc63Dto.getAc62Baz031s() != null) {
				sql.append(" and b.baz031 in (");
				for (int i = 0; i < kc63Dto.getAc62Baz031s().length; i++) {
					sql.append("'" + kc63Dto.getAc62Baz031s()[i] + "'");
					if (i < kc63Dto.getAc62Baz031s().length - 1) {
						sql.append(",");
					}
				}

				sql.append(")");
			}

			sql.append(" )");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63.class);

		return result;

	}

	public Page queryKc73WithPage(Page page, Kc73DTO kc73Dto) {

		if (!StringTools.hasText(kc73Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-00:查询单据违规信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc73 where baz002 is not null ");

		sql.append(" and baz001 = '" + kc73Dto.getBaz001() + "' ");

		sql.append(" order by baz002");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc73.class);

		return result;

	}
	
	public List<Kc73DTO> queryKc73(Kc73DTO kc73Dto) {

		if (!StringTools.hasText(kc73Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-14:查询单据违规信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kc73 where baz002 is not null ");

		sql.append(" and baz001 = '" + kc73Dto.getBaz001() + "' ");

		sql.append(" order by baz002");

		List<Kc73DTO> list = CommonJdbcDaoUtils.query(sql.toString(),	Kc73DTO.class);

		return list;

	}

	public Page queryKc62WithPage(Page page, Kc62DTO kc62Dto) {

		if (!StringTools.hasText(kc62Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-01:查询单据明细信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc62 where baz003 is not null ");

		sql.append(" and baz001 = '" + kc62Dto.getBaz001() + "'");

		if (StringTools.hasText(kc62Dto.getBaz031())) {
			sql.append(" and baz031 = '" + kc62Dto.getBaz031() + "' ");
		}

		sql.append(" order by baz001,baz032 desc ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62.class);

		return result;
	}

	public Page queryKc72WithPage(Page page, Kc72DTO kc72Dto) {

		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("MedAuditBS-02:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc72.class);

		return result;
	}
	
	public List<Kc72DTO> queryKc72(Kc72DTO kc72Dto) {

		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("MedAuditBS-15:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		
		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),Kc72DTO.class);

		return list;
	}

	public Kc62DTO updateKc62(Kc62DTO kc62Dto) {

		if (kc62Dto == null) {
			throw new BusinessException("MedAuditBS-03:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62Dto.getBaz003())) {
			throw new BusinessException("MedAuditBS-04:传入参数kc62Dto主键为空!");
		}

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, kc62Dto
				.getBaz003());

		BeanTools.copyPropertiesIgnoreNull(kc62Dto, kc62);

		CommonHibernateDaoUtils.update(kc62);

		BeanTools.copyProperties(kc62, kc62Dto);

		return kc62Dto;

	}

	public Kc63DTO updateKc63(Kc63DTO kc63Dto) {

		if (kc63Dto == null) {
			throw new BusinessException("MedAuditBS-05:传入参数kc63Dto为空!");
		}

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-06:传入参数kc63Dto主键为空!");
		}

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, kc63Dto
				.getBaz001());

		BeanTools.copyPropertiesIgnoreNull(kc63Dto, kc63);

		CommonHibernateDaoUtils.update(kc63);

		BeanTools.copyProperties(kc63, kc63Dto);

		return kc63Dto;

	}

	public Kc62DTO getKc62ById(String baz003) {

		if (!StringTools.hasText(baz003)) {
			throw new BusinessException("MedAuditBS-07:传入baz003为空!");
		}

		Kc62DTO kc62Dto = new Kc62DTO();

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, baz003);

		if (kc62 != null) {
			BeanTools.copyProperties(kc62, kc62Dto);
		}

		return kc62Dto;

	}

	public Kc63DTO getKc63ById(String baz001) {

		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("MedAuditBS-08:传入baz001为空!");
		}

		Kc63DTO kc63Dto = new Kc63DTO();

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, baz001);

		if (kc63 != null) {
			BeanTools.copyProperties(kc63, kc63Dto);
		}

		return kc63Dto;

	}

	public List<Kc81DTO> queryKc81Info(Kc81DTO kc81Dto) {

		StringBuffer s = new StringBuffer(
				" select * from kc81 where baz005 is not null ");

		if (StringTools.hasText(kc81Dto.getBaz003())) {
			s.append(" and baz003 = '" + kc81Dto.getBaz003() + "' ");
		}

		if (StringTools.hasText(kc81Dto.getBaz001())) {
			s.append(" and baz001 = '" + kc81Dto.getBaz001() + "' ");
		}

		if (StringTools.hasText(kc81Dto.getBaz033())) {
			s.append(" and baz033 = '" + kc81Dto.getBaz033() + "' ");
		}

		if (StringTools.hasText(kc81Dto.getAae100())) {
			s.append(" and aae100 = '" + kc81Dto.getAae100() + "' ");
		}

		s.append(" order by baz005 desc ");
		
		List<Kc81DTO> list = CommonJdbcDaoUtils.query(s.toString(),
				Kc81DTO.class);

		return list;

	}

	public Kc81DTO saveKc81(Kc81DTO kc81Dto) {

		if (kc81Dto == null) {
			throw new BusinessException("MedAuditBS-09:传入kc81Dto为空!");
		}

		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81Dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);

		CommonHibernateDaoUtils.save(kc81);

		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;

	}

	public Kc81DTO updateKc81(Kc81DTO kc81Dto) {

		if (kc81Dto == null) {
			throw new BusinessException("MedAuditBS-10:传入参数kc81Dto为空!");
		}
		if (!StringTools.hasText(kc81Dto.getBaz005())) {
			throw new BusinessException("MedAuditBS-11:传入参数baz005为空!");
		}

		Kc81 kc81 = CommonHibernateDaoUtils.load(Kc81.class, kc81Dto
				.getBaz005());

		BeanTools.copyPropertiesIgnoreNull(kc81Dto, kc81);

		CommonHibernateDaoUtils.update(kc81);

		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;

	}

	public ZnshTjDTO queryZnshTj(String baz020, boolean isDay) {
		StringBuffer sql = new StringBuffer();
		if (isDay) {
			sql.append("select * from ");
			sql
					.append("(SELECT COUNT(1) AS dshCount FROM kc63 WHERE BAZ031 = '04' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') A,");
			sql
					.append("(SELECT COUNT(1) AS dshCount FROM kc63 WHERE BAZ031 = '08' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') B,");
			sql
					.append("(SELECT COUNT(1) AS hfCount FROM kc63 WHERE BAZ031 = '10' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') C,");
			sql
					.append("(SELECT COUNT(1) AS zjkkCount FROM kc63 WHERE BAZ021 = '1' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') D,");
			sql
					.append("(SELECT COUNT(1) AS dthshCount FROM kc63 WHERE BAZ021 = '2' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') E,");
			sql
					.append("(SELECT COUNT(1) AS rgdshCount FROM kc63 WHERE BAZ021 = '3' AND to_char(baz020,'yyyy-mm-dd') = '"
							+ baz020 + "') F");
		} else {
			sql.append("select * from ");
			
			sql.append("(SELECT COUNT(distinct kc62.baz001) AS dshcount FROM kc63,kc62 WHERE kc63.baz001 = kc62.baz001 ") ;
			sql.append(" and kc62.BAZ031 = '04' AND to_char(kc63.baz020,'yyyy-mm') = '" + baz020 + "') A,");
							
			sql.append("(SELECT COUNT(distinct kc62.baz001) AS sscount FROM kc63,kc62 WHERE kc63.baz001 = kc62.baz001 ");
			sql.append(" and kc62.BAZ031 = '08' AND to_char(kc63.baz020,'yyyy-mm') = '"+ baz020 + "') B,");
			
			sql.append("(SELECT COUNT(distinct kc62.baz001) AS hfcount FROM kc63,kc62 WHERE kc63.baz001 = kc62.baz001 ");
			sql.append(" and kc62.BAZ031 = '10' AND to_char(kc63.baz020,'yyyy-mm') = '"+ baz020 + "') C,");
			
			sql.append("(SELECT COUNT(1) AS zjkkcount FROM kc63 WHERE BAZ021 = '1' ");
			sql.append(" AND to_char(baz020,'yyyy-mm') = '"+ baz020 + "') D,");
			
			sql.append("(SELECT COUNT(1) AS dthshcount FROM kc63 WHERE BAZ021 = '2' ");
			sql.append(" AND to_char(baz020,'yyyy-mm') = '"+ baz020 + "') E,");
			
			sql.append("(SELECT COUNT(1) AS rgdshcount FROM kc63 WHERE BAZ021 = '3' ");
			sql.append(" AND to_char(baz020,'yyyy-mm') = '"+ baz020 + "') F, ");
			
			sql.append("(SELECT COUNT(1) AS zgzs FROM ka44) G, ");
			
			sql.append("(SELECT COUNT(1) AS qygzs FROM ka44 where ka44.aae100 = '1') H, ");
			
			sql.append("(select count(distinct kc72.AAA168) AS mxwgs from kc63,kc62,kc72 where kc63.baz001 = kc62.baz001 ");
			sql.append(" and kc62.baz003 = kc72.baz003 AND to_char(kc63.baz020,'yyyy-mm') = '"+ baz020 + "') I,");
			
			sql.append("(select count(distinct kc73.AAA168) AS djwgs from kc63,kc73 where kc63.baz001 = kc73.baz001 ");
			sql.append(" and to_char(kc63.baz020,'yyyy-mm') = '"+ baz020 + "') J ");
			
		}


		return (ZnshTjDTO) CommonJdbcDaoUtils.get(sql.toString(),
				ZnshTjDTO.class, new Object[] {});

	}

	/**
	 * 
	 * @Title: queryZnshMXTj
	 * @Description: 查询智能审核明细的统计情况
	 * @param @param baz020 智能审核时间
	 * @param @param isDay ture表示按年月日统计，false表示按照年月统计
	 * @param @param isYljg true表示按照医疗机构统计,false表示按照规则统计
	 * @param @param isHosp 0表示统计医院和药店,1表示统计医院,-1表示统计药店
	 * @param @return 设定文件
	 * @return ZnshMxTjDTO 返回类型
	 * @throws
	 * @author chenlin
	 * @date 2014-7-21 下午03:17:32
	 */
	public Page queryZnshMXTj(Page page,String baz020, boolean isDay,
			boolean isYljg, int isHosp) {
		StringBuffer sql = new StringBuffer();
		/**
		 * isDay为true表示按照日来统计，false表示按照月来统计
		 */
		if (isDay) {
			/**
			 * isYljg为ture表示按照医疗机构来统计，为false表示按照规则来统计
			 */
			if (isYljg) {
				/**
				 * 大于0表示医院,小于0表示药店,等于0表示医院和药店
				 */
				sql.append("SELECT akb021,"
								+ "COUNT(CASE WHEN baz031 = '03' THEN 1 ELSE NULL END) AS cscount,"
								+ "COUNT(CASE WHEN baz031 = '06' OR baz031 = '07' THEN 1 ELSE NULL END) AS fscount,"
								+ "COUNT(CASE WHEN baz031 = '08' THEN 1 ELSE NULL END) AS fycount "
								+ "FROM KC63 where to_char(baz020,'yyyy-mm-dd') = '"
								+ baz020 + "' ");
				if (isHosp > 0) {
					sql.append(" and AKB022 = '1'");
				} else if (isHosp < 0) {
					sql.append(" and AKB022 = '2'");
				} else {

				}
				sql.append(" group by akb021");
			} else {
				sql.append("SELECT B.AAA167, "
								+ "COUNT(CASE WHEN A.baz031 = '03' THEN 1 ELSE NULL END) AS cscount,"
								+ "COUNT(CASE WHEN A.baz031 = '06' OR A.baz031 = '07' THEN 1 ELSE NULL END) AS fscount,"
								+ "COUNT(CASE WHEN A.baz031 = '08' THEN 1 ELSE NULL END) AS fycount "
								+ "FROM kc63 A , kc73 B WHERE A.baz001 = B.BAZ001 and to_char(A.baz020,'yyyy-mm-dd') = '"
								+ baz020 + "' ");
				if (isHosp > 0) {
					sql.append(" and A.AKB022 = '1'");
				} else if (isHosp < 0) {
					sql.append(" and A.AKB022 = '2'");
				} else {

				}
				sql.append(" group by B.AAA167");
			}
		} else {
			/**
			 * isYljg为ture表示按照医疗机构来统计，为false表示按照规则来统计
			 */
			if (isYljg) {
				/**
				 * 大于0表示医院,小于0表示药店,等于0表示医院和药店
				 */
				sql.append("SELECT akb021,"
								+ "COUNT(CASE WHEN baz031 = '03' THEN 1 ELSE NULL END) AS cscount,"
								+ "COUNT(CASE WHEN baz031 = '06' OR baz031 = '07' THEN 1 ELSE NULL END) AS fscount,"
								+ "COUNT(CASE WHEN baz031 = '08' THEN 1 ELSE NULL END) AS fycount "
								+ "FROM KC63 where to_char(baz020,'yyyy-mm') = '"
								+ baz020 + "' ");
				if (isHosp > 0) {
					sql.append(" and AKB022 = '1'");
				} else if (isHosp < 0) {
					sql.append(" and AKB022 = '2'");
				} else {

				}
				sql.append(" group by akb021");
			} else {
				sql.append("SELECT B.AAA167, "
								+ "COUNT(CASE WHEN A.baz031 = '03' THEN 1 ELSE NULL END) AS cscount,"
								+ "COUNT(CASE WHEN A.baz031 = '06' OR A.baz031 = '07' THEN 1 ELSE NULL END) AS fscount,"
								+ "COUNT(CASE WHEN A.baz031 = '08' THEN 1 ELSE NULL END) AS fycount "
								+ "FROM kc63 A , kc73 B WHERE A.baz001 = B.BAZ001 and to_char(A.baz020,'yyyy-mm') = '"
								+ baz020 + "' ");
				if (isHosp > 0) {
					sql.append(" and A.AKB022 = '1'");
				} else if (isHosp < 0) {
					sql.append(" and A.AKB022 = '2'");
				} else {

				}
				sql.append(" group by B.AAA167");

			}
		}

		//System.out.println(sql);
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), ZnshMxTjDTO.class, new Object[]{});
	}

	public List<Ke01DTO> queryKe01Info(Ke01DTO ke01dto) {
		
		if (ke01dto == null) {
			throw new BusinessException("MedAuditBS-12:传入参数ke01dto为空!");
		}
		
		StringBuffer s = new StringBuffer(" select * from ke01 where baz006 is not null ");

		if (StringTools.hasText(ke01dto.getBaz005())) {
			s.append(" and baz005 = '" + ke01dto.getBaz005() + "' ");
		}
		if (StringTools.hasText(ke01dto.getBaz003())) {
			s.append(" and baz003 = '" + ke01dto.getBaz003() + "' ");
		}

		s.append(" order by baz006 ");

		List<Ke01DTO> list = CommonJdbcDaoUtils.query(s.toString(),	Ke01DTO.class);

		return list;
		
	}

	public Ke01DTO saveKe01(Ke01DTO ke01Dto) {
		
		if (ke01Dto == null) {
			throw new BusinessException("MedAuditBS-13:传入Ke01Dto为空!");
		}

		Ke01 ke01 = new Ke01();

		BeanTools.copyProperties(ke01Dto, ke01);
		
		String baz006 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ006");
		
		ke01.setBaz006(baz006);

		CommonHibernateDaoUtils.save(ke01);

		BeanTools.copyProperties(ke01, ke01Dto);

		return ke01Dto;
	}

	public Kd30DTO saveKd30(Kd30DTO kd30Dto) {
		
		if (kd30Dto == null) {
			throw new BusinessException("MedAuditBS-16:传入Kd30Dto为空!");
		}

		Kd30 kd30 = new Kd30();

		BeanTools.copyProperties(kd30Dto, kd30);
		
		String baz007 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ007");
		
		kd30.setBaz007(baz007);
		
		CommonHibernateDaoUtils.save(kd30);

		BeanTools.copyProperties(kd30, kd30Dto);

		return kd30Dto;
		
	}

	public Page queryKd30WithPage(Page page, Kd30DTO kd30Dto) {
		
		if (!StringTools.hasText(kd30Dto.getAaa027())) {
			throw new BusinessException("MedAuditBS-17:查询扣款计划信息传入aaa027为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kd30 where baz007 is not null ");
		
		sql.append(" and aaa027 = '" + kd30Dto.getAaa027() + "' ");
		
		if(StringTools.hasText(kd30Dto.getBaz007())){
			sql.append(" and baz007 = '"+kd30Dto.getBaz007()+"'");
		}
		
		if(kd30Dto.getAae002() != null && kd30Dto.getAae002() != 0){
			sql.append(" and aae002 = " + kd30Dto.getAae002());
		}
		
		sql.append(" order by baz007 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kd30.class);

		return result;
		
	}

	public Page queryKd33WithPage(Page page, Kd33DTO kd33Dto) {
		
		if (!StringTools.hasText(kd33Dto.getBaz007())) {
			throw new BusinessException("MedAuditBS-18:查询医院扣款计划传入baz007为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kd33 where baz008 is not null ");
		
		sql.append(" and baz007 = '" + kd33Dto.getBaz007() + "' ");
		
		sql.append(" order by baz008 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kd33.class);

		return result;
		
	}

	public Page queryKd34WithPage(Page page, Kd34DTO kd34Dto) {
		
		if (!StringTools.hasText(kd34Dto.getBaz008())) {
			throw new BusinessException("MedAuditBS-19:查询医院扣款计划传入baz008为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kd34 where baz009 is not null ");
		
		sql.append(" and baz008 = '" + kd34Dto.getBaz008() + "' ");
		
		sql.append(" order by baz009 ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kd34.class);

		return result;
		
	}

	public void saveMedDeductPlan(MedDeductPlanDTO medDeductPlanDto) {
		
		if(!StringTools.hasText(medDeductPlanDto.getBaz007())){
			throw new BusinessException("MedAuditBS-20:生成扣款计划传入baz007为空!");
		}
		
		CommonHibernateDaoUtils.executeStoreProcedure(
				"PKG_MED_BENEFIT.MEDDEDUCTGENERATOR",medDeductPlanDto);
		
		if (medDeductPlanDto.getRetcode().intValue() != 0) {
			throw new BusinessException(medDeductPlanDto.getErrmsg());
		}
		
	}

	public Page queryKc63HosMedCountWithPage(Page page, Kc63DTO kc63Dto) {
		
		StringBuffer sql = new StringBuffer(" select a.akb020, a.akb021, count(a.baz001) as count ");
		
		sql.append(" from kc63 a where a.baz001 is not null ");

		if (StringTools.hasText(kc63Dto.getBaz031())) {
			sql.append(" and a.baz031 = '" + kc63Dto.getBaz031() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + kc63Dto.getAaa027() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getAkb020())) {
			sql.append(" and a.akb020 like '%" + kc63Dto.getAkb020() + "%' ");
		}
		if (StringTools.hasText(kc63Dto.getAkb021())) {
			sql.append(" and a.akb021 like '%" + kc63Dto.getAkb021() + "%' ");
		}
		if (kc63Dto.getAkc194Start() != null) {
			sql.append(" and a.akc194 >= to_date('"
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194Start())
					+ "','yyyyMMdd')");
		}
		if (kc63Dto.getAkc194End() != null) {
			sql.append(" and a.akc194 <= to_date('"
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194End())
					+ "','yyyyMMdd')");
		}
		if (kc63Dto.getAc62Exist()) {
			
			sql.append(" and exists ( ");
		
			sql.append(" select 'x' from kc62 b where a.baz001 = b.baz001 ");
		
			if (kc63Dto.getAc62Baz031s() != null) {
				sql.append(" and b.baz031 in (");
				for (int i = 0; i < kc63Dto.getAc62Baz031s().length; i++) {
					sql.append("'" + kc63Dto.getAc62Baz031s()[i] + "'");
					if (i < kc63Dto.getAc62Baz031s().length - 1) {
						sql.append(",");
					}
				}
		
				sql.append(")");
			}
		
			sql.append(" )");
		}
		
		sql.append(" group by a.akb020, a.akb021 ");
		sql.append(" order by akb020 ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Kc63DTO.class);
		
		return result;
		
	}

	public Kc24DTO getKc24ById(String aaz308) {
		if (!StringTools.hasText(aaz308)) {
			throw new BusinessException("MedAuditBS-30:传入aaz308为空!");
		}

		Kc24DTO kc24Dto = new Kc24DTO();

		BaseKc24 kc24 = CommonHibernateDaoUtils.load(BaseKc24.class,aaz308);

		if (kc24 != null) {
			BeanTools.copyProperties(kc24, kc24Dto);
		}

		return kc24Dto;
		
	}

	public List<Kc21DTO> queryKc21Info(Kc21DTO queryDto) {
		if (!StringTools.hasText(queryDto.getAaz217())) {
			throw new BusinessException("MedAuditBS-31:查询就诊信息传入Aaz217为空!");
		}

		StringBuffer sql = new StringBuffer(" select * from kc21 where aaz217 is not null ");

		sql.append(" and aaz217 = '" + queryDto.getAaz217() + "' ");

		sql.append(" order by aaz217");

		List<Kc21DTO> list = CommonJdbcDaoUtils.query(sql.toString(),Kc21DTO.class);

		return list;
	}

	
	public Page queryFyTempWithPage(Page page, FyTempDTO fyTempDTO) {
		
		StringBuffer sql = new StringBuffer(" select * from fy_temp a where 1 = 1 ");
		
		//医院等级 jb
		if(StringTools.hasText(fyTempDTO.getJb())){
			
			sql.append(" and a.jb = '" + fyTempDTO.getJb() + "'");
		}
		
		//病种类型 lx
		if(StringTools.hasText(fyTempDTO.getLx())){
			
			sql.append(" and a.lx = '" + fyTempDTO.getLx() + "'");
		}
				
		Page result = CommonJdbcDaoUtils.queryWithPage( page , sql.toString() , FyTempDTO.class);
		
		return result;
	}

	public Page queryfyZTempWithPage(Page page, FyZTempDTO fyZTempDTO) {
		
		StringBuffer sql = new StringBuffer(" select * from fy_z_temp a where 1 = 1 ");
		
		//病种类型 lx
		if(StringTools.hasText(fyZTempDTO.getLx())){
			
			sql.append(" and a.lx = '" + fyZTempDTO.getLx() + "'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage( page , sql.toString() , FyZTempDTO.class);
		
		return result;
	}

	public List<FyVO> queryPie(FyVO fyVO) {
		StringBuffer sql = new StringBuffer("");
		sql.append(" select * from fy_temp a where 1 = 1 ");
		//医院等级 jb
		if(StringTools.hasText(fyVO.getJb())){
			sql.append(" and a.jb = '" + fyVO.getJb() + "'");
		}
		//病种类型 lx
		if(StringTools.hasText(fyVO.getLx())){
			
			sql.append(" and a.lx = '" + fyVO.getLx() + "'");
		}
		return CommonJdbcDaoUtils.query(sql.toString(), FyVO.class);
	}

	public Page queryPmTempWithPage(Page page, PmTempDTO pmTempDTO) {
		
		StringBuffer sql = new StringBuffer(" select * from pm_temp a where 1 = 1 ");
		
		//项目类别xmlb
		if(StringTools.hasText(pmTempDTO.getXmlb())){
			sql.append(" and a.xmlb = '" + pmTempDTO.getXmlb() + "'");
		}
		
		//病种类型 lx
		if(StringTools.hasText(pmTempDTO.getLx())){
			sql.append(" and a.lx = '" + pmTempDTO.getLx() + "'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage( page , sql.toString() , PmTempDTO.class);
		
		return result;
	}

	public Page queryFxTempXbWithPage(Page page, FxTempDTO fxTempDto) {
		
		StringBuffer sql = new StringBuffer(" select * from fx_temp a where a.xb is not null ");
		
		//类型 lx
		if(StringTools.hasText(fxTempDto.getLx())){
			sql.append(" and a.lx = '" + fxTempDto.getLx() + "'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), FxTempDTO.class);
		
		return result;
	}

	public Page queryfxTempNldWithPage(Page page, FxTempDTO fxTempDto) {
		
		StringBuffer sql = new StringBuffer(" select * from fx_temp a where a.nld is not null ");
		
		//类型 lx
		if(StringTools.hasText(fxTempDto.getLx())){
			sql.append(" and a.lx = '" + fxTempDto.getLx() + "'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), FxTempDTO.class);
		
		return result;
	}

	public List<PmVO> queryColumn(PmVO pmVO) {
		StringBuffer sql = new StringBuffer("");
		sql.append(" select * from pm_temp a where 1 = 1 ");
		//医院等级 jb
		if(StringTools.hasText(pmVO.getXmlb())){
			sql.append(" and a.xmlb = '" + pmVO.getXmlb() + "'");
		}
		//病种类型 lx
		if(StringTools.hasText(pmVO.getLx())){
			
			sql.append(" and a.lx = '" + pmVO.getLx() + "'");
		}
		sql.append(" and rownum<=10 order by pc desc  ");
		return CommonJdbcDaoUtils.query(sql.toString(), PmVO.class);
	}
	
	
	public List<FxTempDTO> queryFxList(FxTempDTO fxTempDto){
		
		StringBuffer sql = new StringBuffer(" select * from fx_temp a where a.nld is not null ");
		
		//病种类型 lx
		if(StringTools.hasText(fxTempDto.getLx())){
			sql.append(" and a.lx = '" + fxTempDto.getLx() + "'");
		}
		
		List<FxTempDTO> list = CommonJdbcDaoUtils.query(sql.toString(), FxTempDTO.class);
		
		return list;
	}

	public Page queryFyYyTempWithPage(Page page, FyYyTempDTO fyYyTempDto) {
		
		StringBuffer sql = new StringBuffer(" select * from fy_yy_temp a where 1 = 1 ");
		
		//jb
		if(StringTools.hasText(fyYyTempDto.getJb())){
			sql.append(" and a.jb = '" + fyYyTempDto.getJb() + "'");
		}
		
		//lx
		if(StringTools.hasText(fyYyTempDto.getLx())){
			sql.append(" and a.lx = '" + fyYyTempDto.getLx() + "'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), FyYyTempDTO.class);
		
		return result;
	}
	
	public List<FyYyTempDTO> queryFyYyTempList(FyYyTempDTO fyYyTempDTO){
		
		StringBuffer sql = new StringBuffer(" select * from fy_yy_temp a where 1 = 1 ");
		
		//jb
		if(StringTools.hasText(fyYyTempDTO.getJb())){
			sql.append(" and a.jb = '" + fyYyTempDTO.getJb() + "'");
		}
		//lx
		if(StringTools.hasText(fyYyTempDTO.getLx())){
			sql.append(" and a.lx = '" + fyYyTempDTO.getLx() + "'");
		}
		
		List<FyYyTempDTO> list = CommonJdbcDaoUtils.query(sql.toString(), FyYyTempDTO.class);
		
		return list;
	}

	public List<CountDTO> getF10202002Chart(F10202002VO f10202002vo) {
		StringBuffer sql=new StringBuffer();
		sql.append(" select count(t.baz003) as value,t.aaa167 as label,t.aaa168 as sum_text from kc72 t, kc62 t2, kc63 t3 where t.baz003=t2.baz003 and t2.baz001=t3.baz001 ");
		if (StringTools.hasText(f10202002vo.getAkc194s())) {
			sql.append(" and t3.akc194>=to_date('"+f10202002vo.getAkc194s()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAkc194e())) {
			sql.append(" and t3.akc194<=to_date('"+f10202002vo.getAkc194e()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAka130())) {
			if ("1".equals(f10202002vo.getAka130())) {
				sql.append("");
			}else if ("2".equals(f10202002vo.getAka130())) {
				sql.append("");
			}
		}
		sql.append(" group by t.aaa167,t.aaa168 ");
		return CommonJdbcDaoUtils.query(sql.toString(), CountDTO.class);
	}

	public Page queryF10202002Rules(Page page, F10202002VO f10202002vo) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select (select kb01.akb021 from kb01 where kb01.akb020=t3.akb020) akb021,t3.akb020,t3.aaa027,count(t.baz004) wfmxs from kc72 t, kc62 t2, kc63 t3 where t.baz003=t2.baz003 and t2.baz001=t3.baz001 ");
		if (StringTools.hasText(f10202002vo.getAkc194s())) {
			sql.append(" and t3.akc194>=to_date('"+f10202002vo.getAkc194s()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAkc194e())) {
			sql.append(" and t3.akc194<=to_date('"+f10202002vo.getAkc194e()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAaa168())) {
			sql.append(" and t.aaa168='"+f10202002vo.getAaa168()+"'");
		}
		sql.append(" group by  t3.akb020,t3.akb021,t3.aaa027 order by count(t.baz004) desc");
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), F10202002VO.class);
	}

	public Page queryF10202002Detail(Page page, F10202002VO f10202002vo) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select t3.baz001,t2.baz003,t3.aac003,t3.aac002,t3.aac004,t3.aac006,t2.ake001,t2.ake002,t2.ake003,t2.akc226,t2.akc225,t2.akb065,t.aaa167,t.aaa133  ");
		sql.append("from KC63 t3, kc62 t2, kc72 t where t.baz003 = t2.baz003 and t2.baz001 = t3.baz001 and t2.baz003 in (select max(t2.baz003) from kc62 t2 group by t2.baz001)");
		if (StringTools.hasText(f10202002vo.getAkc194s())) {
			sql.append(" and t3.akc194>=to_date('"+f10202002vo.getAkc194s()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAkc194e())) {
			sql.append(" and t3.akc194<=to_date('"+f10202002vo.getAkc194e()+"','yyyy-MM-dd') ");
		}
		if (StringTools.hasText(f10202002vo.getAaa168())) {
			sql.append(" and t.aaa168='"+f10202002vo.getAaa168()+"'");
		}
		if (StringTools.hasText(f10202002vo.getAkb020())) {
			sql.append(" and t3.akb020='"+f10202002vo.getAkb020()+"'");
		}
		return CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), F10202002VO.class);
	}


	public List<F10202002VO> queryKc62(F10202002VO resultVO) {
		if (!StringTools.hasText(resultVO.getBaz001())) {
			throw new BusinessException("MedAuditBS-01:查询baz001查询Kc62信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer("");
		sql.append("select t3.baz001,t3.aac003,t2.baz003, t3.aac002,t3.aac004,t3.aac006,t2.ake001,t2.ake002,t2.ake003,t2.akc226,t2.akc225,t2.akb065,t.aaa167,t.aaa133 ");
        sql.append("from KC63 t3, kc62 t2, kc72 t ");
        sql.append("where t.baz003 = t2.baz003 and t2.baz001 = t3.baz001 ");
        sql.append("and t2.baz001='"+resultVO.getBaz001()+"'");
        sql.append("and t2.baz003<>'"+resultVO.getBaz003()+"'");
		//sql.append(" and baz001 = '" + resultVO.getBaz001() + "' ");

		List<F10202002VO> result = CommonJdbcDaoUtils.query(sql.toString(),F10202002VO.class);
		
		return result;
	}

	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020,(t2.baz020+1) baz025,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		sql.append(" and t1.baz031 = '04' ");
		sql.append(" order by t1.baz001,t1.baz032 desc ");
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;
	}

	public F10201006VO querySZJ(F10201006VO f10201006vo) {
		SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日HH:mm:ss");
		String sql=" select t.baz005,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ031' and aa10.aaa102=t.baz031) baz031,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ101' and aa10.aaa102=t.baz101) baz101,(select aa10.aaa103 from aa10 where aa10.aaa100='BAZ102' and aa10.aaa102=t.baz102) baz102,t.baz021,t.aae002,t.baz023,t2.baz010,t2.baz035,t2.baz036,t2.baz037 from (select * from kc81 where kc81.baz001= ? ) t left join ke02 t2 on (t.baz005=t2.baz005 ) order by t.baz023 desc ";
		List<F10201006VO> resultList=CommonJdbcDaoUtils.query(sql, F10201006VO.class, f10201006vo.getBaz001());
		if (resultList.size()>0) {
			String sjz="[{\"year\":\""+resultList.get(0).getAae002().substring(0, 4)+"\",\"flg\":\"1\",child:[";
			for (int i = 0; i < resultList.size(); i++) {
				F10201006VO vo=resultList.get(i);
				if (vo.getBaz037()==null) {
					sjz+="{\"month\":\""+sdf.format(vo.getBaz023())+"\",\"fj\":\"\",\"fjurl\":\"\",\"txt\":\""+vo.getBaz021()+"\"}";
				}else {
					sjz+="{\"month\":\""+sdf.format(vo.getBaz023())+"\",\"fj\":\""+vo.getBaz037()+"\",\"fjurl\":\""+vo.getBaz036()+"\",\"txt\":\""+vo.getBaz021()+"\"}";
				}
				if ((i+1)!=resultList.size()) {
					sjz+=",";
				}
			}
			sjz+="]}]";
			f10201006vo.setSjz(sjz);
		}
		return f10201006vo;
	}
}
