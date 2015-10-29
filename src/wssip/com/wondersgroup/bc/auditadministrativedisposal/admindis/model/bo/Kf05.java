package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseKf05;

/**
 * 医护人员
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KF05")
public class Kf05 extends BaseKf05 {
	@Transient
	private String akb021;
	
	@Transient
	private String apa701;
	
	public String getAkb021() {
		return akb021;
	}

	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}

	public String getApa701() {
		return apa701;
	}

	public void setApa701(String apa701) {
		this.apa701 = apa701;
	}

}
