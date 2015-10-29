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
 * @version $Revision$ 2014-08-19
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKd30 {

	private String baz007;
	private Integer aae002;
	private Integer bab010;
	private Double bae011;
	private String aaa027;
	private Date aae036;
	private String aae011;
	private String baz045;

	@Id
	@Column(name = "BAZ007", unique = true, nullable = false, length = 16)
	public String getBaz007() {
		return this.baz007;
	}

	public void setBaz007(String baz007) {
		this.baz007 = baz007;
	}

	@Column(name = "AAE002", precision = 6, scale = 0)
	public Integer getAae002() {
		return this.aae002;
	}

	public void setAae002(Integer aae002) {
		this.aae002 = aae002;
	}

	@Column(name = "BAB010", precision = 8, scale = 0)
	public Integer getBab010() {
		return this.bab010;
	}

	public void setBab010(Integer bab010) {
		this.bab010 = bab010;
	}

	@Column(name = "BAE011", precision = 16)
	public Double getBae011() {
		return this.bae011;
	}

	public void setBae011(Double bae011) {
		this.bae011 = bae011;
	}

	@Column(name = "AAA027", precision = 6, scale = 0)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AAE036", length = 7)
	public Date getAae036() {
		return this.aae036;
	}

	public void setAae036(Date aae036) {
		this.aae036 = aae036;
	}

	@Column(name = "AAE011", length = 50)
	public String getAae011() {
		return this.aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}
	
	@Column(name = "BAZ045", length = 1)
	public String getBaz045() {
		return this.baz045;
	}

	public void setBaz045(String baz045) {
		this.baz045 = baz045;
	}

	@Transient
	public String getEntityId() {

		return getBaz007();
	}

	@Transient
	public String getObjectId() {

		return getBaz007();
	}

}
