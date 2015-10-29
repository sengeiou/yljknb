package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf58 {

	 private Long aaz323;//行政处理处罚执行结果ID
     private String aaa027;//统筹区编码
     private Long aaz322;//行政处理处罚记录ID
     private String aaz077;//被稽核对象ID
     private String apa709;//被处理对象类型
     private String aaz010;//被处理对象ID
     private String ape035;//被处理对象名称
     private Long ape025;//处理处罚个人人次数
     private Long ape009;//其中：警告人次数（家次数）
     private Long ape034;//责令整改家次数
     private Double ape755;//追回金额
     private Double abb122;//罚款金额
     private String ape033;//处理结果说明
     private Integer aae218;//办理完成日期
     private String aae011;//经办人
     private Date aae036;//经办时间
     private Long aaz318;//稽核案件ID

   
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ323", allocationSize = 1)
    @Column(name="AAZ323", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz323() {
        return this.aaz323;
    }
    
    public void setAaz323(Long aaz323) {
        this.aaz323 = aaz323;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ322", precision=16, scale=0)
    public Long getAaz322() {
        return this.aaz322;
    }
    
    public void setAaz322(Long aaz322) {
        this.aaz322 = aaz322;
    }
    
    @Column(name="AAZ077", precision=20, scale=0)
    public String getAaz077() {
        return this.aaz077;
    }
    
    public void setAaz077(String aaz077) {
        this.aaz077 = aaz077;
    }
    
    @Column(name="APA709", length=1)
    public String getApa709() {
        return this.apa709;
    }
    
    public void setApa709(String apa709) {
        this.apa709 = apa709;
    }
    
    @Column(name="AAZ010", precision=20, scale=0)
    public String getAaz010() {
        return this.aaz010;
    }
    
    public void setAaz010(String aaz010) {
        this.aaz010 = aaz010;
    }
    
    @Column(name="APE035", length=100)
    public String getApe035() {
        return this.ape035;
    }
    
    public void setApe035(String ape035) {
        this.ape035 = ape035;
    }
    
    @Column(name="APE025", precision=16, scale=0)
    public Long getApe025() {
        return this.ape025;
    }
    
    public void setApe025(Long ape025) {
        this.ape025 = ape025;
    }
    
    @Column(name="APE009", precision=16, scale=0)
    public Long getApe009() {
        return this.ape009;
    }
    
    public void setApe009(Long ape009) {
        this.ape009 = ape009;
    }
    
    @Column(name="APE034", precision=16, scale=0)
    public Long getApe034() {
        return this.ape034;
    }
    
    public void setApe034(Long ape034) {
        this.ape034 = ape034;
    }
    
    @Column(name="APE755", precision=16)
    public Double getApe755() {
        return this.ape755;
    }
    
    public void setApe755(Double ape755) {
        this.ape755 = ape755;
    }
    
    @Column(name="ABB122", precision=16)
    public Double getAbb122() {
        return this.abb122;
    }
    
    public void setAbb122(Double abb122) {
        this.abb122 = abb122;
    }
    
    @Column(name="APE033", length=1000)
    public String getApe033() {
        return this.ape033;
    }
    
    public void setApe033(String ape033) {
        this.ape033 = ape033;
    }
    
    @Column(name="AAE218", precision=8, scale=0)
    public Integer getAae218() {
        return this.aae218;
    }
    
    public void setAae218(Integer aae218) {
        this.aae218 = aae218;
    }
    
    @Column(name="AAE011", length=20)
    public String getAae011() {
        return this.aae011;
    }
    
    public void setAae011(String aae011) {
        this.aae011 = aae011;
    }
    
    @Column(name="AAE036", length=7)
    public Date getAae036() {
        return this.aae036;
    }
    
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    
    @Column(name="AAZ318", precision=16, scale=0)
    public Long getAaz318() {
        return this.aaz318;
    }
    
    public void setAaz318(Long aaz318) {
        this.aaz318 = aaz318;
    }
    
    @Transient
	public Long getEntityId() {

		return getAaz322();
	}

	@Transient
	public Long getObjectId() {

		return getAaz322();
	}
}


