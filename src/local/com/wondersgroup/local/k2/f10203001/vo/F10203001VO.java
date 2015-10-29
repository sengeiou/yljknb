package com.wondersgroup.local.k2.f10203001.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203001.vo.MedDocumentVO;

public class F10203001VO extends MedDocumentVO  implements ValueObject {
	
	private static final long serialVersionUID = 1L;

	private String ids;//复数的baz001
	
	private String sjz;

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

}
