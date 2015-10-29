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
public abstract class BaseAf32 {
	
	private Long aaz281;//疑点问题受理及年度稽核计划筛选事件ID
	private String aaa027;//统筹区编码
	private String apa703;//受理方式
	private Integer ape711;//问题受理日期
	private String apa704;//举报人类型
	private String ape028;//举报人单位
	private String ape713;//举报人姓名
	private String aae006;//举报人地址
	private String aae007;//邮政编码
	private String aae005;//联系电话
	private String aae159;//联系电子邮箱
	private String ape712;//举报投诉内容
	private String apa165;//问题处理类型
	private String apa166;//问题关闭标志
	private String ape133;//问题关闭人
	private Integer ape027;//问题关闭日期
	private String aae011;//经办人
	private Date aae036;//经办时间
	private String apa705;//举报投诉方式
	private String aae013;//备注
	private String aae200;//简单处理的处理意见
	
	private String aac004;//性别
	private String ape714;  //被举报对象名称
	private String aae306; //被举报对象地址
	private String aae305; //被举报对象联系电话
	private String aac302;  //被举报对象编号（身份证号或机构编号）
	private String ape313;  //主要证据或线索
	private String aaz171; //举报问题编号
	private String wtsc;   //问题删除


	@Id
	@SequenceGenerator(name="SEQUENCE",allocationSize=1,initialValue=1,sequenceName="SEQ_AAZ281")
	@GeneratedValue(generator="SEQUENCE",strategy=GenerationType.SEQUENCE)
	@Column(name = "AAZ281", length = 16)
	public Long getAaz281() {
		return this.aaz281;
	}

	public void setAaz281(Long aaz281) {
		this.aaz281 = aaz281;
	}
	
	@Column(name = "AAE013", length = 150)
	public String getAae013() {
		return aae013;
	}

	public void setAae013(String aae013) {
		this.aae013 = aae013;
	}
	
	@Column(name = "AAE036", length = 10)
	public Date getAae036() {
		return aae036;
	}

	public void setAae036(Date aae036) {
		this.aae036 = aae036;
	}

	@Column(name = "APE028", length = 50)
	public String getApe028() {
		return ape028;
	}
	
	public void setApe028(String ape028) {
		this.ape028 = ape028;
	}
	
	@Column(name = "AAE011", length = 20)
	public String getAae011() {
		return aae011;
	}

	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}
	
	@Column(name = "APE027", length = 8)
	public Integer getApe027() {
		return ape027;
	}

	public void setApe027(Integer ape027) {
		this.ape027 = ape027;
	}
	
	@Column(name = "APA165", length = 3)
	public String getApa165() {
		return apa165;
	}

	public void setApa165(String apa165) {
		this.apa165 = apa165;
	}
	
	@Column(name = "APA166", length = 1)
	public String getApa166() {
		return apa166;
	}

	public void setApa166(String apa166) {
		this.apa166 = apa166;
	}
	
	@Column(name = "APA705", length = 3)
	public String getApa705() {
		return apa705;
	}

	public void setApa705(String apa705) {
		this.apa705 = apa705;
	}
	@Column(name = "APA703", length = 1)
	public String getApa703() {
		return this.apa703;
	}

	public void setApa703(String apa703) {
		this.apa703 = apa703;
	}

	@Column(name = "APA704", length = 2)
	public String getApa704() {
		return this.apa704;
	}

	public void setApa704(String apa704) {
		this.apa704 = apa704;
	}

	@Column(name = "APE711", precision = 8, scale = 0)
	public Integer getApe711() {
		return ape711;
	}

	public void setApe711(Integer ape711) {
		this.ape711 = ape711;
	}
	@Column(name = "APE712", length = 4000)
	public String getApe712() {
		return this.ape712;
	}

	public void setApe712(String ape712) {
		this.ape712 = ape712;
	}

	@Column(name = "APE713", length = 50)
	public String getApe713() {
		return this.ape713;
	}

	public void setApe713(String ape713) {
		this.ape713 = ape713;
	}

	@Column(name = "AAE005", length = 40)
	public String getAae005() {
		return this.aae005;
	}

	public void setAae005(String aae005) {
		this.aae005 = aae005;
	}

	@Column(name = "AAE006", length = 150)
	public String getAae006() {
		return this.aae006;
	}

	public void setAae006(String aae006) {
		this.aae006 = aae006;
	}

	@Column(name = "AAE007", length = 6)
	public String getAae007() {
		return this.aae007;
	}

	public void setAae007(String aae007) {
		this.aae007 = aae007;
	}

	@Column(name = "AAE159", length = 50)
	public String getAae159() {
		return this.aae159;
	}

	public void setAae159(String aae159) {
		this.aae159 = aae159;
	}
	
	@Column(name = "APE133", length = 50)
	public String getApe133() {
		return ape133;
	}

	public void setApe133(String ape133) {
		this.ape133 = ape133;
	}

	@Column(name = "AAA027", length = 6)
	public String getAaa027() {
		return this.aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}

	@Transient
	public Long getEntityId() {

		return getAaz281();
	}

	@Transient
	public Long getObjectId() {

		return getAaz281();
	}

	@Column(name = "AAE200", length = 200)
	public String getAae200() {
		return aae200;
	}

	public void setAae200(String aae200) {
		this.aae200 = aae200;
	}
	
	@Column(name = "AAC004", length = 1)
	public String getAac004() {
		return aac004;
	}

	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}

	@Column(name = "APE714", length = 50)
	public String getApe714() {
		return ape714;
	}

	public void setApe714(String ape714) {
		this.ape714 = ape714;
	}

	@Column(name = "AAE306", length = 150)
	public String getAae306() {
		return aae306;
	}

	public void setAae306(String aae306) {
		this.aae306 = aae306;
	}

	@Column(name = "AAE305", length = 40)
	public String getAae305() {
		return aae305;
	}

	public void setAae305(String aae305) {
		this.aae305 = aae305;
	}

	@Column(name = "AAC302", length = 18)
	public String getAac302() {
		return aac302;
	}

	public void setAac302(String aac302) {
		this.aac302 = aac302;
	}

	@Column(name = "APE313", length = 200)
	public String getApe313() {
		return ape313;
	}

	public void setApe313(String ape313) {
		this.ape313 = ape313;
	}
	
	@Column(name = "AAZ171", length = 20)
	public String getAaz171() {
		return aaz171;
	}

	public void setAaz171(String aaz171) {
		this.aaz171 = aaz171;
	}

	@Column(name = "WTSC", length = 20)
	public String getWtsc() {
		return wtsc;
	}

	public void setWtsc(String wtsc) {
		this.wtsc = wtsc;
	}
	

}
