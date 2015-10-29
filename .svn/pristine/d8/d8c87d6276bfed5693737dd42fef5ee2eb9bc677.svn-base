package com.wondersgroup.bc.k2.f10203003.bs.impl;

import java.util.List;

import com.wondersgroup.bc.k2.f10203003.bs.F10203003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10203001.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203003.vo.HosDetailVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203003BSImpl implements F10203003BS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(
				"  select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, "
						+ "a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, a.aaz307, "
						+ "a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, "
						+ "a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, "
						+ "a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, "
						+ "a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, "
						+ "a.aaz308, a.aaz217, a.akc190,a.baz101,a.baz102 from kc63 a,kc62 b");
		if (StringTools.hasText(kc63Dto.getYbfgzflbm())) {
			if (StringTools.hasText(kc63Dto.getYbgzflbm())) {
				sql.append(",(select k2.baz001 from kc62 k2, kc72 k7 where k2.baz003 = k7.baz003 and k7.aaa168 ='"
						+ kc63Dto.getYbgzflbm() + "' group by k2.baz001) t ");
			} else {
				sql.append(",(select k2.baz001 from kc62 k2, kc72 k7 where k2.baz003 = k7.baz003 and k7.aaa168 in (select ybgzflbm from  ybgz_ybgzfl where ybfgzflbm='"
						+ kc63Dto.getYbfgzflbm() + "') group by k2.baz001) t ");
			}
		}
		if (StringTools.hasText(kc63Dto.getZsdmc())) {
			sql.append(",(select k2.baz001 from kc72 k7,kc62 k2 where  k2.baz003 = k7.baz003 and k7.aaa168 in (select zsd.ybgzflbm from  ybgz_ybgzzsd zsd where zsd.zsdmc like '%"
					+ kc63Dto.getZsdmc() + "%' group by zsd.ybgzflbm)) s");
		}
		// sql.append(",(select distinct f.baz001 from kc62 f where f.baz031='05') g");
		// sql.append(" where  g.baz001=a.baz001");
		sql.append("  where a.baz001 = b.baz001 and (b.baz031 = '05' or b.baz031 = '03') ");
		if (StringTools.hasText(kc63Dto.getYbfgzflbm())) {
			sql.append(" and t.baz001 = a.baz001");
		}
		if (StringTools.hasText(kc63Dto.getZsdmc())) {
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

	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		StringBuffer sql = new StringBuffer("");
		sql.append(
				"select * from (select nvl(k4.akb020, k3.akb020) akb020,\n"
						+ "               nvl(nvl(k4.akb021, k3.akb021), '未知医院') akb021,\n"
						+ "               nvl(drgcs, 0) drgcs,\n"
						+ "               nvl(dsssh, 0) dsssh,\n"
						+ "               nvl(cqs, 0) cqs\n"
						+ "          from (select nvl(k1.akb020, k2.akb020) akb020,\n"
						+ "                       nvl(k1.akb021, k2.akb021) akb021,\n"
						+ "                       nvl(drgcs, 0) drgcs,\n"
						+ "                       nvl(dsssh, 0) dsssh\n"
						+ "                  from (select a.akb020, a.akb021, count(1) drgcs\n"
						+ "                          from kc63 a, kc62 b\n"
						+ "                         where a.baz001 = b.baz001\n"
						+ "                           and (b.baz031 = '05')\n"
						+ "                         group by a.akb020, a.akb021) k1\n"
						+ "                  full outer join (select a.akb020, a.akb021, count(1) dsssh\n"
						+ "                                    from kc63 a, kc62 b\n"
						+ "                                   where a.baz001 = b.baz001\n"
						+ "                                     and (b.baz031 = '03')\n"
						+ "                                   group by a.akb020, a.akb021) k2 on k1.akb020 =\n"
						+ "                                                                      k2.akb020) k4\n"
						+ "          full outer join (select a.akb020 akb020,\n"
						+ "                                 a.akb021 akb021,\n"
						+ "                                 sum(cqs) cqs\n"
						+ "                            from (select a.akb021, a.akb020, count(1) cqs\n"
						+ "                                    from kc63 a, kc62 b\n"
						+ "                                   where a.baz001 = b.baz001\n"
						+ "                                     and a.baz021 = '3'\n"
						+ "                                     and a.baz031 = '05'\n"
						+ "                                     and a.baz020 < sysdate - 15\n"
						+ "\n"
						+ "                                   group by a.akb021, a.akb020\n"
						+ "                                  union all\n"
						+ "                                  select c.akb021, c.akb020, count(1) cqs\n"
						+ "                                    from kc63 c,\n"
						+ "                                         (select *\n"
						+ "                                            from kc62 a,\n"
						+ "                                                 (select a.baz003 baz003,\n"
						+ "                                                         max(a.baz023) baz023，a.baz031\n"
						+ "                                                    from kc81 a\n"
						+ "                                                   where a.baz031 = '03'\n"
						+ "                                                   group by baz003, a.baz031) b\n"
						+ "                                           where a.baz003 = b.baz003\n"
						+ "                                             and 15 < sysdate - b.baz023\n"
						+ "                                             and a.baz031 = '03') d\n"
						+ "                                   where c.baz001 = d.baz001\n"
						+ "                                   group by c.akb021, c.akb020) a\n"
						+ "                           group by a.akb020, a.akb021) k3 on k3.akb020 =\n"
						+ "                                                              k4.akb020) k");
		sql.append(" where 1=1 ");
		if(StringTools.hasText(hosDetailVO.getQuery())){
			sql.append("and trim(akb020) = '"+hosDetailVO.getQuery().trim()+"' or akb021 like '%"+hosDetailVO.getQuery().trim()+"%'");
		}
		sql.append(" order by drgcs desc,dsssh desc,cqs desc");
		List<HosDetailVO> result = CommonJdbcDaoUtils.query(sql.toString(),
				HosDetailVO.class);
		return result;
	}

	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020,(t2.baz020+1) baz025,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		sql.append(" and (t1.baz031 = '05' or t1.baz031 = '03') ");
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;

	}

}
