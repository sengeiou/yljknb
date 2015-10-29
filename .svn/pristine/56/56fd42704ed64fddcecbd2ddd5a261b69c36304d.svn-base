package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * @author rhx
 * @version $Revision$ 2014-6-26
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
//参保人员
@MappedSuperclass
public abstract class BaseAc01   {


     private String aac001;//人员编号
     private String aac002;//社会保障号码
     private String aac003;//姓名
     private String aac004;//性别
     private Integer aac006;//出生日期
     private String aac084;//离退休标识
     private String apa151;//监控等级
     private String aae005;//联系电话
     private Integer aae138;//入狱/失踪/死亡日期
     private String aac060;//生存状态
     private String aaz500;//社会保障卡卡号

   
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
	@SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAC001", allocationSize = 1)
    @Column(name="AAC001", unique=true, nullable=false, precision=20, scale=0)
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
    
    @Column(name="AAC006", precision=8, scale=0)
    public Integer getAac006() {
        return this.aac006;
    }
    
    public void setAac006(Integer aac006) {
        this.aac006 = aac006;
    }
    
    @Column(name="AAC084", length=1)
    public String getAac084() {
        return this.aac084;
    }
    
    public void setAac084(String aac084) {
        this.aac084 = aac084;
    }
    
    @Column(name="APA151", length=1)
    public String getApa151() {
        return this.apa151;
    }
    
    public void setApa151(String apa151) {
        this.apa151 = apa151;
    }
    
    @Column(name="AAE005", length=40)
    public String getAae005() {
        return this.aae005;
    }
    
    public void setAae005(String aae005) {
        this.aae005 = aae005;
    }
    
    @Column(name="AAE138", precision=8, scale=0)
    public Integer getAae138() {
        return this.aae138;
    }
    
    public void setAae138(Integer aae138) {
        this.aae138 = aae138;
    }
    
    @Column(name="AAC060", length=1)
    public String getAac060() {
        return this.aac060;
    }
    
    public void setAac060(String aac060) {
        this.aac060 = aac060;
    }
    
    @Column(name="AAZ500", length=9)
    public String getAaz500() {
        return this.aaz500;
    }
    
    public void setAaz500(String aaz500) {
        this.aaz500 = aaz500;
    }
	
	@Transient
	public String getEntityId() {

		return getAac001();
	}

	@Transient
	public String getObjectId() {

		return getAac001();
	}
}


