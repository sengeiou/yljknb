package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import com.wondersgroup.framework.core5.storeprocedure.annotation.SpIn;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;

public class BaseDbz  implements SpSupportBean{
	@SpIn(order=1)
	private String aaz217;

	public String getAaz217() {
		return aaz217;
	}

	public void setAaz217(String aaz217) {
		this.aaz217 = aaz217;
	}

	public BaseDbz(String aaz217) {
		super();
		this.aaz217 = aaz217;
	}
}
