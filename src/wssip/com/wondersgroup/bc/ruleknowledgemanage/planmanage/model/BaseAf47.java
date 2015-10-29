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
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author dumingqiang
 * @version $Revision$ 2014-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public  abstract class BaseAf47 {


     private Long aaz325;//计划ID
     private String aaa201;//计划名称
     private String aaa170;//执行表达式
     private Date aae310;//开始时间
     private Long aae421;//间隔
     private Date aae422;//下一次执行时间
     private String aaa152;//参数列表
     private String aae011;//经办人
     private Date aae036;//经办时间
     private String aae100;//当前有效标志

    public BaseAf47() {
    }

	
    public BaseAf47(Long aaz325) {
        this.aaz325 = aaz325;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ325", allocationSize = 1)
    
    @Column(name="AAZ325", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz325() {
        return this.aaz325;
    }
    
    public void setAaz325(Long aaz325) {
        this.aaz325 = aaz325;
    }
    
    @Column(name="AAA201", length=100)
    public String getAaa201() {
        return this.aaa201;
    }
    
    public void setAaa201(String aaa201) {
        this.aaa201 = aaa201;
    }
    
    @Column(name="AAA170", length=20)
    public String getAaa170() {
        return this.aaa170;
    }
    
    public void setAaa170(String aaa170) {
        this.aaa170 = aaa170;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE310", length=7)
    public Date getAae310() {
        return this.aae310;
    }
    
    public void setAae310(Date aae310) {
        this.aae310 = aae310;
    }
    
    @Column(name="AAE421", precision=16, scale=0)
    public Long getAae421() {
        return this.aae421;
    }
    
    public void setAae421(Long aae421) {
        this.aae421 = aae421;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="AAE422", length=7)
    public Date getAae422() {
        return this.aae422;
    }
    
    public void setAae422(Date aae422) {
        this.aae422 = aae422;
    }
    
    @Column(name="AAA152", length=1000)
    public String getAaa152() {
        return this.aaa152;
    }
    
    public void setAaa152(String aaa152) {
        this.aaa152 = aaa152;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


