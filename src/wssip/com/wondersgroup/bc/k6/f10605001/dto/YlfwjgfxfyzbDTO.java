package com.wondersgroup.bc.k6.f10605001.dto;

import com.wondersgroup.framework.core5.storeprocedure.annotation.SpIn;
import com.wondersgroup.framework.core5.storeprocedure.annotation.SpOut;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;

/**
 * 医疗服务机构住院费用情况分析,存储过程调用dto
 * 
 */
public class YlfwjgfxfyzbDTO implements SpSupportBean{
	@SpIn(order=1)
	private String aaa027;
	@SpIn(order=2)
	private String aae041;
	@SpIn(order=3)
	private String aae042;
	@SpIn(order=4)
	private String fxfee;
	@SpIn(order=5)
	private String aae140;
	@SpIn(order=6)
	private String aka101;
	@SpIn(order=7)
	private String aka130;
	@SpIn(order=8)
	private String akc021;
	@SpIn(order=9)
	private String aka122;
	@SpIn(order=10)
	private String userid;
	@SpIn(order=11)
	private String isdelete;
	@SpOut(order=12)
	private String analid;
	@SpOut(order=13)
	private String appcode;
	@SpOut(order=14)
	private String appmsg;
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getAae041() {
		return aae041;
	}
	public void setAae041(String aae041) {
		this.aae041 = aae041;
	}
	public String getAae042() {
		return aae042;
	}
	public void setAae042(String aae042) {
		this.aae042 = aae042;
	}
	public String getAae140() {
		return aae140;
	}
	public void setAae140(String aae140) {
		this.aae140 = aae140;
	}
	public String getAka101() {
		return aka101;
	}
	public void setAka101(String aka101) {
		this.aka101 = aka101;
	}
	public String getAka130() {
		return aka130;
	}
	public void setAka130(String aka130) {
		this.aka130 = aka130;
	}
	public String getAkc021() {
		return akc021;
	}
	public void setAkc021(String akc021) {
		this.akc021 = akc021;
	}
	public String getAka122() {
		return aka122;
	}
	public void setAka122(String aka122) {
		this.aka122 = aka122;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	public String getAnalid() {
		return analid;
	}
	public void setAnalid(String analid) {
		this.analid = analid;
	}
	public String getAppcode() {
		return appcode;
	}
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
	public String getAppmsg() {
		return appmsg;
	}
	public void setAppmsg(String appmsg) {
		this.appmsg = appmsg;
	}
	public void setFxfee(String fxfee) {
		this.fxfee = fxfee;
	}
	public String getFxfee() {
		return fxfee;
	}
	
}
