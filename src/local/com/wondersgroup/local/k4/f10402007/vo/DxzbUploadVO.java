package com.wondersgroup.local.k4.f10402007.vo;

import java.io.File;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class DxzbUploadVO implements ValueObject{
	
	private static final long serialVersionUID = 1L;

	private String bsz005_succ; // 临时数据主键
	
	private String bsz005_fail; // 临时数据主键

	private File filedata; // 数据文件

	private String filedataFileName; // 数据文件名称

	private String filedataContentType; // 数据类型

	public String getBsz005_succ() {
		return bsz005_succ;
	}

	public void setBsz005_succ(String bsz005Succ) {
		bsz005_succ = bsz005Succ;
	}

	public String getBsz005_fail() {
		return bsz005_fail;
	}

	public void setBsz005_fail(String bsz005Fail) {
		bsz005_fail = bsz005Fail;
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

}
