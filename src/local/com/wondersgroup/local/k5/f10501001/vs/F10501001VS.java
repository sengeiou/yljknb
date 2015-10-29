package com.wondersgroup.local.k5.f10501001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10501001.vo.FeedbackVO;
import com.wondersgroup.local.k5.f10501001.vo.MedDocumentFeedbackVO;

public interface F10501001VS {

	/**
	 * 分页查询反馈违规单据统计信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryFeedbackMedDocument(Page page, MedDocumentFeedbackVO medDocumentFeedbackVO);
    
	/**
     * 分页查询反馈违规单据明细统计信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryFeedbackMedDocumentDetail(Page page,MedDocumentFeedbackVO medDocumentFeedbackVO);
	
	/**
	 * 分页查询反馈单据违规信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryFeedbackMedDocumentIllegal(Page page,MedDocumentFeedbackVO medDocumentFeedbackVO);
	/**
	 * 查询反馈单据违规信息
	 * @param medDocumentVO
	 * @return
	 */
	MedDocumentFeedbackVO queryFeedbackMedDocumentIllegal(MedDocumentFeedbackVO medDocumentFeedbackVO);
    /**
     * 分页查询反馈明细违规信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryFeedbackMedDocumentDetailIllegal(Page page,MedDocumentFeedbackVO medDocumentFeedbackVO);
	/**
     * 查询反馈明细违规信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	MedDocumentFeedbackVO queryFeedbackMedDocumentDetailIllegal(MedDocumentFeedbackVO medDocumentFeedbackVO);
    /**
     * 违规单据明细反馈
     * @param returnVO
     * @return
     */
	FeedbackVO feedbackMedDocDetail(FeedbackVO returnVO);

}
