package com.wondersgroup.bc.ruleknowledgemanage.planmanage.model;


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
 * Af46.
 */
@MappedSuperclass
public class BaseAf46  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long aaz319;
     private String aae417;
     private String apa709;
     private String aae043;
     private String ape032;
     private String aaa152;
     private Integer aaz100;
     private String aae100;
     private String aae011;
     private Date aae036;
     private String aaa027;
     private String aaa133;

    public BaseAf46() {
    }

	
    public BaseAf46(Long aaz319, String aaa027) {
        this.aaz319 = aaz319;
        this.aaa027 = aaa027;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ319", allocationSize = 1)
    
    @Column(name="AAZ319", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz319() {
        return this.aaz319;
    }
    
    public void setAaz319(Long aaz319) {
        this.aaz319 = aaz319;
    }
    
    @Column(name="AAE417", length=50)
    public String getAae417() {
        return this.aae417;
    }
    
    public void setAae417(String aae417) {
        this.aae417 = aae417;
    }
    
    @Column(name="APA709", length=1)
    public String getApa709() {
        return this.apa709;
    }
    
    public void setApa709(String apa709) {
        this.apa709 = apa709;
    }
    
    @Column(name="AAE043", length=6)
    public String getAae043() {
        return this.aae043;
    }
    
    public void setAae043(String aae043) {
        this.aae043 = aae043;
    }
    
    @Column(name="APE032", length=1)
    public String getApe032() {
        return this.ape032;
    }
    
    public void setApe032(String ape032) {
        this.ape032 = ape032;
    }
    
    @Column(name="AAA152", length=1000)
    public String getAaa152() {
        return this.aaa152;
    }
    
    public void setAaa152(String aaa152) {
        this.aaa152 = aaa152;
    }
    
    @Column(name="AAZ100", precision=6, scale=0)
    public Integer getAaz100() {
        return this.aaz100;
    }
    
    public void setAaz100(Integer aaz100) {
        this.aaz100 = aaz100;
    }
    
    @Column(name="AAE100", length=1)
    public String getAae100() {
        return this.aae100;
    }
    
    public void setAae100( String aae100) {
        this.aae100 = aae100;
    }
    
    @Column(name="AAE011", length=20)
    public String getAae011() {
        return this.aae011;
    }
    
    public void setAae011(String aae011) {
        this.aae011 = aae011;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE036", length=7)
    public Date getAae036() {
        return this.aae036;
    }
    
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAA133", length=500)
    public String getAaa133() {
        return this.aaa133;
    }
    
    public void setAaa133(String aaa133) {
        this.aaa133 = aaa133;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


