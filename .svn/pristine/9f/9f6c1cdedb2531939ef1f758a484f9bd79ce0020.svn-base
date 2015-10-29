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
 * @author wsj
 */
@MappedSuperclass
public abstract class BaseKc65 {

	private String baz011;//单病种违规单据ID
	private String aaz370;//就诊编号
	private String aac003;//参保人姓名
	private String aac002;//社会保障号
	private String aac001;//参保人ID
	private String aac004;//参保人性别
	private Integer aac006;//参保人出生日期
	private String aac012;//个人身份
	private String akb020;//医疗服务机构编号
	private String akb021;//医疗服务机构名称
	private String akb022;//医疗服务机构类型
	private Long aaz307;//科室编码
	private String akf001;//科室分类
	private String aae386;//科室名称
	private String aaz263;//医护人员编号
	private String aka130;//医疗类别
	private Date akc194;//就诊结算时间
	private Double ake038;//个人账户支出
	private Double akc254;//个人自付金额
	private Double akc253;//自费金额
	private Double akb067;//个人现金支付金额
	private Double akc264;//总费用
	private String akc050;//入院疾病诊断名称
	private String akc193;//入院疾病诊断代码
	private String akc185;//出院主要疾病诊断
	private String aka120;//出院主要诊断编码
	private String akc186;//出院次要疾病诊断
	private String akc188;//出院次要疾病诊断编码
	private String akc274;//出院次要疾病第三诊断
	private String akc275;//出院次要疾病第三诊断编码
	private String akc276;//出院次要疾病第四诊断
	private String akc277;//出院次要疾病第四诊断编码
	private Integer aae030;//入院日期
	private Integer aae031;//出院日期
	private Date baz020;//智能审核时间
	private String baz021;//智能审核结果
	private String baz022;//智能审核结果说明(违规说明，违规依据)
	private String baz031;//审核状态
	private String baz032;//转换类别
	private String aaa027;//统筹区
	private String bac003;//医护人员姓名
	private String aaz308;//结算信息ID
	private String aaz217;//就诊回传信息-就诊ID
	private String akc190;//住院号(门诊号)
	private String aka131;//医疗类别细分(含单病种)
	private String akc021;//申报结算类型
	private String aka132;//拟转换结算类型
	private String aka133;//二次申报结算类型
	private String aka134;//已转换结算类型
	private String aka008;//主手术
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_BAZ011", allocationSize = 1)
	@Column(name = "BAZ011", unique = true, nullable = false, length = 16)
	public String getBaz011() {
		return this.baz011;
	}

	public void setBaz011(String baz011) {
		this.baz011 = baz011;
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
		return getBaz011();
	}

	@Transient
	public String getObjectId() {
		return getBaz011();
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

	@Column(name = "AAZ217", length = 20)
	public String getAaz217() {
		return aaz217;
	}

	public void setAaz217(String aaz217) {
		this.aaz217 = aaz217;
	}

	@Column(name = "AKA132", length = 4)
	public String getAka132() {
		return aka132;
	}

	public void setAka132(String aka132) {
		this.aka132 = aka132;
	}

	@Column(name = "AKA133", length = 4)
	public String getAka133() {
		return aka133;
	}

	public void setAka133(String aka133) {
		this.aka133 = aka133;
	}

	@Column(name = "BAZ032", length = 1)
	public String getBaz032() {
		return baz032;
	}

	public void setBaz032(String baz032) {
		this.baz032 = baz032;
	}

	@Column(name = "AKA134", length = 4)
	public String getAka134() {
		return aka134;
	}

	public void setAka134(String aka134) {
		this.aka134 = aka134;
	}

	@Column(name = "AKA008", length = 1000)
	public String getAka008() {
		return aka008;
	}

	public void setAka008(String aka008) {
		this.aka008 = aka008;
	}
	
	
}
