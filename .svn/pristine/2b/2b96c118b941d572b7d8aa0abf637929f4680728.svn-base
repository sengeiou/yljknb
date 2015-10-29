/** 
 * @(#)SqApplyDetail.java Jul 15, 2009
 * 
 * Copyright (c) 1995-2009 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.bc.sqapplydis.sqlapply.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.sqapplydis.sqlapply.model.BaseSqApplyDetail;

/**
 * @version $Revision$ Jul 15, 2009
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "SQ_APPLY_DETAIL")
public class SqApplyDetail extends BaseSqApplyDetail {

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.mapping.ColumnDetailModel#getMapKey()
	 */
	@Transient
	public String getMapKey() {
		return getCode();
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.mapping.ColumnDetailModel#setMapKey(java.lang.String)
	 */
	public void setMapKey(String mapKey) {
		setCode(mapKey);
	}

}
