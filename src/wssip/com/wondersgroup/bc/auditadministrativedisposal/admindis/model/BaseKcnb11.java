package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;

/**
 * @author Administrator
 *
 */
@MappedSuperclass
public class BaseKcnb11 {

	private String akb020;
	private String akb021;
	private String akb027;
	private String akb023;
	private String aaa023;
	private String akb024;
	private String aaa027;
	private String anal_id;
	private String aae041;
	private String aae042;
	private String analcode;
	private Date createtime;
	public String getAkb020() {
		return akb020;
	}
	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}
	public String getAkb021() {
		return akb021;
	}
	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}
	public String getAkb027() {
		return akb027;
	}
	public void setAkb027(String akb027) {
		this.akb027 = akb027;
	}
	public String getAkb023() {
		return akb023;
	}
	public void setAkb023(String akb023) {
		this.akb023 = akb023;
	}
	public String getAaa023() {
		return aaa023;
	}
	public void setAaa023(String aaa023) {
		this.aaa023 = aaa023;
	}
	public String getAkb024() {
		return akb024;
	}
	public void setAkb024(String akb024) {
		this.akb024 = akb024;
	}
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getAnal_id() {
		return anal_id;
	}
	public void setAnal_id(String anal_id) {
		this.anal_id = anal_id;
	}
	public String getAae041() {
		return aae041;
	}
	public void setAae041(String aae041) {
		this.aae041 = aae041;
	}
	public String getAae042() {
		return aae042;
	}
	public void setAae042(String aae042) {
		this.aae042 = aae042;
	}
	public String getAnalcode() {
		return analcode;
	}
	public void setAnalcode(String analcode) {
		this.analcode = analcode;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
}
