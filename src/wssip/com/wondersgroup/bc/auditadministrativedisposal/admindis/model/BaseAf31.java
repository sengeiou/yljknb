package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2014-6-26
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf31 {

	private String aaz077;
	private String aaa027;
	private Long aaz318;
	private String apa709;
	private String aaz010;
	private String ape008;
	private String apa701;
	private String apa005;
	private String ape726;
	private String ape725;
	private Integer ape727;
	private String apa154;
	private String apa156;
	private String apa155;
	private String apa158;
	private Double ape752;
	private String apa162;
	private String apa163;
	private String apa161;
	private String apa157;
	private Integer aae031;
	private String apa011;
	private String aae189;
	private String aae012;
	private Integer aae034;
	private Integer abb087;
	private String aab004;
	private String aae004;
	private String ape023;
	private String aae013;
	private String aae011;
	private Date aae036;
	private String aae425;
	private String apa168;
	private Integer dcbz;
	private Integer jlbz;
	private String apa763;      //改变医疗保险费用结算方式标志
	private String apa164;
	private String apa165;     //问题状态

	@Id
	@Column(name = "AAZ077", unique = true, nullable = false, length = 20)
	public String getAaz077() {
		return this.aaz077;
	}

	public void setAaz077(String aaz077) {
		this.aaz077 = aaz077;
	}

	@Column(name = "AAA027", nullable = false, length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Column(name = "AAZ318", precision = 16, scale = 0)
	public Long getAaz318() {
		return this.aaz318;
	}

	public void setAaz318(Long aaz318) {
		this.aaz318 = aaz318;
	}

	@Column(name = "APA709", length = 1)
	public String getApa709() {
		return this.apa709;
	}

	public void setApa709(String apa709) {
		this.apa709 = apa709;
	}

	@Column(name = "AAZ010", length = 20)
	public String getAaz010() {
		return this.aaz010;
	}

	public void setAaz010(String aaz010) {
		this.aaz010 = aaz010;
	}

	@Column(name = "APE008", length = 100)
	public String getApe008() {
		return this.ape008;
	}

	public void setApe008(String ape008) {
		this.ape008 = ape008;
	}

	@Column(name = "APA701", length = 100)
	public String getApa701() {
		return this.apa701;
	}

	public void setApa701(String apa701) {
		this.apa701 = apa701;
	}

	@Column(name = "APA005", length = 2)
	public String getApa005() {
		return this.apa005;
	}

	public void setApa005(String apa005) {
		this.apa005 = apa005;
	}

	@Column(name = "APE726", length = 1000)
	public String getApe726() {
		return this.ape726;
	}

	public void setApe726(String ape726) {
		this.ape726 = ape726;
	}

	@Column(name = "APE725", length = 50)
	public String getApe725() {
		return this.ape725;
	}

	public void setApe725(String ape725) {
		this.ape725 = ape725;
	}

	@Column(name = "APE727", precision = 8, scale = 0)
	public Integer getApe727() {
		return this.ape727;
	}

	public void setApe727(Integer ape727) {
		this.ape727 = ape727;
	}

	@Column(name = "APA154", length = 1)
	public String getApa154() {
		return this.apa154;
	}

	public void setApa154(String apa154) {
		this.apa154 = apa154;
	}

	@Column(name = "APA156", length = 1)
	public String getApa156() {
		return this.apa156;
	}

	public void setApa156(String apa156) {
		this.apa156 = apa156;
	}

	@Column(name = "APA155", length = 1)
	public String getApa155() {
		return this.apa155;
	}

	public void setApa155(String apa155) {
		this.apa155 = apa155;
	}

	@Column(name = "APA158", length = 1)
	public String getApa158() {
		return this.apa158;
	}

	public void setApa158(String apa158) {
		this.apa158 = apa158;
	}

	@Column(name = "APE752", precision = 16)
	public Double getApe752() {
		return this.ape752;
	}

	public void setApe752(Double ape752) {
		this.ape752 = ape752;
	}

	@Column(name = "APA162", length = 1)
	public String getApa162() {
		return this.apa162;
	}

	public void setApa162(String apa162) {
		this.apa162 = apa162;
	}

	@Column(name = "APA163", length = 1)
	public String getApa163() {
		return this.apa163;
	}

	public void setApa163(String apa163) {
		this.apa163 = apa163;
	}

	@Column(name = "APA161", length = 1)
	public String getApa161() {
		return this.apa161;
	}

	public void setApa161(String apa161) {
		this.apa161 = apa161;
	}

	@Column(name = "APA157", length = 1)
	public String getApa157() {
		return this.apa157;
	}

	public void setApa157(String apa157) {
		this.apa157 = apa157;
	}

	@Column(name = "AAE031", precision = 8, scale = 0)
	public Integer getAae031() {
		return this.aae031;
	}

	public void setAae031(Integer aae031) {
		this.aae031 = aae031;
	}

	@Column(name = "APA011", length = 1)
	public String getApa011() {
		return this.apa011;
	}

	public void setApa011(String apa011) {
		this.apa011 = apa011;
	}

	@Column(name = "AAE189", length = 200)
	public String getAae189() {
		return this.aae189;
	}

	public void setAae189(String aae189) {
		this.aae189 = aae189;
	}

	@Column(name = "AAE012", length = 20)
	public String getAae012() {
		return this.aae012;
	}

	public void setAae012(String aae012) {
		this.aae012 = aae012;
	}

	@Column(name = "AAE034", precision = 8, scale = 0)
	public Integer getAae034() {
		return this.aae034;
	}

	public void setAae034(Integer aae034) {
		this.aae034 = aae034;
	}

	@Column(name = "ABB087", precision = 8, scale = 0)
	public Integer getAbb087() {
		return this.abb087;
	}

	public void setAbb087(Integer abb087) {
		this.abb087 = abb087;
	}

	@Column(name = "AAB004", length = 100)
	public String getAab004() {
		return this.aab004;
	}

	public void setAab004(String aab004) {
		this.aab004 = aab004;
	}

	@Column(name = "AAE004", length = 50)
	public String getAae004() {
		return this.aae004;
	}

	public void setAae004(String aae004) {
		this.aae004 = aae004;
	}

	@Column(name = "APE023", length = 1000)
	public String getApe023() {
		return this.ape023;
	}

	public void setApe023(String ape023) {
		this.ape023 = ape023;
	}

	@Column(name = "AAE013", length = 150)
	public String getAae013() {
		return this.aae013;
	}

	public void setAae013(String aae013) {
		this.aae013 = aae013;
	}

	@Column(name = "AAE011", length = 20)
	public String getAae011() {
		return this.aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AAE036", length = 7)
	public Date getAae036() {
		return this.aae036;
	}

	public void setAae036(Date aae036) {
		this.aae036 = aae036;
	}

	@Column(name = "AAE425", length = 1)
	public String getAae425() {
		return this.aae425;
	}

	public void setAae425(String aae425) {
		this.aae425 = aae425;
	}

	@Column(name = "APA168", length = 1)
	public String getApa168() {
		return this.apa168;
	}

	public void setApa168(String apa168) {
		this.apa168 = apa168;
	}

	@Transient
	public String getEntityId() {

		return getAaz077();
	}

	@Transient
	public String getObjectId() {

		return getAaz077();
	}

	@Column(name = "DCBZ", precision = 8, scale = 0)
	public Integer getDcbz() {
		return dcbz;
	}

	public void setDcbz(Integer dcbz) {
		this.dcbz = dcbz;
	}

	@Column(name = "JLBZ", precision = 8, scale = 0)
	public Integer getJlbz() {
		return jlbz;
	}

	public void setJlbz(Integer jlbz) {
		this.jlbz = jlbz;
	}
	@Column(name = "APA763", length = 1)
	public String getApa763() {
		return apa763;
	}

	public void setApa763(String apa763) {
		this.apa763 = apa763;
	}
	@Column(name = "APA164", length = 1)
	public String getApa164() {
		return apa164;
	}

	public void setApa164(String apa164) {
		this.apa164 = apa164;
	}
	@Column(name = "APA165", length = 1)
	public String getApa165() {
		return apa165;
	}

	public void setApa165(String apa165) {
		this.apa165 = apa165;
	}
	
	

}
