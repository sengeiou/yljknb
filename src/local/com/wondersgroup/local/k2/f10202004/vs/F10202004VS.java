package com.wondersgroup.local.k2.f10202004.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10202004.vo.F10202004VO;

public interface F10202004VS {
	/**
	 * 
	 * 查询单据
	 * 
	 * @param page
	 * @param f10202004vo
	 * @return
	 */
	Map<String, Object> queryMedDocument(Page page, F10202004VO f10202004vo);

	/**
	 * 
	 * 查询明细
	 * 
	 * @param page
	 * @param f10202004vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10202004VO f10202004vo);

}
