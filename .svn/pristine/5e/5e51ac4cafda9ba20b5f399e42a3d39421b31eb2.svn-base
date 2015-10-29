package com.wondersgroup.local.k5.f10503003.vs;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;

public interface F10503003VS {


	/**
	 * 查询申诉信息
	 * @param page
	 * @param violationComplaintVO
	 * @return
	 */
	Map<String, Object> queryBreAudit(Page page,
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 查询申诉详细
	 * @param page
	 * @param violationComplaintVO
	 * @return
	 */
	Map<String, Object> queryBreAuditDetail(Page page,
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 跳转审批通过
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO toBreAuditPass(
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 审批通过
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO breAuditPass(ViolationComplaintVO violationComplaintVO);

	/**
	 * 审批不通过
	 * @param resultVO
	 * @return
	 */
	ViolationComplaintVO breAuditNotPass(ViolationComplaintVO resultVO);

	/**
	 * 跳转审批不通过
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO toBreAuditNotPass(
			ViolationComplaintVO violationComplaintVO);

}
