/** 
 * @(#)BusinessCodeDTO.java 2010-7-14
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

package com.wondersgroup.wssip.application.businesscode.dto;

/**
 * @author xieguojun
 * @version $Revision$ 2010-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BusinessCodeDTO {
	
	private	String	type;
	
	private	String	sql;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
	
	

}
