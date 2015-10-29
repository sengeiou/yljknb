package com.wondersgroup.local.k2.f10201004.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

@SuppressWarnings("serial")
public class F10201004CheckedVO extends Kc81DTO implements ValueObject {

	private String jsonData;//审核明细的json串
	
	private boolean deductAllFlag;

	public boolean getDeductAllFlag() {
		return deductAllFlag;
	}

	public void setDeductAllFlag(boolean deductAllFlag) {
		this.deductAllFlag = deductAllFlag;
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
}
