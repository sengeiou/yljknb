package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;


import java.util.Date;
import javax.persistence.Column;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TbDicGzzb.
 */
@MappedSuperclass
public abstract class BaseTbDicGzzb{

	private String id;
     private String gzdm;
     private String zbmc;
     private String zbdm;
     private String zbms;
     private String cjrid;
     private String cjrmc;
     private Date cjsj;
     private String zt;


  @Id 
 @Column(name="ID", unique=true, nullable=false, precision=32, scale=0)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="GZDM", length=32)
    public String getGzdm() {
        return this.gzdm;
    }
    
    public void setGzdm(String gzdm) {
        this.gzdm = gzdm;
    }
    
    @Column(name="ZBMC", length=64)
    public String getZbmc() {
        return this.zbmc;
    }
    
    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }
    
    @Column(name="ZBDM", length=32)
    public String getZbdm() {
        return this.zbdm;
    }
    
    public void setZbdm(String zbdm) {
        this.zbdm = zbdm;
    }
    
    @Column(name="ZBMS", length=512)
    public String getZbms() {
        return this.zbms;
    }
    
    public void setZbms(String zbms) {
        this.zbms = zbms;
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


