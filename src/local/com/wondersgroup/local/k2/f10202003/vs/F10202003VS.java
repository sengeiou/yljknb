package com.wondersgroup.local.k2.f10202003.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202003.vo.F10202003VO;

public interface F10202003VS {
	/**
	 * 
	 * 查询单据
	 * 
	 * @param page
	 * @param f10202003vo
	 * @return
	 */
	Map<String, Object> queryMedDocument(Page page, F10202003VO f10202003vo);

	/**
	 * 
	 * 查询明细
	 * 
	 * @param page
	 * @param f10202003vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10202003VO f10202003vo);

}
