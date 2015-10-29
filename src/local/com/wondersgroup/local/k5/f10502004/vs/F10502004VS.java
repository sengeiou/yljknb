package com.wondersgroup.local.k5.f10502004.vs;

import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;

public interface F10502004VS {
	
	/**
	 * 审批通过
	 * @param violationComplaintVO
	 * @return
	 */
	F10502001VO AuditPass(F10502001VO resultVO);

	/**
	 * 审批科室维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502002VO auditPassks(F10502002VO resultVO);

	/**
	 * 审批科室维护信息不通过
	 * @param resultVO
	 * @return
	 */
	F10502002VO auditNotPassks(F10502002VO resultVO);

	/**
	 * 审批医师维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502003VO auditPassys(F10502003VO resultVO);

	/**
	 * 审批医师维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502003VO auditNotPassys(F10502003VO resultVO);

	/**
	 * 审批医疗机构维护信息通过
	 * @param resultVO
	 * @return
	 */
	F10502001VO auditPassyy(F10502001VO resultVO);

	/**
	 * 审批医疗机构维护信息不通过
	 * @param resultVO
	 * @return
	 */
	F10502001VO auditNotPassyy(F10502001VO resultVO);

}
