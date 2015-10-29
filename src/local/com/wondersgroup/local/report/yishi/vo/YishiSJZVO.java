package com.wondersgroup.local.report.yishi.vo;

import java.util.ArrayList;
import java.util.List;

public class YishiSJZVO {

	private int nian;//年
	
	private int yue;//月份
	
	private int ri;//日
	
	private String year;//年月
	
	private String flag;//排列标示
	
	private String month;//日期
	
	private int jzrc;//接诊人次
	
	private double fy;//费用
	
	private String txt;//文本
	
	private List<YishiSJZVO> child=new ArrayList<YishiSJZVO>();//子集


	public int getYue() {
		return yue;
	}

	public void setYue(int yue) {
		this.yue = yue;
	}

	public int getRi() {
		return ri;
	}

	public void setRi(int ri) {
		this.ri = ri;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public List<YishiSJZVO> getChild() {
		return child;
	}

	public void setChild(List<YishiSJZVO> child) {
		this.child = child;
	}

	public int getJzrc() {
		return jzrc;
	}

	public void setJzrc(int jzrc) {
		this.jzrc = jzrc;
	}

	public double getFy() {
		return fy;
	}

	public void setFy(double fy) {
		this.fy = fy;
	}

	public int getNian() {
		return nian;
	}

	public void setNian(int nian) {
		this.nian = nian;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
