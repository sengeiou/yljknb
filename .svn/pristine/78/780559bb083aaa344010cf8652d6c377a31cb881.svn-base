package com.wondersgroup.bc.k6.f10605001.bs.impl;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kcnb11;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kcnb11DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kcnb12DTO;
import com.wondersgroup.bc.k6.f10605001.bs.F10605001BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.StringTools;

public class F10605001BSImpl implements F10605001BS {

	public Page queryMediFeeTrendWithPage(Page page, Kcnb12DTO kcnb12Dto) {

		StringBuffer sql = new StringBuffer(
				" select a.aae041 as aae041,"
						+ "trunc(a.cur_pred,2) as cur_pred,trunc(a.pre_pred,2) as pre_pred,"
						+ "trunc(a.sam_pred,2) as sam_pred,trunc(a.pre_rate,2) as pre_rate,"
						+ "trunc(a.sam_rate,2) as sam_rate,a.aaa027 as aaa027,"
						+ "trunc(tlcz_avg_rate,2) as tlcz_avg_rate,trunc(qnpjbj_rate,2) as qnpjbj_rate,"
						+ "a.aae041 as querytime from  kcnb12 a where 1 = 1 ");

		sql.append(" and a.analcode = '" + kcnb12Dto.getFxzb() + "'");

		sql.append(" and a.akb020 = '" + kcnb12Dto.getAkb020() + "'");
		
		sql.append(" and a.ape032 = '" + kcnb12Dto.getApe032() + "'"); 

		sql.append(" and a.akb027 = '" + kcnb12Dto.getAkb027() + "'");
		
		sql.append(" order by TO_NUMBER(querytime) ");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Kcnb12DTO.class);

		return result;
	}

	/**
	 * 
	 * @param page
	 * @param queryDto
	 * @return
	 */
	public Page queryKcnb11WithPage(Page page, Kcnb11DTO queryDto) {

		StringBuffer sb = new StringBuffer(
				"select a.akb020,a.akb021,a.akb027,sum(a.akb023) akb023,a.aaa027 from kcnb11 a where a.akb020 is not null ");

		sb.append(" and a.ape032 = '" + queryDto.getApe032() + "'");

		sb.append(" and a.akb027 = '" + queryDto.getAkb027() + "'");

		if (StringTools.hasText(queryDto.getAae041s())) {
			sb.append(" and a.aae041 >= '"
					+ queryDto.getAae041s().substring(0, 6) + "'");
		}

		if (StringTools.hasText(queryDto.getAae041s())) {
			sb.append(" and a.aae042 <= '"
					+ queryDto.getAae042s().substring(0, 6) + "'");
		}

		// 药店代码 akb020
		if (StringTools.hasText(queryDto.getAkb020())) {
			sb.append(" and a.akb020 like '%" + queryDto.getAkb020() + "%'");
		}

		// 药店名称
		if (StringTools.hasText(queryDto.getAkb021())) {
			sb.append(" and a.akb021 like '%" + queryDto.getAkb021() + "%'");
		}
		/*
		 * //医院等级 aka101 if(StringTools.hasText(queryDto.getAka101())){
		 * sb.append(" and a.aka101 = '" + queryDto.getAka101() + "'"); }
		 */

		// 统筹区 aaa027
		if (StringTools.hasText(queryDto.getAaa027())) {
			sb.append(" and a.aaa027 = '" + queryDto.getAaa027() + "'");
		}
		sb.append(" group by a.akb020,a.akb021,a.akb027,a.aaa027");
		sb.append(" order by akb023 desc");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Kcnb11.class);

		return result;
	}
}
