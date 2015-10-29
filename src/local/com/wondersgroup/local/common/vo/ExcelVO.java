package com.wondersgroup.local.common.vo;

import java.util.LinkedHashMap;
import java.util.List;

public class ExcelVO {
	
	private String filename;// 文件名
	private String filepath;// 文件路径
	private String title;// EXCEL标题
	@SuppressWarnings("rawtypes")
	private LinkedHashMap heads;// EXCEL头
	@SuppressWarnings("rawtypes")
	private List list;// EXCEL数据

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@SuppressWarnings("rawtypes")
	public LinkedHashMap getHeads() {
		return heads;
	}

	@SuppressWarnings("rawtypes")
	public void setHeads(LinkedHashMap heads) {
		this.heads = heads;
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}
}
