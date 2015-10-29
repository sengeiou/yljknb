package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
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
public abstract class BaseKc63 {

	private String baz001;
	private String aaz370;
	private String aac003;
	private String aac002;
	private String aac001;
	private String aac004;
	private Integer aac006;
	private String aac012;
	private String akb020;
	private String akb021;
	private String akb022;
	private Long aaz307;
	private String akf001;
	private String aae386;
	private String aaz263;
	private String aka130;
	private Date akc194;
	private Double ake038;
	private Double akc254;
	private Double akc253;
	private Double akb067;
	private Double akc264;
	private String akc050;
	private String akc193;
	private String akc185;
	private String aka120;
	private String akc186;
	private String akc188;
	private String akc274;
	private String akc275;
	private String akc276;
	private String akc277;
	private Integer aae030;
	private Integer aae031;
	private Date baz020;
	private String baz021;
	private String baz022;
	private String baz031;
	private String aaa027;
	private String bac003;
	private String aaz308;
	private String baz101;
	private String baz102;
	private String aka131;
	private String akc021;
	private String akc190;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_BAZ001", allocationSize = 1)
	@Column(name = "BAZ001", unique = true, nullable = false, length = 16)
	public String getBaz001() {
		return this.baz001;
	}

	public void setBaz001(String baz001) {
		this.baz001 = baz001;
	}

	@Column(name = "AAZ370", length = 20)
	public String getAaz370() {
		return this.aaz370;
	}

