package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * 
 * @ClassName: Ka06 
 * @Description: 疾病信息 
 * @author chenlin
 * @date 2014-8-4 上午11:13:12 
 *
 */
@MappedSuperclass
public abstract class BaseKa06{

	private String aka122;
	private String aaa027;
	private String aka120;
	private String aka121;
	private String aae100;
	private String aka035;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_AKA122", allocationSize = 1)
	@Column(name = "AKA122", unique = true, nullable = false, length = 20)
	public String getAka122() {
		return this.aka122;
	}

	public void setAka122(String aka122) {
		this.aka122 = aka122;
	}

	@Column(name = "AAA027", nullable = false, length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Column(name = "AKA120", length = 20)
	public String getAka120() {
		return this.aka120;
	}

	public void setAka120(String aka120) {
		this.aka120 = aka120;
	}

	@Column(name = "AKA121", length = 100)
	public String getAka121() {
		return this.aka121;
	}

	public void setAka121(String aka121) {
		this.aka121 = aka121;
	}

	@Column(name = "AAE100", length = 1)
	public String getAae100() {
		return this.aae100;
	}

	public void setAae100(String aae100) {
		this.aae100 = aae100;
	}

	@Column(name = "AKA035", length = 1)
	public String getAka035() {
		return this.aka035;
	}

	public void setAka035(String aka035) {
		this.aka035 = aka035;
	}

	@Transient
	public String getEntityId() {

		return getAka122();
	}

	@Transient
	public String getObjectId() {

		return getAka122();
	}
	
}
