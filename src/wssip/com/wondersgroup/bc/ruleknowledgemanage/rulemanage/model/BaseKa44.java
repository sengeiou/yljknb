package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ka44.
 */
@MappedSuperclass
public abstract class BaseKa44{

	private Long aaz319;
	private String aaa168;
	private String aaa167;
	private String aaa133;
	private String aaa153;
	private Long aaz320;
	private String aaa152;
	private String aaa154;
	private Long aae418;
	private String aaa181;
	private String aae100;
	private String aae011;
	private Date aae036;
	private String aaa027;
	private String aaa105;
	private String aae317;
	private String apa709;
	private String aaa179;
	private String aaa178;
	private String sftc;
	private String gzdm;

	public BaseKa44() {
	}

	public BaseKa44(Long aaz319, String aaa027) {
		this.aaz319 = aaz319;
		this.aaa027 = aaa027;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_AAZ319", allocationSize = 1)
	@Column(name = "AAZ319", unique = true, nullable = false, precision = 16, scale = 0)
	public Long getAaz319() {
		return this.aaz319;
	}

	public void setAaz319(Long aaz319) {
		this.aaz319 = aaz319;
	}

	@Column(name = "AAA168", length = 10)
	public String getAaa168() {
		return this.aaa168;
	}

	public void setAaa168(String aaa168) {
		this.aaa168 = aaa168;
	}

	@Column(name = "AAA167", length = 100)
	public String getAaa167() {
		return this.aaa167;
	}

	public void setAaa167(String aaa167) {
		this.aaa167 = aaa167;
	}

	@Column(name = "AAA133", length = 500)
	public String getAaa133() {
		return this.aaa133;
	}

	public void setAaa133(String aaa133) {
		this.aaa133 = aaa133;
	}

	@Column(name = "AAA153", length = 3)
	public String getAaa153() {
		return this.aaa153;
	}

	public void setAaa153(String aaa153) {
		this.aaa153 = aaa153;
	}

	@Column(name = "AAZ320", precision = 16, scale = 0)
	public Long getAaz320() {
		return this.aaz320;
	}

	public void setAaz320(Long aaz320) {
		this.aaz320 = aaz320;
	}

	@Column(name = "AAA152", length = 1000)
	public String getAaa152() {
		return this.aaa152;
	}

	public void setAaa152(String aaa152) {
		this.aaa152 = aaa152;
	}

	@Column(name = "AAA154", length = 1)
	public String getAaa154() {
		return this.aaa154;
	}

	public void setAaa154(String aaa154) {
		this.aaa154 = aaa154;
	}

	@Column(name = "AAE418", precision = 16, scale = 0)
	public Long getAae418() {
		return this.aae418;
	}

	public void setAae418(Long aae418) {
		this.aae418 = aae418;
	}

	@Column(name = "AAA181", length = 1000)
	public String getAaa181() {
		return this.aaa181;
	}

	public void setAaa181(String aaa181) {
		this.aaa181 = aaa181;
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

	@Temporal(TemporalType.DATE)
	@Column(name="AAE036", length=7)
	public Date getAae036() {
		return this.aae036;
	}

	public void setAae036(Date aae036) {
		this.aae036 = aae036;
	}

	@Column(name = "AAA027", nullable = false, length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Column(name = "AAA105", length = 1000)
	public String getAaa105() {
		return this.aaa105;
	}

	public void setAaa105(String aaa105) {
		this.aaa105 = aaa105;
	}

	@Column(name = "AAE317", length = 2000)
	public String getAae317() {
		return this.aae317;
	}

	public void setAae317(String aae317) {
		this.aae317 = aae317;
	}

	@Column(name = "APA709", length = 1)
	public String getApa709() {
		return this.apa709;
	}

	public void setApa709(String apa709) {
		this.apa709 = apa709;
	}

	@Column(name = "AAA179", length = 2)
	public String getAaa179() {
		return this.aaa179;
	}

	public void setAaa179(String aaa179) {
		this.aaa179 = aaa179;
	}

	@Column(name = "AAA178", length = 2)
	public String getAaa178() {
		return this.aaa178;
	}

	public void setAaa178(String aaa178) {
		this.aaa178 = aaa178;
	}

	@Column(name = "SFTC", length = 1)
	public String getSftc() {
		return this.sftc;
	}

	public void setSftc(String sftc) {
		this.sftc = sftc;
	}

	@Column(name = "GZDM", length = 20)
	public String getGzdm() {
		return this.gzdm;
	}

	public void setGzdm(String gzdm) {
		this.gzdm = gzdm;
	}
}
