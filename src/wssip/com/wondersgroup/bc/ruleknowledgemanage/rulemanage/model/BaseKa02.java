package com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model;


import java.math.BigDecimal;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Ka02.
 */

@SuppressWarnings("serial")

@MappedSuperclass
public class BaseKa02  implements java.io.Serializable {


     private String ake001;
     private String aaa027;
     private String aka029;
     private String aka061;
     private String aka062;
     private String aka031;
     private String aka032;
     private String aka033;
     private String aka070;
     private String aka074;
     private Long ake116;
     private String ake118;
     private Long ake117;
     private String ake119;
     private String ake127;
     private String ake112;
     private String ake113;
     private Boolean ake126;
     private String aka081;
     private String ake135;
     private String aka072;
     private BigDecimal aka071;
     private Long ake128;
     private String ake129;
     private String ake123;
     private String aka168;
     private String aka098;
     private String aab012;
     private Integer aab011;
     private Boolean ake004;
     private String aka063;
     private Boolean aka065;
     private Boolean aka064;
     private Boolean aka184;
     private Boolean aka166;
     private Boolean aka172;
     private String aka187;
     private Boolean aac004;
     private Boolean aka169;
     private Boolean aka170;
     private Boolean aka167;
     private String ake114;
     private String ake130;
     private Boolean ake131;
     private Boolean aka196;
     private Boolean aka197;
     private BigDecimal ake133;

  
   
  @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AKE001", allocationSize = 1)
    
    @Column(name="AKE001", unique=true, nullable=false, length=20)
    public String getAke001() {
        return this.ake001;
    }
    
