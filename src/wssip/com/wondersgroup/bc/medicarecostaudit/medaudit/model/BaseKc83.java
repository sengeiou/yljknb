package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author wsj
 */
@MappedSuperclass
public abstract class BaseKc83 {

	private String baz013;//审核记录ID
	private String baz011;//违规单据ID
	private String baz031;//审核状态
	private String baz021;//审核结果说明
	private String baz022;//经办人
	private Date baz023;//经办时间
	private String aae100;//有效标志
	private String baz033;//违规类型
	private String baz026;//经办机构
	private String aka131;//医疗类别细分

	@Id
	@Column(name = "BAZ013", unique = true, nullable = false, length = 16)
	public String getBaz013() {
		return this.baz013;
	}

	public void setBaz013(String baz013) {
		this.baz013 = baz013;
	}

	@Column(name = "BAZ011", length = 16)
	public String getBaz011() {
		return this.baz011;
	}

	public void setBaz011(String baz011) {
		this.baz011 = baz011;
	}

	@Column(name = "BAZ031", length = 2)
	public String getBaz031() {
		return this.baz031;
	}

	public void setBaz031(String baz031) {
		this.baz031 = baz031;
	}

	@Column(name = "BAZ021", length = 500)
	public String getBaz021() {
		return this.baz021;
	}

	public void setBaz021(String baz021) {
		this.baz021 = baz021;
	}

	@Column(name = "BAZ022", length = 100)
	public String getBaz022() {
		return this.baz022;
	}

	public void setBaz022(String baz022) {
		this.baz022 = baz022;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BAZ023", length = 7)
	public Date getBaz023() {
		return this.baz023;
	}

	public void setBaz023(Date baz023) {
		this.baz023 = baz023;
	}

	@Column(name = "AAE100", length = 1)
	public String getAae100() {
		return this.aae100;
	}

	public void setAae100(String aae100) {
		this.aae100 = aae100;
	}

	@Column(name = "BAZ033", length = 1)
	public String getBaz033() {
		return this.baz033;
	}

	public void setBaz033(String baz033) {
		this.baz033 = baz033;
	}

	@Transient
	public String getEntityId() {
		return getBaz013();
	}

	@Transient
	public String getObjectId() {
		return getBaz013();
	}

	@Column(name = "BAZ026", length = 100)
	public String getBaz026() {
		return baz026;
	}

	public void setBaz026(String baz026) {
		this.baz026 = baz026;
	}

	@Column(name = "AKA131", length = 4)
	public String getAka131() {
		return aka131;
	}

	public void setAka131(String aka131) {
		this.aka131 = aka131;
	}

}