	public void setAaz370(String aaz370) {
		this.aaz370 = aaz370;
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

	@Column(name = "AAC001", length = 20)
	public String getAac001() {
		return this.aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	@Column(name = "AAC004", length = 1)
	public String getAac004() {
		return this.aac004;
	}

	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}

	@Column(name = "AAC006", length = 8)
	public Integer getAac006() {
		return this.aac006;
	}

	public void setAac006(Integer aac006) {
		this.aac006 = aac006;
	}

	@Column(name = "AAC012", length = 2)
	public String getAac012() {
		return this.aac012;
	}

	public void setAac012(String aac012) {
		this.aac012 = aac012;
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

	@Column(name = "AKB022", length = 1)
	public String getAkb022() {
		return this.akb022;
	}

	public void setAkb022(String akb022) {
		this.akb022 = akb022;
	}

	@Column(name = "AAZ307", precision = 16, scale = 0)
	public Long getAaz307() {
		return this.aaz307;
	}

	public void setAaz307(Long aaz307) {
		this.aaz307 = aaz307;
	}

	@Column(name = "AKF001", length = 20)
	public String getAkf001() {
		return this.akf001;
	}

	public void setAkf001(String akf001) {
		this.akf001 = akf001;
	}

	@Column(name = "AAE386", length = 100)
	public String getAae386() {
		return this.aae386;
	}

	public void setAae386(String aae386) {
		this.aae386 = aae386;
	}

	@Column(name = "AAZ263", precision = 20, scale = 0)
	public String getAaz263() {
		return this.aaz263;
	}

	public void setAaz263(String aaz263) {
		this.aaz263 = aaz263;
	}

	@Column(name = "AKA130", length = 2)
	public String getAka130() {
		return this.aka130;
	}

	public void setAka130(String aka130) {
		this.aka130 = aka130;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AKC194", length = 7)
	public Date getAkc194() {
		return this.akc194;
	}

	public void setAkc194(Date akc194) {
		this.akc194 = akc194;
	}

	@Column(name = "AKE038", precision = 16)
	public Double getAke038() {
		return this.ake038;
	}

	public void setAke038(Double ake038) {
		this.ake038 = ake038;
	}

	@Column(name = "AKC254", precision = 16)
	public Double getAkc254() {
		return this.akc254;
	}

	public void setAkc254(Double akc254) {
		this.akc254 = akc254;
	}

	@Column(name = "AKC253", precision = 16)
	public Double getAkc253() {
		return this.akc253;
	}

	public void setAkc253(Double akc253) {
		this.akc253 = akc253;
	}

	@Column(name = "AKB067", precision = 16)
	public Double getAkb067() {
		return this.akb067;
	}

	public void setAkb067(Double akb067) {
		this.akb067 = akb067;
	}

	@Column(name = "AKC264", precision = 16)
	public Double getAkc264() {
		return this.akc264;
	}

	public void setAkc264(Double akc264) {
		this.akc264 = akc264;
	}

	@Column(name = "AKC050", length = 100)
	public String getAkc050() {
		return this.akc050;
	}

	public void setAkc050(String akc050) {
		this.akc050 = akc050;
	}

	@Column(name = "AKC193", length = 20)
	public String getAkc193() {
		return this.akc193;
	}

	public void setAkc193(String akc193) {
		this.akc193 = akc193;
	}

	@Column(name = "AKC185", length = 100)
	public String getAkc185() {
		return this.akc185;
	}

	public void setAkc185(String akc185) {
		this.akc185 = akc185;
	}

	@Column(name = "AKA120", length = 20)
	public String getAka120() {
		return this.aka120;
	}

	public void setAka120(String aka120) {
		this.aka120 = aka120;
	}

	@Column(name = "AKC186", length = 100)
	public String getAkc186() {
		return this.akc186;
	}

	public void setAkc186(String akc186) {
		this.akc186 = akc186;
	}

	@Column(name = "AKC188", length = 20)
	public String getAkc188() {
		return this.akc188;
	}

	public void setAkc188(String akc188) {
		this.akc188 = akc188;
	}

	@Column(name = "AKC274", length = 100)
	public String getAkc274() {
		return this.akc274;
	}

	public void setAkc274(String akc274) {
		this.akc274 = akc274;
	}

	@Column(name = "AKC275", length = 20)
	public String getAkc275() {
		return this.akc275;
	}

	public void setAkc275(String akc275) {
		this.akc275 = akc275;
	}

	@Column(name = "AKC276", length = 100)
	public String getAkc276() {
		return this.akc276;
	}

	public void setAkc276(String akc276) {
		this.akc276 = akc276;
	}

	@Column(name = "AKC277", length = 20)
	public String getAkc277() {
		return this.akc277;
	}

	public void setAkc277(String akc277) {
		this.akc277 = akc277;
	}

	@Column(name = "AAE030", precision = 8, scale = 0)
	public Integer getAae030() {
		return this.aae030;
	}

	public void setAae030(Integer aae030) {
		this.aae030 = aae030;
	}

	@Column(name = "AAE031", precision = 8, scale = 0)
	public Integer getAae031() {
		return this.aae031;
	}

	public void setAae031(Integer aae031) {
		this.aae031 = aae031;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BAZ020", length = 7)
	public Date getBaz020() {
		return this.baz020;
	}

	public void setBaz020(Date baz020) {
		this.baz020 = baz020;
	}

	@Column(name = "BAZ021", length = 1)
	public String getBaz021() {
		return this.baz021;
	}

	public void setBaz021(String baz021) {
		this.baz021 = baz021;
	}

	@Column(name = "BAZ031", length = 2)
	public String getBaz031() {
		return this.baz031;
	}

	public void setBaz031(String baz031) {
		this.baz031 = baz031;
	}

	@Column(name = "BAZ022", length = 100)
	public String getBaz022() {
		return this.baz022;
	}

	public void setBaz022(String baz022) {
		this.baz022 = baz022;
	}

	@Column(name = "AAA027", length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Column(name = "BAC003", length = 50)
	public String getBac003() {
		return this.bac003;
	}

	public void setBac003(String bac003) {
		this.bac003 = bac003;
	}

	@Column(name = "AAZ308", length = 20)
	public String getAaz308() {
		return aaz308;
	}

	public void setAaz308(String aaz308) {
		this.aaz308 = aaz308;
	}

	@Transient
	public String getEntityId() {

		return getBaz001();
	}

	@Transient
	public String getObjectId() {

		return getBaz001();
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

	@Column(name = "AKA131", length = 4)
	public String getAka131() {
		return aka131;
	}

	public void setAka131(String aka131) {
		this.aka131 = aka131;
	}

	@Column(name = "AKC021", length = 3)
	public String getAkc021() {
		return akc021;
	}

	public void setAkc021(String akc021) {
		this.akc021 = akc021;
	}
	
	@Column(name = "AKC190", length = 20)
	public String getAkc190() {
		return akc190;
	}

	public void setAkc190(String akc190) {
		this.akc190 = akc190;
	}
}
