package com.wondersgroup.local.k5.f10507001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10507001.vo.F10507001VO;

public interface F10507001VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10507001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10507001VO f10507001vo);

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @param page
	 * @param f10507001vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10507001VO f10507001vo);

	/**
	 * 查询单据明细违规信息
	 * 
	 * @param f10507001
	 * @return
	 */
	F10507001VO queryMedDocumentDetailIllegal(F10507001VO f10507001vo);

	/**
	 * 单据明细复议申请
	 * 
	 * @param returnVO
	 * @return
	 */
	PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO);

}
