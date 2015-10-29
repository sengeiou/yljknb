/** 
 * @(#)CompanySelectDTO.java Jun 10, 2010
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Wonders Group.
 * (Social Security Department). You shall not disclose such
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with Wonders Group. 
 *
 * Distributable under GNU LGPL license by gnu.org
 */

package com.wondersgroup.bc.sqapplydis.sqlapply.model.dto;

import com.wondersgroup.wsscclib.pagequery.Filters;

/**
 * @author liming
 * @version $Revision$ Jun 10, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BaseSqApplyDetailDTO implements Filters {

	private String bsz005;

	private String bsz007;

	private String status;

	private String self; // 是否本人经办 1(是)

	private String aae011; // 经办人
	
	private String orderBy;//排序字段

	public String getAae011() {
		return aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	/**
	 * @return the bsz007
	 */
	public String getBsz007() {
		return bsz007;
	}

	/**
	 * @param bsz007 the bsz007 to set
	 */
	public void setBsz007(String bsz007) {
		this.bsz007 = bsz007;
	}

	public String getBsz005() {
		return bsz005;
	}

	public void setBsz005(String bsz005) {
		this.bsz005 = bsz005;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the orderBy
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param orderBy the orderBy to set
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

}
