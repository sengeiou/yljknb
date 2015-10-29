package com.wondersgroup.bc.k5.f10505001.bs.impl;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.k5.f10505001.bs.DocAfterBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke02;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10505001.vo.Kc62VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class DocAfterBSImpl implements DocAfterBS {

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
		

		if (StringTools.hasText(kc63Dto.getCp())) {
			if ("0".equals(kc63Dto.getCp())) {
				sql.append("  and a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101='5' ");
			}else {
				sql.append("  and a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101='2' ");
			}
		}else {
			sql.append("  and a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101='2' ");
		}
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
				Kc63DTO.class);

		return result;
	}

	public Page queryKc62sWithPage(Page page, Kc62DTO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020," +
				"(t2.baz020+1) baz025,t2.akc193,t2.akc050,t2.aac002,t2.akc253,t2.akc254,t2.bac003,t1.* from kc62 t1,kc63 t2 where t1.baz003 is not null and t1.baz001=t2.baz001 ");

		sql.append(" and t1.baz001 in (" + queryDto.getBaz001() + ")");
		if (StringTools.hasText(queryDto.getCp())) {
			if ("0".equals(queryDto.getCp())) {
				sql.append(" and t1.baz031 = '04' and t1.baz101 = '5'");
			}else {
				sql.append(" and t1.baz031 = '04' and t1.baz101 = '2'");
			}
		}else {
			sql.append(" and t1.baz031 = '04' and t1.baz101 = '2'");
		}
		
		sql.append(" order by t1.baz001,t1.baz032 desc ");

		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;
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
	public Kc81DTO saveKc81(Kc81DTO kc81Dto){
		if (kc81Dto == null) {
			throw new BusinessException("DocAfterBS-09:传入kc81Dto为空!");
		}

		Kc81 kc81 = new Kc81();

		BeanTools.copyProperties(kc81Dto, kc81);

		String baz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ005");

		kc81.setBaz005(baz005);
		kc81.setBaz023(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
  
		CommonHibernateDaoUtils.save(kc81);
  
		BeanTools.copyProperties(kc81, kc81Dto);

		return kc81Dto;
	}
	public String getKc63Id(String id){
		Kc62 dto=CommonHibernateDaoUtils.load(Kc62.class,id);
		return dto.getBaz001();
	}
	public Kc63DTO updateKc63(String kc63id){
		return null;
	}
	public Kc62DTO updateKc62(String kc62id){
		Kc62 dto=CommonHibernateDaoUtils.load(Kc62.class,kc62id);
		dto.setBaz101("3");
		CommonHibernateDaoUtils.save(dto);
		return null;
	}
	public List<Kc62DTO> getKc62s(String kc62ids){
		StringBuffer sql=new StringBuffer("select * from kc62 a where a.baz003 in("+kc62ids+")");
		List<Kc62DTO> list= CommonJdbcDaoUtils.query(sql.toString(),Kc62DTO.class);
		return list;
	}
	
	
	public List<Kc63DTO> queryKc63ByHosptl(Kc63DTO kc63Dto) {
		StringBuffer sql = new StringBuffer("select * from( select NVL(NVL(k1.mc, k2.mc), '未知医院') as akb021," +
				"NVL(k1.bh, k2.bh) as akb020, NVL(k1.dshs, 0) dshs, NVL(k2.cqs, 0) cqs from ");
		sql.append("(select a.akb021 mc, a.akb020 bh, NVL(count(distinct a.baz001), 0) dshs from kc63 a, kc62 b ");
		sql.append("where a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101 = '2' group by a.akb021, a.akb020) k1 ");
		sql.append("full outer join (select a.akb021 mc, a.akb020 bh, NVL(count(distinct a.baz001), 0) cqs from kc63 a, kc62 b ");
		sql.append(" where a.baz001 = b.baz001 and b.baz031 = '04' and b.baz101 = '1' group by a.akb021, a.akb020) k2 ");
		sql.append("on k1.bh = k2.bh) k where k.akb021 like '%"+kc63Dto.getAkb020orakb021().trim()+"%' or trim(k.akb020) = '"+kc63Dto.getAkb020orakb021().trim()+"'  order by k.dshs desc");
		List<Kc63DTO> result=CommonJdbcDaoUtils.query(sql.toString(), Kc63DTO.class);
		return result;
	}
}
