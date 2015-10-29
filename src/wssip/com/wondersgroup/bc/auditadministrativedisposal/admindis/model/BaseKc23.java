package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


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

/**就诊信息--单据明细
 * Kc22.
 */
@MappedSuperclass
public abstract class BaseKc23   {


     private String aaz210;
     private String aaz331;
     private String aaz263;
     private String aab014;
     private String aae072;
     private String akc220;
     private String aka017;
     private Double aae019;
     private String aaz217;
     private Long aae418;
     private Date akc221;
     private String aka130;
     private String aaz107;
     private String aka122;

    
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ210", allocationSize = 1)
    
    @Column(name="AAZ210", unique=true, nullable=false, precision=16, scale=0)
    public String getAaz210() {
        return this.aaz210;
    }
    
    public void setAaz210(String aaz210) {
        this.aaz210 = aaz210;
    }
    
    @Column(name="AAZ331", precision=16, scale=0)
    public String getAaz331() {
        return this.aaz331;
    }
    
    public void setAaz331(String aaz331) {
        this.aaz331 = aaz331;
    }
    
    @Column(name="AAZ263", precision=20, scale=0)
    public String getAaz263() {
        return this.aaz263;
    }
    
    public void setAaz263(String aaz263) {
        this.aaz263 = aaz263;
    }
    
    @Column(name="AAB014", length=18)
    public String getAab014() {
        return this.aab014;
    }
    
    public void setAab014(String aab014) {
        this.aab014 = aab014;
    }
    
    @Column(name="AAE072", length=20)
    public String getAae072() {
        return this.aae072;
    }
    
    public void setAae072(String aae072) {
        this.aae072 = aae072;
    }
    
    @Column(name="AKC220", length=20)
    public String getAkc220() {
        return this.akc220;
    }
    
    public void setAkc220(String akc220) {
        this.akc220 = akc220;
    }
    
    @Column(name="AKA017", length=2)
    public String getAka017() {
        return this.aka017;
    }
    
    public void setAka017(String aka017) {
        this.aka017 = aka017;
    }
    
    @Column(name="AAE019", precision=18, scale=4)
    public Double getAae019() {
        return this.aae019;
    }
    
    public void setAae019(Double aae019) {
        this.aae019 = aae019;
    }
    
    @Column(name="AAZ217", precision=16, scale=0)
    public String getAaz217() {
        return this.aaz217;
    }
    
    public void setAaz217(String aaz217) {
        this.aaz217 = aaz217;
    }
    
    @Column(name="AAE418", nullable=false, precision=16, scale=0)
    public Long getAae418() {
        return this.aae418;
    }
    
    public void setAae418(Long aae418) {
        this.aae418 = aae418;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AKC221", length=7)
    public Date getAkc221() {
        return this.akc221;
    }
    
    public void setAkc221(Date akc221) {
        this.akc221 = akc221;
    }
    
    @Column(name="AKA130", length=2)
    public String getAka130() {
        return this.aka130;
    }
    
    public void setAka130(String aka130) {
        this.aka130 = aka130;
    }
    
    @Column(name="AAZ107", precision=20, scale=0)
    public String getAaz107() {
        return this.aaz107;
    }
    
    public void setAaz107(String aaz107) {
        this.aaz107 = aaz107;
    }
    
    @Column(name="AKA122", length=20)
    public String getAka122() {
        return this.aka122;
    }
    
    public void setAka122(String aka122) {
        this.aka122 = aka122;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


