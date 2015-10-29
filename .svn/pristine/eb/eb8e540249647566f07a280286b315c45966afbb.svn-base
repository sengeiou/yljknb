package com.wondersgroup.bc.medicarecostaudit.medaudit.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2014-07-114
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKc73 {


     private String baz002;
     private String baz001;
     private String aaa168;
     private String aaa167;
     private String aaa133;

   
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_BAZ002", allocationSize = 1)
    @Column(name="BAZ002", unique=true, nullable=false, length=16)
    public String getBaz002() {
        return this.baz002;
    }
    
    public void setBaz002(String baz002) {
        this.baz002 = baz002;
    }
    
    @Column(name="BAZ001", length=16)
    public String getBaz001() {
        return this.baz001;
    }
    
    public void setBaz001(String baz001) {
        this.baz001 = baz001;
    }
    
    @Column(name="AAA168", length=20)
    public String getAaa168() {
        return this.aaa168;
    }
    
    public void setAaa168(String aaa168) {
        this.aaa168 = aaa168;
    }
    
    @Column(name="AAA167", length=100)
    public String getAaa167() {
        return this.aaa167;
    }
    
    public void setAaa167(String aaa167) {
        this.aaa167 = aaa167;
    }
    
    @Column(name="AAA133", length=500)
    public String getAaa133() {
        return this.aaa133;
    }
    
    public void setAaa133(String aaa133) {
        this.aaa133 = aaa133;
    }
    
    @Transient
	public String getEntityId() {

		return getBaz002();
	}

	@Transient
	public String getObjectId() {

		return getBaz002();
	}

}


