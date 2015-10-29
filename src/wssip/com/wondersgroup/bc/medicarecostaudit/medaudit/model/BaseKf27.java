package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * 医疗服务机构治疗情况分析
 * @author ltt
 * @version $Revision$ 2014-11-07
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKf27 {

	private Long aaz350;//医疗机构治疗情况分析ID
    private String aaa027;//统筹区编码
    private String ape032;//统计周期
    private String aae041;//起始年月
    private String aae042;//终止年月
    private String aaz107;//医疗服务机构ID
    private String aka101;//医院等级
    private String akb022;//医疗服务机构类型
    private String aka130;//医疗类别
    private String aae140;//险种类型
    private String akc021;//结算身份类别
    private String aka122;//疾病分类
    private String aka063;//医疗发票项目类别
    private String aka065;//收费项目等级
    private Long ake098;//人次
    private String ake003;//三大目录类别
    private Integer aab119;//使用人数
    private String ake106;//用量
    private Double akc264;//医疗费总额
    private Double akc253;//本次就诊政策范围外个人自费金额
    private Double akc254;//本次就诊政策范围内个人自付金额
    private Long ake094;//参保人数
    private String akb021;//医疗服务机构名称
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ350", allocationSize = 1)
    @Column(name="AAZ350", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz350() {
        return this.aaz350;
    }
       
    public void setAaz350(Long aaz350) {
        this.aaz350 = aaz350;
    }
    
    @Column(name="AAA027", length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="APE032", length=1)
    public String getApe032() {
        return this.ape032;
    }
    
    public void setApe032(String ape032) {
        this.ape032 = ape032;
    }
    
    @Column(name="AAE041", length=6)
    public String getAae041() {
        return this.aae041;
    }
    
    public void setAae041(String aae041) {
        this.aae041 = aae041;
    }
    
    @Column(name="AAE042", length=6)
    public String getAae042() {
        return this.aae042;
    }
    
    public void setAae042(String aae042) {
        this.aae042 = aae042;
    }
    
    @Column(name="AAZ107", length=20)
    public String getAaz107() {
        return this.aaz107;
    }
    
    public void setAaz107(String aaz107) {
        this.aaz107 = aaz107;
    }
    
    @Column(name="AKA101", length=2)
    public String getAka101() {
        return this.aka101;
    }
    
    public void setAka101(String aka101) {
        this.aka101 = aka101;
    }
    
    @Column(name="AKB022", length=1)
    public String getAkb022() {
        return this.akb022;
    }
    
    public void setAkb022(String akb022) {
        this.akb022 = akb022;
    }
    
    @Column(name="AKA130", length=2)
    public String getAka130() {
        return this.aka130;
    }
    
    public void setAka130(String aka130) {
        this.aka130 = aka130;
    }
    
    @Column(name="AAE140", length=3)
    public String getAae140() {
        return this.aae140;
    }
    
    public void setAae140(String aae140) {
        this.aae140 = aae140;
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
    
    @Column(name="AKA063", length=2)
    public String getAka063() {
        return this.aka063;
    }
    
    public void setAka063(String aka063) {
        this.aka063 = aka063;
    }
    
    @Column(name="AKA065", length=1)
    public String getAka065() {
        return this.aka065;
    }
    
    public void setAka065(String aka065) {
        this.aka065 = aka065;
    }
    
    @Column(name="AKE098", precision=16, scale=0)
    public Long getAke098() {
        return this.ake098;
    }
    
    public void setAke098(Long ake098) {
        this.ake098 = ake098;
    }
    
    @Column(name="AKE003", length=1)
    public String getAke003() {
        return this.ake003;
    }
    
    public void setAke003(String ake003) {
        this.ake003 = ake003;
    }
    
    @Column(name="AAB119", precision=8, scale=0)
    public Integer getAab119() {
        return this.aab119;
    }
    
    public void setAab119(Integer aab119) {
        this.aab119 = aab119;
    }
    
    @Column(name="AKE106", length=18)
    public String getAke106() {
        return this.ake106;
    }
    
    public void setAke106(String ake106) {
        this.ake106 = ake106;
    }
    
    @Column(name="AKC264", precision=16 , scale=2)
    public Double getAkc264() {
        return this.akc264;
    }
    
    public void setAkc264(Double akc264) {
        this.akc264 = akc264;
    }
    
    @Column(name="AKC253", precision=16 , scale=2)
    public Double getAkc253() {
        return this.akc253;
    }
    
    public void setAkc253(Double akc253) {
        this.akc253 = akc253;
    }
    
    @Column(name="AKC254", precision=16 , scale=2)
    public Double getAkc254() {
        return this.akc254;
    }
    
    public void setAkc254(Double akc254) {
        this.akc254 = akc254;
    }
    
    @Column(name="AKE094", precision=16, scale=0)
    public Long getAke094() {
        return this.ake094;
    }
    
    public void setAke094(Long ake094) {
        this.ake094 = ake094;
    }
    
    @Column(name="AKB021", length=100)
    public String getAkb021() {
        return this.akb021;
    }
    
    public void setAkb021(String akb021) {
        this.akb021 = akb021;
    }
    
    @Transient
   	public Long getEntityId() {

   		return getAaz350();
   	}

   	@Transient
   	public Long getObjectId() {

   		return getAaz350();
   	}
}
