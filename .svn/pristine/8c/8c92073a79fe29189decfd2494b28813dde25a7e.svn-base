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
 * @author ltt
 * @version $Revision$ 2012-12-10
 * @author 稽核结论传达情况
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseAf34 {

	private Long aaz147;//稽核结论传达情况ID
    private Long aaz318;//稽核案件ID
    private String ape728;//处理决定
    private String apa708;//告知方式
    private String apa709;//被告知方类型
    private String ape724;//被告知方名称
    private Integer ape741;//告知日期
    private String aaz077;//被稽核对象ID
    private String aae011;//经办人
    private Date aae036;//经办时间
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ147", allocationSize = 1)  
    @Column(name="AAZ147", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz147() {
         return this.aaz147;
    }
       
    public void setAaz147(Long aaz147) {
         this.aaz147 = aaz147;
    }
    
    @Column(name="AAZ318", precision=16, scale=0)
    public Long getAaz318() {
        return this.aaz318;
    }
    
    public void setAaz318(Long aaz318) {
        this.aaz318 = aaz318;
    }
    
    @Column(name="APE728", length=100)
    public String getApe728() {
        return this.ape728;
    }
    
    public void setApe728(String ape728) {
        this.ape728 = ape728;
    }
    
    @Column(name="APA708", length=1)
    public String getApa708() {
        return this.apa708;
    }
    
    public void setApa708(String apa708) {
        this.apa708 = apa708;
    }
    
    @Column(name="APA709", length=1)
    public String getApa709() {
        return this.apa709;
    }
    
    public void setApa709(String apa709) {
        this.apa709 = apa709;
    }
    
    @Column(name="APE724", length=100)
    public String getApe724() {
        return this.ape724;
    }
    
    public void setApe724(String ape724) {
        this.ape724 = ape724;
    }
    
    @Column(name="APE741", precision=8, scale=0)
    public Integer getApe741() {
        return this.ape741;
    }
    
    public void setApe741(Integer ape741) {
        this.ape741 = ape741;
    }
    
    @Column(name="AAZ077", precision=20, scale=0)
    public String getAaz077() {
        return this.aaz077;
    }
    
    public void setAaz077(String aaz077) {
        this.aaz077 = aaz077;
    }
    
    @Column(name="AAE011", length=20)
    public String getAae011() {
        return this.aae011;
    }
    
    public void setAae011(String aae011) {
        this.aae011 = aae011;
    }
    
    @Column(name = "AAE036", length = 10)
    public Date getAae036() {
        return this.aae036;
    }
    
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    
    @Transient
	public Long getEntityId() {

		return getAaz147();
	}

	@Transient
	public Long getObjectId() {

		return getAaz147();
	}
}
