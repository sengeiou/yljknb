package com.wondersgroup.local.k5.f10506001.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class HosDetailVO implements ValueObject {

	private static final long serialVersionUID = 1L;

	private String akb020;// 医院名称
	private String akb021;// 医院编号
	private int dsss;// 待申诉
	private int cqs;// 超期数
	private String akb020orakb021;// 查询条件

	public int getDsss() {
		return dsss;
	}

	public void setDsss(int dsss) {
		this.dsss = dsss;
	}

	public String getAkb020() {
		return akb020;
	}

	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}

	public String getAkb021() {
		return akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	public int getCqs() {
		return cqs;
	}

	public void setCqs(int cqs) {
		this.cqs = cqs;
	}

	public String getAkb020orakb021() {
		return akb020orakb021;
	}

	public void setAkb020orakb021(String akb020orakb021) {
		this.akb020orakb021 = akb020orakb021;
	}
}