    public void setAke001(String ake001) {
        this.ake001 = ake001;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AKA029", length=20)
    public String getAka029() {
        return this.aka029;
    }
    
    public void setAka029(String aka029) {
        this.aka029 = aka029;
    }
    
    @Column(name="AKA061", length=100)
    public String getAka061() {
        return this.aka061;
    }
    
    public void setAka061(String aka061) {
        this.aka061 = aka061;
    }
    
    @Column(name="AKA062", length=300)
    public String getAka062() {
        return this.aka062;
    }
    
    public void setAka062(String aka062) {
        this.aka062 = aka062;
    }
    
    @Column(name="AKA031", length=4)
    public String getAka031() {
        return this.aka031;
    }
    
    public void setAka031(String aka031) {
        this.aka031 = aka031;
    }
    
    @Column(name="AKA032", length=3)
    public String getAka032() {
        return this.aka032;
    }
    
    public void setAka032(String aka032) {
        this.aka032 = aka032;
    }
    
    @Column(name="AKA033", length=5)
    public String getAka033() {
        return this.aka033;
    }
    
    public void setAka033(String aka033) {
        this.aka033 = aka033;
    }
    
    @Column(name="AKA070", length=100)
    public String getAka070() {
        return this.aka070;
    }
    
    public void setAka070(String aka070) {
        this.aka070 = aka070;
    }
    
    @Column(name="AKA074", length=400)
    public String getAka074() {
        return this.aka074;
    }
    
    public void setAka074(String aka074) {
        this.aka074 = aka074;
    }
    
    @Column(name="AKE116", precision=16, scale=0)
    public Long getAke116() {
        return this.ake116;
    }
    
    public void setAke116(Long ake116) {
        this.ake116 = ake116;
    }
    
    @Column(name="AKE118", length=20)
    public String getAke118() {
        return this.ake118;
    }
    
    public void setAke118(String ake118) {
        this.ake118 = ake118;
    }
    
    @Column(name="AKE117", precision=16, scale=0)
    public Long getAke117() {
        return this.ake117;
    }
    
    public void setAke117(Long ake117) {
        this.ake117 = ake117;
    }
    
    @Column(name="AKE119", length=20)
    public String getAke119() {
        return this.ake119;
    }
    
    public void setAke119(String ake119) {
        this.ake119 = ake119;
    }
    
    @Column(name="AKE127", length=20)
    public String getAke127() {
        return this.ake127;
    }
    
    public void setAke127(String ake127) {
        this.ake127 = ake127;
    }
    
    @Column(name="AKE112", length=400)
    public String getAke112() {
        return this.ake112;
    }
    
    public void setAke112(String ake112) {
        this.ake112 = ake112;
    }
    
    @Column(name="AKE113", length=400)
    public String getAke113() {
        return this.ake113;
    }
    
    public void setAke113(String ake113) {
        this.ake113 = ake113;
    }
    
    @Column(name="AKE126", length=1)
    public Boolean getAke126() {
        return this.ake126;
    }
    
    public void setAke126(Boolean ake126) {
        this.ake126 = ake126;
    }
    
    @Column(name="AKA081", length=3)
    public String getAka081() {
        return this.aka081;
    }
    
    public void setAka081(String aka081) {
        this.aka081 = aka081;
    }
    
    @Column(name="AKE135", length=4000)
    public String getAke135() {
        return this.ake135;
    }
    
    public void setAke135(String ake135) {
        this.ake135 = ake135;
    }
    
    @Column(name="AKA072", length=3)
    public String getAka072() {
        return this.aka072;
    }
    
    public void setAka072(String aka072) {
        this.aka072 = aka072;
    }
    
    @Column(name="AKA071", precision=16)
    public BigDecimal getAka071() {
        return this.aka071;
    }
    
    public void setAka071(BigDecimal aka071) {
        this.aka071 = aka071;
    }
    
    @Column(name="AKE128", precision=16, scale=0)
    public Long getAke128() {
        return this.ake128;
    }
    
    public void setAke128(Long ake128) {
        this.ake128 = ake128;
    }
    
    @Column(name="AKE129", length=4000)
    public String getAke129() {
        return this.ake129;
    }
    
    public void setAke129(String ake129) {
        this.ake129 = ake129;
    }
    
    @Column(name="AKE123", length=4000)
    public String getAke123() {
        return this.ake123;
    }
    
    public void setAke123(String ake123) {
        this.ake123 = ake123;
    }
    
    @Column(name="AKA168", length=200)
    public String getAka168() {
        return this.aka168;
    }
    
    public void setAka168(String aka168) {
        this.aka168 = aka168;
    }
    
    @Column(name="AKA098", length=200)
    public String getAka098() {
        return this.aka098;
    }
    
    public void setAka098(String aka098) {
        this.aka098 = aka098;
    }
    
    @Column(name="AAB012", length=200)
    public String getAab012() {
        return this.aab012;
    }
    
    public void setAab012(String aab012) {
        this.aab012 = aab012;
    }
    
    @Column(name="AAB011", precision=8, scale=0)
    public Integer getAab011() {
        return this.aab011;
    }
    
    public void setAab011(Integer aab011) {
        this.aab011 = aab011;
    }
    
    @Column(name="AKE004", length=1)
    public Boolean getAke004() {
        return this.ake004;
    }
    
    public void setAke004(Boolean ake004) {
        this.ake004 = ake004;
    }
    
    @Column(name="AKA063", length=4)
    public String getAka063() {
        return this.aka063;
    }
    
    public void setAka063(String aka063) {
        this.aka063 = aka063;
    }
    
    @Column(name="AKA065", length=1)
    public Boolean getAka065() {
        return this.aka065;
    }
    
    public void setAka065(Boolean aka065) {
        this.aka065 = aka065;
    }
    
    @Column(name="AKA064", length=1)
    public Boolean getAka064() {
        return this.aka064;
    }
    
    public void setAka064(Boolean aka064) {
        this.aka064 = aka064;
    }
    
    @Column(name="AKA184", length=1)
    public Boolean getAka184() {
        return this.aka184;
    }
    
    public void setAka184(Boolean aka184) {
        this.aka184 = aka184;
    }
    
    @Column(name="AKA166", length=1)
    public Boolean getAka166() {
        return this.aka166;
    }
    
    public void setAka166(Boolean aka166) {
        this.aka166 = aka166;
    }
    
    @Column(name="AKA172", length=1)
    public Boolean getAka172() {
        return this.aka172;
    }
    
    public void setAka172(Boolean aka172) {
        this.aka172 = aka172;
    }
    
    @Column(name="AKA187", length=4000)
    public String getAka187() {
        return this.aka187;
    }
    
    public void setAka187(String aka187) {
        this.aka187 = aka187;
    }
    
    @Column(name="AAC004", length=1)
    public Boolean getAac004() {
        return this.aac004;
    }
    
    public void setAac004(Boolean aac004) {
        this.aac004 = aac004;
    }
    
    @Column(name="AKA169", length=1)
    public Boolean getAka169() {
        return this.aka169;
    }
    
    public void setAka169(Boolean aka169) {
        this.aka169 = aka169;
    }
    
    @Column(name="AKA170", length=1)
    public Boolean getAka170() {
        return this.aka170;
    }
    
    public void setAka170(Boolean aka170) {
        this.aka170 = aka170;
    }
    
    @Column(name="AKA167", length=1)
    public Boolean getAka167() {
        return this.aka167;
    }
    
    public void setAka167(Boolean aka167) {
        this.aka167 = aka167;
    }
    
    @Column(name="AKE114", length=200)
    public String getAke114() {
        return this.ake114;
    }
    
    public void setAke114(String ake114) {
        this.ake114 = ake114;
    }
    
    @Column(name="AKE130", length=200)
    public String getAke130() {
        return this.ake130;
    }
    
    public void setAke130(String ake130) {
        this.ake130 = ake130;
    }
    
    @Column(name="AKE131", length=1)
    public Boolean getAke131() {
        return this.ake131;
    }
    
    public void setAke131(Boolean ake131) {
        this.ake131 = ake131;
    }
    
    @Column(name="AKA196", length=1)
    public Boolean getAka196() {
        return this.aka196;
    }
    
    public void setAka196(Boolean aka196) {
        this.aka196 = aka196;
    }
    
    @Column(name="AKA197", length=1)
    public Boolean getAka197() {
        return this.aka197;
    }
    
    public void setAka197(Boolean aka197) {
        this.aka197 = aka197;
    }
    
    @Column(name="AKE133", precision=16)
    public BigDecimal getAke133() {
        return this.ake133;
    }
    
    public void setAke133(BigDecimal ake133) {
        this.ake133 = ake133;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	

	@Transient
	public String getEntityId() {

		return getAke001();
	}

	@Transient
	public String getObjectId() {

		return getAke001();
	}
}


