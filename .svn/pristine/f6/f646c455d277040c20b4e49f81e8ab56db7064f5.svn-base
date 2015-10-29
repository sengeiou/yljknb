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
 * @author ltt
 * @version $Revision$ 2014-6-26
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
//稽核调查记录事件
@MappedSuperclass
public abstract class BaseAf30 {

	private Long aaz148;//稽核调查记录事件ID
    private Long aaz318;//稽核案件ID
    private String aaz077;//被稽核对象ID
    private String aaz010;//被调查当事人ID
    private String ape128;//被调查当事人名称
    private String apa706;//调查取证方式：现场稽核、走访、暗访、约谈、其他
    private String ape718;//调查人
    private Integer ape722;//调查日期
    private String ape721;//调查结果
    private String apa702;//是否发单通知
    private String ape715;//要求准备材料
    private String ape023;//材料说明
    private String aae011;//经办人
    private Date aae036;//经办时间
    private String aae016;//复核标志
    private String aae014;//复核人
    private Date aae015;//复核时间
    private String apa709;//被调查当事人类型

  
   @Id 
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
   @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ148", allocationSize = 1)
   @Column(name="AAZ148", unique=true, nullable=false, precision=16, scale=0)
   public Long getAaz148() {
       return this.aaz148;
   }
   
   public void setAaz148(Long aaz148) {
       this.aaz148 = aaz148;
   }
   
   @Column(name="AAZ318", nullable=false, precision=16, scale=0)
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
   
   @Column(name="AAZ010", precision=20, scale=0)
   public String getAaz010() {
       return this.aaz010;
   }
   
   public void setAaz010(String aaz010) {
       this.aaz010 = aaz010;
   }
   
   @Column(name="APE128", length=100)
   public String getApe128() {
       return this.ape128;
   }
   
   public void setApe128(String ape128) {
       this.ape128 = ape128;
   }
   
   @Column(name="APA706", length=1)
   public String getApa706() {
       return this.apa706;
   }
   
   public void setApa706(String apa706) {
       this.apa706 = apa706;
   }
   
   @Column(name="APE718", length=50)
   public String getApe718() {
       return this.ape718;
   }
   
   public void setApe718(String ape718) {
       this.ape718 = ape718;
   }
   
   @Column(name="APE722", precision=8, scale=0)
   public Integer getApe722() {
       return this.ape722;
   }
   
   public void setApe722(Integer ape722) {
       this.ape722 = ape722;
   }
   
   @Column(name="APE721", length=1000)
   public String getApe721() {
       return this.ape721;
   }
   
   public void setApe721(String ape721) {
       this.ape721 = ape721;
   }
   
   @Column(name="APA702", length=1)
   public String getApa702() {
       return this.apa702;
   }
   
   public void setApa702(String apa702) {
       this.apa702 = apa702;
   }
   
   @Column(name="APE715", length=1000)
   public String getApe715() {
       return this.ape715;
   }
   
   public void setApe715(String ape715) {
       this.ape715 = ape715;
   }
   
   @Column(name="APE023", length=1000)
   public String getApe023() {
       return this.ape023;
   }
   
   public void setApe023(String ape023) {
       this.ape023 = ape023;
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
   
   @Column(name="AAE016", length=1)
   public String getAae016() {
       return this.aae016;
   }
   
   public void setAae016(String aae016) {
       this.aae016 = aae016;
   }
   
   @Column(name="AAE014", length=20)
   public String getAae014() {
       return this.aae014;
   }
   
   public void setAae014(String aae014) {
       this.aae014 = aae014;
   }
   @Temporal(TemporalType.DATE)
   @Column(name="AAE015", length=7)
   public Date getAae015() {
       return this.aae015;
   }
   
   public void setAae015(Date aae015) {
       this.aae015 = aae015;
   }
   
   @Column(name="APA709", length=1)
   public String getApa709() {
       return this.apa709;
   }
   
   public void setApa709(String apa709) {
       this.apa709 = apa709;
   }
   
   @Transient
   public Long getEntityId() {

	   return getAaz148();
   }

   @Transient
   public Long getObjectId() {

	   return getAaz148();
   }
}
