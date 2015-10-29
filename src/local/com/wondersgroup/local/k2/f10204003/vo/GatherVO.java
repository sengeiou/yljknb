package com.wondersgroup.local.k2.f10204003.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class GatherVO implements ValueObject {

	private static final long serialVersionUID = 1L;

	private String yybh; // 医院编号
	private String yymc; // 医院名称
	private long zjkks; // 直接扣款数
	private long shcs; // 送核查数
	private long yshs; // 已审核数
	private long dsscls; // 待申诉处理数
	private long dssshs; // 待申诉审核数
	private long cqs; // 超期数

	private long wfys;
	private long dfycl;// 复议处理
	private long dfysh;// 待复议审核
	private long dfycls;//待复议处理数
	private long dfyshs;//待复议审核数

	public String getYybh() {
		return yybh;
	}

	public void setYybh(String yybh) {
		this.yybh = yybh;
	}

	public String getYymc() {
		return yymc;
	}

	public void setYymc(String yymc) {
		this.yymc = yymc;
	}

	public long getZjkks() {
		return zjkks;
	}

	public void setZjkks(long zjkks) {
		this.zjkks = zjkks;
	}

	public long getShcs() {
		return shcs;
	}

	public void setShcs(long shcs) {
		this.shcs = shcs;
	}

	public long getYshs() {
		return yshs;
	}

	public void setYshs(long yshs) {
		this.yshs = yshs;
	}

	public long getDsscls() {
		return dsscls;
	}

	public void setDsscls(long dsscls) {
		this.dsscls = dsscls;
	}

	public long getDssshs() {
		return dssshs;
	}

	public void setDssshs(long dssshs) {
		this.dssshs = dssshs;
	}

	public long getCqs() {
		return cqs;
	}

	public void setCqs(long cqs) {
		this.cqs = cqs;
	}

	public long getDfycl() {
		return dfycl;
	}

	public void setDfycl(long dfycl) {
		this.dfycl = dfycl;
	}

	public long getDfysh() {
		return dfysh;
	}

	public void setDfysh(long dfysh) {
		this.dfysh = dfysh;
	}

	public long getDfycls() {
		return dfycls;
	}

	public void setDfycls(long dfycls) {
		this.dfycls = dfycls;
	}

	public long getDfyshs() {
		return dfyshs;
	}

	public void setDfyshs(long dfyshs) {
		this.dfyshs = dfyshs;
	}

	public long getWfys() {
		return wfys;
	}

	public void setWfys(long wfys) {
		this.wfys = wfys;
	}
	
	
	
}
