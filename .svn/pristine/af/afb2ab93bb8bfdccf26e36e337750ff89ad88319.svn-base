package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2014-08-19
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKd34 {

	private String baz009;
	private String baz008;
	private String baz003;
	private String baz001;
	private String aac001;
	private String aac003;
	private String aac002;
	private Double akb065;
	private Double baz041;
	private String baz031;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_BAZ009", allocationSize = 1)
	@Column(name = "BAZ009", unique = true, nullable = false, length = 16)
	public String getBaz009() {
		return this.baz009;
	}

	public void setBaz009(String baz009) {
		this.baz009 = baz009;
	}

	@Column(name = "BAZ008", precision = 16, scale = 0)
	public String getBaz008() {
		return this.baz008;
	}

	public void setBaz008(String baz008) {
		this.baz008 = baz008;
	}

	@Column(name = "BAZ003", length = 16)
	public String getBaz003() {
		return this.baz003;
	}

	public void setBaz003(String baz003) {
		this.baz003 = baz003;
	}

	@Column(name = "BAZ001", length = 16)
	public String getBaz001() {
		return this.baz001;
	}

	public void setBaz001(String baz001) {
		this.baz001 = baz001;
	}

	@Column(name = "AAC001", length = 20)
	public String getAac001() {
		return this.aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	@Column(name = "AAC003", length = 50)
	public String getAac003() {
		return this.aac003;
	}

	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}

	@Column(name = "AAC002", length = 18)
	public String getAac002() {
		return this.aac002;
	}

	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}

	@Column(name = "AKB065", precision = 16)
	public Double getAkb065() {
		return this.akb065;
	}

	public void setAkb065(Double akb065) {
		this.akb065 = akb065;
	}

	@Column(name = "BAZ041", precision = 16)
	public Double getBaz041() {
		return this.baz041;
	}

	public void setBaz041(Double baz041) {
		this.baz041 = baz041;
	}

	@Column(name = "BAZ031", length = 2)
	public String getBaz031() {
		return this.baz031;
	}

	public void setBaz031(String baz031) {
		this.baz031 = baz031;
	}

	@Transient
	public String getEntityId() {

		return getBaz009();
	}

	@Transient
	public String getObjectId() {

		return getBaz009();
	}

}
