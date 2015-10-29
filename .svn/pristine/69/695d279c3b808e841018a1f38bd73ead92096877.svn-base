package com.wondersgroup.bc.k2.f10206001.bs.impl;

import java.util.List;

import com.wondersgroup.bc.k2.f10206001.bs.F10206001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc65;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203002.vo.JSVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10206001BSImpl implements F10206001BS {


	public List<Kc72DTO> queryKc72(Kc72DTO kc72Dto) {
		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("F10204001BS:查询单据明细违规信息传入Baz003为空!");
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
			throw new BusinessException("F10204001:传入kc81Dto为空!");
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
			throw new BusinessException("F10204001BS:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62Dto.getBaz003())) {
			throw new BusinessException("F10204001BS:传入参数kc62Dto主键为空!");
		}

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
				kc62Dto.getBaz003());

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
			throw new BusinessException("F10204001BS:传入baz003为空!");
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

		String sql = "select * from kc62 where baz102='1' and baz003 in ( "
				+ baz003s + ")";

		List<Kc62DTO> kc62dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return kc62dtos;
	}

	public String isClear(String baz003, String operatorId,
			String operatorName, Double je) {
		JSVO js = new JSVO();
		js.setBaz003(baz003);
		js.setCflx("41");
		js.setJe(je);
		js.setOpId(operatorId);
		js.setOpName(operatorName);
		js.setJslx("1");
		CommonHibernateDaoUtils.executeStoreProcedure("YLJK_CLCF ", js);
		String result = "success";
		if (StringTools.hasText(js.getRes())) {
			if (!"1".equals(js.getRes().substring(0, 1))) {
				result = js.getRes();
			}
		}
		return result;
	}

	public Kc65DTO getKc65ById(String baz011) {
		if (!StringTools.hasText(baz011)) {
			throw new BusinessException("F10204001BS:传入baz011为空!");
		}

		Kc65DTO kc65Dto = new Kc65DTO();

		Kc65 kc65 = CommonHibernateDaoUtils.load(Kc65.class, baz011);

		if (kc65 != null) {
			BeanTools.copyProperties(kc65, kc65Dto);
		}

		return kc65Dto;
	}

	public Page queryKc65WithPage(Page page, Kc65DTO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select a.* from kc65 a  where 1 = 1  ");
		if (StringTools.hasText(queryDto.getBaz031())) {
			sql.append("and a.baz031='"+queryDto.getBaz031()+"'");
		}
		if (StringTools.hasText(queryDto.getBaz032())) {
			if (queryDto.getBaz032().equals("99")) {
				sql.append(" and a.baz032 in ( '1','2','3') ");
			}else {
				sql.append(" and a.baz032 = '" + queryDto.getBaz032() + "' ");
			}
		}
		if (StringTools.hasText(queryDto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + queryDto.getAaa027() + "' ");
		}
		if (StringTools.hasText(queryDto.getAka130())) {
			sql.append(" and a.aka130 = '" + queryDto.getAka130() + "' ");
		}
		if (StringTools.hasText(queryDto.getAkb020())) {
			sql.append(" and a.akb020 in (" + queryDto.getAkb020() + ") ");
		}
		if (StringTools.hasText(queryDto.getAkb021())) {
			sql.append(" and a.akb021 like '%" + queryDto.getAkb021() + "%' ");
		}
		if (StringTools.hasText(queryDto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + queryDto.getAaz263() + "' ");
		}
		if (StringTools.hasText(queryDto.getBac003())) {
			sql.append(" and a.bac003 like '%" + queryDto.getBac003() + "%' ");
		}
		if (StringTools.hasText(queryDto.getAac003())) {
			if (queryDto.getAac003().replaceAll(" ", "").length() == 8) {
				sql.append(" and a.aac001 = " + queryDto.getAac003() + "");
			} else {
				sql.append(" and a.aac003 like '%" + queryDto.getAac003()
						+ "%' ");
			}
		}
		if (queryDto.getAkc194Start() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') >= "
					+ DateTools.getYYYYMMDD(queryDto.getAkc194Start()) + " ");
		}
		if (queryDto.getAkc194End() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') <= "
					+ DateTools.getYYYYMMDD(queryDto.getAkc194End()) + " ");
		}
		sql.append("  order by a.akc194 asc ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc65DTO.class);

		return result;
	}


	public List<Kc65DTO> findKc65CaseID(String ids) {
		String baz011s = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				baz011s += "'" + id[i] + "'";
			} else {
				baz011s += "'" + id[i] + "',";
			}
		}

		String sql = "select * from kc65 where baz031='12' and baz011 in ( "
				+ baz011s + ")";

		List<Kc65DTO> kc65dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Kc65DTO.class);
		return kc65dtos;
	}


}
