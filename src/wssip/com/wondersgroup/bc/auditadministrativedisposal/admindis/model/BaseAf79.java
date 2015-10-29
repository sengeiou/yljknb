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
 * @author ltt
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
//核查任务
@MappedSuperclass
public abstract class BaseAf79 {

	private Long aaz524;//任务编号
    private String aaa027;//统筹区编号
    private String aae012;//任务发放人
    private Integer aae217;//任务发放时间
    private String aae014;//任务受理人
    private String ape140;//核查任务状态 1待审核 2审核通过 3审核不通过 4已受理 5完成
    private Date aae036;//任务受理时间
    private Date aae218;//任务规定完成时间
    private String aae013;//任务备注
    private String ape723;//任务建议
    private Date aae310;//任务生成时间
    private Date aae311;//任务完成时间
    private String aae011;//任务生成人
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ524", allocationSize = 1)
    @Column(name="AAZ524", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz524() {
        return this.aaz524;
    }
       
    public void setAaz524(Long aaz524) {
         this.aaz524 = aaz524;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAE012", length=32)
    public String getAae012() {
        return this.aae012;
    }
    
    public void setAae012(String aae012) {
        this.aae012 = aae012;
    }
    
    @Column(name="AAE217", precision=8, scale=0)
    public Integer getAae217() {
        return this.aae217;
    }
    
    public void setAae217(Integer aae217) {
        this.aae217 = aae217;
    }
    
    @Column(name="AAE014", length=32)
    public String getAae014() {
        return this.aae014;
    }
    
    public void setAae014(String aae014) {
        this.aae014 = aae014;
    }
    
    @Column(name="APE140", length=2)
    public String getApe140() {
        return this.ape140;
    }
    
    public void setApe140(String ape140) {
        this.ape140 = ape140;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="AAE036", length=7)
    public Date getAae036() {
        return this.aae036;
    }
    
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="AAE218", length=7)
    public Date getAae218() {
        return this.aae218;
    }
    
    public void setAae218(Date aae218) {
        this.aae218 = aae218;
    }
    
    @Column(name="AAE013", length=1000)
    public String getAae013() {
        return this.aae013;
    }
    
    public void setAae013(String aae013) {
        this.aae013 = aae013;
    }
    
    @Column(name="APE723", length=1000)
    public String getApe723() {
        return this.ape723;
    }
    
    public void setApe723(String ape723) {
        this.ape723 = ape723;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE310", length=7)
    public Date getAae310() {
        return this.aae310;
    }
    
    public void setAae310(Date aae310) {
        this.aae310 = aae310;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="AAE311", length=7)
    public Date getAae311() {
        return this.aae311;
    }
    
    public void setAae311(Date aae311) {
        this.aae311 = aae311;
    }
    
    @Column(name="AAE011", length=64)
    public String getAae011() {
        return this.aae011;
    }
    
    public void setAae011(String aae011) {
        this.aae011 = aae011;
    }
    
    @Transient
	public Long getEntityId() {

		return getAaz524();
	}

	@Transient
	public Long getObjectId() {

		return getAaz524();
	}
}
