package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf53 {

	private String aaa027;// 统筹区编码
	private Long aaz318;// 稽核案件ID
	private String abz001;// 稽核案件编号
	private String abb006;// 案件来源
	private String apf094;// 案情描述
	private String aae426;// 案件状态
	private String aae189;// 立案批示意见
	private String aae011;// 立案经办人
	private Date aae036;// 经办时间
	private String aae012;// 立案确认人
	private Integer aae034;// 立案确认日期
	private String acc789;// 办案人
	private Integer apa047;// 督办期限(起始日期)
	private Integer abb025;// 结案日期
	private Long aaz281;// 疑点问题受理记录ID
	private String aae425;// 告知终结标志
//	private Date ape711s; //立案登记日期
	private Integer ape047;// 立案登记日期
	private Integer apa048;// 督办期限(终止日期)
	private String aae187;// 二次处理意见
	private String apa168;   //移交标志
	private String aae608;   //二次处理标志
	private String ape718;// 调查人
	private String aae427; //撤销审批返回标志
	

	@Id
	@SequenceGenerator(name="SEQUENCE",allocationSize=1,initialValue=1,sequenceName="SEQ_AAZ318")
	@GeneratedValue(generator="SEQUENCE",strategy=GenerationType.SEQUENCE)
	@Column(name = "AAZ318", length = 16)
	public Long getAaz318() {
		return aaz318;
	}

	public void setAaz318(Long aaz318) {
		this.aaz318 = aaz318;
	}

	@Column(name = "AAA027", length = 6)
	public String getAaa027() {
		return aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
    
	@Column(name = "ABZ001", length = 20)
	public String getAbz001() {
		return abz001;
	}

	public void setAbz001(String abz001) {
		this.abz001 = abz001;
	}

	@Column(name = "ABB006", length = 2)
	public String getAbb006() {
		return abb006;
	}

	public void setAbb006(String abb006) {
		this.abb006 = abb006;
	}

	@Column(name = "APF094", length = 4000)
	public String getApf094() {
		return apf094;
	}

	public void setApf094(String apf094) {
		this.apf094 = apf094;
	}

	@Column(name = "AAE426", length = 3)
	public String getAae426() {
		return aae426;
	}

	public void setAae426(String aae426) {
		this.aae426 = aae426;
	}

	@Column(name = "AAE189", length = 200)
	public String getAae189() {
		return aae189;
	}

	public void setAae189(String aae189) {
		this.aae189 = aae189;
	}	

	@Column(name = "AAE187", length = 200)
	public String getAae187() {
		return aae187;
	}

	public void setAae187(String aae187) {
		this.aae187 = aae187;
	}

	@Column(name = "AAE011", length = 20)
	public String getAae011() {
		return aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}

	@Column(name = "AAE036", length = 10)
	public Date getAae036() {
		return aae036;
	}

	public void setAae036(Date aae036) {
		this.aae036 = aae036;
	}

	@Column(name = "AAE012", length = 20)
	public String getAae012() {
		return aae012;
	}

	public void setAae012(String aae012) {
		this.aae012 = aae012;
	}

	@Column(name = "AAE034", length = 8)
	public Integer getAae034() {
		return aae034;
	}

	public void setAae034(Integer aae034) {
		this.aae034 = aae034;
	}

	@Column(name = "ACC789", length = 50)
	public String getAcc789() {
		return acc789;
	}

	public void setAcc789(String acc789) {
		this.acc789 = acc789;
	}

	@Column(name = "APE718", length = 50)
	public String getApe718() {
		return ape718;
	}

	public void setApe718(String ape718) {
		this.ape718 = ape718;
	}

	@Column(name = "APA047", length = 8)
	public Integer getApa047() {
		return apa047;
	}

	public void setApa047(Integer apa047) {
		this.apa047 = apa047;
	}
	@Column(name = "APA048", length = 8)
	public Integer getApa048() {
		return apa048;
	}

	public void setApa048(Integer apa048) {
		this.apa048 = apa048;
	}

	@Column(name = "ABB025", length = 8)
	public Integer getAbb025() {
		return abb025;
	}

	public void setAbb025(Integer abb025) {
		this.abb025 = abb025;
	}
	@Column(name = "APE047", length = 8)
	public Integer getApe047() {
		return ape047;
	}

	public void setApe047(Integer ape047) {
		this.ape047 = ape047;
	}
	@Column(name = "AAZ281", length = 16)
	public Long getAaz281() {
		return aaz281;
	}

	public void setAaz281(Long aaz281) {
		this.aaz281 = aaz281;
	}

	@Column(name = "AAE425", length = 1)
	public String getAae425() {
		return aae425;
	}

	public void setAae425(String aae425) {
		this.aae425 = aae425;
	}
	
//	@Column(name = "APE711S")
//	public Date getApe711s() {
//		return ape711s;
//	}
//
//	public void setApe711s(Date ape711s) {
//		this.ape711s = ape711s;
//	}
	
	@Transient
	public Long getEntityId() {

		return getAaz281();
	}

	@Transient
	public Long getObjectId() {

		return getAaz281();
	}
	@Column(name = "APA168", length = 1)
	public String getApa168() {
		return apa168;
	}

	public void setApa168(String apa168) {
		this.apa168 = apa168;
	}

	@Column(name = "AAE608", length = 1)
	public String getAae608() {
		return aae608;
	}

	public void setAae608(String aae608) {
		this.aae608 = aae608;
	}

	@Column(name = "AAE427", length = 3)
	public String getAae427() {
		return aae427;
	}

	public void setAae427(String aae427) {
		this.aae427 = aae427;
	}
	
	

}
