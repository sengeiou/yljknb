package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2014-07-114
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKe01 {

	private String baz006;
	private String baz005;
	private String baz034;
	private String akb020;
	private String baz035;
	private String baz036;
	private String baz037;
	private String baz038;
	private Date baz039;
	private String baz003;

	@Id
	@Column(name = "BAZ006", unique = true, nullable = false, length = 16)
	public String getBaz006() {
		return this.baz006;
	}

	public void setBaz006(String baz006) {
		this.baz006 = baz006;
	}

	@Column(name = "BAZ005", length = 16)
	public String getBaz005() {
		return this.baz005;
	}

	public void setBaz005(String baz005) {
		this.baz005 = baz005;
	}

	@Column(name = "BAZ034", length = 1)
	public String getBaz034() {
		return this.baz034;
	}

	public void setBaz034(String baz034) {
		this.baz034 = baz034;
	}

	@Column(name = "AKB020", length = 20)
	public String getAkb020() {
		return this.akb020;
	}

	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}

	@Column(name = "BAZ035", length = 1000)
	public String getBaz035() {
		return this.baz035;
	}

	public void setBaz035(String baz035) {
		this.baz035 = baz035;
	}

	@Column(name = "BAZ036", length = 100)
	public String getBaz036() {
		return this.baz036;
	}

	public void setBaz036(String baz036) {
		this.baz036 = baz036;
	}

	@Column(name = "BAZ037", length = 100)
	public String getBaz037() {
		return this.baz037;
	}

	public void setBaz037(String baz037) {
		this.baz037 = baz037;
	}

	@Column(name = "BAZ038", length = 50)
	public String getBaz038() {
		return this.baz038;
	}

	public void setBaz038(String baz038) {
		this.baz038 = baz038;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BAZ039", length = 19)
	public Date getBaz039() {
		return this.baz039;
	}

	public void setBaz039(Date baz039) {
		this.baz039 = baz039;
	}

	@Column(name = "BAZ003", length = 16)
	public String getBaz003() {
		return this.baz003;
	}

	public void setBaz003(String baz003) {
		this.baz003 = baz003;
	}

	@Transient
	public String getEntityId() {

		return getBaz006();
	}

	@Transient
	public String getObjectId() {

		return getBaz006();
	}

}
