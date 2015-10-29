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
import javax.persistence.Transient;

/**
 * 结算
 * @author 
 * @version $Revision$ 2014-09-02
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKc24{


     private String aaz308;
     private String aaa027;
     private String akb020;
     private String aac003;
     private String aac001;
     private String aac002;
     private String akc190;
     private String akc021;
     private Date akc194;
     private String aaz217;
     private Double ake039;
     private Double ake029;
     private Double ake035;
     private Double ake043;
     private Double ake032;
     private Double ake042;
     private Double ake038;
     private Double akc254;
     private Double akc253;
     private Double akc264;
     private Double aka151;
     private Double aka153;
     private Double ake092;
     private Long aae418;
     private Double ake026;
     private Double akb067;


   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ308", allocationSize = 1)
    
    @Column(name="AAZ308", unique=true, nullable=false, precision=16, scale=0)
    public String getAaz308() {
        return this.aaz308;
    }
    
    public void setAaz308(String aaz308) {
        this.aaz308 = aaz308;
    }
    
    @Column(name="AAA027", length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AKB020", length=20)
    public String getAkb020() {
        return this.akb020;
    }
    
    public void setAkb020(String akb020) {
        this.akb020 = akb020;
    }
    
    @Column(name="AAC003", length=50)
    public String getAac003() {
        return this.aac003;
    }
    
    public void setAac003(String aac003) {
        this.aac003 = aac003;
    }
    
    @Column(name="AAC001", precision=20, scale=0)
    public String getAac001() {
        return this.aac001;
    }
    
    public void setAac001(String aac001) {
        this.aac001 = aac001;
    }
    
    @Column(name="AAC002", length=18)
    public String getAac002() {
        return this.aac002;
    }
    
    public void setAac002(String aac002) {
        this.aac002 = aac002;
    }
    
    @Column(name="AKC190", length=20)
    public String getAkc190() {
        return this.akc190;
    }
    
    public void setAkc190(String akc190) {
        this.akc190 = akc190;
    }
    
    @Column(name="AKC021", length=2)
    public String getAkc021() {
        return this.akc021;
    }
    
    public void setAkc021(String akc021) {
        this.akc021 = akc021;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AKC194", length=7)
    public Date getAkc194() {
        return this.akc194;
    }
    
    public void setAkc194(Date akc194) {
        this.akc194 = akc194;
    }
    
    @Column(name="AAZ217", precision=16, scale=0)
    public String getAaz217() {
        return this.aaz217;
    }
    
    public void setAaz217(String aaz217) {
        this.aaz217 = aaz217;
    }
    
    @Column(name="AKE039", precision=16)
    public Double getAke039() {
        return this.ake039;
    }
    
    public void setAke039(Double ake039) {
        this.ake039 = ake039;
    }
    
    @Column(name="AKE029", precision=16)
    public Double getAke029() {
        return this.ake029;
    }
    
    public void setAke029(Double ake029) {
        this.ake029 = ake029;
    }
    
    @Column(name="AKE035", precision=16)
    public Double getAke035() {
        return this.ake035;
    }
    
    public void setAke035(Double ake035) {
        this.ake035 = ake035;
    }
    
    @Column(name="AKE043", precision=16)
    public Double getAke043() {
        return this.ake043;
    }
    
    public void setAke043(Double ake043) {
        this.ake043 = ake043;
    }
    
    @Column(name="AKE032", precision=16)
    public Double getAke032() {
        return this.ake032;
    }
    
    public void setAke032(Double ake032) {
        this.ake032 = ake032;
    }
    
    @Column(name="AKE042", precision=16)
    public Double getAke042() {
        return this.ake042;
    }
    
    public void setAke042(Double ake042) {
        this.ake042 = ake042;
    }
    
    @Column(name="AKE038", precision=16)
    public Double getAke038() {
        return this.ake038;
    }
    
    public void setAke038(Double ake038) {
        this.ake038 = ake038;
    }
    
    @Column(name="AKC254", precision=16)
    public Double getAkc254() {
        return this.akc254;
    }
    
    public void setAkc254(Double akc254) {
        this.akc254 = akc254;
    }
    
    @Column(name="AKC253", precision=16)
    public Double getAkc253() {
        return this.akc253;
    }
    
    public void setAkc253(Double akc253) {
        this.akc253 = akc253;
    }
    
    @Column(name="AKC264", precision=16)
    public Double getAkc264() {
        return this.akc264;
    }
    
    public void setAkc264(Double akc264) {
        this.akc264 = akc264;
    }
    
    @Column(name="AKA151", precision=16)
    public Double getAka151() {
        return this.aka151;
    }
    
    public void setAka151(Double aka151) {
        this.aka151 = aka151;
    }
    
    @Column(name="AKA153", precision=16)
    public Double getAka153() {
        return this.aka153;
    }
    
    public void setAka153(Double aka153) {
        this.aka153 = aka153;
    }
    
    @Column(name="AKE092", precision=16)
    public Double getAke092() {
        return this.ake092;
    }
    
    public void setAke092(Double ake092) {
        this.ake092 = ake092;
    }
    
    @Column(name="AAE418", nullable=false, precision=16, scale=0)
    public Long getAae418() {
        return this.aae418;
    }
    
    public void setAae418(Long aae418) {
        this.aae418 = aae418;
    }
    
    @Column(name="AKE026", precision=16)
    public Double getAke026() {
        return this.ake026;
    }
    
    public void setAke026(Double ake026) {
        this.ake026 = ake026;
    }
    
    @Column(name="AKB067", precision=16)
    public Double getAkb067() {
        return this.akb067;
    }
    
    public void setAkb067(Double akb067) {
        this.akb067 = akb067;
    }

    @Transient
	public String getEntityId() {

		return getAaz308();
	}

	@Transient
	public String getObjectId() {

		return getAaz308();
	}
}


