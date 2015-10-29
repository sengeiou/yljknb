package com.wondersgroup.bc.k2.f10204002.bs.impl;

import java.util.List;

import com.wondersgroup.bc.k2.f10204002.bs.F10204002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke02;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10204002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10204002BSImpl implements F10204002BS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(" select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, a.aac004, a.aac006, a.aac012");
		sql.append(", a.akb020, a.akb021, a.akb022, a.aaz307, a.akf001, a.aae386, a.aaz263, a.aka130");
		sql.append(", a.akc194, a.ake038, a.akc254, a.akc253, a.akb067, a.akc264, a.akc050, a.akc193");
		sql.append(", a.akc185, a.aka120, a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277");
		sql.append(", a.aae030, a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003");
		sql.append(", a.aaz308, a.aaz217, a.akc190, a.baz101, a.baz102");
		sql.append(" from kc63 a, kc62 b");
		sql.append(" where 1 = 1 ");
		sql.append(" and a.baz001 = b.baz001");// 关联kc63和kc62表
		sql.append(" and b.baz031 in ('06','02') ");
		sql.append(" and b.baz102 = '0'"); //添加限定条件：复议状态为0，即未复议
		
		if (StringTools.hasText(kc63Dto.getZsdmc())) {//根据知识点查询
			sql.append(" and b.ake009 in ("+kc63Dto.getZsdmc()+")");
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
			sql.append(" and a.akb020 in(" + kc63Dto.getAkb020() + ") ");
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

	public Page queryKc62WithPage(Page page, Kc62VO queryDto) {

		StringBuffer sql = new StringBuffer(
				" select t2.aka130,t2.aac001,t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc190,t2.akc021,t2.baz020,(t2.baz020+1) baz025,t2.akc193,(t2.AKC185||' '||t2.akc050||' '||t2.AKC186||' '||t2.AKC274||' '||t2.AKC276) akc050,t2.aac002,(t1.akb065-t1.ake039) akc254,t2.bac003,'--' baz024zx,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		sql.append(" and t1.baz031 in ('06','02') ");   
		sql.append(" and t1.baz102 = '0' ");
		if (StringTools.hasText(queryDto.getAke007())) {
			sql.append(" and t1.ake009 in ("+queryDto.getAke007()+")");
		}
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;
	}

	public Kc63DTO getKc63ById(String baz001) {
		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("F10204002BS:传入baz001为空!");
		}

		Kc63DTO kc63Dto = new Kc63DTO();

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, baz001);

		if (kc63 != null) {
			BeanTools.copyProperties(kc63, kc63Dto);
		}

		return kc63Dto;

	}

	public List<Kc72DTO> queryKc72(Kc72DTO kc72Dto) {
		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("F10204002BS:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc72DTO.class);

		return list;
	}


	public Kc81DTO saveKc81(Kc81DTO kc81Dto) {
		if (kc81Dto == null) {
			throw new BusinessException("F10204002:传入kc81Dto为空!");
		}

		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81Dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);

		CommonHibernateDaoUtils.save(kc81);

		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;

	}
	
	/**
	 * 同步单据明细复议状态
	 * 
	 * @param kc62
	 */
	public Kc62DTO updateKc62(Kc62DTO kc62Dto) {
		if (kc62Dto == null) {
			throw new BusinessException("F10204002BS:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62Dto.getBaz003())) {
			throw new BusinessException("F10204002BS:传入参数kc62Dto主键为空!");
		}

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, kc62Dto
				.getBaz003());

		BeanTools.copyPropertiesIgnoreNull(kc62Dto, kc62);

		CommonHibernateDaoUtils.update(kc62);

		BeanTools.copyProperties(kc62, kc62Dto);

		return kc62Dto;

	}

	/**
	 * 根据主键查询违规单据明细统计表
	 * 
	 * @param baz003
	 * @return
	 */
	public Kc62DTO getKc62ById(String baz003) {
		if (!StringTools.hasText(baz003)) {
			throw new BusinessException("F10204002BS:传入baz003为空!");
		}

		Kc62DTO kc62Dto = new Kc62DTO();

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, baz003);

		if (kc62 != null) {
			BeanTools.copyProperties(kc62, kc62Dto);
		}
		return kc62Dto;

	}
	public List<Kc62DTO> findCaseID(String ids) {
		String baz003s = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				baz003s += "'" + id[i] + "'";
			} else {
				baz003s += "'" + id[i] + "',";
			}
		}

		String sql = "select * from kc62 where baz003 in ( " + baz003s + ")";

		List<Kc62DTO> kc62dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return kc62dtos;
	}

	public Ke02DTO saveKe02(Ke02DTO ke02DTO) {
		Ke02 ke02=new Ke02();
		BeanTools.copyPropertiesIgnoreNull(ke02DTO, ke02);
		String baz010=CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ010");
		ke02.setBaz010(baz010);
		StringBuffer sql = new StringBuffer(" insert into ke02(baz010, baz005, baz035, baz036, baz037, baz038, baz039)");
		
		if(StringTools.hasText(ke02.getBaz010())){
			sql.append("values('"+ ke02.getBaz010() +"', '"+ ke02.getBaz005() +"', '" +ke02.getBaz035() + "', '" +ke02.getBaz036() +"', '"+ke02.getBaz037()+"', '"+ke02.getBaz038()+"', "+"sysdate"+")");
		}
		CommonJdbcDaoUtils.insert(sql.toString());
		BeanTools.copyProperties(ke02, ke02DTO);
		return ke02DTO;
	}

	public List<GatherVO> queryWithHospital(String akb020) {
		
		StringBuffer sql = new StringBuffer("select * from(");

		sql.append(" select nvl(k2.akb020, k3.akb020) yybh,");
		sql.append(" nvl(k2.akb021, k3.akb021) yymc,");
		sql.append(" nvl(wfy, 0) wfys,nvl(cq, 0) cqs from (");
		// 待复议处理
		//sql.append(" select a.akb020, a.akb021, count(distinct b.baz001) dfycl from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '02' or b.baz031 = '06') and b.baz102 = '0' group by a.akb020, a.akb021) k1");
		// 未复议
		//sql.append(" full outer join (");
		sql.append(" select a.akb020, a.akb021, count(distinct b.baz001) wfy from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '02' or b.baz031 = '06') and b.baz102 = '0' group by a.akb020, a.akb021) k2");
		//sql.append(" on k1.akb020 = k2.akb020");
		// 超期数
		sql.append(" full outer join (select a.akb020, a.akb021, count(distinct b.baz001) cq from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '02' or b.baz031 = '06') and b.baz102 = '0' group by a.akb020, a.akb021) k3");
		sql.append(" on k2.akb020 = k3.akb020)k");
		// 直接扣款
		// sql.append(" full outer join (select a.akb020, a.akb021, count(*) zjkk from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '05' or b.baz031 = '04') group by a.akb020, a.akb021) k4");
		// sql.append(" on k1.akb020 = k4.akb020");
		// 送核查
		// sql.append(" full outer join (select a.akb020, a.akb021, count(*) shc from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '01' or b.baz031 = '04') group by a.akb020, a.akb021) k5");
		// sql.append(" on k1.akb020 = k5.akb020");
		// 已审核数
		// sql.append(" full outer join (select a.akb020, a.akb021, count(*) ysh from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '05' or b.baz031 = '03') group by a.akb020, a.akb021) k6");
		// sql.append(" on k1.akb020 = k6.akb020) k");

		sql.append(" where 1=1 ");
		if (StringTools.hasText(akb020)) {
			sql.append(" and trim(k.yybh) = '" + akb020 + "' or k.yymc like '%"
					+ akb020 + "%'");
		}

		List<GatherVO> queryWithHospitalList = CommonJdbcDaoUtils.query(
				sql.toString(), GatherVO.class);
		return queryWithHospitalList;

	}
	
}
