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
 * 黑灰名单
 * @author rhx
 * @version $Revision$ 2012-12-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKe15 {
	
	private Long aaz359;//黑灰名单ID
	private String apa709;//对象类型
	private String aaz010;//对象ID
	private String apa005;//结论类型
	private String apa151;//监控等级
	private Integer aae030;//开始日期
	private Integer aae031;//终止日期
	private Long aaz318;//稽核案件ID
	private String ape726;//稽核结论
	private String aae011;//经办人
	private Date aae036;//经办时间
	private String ape035;//对象名称
   
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ359", allocationSize = 1) 
    @Column(name="AAZ359", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz359() {
        return this.aaz359;
    }
    
    public void setAaz359(Long aaz359) {
        this.aaz359 = aaz359;
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
    
    @Column(name="APA151", length=1)
    public String getApa151() {
        return this.apa151;
    }
    
    public void setApa151(String apa151) {
        this.apa151 = apa151;
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
    
    @Column(name="AAZ318", precision=16, scale=0)
    public Long getAaz318() {
        return this.aaz318;
    }
    
    public void setAaz318(Long aaz318) {
        this.aaz318 = aaz318;
    }
    
    @Column(name="APA005", length=2)
    public String getApa005() {
        return this.apa005;
    }
    
    public void setApa005(String apa005) {
        this.apa005 = apa005;
    }
    
    @Column(name="APE726", length=1000)
    public String getApe726() {
        return this.ape726;
    }
    
    public void setApe726(String ape726) {
        this.ape726 = ape726;
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
    
    @Column(name="APE035", length=100)
    public String getApe035() {
        return this.ape035;
    }
    
    public void setApe035(String ape035) {
        this.ape035 = ape035;
    }
    
    @Transient
	public Long getEntityId() {

		return getAaz359();
	}

	@Transient
	public Long getObjectId() {

		return getAaz359();
	}
}
