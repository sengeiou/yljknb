package com.wondersgroup.local.k3.f10301004.vo;

import java.util.Date;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af30DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

//稽核调查记录事件
public class SurveyRecordVO extends Af30DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private Date ape722s;
	private Integer dcbz;

	public Date getApe722s() {
		return ape722s;
	}

	public void setApe722s(Date ape722s) {
		this.ape722s = ape722s;
	}

	public Integer getDcbz() {
		return dcbz;
	}

	public void setDcbz(Integer dcbz) {
		this.dcbz = dcbz;
	}

}
