/** 
 * @(#)SpCallDTO.java Jun 29, 2010
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

package com.wondersgroup.wssip.commons.dao.bo;

import com.wondersgroup.framework.core5.storeprocedure.annotation.SpIn;
import com.wondersgroup.framework.core5.storeprocedure.annotation.SpOut;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;

/**
 * @author xieguojun
 * @version $Revision$ Jun 29, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class SpCallDTO implements SpSupportBean {
	
	@SpIn(order =1)
	private	String paramsStr;//入参
	
	@SpOut(order =2)
	private	String result;//返回结果
	
	@SpOut(order =3)
	private	Integer retCode;//错误代码
	
	@SpOut(order =4)
	private	String errMsg;//错误消息

	public String getParamsStr() {
		return paramsStr;
	}

	public String getResult() {
		return result;
	}

	public Integer getRetCode() {
		return retCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setParamsStr(String paramsStr) {
		this.paramsStr = paramsStr;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setRetCode(Integer retCode) {
		this.retCode = retCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	

}
