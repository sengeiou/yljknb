package com.wondersgroup.local.k3.f10301015.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301015.bs.F10301015BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301015.vo.F10301015VO;
import com.wondersgroup.local.k3.f10301015.vo.QueryAuditTargetInfoVO;
import com.wondersgroup.local.k3.f10301015.vo.QueryInquiryInputInfoVO;
import com.wondersgroup.local.k3.f10301015.vs.F10301015VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;

public class F10301015VSImpl implements F10301015VS{
	private F10301015BS f10301015BS;
	
	public F10301015BS getF10301015BS() {
		return f10301015BS;
	}

	public void setF10301015BS(F10301015BS f10301015bs) {
		f10301015BS = f10301015bs;
	}

	/**
	 * 稽核案件查询
	 */
	public Map<String, Object> queryCaseInfo(Page page, F10301015VO f10301015vo) {
		Af53DTO af53dto = new Af53DTO();
		
		BeanTools.copyProperties(f10301015vo, af53dto);
		Page result = this.getF10301015BS().queryCaseInfo(page,af53dto);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	/**
	 * 外部受理疑点登记查询
	 */
	public Map<String, Object> queryAuditTargetInfo(Page page, QueryAuditTargetInfoVO queryAuditTargetInfoVO) {
		Page result = this.getF10301015BS().queryAuditTargetInfo(page, queryAuditTargetInfoVO);

		for (int i = 0; i < result.getResult().size(); i++) {
			Af32DTO af32Dto = (Af32DTO) result.getResult().get(i);
			if (af32Dto.getApe711() != 0) {
				String str = String.valueOf(af32Dto.getApe711());
				Date ape711s = DateTools.parseDate(str, "yyyyMMdd");
				af32Dto.setApe711s(ape711s);
			}
		}
		return GridUtils.getGridData(result);
	}

	/**
	 * 询问笔录生成 查询
	 */
	public Map<String, Object> queryInquiryInputInfo(Page page, QueryInquiryInputInfoVO queryInquiryInputInfoVO) {
		Af37DTO af37dto = new Af37DTO();
		BeanTools.copyProperties(queryInquiryInputInfoVO, af37dto);
		Page result = this.getF10301015BS().queryInquiryInputInfo(page,af37dto);
		Map<String, Object> map = GridUtils.getGridData(result);
		return map;
	}

}
