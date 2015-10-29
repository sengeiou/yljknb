package com.wondersgroup.local.k2.f10201002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10201002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10201002.vo.PreCheckVO;

public interface F10201002VS {

	/**
	 * 分页查询违规单据统计信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryMedDocument(Page page, MedDocumentVO medDocumentVO);
    
	/**
     * 分页查询违规单据明细统计信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryMedDocumentDetail(Page page,MedDocumentVO medDocumentVO);
	
	/**
	 * 分页查询单据违规信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryMedDocumentIllegal(Page page,MedDocumentVO medDocumentVO);
	/**
	 * 查询单据违规信息
	 * @param medDocumentVO
	 * @return
	 */
	MedDocumentVO queryMedDocumentIllegal(MedDocumentVO medDocumentVO);
    /**
     * 分页查询明细违规信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryMedDocumentDetailIllegal(Page page,MedDocumentVO medDocumentVO);
	/**
     * 查询明细违规信息
     * @param medDocumentVO
     * @return
     */
	MedDocumentVO queryMedDocumentDetailIllegal(MedDocumentVO medDocumentVO);
    /**
     * 违规单据明细审核
     * @param returnVO
     * @return
     */
	PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO);

	/**
	 * 根据违规明细查询查询审核信息
	 * @param baz003
	 * @return
	 */
	List<PreCheckVO> queryCheckRecordByBaz003(String baz003);

	/**
	 * 查询违规单据查询就诊信息
	 * @param resultVO
	 * @return
	 */
	MedDocumentVO queryMedVisitInfo(MedDocumentVO resultVO);

}
