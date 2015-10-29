package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * Ka45.
 */
@MappedSuperclass
public abstract class BaseKa45 {

	private BaseKa45Id id;
	private double aaa005;
	private Long ape735;

	@EmbeddedId
	@GenericGenerator(name = "id", strategy = "assigned")
	@GeneratedValue(generator = "id")
	@AttributeOverrides( {
			@AttributeOverride(name = "aaz319", column = @Column(name = "AAZ319", nullable = false, precision = 16, scale = 0)),
			@AttributeOverride(name = "aaa155", column = @Column(name = "AAA155", nullable = false, precision = 2, scale = 0)) })
	public BaseKa45Id getId() {
		return this.id;
	}

	public void setId(BaseKa45Id id) {
		this.id = id;
	}

	@Column(name = "AAA005", precision = 16, scale = 4)
	public double getAaa005() {
		return this.aaa005;
	}

	public void setAaa005(double aaa005) {
		this.aaa005 = aaa005;
	}

	@Column(name = "APE735", precision = 16, scale = 0)
	public Long getApe735() {
		return this.ape735;
	}

	public void setApe735(Long ape735) {
		this.ape735 = ape735;
	}

}
