package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author dmq
 * @version $Revision$ 2014-09-15
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf78 {


     private Long aaz523;//问题ID
     private Long aaz281;//任务问题关联流水号ID
     private Long aaz524;//任务书编号

	 @Id 
	 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
	 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ523", allocationSize = 1)
	 @Column(name="AAZ523", unique=true, nullable=false, precision=16, scale=0)
	 public Long getAaz523() {
		 return this.aaz523;
	 }
	    
	 public void setAaz523(Long aaz523) {
		 this.aaz523 = aaz523;
	 }
    
    @Column(name="AAZ281", nullable=false, precision=16, scale=0)
    public Long getAaz281() {
        return this.aaz281;
    }
    
    public void setAaz281(Long aaz281) {
        this.aaz281 = aaz281;
    }
    
    @Column(name="AAZ524", nullable=false, precision=16, scale=0)
    public Long getAaz524() {
        return this.aaz524;
    }
    
    public void setAaz524(Long aaz524) {
        this.aaz524 = aaz524;
    }
    
    @Transient
   	public Long getEntityId() {

   		return getAaz523();
   	}

   	@Transient
   	public Long getObjectId() {

   		return getAaz523();
   	}

}


