package com.wondersgroup.local.k4.f10402008.vo;

import com.wondersgroup.framework.core5.storeprocedure.annotation.SpIn;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;

public class Tjlj_CgVO implements SpSupportBean{
	public Tjlj_CgVO(String ybgzbm,String ybgztjljbm,String sjnr){
		this.ybgzbm=ybgzbm;
		this.ybgztjljbm=ybgztjljbm;
		this.sjnr=sjnr;
	}
	
	@SpIn(order=1)
	private String ybgzbm;
	@SpIn(order=2)
	private String ybgztjljbm;
	@SpIn(order=3)
	private String sjnr;
	public String getYbgzbm() {
		return ybgzbm;
	}
	public void setYbgzbm(String ybgzbm) {
		this.ybgzbm = ybgzbm;
	}
	public String getYbgztjljbm() {
		return ybgztjljbm;
	}
	public void setYbgztjljbm(String ybgztjljbm) {
		this.ybgztjljbm = ybgztjljbm;
	}
	public String getSjnr() {
		return sjnr;
	}
	public void setSjnr(String sjnr) {
		this.sjnr = sjnr;
	}

	
}
