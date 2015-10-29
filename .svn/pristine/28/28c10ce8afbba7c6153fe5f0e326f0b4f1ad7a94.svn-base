package com.wondersgroup.local.k2.f10203002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10203002.vo.F10203002VO;
import com.wondersgroup.local.k2.f10203002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203002.vo.QueryNumberVO;
import com.wondersgroup.local.k2.f10203002.vo.SuspectedVO;

public interface F10203002VS {
	
	/**
	 * 分页查询单据违规信息(有嫌疑及人工初审)
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> querySuspectedDocument(Page page, MedDocumentVO medDocumentVO);
	
	/**
     * 分页查询违规单据明细统计信息(有嫌疑)
     * @param page
     * @param medDocumentVO
     * @return
     */
	Map<String, Object> querySuspectedDocumentDetail(Page page,	F10203002VO f10203002VO);
	/**
	 * 查询所有的审核操作的医院汇总数据
	 * @param akb020orakb021
	 * @param baz031 
	 * @return
	 */
	List<QueryNumberVO> queryNumber(String akb020orakb021, String baz031);
	/**
     * 查询明细违规信息
     * @param medDocumentVO
     * @return
     */
	
	MedDocumentVO querySusDocumentDetailIllegal(MedDocumentVO medDocumentVO);
	/**
	 * 申诉审核操作
	 * @param suspectedVO
	 * @return
	 */
	SuspectedVO susDocuDetailOperate(SuspectedVO suspectedVO);
}
