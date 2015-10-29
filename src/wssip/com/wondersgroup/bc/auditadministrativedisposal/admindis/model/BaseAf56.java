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
 * @author 司法处理执行结果
 * @since 1.0
 */
@MappedSuperclass
public class BaseAf56 {
	
	private Long aaz332;//司法处理执行结果ID
    private String aaa027;//统筹区编码
    private Long aaz318;//稽核案件ID
    private String aaz077;//被稽核对象ID
    private String apa709;//被处理对象类型
    private String aaz010;//被处理对象ID
    private String ape035;//被处理对象名称
    private Long ape110;//立案件数
    private Long ape129;//其中：团伙案立案件数
    private Long ape115;//结案件数
    private Long ape130;//其中：团伙案结案件数
    private Double ape755;//追回金额
    private Double ape132;//赔偿金额
    private Long ape131;//刑事判决人次数
    private String ape033;//处理结果说明
    private Integer aae218;//办理完成日期
    private String aae011;//经办人
    private Date aae036;//经办时间
    private Integer aae149;//年月
    private Double apf003;//涉案金额
    private Double abb122;//罚没金额
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ332", allocationSize = 1)
    @Column(name="AAZ332", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz332() {
        return this.aaz332;
    }
       
    public void setAaz332(Long aaz332) {
        this.aaz332 = aaz332;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ318", precision=16, scale=0)
    public Long getAaz318() {
        return this.aaz318;
    }
    
    public void setAaz318(Long aaz318) {
        this.aaz318 = aaz318;
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
    
    @Column(name="APE110", precision=16, scale=0)
    public Long getApe110() {
        return this.ape110;
    }
    
    public void setApe110(Long ape110) {
        this.ape110 = ape110;
    }
    
    @Column(name="APE129", precision=16, scale=0)
    public Long getApe129() {
        return this.ape129;
    }
    
    public void setApe129(Long ape129) {
        this.ape129 = ape129;
    }
    
    @Column(name="APE115", precision=16, scale=0)
    public Long getApe115() {
        return this.ape115;
    }
    
    public void setApe115(Long ape115) {
        this.ape115 = ape115;
    }
    
    @Column(name="APE130", precision=16, scale=0)
    public Long getApe130() {
        return this.ape130;
    }
    
    public void setApe130(Long ape130) {
        this.ape130 = ape130;
    }
    
    @Column(name="APE755", precision=16,scale=2)
    public Double getApe755() {
        return this.ape755;
    }
    
    public void setApe755(Double ape755) {
        this.ape755 = ape755;
    }
    
    @Column(name="APE132", precision=16,scale=2)
    public Double getApe132() {
        return this.ape132;
    }
    
    public void setApe132(Double ape132) {
        this.ape132 = ape132;
    }
    
    @Column(name="APE131", precision=16, scale=0)
    public Long getApe131() {
        return this.ape131;
    }
    
    public void setApe131(Long ape131) {
        this.ape131 = ape131;
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
    
    @Column(name = "AAE036", length = 10)
    public Date getAae036() {
        return this.aae036;
    }
    
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    
    @Column(name="AAE149", precision=6, scale=0)
    public Integer getAae149() {
        return this.aae149;
    }
    
    public void setAae149(Integer aae149) {
        this.aae149 = aae149;
    }
    
    @Column(name="APF003", precision=16,scale=2)
    public Double getApf003() {
        return this.apf003;
    }
    
    public void setApf003(Double apf003) {
        this.apf003 = apf003;
    }
    
    @Column(name="ABB122", precision=16,scale=2)
    public Double getAbb122() {
        return this.abb122;
    }
    
    public void setAbb122(Double abb122) {
        this.abb122 = abb122;
    }

    @Transient
	public Long getEntityId() {

		return getAaz332();
	}

	@Transient
	public Long getObjectId() {

		return getAaz332();
	}
}
