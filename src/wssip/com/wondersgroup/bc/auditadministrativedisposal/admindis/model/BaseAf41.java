package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @ClassName: BaseAf41 
 * @Description: 
 * @author chenlin
 * @date 2014-7-22 下午01:29:08 
 *
 */
@MappedSuperclass
public abstract class BaseAf41{


     private Long aaz303;
     private String aaa027;
     private Integer aae149;
     private String apa709;
     private String apa701;
     private String acc789;
     private Long ape110;
     private Long ape134;
     private Long ape116;
     private Long ape124;
     private Long ape121;
     private Long ape119;
     private Long ape118;
     private Long ape126;
     private Long ape117;
     private Long ape111;
     private Long ape125;
     private Long ape112;
     private Long ape113;
     private Long ape122;
     private Long ape067;

    public BaseAf41() {
    }

	
    public BaseAf41(Long aaz303, String aaa027) {
        this.aaz303 = aaz303;
        this.aaa027 = aaa027;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ303", allocationSize = 1)
    
    @Column(name="AAZ303", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz303() {
        return this.aaz303;
    }
    
    public void setAaz303(Long aaz303) {
        this.aaz303 = aaz303;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAE149", precision=6, scale=0)
    public Integer getAae149() {
        return this.aae149;
    }
    
    public void setAae149(Integer aae149) {
        this.aae149 = aae149;
    }
    
    @Column(name="APA709", length=1)
    public String getApa709() {
        return this.apa709;
    }
    
    public void setApa709(String apa709) {
        this.apa709 = apa709;
    }
    
    @Column(name="APA701", length=3)
    public String getApa701() {
        return this.apa701;
    }
    
    public void setApa701(String apa701) {
        this.apa701 = apa701;
    }
    
    @Column(name="ACC789", length=50)
    public String getAcc789() {
        return this.acc789;
    }
    
    public void setAcc789(String acc789) {
        this.acc789 = acc789;
    }
    
    @Column(name="APE110", precision=16, scale=0)
    public Long getApe110() {
        return this.ape110;
    }
    
    public void setApe110(Long ape110) {
        this.ape110 = ape110;
    }
    
    @Column(name="APE134", precision=16, scale=0)
    public Long getApe134() {
        return this.ape134;
    }
    
    public void setApe134(Long ape134) {
        this.ape134 = ape134;
    }
    
    @Column(name="APE116", precision=16, scale=0)
    public Long getApe116() {
        return this.ape116;
    }
    
    public void setApe116(Long ape116) {
        this.ape116 = ape116;
    }
    
    @Column(name="APE124", precision=16, scale=0)
    public Long getApe124() {
        return this.ape124;
    }
    
    public void setApe124(Long ape124) {
        this.ape124 = ape124;
    }
    
    @Column(name="APE121", precision=16, scale=0)
    public Long getApe121() {
        return this.ape121;
    }
    
    public void setApe121(Long ape121) {
        this.ape121 = ape121;
    }
    
    @Column(name="APE119", precision=16, scale=0)
    public Long getApe119() {
        return this.ape119;
    }
    
    public void setApe119(Long ape119) {
        this.ape119 = ape119;
    }
    
    @Column(name="APE118", precision=16, scale=0)
    public Long getApe118() {
        return this.ape118;
    }
    
    public void setApe118(Long ape118) {
        this.ape118 = ape118;
    }
    
    @Column(name="APE126", precision=16, scale=0)
    public Long getApe126() {
        return this.ape126;
    }
    
    public void setApe126(Long ape126) {
        this.ape126 = ape126;
    }
    
    @Column(name="APE117", precision=16, scale=0)
    public Long getApe117() {
        return this.ape117;
    }
    
    public void setApe117(Long ape117) {
        this.ape117 = ape117;
    }
    
    @Column(name="APE111", precision=16, scale=0)
    public Long getApe111() {
        return this.ape111;
    }
    
    public void setApe111(Long ape111) {
        this.ape111 = ape111;
    }
    
    @Column(name="APE125", precision=16, scale=0)
    public Long getApe125() {
        return this.ape125;
    }
    
    public void setApe125(Long ape125) {
        this.ape125 = ape125;
    }
    
    @Column(name="APE112", precision=16, scale=0)
    public Long getApe112() {
        return this.ape112;
    }
    
    public void setApe112(Long ape112) {
        this.ape112 = ape112;
    }
    
    @Column(name="APE113", precision=16, scale=0)
    public Long getApe113() {
        return this.ape113;
    }
    
    public void setApe113(Long ape113) {
        this.ape113 = ape113;
    }
    
    @Column(name="APE122", precision=16, scale=0)
    public Long getApe122() {
        return this.ape122;
    }
    
    public void setApe122(Long ape122) {
        this.ape122 = ape122;
    }
    
    @Column(name="APE067", precision=16, scale=0)
    public Long getApe067() {
        return this.ape067;
    }
    
    public void setApe067(Long ape067) {
        this.ape067 = ape067;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


