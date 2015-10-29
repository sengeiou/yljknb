package com.wondersgroup.local.k5.f10504001.vo;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class ComplaintHandlingVO extends Kc63DTO implements ValueObject{

	private static final long serialVersionUID = 1L;

	private List<Kc73DTO> kc73List = new ArrayList<Kc73DTO>();

	public List<Kc73DTO> getKc73List() {
		return kc73List;
	}

	public void setKc73List(List<Kc73DTO> kc73List) {
		this.kc73List = kc73List;
	}
}
