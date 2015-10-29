package com.wondersgroup.bc.k6.f10605001.dto;

import java.util.Date;

public class MediMoveAvgDTO {

	private String analId;//分析ID
    private String aaa027;//统筹区代码
    private String ape032;//统计周期
    private String aae041;//统计开始年月
    private String aae042;//统计终止年月
    private String analcode;//分析代码
    private Double cur_pred;//当期数
    private Double sam_pred;//同期数
    private Double pre_pred;//上期数
    private Double sam_rate;//同比增长率
    private Double pre_rate;//环比增长率
    private Double tre_mean;//移动平均
    private String sqlcond;//SQL条件
    private String userid;//用户ID
    private Date createdate;//生成日期
    private String memo;//备注
    private Double valueA;// 医疗费用
    private Double valueB;//  移动平均
    
    
	public String getAnalId() {
		return analId;
	}
	public void setAnalId(String analId) {
		this.analId = analId;
	}
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getApe032() {
		return ape032;
	}
	public void setApe032(String ape032) {
		this.ape032 = ape032;
	}
	public String getAae041() {
		return aae041;
	}
	public void setAae041(String aae041) {
		this.aae041 = aae041;
	}
	public String getAae042() {
		return aae042;
	}
	public void setAae042(String aae042) {
		this.aae042 = aae042;
	}
	public String getAnalcode() {
		return analcode;
	}
	public void setAnalcode(String analcode) {
		this.analcode = analcode;
	}
	public Double getCur_pred() {
		return cur_pred;
	}
	public void setCur_pred(Double cur_pred) {
		this.cur_pred = cur_pred;
	}
	public Double getSam_pred() {
		return sam_pred;
	}
	public void setSam_pred(Double sam_pred) {
		this.sam_pred = sam_pred;
	}
	public Double getPre_pred() {
		return pre_pred;
	}
	public void setPre_pred(Double pre_pred) {
		this.pre_pred = pre_pred;
	}
	public Double getSam_rate() {
		return sam_rate;
	}
	public void setSam_rate(Double sam_rate) {
		this.sam_rate = sam_rate;
	}
	public Double getPre_rate() {
		return pre_rate;
	}
	public void setPre_rate(Double pre_rate) {
		this.pre_rate = pre_rate;
	}
	public Double getTre_mean() {
		return tre_mean;
	}
	public void setTre_mean(Double tre_mean) {
		this.tre_mean = tre_mean;
	}
	public String getSqlcond() {
		return sqlcond;
	}
	public void setSqlcond(String sqlcond) {
		this.sqlcond = sqlcond;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Double getValueA() {
		return valueA;
	}
	public void setValueA(Double valueA) {
		this.valueA = valueA;
	}
	public Double getValueB() {
		return valueB;
	}
	public void setValueB(Double valueB) {
		this.valueB = valueB;
	}
}
