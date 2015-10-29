package com.wondersgroup.local.common.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class ExcelServiceInfoVO implements ValueObject{
	
	private static final long serialVersionUID = 1L;
	
	private String classname;

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}