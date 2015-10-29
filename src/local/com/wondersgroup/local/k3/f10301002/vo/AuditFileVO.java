package com.wondersgroup.local.k3.f10301002.vo;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class AuditFileVO extends Af32DTO implements ValueObject{
	
	private static final long serialVersionUID = 1L;
	
	private String aaz281str;
	
	private Long aaz318;

	public Long getAaz318() {
		return aaz318;
	}

	public void setAaz318(Long aaz318) {
		this.aaz318 = aaz318;
	}

	public String getAaz281str() {
		return aaz281str;
	}

	public void setAaz281str(String aaz281str) {
		this.aaz281str = aaz281str;
	}
	
	/*person*/
	private String aac001;
	private String aac003;
	private String aac002;
	/*doctor*/
	private String akb021;
	private String aab014;
	private String aaz263;
	/*organize*/
	private String akb022;
	private String aka101;
	private String akb020;

	public String getAac001() {
		return aac001;
	}

	public void setAac001(String aac001) {
		this.aac001 = aac001;
	}

	public String getAac003() {
		return aac003;
	}

	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}

	public String getAac002() {
		return aac002;
	}

	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}

	public String getAkb021() {
		return akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	public String getAab014() {
		return aab014;
	}

	public void setAab014(String aab014) {
		this.aab014 = aab014;
	}

	public String getAaz263() {
		return aaz263;
	}

	public void setAaz263(String aaz263) {
		this.aaz263 = aaz263;
	}

	public String getAkb022() {
		return akb022;
	}

	public void setAkb022(String akb022) {
		this.akb022 = akb022;
	}

	public String getAka101() {
		return aka101;
	}

	public void setAka101(String aka101) {
		this.aka101 = aka101;
	}

	public String getAkb020() {
		return akb020;
	}

	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}
}
