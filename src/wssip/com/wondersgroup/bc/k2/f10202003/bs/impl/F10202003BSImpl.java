package com.wondersgroup.bc.k2.f10202003.bs.impl;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.k2.f10202003.bs.F10202003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kc63;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202003.vo.Kc62VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10202003BSImpl implements F10202003BS{

	public Page queryKc63WithPage(Page page, Kc63DTO kc63Dto) {

		StringBuffer sql = new StringBuffer(
				"  select distinct a.baz001, a.aaz370, a.aac003, a.aac002, a.aac001, "
						+ "a.aac004, a.aac006, a.aac012, a.akb020, a.akb021, a.akb022, a.aaz307, "
						+ "a.akf001, a.aae386, a.aaz263, a.aka130, a.akc194, a.ake038, a.akc254, "
						+ "a.akc253, a.akb067, a.akc264, a.akc050, a.akc193, a.akc185, a.aka120, "
						+ "a.akc186, a.akc188, a.akc274, a.akc275, a.akc276, a.akc277, a.aae030, "
						+ "a.aae031, a.baz020, a.baz021, a.baz022, a.baz031, a.aaa027, a.bac003, "
						+ "a.aaz308, a.aaz217, a.akc190,a.baz101,a.baz102 from kc63 a,kc62 b");
		sql.append("  where a.baz001 = b.baz001 and b.baz021 <> '1' ");
		if (StringTools.hasText(kc63Dto.getZsdmc())) {//根据知识点查询
			sql.append(" and b.ake009 in ("+kc63Dto.getZsdmc()+")");
		}
		if (StringTools.hasText(kc63Dto.getBaz021())) {
			sql.append(" and b.baz021 = ('" + kc63Dto.getBaz021() + "') ");
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
		sql.append("  order by a.akc194 asc ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kc63.class);

		return result;

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

	public Page queryKc62sWithPage(Page page, Kc62VO queryDto) {
		StringBuffer sql = new StringBuffer(
				" select (b.akb065-b.ake039) akc254,a.aac001,a.aka130,a.aac003,a.aac004,a.aac006,a.akb021,a.akc194,a.akc190,a.akc021,a.baz020,(a.AKC185||' '||a.akc050||' '||a.AKC186||' '||a.AKC274||' '||a.AKC276) akc050,");
		sql.append(" (case when b.baz102 is not null and b.baz102<>0  then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ102' and aa10.aaa102 = b.baz102) when b.baz101 is not null and b.baz101 <> 1 and b.baz032 <> 0 then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ101' and aa10.aaa102 = b.baz101) when b.baz031 is not null then (select aa10.aaa103 from aa10 where aa10.aaa100 = 'BAZ031' and aa10.aaa102 = b.baz031) end) baz031str,");
		sql.append(" b.* from kc62 b,kc63 a where b.baz003 is not null and b.baz001=a.baz001 ");
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

}
