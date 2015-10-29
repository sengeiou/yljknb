/** 
 * @(#)SpCallException.java Jun 29, 2010
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

package com.wondersgroup.wssip.commons.dao.exception;

import org.apache.commons.lang.exception.NestableRuntimeException;

/**
 * @author xieguojun
 * @version $Revision$ Jun 29, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class SpCallException extends NestableRuntimeException{
	
	private static final long serialVersionUID = -3534192321893200072L;
	private	Integer	retCode;
	
	public SpCallException(Integer regCode,String errorMsg){
		super(errorMsg);
		this.setRetCode(retCode);
	}

	public Integer getRetCode() {
		return retCode;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

}
