package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;

public class QueryApprovalDto extends ApprovalInfoList{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String aclname;
	private String Aaz077;

	public String getAclname() {
		return aclname;
	}

	public void setAclname(String aclname) {
		this.aclname = aclname;
	}

	public String getAaz077() {
		return Aaz077;
	}

	public void setAaz077(String aaz077) {
		Aaz077 = aaz077;
	}
	
	

}
