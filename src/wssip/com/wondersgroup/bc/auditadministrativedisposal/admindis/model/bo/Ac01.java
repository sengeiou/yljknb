package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseAc01;


/**
 * 参保人员
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "AC01")
public class Ac01 extends BaseAc01 {
	
	@Transient
	private String apa701;

	public String getApa701() {
		return apa701;
	}

	public void setApa701(String apa701) {
		this.apa701 = apa701;
	}
	
	
}
