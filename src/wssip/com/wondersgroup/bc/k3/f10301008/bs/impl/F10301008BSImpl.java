package com.wondersgroup.bc.k3.f10301008.bs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af52;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af54;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af62;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af63;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af64;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af52DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af54DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af62DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af63DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af64DTO;
import com.wondersgroup.bc.k3.f10301008.bs.F10301008BS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10301008BSImpl implements F10301008BS{

	public Af54DTO queryAf54Info(Af54DTO af54dto) {
		StringBuffer sql = new StringBuffer();
		List<Object> args = new ArrayList<Object>();
		if("1".equals(af54dto.getApa709())){
			sql.append("select a.ape008 as ape724, b.aac004, b.aac002, c.apf094, k.ape726, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APE701' and t1.aaa102 = (select t2.apa701 from af38 t2 where t2.aaz077 = ?) ) as apa701 from af31 a,yboltp.ac01 b, af53 c,");
			sql.append(" (select f.ape726 from af38 f where f.abb001 = (select max(d.abb001) as abb001 from af31, af38 d ");
			sql.append(" where af31.aaz077 = d.aaz077 and af31.aaz077 = ? )) k");
			args.add(af54dto.getAaz077());
			args.add(af54dto.getAaz077());
			sql.append(" where a.aaz010 = b.aac001 and a.aaz318 = c.aaz318 and a.aaz077 = ? ");
			args.add(af54dto.getAaz077());
		}
		if("2".equals(af54dto.getApa709())){
			sql.append("select a.ape008 as ape724,a.aaz010, k.ape726, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APE702' and t1.aaa102 = (select distinct(t2.apa701) from af38 t2 where t2.aaz077 = ?) ) as apa701  from af31 a,");
			sql.append(" (select f.ape726 from af38 f where f.abb001 in ");
			sql.append(" (select max(d.abb001) as abb001 from af31, af38 d");
			sql.append(" where af31.aaz077 = d.aaz077 and af31.aaz077 = ? )) k");
			args.add(af54dto.getAaz077());
			sql.append(" where a.aaz077 = ? ");
			args.add(af54dto.getAaz077());
			args.add(af54dto.getAaz077());
		}
		if ("3".equals(af54dto.getApa709())) {
			sql.append("select a.ape008 as ape724,a.aaz010, k.ape726, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APA701' and t1.aaa102 = (select distinct(t2.apa701) from af38 t2 where t2.aaz077 = ?) ) as apa701  from af31 a,");
			sql.append(" (select f.ape726 from af38 f where f.abb001 in ");
			sql.append(" (select max(d.abb001) as abb001 from af31, af38 d");
			sql.append(" where af31.aaz077 = d.aaz077 and af31.aaz077 = ? )) k");
			args.add(af54dto.getAaz077());
			sql.append(" where a.aaz077 = ? ");
			args.add(af54dto.getAaz077());
			args.add(af54dto.getAaz077());
		}
		return CommonJdbcDaoUtils.get(sql.toString(), Af54DTO.class, args.toArray());
	}

	public Aa10DTO getAa10ByCode(String apa701) {
		String sql = "select a.* from aa10 a where a.aaa100 = 'APA701' and a.aaa102 = ? ";
		return CommonJdbcDaoUtils.getFirst(sql, Aa10DTO.class, apa701);
	}

	public Af31 getAf31ById(String aaz077) {
		Af31 af31 = CommonHibernateDaoUtils.load(Af31.class, aaz077);
		return af31;
	}

	public void updateAf31(Af31 af31) {
		CommonHibernateDaoUtils.update(af31);
	}

	public Af54DTO saveAf54(Af54DTO af54dto) {
		Af54 af54 = new Af54();
		String aaz048 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ048");
		af54dto.setAaz048(Long.valueOf(aaz048));
		BeanTools.copyPropertiesIgnoreNull(af54dto, af54);
		CommonHibernateDaoUtils.save(af54);
		return af54dto;
	}

	public Map<String, Object> queryAf54WithMap(Af54DTO af54dto) {
		StringBuffer sql = new StringBuffer();
		List<Object> args = new ArrayList<Object>();
		if("1_1".equals(af54dto.getType()) ){
			sql.append(" SELECT a.abe177,a.ape726,a.aac002,a.aae005,a.aae006,a.ape029,a.ape724,a.aac005,");
			sql.append("  k.baz023, k.baz024,k1.apf094, b.aaa103 as aac004, c.aaa103 as apa065");
			sql.append(" from af54 a , aa10 b , aa10 c, ");
			sql.append(" (select f.baz023,f.baz024 from af38 f ");
			sql.append("  where f.abb001 in (select max(d.abb001) as abb001 ");
			sql.append(" from af38 d where d.aaz077 = ? ))k, ");
			args.add(af54dto.getAaz077());
			sql.append(" (select apf094 from af53,af31 where af53.aaz318 = af31.aaz318 and af31.aaz077 = ?)k1");
			args.add(af54dto.getAaz077());
			sql.append(" where a.aac004 = b.aaa102 and b.aaa100 = 'AAC004' and a.apa065 = c.aaa102 and c.aaa100 = 'APA065' and a.aaz048 = ? ");
			args.add(af54dto.getAaz048());
		}
		if("3_1".equals(af54dto.getType())){
			sql.append(" SELECT a.*,b.aaz010, k.baz023, k.baz024 from af54 a,af31 b, ");
			sql.append(" (select f.baz023, f.baz024 from af38 f");
			sql.append(" where f.abb001 in (select max(d.abb001) as abb001 from af38 d where d.aaz077 = ? )) k");
			args.add(af54dto.getAaz077());
			sql.append(" where a.aaz077 = b.aaz077 and a.aaz048 = ? ");
			args.add(af54dto.getAaz048());
		}
		if ("1_2".equals(af54dto.getType())) {
			
			sql.append("select a.abe177, a.ape724, " +
					"(select t1.aaa103 from aa10 t1 where t1.aaa100 = 'AAC004' and t1.aaa102 = (select t2.aac004 from af54 t2 where t2.aaz048 = ?)) as aac004, " +
					"a.aac005, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APA065' and t1.aaa102 = (select t2.apa065 from af54 t2 where t2.aaz048 = ?)) as apa065, " +
					"a.aae005, a.aac002, a.aae006, a.ape029, a.apa701, a.ape726, a.apf094 from af54 a where a.aaz048 = ? ");
			args.add(af54dto.getAaz048());
			args.add(af54dto.getAaz048());
			args.add(af54dto.getAaz048());
			
		}
		if("3_2".equals(af54dto.getType())){
			sql.append(" select a.* from af54 a where a.aaz048 = ?");
			args.add(af54dto.getAaz048());
		}
		if("3_3".equals(af54dto.getType())){
			sql.append(" select a.* from af54 a where a.aaz048 = ?");
			args.add(af54dto.getAaz048());
		}
		if("2_1".equals(af54dto.getType())){
			sql.append(" select k.*,k1.* from af54 k , (SELECT a.aaz010, trim(b.akb020) akb020, c.akb021 ");
			sql.append(" FROM af31 a, kf05 b, kb01 c ");
			sql.append(" where a.aaz010 = b.aaz263 and b.akb020 = c.akb020 and aaz077 = ? )k1");
			args.add(af54dto.getAaz077());
			sql.append("  where k.aaz048 = ? ");
			args.add(af54dto.getAaz048());
		}
		return CommonJdbcDaoUtils.queryForMap(sql.toString(), args.toArray());
	}
	
	public Aa10DTO getAa10ByCode_1(String aaa027) {
		String sql = "select a.* from aa10 a where a.aaa100 = 'AAA027' and a.aaa102 = ?";
		return CommonJdbcDaoUtils.getFirst(sql, Aa10DTO.class, aaa027);
	}

	public Af54DTO getMaxAbe177() {
		String sql = "SELECT max(substr(nvl(a.abe177,'0000000'),-7,7)) as abe177 from af54 a";
		return CommonJdbcDaoUtils.getFirst(sql, Af54DTO.class);
	}

	public Af53 getAf53ById(Long aaz318) {
		return CommonHibernateDaoUtils.load(Af53.class, aaz318);
	}

	public Af53 updateAf53(Af53 af53) {
		CommonHibernateDaoUtils.update(af53);
		return af53;
	}

	public Af52DTO getMaxAbf041() {
		String sql = "SELECT max(substr(nvl(a.abf041,'0000000'),-7,7)) as abf041 from af52 a";
		
		return CommonJdbcDaoUtils.getFirst(sql, Af52DTO.class);
	}

	public Af52DTO saveAf52(Af52DTO af52dto) {
		Af52 af52 = new Af52();
		String abz418 = CommonHibernateDaoUtils.getSequenceValue("SEQ_ABZ418");
		af52dto.setAbz418(Long.valueOf(abz418));
		BeanTools.copyPropertiesIgnoreNull(af52dto, af52);
		CommonHibernateDaoUtils.save(af52);
		return af52dto;
	}

	public Map<String, Object> queryAf52WithMap(Af52DTO af52dto) {
		String sql = "select a.* from af52 a where a.abz418 = ?";
		return CommonJdbcDaoUtils.queryForMap(sql, af52dto.getAbz418());
	}

	public Af52DTO getAf52ByAaz318(Long aaz318) {
		String sql = "select a.* from af52 a where a.aaz318 = ?";
		return CommonJdbcDaoUtils.getFirst(sql, Af52DTO.class, aaz318);
	}

	public List<Af31DTO> getAf31ListByAaz318(Long aaz318,String aaz077) {
		String sql = "select a.* from af31 a where a.aaz318 = ? and a.aaz077 <> ?";
		return CommonJdbcDaoUtils.query(sql, Af31DTO.class, new Object[]{aaz318,aaz077});
	}

	public Af62DTO getAf62ByAaz077(String aaz077) {
		String sql = "select a.* from af62 a where a.aaz077 = ?";
		return CommonJdbcDaoUtils.getFirst(sql, Af62DTO.class, aaz077);
	}

	public Af62DTO getMaxAke001() {
		String sql = "SELECT max(substr(nvl(a.ake001,'0000000'),-7,7)) as ake001 from af62 a";
		return CommonJdbcDaoUtils.getFirst(sql, Af62DTO.class);
	}

	public Af62DTO saveAf62(Af62DTO af62dto) {
		Af62 af62 = new Af62();
		String baz071 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ071");
		af62dto.setBaz071(Long.valueOf(baz071));
		BeanTools.copyPropertiesIgnoreNull(af62dto, af62);
		CommonHibernateDaoUtils.save(af62);
		return af62dto;
	}

	public Map<String, Object> queryAf62WithMap(Long baz071) {
		String sql = "select max(a.ake001) ake001, max(a.ape008) ape008, max(a.aaz010) aaz010, max(a.ake079) ake079, max(a.aae036) aae036, max(b.apa701) apa701, max(b.ape726) ape726 from af62 a, af54 b where a.aaz077 = b.aaz077 and a.baz071 = ? group by a.aaz077";
		return CommonJdbcDaoUtils.queryForMap(sql, baz071);
	}

	public Af63DTO getAf63ByAaz077(String aaz077) {
		String sql = "select a.* from af63 a where a.aaz077 = ?";
		return CommonJdbcDaoUtils.getFirst(sql, Af63DTO.class, aaz077);
	}

	public Af63DTO getMaxAke001_af63() {
		String sql = "SELECT max(substr(nvl(a.ake001,'0000000'),-7,7)) as ake001 from af63 a";
		return CommonJdbcDaoUtils.getFirst(sql, Af63DTO.class);
	}

	public Af63DTO saveAf63(Af63DTO af63dto) {
		Af63 af63 = new Af63();
		String ade001 = CommonHibernateDaoUtils.getSequenceValue("SEQ_ADE001");
		af63dto.setAde001(Long.valueOf(ade001));
		BeanTools.copyPropertiesIgnoreNull(af63dto, af63);
		CommonHibernateDaoUtils.save(af63);
		return af63dto;
	}

	public Map<String, Object> queryAf63WithMap(Long ade001) {
//		String sql = "select a.* from af63 a where a.ade001 = ?";
		StringBuffer sql = new StringBuffer("select * from (select a.*, b.ade064, b.abe177 from af63 a, af54 b where a.ade001 = ? and a.aaz077 = b.aaz077 order by b.aae036 desc) where rownum = 1 ");
		return CommonJdbcDaoUtils.queryForMap(sql.toString(), ade001);
	}

	public Af54DTO getLastAf54ByAaz077(String aaz077) {
		String sql = "select a.* from af54 a where a.aaz077 = ? order by a.aae036 desc";
		return CommonJdbcDaoUtils.getFirst(sql, Af54DTO.class, aaz077);
	}

	public Af62DTO getLastAf62ByAaz077(String aaz077) {
		String sql = "select a.* from af62 a where a.aaz077 = ? order by a.aae036 desc";
		return CommonJdbcDaoUtils.getFirst(sql, Af62DTO.class, aaz077);
	}

	public Af64DTO getAf64ByAaz077(String aaz077) {
		String sql = "select a.* from af64 a where a.aaz077 = ? order by a.aae036 desc";
		return CommonJdbcDaoUtils.getFirst(sql, Af64DTO.class, aaz077);
	}

	public Af64DTO getMaxAke001_af64() {
		String sql = "SELECT max(substr(nvl(a.ake001,'0000000'),-7,7)) as ake001 from af64 a";
		return CommonJdbcDaoUtils.getFirst(sql, Af64DTO.class);
	}

	public Af64DTO saveAf64(Af64DTO af64dto) {
		Af64 af64 = new Af64();
		String age001 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AGE001");
		af64dto.setAge001(Long.valueOf(age001));
		BeanTools.copyPropertiesIgnoreNull(af64dto, af64);
		CommonHibernateDaoUtils.save(af64);
		return af64dto;
	}

	public Map<String, Object> queryAf64WithMap(Long age001) {
		String sql ="select a.* from af64 a where a.age001 = ? ";
		return CommonJdbcDaoUtils.queryForMap(sql, age001);
	}

	public Af31DTO getAf31DtoById(String aaz077) {

		Af31DTO af31Dto = new Af31DTO();
		
		StringBuffer sql = new StringBuffer("select * from (select a.aaz010, a.ape008, b.abe177, b.aae036,b.ade064 from af31 a,af54 b where a.aaz077 = " + aaz077 + " and b.aaz077 = " + aaz077 + " and a.aaz077 = b.aaz077 order by b.aae036 desc) where rownum = 1");

		af31Dto = CommonJdbcDaoUtils.get(sql.toString(), Af31DTO.class);

		return af31Dto;
	}

	public Af31DTO queryAf31ByAaz077(String aaz077) {
		
		StringBuffer sql = new StringBuffer("select a.ape008, a.aaz010, b.ape726, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APA701' and t1.aaa102 = (select t2.apa701 from af31 t2 where t2.aaz077 = '" + aaz077 + "')) as apa701 from af31 a, af38 b where a.aaz077 = b.aaz077 and a.aaz077 = '" + aaz077 + "'");
		
		Af31DTO af31dto = CommonJdbcDaoUtils.get(sql.toString(), Af31DTO.class);
		
		return af31dto;
	}
}
