package com.wondersgroup.local.k5.f10507002.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10507002.vo.F10507002VO;
import com.wondersgroup.local.k5.f10507002.vo.HosDetailVO;



public interface F10507002VS {

	Map<String, Object> queryMedDocument(Page page, 
			F10507002VO f10507002vo);

	List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO);
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
	
	F10507002VO querySusDocumentDetailIllegal(F10507002VO f10507002VO);
	

}
