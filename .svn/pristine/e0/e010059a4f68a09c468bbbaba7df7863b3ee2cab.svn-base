package com.wondersgroup.local.k5.f10506003.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10506003.vo.MedDocumentVO;
import com.wondersgroup.local.k5.f10506003.vo.QueryNumberVO;

public interface F10506003VS {
	/**
	 * 分页查询单据违规信息（申诉)
	 * @param page
	 * @param medDocumentVO
	 * @return
	 */
	Map<String, Object> queryCompainDocument(Page page, MedDocumentVO medDocumentVO);
	
	/**
     * 分页查询违规单据明细统计信息
     * @param page
     * @param ids
     * @return
     */
	Map<String, Object> querySuspectedDocumentDetail(Page page,	String ids);
	/**
     * 查询明细违规信息
     * @param medDocumentVO
     * @return
     */
	
	MedDocumentVO querySusDocumentDetailIllegal(MedDocumentVO medDocumentVO);
	
	/**
	 * 查询所有的审核操作的医院汇总数据
	 * @param akb020orakb021
	 * @return
	 */
	List<QueryNumberVO> queryNumber(String akb020orakb021);
}
