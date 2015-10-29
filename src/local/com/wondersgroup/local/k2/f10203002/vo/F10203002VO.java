package com.wondersgroup.local.k2.f10203002.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class F10203002VO extends MedDocumentVO implements ValueObject {

	private static final long serialVersionUID = 1L;

	private String ids;// 复数的baz001

	private String sjz;
	
	private String ake007;

	public String getSjz() {
		return sjz;
	}

	public void setSjz(String sjz) {
		this.sjz = sjz;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getAke007() {
		return ake007;
	}

	public void setAke007(String ake007) {
		this.ake007 = ake007;
	}

}
