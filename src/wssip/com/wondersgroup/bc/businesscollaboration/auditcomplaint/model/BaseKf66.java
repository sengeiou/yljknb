package com.wondersgroup.bc.businesscollaboration.auditcomplaint.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Kf66.
 */
@MappedSuperclass
public abstract class BaseKf66  {


     private String baz047;
     private String aaa027;
     private String aaz107;
     private String akb020;
     private String aaz307;
     private String akf001;
     private String aae386;
     private String aae100;
     private Integer akf015;
     private String flag;
     private String aae011;
     private Date aae036;
     private String apa120;
     private String aae012;
     private Date aae034;
     private String aae016;

   
     @Id 

    
    @Column(name="BAZ047", unique=true, nullable=false, length=16)
    public String getBaz047() {
        return this.baz047;
    }
    
    public void setBaz047(String baz047) {
        this.baz047 = baz047;
    }
    
    @Column(name="AAA027",  length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ107", length=20)
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
    
    @Column(name="AAZ307",  precision=16, scale=0)
    public String getAaz307() {
        return this.aaz307;
    }
    
    public void setAaz307(String aaz307) {
        this.aaz307 = aaz307;
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
    
    @Column(name="FLAG", length=100)
    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
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
    
    @Column(name="APA120", length=1)
    public String getApa120() {
        return this.apa120;
    }
    
    public void setApa120(String apa120) {
        this.apa120 = apa120;
    }
    
    @Column(name="AAE012", length=20)
    public String getAae012() {
        return this.aae012;
    }
    
    public void setAae012(String aae012) {
        this.aae012 = aae012;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE034", length=7)
    public Date getAae034() {
        return this.aae034;
    }
    
    public void setAae034(Date aae034) {
        this.aae034 = aae034;
    }
    
    @Column(name="AAE016", length=1)
    public String getAae016() {
        return this.aae016;
    }
    
    public void setAae016(String aae016) {
        this.aae016 = aae016;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}


