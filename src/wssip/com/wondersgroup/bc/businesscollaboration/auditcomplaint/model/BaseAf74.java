package com.wondersgroup.bc.businesscollaboration.auditcomplaint.model;


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
 * @author wsj
 * @version $Revision$ 2014-09-15
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public class BaseAf74  {


     private Long aaz530;
     private Long aaz529;
     private String ape023;
     private String aae011;
     private Date aae036;

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
	@SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ530", allocationSize = 1)
	@Column(name="AAZ530", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz530() {
        return this.aaz530;
    }
    
    public void setAaz530(Long aaz530) {
        this.aaz530 = aaz530;
    }
    
    @Column(name="AAZ529", precision=16, scale=0)
    public Long getAaz529() {
        return this.aaz529;
    }
    
    public void setAaz529(Long aaz529) {
        this.aaz529 = aaz529;
    }
    
    @Column(name="APE023", length=1000)
    public String getApe023() {
        return this.ape023;
    }
    
    public void setApe023(String ape023) {
        this.ape023 = ape023;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


