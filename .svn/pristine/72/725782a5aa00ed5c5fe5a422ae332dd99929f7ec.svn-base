package com.wondersgroup.local.k2.f10204002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204002.vo.F10204002VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;

public interface F10204002VS {

	/**
	 * 分页查询违规单据信息
	 * 
	 * @param page
	 * @param f10204002vo
	 * @return
	 */
	Map<String, Object> queryMedDocument(Page page, F10204002VO f10204002vo);

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @param page
	 * @param f10204002vo
	 * @return
	 */
	Map<String, Object> queryMedDocumentDetail(Page page,
			F10204002VO f10204002vo);

	/**
	 * 查询单据明细违规信息
	 * 
	 * @param f10204002
	 * @return
	 */
	F10204002VO queryMedDocumentDetailIllegal(F10204002VO f10204002vo);

	/**
	 * 单据明细主动复议
	 * 
	 * @param returnVO
	 * @return
	 */
	PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO);

	/**
	 * 上传附件
	 * 
	 * @param resultVO
	 * @return
	 */
	PreCheckVO uploadFile(PreCheckVO resultVO);

	/**
	 * 查询医院汇总信息
	 * 
	 * @param akb020
	 * @return
	 */
	List<GatherVO> searchWithHospital(String akb020);

}
