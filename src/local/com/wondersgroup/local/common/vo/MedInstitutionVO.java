package com.wondersgroup.local.common.vo;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.framework.core5.model.vo.ValueObject;

public class MedInstitutionVO extends Kb01DTO implements ValueObject{

	private static final long serialVersionUID = 8136028614892171054L;

	private String baz031;//审核状态
	
	private String baz101;//申诉状态
	
	private String baz102;//复议状态
	
	private String zsdmc;//知识点名称 模糊查询
	
	private String zsdbm;//知识点编码
	
	private String ybgzflbm;//医保规则分类编码
	
	private String ybgzflmc;//医保规则分类名称
	
	private String ake008;//知识点名称

	public String getBaz031() {
		return baz031;
	}

	public void setBaz031(String baz031) {
		this.baz031 = baz031;
	}

	public String getBaz101() {
		return baz101;
	}

	public void setBaz101(String baz101) {
		this.baz101 = baz101;
	}

	public String getBaz102() {
		return baz102;
	}

	public void setBaz102(String baz102) {
		this.baz102 = baz102;
	}

	public String getZsdmc() {
		return zsdmc;
	}

	public void setZsdmc(String zsdmc) {
		this.zsdmc = zsdmc;
	}

	public String getZsdbm() {
		return zsdbm;
	}

	public void setZsdbm(String zsdbm) {
		this.zsdbm = zsdbm;
	}

	public String getYbgzflbm() {
		return ybgzflbm;
	}

	public void setYbgzflbm(String ybgzflbm) {
		this.ybgzflbm = ybgzflbm;
	}

	public String getYbgzflmc() {
		return ybgzflmc;
	}

	public void setYbgzflmc(String ybgzflmc) {
		this.ybgzflmc = ybgzflmc;
	}

	public String getAke008() {
		return ake008;
	}

	public void setAke008(String ake008) {
		this.ake008 = ake008;
	}
}
