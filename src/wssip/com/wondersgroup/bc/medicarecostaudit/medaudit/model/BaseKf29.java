package com.wondersgroup.bc.medicarecostaudit.medaudit.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * 医疗服务机构重点项目情况分析
 * @author ltt
 * @version $Revision$ 2014-11-07
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseKf29 {

	private Long aaz347;//医疗机构重点项目情况分析ID
    private String aaa027;//统筹区编码
    private String ape032;//统计周期
    private String aae041;//起始年月
    private String aae042;//终止年月
    private String ake001;//社保三大目录统一编码
    private String aaz107;//医疗服务机构ID
    private String aka101;//医院等级
    private String akb022;//医疗服务机构类型
    private String akf001;//科室分类(未用)
    private String aka130;//医疗类别
    private String aae140;//险种类型
    private String akc021;//结算身份类别
    private String aka122;//疾病分类
    private String aka065;//收费项目等级
    private Integer akc161;//使用次数
    private Integer aab119;//使用人数
    private String ake106;//用量
    private Double akc264;//医疗费总额
    private String akb021;//医疗服务机构名称
    private Long ake098;//就诊人次
    private Long ake096;//就诊人数
    private String ake002;//社保三大目录名称
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ347", allocationSize = 1)
    @Column(name="AAZ347", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz347() {
        return this.aaz347;
    }
       
    public void setAaz347(Long aaz347) {
        this.aaz347 = aaz347;
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
    
    @Column(name="AKE001", length=20)
    public String getAke001() {
        return this.ake001;
    }
    
    public void setAke001(String ake001) {
        this.ake001 = ake001;
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
    
    @Column(name="AKF001", length=4)
    public String getAkf001() {
        return this.akf001;
    }
    
    public void setAkf001(String akf001) {
        this.akf001 = akf001;
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
    
    @Column(name="AKA065", length=1)
    public String getAka065() {
        return this.aka065;
    }
    
    public void setAka065(String aka065) {
        this.aka065 = aka065;
    }
    
    @Column(name="AKC161", precision=8, scale=0)
    public Integer getAkc161() {
        return this.akc161;
    }
    
    public void setAkc161(Integer akc161) {
        this.akc161 = akc161;
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
    
    @Column(name="AKB021", length=100)
    public String getAkb021() {
        return this.akb021;
    }
    
    public void setAkb021(String akb021) {
        this.akb021 = akb021;
    }
    
    @Column(name="AKE098", precision=16, scale=0)
    public Long getAke098() {
        return this.ake098;
    }
    
    public void setAke098(Long ake098) {
        this.ake098 = ake098;
    }
    
    @Column(name="AKE096", precision=16, scale=0)
    public Long getAke096() {
        return this.ake096;
    }
    
    public void setAke096(Long ake096) {
        this.ake096 = ake096;
    }
    
    @Column(name="AKE002", length=100)
    public String getAke002() {
        return this.ake002;
    }
    
    public void setAke002(String ake002) {
        this.ake002 = ake002;
    }

    @Transient
   	public Long getEntityId() {

   		return getAaz347();
   	}

   	@Transient
   	public Long getObjectId() {

   		return getAaz347();
   	}
    
}
