package com.wondersgroup.bc.k3.f10301015.bs.impl;

import org.springframework.util.StringUtils;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af37;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.bc.k3.f10301015.bs.F10301015BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301015.vo.QueryAuditTargetInfoVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.StringTools;

public class F10301015BSImpl implements F10301015BS {

	/**
	 * 稽核案件查询
	 */
	public Page queryCaseInfo(Page page, Af53DTO af53Dto) {
		StringBuffer sql = new StringBuffer(" select * from af53 a where a.aaz318 is not null");
		// 案件编号
		if (af53Dto.getAae034() != null) {
			sql.append(" and a.aae034 = '" + af53Dto.getAae034() + "'");
		}
		
		// 案件状态 aae426
		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}
		
		// 案件来源 
		if (StringTools.hasText(af53Dto.getAbb006())) {
			sql.append(" and a.abb006 = '" + af53Dto.getAbb006() + "'");
		}
		//案情关键字apf094
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}
		
		// 案件编号 abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), CaseInfoDTO.class);
		
		return result;
	}

	/**
	 * 外部受理疑点登记查询
	 */
	public Page queryAuditTargetInfo(Page page, QueryAuditTargetInfoVO queryAuditTargetInfoVO) {
		String ids = "";
		if(StringUtils.hasText(queryAuditTargetInfoVO.getAaz281Str())){
			String [] aaz281 = queryAuditTargetInfoVO.getAaz281Str().split(",");
			for (int i = 0; i < aaz281.length; i++) {
				if((i+1)==aaz281.length){
					ids+="'"+aaz281[i]+"'";
				}else{
					ids+="'"+aaz281[i]+"',";
				}
			}
		}
		StringBuffer sql = new StringBuffer(" select * from af32 a where a.aaz281 in ("+ids+") ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af32DTO.class);
		
		return result;
	}

	/**
	 * 询问笔录生成 查询
	 */
	public Page queryInquiryInputInfo(Page page, Af37DTO af37dto) {
		StringBuffer sql = new StringBuffer("select * from af37 a where a.aaz318 = "+af37dto.getAaz318()+" ");
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af37.class);
		return result;
	}

}
