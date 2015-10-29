package com.wondersgroup.local.k2.f10202004.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;

public class Kc62VO  extends Kc62DTO{
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	
	private String aac003;//姓名
	
	private String aac004;//性别
	
	private String aac006;//出生年月(输出年龄)
	
	private String akb021;//医院名称
	
	private Date akc194;//就诊时间(结算时间)
	
	private Date akc196;//费用发生时间
	
	private Date baz020;//智能审核时间 
	
	private Date baz025;//医院反馈时间
	
	private String akc050;//诊断名称（icd-10）

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

	public String getAac006() {
		Calendar birthday =Calendar.getInstance();
		Calendar jzsj =Calendar.getInstance();
		try {
			birthday.setTime(sdf.parse(aac006));
		} catch (ParseException e) {
			return "";
		}
		if (this.getAkc194()!=null) {
			jzsj.setTime(this.getAkc194());
		}
		int nl=0;
		if (jzsj.get(Calendar.MONTH)<birthday.get(Calendar.MONTH)) {
			nl=jzsj.get(Calendar.YEAR)-birthday.get(Calendar.YEAR)-1;
		}else {
			nl=jzsj.get(Calendar.YEAR)-birthday.get(Calendar.YEAR);
		}
		return nl+"";
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

	public String getAkc050() {
		return akc050;
	}

	public void setAkc050(String akc050) {
		this.akc050 = akc050;
	}
	
	
}
