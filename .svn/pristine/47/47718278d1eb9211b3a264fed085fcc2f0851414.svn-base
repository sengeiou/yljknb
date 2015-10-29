package com.wondersgroup.local.k2.f10203002.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

@SuppressWarnings("serial")
public class Kc62VO extends Kc62DTO implements ValueObject{
	private String ids;//复数的baz001
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	private String aac001;//参保号
	private String aac003;//姓名
	
	private String aac004;//性别
	
	private String aac006;//出生年月(输出年龄)
	
	private String akb021;//医院名称
	
	private Date akc194;//就诊时间(结算时间)
	
	private Date akc196;//费用发生时间
	
	private Date baz020;//智能审核时间 
	
	private Date baz025;//医院反馈时间
	private String aac002;//医保号
	private String ake007;//(原)社保三大目录统一编码
	private String ake008;//明细名称 (原)社保三大目录名称 
	private String aaa133;//疑点说明  
	private Double akc253;//自费
	private Double akc254;//自付
	private String bac003;//医生姓名
	private Date baz024;//申述过期时间
	private String akc050;//诊断信息
	private String akc193;//诊断信息编码
	private String baz022;//操作人
	private Date baz023;//上次操作时间
	private String aka130;//就诊类型
	private String akc190;//住院号
	private String akc021;//人员类别
	public Date getBaz023() {
		return baz023;
	}

	public void setBaz023(Date baz023) {
		this.baz023 = baz023;
	}

	private String baz024zx;//中心端显示过期时间'--'
	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getIds() {
		return ids;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public String getAac003() {
		return aac003;
	}

	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}

	public String getAac004() {
		return aac004;
	}

	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}

	public String getAac006() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		if (StringTools.hasText(aac006)) {
			aac006=DateTools.getAge(sdf.parse(aac006))+"";
		}
		return aac006;
	}

	public void setAac006(String aac006) {
		this.aac006 = aac006;
	}

	public String getAkb021() {
		return akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	public Date getAkc194() {
		return akc194;
	}

	public void setAkc194(Date akc194) {
		this.akc194 = akc194;
	}

	public Date getAkc196() {
		return akc196;
	}

	public void setAkc196(Date akc196) {
		this.akc196 = akc196;
	}

	public Date getBaz020() {
		return baz020;
	}

	public void setBaz020(Date baz020) {
		this.baz020 = baz020;
	}

	public Date getBaz025() {
		return baz025;
	}

	public String getAac002() {
		return aac002;
	}

	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}

	public String getAke007() {
		return ake007;
	}

	public void setAke007(String ake007) {
		this.ake007 = ake007;
	}

	public String getAke008() {
		return ake008;
	}

	public void setAke008(String ake008) {
		this.ake008 = ake008;
	}

	public String getAaa133() {
		return aaa133;
	}

	public void setAaa133(String aaa133) {
		this.aaa133 = aaa133;
	}

	public Double getAkc253() {
		return akc253;
	}

	public void setAkc253(Double akc253) {
		this.akc253 = akc253;
	}

	public Double getAkc254() {
		return akc254;
	}

	public void setAkc254(Double akc254) {
		this.akc254 = akc254;
	}

	public String getBac003() {
		return bac003;
	}

	public void setBac003(String bac003) {
		this.bac003 = bac003;
	}

	public Date getBaz024() {
		return baz024;
	}

	public void setBaz024(Date baz024) {
		this.baz024 = baz024;
	}

	public String getAkc193() {
		return akc193;
	}

	public void setAkc193(String akc193) {
		this.akc193 = akc193;
	}

	public String getBaz022() {
		return baz022;
	}

	public void setBaz022(String baz022) {
		this.baz022 = baz022;
	}


	public void setBaz025(Date baz025) {
		this.baz025 = baz025;
	}

	public void setAkc050(String akc050) {
		this.akc050 = akc050;
	}

	public String getAkc050() {
		return akc050;
	}

	public void setBaz024zx(String baz024zx) {
		this.baz024zx = baz024zx;
	}

	public String getBaz024zx() {
		return baz024zx;
	}

	public String getAac001() {
		return aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	public String getAka130() {
		return aka130;
	}

	public void setAka130(String aka130) {
		this.aka130 = aka130;
	}

	public String getAkc190() {
		return akc190;
	}

	public void setAkc190(String akc190) {
		this.akc190 = akc190;
	}

	public String getAkc021() {
		return akc021;
	}

	public void setAkc021(String akc021) {
		this.akc021 = akc021;
	}

}
