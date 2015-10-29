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
 * @author dumingqiang
 * @version $Revision$ 2014-7-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf48  {


     private Long aaz327;
     private Long aaz325;
     private Date aae310;
     private Date aae311;
     private String aae312;
     private String aae013;

    
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ327", allocationSize = 1)
    
    @Column(name="AAZ327", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz327() {
        return this.aaz327;
    }
    
    public void setAaz327(Long aaz327) {
        this.aaz327 = aaz327;
    }
    
    @Column(name="AAZ325", precision=16, scale=0)
    public Long getAaz325() {
        return this.aaz325;
    }
    
    public void setAaz325(Long aaz325) {
        this.aaz325 = aaz325;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE310", length=7)
    public Date getAae310() {
        return this.aae310;
    }
    
    public void setAae310(Date aae310) {
        this.aae310 = aae310;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE311", length=7)
    public Date getAae311() {
        return this.aae311;
    }
    
    public void setAae311(Date aae311) {
        this.aae311 = aae311;
    }
    
    @Column(name="AAE312", length=1)
    public String getAae312() {
        return this.aae312;
    }
    
    public void setAae312(String aae312) {
        this.aae312 = aae312;
    }
    
    @Column(name="AAE013", length=150)
    public String getAae013() {
        return this.aae013;
    }
    
    public void setAae013(String aae013) {
        this.aae013 = aae013;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


