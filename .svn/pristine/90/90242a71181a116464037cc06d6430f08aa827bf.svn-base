package com.wondersgroup.bc.k2.f10203002.bs.impl;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.k2.f10203002.bs.F10203002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203002.vo.JSVO;
import com.wondersgroup.local.k2.f10203002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203002.vo.QueryNumberVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203002BSImpl implements F10203002BS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(
				" select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, "
						+ "a.aaz307, a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, a.akc186, "
						+ "a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, a.aaz308, a.aaz217, a.akc190, "
						+ "a.baz101,a.baz102 from kc63 a,kc62 b");

		sql.append("  where 1=1 ");
		// 添加条件
		sql.append("  and a.baz001 = b.baz001 ");

		if (StringTools.hasText(kc63Dto.getYbfgzflbm())) {
			sql.append(" and t.baz001 = a.baz001");
		}
		if (StringTools.hasText(kc63Dto.getZsdmc())) {// 根据知识点查询
			sql.append(" and b.ake009 in (" + kc63Dto.getZsdmc() + ")");
		}
		if (StringTools.hasText(kc63Dto.getBaz031())) {
			if ("99".equals(kc63Dto.getBaz031())) {
				sql.append(" and b.baz031 in ('03','05') ");
			} else {
				sql.append(" and b.baz031 = '" + kc63Dto.getBaz031() + "' ");
			}
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
			if (kc63Dto.getAac003().replaceAll(" ", "").length() == 8) {
				sql.append(" and a.aac001 = " + kc63Dto.getAac003() + "");
			} else {
				sql.append(" and a.aac003 like '%" + kc63Dto.getAac003()
						+ "%' ");
			}
		}
		if (kc63Dto.getAkc194Start() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') >= "
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194Start()) + " ");
		}
		if (kc63Dto.getAkc194End() != null) {
			sql.append(" and to_number(to_char(a.akc194,'yyyyMMdd'),'99999999') <= "
					+ DateTools.getYYYYMMDD(kc63Dto.getAkc194End()) + " ");
		}
		sql.append("  order by a.akc194 asc ");
		System.out.println(sql.toString());
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63DTO.class);

		return result;

	}

	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select t2.aka130,t2.aac001,t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc190,t2.akc021,t2.baz020,t2.akc193,(t2.AKC185||' '||t2.akc050||' '||t2.AKC186||' '||t2.AKC274||' '||t2.AKC276) akc050,t2.aac002,(t1.akb065-t1.ake039) akc254,t2.bac003,'--' baz024zx ");
		sql.append(" ,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");
		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		if ("99".equals(queryDto.getBaz031())) {
			sql.append(" and t1.baz031 in ('03','05') ");
		} else {
			sql.append(" and t1.baz031 in ('" + queryDto.getBaz031() + "') ");
		}
		if (StringTools.hasText(queryDto.getAke007())) {
			sql.append(" and t1.ake009 in (" + queryDto.getAke007() + ")");
		}
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;

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

		String sql = "select * from kc62 where baz031 in('03','05') and baz003 in ( "
				+ baz003s + ")";

		List<Kc62DTO> kc62dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return kc62dtos;
	}

	public Kc81DTO saveKc81(Kc81DTO kc81Dto) {
		if (kc81Dto == null) {
			throw new BusinessException("F10203002BS-01:传入kc81Dto为空!");
		}

		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81Dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);
		// kc81操作时间为数据库当前时间
		kc81.setBaz023(CommonJdbcDaoUtils.queryObject(
				"select sysdate from dual", Date.class));
		CommonHibernateDaoUtils.save(kc81);

		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;
	}

	public Kc62DTO updateKc62(Kc62DTO kc62Dto) {
		if (kc62Dto == null) {
			throw new BusinessException("F10203002BS-02:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62Dto.getBaz003())) {
			throw new BusinessException("F10203002BS-03:传入参数kc62Dto主键为空!");
		}

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
				kc62Dto.getBaz003());

		BeanTools.copyPropertiesIgnoreNull(kc62Dto, kc62);

		CommonHibernateDaoUtils.update(kc62);

		BeanTools.copyProperties(kc62, kc62Dto);

		return kc62Dto;
	}

	public Kc63DTO getKc63ById(String baz001) {
		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("F10203002BS-04:传入baz001为空!");
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
			throw new BusinessException("F10203002BS-05:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc72DTO.class);

		return list;
	}

	public List<QueryNumberVO> getQueryNumberVO(String akb020orakb021,
			String baz031) {
		StringBuffer sql = new StringBuffer("");
		if ("99".equals(baz031)) {
			baz031 = "'03','05'";
		} else {
			baz031 = "'" + baz031 + "'";
		}
		sql.append("select *\n"
				+ "  from (select nvl(k1.akb020, k2.akb020) yybh,\n"
				+ "               nvl(k1.akb021, k2.akb021) yymc,\n"
				+ "               nvl(dsssh, 0) dssshs,\n"
				+ "               nvl(cq, 0) cqs\n"
				+ "          from (select a.akb020, a.akb021, count(*) dsssh\n"
				+ "                  from kc63 a, kc62 b\n"
				+ "                 where a.baz001 = b.baz001\n"
				+ "                   and b.baz031 in ("
				+ baz031
				+ ")\n"
				+ "                 group by a.akb020, a.akb021) k1\n"
				+ "          full outer join (select c.akb021, c.akb020, count(*) cq\n"
				+ "                            from kc63 c,\n"
				+ "                                 (select *\n"
				+ "                                    from kc62 a,\n"
				+ "                                         (select a.baz003 baz003,\n"
				+ "                                                 max(a.baz023) baz023,a.baz031\n"
				+ "                                            from kc81 a\n"
				+ "                                           where a.baz031 in ("
				+ baz031
				+ ")\n"
				+ "                                           group by baz003, a.baz031) b\n"
				+ "                                   where a.baz003 = b.baz003\n"
				+ "                                     and 15 < sysdate - b.baz023 and a.baz031 in ("
				+ baz031
				+ ")) d\n"
				+ "                           where c.baz001 = d.baz001\n"
				+ "                           group by c.akb021, c.akb020) k2 on k1.akb020 =\n"
				+ "                             k2.akb020) k where 1=1 ");
		if (StringTools.hasText(akb020orakb021)) {
			sql.append(" and trim(k.yybh) = '" + akb020orakb021.trim()
					+ "' or k.yymc like '%" + akb020orakb021.trim() + "%'");
		}
		// 按参数值降序显示
		sql.append(" order by dssshs desc,cqs desc");

		List<QueryNumberVO> queryNumberVOList = CommonJdbcDaoUtils.query(
				sql.toString(), QueryNumberVO.class);
		return queryNumberVOList;
	}

	public double getKc62ById(String baz003) {
		Kc62DTO dto = new Kc62DTO();
		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class, baz003);
		if (kc62 != null) {
			BeanTools.copyProperties(kc62, dto);
		}
		return dto.getBaz041() == null ? 0 : dto.getBaz041();
	}

	public String isClear(String baz003, String opId, String opName, double je) {
		JSVO js = new JSVO();
		js.setBaz003(baz003);
		js.setCflx("40");
		js.setJe(je);
		js.setOpId(opId);
		js.setOpName(opName);
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

}
