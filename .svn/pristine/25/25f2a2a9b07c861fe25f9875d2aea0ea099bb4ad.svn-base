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
public abstract class BaseKd33 {

	private String baz008;
	private String baz007;
	private String akb020;
	private String akb021;
	private Integer aae002;
	private Double bae012;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_BAZ008", allocationSize = 1)
	@Column(name = "BAZ008", unique = true, nullable = false, length = 16)
	public String getBaz008() {
		return this.baz008;
	}

	public void setBaz008(String baz008) {
		this.baz008 = baz008;
	}

	@Column(name = "BAZ007", length = 16)
	public String getBaz007() {
		return this.baz007;
	}

	public void setBaz007(String baz007) {
		this.baz007 = baz007;
	}

	@Column(name = "AKB020", length = 20)
	public String getAkb020() {
		return this.akb020;
	}

	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}

	@Column(name = "AKB021", length = 100)
	public String getAkb021() {
		return this.akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	@Column(name = "AAE002", precision = 6, scale = 0)
	public Integer getAae002() {
		return this.aae002;
	}

	public void setAae002(Integer aae002) {
		this.aae002 = aae002;
	}

	@Column(name = "BAE012", precision = 16)
	public Double getBae012() {
		return this.bae012;
	}

	public void setBae012(Double bae012) {
		this.bae012 = bae012;
	}

	@Transient
	public String getEntityId() {

		return getBaz008();
	}

	@Transient
	public String getObjectId() {

		return getBaz008();
	}
}
