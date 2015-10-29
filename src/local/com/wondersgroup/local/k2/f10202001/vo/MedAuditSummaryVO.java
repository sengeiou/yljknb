package com.wondersgroup.local.k2.f10202001.vo;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class MedAuditSummaryVO extends Kc63DTO implements ValueObject {

	private static final long serialVersionUID = 1L;
	
	private String start;
	
	private String end;
	
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
