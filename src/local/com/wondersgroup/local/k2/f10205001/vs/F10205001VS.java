package com.wondersgroup.local.k2.f10205001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10205001.vo.F10205001VO;

public interface F10205001VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10205001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10205001VO f10205001vo);


	/**
	 * 查询单据明细违规信息
	 * 
	 * @param f10204001
	 * @return
	 */
	F10205001VO queryMedDocumentDetailIllegal(F10205001VO f10205001vo);

	

	/**
	 * 单病种数据处理
	 * 
	 * @param f10205001vo
	 * @return
	 */
	F10205001VO dealMedDocument(F10205001VO f10205001vo);

}
