package com.wondersgroup.local.k2.f10201003.vo;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke01DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class MedInteractiveVO extends Kc62DTO implements ValueObject {

	private static final long serialVersionUID = -2028662023959869243L;

	private List<Ke01DTO> talkList = new ArrayList<Ke01DTO>();

	public List<Ke01DTO> getTalkList() {
		return talkList;
	}

	public void setTalkList(List<Ke01DTO> talkList) {
		this.talkList = talkList;
	}
}
