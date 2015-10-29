package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke13;

public class Ke13DTO extends Ke13{

	private Date aae041Star;
	
	private Date aae042End;
	
	private String aae041s;
	
	private String aae042s;
	
	private String drfee;
	
	private Integer rank;
	
	private String analid;
	
	private Double valueA;
	
	private Double cjfy;
	
	private Double rjfy;
	
	private String userid;
	
	private String isdelete;
	
	private String analcode;

	public Date getAae041Star() {
		return aae041Star;
	}

	public void setAae041Star(Date aae041Star) {
		this.aae041Star = aae041Star;
	}

	public Date getAae042End() {
		return aae042End;
	}

	public void setAae042End(Date aae042End) {
		this.aae042End = aae042End;
	}

	public String getAae041s() {
		return aae041s;
	}

	public void setAae041s(String aae041s) {
		this.aae041s = aae041s;
	}

	public String getAae042s() {
		return aae042s;
	}

	public void setAae042s(String aae042s) {
		this.aae042s = aae042s;
	}

	public String getDrfee() {
		return drfee;
	}

	public void setDrfee(String drfee) {
		this.drfee = drfee;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Double getValueA() {
		return valueA;
	}

	public void setValueA(Double valueA) {
		this.valueA = valueA;
	}

	public String getAnalid() {
		return analid;
	}

	public void setAnalid(String analid) {
		this.analid = analid;
	}

	public Double getCjfy() {
		return cjfy;
	}

	public void setCjfy(Double cjfy) {
		this.cjfy = cjfy;
	}

	public Double getRjfy() {
		return rjfy;
	}

	public void setRjfy(Double rjfy) {
		this.rjfy = rjfy;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	public String getAnalcode() {
		return analcode;
	}

	public void setAnalcode(String analcode) {
		this.analcode = analcode;
	}
}
