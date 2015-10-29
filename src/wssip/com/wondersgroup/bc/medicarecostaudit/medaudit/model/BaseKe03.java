package com.wondersgroup.bc.medicarecostaudit.medaudit.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Ke03.
 */
@MappedSuperclass
public class BaseKe03   {


     private String baz014;
     private String baz013;
     private String baz035;
     private String baz036;
     private String baz037;
     private String baz038;
     private Date baz039;

	
    @Id 
    @Column(name="BAZ014", unique=true, nullable=false, length=16)
    public String getBaz014() {
        return this.baz014;
    }
    
    public void setBaz014(String baz014) {
        this.baz014 = baz014;
    }
    
    @Column(name="BAZ013", length=16)
    public String getBaz013() {
        return this.baz013;
    }
    
    public void setBaz013(String baz013) {
        this.baz013 = baz013;
    }
    
    @Column(name="BAZ035", length=100)
    public String getBaz035() {
        return this.baz035;
    }
    
    public void setBaz035(String baz035) {
        this.baz035 = baz035;
    }
    
    @Column(name="BAZ036", length=100)
    public String getBaz036() {
        return this.baz036;
    }
    
    public void setBaz036(String baz036) {
        this.baz036 = baz036;
    }
    
    @Column(name="BAZ037", length=100)
    public String getBaz037() {
        return this.baz037;
    }
    
    public void setBaz037(String baz037) {
        this.baz037 = baz037;
    }
    
    @Column(name="BAZ038", length=50)
    public String getBaz038() {
        return this.baz038;
    }
    
    public void setBaz038(String baz038) {
        this.baz038 = baz038;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BAZ039", length=7)
    public Date getBaz039() {
        return this.baz039;
    }
    
    public void setBaz039(Date baz039) {
        this.baz039 = baz039;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


