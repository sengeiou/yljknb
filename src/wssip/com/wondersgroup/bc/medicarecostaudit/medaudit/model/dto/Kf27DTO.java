package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;

import java.util.Date;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Kf27;

public class Kf27DTO extends Kf27{

	private Date aae041Star;
	
	private Date aae042End;
	
	private String aae041s;
	
	private String aae042s;
	
	private String analid;
	
	private Integer rank;
	
	private String midrug;
	
	private String analcode;
	
	private String isdelete; //是否重新生成标志 （1-重新生成 0-不重新生成)
	
	private String userid;//当前用户id 
	
    private String label;//目录类别名称
	
	private float valueA;//统计费用
	
	private String id;
	
	private Double ratio;//占分项费用比
	
	private Double allratio;//总费用占比

	public String getAnalcode() {
		return analcode;
	}

	public void setAnalcode(String analcode) {
		this.analcode = analcode;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getAae041Star() {
		return aae041Star;
	}

	public void setAae041Star(Date aae041Star) {
		this.aae041Star = aae041Star;
	}

	public Date getAae042End() {
		return aae042End;
	}

	public void setAae042End(Date aae042End) {
		this.aae042End = aae042End;
	}

	public String getAae041s() {
		return aae041s;
	}

	public void setAae041s(String aae041s) {
		this.aae041s = aae041s;
	}

	public String getAae042s() {
		return aae042s;
	}

	public void setAae042s(String aae042s) {
		this.aae042s = aae042s;
	}

	public String getAnalid() {
		return analid;
	}

	public void setAnalid(String analid) {
		this.analid = analid;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getMidrug() {
		return midrug;
	}

	public void setMidrug(String midrug) {
		this.midrug = midrug;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setValueA(float valueA) {
		this.valueA = valueA;
	}

	public float getValueA() {
		return valueA;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	public Double getAllratio() {
		return allratio;
	}

	public void setAllratio(Double allratio) {
		this.allratio = allratio;
	}
	
	
}
