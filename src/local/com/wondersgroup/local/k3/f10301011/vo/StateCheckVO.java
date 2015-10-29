package com.wondersgroup.local.k3.f10301011.vo;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class StateCheckVO extends Af53DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String ids;    // 复数ids
	private String aae189; //审核描述
	private String temp; //辨认状态

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getAae189() {
		return aae189;
	}

	public void setAae189(String aae189) {
		this.aae189 = aae189;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	
	
}

