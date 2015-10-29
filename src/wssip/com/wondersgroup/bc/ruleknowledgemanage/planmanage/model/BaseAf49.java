package com.wondersgroup.bc.ruleknowledgemanage.planmanage.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author dumingqiang
 * @version $Revision$ 2014-7-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf49 {


     private Long aaz333;
     private Long aaz325;
     private String aaa156;
     private Long aaz319;
     private Short ake070;

    public BaseAf49() {
    }

	
    public BaseAf49(Long aaz333) {
        this.aaz333 = aaz333;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ333", allocationSize = 1)
    
    @Column(name="AAZ333", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz333() {
        return this.aaz333;
    }
    
    public void setAaz333(Long aaz333) {
        this.aaz333 = aaz333;
    }
    
    @Column(name="AAZ325", precision=16, scale=0)
    public Long getAaz325() {
        return this.aaz325;
    }
    
    public void setAaz325(Long aaz325) {
        this.aaz325 = aaz325;
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
    
    @Column(name="AKE070", precision=4, scale=0)
    public Short getAke070() {
        return this.ake070;
    }
    
    public void setAke070(Short ake070) {
        this.ake070 = ake070;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


