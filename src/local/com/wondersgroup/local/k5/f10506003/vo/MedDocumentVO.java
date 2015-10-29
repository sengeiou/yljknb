package com.wondersgroup.local.k5.f10506003.vo;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc24DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class MedDocumentVO extends Kc63DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String baz003;
	private String aaz217;
	
	private List<Kc73DTO> kc73List = new ArrayList<Kc73DTO>();
	private List<Kc72DTO> kc72List = new ArrayList<Kc72DTO>();
	
	private Kc24DTO kc24;

	private Kc21DTO kc21;
	
	public Kc24DTO getKc24() {
		return kc24;
	}

	public void setKc24(Kc24DTO kc24) {
		this.kc24 = kc24;
	}

	public Kc21DTO getKc21() {
		return kc21;
	}

	public void setKc21(Kc21DTO kc21) {
		this.kc21 = kc21;
	}
	
	public List<Kc73DTO> getKc73List() {
		return kc73List;
	}

	public void setKc73List(List<Kc73DTO> kc73List) {
		this.kc73List = kc73List;
	}

	public List<Kc72DTO> getKc72List() {
		return kc72List;
	}

	public void setKc72List(List<Kc72DTO> kc72List) {
		this.kc72List = kc72List;
	}

	public String getBaz003() {
		return baz003;
	}

	public void setBaz003(String baz003) {
		this.baz003 = baz003;
	}

	/**
	 * @param aaz217 the aaz217 to set
	 */
	public void setAaz217(String aaz217) {
		this.aaz217 = aaz217;
	}

	/**
	 * @return the aaz217
	 */
	public String getAaz217() {
		return aaz217;
	}

}
