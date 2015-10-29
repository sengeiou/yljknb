package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;

public class Af53DTO extends Af53{
	
	private String abb025begin;
	
	private String abb025end;
	
	private String aae034begin;
	
	private String aae034end;
	
	private Date aae034s;
	
	private Date abb025s;
	
	private String personIDstr;
	
	private List<Ac01DTO> personList;
	
	private List<Kf05DTO> doctorList;
	
	private List<Kb01DTO> organList;
	
	private String apa165;
	
	private String apa703;
	
	private String doctorIDstr;
	
	private String organizeIDstr;
	
	private String ape028;
	
	private Long aaz524;
	
	private String apa011;
	
	private Date ape047s;
	
	private Date apa047s;
	
	private Long aaz381;
	
	public Date getApa047s() {
		return apa047s;
	}
	public void setApa047s(Date apa047s) {
		this.apa047s = apa047s;
	}
	public Date getApa048s() {
		return apa048s;
	}
	public void setApa048s(Date apa048s) {
		this.apa048s = apa048s;
	}
	private Date apa048s;
	
	public Date getApe047s() {
		return ape047s;
	}
	public void setApe047s(Date ape047s) {
		this.ape047s = ape047s;
	}
	public String getAbb025begin() {
		return abb025begin;
	}
	public void setAbb025begin(String abb025begin) {
		this.abb025begin = abb025begin;
	}
	public String getAbb025end() {
		return abb025end;
	}
	public void setAbb025end(String abb025end) {
		this.abb025end = abb025end;
	}
	public String getAae034begin() {
		return aae034begin;
	}
	public void setAae034begin(String aae034begin) {
		this.aae034begin = aae034begin;
	}
	public String getAae034end() {
		return aae034end;
	}
	public void setAae034end(String aae034end) {
		this.aae034end = aae034end;
	}
	public Date getAae034s() {
		return aae034s;
	}
	public void setAae034s(Date aae034s) {
		this.aae034s = aae034s;
	}
	public Date getAbb025s() {
		return abb025s;
	}
	public void setAbb025s(Date abb025s) {
		this.abb025s = abb025s;
	}
	public String getPersonIDstr() {
		return personIDstr;
	}
	public void setPersonIDstr(String personIDstr) {
		this.personIDstr = personIDstr;
	}
	public List<Ac01DTO> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Ac01DTO> personList) {
		this.personList = personList;
	}
	public List<Kf05DTO> getDoctorList() {
		return doctorList;
	}
	public void setDoctorList(List<Kf05DTO> doctorList) {
		this.doctorList = doctorList;
	}
	public List<Kb01DTO> getOrganList() {
		return organList;
	}
	public void setOrganList(List<Kb01DTO> organList) {
		this.organList = organList;
	}
	public String getApa165() {
		return apa165;
	}
	public void setApa165(String apa165) {
		this.apa165 = apa165;
	}
	public String getApa703() {
		return apa703;
	}
	public void setApa703(String apa703) {
		this.apa703 = apa703;
	}
	public String getDoctorIDstr() {
		return doctorIDstr;
	}
	public void setDoctorIDstr(String doctorIDstr) {
		this.doctorIDstr = doctorIDstr;
	}
	public String getOrganizeIDstr() {
		return organizeIDstr;
	}
	public void setOrganizeIDstr(String organizeIDstr) {
		this.organizeIDstr = organizeIDstr;
	}
	public String getApe028() {
		return ape028;
	}
	public void setApe028(String ape028) {
		this.ape028 = ape028;
	}
	public Long getAaz524() {
		return aaz524;
	}
	public void setAaz524(Long aaz524) {
		this.aaz524 = aaz524;
	}
	public String getApa011() {
		return apa011;
	}
	public void setApa011(String apa011) {
		this.apa011 = apa011;
	}
	public Long getAaz381() {
		return aaz381;
	}
	public void setAaz381(Long aaz381) {
		this.aaz381 = aaz381;
	}
	@Override
	public String toString() {
		return "Af53DTO [abb025begin=" + abb025begin + ", abb025end="
				+ abb025end + ", aae034begin=" + aae034begin + ", aae034end="
				+ aae034end + ", aae034s=" + aae034s + ", abb025s=" + abb025s
				+ ", personIDstr=" + personIDstr + ", personList=" + personList
				+ ", doctorList=" + doctorList + ", organList=" + organList
				+ ", apa165=" + apa165 + ", apa703=" + apa703
				+ ", doctorIDstr=" + doctorIDstr + ", organizeIDstr="
				+ organizeIDstr + ", ape028=" + ape028 + ", aaz524=" + aaz524
				+ ", apa011=" + apa011 + ", ape047s=" + ape047s + ", apa047s="
				+ apa047s + ", aaz381=" + aaz381 + ", apa048s=" + apa048s + "]";
	}
	
	
}
