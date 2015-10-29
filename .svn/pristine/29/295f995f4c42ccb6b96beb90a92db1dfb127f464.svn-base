package com.wondersgroup.local.k5.f10503001.vs;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;

public interface F10503001VS {

	/**
	 * 查询当前机构问题信息
	 * @param page
	 * @param violationComplaintVO
	 * @return
	 */
	Map<String, Object> queryOrgDoubtList(Page page,
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 跳转申诉信息页面加载当前用户信息
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO toOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 同意违规
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO consentBreach(ViolationComplaintVO violationComplaintVO);

	/**
	 * 保存当前申诉信息
	 * @param violationComplaintVO
	 * @return
	 */
	ViolationComplaintVO saveOrgVioCompReg(
			ViolationComplaintVO violationComplaintVO);

	/**
	 * 查询案件信息
	 * @param aaz077
	 * @return
	 */
	Af31DTO getPersonAuditInfoAndBaseInfo(String aaz077);

	/**
	 * 保存材料补充
	 * @param resultVO
	 * @return
	 */
	ViolationComplaintVO addOrgVioCompReg(ViolationComplaintVO resultVO);


}
