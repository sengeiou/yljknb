package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * Ka43.
 */
@MappedSuperclass
public abstract class BaseKa43 {

	private Long aaz320;
	private String aaa169;
	private String aaa153;
	private Integer aaz321;
	private Integer aaz100;
	private String aae100;
	private String aae011;
	private String aae036; 

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_AAZ320", allocationSize = 1)
	@Column(name = "AAZ320", unique = true, nullable = false, precision = 16, scale = 0)
	public Long getAaz320() {
		return this.aaz320;
	}

	public void setAaz320(Long aaz320) {
		this.aaz320 = aaz320;
	}

	@Column(name = "AAA169", length = 100)
	public String getAaa169() {
		return this.aaa169;
	}

	public void setAaa169(String aaa169) {
		this.aaa169 = aaa169;
	}

	@Column(name = "AAA153", length = 3)
	public String getAaa153() {
		return this.aaa153;
	}

	public void setAaa153(String aaa153) {
		this.aaa153 = aaa153;
	}

	@Column(name = "AAZ321", precision = 6, scale = 0)
	public Integer getAaz321() {
		return this.aaz321;
	}

	public void setAaz321(Integer aaz321) {
		this.aaz321 = aaz321;
	}

	@Column(name = "AAZ100", precision = 6, scale = 0)
	public Integer getAaz100() {
		return this.aaz100;
	}

	public void setAaz100(Integer aaz100) {
		this.aaz100 = aaz100;
	}

	@Column(name = "AAE100", length = 1)
	public String getAae100() {
		return this.aae100;
	}

	public void setAae100(String aae100) {
		this.aae100 = aae100;
	}

	@Column(name = "AAE011", length = 20)
	public String getAae011() {
		return this.aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}

	// @Temporal(TemporalType.DATE)
	@Column(name = "AAE036", length = 30)
	public String getAae036() {
		return this.aae036;
	}

	public void setAae036(String aae036) {
		this.aae036 = aae036;
	}
	
	@Transient
	public Long getEntityId() {

		return getAaz320();
	}

	@Transient
	public Long getObjectId() {

		return getAaz320();
	}

}
