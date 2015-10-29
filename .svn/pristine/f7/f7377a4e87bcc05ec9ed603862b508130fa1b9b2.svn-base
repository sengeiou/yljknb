package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @ClassName: BaseAf40 
 * @Description:  
 * @author chenlin
 * @date 2014-7-22 下午01:28:37 
 *
 */
@MappedSuperclass
public abstract class BaseAf40 {

	private Long aaz360;
	private String aaa027;
	private Integer aae149;
	private String apa703;
	private String apa705;
	private String aae011;
	private Long ape127;
	private Long ape136;
	private Long ape135;
	private Long ape137;

	public BaseAf40() {
	}

	public BaseAf40(Long aaz360, String aaa027) {
		this.aaz360 = aaz360;
		this.aaa027 = aaa027;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_AAZ360", allocationSize = 1)
	@Column(name = "AAZ360", unique = true, nullable = false, precision = 16, scale = 0)
	public Long getAaz360() {
		return this.aaz360;
	}

	public void setAaz360(Long aaz360) {
		this.aaz360 = aaz360;
	}

	@Column(name = "AAA027", nullable = false, length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Column(name = "AAE149", precision = 6, scale = 0)
	public Integer getAae149() {
		return this.aae149;
	}

	public void setAae149(Integer aae149) {
		this.aae149 = aae149;
	}

	@Column(name = "APA703", length = 1)
	public String getApa703() {
		return this.apa703;
	}

	public void setApa703(String apa703) {
		this.apa703 = apa703;
	}

	@Column(name = "APA705", length = 3)
	public String getApa705() {
		return this.apa705;
	}

	public void setApa705(String apa705) {
		this.apa705 = apa705;
	}

	@Column(name = "AAE011", length = 20)
	public String getAae011() {
		return this.aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}

	@Column(name = "APE127", precision = 16, scale = 0)
	public Long getApe127() {
		return this.ape127;
	}

	public void setApe127(Long ape127) {
		this.ape127 = ape127;
	}

	@Column(name = "APE136", precision = 16, scale = 0)
	public Long getApe136() {
		return this.ape136;
	}

	public void setApe136(Long ape136) {
		this.ape136 = ape136;
	}

	@Column(name = "APE135", precision = 16, scale = 0)
	public Long getApe135() {
		return this.ape135;
	}

	public void setApe135(Long ape135) {
		this.ape135 = ape135;
	}

	@Column(name = "APE137", precision = 16, scale = 0)
	public Long getApe137() {
		return this.ape137;
	}

	public void setApe137(Long ape137) {
		this.ape137 = ape137;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
