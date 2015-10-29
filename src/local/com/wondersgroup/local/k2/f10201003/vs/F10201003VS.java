package com.wondersgroup.local.k2.f10201003.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10201003.vo.MedDocumentCheckVO;
import com.wondersgroup.local.k2.f10201003.vo.MedInteractiveVO;
import com.wondersgroup.local.k2.f10201003.vo.ReCheckVO;
import com.wondersgroup.local.k2.f10201003.vo.TalkVO;

public interface F10201003VS {

	/**
	 * 分页查询复审违规单据统计信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryCheckMedDocument(Page page, MedDocumentCheckVO medDocumentCheckVO);
    
	/**
     * 分页查询复审违规单据明细统计信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryCheckMedDocumentDetail(Page page,MedDocumentCheckVO medDocumentCheckVO);
	
	/**
	 * 分页查询复审单据违规信息
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryCheckMedDocumentIllegal(Page page,MedDocumentCheckVO medDocumentCheckVO);
	/**
	 * 查询复审单据违规信息
	 * @param medDocumentVO
	 * @return
	 */
	MedDocumentCheckVO queryCheckMedDocumentIllegal(MedDocumentCheckVO medDocumentCheckVO);
    /**
     * 分页查询复审明细违规信息
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> queryCheckMedDocumentDetailIllegal(Page page,MedDocumentCheckVO medDocumentCheckVO);
	/**
     * 查询复审明细违规信息
     * @param medDocumentVO
     * @return
     */
	MedDocumentCheckVO queryCheckMedDocumentDetailIllegal(MedDocumentCheckVO medDocumentCheckVO);
    /**
     * 违规单据明细复审
     * @param returnVO
     * @return
     */
	ReCheckVO reCheckMedDocDetail(ReCheckVO returnVO);
    /**
     * 根据单据明细信息查询对应的有效审核记录交互信息
     * @param returnVO
     * @return
     */
	MedInteractiveVO queryMedInteractiveInfo(MedInteractiveVO returnVO);
    /**
     * 保存交互信息Ke01
     * @param resultVO
     * @return
     */
	TalkVO saveInteractiveInfo(TalkVO resultVO);

}
