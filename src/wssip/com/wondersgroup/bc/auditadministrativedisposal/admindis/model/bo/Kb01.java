package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.BaseKb01;

/**
 * 定点医疗服务机构
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "KB01")
public class Kb01 extends BaseKb01 {
	
	@Transient
	private String apa701;

	public String getApa701() {
		return apa701;
	}

	public void setApa701(String apa701) {
		this.apa701 = apa701;
	}
	

}
