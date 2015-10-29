package com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto;


/**
 * 
 * @ClassName: ZnshTjDTO 
 * @Description: 智能审核统计情况DTO
 * @author chenlin
 * @date 2014-7-21 下午03:06:06 
 *
 */
public class ZnshTjDTO {
	
	private Long dshcount;//待审核数
	private Long sscount;//申诉数
	private Long hfcount;//回复数
	
	private Long zjkkcount;//系统直接扣款数
	private Long dthshcount;//待退回审核数
	private Long rgdshcount;//人工待审核数
	private Long zgzs;//总规则数
	private Long qygzs;//启用规则数
	private Long mxwgs;//明细违规数
	private Long djwgs;//单据违规数
	public Long getZgzs() {
		return zgzs;
	}
	public void setZgzs(Long zgzs) {
		this.zgzs = zgzs;
	}
	public Long getQygzs() {
		return qygzs;
	}
	public void setQygzs(Long qygzs) {
		this.qygzs = qygzs;
	}
	public Long getMxwgs() {
		return mxwgs;
	}
	public void setMxwgs(Long mxwgs) {
		this.mxwgs = mxwgs;
	}
	public Long getDjwgs() {
		return djwgs;
	}
	public void setDjwgs(Long djwgs) {
		this.djwgs = djwgs;
	}
	public Long getDshcount() {
		return dshcount;
	}
	public void setDshcount(Long dshcount) {
		this.dshcount = dshcount;
	}
	public Long getSscount() {
		return sscount;
	}
	public void setSscount(Long sscount) {
		this.sscount = sscount;
	}
	public Long getHfcount() {
		return hfcount;
	}
	public void setHfcount(Long hfcount) {
		this.hfcount = hfcount;
	}
	public Long getZjkkcount() {
		return zjkkcount;
	}
	public void setZjkkcount(Long zjkkcount) {
		this.zjkkcount = zjkkcount;
	}
	public Long getDthshcount() {
		return dthshcount;
	}
	public void setDthshcount(Long dthshcount) {
		this.dthshcount = dthshcount;
	}
	public Long getRgdshcount() {
		return rgdshcount;
	}
	public void setRgdshcount(Long rgdshcount) {
		this.rgdshcount = rgdshcount;
	}
	
	
}
