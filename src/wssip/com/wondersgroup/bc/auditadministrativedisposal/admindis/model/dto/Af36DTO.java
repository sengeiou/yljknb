package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto;

import java.util.Date;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af36;

public class Af36DTO extends Af36{
	private String apf093;  //案件名称
	private Date aae036s;  //提报时间
	private Date apa047s;  //要求完成时间
	private Date apa048s;   //申请完成时间
	

	public String getApf093() {
		return apf093;
	}

	public void setApf093(String apf093) {
		this.apf093 = apf093;
	}
	
	public Date getApa047s() {
		return apa047s;
	}
	public void setApa047s(Date apa047s) {
		this.apa047s = apa047s;
	}

	public Date getAae036s() {
		return aae036s;
	}

	public void setAae036s(Date aae036s) {
		this.aae036s = aae036s;
	}

	public Date getApa048s() {
		return apa048s;
	}

	public void setApa048s(Date apa048s) {
		this.apa048s = apa048s;
	}
	
	

}
