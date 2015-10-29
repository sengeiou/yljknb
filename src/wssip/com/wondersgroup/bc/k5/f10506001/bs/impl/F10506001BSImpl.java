package com.wondersgroup.bc.k5.f10506001.bs.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.k5.f10506001.bs.F10506001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke02;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10506001.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10506001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10506001.vo.RuleManageVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10506001BSImpl implements F10506001BS {

	/**
	 * 
	 * @Description:分页查询违规单据统计信息（kc63）
	 * @author 张磊
	 * @date 2015-1-5 下午01:47:34
	 */
	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {
		StringBuffer sql = new StringBuffer(
				" select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, ");
		sql.append(" a.akb022, a.aaz307, a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, a.akc253, a.akb067, ");
		sql.append(" a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, ");
		sql.append(" a.aae030, a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, a.aaz308, a.aaz217, ");
		sql.append(" a.akc190, a.baz101, a.baz102 from kc63 a,kc62 b ");
		sql.append(" where a.baz001=b.baz001 and b.baz031 in ('06','02') ");
		sql.append(" and b.baz102 in('0','4') ");// 未复议
		
		if (StringTools.hasText(kc63Dto.getZsdmc())) {//根据知识点查询
			sql.append(" and b.ake009 in ("+kc63Dto.getZsdmc()+")");
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
			sql.append(" and a.akb020 in (" + kc63Dto.getAkb020() + ") ");
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
			if (kc63Dto.getAac003().replaceAll(" ", "").length()==8) {
				sql.append(" and a.aac001 = " + kc63Dto.getAac003() + "");
			}else {
				sql.append(" and a.aac003 like '%" + kc63Dto.getAac003() + "%' ");
			}
		}
		if (kc63Dto.getAkc194Start() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') >= "
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194Start())
					+ " ");
		}
		if (kc63Dto.getAkc194End() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') <= "
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194End())
					+ " ");
		}
		sql.append("  order by a.akc194 asc ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63DTO.class);

		return result;
	}

	/**
	 * 
	 * @Description:分页查询违规单据明细统计信息(kc62)
	 * @author 张磊
	 * @date 2015-1-5 下午02:12:45
	 */
	public Page queryKc62WithPage(Page page, Kc62DTO kc62Dto) {
		if (!StringTools.hasText(kc62Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-01:查询违规单据明细统计信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select t2.aka130,t2.aac001,t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc190,t2.akc021,t2.baz020,t2.akc193,(t2.AKC185||' '||t2.akc050||' '||t2.AKC186||' '||t2.AKC274||' '||t2.AKC276) akc050,t2.aac002,(t1.akb065-t1.ake039) akc254,t2.bac003, ");
		sql.append("(select baz026 from kc81 where kc81.BAZ023=(select max(BAZ023) from kc81 where kc81.baz003=t1.baz003 group by baz003) and kc81.baz003=t1.baz003) baz022str,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001");
		sql.append(" and t1.baz001 in (" + kc62Dto.getBaz001() + ")");
		sql.append(" and (t1.baz031 = '06' or t1.baz031 = '02') ");
		sql.append(" and t1.baz102 in ('0','4') ");
		if (StringTools.hasText(kc62Dto.getAke007())) {
			sql.append(" and t1.ake009 in ("+kc62Dto.getAke007()+")");
		}
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;
	}

	/**
	 * 
	 * @Description:根据baz001ID查询实体类信息
	 * @author 张磊
	 * @date 2015-1-5 下午02:56:49
	 */
	public Kc63DTO getKc63ById(String baz001) {
		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("F10506001BS-08:传入baz001为空!");
		}

		Kc63DTO kc63Dto = new Kc63DTO();

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, baz001);

		if (kc63 != null) {
			BeanTools.copyProperties(kc63, kc63Dto);
		}
		return kc63Dto;
	}

	/**
	 * 
	 * @Description:根据Baz003查询Kc72信息
	 * @author 张磊
	 * @date 2015-1-5 下午02:58:23
	 */
	public List<Kc72DTO> queryKc72(Kc72DTO kc72Dto) {
		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("F10506001BS-15:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc72DTO.class);

		return list;
	}

	/**
	 * 
	 * @Description:查询KC81信息
	 * @author 张磊
	 * @date 2015-1-5 下午03:11:25
	 */
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

	/**
	 * 
	 * @Description:查询Kc73实体信息
	 * @author 张磊
	 * @date 2015-1-5 下午03:59:19
	 */
	public List<Kc73DTO> queryKc73(Kc73DTO kc73Dto) {
		if (!StringTools.hasText(kc73Dto.getBaz001())) {
			throw new BusinessException("F10506001BS-14:查询单据违规信息传入Baz001为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc73 where baz002 is not null ");

		sql.append(" and baz001 = '" + kc73Dto.getBaz001() + "' ");

		sql.append(" order by baz002");

		List<Kc73DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc73DTO.class);

		return list;
	}

	/**
	 * 
	 * @Description: 保存附件信息表
	 * @author 张磊
	 * @date 2015-1-8 上午09:32:00
	 */
	public void saveKe02Info(Ke02DTO ke02DTO) {
		String id = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ010");
		StringBuffer sql = new StringBuffer(
				"INSERT INTO KE02(BAZ010, BAZ005, BAZ035, BAZ036, BAZ037, BAZ038, BAZ039)");
		sql.append(" VALUES ('" + id + "', '" + ke02DTO.getBaz005() + "', '"
				+ ke02DTO.getBaz035() + "', '" + ke02DTO.getBaz036() + "', '"
				+ ke02DTO.getBaz037() + "', '" + ke02DTO.getBaz038()
				+ "', SYSDATE) ");
		CommonJdbcDaoUtils.insert(sql.toString());
	}

	/**
	 * 
	 * @Description:获取规则类别
	 * @author 张磊
	 * @date 2015-1-8 上午10:31:24
	 */
	public List<RuleManageVO> getYbgzfl() {
		String sql = "select ybgzfl_id as ybgzflid,ybgzflbm,ybgzflmc from ybgz_ybgzfl where ybgzflbm in (select ybfgzflbm from ybgz_ybgzfl group by ybfgzflbm)";
		return CommonJdbcDaoUtils.query(sql, RuleManageVO.class);
	}

	/**
	 * 
	 * @Description:获取规则名称
	 * @author 张磊
	 * @date 2015-1-8 上午10:31:45
	 */
	public List<RuleManageVO> getYbgzflxx(String bm) {
		String sql = "select ybgzfl_id as ybgzflid,ybgzflbm,ybgzflmc from ybgz_ybgzfl where ybfgzflbm='"
				+ bm + "'";
		return CommonJdbcDaoUtils.query(sql, RuleManageVO.class);
	}

	/**
	 * 查询Kc62
	 */
	public Kc62DTO getKc62ById(String baz003) {
		if (!StringTools.hasText(baz003)) {
			throw new BusinessException("F10506001BS-08:传入baz003为空!");
		}

		Kc62DTO kc62Dto = new Kc62DTO();

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, baz003);

		if (kc62 != null) {
			BeanTools.copyProperties(kc62, kc62Dto);
		}
		return kc62Dto;
	}

	/**
	 * 保存kc81审核记录信息
	 */
	public Kc81DTO saveKc81Info(Kc81DTO kc81dto) {
		if (kc81dto == null) {
			throw new BusinessException("F10204001:传入kc81Dto为空!");
		}
		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);

		CommonHibernateDaoUtils.save(kc81);

		BeanTools.copyProperties(kc81, kc81dto);

		return kc81dto;
	}

	/**
	 * 医院汇总信息
	 */
	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		StringBuffer sql = new StringBuffer(
				"select * from( select NVL(NVL(k1.mc, k2.mc), '未知医院') as akb021,"
						+ "NVL(k1.bh, k2.bh) as akb020, NVL(k1.dsss, 0) dsss, NVL(k2.cqs, 0) cqs from ");
		sql.append("(select a.akb021 mc, a.akb020 bh, NVL(count(*), 0) dsss from kc63 a, kc62 b ");
		sql.append("where a.baz001 = b.baz001 and b.baz031 in ('06','02') and b.baz102 = '0' group by a.akb021, a.akb020) k1 ");
		sql.append("full outer join (select a.akb021 mc, a.akb020 bh, NVL(count(*), 0) cqs from kc63 a, kc62 b ");
		sql.append(" where a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101 = '1' group by a.akb021, a.akb020) k2 ");
		sql.append("on k1.bh = k2.bh) k where k.akb021 like '%"
				+ hosDetailVO.getAkb020orakb021() + "%' or k.akb020 like '%"
				+ hosDetailVO.getAkb020orakb021() + "%'  order by k.dsss desc");
		List<HosDetailVO> result = CommonJdbcDaoUtils.query(sql.toString(),
				HosDetailVO.class);
		return result;
	}


	
	public List<Kc62DTO> findCaseID(String kc62Ids) {
		String baz003s = "";
		String[] id = kc62Ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				baz003s += "'" + id[i] + "'";
			} else {
				baz003s += "'" + id[i] + "',";
			}
		}

		String sql = "select * from kc62 where baz003 in ( " + baz003s + ") ";

		List<Kc62DTO> kc62dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return kc62dtos;
	}

	
	public Kc62DTO updateKc62(Kc62DTO kc62dto) {
		if (kc62dto == null) {
			throw new BusinessException("F10506001BS:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62dto.getBaz003())) {
			throw new BusinessException("F10506001BS:传入参数kc62Dto主键为空!");
		}

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
				kc62dto.getBaz003());

		BeanTools.copyPropertiesIgnoreNull(kc62dto, kc62);

		CommonHibernateDaoUtils.update(kc62);

		BeanTools.copyProperties(kc62, kc62dto);

		return kc62dto;

	}

	public Ke02DTO saveKe02(Ke02DTO ke02Dto) {
		Ke02 ke02 = new Ke02();
		BeanTools.copyPropertiesIgnoreNull(ke02Dto, ke02);
		String baz010 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ010");
		ke02.setBaz010(baz010);
		StringBuffer sql = new StringBuffer(
				" insert into ke02(baz010, baz005, baz035, baz036, baz037, baz038, baz039)");

		if (StringTools.hasText(ke02.getBaz010())) {
			sql.append("values('" + ke02.getBaz010() + "', '"
					+ ke02.getBaz005() + "', '" + ke02.getBaz035() + "', '"
					+ ke02.getBaz036() + "', '" + ke02.getBaz037() + "', '"
					+ ke02.getBaz038() + "', " + "sysdate" + ")");
		}
		CommonJdbcDaoUtils.insert(sql.toString());
		BeanTools.copyProperties(ke02, ke02Dto);
		return ke02Dto;
	}

	public Boolean queryKc05(String baz003) {
		StringBuffer sql=new StringBuffer("");
		sql.append("SELECT * FROM KF05  WHERE AAZ263 = (SELECT AAZ263 FROM KC63  " +
				"WHERE BAZ001 = (SELECT BAZ001 FROM KC62 WHERE BAZ003 = '"+baz003+"'))");
		List<Kf05> list=CommonJdbcDaoUtils.query(sql.toString(), Kf05.class);
		if(list.size()<1){
			return false;
		}else{
			return true;
		}
	}

	public List<Map<String, Object>> findKc62List(String strids) throws ParseException {
		StringBuffer sql = new StringBuffer(
				" select t2.aka130,t2.aac001,t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc021,t2.akc190,t2.akc194,t2.baz020,t2.akc193,(t2.AKC185||' '||t2.akc050||' '||t2.AKC186||' '||t2.AKC274||' '||t2.AKC276) akc050,t2.aac002,(t1.akb065-t1.ake039) akc254,t2.bac003,(select baz026 from kc81 where kc81.BAZ023=(select max(BAZ023) from kc81 where kc81.baz003=t1.baz003 group by baz003) and kc81.baz003=t1.baz003) baz022str,t1.* from kc62 t1,kc63 t2 where t1.baz001=t2.baz001 ");
		sql.append("  and t1.baz003 in (" + strids
				+ ") order by t1.baz001,t1.baz032 desc ");

		List<Map<String, Object>> listKc62 = CommonJdbcDaoUtils
				.queryForList(sql.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Object> map : listKc62) {
			// 时间转换为string
			if (map.get("AKC194") != null) {
				map.put("AKC194", sdf.format(map.get("AKC194")));
			}
			if (map.get("BAZ020") != null) {
				map.put("BAZ020", sdf.format(map.get("BAZ020")));
			}
			if (map.get("BAZ023") != null) {
				map.put("BAZ023", sdf.format(map.get("BAZ023")));
			}
			if (map.get("BAZ024") != null) {
				map.put("BAZ024", sdf.format(map.get("BAZ024")));
			}
			if (map.get("AKC221") != null) {
				map.put("AKC221", sdf.format(map.get("AKC221")));
			}
			// 字典转换
			if (map.get("BAZ102") != null) {
				String BAZ102 = this.loadDicDataByNameAndCode("BAZ102", map
						.get("BAZ102").toString());
				map.put("BAZ102", BAZ102);
			}
			if (map.get("AKC021") != null) {
				String AKC021 = this.loadDicDataByNameAndCode("AKC021", map
						.get("AKC021").toString());
				map.put("AKC021", AKC021);
			}
			if (map.get("AAC006") != null) {
				Kc62VO kc62 = new Kc62VO();
				kc62.setAac006(map.get("AAC006").toString());
				String AAC006 = kc62.getAac006();
				map.put("AAC006", AAC006);
			}
			if (map.get("AAC002") != null) {
				String AAC002 = map.get("AAC002").toString() + "'";
				map.put("AAC002", AAC002);
			}
			if (map.get("AKA130") != null) {
				String AKA130 = this.loadDicDataByNameAndCode("AKA130", map
						.get("AKA130").toString());
				map.put("AKA130", AKA130);
			}
			if (map.get("AAC004") != null) {
				String AAC004 = this.loadDicDataByNameAndCode("AAC004", map
						.get("AAC004").toString());
				map.put("AAC004", AAC004);
			}
			if (map.get("AKE003") != null) {
				String ake003 = this.loadDicDataByNameAndCode("AKE003", map
						.get("AKE003").toString());
				map.put("AKE003", ake003);
			}
			if (map.get("AKA065") != null) {
				String aka065 = this.loadDicDataByNameAndCode("AKA065", map
						.get("AKA065").toString());
				map.put("AKA065", aka065);
			}
			if (map.get("BAZ032") != null) {
				String baz032 = this.loadDicDataByNameAndCode("BAZ032", map
						.get("BAZ032").toString());
				map.put("BAZ032", baz032);
			}
		}

		return listKc62;
	}
	public String loadDicDataByNameAndCode(String name,String code){
		String value=new String();
		 if(StringUtils.hasText(name) && StringUtils.hasText(code)){
		 String dicSql="select bc_sql from IP_BUSINESS_CODE t where bc_type='"+name+"'";
		 String dataSql=CommonJdbcDaoUtils.queryObject(dicSql, String.class);
		 	if(StringUtils.hasText(dataSql)){
		 		dataSql="select "+dataSql.substring(dataSql.indexOf(",")+1,dataSql.length());
		 		dataSql+=" and aaa102='"+code+"'";
		 		value=CommonJdbcDaoUtils.queryObject(dataSql,String.class);
		 	}
		 }
		 return value;
	}
	
}
