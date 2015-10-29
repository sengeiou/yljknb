package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.BaseKc65;
import com.wondersgroup.framework.util.DateUtils;

public class Kc65DTO extends BaseKc65 {

	private Date akc194Start;//就诊开始时间
	private Date akc194End;//就诊结算时间
	private String zdstr;//所有诊断
	private String zysj;//住院时间
	
	public Date getAkc194Start() {
		return akc194Start;
	}
	public void setAkc194Start(Date akc194Start) {
		this.akc194Start = akc194Start;
	}
	public Date getAkc194End() {
		return akc194End;
	}
	public void setAkc194End(Date akc194End) {
		this.akc194End = akc194End;
	}
	public String getZdstr() {
		zdstr=getAkc050()+" "+getAkc185()+" "+getAkc186()+" "+getAkc274();
		return zdstr;
	}
	public void setZdstr(String zdstr) {
		this.zdstr = zdstr;
	}
	public String getZysj() {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMdd");
		Integer number=0;
		try {
			number=DateUtils.getDaysBetweenTwoDates(sdf.parse(getAae030()+""), sdf.parse(getAae031()+""));
		} catch (ParseException e) {
			return "";
		}
		if (number>0) {
			zysj=number+"天";
		}else {
			zysj="";
		}
		return zysj;
	}
	public void setZysj(String zysj) {
		this.zysj = zysj;
	}
	
	
}
