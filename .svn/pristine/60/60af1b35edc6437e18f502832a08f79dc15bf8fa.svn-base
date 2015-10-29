package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author ltt
 * @version $Revision$ 2014-6-26
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
//参保信息
@MappedSuperclass
public abstract class BaseAc02 {

     private String aaa027;//统筹区编码
     private String aac001;//人员编号
     private String aac002;//社会保障号码
     private String aae140;//险种类型
     private Integer aac049;//参保年月
     private String aac031;//个人缴费状态
     private String aab001;//参保单位编号
     private String aab004;//参保单位名称
     private String aae004;//参保单位联系人姓名
     private String aae005; //参保单位联系人电话

    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
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

    @Column(name="AAE140", length=3)
    public String getAae140() {
        return this.aae140;
    }
    
    public void setAae140(String aae140) {
        this.aae140 = aae140;
    }

    @Column(name="AAC049", precision=6, scale=0)
    public Integer getAac049() {
        return this.aac049;
    }
    
    public void setAac049(Integer aac049) {
        this.aac049 = aac049;
    }

    @Column(name="AAC031", length=1)
    public String getAac031() {
        return this.aac031;
    }
    
    public void setAac031(String aac031) {
        this.aac031 = aac031;
    }

    @Column(name="AAB001", length=20)
    public String getAab001() {
        return this.aab001;
    }
    
    public void setAab001(String aab001) {
        this.aab001 = aab001;
    }

    @Column(name="AAB004", length=100)
    public String getAab004() {
        return this.aab004;
    }
    
    public void setAab004(String aab004) {
        this.aab004 = aab004;
    }

    @Column(name="AAE004", length=50)
    public String getAae004() {
        return this.aae004;
    }
    
    public void setAae004(String aae004) {
        this.aae004 = aae004;
    }

    @Column(name="AAE005", length=40)
    public String getAae005() {
        return this.aae005;
    }
    
    public void setAae005(String aae005) {
        this.aae005 = aae005;
    }

    /*@Transient
	public Long getEntityId() {

		return null;
	}

	@Transient
	public Long getObjectId() {

		return null;
	}*/
}


