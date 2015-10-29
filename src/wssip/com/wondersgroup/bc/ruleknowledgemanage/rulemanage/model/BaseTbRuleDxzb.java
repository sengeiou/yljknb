package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;


import java.util.Date;
import javax.persistence.Column;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import javax.persistence.Transient;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TbRuleDxzb.
 */
@MappedSuperclass
public abstract class BaseTbRuleDxzb  {


     private String id;
     private String dxid;
     private String dxlx;
     private String dxmc;
     private String gzdm;
     private String zbdm;
     private String zbz;
     private String yl1;
     private String yl2;
     private String yl3;
     private String gzly;
     private String sm;
     private String cjrid;
     private String cjrmc;
     private Date cjsj;
     private String zt;
     private String type;
     private String jktz;
     private String dxmc1;
     private String jklx;
     private String shjg;
     private String bz;
     private String qrzt;
     private String cs;
     private String zzqrbz;

   
    @Id 
    @Column(name="ID", unique=true, nullable=false, precision=32, scale=0)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="DXID", precision=16, scale=0)
    public String getDxid() {
        return this.dxid;
    }
    
    public void setDxid(String dxid) {
        this.dxid = dxid;
    }
    
    @Column(name="DXLX", length=32)
    public String getDxlx() {
        return this.dxlx;
    }
    
    public void setDxlx(String dxlx) {
        this.dxlx = dxlx;
    }
    
    @Column(name="DXMC", length=100)
    public String getDxmc() {
        return this.dxmc;
    }
    
    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
    }
    
    @Column(name="GZDM", length=32)
    public String getGzdm() {
        return this.gzdm;
    }
    
    public void setGzdm(String gzdm) {
        this.gzdm = gzdm;
    }
    
    @Column(name="ZBDM", length=32)
    public String getZbdm() {
        return this.zbdm;
    }
    
    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }
    
    @Column(name="ZBZ", length=4000)
    public String getZbz() {
        return this.zbz;
    }
    
    public void setZbz(String zbz) {
        this.zbz = zbz;
    }
    
    @Column(name="YL1", length=1024)
    public String getYl1() {
        return this.yl1;
    }
    
    public void setYl1(String yl1) {
        this.yl1 = yl1;
    }
    
    @Column(name="YL2", length=1024)
    public String getYl2() {
        return this.yl2;
    }
    
    public void setYl2(String yl2) {
        this.yl2 = yl2;
    }
    
    @Column(name="YL3", length=1024)
    public String getYl3() {
        return this.yl3;
    }
    
    public void setYl3(String yl3) {
        this.yl3 = yl3;
    }
    
    @Column(name="GZLY", length=1024)
    public String getGzly() {
        return this.gzly;
    }
    
    public void setGzly(String gzly) {
        this.gzly = gzly;
    }
    
    @Column(name="SM", length=4000)
    public String getSm() {
        return this.sm;
    }
    
    public void setSm(String sm) {
        this.sm = sm;
    }
    
    @Column(name="CJRID", length=32)
    public String getCjrid() {
        return this.cjrid;
    }
    
    public void setCjrid(String cjrid) {
        this.cjrid = cjrid;
    }
    
    @Column(name="CJRMC", length=32)
    public String getCjrmc() {
        return this.cjrmc;
    }
    
    public void setCjrmc(String cjrmc) {
        this.cjrmc = cjrmc;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CJSJ", length=7)
    public Date getCjsj() {
        return this.cjsj;
    }
    
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
    
    @Column(name="ZT", length=2)
    public String getZt() {
        return this.zt;
    }
    
    public void setZt(String zt) {
        this.zt = zt;
    }
    
    @Column(name="TYPE", length=2)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="JKTZ", length=2)
    public String getJktz() {
        return this.jktz;
    }
    
    public void setJktz(String jktz) {
        this.jktz = jktz;
    }
    
    @Column(name="DXMC1", length=32)
    public String getDxmc1() {
        return this.dxmc1;
    }
    
    public void setDxmc1(String dxmc1) {
        this.dxmc1 = dxmc1;
    }
    
    @Column(name="JKLX", length=2)
    public String getJklx() {
        return this.jklx;
    }
    
    public void setJklx(String jklx) {
        this.jklx = jklx;
    }
    
    @Column(name="SHJG", length=2)
    public String getShjg() {
        return this.shjg;
    }
    
    public void setShjg(String shjg) {
        this.shjg = shjg;
    }
    
    @Column(name="BZ", length=1024)
    public String getBz() {
        return this.bz;
    }
    
    public void setBz(String bz) {
        this.bz = bz;
    }
    
    @Column(name="QRZT", length=2)
    public String getQrzt() {
        return this.qrzt;
    }
    
    public void setQrzt(String qrzt) {
        this.qrzt = qrzt;
    }
    
    @Column(name="CS", length=500)
    public String getCs() {
        return this.cs;
    }
    
    public void setCs(String cs) {
        this.cs = cs;
    }
    
    @Column(name="ZZQRBZ", length=2)
    public String getZzqrbz() {
        return this.zzqrbz;
    }
    
    public void setZzqrbz(String zzqrbz) {
        this.zzqrbz = zzqrbz;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
    @Transient
	public String getEntityId() {

		return getId();
	}

	@Transient
	public String getObjectId() {

		return getId();
	}
}


