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

/**
 * 
 * @ClassName: BaseKa52 
 * @Description: 疑点场景信息
 * @author chenlin
 * @date 2014-7-31 上午10:10:50 
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseKa52  implements java.io.Serializable {


     private Long aaz351;
     private Long aaz328;
     private String aaa027;
     private String aaz217;
     private String aaz107;
     private String akb020;
     private String akb021;
     private String akb022;
     private String aka101;
     private String aac003;
     private String aac004;
     private String aac001;
     private String aac002;
     private String aae140;
     private String aka130;
     private Date akc194;
     private String aaz307;
     private String aae386;
     private String aab014;
     private String aaz263;
     private String aae004;
     private String ake024;
     private String aka122;
     private String aka174;
     private String akc050;
     private String akc193;
     private Integer aae030;
     private Integer aae031;
     private Integer aae001;
     private String akc185;
     private String aka120;
     private String akc186;
     private String akc188;
     private String akc190;

    public BaseKa52() {
    }

	
    public BaseKa52(Long aaz351, Long aaz328, String aaa027) {
        this.aaz351 = aaz351;
        this.aaz328 = aaz328;
        this.aaa027 = aaa027;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ351", allocationSize = 1)
    
    @Column(name="AAZ351", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz351() {
        return this.aaz351;
    }
    
    public void setAaz351(Long aaz351) {
        this.aaz351 = aaz351;
    }
    
    @Column(name="AAZ328", nullable=false, precision=16, scale=0)
    public Long getAaz328() {
        return this.aaz328;
    }
    
    public void setAaz328(Long aaz328) {
        this.aaz328 = aaz328;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ217", length=20)
    public String getAaz217() {
        return this.aaz217;
    }
    
    public void setAaz217(String aaz217) {
        this.aaz217 = aaz217;
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
    
    @Column(name="AKB021", length=100)
    public String getAkb021() {
        return this.akb021;
    }
    
    public void setAkb021(String akb021) {
        this.akb021 = akb021;
    }
    
    @Column(name="AKB022", length=1)
    public String getAkb022() {
        return this.akb022;
    }
    
    public void setAkb022(String akb022) {
        this.akb022 = akb022;
    }
    
    @Column(name="AKA101", length=2)
    public String getAka101() {
        return this.aka101;
    }
    
    public void setAka101(String aka101) {
        this.aka101 = aka101;
    }
    
    @Column(name="AAC003", length=50)
    public String getAac003() {
        return this.aac003;
    }
    
    public void setAac003(String aac003) {
        this.aac003 = aac003;
    }
    
    @Column(name="AAC004", length=1)
    public String getAac004() {
        return this.aac004;
    }
    
    public void setAac004(String aac004) {
        this.aac004 = aac004;
    }
    
    @Column(name="AAC001", length=20)
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
    
    @Column(name="AAE140", length=3)
    public String getAae140() {
        return this.aae140;
    }
    
    public void setAae140(String aae140) {
        this.aae140 = aae140;
    }
    
    @Column(name="AKA130", length=2)
    public String getAka130() {
        return this.aka130;
    }
    
    public void setAka130(String aka130) {
        this.aka130 = aka130;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AKC194", length=7)
    public Date getAkc194() {
        return this.akc194;
    }
    
    public void setAkc194(Date akc194) {
        this.akc194 = akc194;
    }
    
    @Column(name="AAZ307", length=20)
    public String getAaz307() {
        return this.aaz307;
    }
    
    public void setAaz307(String aaz307) {
        this.aaz307 = aaz307;
    }
    
    @Column(name="AAE386", length=100)
    public String getAae386() {
        return this.aae386;
    }
    
    public void setAae386(String aae386) {
        this.aae386 = aae386;
    }
    
    @Column(name="AAB014", length=18)
    public String getAab014() {
        return this.aab014;
    }
    
    public void setAab014(String aab014) {
        this.aab014 = aab014;
    }
    
    @Column(name="AAZ263", length=20)
    public String getAaz263() {
        return this.aaz263;
    }
    
    public void setAaz263(String aaz263) {
        this.aaz263 = aaz263;
    }
    
    @Column(name="AAE004", length=50)
    public String getAae004() {
        return this.aae004;
    }
    
    public void setAae004(String aae004) {
        this.aae004 = aae004;
    }
    
    @Column(name="AKE024", length=1000)
    public String getAke024() {
        return this.ake024;
    }
    
    public void setAke024(String ake024) {
        this.ake024 = ake024;
    }
    
    @Column(name="AKA122", length=20)
    public String getAka122() {
        return this.aka122;
    }
    
    public void setAka122(String aka122) {
        this.aka122 = aka122;
    }
    
    @Column(name="AKA174", length=1)
    public String getAka174() {
        return this.aka174;
    }
    
    public void setAka174(String aka174) {
        this.aka174 = aka174;
    }
    
    @Column(name="AKC050", length=100)
    public String getAkc050() {
        return this.akc050;
    }
    
    public void setAkc050(String akc050) {
        this.akc050 = akc050;
    }
    
    @Column(name="AKC193", length=20)
    public String getAkc193() {
        return this.akc193;
    }
    
    public void setAkc193(String akc193) {
        this.akc193 = akc193;
    }
    
    @Column(name="AAE030", precision=8, scale=0)
    public Integer getAae030() {
        return this.aae030;
    }
    
    public void setAae030(Integer aae030) {
        this.aae030 = aae030;
    }
    
    @Column(name="AAE031", precision=8, scale=0)
    public Integer getAae031() {
        return this.aae031;
    }
    
    public void setAae031(Integer aae031) {
        this.aae031 = aae031;
    }
    
    @Column(name="AAE001", precision=4, scale=0)
    public Integer getAae001() {
        return this.aae001;
    }
    
    public void setAae001(Integer aae001) {
        this.aae001 = aae001;
    }
    
    @Column(name="AKC185", length=100)
    public String getAkc185() {
        return this.akc185;
    }
    
    public void setAkc185(String akc185) {
        this.akc185 = akc185;
    }
    
    @Column(name="AKA120", length=20)
    public String getAka120() {
        return this.aka120;
    }
    
    public void setAka120(String aka120) {
        this.aka120 = aka120;
    }
    
    @Column(name="AKC186", length=100)
    public String getAkc186() {
        return this.akc186;
    }
    
    public void setAkc186(String akc186) {
        this.akc186 = akc186;
    }
    
    @Column(name="AKC188", length=20)
    public String getAkc188() {
        return this.akc188;
    }
    
    public void setAkc188(String akc188) {
        this.akc188 = akc188;
    }
    
    @Column(name="AKC190", length=20)
    public String getAkc190() {
        return this.akc190;
    }
    
    public void setAkc190(String akc190) {
        this.akc190 = akc190;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


