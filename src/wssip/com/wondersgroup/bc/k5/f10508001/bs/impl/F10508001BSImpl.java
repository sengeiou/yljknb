package com.wondersgroup.bc.k5.f10508001.bs.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.wondersgroup.bc.k5.f10508001.bs.F10508001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10508001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10507002.vo.HosDetailVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10508001BSImpl implements F10508001BS {

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(
				"  select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, "
						+ "a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, a.aaz307, "
						+ "a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, "
						+ "a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, "
						+ "a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, "
						+ "a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, "
						+ "a.aaz308, a.aaz217, a.akc190,a.baz101,a.baz102 from kc63 a,kc62 b");
		sql.append("  where a.baz001 = b.baz001 and b.baz021 <> '1'");
		if (StringTools.hasText(kc63Dto.getZsdmc())) {//根据知识点查询
			sql.append(" and b.ake009 in ("+kc63Dto.getZsdmc()+")");
		}
		if (StringTools.hasText(kc63Dto.getBaz101())) {
			sql.append(" and b.baz101 = '" + kc63Dto.getBaz101() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getBaz102())) {
			sql.append(" and b.baz102 = '" + kc63Dto.getBaz102() + "' ");
		}
		if (StringTools.hasText(kc63Dto.getBaz021())) {
			sql.append(" and b.baz021 = '" + kc63Dto.getBaz021() + "' ");
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
		if (StringTools.hasText(kc63Dto.getAaz263())) {
			sql.append(" and a.aaz263 = '" + kc63Dto.getAaz263() + "' ");
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
		if (kc63Dto.getBaz023Start() != null) {
			sql.append(" and to_number(to_char(b.baz023,'yyyyMMdd'),'99999999') >= "
					+ DateTools.getYYYYMMDD(kc63Dto.getBaz023Start())
					+ " ");
		}
		if (kc63Dto.getBaz023End() != null) {
			sql.append(" and to_number(to_char(b.baz023,'yyyyMMdd'),'99999999') <= "
					+ DateTools.getYYYYMMDD(kc63Dto.getBaz023End())
					+ " ");
		}
		if (StringTools.hasText(kc63Dto.getBaz031())) {
			String baz031str=getState(kc63Dto.getBaz031());
			sql.append(" " + baz031str + " ");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63.class);

		return result;

	}
	
	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select (b.akb065-b.ake039) akc254,a.aka130,a.aac001,a.aac003,a.aac004,a.aac006,a.akb021,a.akc194,a.akc190,a.akc021,a.baz020,(a.AKC185||' '||a.akc050||' '||a.AKC186||' '||a.AKC274||' '||a.AKC276) akc050, ");
		sql.append(" (select baz026 from kc81 where kc81.BAZ023=(select max(BAZ023) from kc81 where kc81.baz003=b.baz003 group by baz003) and kc81.baz003=b.baz003) baz022str, ");
		sql.append(" (case when b.baz102 is not null and b.baz102<>0  then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ102' and aa10.aaa102 = b.baz102) when b.baz101 is not null and b.baz101 <> 1 and b.baz032 <> 0 then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ101' and aa10.aaa102 = b.baz101) when b.baz031 is not null then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ031' and aa10.aaa102 = b.baz031) end) baz031str,");
		sql.append(" b.* from kc62 b,kc63 a where b.baz003 is not null and b.baz001=a.baz001");
		sql.append(" and b.baz001 in (" + queryDto.getBaz001() + ")");
		if (StringTools.hasText(queryDto.getBaz021())) {
			sql.append(" and b.baz021 in (" + queryDto.getBaz021() + ") ");
		}
		if (StringTools.hasText(queryDto.getAke007())) {
			sql.append(" and b.ake009 in (" + queryDto.getAke007() + ") ");
		}
		if (StringTools.hasText(queryDto.getBaz101())) {
			sql.append(" and b.baz101 = '" + queryDto.getBaz101() + "' ");
		}
		if (StringTools.hasText(queryDto.getBaz102())) {
			sql.append(" and b.baz102 = '" + queryDto.getBaz102() + "' ");
		}
		if (queryDto.getBaz023Start() != null) {
			sql.append(" and to_number(to_char(b.baz023,'yyyyMMdd'),'99999999') >= "
					+ DateTools.getYYYYMMDD(queryDto.getBaz023Start())
					+ " ");
		}
		if (queryDto.getBaz023End() != null) {
			sql.append(" and to_number(to_char(b.baz023,'yyyyMMdd'),'99999999') <= "
					+ DateTools.getYYYYMMDD(queryDto.getBaz023End())
					+ " ");
		}
		if (StringTools.hasText(queryDto.getBaz031())) {
			String baz031str=getState(queryDto.getBaz031());
			sql.append(" " + baz031str + " ");
		}
		sql.append(" order by b.baz001,b.baz032 desc ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc62VO.class);

		return result;
	}
	
	public Kc63DTO getKc63ById(String baz001) {
		if (!StringTools.hasText(baz001)) {
			throw new BusinessException("F10506003BS-01:传入baz001为空!");
		}

		Kc63DTO kc63Dto = new Kc63DTO();

		Kc63 kc63 = CommonHibernateDaoUtils.load(Kc63.class, baz001);

		if (kc63 != null) {
			BeanTools.copyProperties(kc63, kc63Dto);
		}

		return kc63Dto;
	}
	/**
	 * 获取所有的流转状态
	 * @param baz031 
	 * @return
	 */
	private String getState(String baz031) {
		String state=" and (";
		String[] baz031s=baz031.split(",");
		List<Integer> bazFList=new ArrayList<Integer>();
		List<Integer> bazZList=new ArrayList<Integer>();
		for (int i = 0; i < baz031s.length; i++) {
			Integer baz031int=Integer.parseInt(baz031s[i].substring(1, baz031s[i].length()-1));
			if (baz031int>10) {//取子节点值
				bazZList.add(baz031int);
			}else {
				bazFList.add(baz031int);
			}
		}
		for (int i = 0; i < bazFList.size(); i++) {//循环拼装妇节点
			Integer fjd=bazFList.get(i);
			for (int j = 1; j < 10; j++) {//当有夫节点时子节点默认全选 去掉子节点
				Integer obj =fjd*10+j;
				bazZList.remove(obj);
			}
			if (fjd==1) {
				state =state + " (b.baz031 ='01') or";
			}else if (fjd==2) {
				state =state + " (b.baz031 in ('03','05')) or";
			}else if (fjd==3) {
				state =state + " (b.baz031 in ('02','04') and b.baz101 ='1' ) or";
			}else if (fjd==4) {
				state =state + " (b.baz031 ='06' and b.baz101 in ('6','7','8') and b.baz102 ='0' ) or";
			}else if (fjd==5) {
				state =state + " (b.baz031 ='06' and b.baz102 ='1') or";
			}else if (fjd==6) {
				state =state + " (b.baz031 ='06' and b.baz102 in ('3','6','7')) or";
			}else if (fjd==7) {
				state =state + " (b.baz031 ='06' and b.baz102 ='2') or";
			}else if (fjd==8) {
				state =state + " (b.baz031 ='07' ) or";
			}
		}
		for (int i = 0; i < bazZList.size(); i++) {
			Integer zjd=bazZList.get(i);
			if (zjd==11) {
				state =state + " (b.baz031 ='01') or";
			}else if (zjd==21) {
				state =state + " (b.baz031 in ('05')) or";
			}else if (zjd==22) {
				state =state + " (b.baz031 in ('03')) or";
			}else if (zjd==31) {
				state =state + " (b.baz031 in ('02') and b.baz101 ='1' ) or";
			}else if (zjd==32) {
				state =state + " (b.baz031 in ('04') and b.baz101 ='1' ) or";
			}else if (zjd==41) {
				state =state + " (b.baz031 ='06' and b.baz101 in ('6') and b.baz102 ='0' ) or";
			}else if (zjd==42) {
				state =state + " (b.baz031 ='06' and b.baz101 in ('7') and b.baz102 ='0' ) or";
			}else if (zjd==43) {
				state =state + " (b.baz031 ='06' and b.baz101 in ('8') and b.baz102 ='0' ) or";
			}else if (zjd==51) {
				state =state + " (b.baz031 ='06' and b.baz102 ='1') or";
			}else if (zjd==61) {
				state =state + " (b.baz031 ='06' and b.baz102 in ('3')) or";
			}else if (zjd==62) {
				state =state + " (b.baz031 ='06' and b.baz102 in ('6')) or";
			}else if (zjd==63) {
				state =state + " (b.baz031 ='06' and b.baz102 in ('7')) or";
			}else if (zjd==71) {
				state =state + " (b.baz031 ='06' and b.baz102 ='2') or";
			}else if (zjd==81) {
				state =state + " (b.baz031 ='07' ) or";
			}
		}
		state=state.substring(0, state.length()-2);
		state =state+") ";
		return state;
	}
	
	public List<Kc72DTO> queryKc72(Kc72DTO kc72Dto) {
		if (!StringTools.hasText(kc72Dto.getBaz003())) {
			throw new BusinessException("F10506003BS-02:查询单据明细违规信息传入Baz003为空!");
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
		sql.append("select * from (");
		sql.append("select nvl(k1.akb020,k2.akb020) akb020, ");
		sql.append("nvl(nvl(k1.akb021,k2.akb021),'未知医院')akb021, ");
		sql.append("nvl(dfysq,0)dfysq,nvl(cqs,0)cqs");
		sql.append(" from (select a.akb020, a.akb021, count(distinct b.baz001) dfysq ");
		sql.append(" from kc63 a, kc62 b");
		sql.append(" where a.baz001 = b.baz001 ");
		sql.append("  and (b.baz031 = '02' or b.baz031='06') and b.baz102 ='4'  ");
		sql.append("  group by a.akb020, a.akb021) k1 ");
		sql.append("full outer join ");
		sql.append(" (select a.akb020, a.akb021, count(distinct b.baz001) cqs ");
		sql.append("   from kc63 a, kc62 b ");
		sql.append("   where a.baz001 = b.baz001 ");
		sql.append("    and ( b.baz101 = '1') ");
		sql.append(" group by a.akb020, a.akb021) k2 ");
		sql.append(" on k1.akb020 = k2.akb020 )k");
		sql.append(" where 1=1 ");
		if(StringTools.hasText(hosDetailVO.getQuery())){
			sql.append("and akb020 like '%"+hosDetailVO.getQuery().trim()+"%' or akb021 like '%"+hosDetailVO.getQuery().trim()+"%'");
		}
		sql.append(" order by dfysq desc,cqs desc");
		List<HosDetailVO> result = CommonJdbcDaoUtils.query(sql.toString(),
				HosDetailVO.class);
		return result;
	}

	public List<Map<String, Object>> findKc62List(String strids) throws ParseException {
		StringBuffer sql = new StringBuffer(
				" select t2.aka130,t2.aac001,t2.aac003,t2.aac004,t2.aac006,t2.akc021,t2.akc190,t2.akb021,t2.akc194,t2.baz020,t2.akc193,(t2.AKC185||' '||t2.akc050||' '||t2.AKC186||' '||t2.AKC274||' '||t2.AKC276) akc050,t2.aac002,(t1.akb065-t1.ake039) akc254,t2.bac003,(select baz026 from kc81 where kc81.BAZ023=(select max(BAZ023) from kc81 where kc81.baz003=t1.baz003 group by baz003) and kc81.baz003=t1.baz003) baz022str, ");
		sql.append(" (case when t1.baz102 is not null and t1.baz102<>0  then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ102' and aa10.aaa102 = t1.baz102) when t1.baz101 is not null and t1.baz101 <> 1 then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ101' and aa10.aaa102 = t1.baz101) when t1.baz031 is not null then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ031' and aa10.aaa102 = t1.baz031) end) baz031str, ");
		sql.append(" t1.* from kc62 t1,kc63 t2 where t1.baz001=t2.baz001 ");
		sql.append("  and t1.baz003 in (" + strids
				+ ") order by t1.baz001,t1.baz032 desc ");

		List<Map<String, Object>> listKc62 = CommonJdbcDaoUtils
				.queryForList(sql.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Object> map : listKc62) {
			// 时间转换为string
			if (map.get("AKC194") != null) {
				map.put("AKC194", sdf.format(map.get("AKC194")));
			}
			if (map.get("BAZ020") != null) {
				map.put("BAZ020", sdf.format(map.get("BAZ020")));
			}
			if (map.get("BAZ023") != null) {
				map.put("BAZ023", sdf.format(map.get("BAZ023")));
			}
			if (map.get("BAZ024") != null) {
				map.put("BAZ024", sdf.format(map.get("BAZ024")));
			}
			if (map.get("AKC221") != null) {
				map.put("AKC221", sdf.format(map.get("AKC221")));
			}
			// 字典转换
			if (map.get("BAZ102") != null) {
				String BAZ102 = this.loadDicDataByNameAndCode("BAZ102", map
						.get("BAZ102").toString());
				map.put("BAZ102", BAZ102);
			}
			if (map.get("AKC021") != null) {
				String AKC021 = this.loadDicDataByNameAndCode("AKC021", map
						.get("AKC021").toString());
				map.put("AKC021", AKC021);
			}
			if (map.get("BAZ021") != null) {
				String BAZ021 = this.loadDicDataByNameAndCode("BAZ021", map
						.get("BAZ021").toString());
				map.put("BAZ021", BAZ021);
			}
			if (map.get("AAC006") != null) {
				Kc62VO kc62 = new Kc62VO();
				kc62.setAac006(map.get("AAC006").toString());
				String AAC006 = kc62.getAac006();
				map.put("AAC006", AAC006);
			}
			if (map.get("AAC002") != null) {
				String AAC002 = map.get("AAC002").toString() + "'";
				map.put("AAC002", AAC002);
			}
			if (map.get("AKA130") != null) {
				String AKA130 = this.loadDicDataByNameAndCode("AKA130", map
						.get("AKA130").toString());
				map.put("AKA130", AKA130);
			}
			if (map.get("AAC004") != null) {
				String AAC004 = this.loadDicDataByNameAndCode("AAC004", map
						.get("AAC004").toString());
				map.put("AAC004", AAC004);
			}
			if (map.get("AKE003") != null) {
				String ake003 = this.loadDicDataByNameAndCode("AKE003", map
						.get("AKE003").toString());
				map.put("AKE003", ake003);
			}
			if (map.get("AKA065") != null) {
				String aka065 = this.loadDicDataByNameAndCode("AKA065", map
						.get("AKA065").toString());
				map.put("AKA065", aka065);
			}
			if (map.get("BAZ032") != null) {
				String baz032 = this.loadDicDataByNameAndCode("BAZ032", map
						.get("BAZ032").toString());
				map.put("BAZ032", baz032);
			}
		}

		return listKc62;
	}

	public String loadDicDataByNameAndCode(String name,String code){
		String value=new String();
		 if(StringUtils.hasText(name) && StringUtils.hasText(code)){
		 String dicSql="select bc_sql from IP_BUSINESS_CODE t where bc_type='"+name+"'";
		 String dataSql=CommonJdbcDaoUtils.queryObject(dicSql, String.class);
		 	if(StringUtils.hasText(dataSql)){
		 		dataSql="select "+dataSql.substring(dataSql.indexOf(",")+1,dataSql.length());
		 		dataSql+=" and aaa102='"+code+"'";
		 		value=CommonJdbcDaoUtils.queryObject(dataSql,String.class);
		 	}
		 }
		 return value;
	}
}
