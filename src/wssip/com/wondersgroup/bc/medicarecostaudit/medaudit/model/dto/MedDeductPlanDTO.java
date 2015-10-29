package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import com.wondersgroup.framework.core5.storeprocedure.annotation.SpIn;
import com.wondersgroup.framework.core5.storeprocedure.annotation.SpOut;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;

public class MedDeductPlanDTO implements SpSupportBean {

	@SpIn(order = 1)
	private String baz007; // 扣款计划事件ID

	@SpOut(order = 2)
	private Long retcode;

	@SpOut(order = 3)
	private String errmsg;

	public String getBaz007() {
		return baz007;
	}

	public void setBaz007(String baz007) {
		this.baz007 = baz007;
	}

	public Long getRetcode() {
		return retcode;
	}

	public void setRetcode(Long retcode) {
		this.retcode = retcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
