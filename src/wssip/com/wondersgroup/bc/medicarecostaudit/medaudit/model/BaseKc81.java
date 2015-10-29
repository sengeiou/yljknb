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
public abstract class BaseKc81 {

	private String baz005;
	private String baz001;
	private String baz003;
	private String baz031;
	private String baz021;
	private String baz022;
	private Date baz023;
	private String baz025;
	private String aae100;
	private String baz033;
	private Double baz041;
	private Integer bae041;
	private Date aae002;
	private String baz101;
	private String baz102;
	private String baz026;

	@Id
	@Column(name = "BAZ005", unique = true, nullable = false, length = 16)
	public String getBaz005() {
		return this.baz005;
	}

	public void setBaz005(String baz005) {
		this.baz005 = baz005;
	}

	@Column(name = "BAZ001", length = 16)
	public String getBaz001() {
		return this.baz001;
	}

	public void setBaz001(String baz001) {
		this.baz001 = baz001;
	}

	@Column(name = "BAZ003", length = 16)
	public String getBaz003() {
		return this.baz003;
	}

	public void setBaz003(String baz003) {
		this.baz003 = baz003;
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

	@Column(name = "BAZ025", length = 1)
	public String getBaz025() {
		return this.baz025;
	}

	public void setBaz025(String baz025) {
		this.baz025 = baz025;
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

	@Column(name = "BAZ041", length = 16, precision = 2)
	public Double getBaz041() {
		return baz041;
	}

	public void setBaz041(Double baz041) {
		this.baz041 = baz041;
	}

	@Column(name = "BAE041", scale = 0)
	public Integer getBae041() {
		return bae041;
	}

	public void setBae041(Integer bae041) {
		this.bae041 = bae041;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AAE002", length = 7)
	public Date getAae002() {
		return aae002;
	}

	public void setAae002(Date aae002) {
		this.aae002 = aae002;
	}

	@Transient
	public String getEntityId() {

		return getBaz005();
	}

	@Transient
	public String getObjectId() {

		return getBaz005();
	}

	@Column(name = "BAZ101", length = 1)
	public String getBaz101() {
		return baz101;
	}

	public void setBaz101(String baz101) {
		this.baz101 = baz101;
	}

	@Column(name = "BAZ102", length = 1)
	public String getBaz102() {
		return baz102;
	}

	public void setBaz102(String baz102) {
		this.baz102 = baz102;
	}

	@Column(name = "BAZ026", length = 100)
	public String getBaz026() {
		return baz026;
	}

	public void setBaz026(String baz026) {
		this.baz026 = baz026;
	}
	
}
