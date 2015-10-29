package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKf06   {


     private String aaz307;
     private String aaa027;
     private String aaz107;
     private String akb020;
     private String akf001;
     private String aae386;
     private String aae100;
     private Integer akf015;

   
    @Id 
    @Column(name="AAZ307", unique=true, nullable=false, length=20)
    public String getAaz307() {
        return this.aaz307;
    }
    
    public void setAaz307(String aaz307) {
        this.aaz307 = aaz307;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ107", precision=20, scale=0)
    public String getAaz107() {
        return this.aaz107;
    }
    
    public void setAaz107(String aaz107) {
        this.aaz107 = aaz107;
    }
    
    @Column(name="AKB020", length=20)
    public String getAkb020() {
        return this.akb020;
    }
    
    public void setAkb020(String akb020) {
        this.akb020 = akb020;
    }
    
    @Column(name="AKF001", length=20)
    public String getAkf001() {
        return this.akf001;
    }
    
    public void setAkf001(String akf001) {
        this.akf001 = akf001;
    }
    
    @Column(name="AAE386", length=100)
    public String getAae386() {
        return this.aae386;
    }
    
    public void setAae386(String aae386) {
        this.aae386 = aae386;
    }
    
    @Column(name="AAE100", length=1)
    public String getAae100() {
        return this.aae100;
    }
    
    public void setAae100(String aae100) {
        this.aae100 = aae100;
    }
    
    @Column(name="AKF015", precision=8, scale=0)
    public Integer getAkf015() {
        return this.akf015;
    }
    
    public void setAkf015(Integer akf015) {
        this.akf015 = akf015;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Transient
	public String getEntityId() {

		return getAaz307();
	}

	@Transient
	public String getObjectId() {

		return getAaz307();
	}
}


