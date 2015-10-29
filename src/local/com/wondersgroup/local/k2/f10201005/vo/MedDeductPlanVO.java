package com.wondersgroup.local.k2.f10201005.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kd30DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class MedDeductPlanVO extends Kd30DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String aae002Str ;
	
	private String baz008;

	public String getBaz008() {
		return baz008;
	}

	public void setBaz008(String baz008) {
		this.baz008 = baz008;
	}

	public String getAae002Str() {
		return aae002Str;
	}

	public void setAae002Str(String aae002Str) {
		this.aae002Str = aae002Str;
	}

}
