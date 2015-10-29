package com.wondersgroup.local.k2.f10204002.vo;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class F10204002VO extends Kc63DTO implements ValueObject {
private static final long serialVersionUID = 1L;
	
	private String ids;
	
	private String sjz;
	
	private String baz003;
	private String aaz217;
	private String ake007;
	private List<Kc72DTO> kc72List = new ArrayList<Kc72DTO>();

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getSjz() {
		return sjz;
	}

	public void setSjz(String sjz) {
		this.sjz = sjz;
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

	public String getAaz217() {
		return aaz217;
	}

	public void setAaz217(String aaz217) {
		this.aaz217 = aaz217;
	}

	public String getAke007() {
		return ake007;
	}

	public void setAke007(String ake007) {
		this.ake007 = ake007;
	}
	


}
