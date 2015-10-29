package com.wondersgroup.local.k2.f10204001.vo;

import java.io.File;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class PreCheckVO extends Kc81DTO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String ids;
	private String baz021;// 复议意见
	private String baz102;// 复议状态
	private String baz033;// 违规类型
	private String baz031;
	private String baz005;
	private double baz042;//扣除金额
	private Integer success;//正确执行
	private Integer error;//非正确执行
	private String operatorId;//操作人id	
	private String operatorName;//操作人姓名
	private String organ;//经办机构
	private String realpath;

	private String targetFileName;
	
	private File filedata; // 数据文件

	private String filedataFileName; // 数据文件名称

	private String filedataContentType; // 数据类型

	
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getBaz021() {
		return baz021;
	}
	public void setBaz021(String baz021) {
		this.baz021 = baz021;
	}
	public String getBaz102() {
		return baz102;
	}
	public void setBaz102(String baz102) {
		this.baz102 = baz102;
	}
	public String getBaz033() {
		return baz033;
	}
	public void setBaz033(String baz033) {
		this.baz033 = baz033;
	}
	public String getBaz031() {
		return baz031;
	}
	public void setBaz031(String baz031) {
		this.baz031 = baz031;
	}
	public String getRealpath() {
		return realpath;
	}
	public void setRealpath(String realpath) {
		this.realpath = realpath;
	}
	public String getTargetFileName() {
		return targetFileName;
	}
	public void setTargetFileName(String targetFileName) {
		this.targetFileName = targetFileName;
	}
	public File getFiledata() {
		return filedata;
	}
	public void setFiledata(File filedata) {
		this.filedata = filedata;
	}
	public String getFiledataFileName() {
		return filedataFileName;
	}
	public void setFiledataFileName(String filedataFileName) {
		this.filedataFileName = filedataFileName;
	}
	public String getFiledataContentType() {
		return filedataContentType;
	}
	public void setFiledataContentType(String filedataContentType) {
		this.filedataContentType = filedataContentType;
	}
	public String getBaz005() {
		return baz005;
	}
	public void setBaz005(String baz005) {
		this.baz005 = baz005;
	}
	public double getBaz042() {
		return baz042;
	}
	public void setBaz042(double baz042) {
		this.baz042 = baz042;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOrgan() {
		return organ;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	
}
