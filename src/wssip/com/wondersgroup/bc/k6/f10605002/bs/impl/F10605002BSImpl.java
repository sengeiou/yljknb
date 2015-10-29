package com.wondersgroup.bc.k6.f10605002.bs.impl;

import java.util.List;

import com.wondersgroup.bc.k6.f10605002.bs.F10605002BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10605002.vo.F10605002VO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;

public class F10605002BSImpl implements F10605002BS {

	public Page queryHosWithPage(Page page, F10605002VO f10605002VO) {
		StringBuffer sql = new StringBuffer("");
		sql
				.append("select b.*, dense_rank() over( order by akb065 desc) rank\n"
						+ "          from (select distinct (a.akb020) akb020,\n"
						+ "                                a.akb021 akb021,\n"
						+ "                                sum(a.akc226) akc226,\n"
						+ "                                sum(a.akb065) akb065\n"
						+ "                  from anal_drug a\n"
						+ "                 where a.akc194 >= to_date('"+f10605002VO.getAkc194s1()+"', 'yyyyMM')\n"
						+ "                   and a.akc194 <= to_date('"+f10605002VO.getAkc194e1()+"', 'yyyyMM')\n"
						+ "                   and a.aaa027 = '"+f10605002VO.getAaa027()+"'\n"         //市县
						+ "                   and trim(ake002) like '%"+f10605002VO.getAke002().trim()+"%'\n"
						+ "                 group by a.akb020, a.akb021\n"
						+ "                 ) b");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				F10605002VO.class);
		return result;
	}

	public List<F10605002VO> queryDocOfHos(F10605002VO f10605002VO) {
		StringBuffer sql = new StringBuffer("");
		sql.append("select a.*, dense_rank() over( order by akb065 desc) rank\n"	+ 
				"          from (select a.akb020 akb020,\n" +
				"               a.akb021 akb021,\n" + 
				"               sum(a.akc226) akc226,\n" + 
				"               sum(a.akb065) akb065,\n" + 
				"               a.aaz263 aaz263,\n" + 
				"               a.aac003 aac003\n" + 
				"          from anal_drug a\n" + 
				"         where a.akc194 >= to_date('"+f10605002VO.getAkc194s1()+"', 'yyyyMM')\n" + 
				"           and a.akc194 <= to_date('"+f10605002VO.getAkc194e1()+"', 'yyyyMM')\n" + 
				"           and a.aaa027 = '"+f10605002VO.getAaa027()+"'\n" + 
				"           and trim(ake002) like '%"+f10605002VO.getAke002().trim()+"%'\n" + 
				"           and akb021 = '"+f10605002VO.getAkb021()+"'\n" + 
				"         group by a.akb020, a.akb021, a.aaz263, a.aac003\n" + 
				"         )a");
		List<F10605002VO> result = CommonJdbcDaoUtils.query(sql.toString(),
				F10605002VO.class);
		return result;
	}

	public Page queryDrugWithPage(Page page, F10605002VO f10605002VO) {
		StringBuffer sql=new StringBuffer("");
		sql.append( 
				"select dense_rank() over( order by akb065 desc) rank, a.*\n" +
				"  from (select a.ake002 ake002,\n" + 
				"               sum(round(a.akc226)) akc226,\n" + 
				"               sum(akb065) akb065\n" + 
				"           from anal_drug a\n" + 
				"           where 1=1 " +
				"           and a.aaa027 = '"+f10605002VO.getAaa027()+"'\n" + 
				"           and a.akc194 >= to_date('"+f10605002VO.getAkc194s2()+"', 'yyyyMM')\n" + 
				"           and a.akc194 <= to_date('"+f10605002VO.getAkc194e2()+"', 'yyyyMM')\n" + 
				"           and trim(a.akb021) like '%"+f10605002VO.getAkb021().trim()+"%'\n" + 
				"         group by a.ake002, a.aaa027\n" + 
				"         ) a");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				F10605002VO.class);
		return result;
	}

	public List<F10605002VO> queryDocOfDrug(F10605002VO f10605002VO) {
		StringBuffer sql = new StringBuffer("");
		sql.append(
				"select dense_rank() over( order by akb065 desc) rank, a.*\n" +
				"  from (select a.aaz263 aaz263,\n" + 
				"               a.aac003 aac003,\n" + 
				"               sum(a.akc226) akc226,\n" + 
				"               sum(a.akb065) akb065\n" + 
				"          from anal_drug a\n" + 
				"         where 1 = 1\n" + 
				"           and a.aaa027 = '"+f10605002VO.getAaa027()+"'\n" + 
				"           and a.akc194 >= to_date('"+f10605002VO.getAkc194s2()+"', 'yyyyMM')\n" + 
				"           and a.akc194 <= to_date('"+f10605002VO.getAkc194e2()+"', 'yyyyMM')\n" + 
				"           and a.akb021 like '%"+f10605002VO.getAkb021().trim()+"%'\n" + 
				"           and trim(a.ake002) = trim('"+f10605002VO.getAke002()+"')\n" + 
				"         group by a.aaz263, a.aac003) a");
		List<F10605002VO> result = CommonJdbcDaoUtils.query(sql.toString(),
				F10605002VO.class);
		return result;
	}

}
