package com.wondersgroup.local.k2.f10202003.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class Kc62VO  extends Kc62DTO{
	
	private String aac001;//医保号
	private String aac003;//姓名
	
	private String aac004;//性别
	
	private String aac006;//出生年月(输出年龄)
	
	private String akb021;//医院名称
	
	private Date akc194;//就诊时间(结算时间)
	
	private Date akc196;//费用发生时间
	
	private Date baz020;//智能审核时间 
	
	private Date baz025;//医院反馈时间
	
	private String akc050;//icd-10

	private Date baz023Start;//上次操作开始时间
	private Date baz023End;//上次操作结束时间
	private Double akc254;//自付
	private String aka130;//就诊类型
	private String baz031str;//显示数据状态
	private String akc190;//住院号
	private String akc021;//人员类别
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

	public String getAac006()  throws ParseException{
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

	public void setBaz025(Date baz025) {
		this.baz025 = baz025;
	}

	public Date getBaz023Start() {
		return baz023Start;
	}

	public void setBaz023Start(Date baz023Start) {
		this.baz023Start = baz023Start;
	}

	public Date getBaz023End() {
		return baz023End;
	}

	public void setBaz023End(Date baz023End) {
		this.baz023End = baz023End;
	}

	public String getAkc050() {
		return akc050;
	}

	public void setAkc050(String akc050) {
		this.akc050 = akc050;
	}

	public String getAac001() {
		return aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	public Double getAkc254() {
		return akc254;
	}

	public void setAkc254(Double akc254) {
		this.akc254 = akc254;
	}

	public String getAka130() {
		return aka130;
	}

	public void setAka130(String aka130) {
		this.aka130 = aka130;
	}

	public String getBaz031str() {
		return baz031str;
	}

	public void setBaz031str(String baz031str) {
		this.baz031str = baz031str;
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
