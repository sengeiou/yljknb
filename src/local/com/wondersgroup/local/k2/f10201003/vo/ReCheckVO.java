package com.wondersgroup.local.k2.f10201003.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;

public class ReCheckVO extends Kc81DTO {
	
	private String medListStr;
	
	private String medDetailListStr;
	
    private boolean deductAllFlag;
	
	public boolean getDeductAllFlag() {
		return deductAllFlag;
	}

	public void setDeductAllFlag(boolean deductAllFlag) {
		this.deductAllFlag = deductAllFlag;
	}
	
	public String getMedDetailListStr() {
		return medDetailListStr;
	}

	public void setMedDetailListStr(String medDetailListStr) {
		this.medDetailListStr = medDetailListStr;
	}

	public String getMedListStr() {
		return medListStr;
	}

	public void setMedList(String medListStr) {
		this.medListStr = medListStr;
	}

}
