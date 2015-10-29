package com.wondersgroup.bc.medicarecostaudit.medaudit.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Ke02.
 */
@MappedSuperclass
public class BaseKe02   {


     private String baz010;
     private String baz005;
     private String baz035;
     private String baz036;
     private String baz037;
     private String baz038;
     private Date baz039;

    public BaseKe02() {
    }

	
    public BaseKe02(String baz010) {
        this.baz010 = baz010;
    }
   
    @Id 
    @Column(name="BAZ010", unique=true, nullable=false, length=16)
    public String getBaz010() {
        return this.baz010;
    }
    
    public void setBaz010(String baz010) {
        this.baz010 = baz010;
    }
    
    @Column(name="BAZ005", length=16)
    public String getBaz005() {
        return this.baz005;
    }
    
    public void setBaz005(String baz005) {
        this.baz005 = baz005;
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


