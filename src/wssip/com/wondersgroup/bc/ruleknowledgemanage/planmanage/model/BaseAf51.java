package com.wondersgroup.bc.ruleknowledgemanage.planmanage.model;


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
 * @author dumingqiang
 * @version $Revision$ 2014-7-10
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf51 {


     private Long aaz100;//实现方案ID
     private String aaa201;//方案名称
     private String aaa143;//方案分类（增量实现、监控规则、分析规则）
     private String aaa026;//方案实现类型（SQL、存储过程、JAVA）
     private String aaa133;//方案描述
     private String aae011;//经办人
     private Date aae036;//经办时间
     private String aae100;//当前有效标志

    
   
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ100", allocationSize = 1)
    @Column(name="AAZ100", unique=true, nullable=false, precision=6, scale=0)
    public Long getAaz100() {
        return this.aaz100;
    }
    
    public void setAaz100(Long aaz100) {
        this.aaz100 = aaz100;
    }
    
    @Column(name="AAA201", length=100)
    public String getAaa201() {
        return this.aaa201;
    }
    
    public void setAaa201(String aaa201) {
        this.aaa201 = aaa201;
    }
    
    @Column(name="AAA143", length=2)
    public String getAaa143() {
        return this.aaa143;
    }
    
    public void setAaa143(String aaa143) {
        this.aaa143 = aaa143;
    }
    
    @Column(name="AAA026", length=3)
    public String getAaa026() {
        return this.aaa026;
    }
    
    public void setAaa026(String aaa026) {
        this.aaa026 = aaa026;
    }
    
    @Column(name="AAA133", length=500)
    public String getAaa133() {
        return this.aaa133;
    }
    
    public void setAaa133(String aaa133) {
        this.aaa133 = aaa133;
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
    
    @Column(name="AAE100", length=1)
    public String getAae100() {
        return this.aae100;
    }
    
    public void setAae100(String aae100) {
        this.aae100 = aae100;
    }
    
    @Transient
	public Long getEntityId() {

		return getAaz100();
	}

	@Transient
	public Long getObjectId() {

		return getAaz100();
	}

}


