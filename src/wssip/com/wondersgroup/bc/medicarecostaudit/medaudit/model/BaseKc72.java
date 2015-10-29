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
public abstract class BaseKc72 {


     private String baz004;
     private String baz003;
     private String aaa168;
     private String aaa167;
     private String aaa133;

   
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_BAZ004", allocationSize = 1)
    @Column(name="BAZ004", unique=true, nullable=false, length=16)
    public String getBaz004() {
        return this.baz004;
    }
    
    public void setBaz004(String baz004) {
        this.baz004 = baz004;
    }
    
    @Column(name="BAZ003", length=16)
    public String getBaz003() {
        return this.baz003;
    }
    
    public void setBaz003(String baz003) {
        this.baz003 = baz003;
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

		return getBaz004();
	}

	@Transient
	public String getObjectId() {

		return getBaz004();
	}
}


