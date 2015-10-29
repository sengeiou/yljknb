package com.wondersgroup.bc.medicarecostaudit.medaudit.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Ke04
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseKe04  implements java.io.Serializable {


	private String baz010;
     private Long aaz381;
     private String baz005;
     private String baz035;
     private String baz036;
     private String baz037;
     private String baz038;
     private Date baz039;

    public BaseKe04() {
    }

	
    public BaseKe04(String baz010) {
        this.baz010 = baz010;
    }
   
     @Id 
     @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
     @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_BAZ010", allocationSize = 1)
    
    @Column(name="BAZ010", unique=true, nullable=false, length=16)
    public String getBaz010() {
        return this.baz010;
    }
    
    public void setBaz010(String baz010) {
        this.baz010 = baz010;
    }
    
    @Column(name="AAZ381", precision=20, scale=0)
    public Long getAaz381() {
		return aaz381;
	}


	public void setAaz381(Long aaz381) {
		this.aaz381 = aaz381;
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


