package com.wondersgroup.bc.k5.f10506002.bs.impl;

import java.util.List;

import com.wondersgroup.bc.k5.f10506002.bs.F10506002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc62;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc81;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10506002.vo.QueryNumberVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10506002BSImpl implements F10506002BS {

	public Page queryComplaintHandling(Page page, Kc63DTO kc63Dto) {
		StringBuffer sql = new StringBuffer(
				" select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, "
						+ "a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, a.aaz307, a.akf001, a.aae386, a.aaz263,"
						+ " a.aka130, a.akc194, a.ake038, a.akc254, a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185,"
						+ " a.aka120, a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, a.aae031, a.baz020, "
						+ "a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, a.aaz308, a.aaz217, a.akc190,a.baz101,a.baz102 from"
						+ " kc63 a,kc62 b  where 1=1 and a.baz001 = b.baz001 and b.baz102='5' and (b.baz031='02' or b.baz031='06')");

		if (StringTools.hasText(kc63Dto.getBaz001())) {
			sql.append(" and a.baz001 = '" + kc63Dto.getBaz001() + "' ");
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
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63DTO.class);

		return result;
	}

	public List<Kc73DTO> queryComplaintHandlingDetail(Kc73DTO kc73Dto) {
		if (!StringTools.hasText(kc73Dto.getBaz001())) {
			throw new BusinessException("MedAuditBS-01:查询单据明细信息传入Baz001为空!");
		}
		StringBuffer sql = new StringBuffer(" select * from kc73 where 1=1 ");
		sql.append(" and baz001 = '" + kc73Dto.getBaz001() + "'");
		List<Kc73DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc73DTO.class);
		return list;
	}

	public Page queryComplaintHandlingInfo(Page page,
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		StringBuffer sql = new StringBuffer(
				" select t2.aac003,t2.aac004,t2.aac006,t2.akb021,t2.akc194,t2.akc194 akc196,t2.baz020,(t2.baz020+1) baz025,t2.akc193,t2.akc050,t2.aac002,t2.akc253,t2.akc254,t2.bac003,t1.* from kc62 t1,kc63 t2 where t1.baz001=t2.baz001 and t1.baz102='5'");

		if (StringTools.hasText(complaintHandlingKc62VO.getBaz001())) {
			sql.append(" and t1.baz001 in ("
					+ complaintHandlingKc62VO.getBaz001() + ")");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				ComplaintHandlingKc62VO.class);

		return result;
	}

	public List<Kc62DTO> queryComplaintHandlingList(Kc62DTO kc62Dto) {
		StringBuffer sql = new StringBuffer(
				" select * from kc62 t1 where (t1.baz031='06' or t1.baz031='02') and t1.baz102='5' ");

		if (StringTools.hasText(kc62Dto.getBaz003())) {
			sql.append(" and t1.baz003 in (" + kc62Dto.getBaz003() + ")");
		}
		List<Kc62DTO> lists = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return lists;
	}

	public List<Kc62DTO> queryComplaintHandlingUpdList(Kc62DTO kc62Dto) {
		StringBuffer sql = new StringBuffer(
				" select * from kc62 t1 where t1.baz102='5' ");

		if (StringTools.hasText(kc62Dto.getBaz003())) {
			sql.append(" and t1.baz001 in (" + kc62Dto.getBaz001() + ")");
		}
		List<Kc62DTO> lists = CommonJdbcDaoUtils.query(sql.toString(),
				Kc62DTO.class);
		return lists;
	}

	public List<Kc72DTO> queryComplaintHandlingInfoDetail(Kc72DTO kc72Dto) {
		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("MedAuditBS-01:查询单据明细信息传入Baz003为空!");
		}
		StringBuffer sql = new StringBuffer(" select * from kc72 where 1=1 ");
		sql.append(" and baz003 = '" + kc72Dto.getBaz003() + "'");
		List<Kc72DTO> list = CommonJdbcDaoUtils.query(sql.toString(),
				Kc72DTO.class);
		return list;
	}

	public Kc62DTO getKc62ById(String baz001) {
		Kc62DTO kc62Dto = new Kc62DTO();

		Kc62 kc62 = CommonHibernateDaoUtils.load(Kc62.class,
				Long.parseLong(baz001));

		if (kc62 != null) {
			BeanTools.copyProperties(kc62, kc62Dto);
		}

		return kc62Dto;
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

	public List<QueryNumberVO> getQueryNumberVO(String akb020) {
		StringBuffer sql = new StringBuffer("select * from(");

		sql.append(" select nvl(k1.akb020, k2.akb020) yybh,");
		sql.append(" nvl(k1.akb021, k2.akb021) yymc,");
		sql.append("nvl(dsssh, 0) dssshs,nvl(cq, 0) cqs from (");
		// 复议申请审核数
		sql.append(" select a.akb020, a.akb021, count(distinct b.baz001) dsssh from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '06' or b.baz031 = '02') and b.baz102='5'  group by a.akb020, a.akb021) k1");
		// 超期数
		sql.append(" full outer join (select a.akb020, a.akb021, count(distinct b.baz001) cq from kc63 a, kc62 b where a.baz001 = b.baz001 and (b.baz031 = '06' or b.baz031 = '02') and b.baz102 = '5' group by a.akb020, a.akb021) k2");
		sql.append(" on k1.akb020 = k2.akb020)k");

		sql.append(" where 1=1 ");
		if (StringTools.hasText(akb020)) {
			sql.append(" and trim(k.yybh) = '" + akb020.trim() + "' or k.yymc like '%"
					+ akb020.trim() + "%'");
		}
		// 按参数值降序显示
		sql.append(" order by dssshs desc,cqs desc");

		List<QueryNumberVO> queryNumberVOList = CommonJdbcDaoUtils.query(
				sql.toString(), QueryNumberVO.class);
		return queryNumberVOList;
	}

	public Kc63DTO getKc63ById(String baz001) {
		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("F10504002BS-04:传入baz001为空!");
		}

		Kc63DTO kc63Dto = new Kc63DTO();

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, baz001);

		if (kc63 != null) {
			BeanTools.copyProperties(kc63, kc63Dto);
		}

		return kc63Dto;
	}

}
