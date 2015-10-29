package com.wondersgroup.bc.k3.f10301004.bs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af37;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af61;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af61DTO;
import com.wondersgroup.bc.k3.f10301004.bs.F10301004BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301004.vo.Af61VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301004BSImpl implements F10301004BS{


	public void relateRecord(Af53DTO af53dto) {
		
		StringBuffer sql = new StringBuffer("update af37 a set aaz318 = " + af53dto.getAaz318() + " where a.aaz381 = " + af53dto.getAaz381());
		
		CommonJdbcDaoUtils.update(sql.toString());
	}
	/**若果需要1对多，只需要将a.aaz318 is null删掉即可*/
	public Page queryAf37WithPage(Page page, Af37DTO af37dto) {
		
		StringBuffer sql = new StringBuffer("select max(a.aaz381) aaz381, max(a.aaa027) aaa027, max(a.ape712) ape712, max(a.aae007) aae007, " +
				"max(a.ape134) ape134, max(a.ape135) ape135, max(a.aac002) aac002, max(a.aac003) aac003, max(a.aac004) aac004, " +
				"max(a.aac005) aac005, max(a.apa065) apa065, max(a.ape029) ape029, max(a.aae006) aae006, max(a.aae005) aae005, " +
				"max(a.aae013) aae013, max(a.abe177) abe177 from af37 a where 1 = 1 ");
		
		if (StringTools.hasText(af37dto.getApe711Start())) {
			
			sql.append(" and a.ape712 = '" + af37dto.getApe711Start() + "'");
		}
		if (StringTools.hasText(af37dto.getApe711End())) {
			
			sql.append(" and a.ape712 <= '" + af37dto.getApe711End() + "'");
		}
		if (StringTools.hasText(af37dto.getApe712Start())) {
			sql.append(" and a.ape712 = " + af37dto.getApe712Start() + "");
		}
		if (StringTools.hasText(af37dto.getApa065())) {
			
			sql.append(" and a.apa065 = '" + af37dto.getApa065() + "'");
		}
		
		if (StringTools.hasText(af37dto.getAaa027())) {
			sql.append(" and a.aaa027 = '" + af37dto.getAaa027() + "'");
			
		}
		
		sql.append(" and a.aaz318 is null group by a.abe177");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af37.class);
		
		return result;
	}

	public Af61VO queryApprovalInfo(Af61VO af61vo) {
		List<Object> args = new ArrayList<Object>();
		StringBuffer sql = new StringBuffer("select a.abb006,a.apf094,b.ape714,b.aae306,b.aae305,b.ape711,b.aac302, ");
		sql.append(" k1.*,k2.*,k3.* from af53 a , af32 b,");
		sql.append(" (SELECT a1.ailmen as adf005,a1.ailtime as adf006,a1.ailyj as adf004 FROM ");
		sql.append(" approval_info_list a1 where a1.aaz318 = ? and a1.aclid=1)k1,");
		args.add(af61vo.getAaz318());
		sql.append(" (SELECT a2.ailmen as adf008,a2.ailtime as adf009,a2.ailyj as adf007 FROM");
		sql.append(" approval_info_list a2 where a2.aaz318 = ? and a2.aclid=2)k2,");
		args.add(af61vo.getAaz318());
		sql.append(" (select a3.apa701 from af31 a3 where a3.aaz077 = (select max(aaz077) from af31 a3 where a3.aaz318 = ? ))k3");
		args.add(af61vo.getAaz318());
		sql.append("  where a.aaz281 = b.aaz281 and a.aaz318 = ? ");
		args.add(af61vo.getAaz318());
		return CommonJdbcDaoUtils.get(sql.toString(), Af61VO.class, args.toArray());
	}
	public Aa10DTO getAa10ByCode(String apa701) {
		String sql = "select a.* from aa10 a where a.aaa100 = 'APA701' and a.aaa102 = ? ";
		return CommonJdbcDaoUtils.getFirst(sql, Aa10DTO.class, apa701);
	}

	public Af53 getAf53ByAaz318(Long aaz318) {
		return CommonHibernateDaoUtils.load(Af53.class, aaz318);
	}

	public Af61DTO saveAf61(Af61DTO af61dto) {
		Af61 af61 = new Af61();
		String abz618 = CommonHibernateDaoUtils.getSequenceValue("SEQ_ABZ618");
		af61dto.setAbz618(Long.valueOf(abz618));
		BeanTools.copyPropertiesIgnoreNull(af61dto, af61);
		CommonHibernateDaoUtils.save(af61);
		return af61dto;
	}

	public Map<String, Object> queryAf61WithMap(Long abz618) {
		String sql = "select a.*,b.aaa103 as abb006 from af61 a,aa10 b where a.abb006 = b.aaa102 and b.aaa100 = 'ABB006' and a.abz618 = ?";
		return CommonJdbcDaoUtils.queryForMap(sql, abz618);
	}
	
	public Kf05 queryKc05ByAaz263(String aaz010, String aaz077) {
		
		StringBuffer sql = new StringBuffer("select a.*, (select t.aaa103 from aa10 t where t.aaa100 = 'APE702' and t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701, b.akb020, b.akb021 from yboltp.kf05 a,yboltp.kb01 b  where b.aaz107 = a.aaz107 and a.aaz263 = '" + aaz010 + "' ");
		
		Kf05 kf05 = CommonJdbcDaoUtils.get(sql.toString(), Kf05.class);
		
		return kf05;
	}

	public Ac01 queryAc01ByAaz077(String aaz010, String aaz077) {
		
		StringBuffer sql = new StringBuffer("select a.*, (select t.aaa103 from aa10 t where t.aaa100 = 'APE701' and t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701 from yboltp.ac01 a where a.aac001 = '" + aaz010 + "' ");
		
		Ac01 ac01 = CommonJdbcDaoUtils.get(sql.toString(), Ac01.class);
		
		return ac01;
	}

	public Kb01 queryKb01ByAaz077(String aaz010, String aaz077) {
		
		StringBuffer sql = new StringBuffer("select a.*, (select t.aaa103 from aa10 t where t.aaa100 = 'APA701' and t.aaa102 = (select t1.apa701 from af31 t1 where t1.aaz077 = '" + aaz077 + "')) as apa701 from yboltp.kb01 a where a.aaz107 = '" + aaz010 + "' ");
		
		Kb01 kb01 = CommonJdbcDaoUtils.get(sql.toString(), Kb01.class);
		
		return kb01;
	}

	public void delete(String aaz077) {
		StringBuffer sql = new StringBuffer("delete af31 a where a.aaz077 = '" + aaz077 + "' ");
		CommonJdbcDaoUtils.delete(sql.toString());
	}

	public Af37DTO getAf37ByAaz381(Long aaz381) {
		
		StringBuffer sql = new StringBuffer("select * from af37 a where a.aaz381 = ? order by a.aaz381 desc ");
		
		return CommonJdbcDaoUtils.getFirst(sql.toString(), Af37DTO.class, aaz381);
	}

	public void relateRecordByAaz381(Af37DTO af37dto) {
		
		Af37 af37 = new Af37();
		
		BeanTools.copyProperties(af37dto, af37);
		CommonHibernateDaoUtils.save(af37);
	}
}
