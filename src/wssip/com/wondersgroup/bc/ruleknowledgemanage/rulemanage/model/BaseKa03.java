package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;


import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Ka03.
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseKa03  implements java.io.Serializable {


     private String ake001;
     private String aaa027;
     private String ake002;
     private String aka165;
     private String aka096;
     private String aka097;
     private String ake115;
     private String aka173;
     private String aka052;
     private Boolean aac004;
     private String aka063;
     private Boolean aka065;
     private String aka198;
     private Boolean ake003;

  @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AKE001", allocationSize = 1)
    
    @Column(name="AKE001", unique=true, nullable=false, length=20)
    public String getAke001() {
        return this.ake001;
    }
    
    public void setAke001(String ake001) {
        this.ake001 = ake001;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AKE002", length=100)
    public String getAke002() {
        return this.ake002;
    }
    
    public void setAke002(String ake002) {
        this.ake002 = ake002;
    }
    
    @Column(name="AKA165", length=20)
    public String getAka165() {
        return this.aka165;
    }
    
    public void setAka165(String aka165) {
        this.aka165 = aka165;
    }
    
    @Column(name="AKA096", length=1000)
    public String getAka096() {
        return this.aka096;
    }
    
    public void setAka096(String aka096) {
        this.aka096 = aka096;
    }
    
    @Column(name="AKA097", length=1000)
    public String getAka097() {
        return this.aka097;
    }
    
    public void setAka097(String aka097) {
        this.aka097 = aka097;
    }
    
    @Column(name="AKE115", length=200)
    public String getAke115() {
        return this.ake115;
    }
    
    public void setAke115(String ake115) {
        this.ake115 = ake115;
    }
    
    @Column(name="AKA173", length=10)
    public String getAka173() {
        return this.aka173;
    }
    
    public void setAka173(String aka173) {
        this.aka173 = aka173;
    }
    
    @Column(name="AKA052", length=50)
    public String getAka052() {
        return this.aka052;
    }
    
    public void setAka052(String aka052) {
        this.aka052 = aka052;
    }
    
    @Column(name="AAC004", length=1)
    public Boolean getAac004() {
        return this.aac004;
    }
    
    public void setAac004(Boolean aac004) {
        this.aac004 = aac004;
    }
    
    @Column(name="AKA063", length=2)
    public String getAka063() {
        return this.aka063;
    }
    
    public void setAka063(String aka063) {
        this.aka063 = aka063;
    }
    
    @Column(name="AKA065", length=1)
    public Boolean getAka065() {
        return this.aka065;
    }
    
    public void setAka065(Boolean aka065) {
        this.aka065 = aka065;
    }
    
    @Column(name="AKA198", length=16)
    public String getAka198() {
        return this.aka198;
    }
    
    public void setAka198(String aka198) {
        this.aka198 = aka198;
    }
    
    @Column(name="AKE003", length=1)
    public Boolean getAke003() {
        return this.ake003;
    }
    
    public void setAke003(Boolean ake003) {
        this.ake003 = ake003;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Transient
	public String getEntityId() {

		return getAke001();
	}

	@Transient
	public String getObjectId() {

		return getAke001();
	}
}


