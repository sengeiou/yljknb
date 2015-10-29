package com.wondersgroup.bc.k2.f10203001.bs.impl;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.k2.f10203001.bs.F10203001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203001.vo.HosDetailVO;
import com.wondersgroup.local.k2.f10203001.vo.Kc62VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203001BSImpl implements F10203001BS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(" select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, " +
				"a.aaz307, a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, a.akc186, " +
				"a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, a.aaz308, a.aaz217, a.akc190, " +
				"a.baz101,a.baz102 from kc63 a,kc62 b");
		if (StringTools.hasText(kc63Dto.getYbfgzflbm())) {
			if (StringTools.hasText(kc63Dto.getYbgzflbm())) {
				sql.append(",(select k2.baz001 from kc62 k2, kc72 k7 where  k2.baz003 = k7.baz003 and k7.aaa168 ='"
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

		sql.append("  where 1=1 ");
		// 添加条件
		sql.append("  and a.baz001 = b.baz001 and b.baz031 = '05' ");

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
		if (!"''".equals(kc63Dto.getAka130())) {
			sql.append(" and a.aka130 in (" + kc63Dto.getAka130() + ") ");
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

			sql.append(" select 'x' from kc62 b where a.baz001 = b.baz001");

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
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020,(t2.baz020+1) baz025,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		sql.append(" and t1.baz031 = '05' ");
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;

	}

	public List<Kc62DTO> findKc62ByIds(String ids) {
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

	public Kc81DTO saveKc81(Kc81DTO kc81Dto) {
		if (kc81Dto == null) {
			throw new BusinessException("F10203001BS-01:传入kc81Dto为空!");
		}

		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81Dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);
		
		//kc81操作时间为数据库当前时间
		kc81.setBaz023(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));

		CommonHibernateDaoUtils.save(kc81);

		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;
	}

	public Kc62DTO updateKc62(Kc62DTO kc62Dto) {
		if (kc62Dto == null) {
			throw new BusinessException("F10203001BS-02:传入参数kc62Dto为空!");
		}

		if (!StringTools.hasText(kc62Dto.getBaz003())) {
			throw new BusinessException("F10203001BS-03:传入参数kc62Dto主键为空!");
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
			throw new BusinessException("F10203001BS-04:传入baz001为空!");
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
			throw new BusinessException("F10203001BS-05:查询单据明细违规信息传入Baz003为空!");
		}

		StringBuffer sql = new StringBuffer(
				" select * from kc72 where baz004 is not null ");

		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "' ");

		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc72DTO.class);

		return list;
	}
	
	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		StringBuffer sql = new StringBuffer("");
		sql.append(
				"select *\n"
						+ "  from (select nvl(k1.akb020, k2.akb020) akb020,\n"
						+ "               nvl(nvl(k1.akb021, k2.akb021), '未知医院') akb021,\n"
						+ "               nvl(drgcs, 0) drgcs,\n"
						+ "               nvl(cqs, 0) cqs\n"
						+ "          from (select a.akb020, a.akb021, count(1) drgcs\n"
						+ "                  from kc63 a, kc62 b\n"
						+ "                 where a.baz001 = b.baz001\n"
						+ "                   and (b.baz031 = '05')\n"
						+ "                 group by a.akb020, a.akb021) k1\n"
						+ "          full outer join (select a.akb021, a.akb020, count(1) cqs\n"
						+ "                            from kc63 a, kc62 b\n"
						+ "                           where a.baz001 = b.baz001\n"
						+ "                             and a.baz021 = '3'\n" 
						+"                              and a.baz031 = '05' "
						+ "                             and a.baz020 < sysdate - 15\n"
						+ "                           group by a.akb021, a.akb020) k2 on k1.akb020 =\n"
						+ "                                                              k2.akb020) k\n"
						+ " where 1 = 1");
		if(StringTools.hasText(hosDetailVO.getQuery())){
			sql.append("and trim(akb020) = '"+hosDetailVO.getQuery()+"' or akb021 like '%"+hosDetailVO.getQuery()+"%'");
		}
		sql.append(" order by drgcs desc,cqs desc");
		List<HosDetailVO> result = CommonJdbcDaoUtils.query(sql.toString(),
				HosDetailVO.class);
		return result;
	}
}
