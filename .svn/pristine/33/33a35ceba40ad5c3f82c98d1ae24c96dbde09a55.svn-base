package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * TB_dic_gzms.
 */
@MappedSuperclass
public abstract class BaseTbDicGzms{
	

	private String id;
     private String mc;
     private String gzdm;
     private String gzms;
     private String cjrid;
     private String cjrmc;
     private Date cjsj;
     private String zt;


   
    @Id 
    @Column(name="ID", unique=true, nullable=false, length=32)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="MC", length=32)
    public String getMc() {
        return this.mc;
    }
    
    public void setMc(String mc) {
        this.mc = mc;
    }
    
    @Column(name="GZDM", length=32)
    public String getGzdm() {
        return this.gzdm;
    }
    
    public void setGzdm(String gzdm) {
        this.gzdm = gzdm;
    }
    
    @Column(name="GZMS", length=1024)
    public String getGzms() {
        return this.gzms;
    }
    
    public void setGzms(String gzms) {
        this.gzms = gzms;
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
    
    @Transient
	public String getEntityId() {

		return getId();
	}

	@Transient
	public String getObjectId() {

		return getId();
	}
}





