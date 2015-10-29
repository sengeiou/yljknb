package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;

import java.io.Serializable;

import javax.persistence.Column;

public class BaseKa45Id implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long aaz319;
	private Long aaa155;

	@Column(name = "AAZ319", nullable = false, precision = 16, scale = 0)
	public Long getAaz319() {
		return this.aaz319;
	}

	public void setAaz319(Long aaz319) {
		this.aaz319 = aaz319;
	}

	@Column(name = "AAA155", nullable = false, precision = 2, scale = 0)
	public Long getAaa155() {
		return this.aaa155;
	}

	public void setAaa155(Long aaa155) {
		this.aaa155 = aaa155;
	}
}
