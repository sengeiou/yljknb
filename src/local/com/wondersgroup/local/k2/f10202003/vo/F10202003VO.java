package com.wondersgroup.local.k2.f10202003.vo;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc21DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kc24DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

@SuppressWarnings("serial")
public class F10202003VO extends Kc63DTO implements ValueObject {
	private String baz003;
	private String aaz217;
	private List<Kc73DTO> kc73List = new ArrayList<Kc73DTO>();
	private List<Kc72DTO> kc72List = new ArrayList<Kc72DTO>();

	private Kc24DTO kc24;

	private Kc21DTO kc21;
	private String ids;// 复数的baz001

	private String sjz;

	private String ake007;//知识点
	
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

	public String getAke007() {
		return ake007;
	}

	public void setAke007(String ake007) {
		this.ake007 = ake007;
	}

}
