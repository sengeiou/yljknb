/** 
 * @(#) BusinessTipsVO.java
 *
 * @(#) com.wondersgroup.mycommon.web.vo.BusinessTipsVO
 * @(#) Administrator
 * @(#) 2013-11-15 
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 */
package com.wondersgroup.mycommon.web.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class BusinessTipsVO implements ValueObject {
	
	private String tip;

	
	public BusinessTipsVO() {
		super();
	}

	public BusinessTipsVO(String tip) {
		super();
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}

}
