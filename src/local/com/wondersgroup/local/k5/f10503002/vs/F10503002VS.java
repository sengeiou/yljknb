package com.wondersgroup.local.k5.f10503002.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;

public interface F10503002VS {


	/**
	 * 查询申诉详细
	 * @param page
	 * @param violationComplaintVO
	 * @return
	 */
	Map<String, Object> queryBreAuditDetail(Page page,
			ViolationComplaintVO violationComplaintVO);


	/**
	 * 查询申诉信息
	 * @param page
	 * @param violationComplaintVO
	 * @return
	 */
	Map<String, Object> toOrgBreCompQuery(Page page,
			ViolationComplaintVO violationComplaintVO);

}
