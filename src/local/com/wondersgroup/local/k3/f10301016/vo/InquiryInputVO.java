package com.wondersgroup.local.k3.f10301016.vo;



import java.util.Date;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class InquiryInputVO extends Af37DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String ape711Start;
	private String ape711End;
	private String organ;//经办机构
	private String operatorId;//操作人id	
	private String operatorName;//操作人姓名
	
	private String realpath;

	private String targetFileName;
	
	public Date ape712Operate;
	
	public Date ape712s;
	
	//private File filedata; // 数据文件

	private String filedataFileName; // 数据文件名称

	private String filedataContentType; // 数据类型
	
	public String getApe711Start() {
		return ape711Start;
	}
	public void setApe711Start(String ape711Start) {
		this.ape711Start = ape711Start;
	}
	public String getApe711End() {
		return ape711End;
	}
	public void setApe711End(String ape711End) {
		this.ape711End = ape711End;
	}
	public String getOrgan() {
		return organ;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public String getRealpath() {
		return realpath;
	}
	public String getTargetFileName() {
		return targetFileName;
	}
	/*public File getFiledata() {
		return filedata;
	}*/
	public String getFiledataFileName() {
		return filedataFileName;
	}
	public String getFiledataContentType() {
		return filedataContentType;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}
	public void setTargetFileName(String targetFileName) {
		this.targetFileName = targetFileName;
	}
	/*public void setFiledata(File filedata) {
		this.filedata = filedata;
	}*/
	public void setFiledataFileName(String filedataFileName) {
		this.filedataFileName = filedataFileName;
	}
	public void setFiledataContentType(String filedataContentType) {
		this.filedataContentType = filedataContentType;
	}
	
	public Date getApe712Operate() {
		return ape712Operate;
	}
	public void setApe712Operate(Date ape712Operate) {
		this.ape712Operate = ape712Operate;
	}
	public Date getApe712s() {
		return ape712s;
	}
	public void setApe712s(Date ape712s) {
		this.ape712s = ape712s;
	}
	
	
}
