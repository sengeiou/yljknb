package com.wondersgroup.local.k2.f10203001.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;

public class PreCheckVO extends Kc81DTO {
	
	private String ids;
	
	private String medListStr;
	
	private String medDetailListStr;
	
	private boolean deductAllFlag;
	
	private String baz023Str;
	
	private String baz041Str;
	
	private String bae041Str;
	
	private Double baz041;
	
	
	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getBae041Str() {
		return bae041Str;
	}

	public void setBae041Str(String bae041Str) {
		this.bae041Str = bae041Str;
	}

	public String getBaz023Str() {
		return baz023Str;
	}

	public void setBaz023Str(String baz023Str) {
		this.baz023Str = baz023Str;
	}

	public String getBaz041Str() {
		return baz041Str;
	}

	public void setBaz041Str(String baz041Str) {
		this.baz041Str = baz041Str;
	}

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

	public Double getBaz041() {
		return baz041;
	}

	public void setBaz041(Double baz041) {
		this.baz041 = baz041;
	}

}
