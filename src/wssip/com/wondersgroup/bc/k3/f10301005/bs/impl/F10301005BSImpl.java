package com.wondersgroup.bc.k3.f10301005.bs.impl;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301005.bs.F10301005BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.StringTools;

public class F10301005BSImpl implements F10301005BS{
	
	public Page queryAf53ByIdsNew(Page page , Af53DTO af53DTO){
		
		StringBuffer sql = new StringBuffer("select * from af53 a where a.aaz318 is not null and a.aae426 in ('3','7','8')");
		// 案件状态 
		//sql.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_7 + "'");
		// 编号abz001
		if (StringTools.hasText(af53DTO.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53DTO.getAbz001() + "%'");
		}
		// 案情关键字apf094
		if (StringTools.hasText(af53DTO.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53DTO.getApf094() + "%'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}
	
	public Page queryAf53WithPageInfo(Page page, Af53DTO af53Dto) {
		
		StringBuffer sql = new StringBuffer(
				"select * from af53 a where a.aaz318 is not null and a.aae426 in ('3','7','8')");

		// 编号abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 = '" + af53Dto.getAbz001() + "'");
		}

		//sql.append(" order by a.aaz318");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;

	}
	
	

}
