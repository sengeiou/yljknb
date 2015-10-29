package com.wondersgroup.local.k2.f10202001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202001.vo.MedAuditSummaryVO;

public interface F10202001VS {

	/**
	 * 按照医院汇总查询单据数
	 * @param page
	 * @param medAuditSummaryVO
	 * @return
	 */
	Map<String, Object> queryHosMedCount(Page page,	MedAuditSummaryVO medAuditSummaryVO);
	/**
	 * 分页查询医院下单据数
	 * @param page
	 * @param medAuditSummaryVO
	 * @return
	 */
	Map<String, Object> queryHosMedDocument(Page page, MedAuditSummaryVO medAuditSummaryVO);
	/**
	 * 分页查询单据明细
	 * @param page
	 * @param paramVO
	 * @return
	 */
	Map<String, Object> queryHosMedDocumentDetail(Page page,MedAuditSummaryVO medAuditSummaryVO);

}
