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
 * @ClassName: BaseKa59 
 * @Description: 疑点明细信息 
 * @author chenlin
 * @date 2014-7-30 下午02:57:33 
 *
 */
@MappedSuperclass
public abstract class BaseKa59 {


     private Long aaz328;
     private String aaa027;
     private Long aaz319;
     private Long aae319;
     private Date abb057;
     private String apa709;
     private Long aaz010;
     private Double aae420;
     private Integer aaa155;
     private Double aaa005;
     private Long ape735;
     private String aae317;
     private String ape031;
     private Long aaz281;
     private String ape035;
     private String aka130;
     private String akc021;
     private String aka122;
     private String aaa153;
     private String aaa178;
     private String aae013;
     private String aae011;
     private Date aae036;
     private Long prseno;
     private String aka101;
     private String aae140;
     private String shzt;
     private String clbz;
     private String dxid;
     private String aaa204;

    public BaseKa59() {
    }

	
    public BaseKa59(Long aaz328, String aaa027, Long prseno) {
        this.aaz328 = aaz328;
        this.aaa027 = aaa027;
        this.prseno = prseno;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ328", allocationSize = 1)
    
    @Column(name="AAZ328", unique=true, nullable=false, precision=16, scale=0)
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
    
    @Column(name="AAZ319", precision=16, scale=0)
    public Long getAaz319() {
        return this.aaz319;
    }
    
    public void setAaz319(Long aaz319) {
        this.aaz319 = aaz319;
    }
    
    @Column(name="AAE319", precision=16, scale=0)
    public Long getAae319() {
        return this.aae319;
    }
    
    public void setAae319(Long aae319) {
        this.aae319 = aae319;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="ABB057", length=7)
    public Date getAbb057() {
        return this.abb057;
    }
    
    public void setAbb057(Date abb057) {
        this.abb057 = abb057;
    }
    
    @Column(name="APA709", length=1)
    public String getApa709() {
        return this.apa709;
    }
    
    public void setApa709(String apa709) {
        this.apa709 = apa709;
    }
    
    @Column(name="AAZ010", precision=26, scale=0)
    public Long getAaz010() {
        return this.aaz010;
    }
    
    public void setAaz010(Long aaz010) {
        this.aaz010 = aaz010;
    }
    
    @Column(name="AAE420", precision=16, scale=4)
    public Double getAae420() {
        return this.aae420;
    }
    
    public void setAae420(Double aae420) {
        this.aae420 = aae420;
    }
    
    @Column(name="AAA155", precision=2, scale=0)
    public Integer getAaa155() {
        return this.aaa155;
    }
    
    public void setAaa155(Integer aaa155) {
        this.aaa155 = aaa155;
    }
    
    @Column(name="AAA005", precision=16, scale=4)
    public Double getAaa005() {
        return this.aaa005;
    }
    
    public void setAaa005(Double aaa005) {
        this.aaa005 = aaa005;
    }
    
    @Column(name="APE735", precision=16, scale=0)
    public Long getApe735() {
        return this.ape735;
    }
    
    public void setApe735(Long ape735) {
        this.ape735 = ape735;
    }
    
    @Column(name="AAE317", length=2000)
    public String getAae317() {
        return this.aae317;
    }
    
    public void setAae317(String aae317) {
        this.aae317 = aae317;
    }
    
    @Column(name="APE031", length=1)
    public String getApe031() {
        return this.ape031;
    }
    
    public void setApe031(String ape031) {
        this.ape031 = ape031;
    }
    
    @Column(name="AAZ281", precision=16, scale=0)
    public Long getAaz281() {
        return this.aaz281;
    }
    
    public void setAaz281(Long aaz281) {
        this.aaz281 = aaz281;
    }
    
    @Column(name="APE035", length=100)
    public String getApe035() {
        return this.ape035;
    }
    
    public void setApe035(String ape035) {
        this.ape035 = ape035;
    }
    
    @Column(name="AKA130", length=2)
    public String getAka130() {
        return this.aka130;
    }
    
    public void setAka130(String aka130) {
        this.aka130 = aka130;
    }
    
    @Column(name="AKC021", length=2)
    public String getAkc021() {
        return this.akc021;
    }
    
    public void setAkc021(String akc021) {
        this.akc021 = akc021;
    }
    
    @Column(name="AKA122", length=20)
    public String getAka122() {
        return this.aka122;
    }
    
    public void setAka122(String aka122) {
        this.aka122 = aka122;
    }
    
    @Column(name="AAA153", length=3)
    public String getAaa153() {
        return this.aaa153;
    }
    
    public void setAaa153(String aaa153) {
        this.aaa153 = aaa153;
    }
    
    @Column(name="AAA178", length=2)
    public String getAaa178() {
        return this.aaa178;
    }
    
    public void setAaa178(String aaa178) {
        this.aaa178 = aaa178;
    }
    
    @Column(name="AAE013", length=150)
    public String getAae013() {
        return this.aae013;
    }
    
    public void setAae013(String aae013) {
        this.aae013 = aae013;
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
    
    @Column(name="PRSENO", nullable=false, precision=12, scale=0)
    public Long getPrseno() {
        return this.prseno;
    }
    
    public void setPrseno(Long prseno) {
        this.prseno = prseno;
    }
    
    @Column(name="AKA101", length=2)
    public String getAka101() {
        return this.aka101;
    }
    
    public void setAka101(String aka101) {
        this.aka101 = aka101;
    }
    
    @Column(name="AAE140", length=3)
    public String getAae140() {
        return this.aae140;
    }
    
    public void setAae140(String aae140) {
        this.aae140 = aae140;
    }
    
    @Column(name="SHZT", length=1)
    public String getShzt() {
        return this.shzt;
    }
    
    public void setShzt(String shzt) {
        this.shzt = shzt;
    }
    
    @Column(name="CLBZ", length=1)
    public String getClbz() {
        return this.clbz;
    }
    
    public void setClbz(String clbz) {
        this.clbz = clbz;
    }
    
    @Column(name="DXID", length=100)
    public String getDxid() {
        return this.dxid;
    }
    
    public void setDxid(String dxid) {
        this.dxid = dxid;
    }
    
    @Column(name="AAA204", length=2)
    public String getAaa204() {
        return this.aaa204;
    }
    
    public void setAaa204(String aaa204) {
        this.aaa204 = aaa204;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


