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

import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 社区资质处罚信息表
 * @author Administrator
 *
 */
@MappedSuperclass
public abstract class BaseKd40 {
	 private Long baz103;//undefined
     private Long aaz318;//undefined
     private String abz001;//undefined
     private String akb020;//undefined
     private String ape712;//undefined
     private Integer aae030;//undefined
     private Integer aae031;//undefined
     private String cae251;//undefined
     private String cae249;//undefined
     private String aae014;//undefined
     private String cae250;//undefined
     private Date aae215;//undefined
     private Date cke024;//undefined
     private String aae148;//undefined
     private String aae016;//undefined
     private Long ckz143;//undefined
     private String ape713;//undefined
     private String cke391;//undefined
     private String cke418;//undefined
     
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
     @SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_BAZ103",allocationSize=1)
     @Column(name = "BAZ103",  unique = true, nullable = false,precision = 16, scale = 0)
     public Long getBaz103(){
          return this.baz103;
     }
     public void setBaz103(Long baz103){
          this.baz103 = baz103;
     }

     @Column(name = "AAZ318", precision = 16, scale = 0)
     public Long getAaz318(){
          return this.aaz318;
     }
     public void setAaz318(Long aaz318){
          this.aaz318 = aaz318;
     }

     @Column(name="ABZ001", nullable=false, length=20)
     public String getAbz001() {
         return this.abz001;
     }
     
     public void setAbz001(String abz001) {
         this.abz001 = abz001;
     }

     @Column(name="AKB020", length=20)
	    public String getAkb020() {
	        return this.akb020;
	    }
	    
	    public void setAkb020(String akb020) {
	        this.akb020 = akb020;
	    }

     @Column(name = "APE712", length = 1000)
     public String getApe712(){
          return this.ape712;
     }
     public void setApe712(String ape712){
          this.ape712 = ape712;
     }

     @Column(name = "AAE030", precision = 8, scale = 0)
     public Integer getAae030(){
          return this.aae030;
     }
     public void setAae030(Integer aae030){
          this.aae030 = aae030;
     }

     @Column(name = "AAE031", precision = 8, scale = 0)
     public Integer getAae031(){
          return this.aae031;
     }
     public void setAae031(Integer aae031){
          this.aae031 = aae031;
     }

     @Column(name = "CAE251", length = 10)
     public String getCae251(){
          return this.cae251;
     }
     public void setCae251(String cae251){
          this.cae251 = cae251;
     }

     @Column(name = "CAE249", length = 50)
     public String getCae249(){
          return this.cae249;
     }
     public void setCae249(String cae249){
          this.cae249 = cae249;
     }

     @Column(name = "AAE014", length = 10)
     public String getAae014(){
          return this.aae014;
     }
     public void setAae014(String aae014){
          this.aae014 = aae014;
     }

     @Column(name = "CAE250", length = 50)
     public String getCae250(){
          return this.cae250;
     }
     public void setCae250(String cae250){
          this.cae250 = cae250;
     }

     @Temporal(TemporalType.TIMESTAMP)
     @Column(name = "AAE215", length = 7)
     public Date getAae215(){
          return this.aae215;
     }
     public void setAae215(Date aae215){
          this.aae215 = aae215;
     }

     @Temporal(TemporalType.DATE)
     @Column(name = "CKE024", length = 7)
     public Date getCke024(){
          return this.cke024;
     }
     public void setCke024(Date cke024){
          this.cke024 = cke024;
     }

     @Column(name = "AAE148", length = 1)
     public String getAae148(){
          return this.aae148;
     }
     public void setAae148(String aae148){
          this.aae148 = aae148;
     }

     @Column(name = "AAE016", length = 1)
     public String getAae016(){
          return this.aae016;
     }
     public void setAae016(String aae016){
          this.aae016 = aae016;
     }

     @Column(name = "CKZ143", precision = 16, scale = 0)
     public Long getCkz143(){
          return this.ckz143;
     }
     public void setCkz143(Long ckz143){
          this.ckz143 = ckz143;
     }

     @Column(name = "APE713", length = 1000)
     public String getApe713(){
          return this.ape713;
     }
     public void setApe713(String ape713){
          this.ape713 = ape713;
     }

     @Column(name = "CKE391", length = 2)
     public String getCke391(){
          return this.cke391;
     }
     public void setCke391(String cke391){
          this.cke391 = cke391;
     }

     @Column(name = "CKE418", length = 2)
     public String getCke418(){
          return this.cke418;
     }
     public void setCke418(String cke418){
          this.cke418 = cke418;
     }

     @Override
     public String toString() {
          return ToStringBuilder.reflectionToString(this);
     }


}
