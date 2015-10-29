package com.wondersgroup.local.k2.f10204001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204001.vo.F10204001VO;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;

public interface F10204001VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10204001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10204001VO f10204001vo);

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @param page
	 * @param f10204001vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10204001VO f10204001vo);

	/**
	 * 查询单据明细违规信息
	 * 
	 * @param f10204001
	 * @return
	 */
	F10204001VO queryMedDocumentDetailIllegal(F10204001VO f10204001vo);

	
	/**
	 * 单据明细复议审核
	 * 
	 * @param returnVO
	 * @return
	 */
	PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO);

}
