package com.wondersgroup.local.k2.f10204003.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204003.vo.F10204003VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;

public interface F10204003VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10204001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10204003VO f10204003vo);

	/**
	 * 查询所有医院复议操作的汇总数据
	 * 
	 * @param akb020
	 * @return
	 */
	List<GatherVO> searchWithHospital(String akb020);
	
	/**
	 * 查询违规明细
	 * @param page
	 * @param f10204003vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10204003VO f10204003vo);

}
