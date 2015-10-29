package com.wondersgroup.local.k5.f10507002.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class HosDetailVO implements ValueObject{

	private static final long serialVersionUID = 1L;
	
	private String akb020;//医院名称
	private String akb021;//医院编号
	private Integer dsssh;//待申诉审核
	private Integer drgcs;//带人工初审
	private Integer cqs;//超期数
	private String query;//查询条件
	private Integer dfysq;//待复议申请
	public String getAkb020() {
		return akb020;
	}
	public void setAkb020(String akb020) {
		this.akb020 = akb020;
	}
	public String getAkb021() {
		return akb021;
	}
	public void setAkb021(String akb021) {
		this.akb021 = akb021;
	}
	public Integer getDsssh() {
		return dsssh;
	}
	public void setDsssh(Integer dsssh) {
		this.dsssh = dsssh;
	}
	public Integer getDrgcs() {
		return drgcs;
	}
	public void setDrgcs(Integer drgcs) {
		this.drgcs = drgcs;
	}
	public Integer getCqs() {
		return cqs;
	}
	public void setCqs(Integer cqs) {
		this.cqs = cqs;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public Integer getDfysq() {
		return dfysq;
	}
	public void setDfysq(Integer dfysq) {
		this.dfysq = dfysq;
	}
	
	
	
}
