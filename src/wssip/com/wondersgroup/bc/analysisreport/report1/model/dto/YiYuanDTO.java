package com.wondersgroup.bc.analysisreport.report1.model.dto;

import java.util.Date;




public class YiYuanDTO {
	
	/**
	 * 疑点信息查询
	 */
	private String tjsj1;//统计开始时间
	private String tjsj2;//统计结束时间
	private Date fyfssj;//费用发生时间
	private String cbrbm;//参保人编码
	private String xm;//姓名
	private String sfz;//身份证
	private String xb;//性别
	private String jzyy;//就诊医院
	private String jzlx;//就诊类型
	private String aaz107;//医院编号
	private String akb020;
	private String wgyy;//违规原因
	private String wglx;//违规类型
	private String fyje;//费用金额
	private String age;//年龄
	
	
	/*
	 * 历史违规
	 * */

	private String jzbh;//就诊编号
	private String ybh;//医保号
	private String clyj;//处理意见
	private String cfje;//处罚金额
	private String cfjg;//处罚结果
	private String jbr;//经办人
	private String jbrq;//经办时间
	
	/**
	 * 查询医院的信息
	 * */
	private String yymc="null";//医院
	private String yydj="null";//医院等级
	private String yylx="null";//医院类型
	private String yyxz="null";//医院性质
	private Integer kssl;//科室数量
	private Integer yssl;//医生数量
	private String yydz="null";//医院地址
	private String ssqy="null";//所属区域
	private String lxrmc="null";//联系人
	private String lxdh="null";//电话
	
	/**
	 * 报表显示数据
	 * */
	private String rn;
	private int jzrs;
	private double fyfse;
	private double ydzce;
	private String ksmc;
	
	
	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn.substring(5,7);
	}
	public int getJzrs() {
		return jzrs;
	}
	public void setJzrs(int jzrs) {
		this.jzrs = jzrs;
	}
	public double getFyfse() {
		return fyfse;
	}
	public void setFyfse(double fyfse) {
		this.fyfse = fyfse;
	}
	public double getYdzce() {
		return ydzce;
	}
	public void setYdzce(double ydzce) {
		this.ydzce = ydzce;
	}
	public String getYymc() {
		return yymc;
	}
	public void setYymc(String yymc) {
		this.yymc = yymc;
	}
	public String getYydj() {
		return yydj;
	}
	public void setYydj(String yydj) {
		this.yydj = yydj;
	}
	public String getYylx() {
		return yylx;
	}
	public void setYylx(String yylx) {
		this.yylx = yylx;
	}
	public Integer getKssl() {
		return kssl;
	}
	public void setKssl(Integer kssl) {
		this.kssl = kssl;
	}
	public Integer getYssl() {
		return yssl;
	}
	public void setYssl(Integer yssl) {
		this.yssl = yssl;
	}
	public String getYydz() {
		return yydz;
	}
	public void setYydz(String yydz) {
		this.yydz = yydz;
	}
	public String getSsqy() {
		return ssqy;
	}
	public void setSsqy(String ssqy) {
		this.ssqy = ssqy;
	}
	public String getLxrmc() {
		return lxrmc;
	}
	public void setLxrmc(String lxrmc) {
		this.lxrmc = lxrmc;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getJzbh() {
		return jzbh;
	}
	public void setJzbh(String jzbh) {
		this.jzbh = jzbh;
	}
	public String getYbh() {
		return ybh;
	}
	public void setYbh(String ybh) {
		this.ybh = ybh;
	}
	public String getClyj() {
		return clyj;
	}
	public void setClyj(String clyj) {
		this.clyj = clyj;
	}
	public String getCfje() {
		return cfje;
	}
	public void setCfje(String cfje) {
		this.cfje = cfje;
	}
	public Date getFyfssj() {
		return fyfssj;
	}
	public void setFyfssj(Date fyfssj) {
		this.fyfssj = fyfssj;
	}
	public String getCbrbm() {
		return cbrbm;
	}
	public void setCbrbm(String cbrbm) {
		this.cbrbm = cbrbm;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getJzyy() {
		return jzyy;
	}
	public void setJzyy(String jzyy) {
		this.jzyy = jzyy;
	}
	public String getJzlx() {
		return jzlx;
	}
	public void setJzlx(String jzlx) {
		this.jzlx = jzlx;
	}
	public String getAaz107() {
		return aaz107;
	}
	public void setAaz107(String aaz107) {
		this.aaz107 = aaz107;
	}
	public String getWgyy() {
		return wgyy;
	}
	public void setWgyy(String wgyy) {
		this.wgyy = wgyy;
	}
	public String getWglx() {
		return wglx;
	}
	public void setWglx(String wglx) {
		this.wglx = wglx;
	}
	public String getFyje() {
		return fyje;
	}
	public void setFyje(String fyje) {
		this.fyje = fyje;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
	public void setTjsj1(String tjsj1) {
		this.tjsj1 = tjsj1;
	}
	public String getTjsj1() {
		return tjsj1;
	}
	public void setTjsj2(String tjsj2) {
		this.tjsj2 = tjsj2;
	}
	public String getTjsj2() {
		return tjsj2;
	}
	public void setJbr(String jbr) {
		this.jbr = jbr;
	}
	public String getJbr() {
		return jbr;
	}
	public void setJbrq(String jbrq) {
		this.jbrq = jbrq;
	}
	public String getJbrq() {
		return jbrq;
	}
	/**
	 * @param akb020 the akb020 to set
	 */
	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}
	/**
	 * @return the akb020
	 */
	public String getAkb020() {
		return akb020;
	}
	/**
	 * @param cfjg the cfjg to set
	 */
	public void setCfjg(String cfjg) {
		this.cfjg = cfjg;
	}
	/**
	 * @return the cfjg
	 */
	public String getCfjg() {
		return cfjg;
	}
	/**
	 * @param yyxz the yyxz to set
	 */
	public void setYyxz(String yyxz) {
		this.yyxz = yyxz;
	}
	/**
	 * @return the yyxz
	 */
	public String getYyxz() {
		return yyxz;
	}
	/**
	 * @param ksmc the ksmc to set
	 */
	public void setKsmc(String ksmc) {
		this.ksmc = ksmc;
	}
	/**
	 * @return the ksmc
	 */
	public String getKsmc() {
		return ksmc;
	}


}
