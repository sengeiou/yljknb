package com.wondersgroup.local.k5.f10504001.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;

public class ComplaintHandlingKC86VO extends Kc81DTO {
	private String bazValue="";
	private String operatorId;//操作人id
	private String operatorName;//操作人姓名
	private String organ;//经办机构
	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getBazValue() {
		return bazValue;
	}

	public void setBazValue(String bazValue) {
		this.bazValue = bazValue;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}
 
 
}
