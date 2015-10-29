package com.wondersgroup.bc.k2.f10202004.bs.impl;

import com.wondersgroup.bc.k2.f10202004.bs.F10202004BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202004.vo.Kc62VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10202004BSImpl implements F10202004BS{

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
		sql.append("  where a.baz001 = b.baz001 ");
		if (StringTools.hasText(kc63Dto.getYbfgzflbm())) {
			sql.append(" and t.baz001 = a.baz001");
		}
		if (StringTools.hasText(kc63Dto.getZsdmc())) {
			sql.append(" and s.baz001 = a.baz001");
		}
		if(kc63Dto.getBaz023()!=null){
			sql.append("and trunc(b.baz023,'dd')=trunc(to_date('"+DateTools.formatDate(kc63Dto.getBaz023(), "yyyyMMdd")+"','yyyyMMdd'), 'dd')") ;
		}
		if (StringTools.hasText(kc63Dto.getBaz102())) {
			sql.append(" and b.baz102 in (" + kc63Dto.getBaz102() + ") ");
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

	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020,(t2.baz020+1) baz025,t2.akc050,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		sql.append(" and (t1.baz102 in ("+queryDto.getBaz102()+")) ");
		if(queryDto.getBaz023()!=null){
			sql.append("and trunc(t1.baz023,'dd')=trunc(to_date('"+DateTools.formatDate(queryDto.getBaz023(), "yyyyMMdd")+"','yyyyMMdd'), 'dd')") ;
		}
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;

	}

}
