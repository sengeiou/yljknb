package com.wondersgroup.bc.ruleknowledgemanage.planmanage.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author dumingqiang
 * @version $Revision$ 2014-8-7
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@Entity
@Table(name="AF50"
)
public abstract class BaseAf50 {


     private Long aaz330;
     private Long aaz327;
     private String aaa156;
     private Long aaz319;
     private Date aae311;
     private String aae312;
     private String aae317;
 
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ330", allocationSize = 1)
    
    @Column(name="AAZ330", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz330() {
        return this.aaz330;
    }
    
    public void setAaz330(Long aaz330) {
        this.aaz330 = aaz330;
    }
    
    @Column(name="AAZ327", precision=16, scale=0)
    public Long getAaz327() {
        return this.aaz327;
    }
    
    public void setAaz327(Long aaz327) {
        this.aaz327 = aaz327;
    }
    
    @Column(name="AAA156", length=1)
    public String getAaa156() {
        return this.aaa156;
    }
    
    public void setAaa156(String aaa156) {
        this.aaa156 = aaa156;
    }
    
    @Column(name="AAZ319", precision=16, scale=0)
    public Long getAaz319() {
        return this.aaz319;
    }
    
    public void setAaz319(Long aaz319) {
        this.aaz319 = aaz319;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE311", length=7)
    public Date getAae311() {
        return this.aae311;
    }
    
    public void setAae311(Date aae311) {
        this.aae311 = aae311;
    }
    
    @Column(name="AAE312", length=10)
    public String getAae312() {
        return this.aae312;
    }
    
    public void setAae312(String aae312) {
        this.aae312 = aae312;
    }
    
    @Column(name="AAE317", length=2000)
    public String getAae317() {
        return this.aae317;
    }
    
    public void setAae317(String aae317) {
        this.aae317 = aae317;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


