package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "APPROVAL_CLASS_LIST")
public class ApprovalClassList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer aclid;
	private String aclname;
	
	@Id
	@Column(name = "ACLID",nullable=false, length = 9)
	public Integer getAclid() {
		return aclid;
	}
	public void setAclid(Integer aclid) {
		this.aclid = aclid;
	}
	
	@Column(name = "ACLNAME", length = 64)
	public String getAclname() {
		return aclname;
	}
	public void setAclname(String aclname) {
		this.aclname = aclname;
	}
	
	
	
	
}
