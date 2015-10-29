package com.wondersgroup.local.k5.f10509001.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10509001.vo.F10509001VO;
import com.wondersgroup.local.k5.f10509001.vo.Kc83VO;

public interface F10509001VS {

	/**
	 * 分页查询违规单据统计信息
	 * 
	 * @param page
	 * @param f10509001vo
	 * @return
	 */

	Map<String, Object> queryMedDocument(Page page, F10509001VO f10509001vo);


	/**
	 * 查询单据明细违规信息
	 * 
	 * @param f10204001
	 * @return
	 */
	F10509001VO queryMedDocumentDetailIllegal(F10509001VO f10509001vo);

	

	/**
	 * 附件上传
	 * @param kc83vo
	 * @return
	 */
	Kc83VO uploadFile(Kc83VO kc83vo);

	Kc83VO preCheckMedDocDetail(Kc83VO kc83vo);

}
