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
 * 延期审批表
 * @author Administrator
 *
 */
@MappedSuperclass
public abstract class BaseAf36 {
	 private Long aaz069;
     private Long aaz318;
     private String aaz188;
     private String abf039;
     private String aae011;
     private Date aae036;
     private String apa703;
     private Integer apa047;
     private Integer apa048;
     private String ape098;
     private String apf078;
     private String aae189;
     private String aae103;//延期审批
     
     @Id 
     @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
     @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ069", allocationSize = 1)
     @Column(name="AAZ069", unique=true, nullable=false, precision=16, scale=0)
     public Long getAaz069(){
          return this.aaz069;
     }
     public void setAaz069(Long aaz069){
          this.aaz069 = aaz069;
     }

     @Column(name = "AAZ318", precision = 16, scale = 0)
     public Long getAaz318(){
          return this.aaz318;
     }
     public void setAaz318(Long aaz318){
          this.aaz318 = aaz318;
     }

     @Column(name = "AAZ188", length = 20)
     public String getAaz188(){
          return this.aaz188;
     }
     public void setAaz188(String aaz188){
          this.aaz188 = aaz188;
     }

     @Column(name = "ABF039", length = 50)
     public String getAbf039(){
          return this.abf039;
     }
     public void setAbf039(String abf039){
          this.abf039 = abf039;
     }

     @Column(name = "AAE011", length = 50)
     public String getAae011(){
          return this.aae011;
     }
     public void setAae011(String aae011){
          this.aae011 = aae011;
     }


 	@Temporal(TemporalType.TIMESTAMP)
 	@Column(name = "AAE036", length = 7)
     public Date getAae036() {
         return this.aae036;
     }
     
     public void setAae036(Date aae036) {
         this.aae036 = aae036;
     }

     @Column(name = "APA703", length = 3)
     public String getApa703(){
          return this.apa703;
     }
     public void setApa703(String apa703){
          this.apa703 = apa703;
     }

     @Column(name="APA047", precision=8, scale=0)
     public Integer getApa047(){
          return this.apa047;
     }
     public void setApa047(Integer apa047){
          this.apa047 = apa047;
     }

     @Column(name="APA048", precision=8, scale=0)
     public Integer getApa048(){
          return this.apa048;
     }
     public void setApa048(Integer apa048){
          this.apa048 = apa048;
     }

     @Column(name = "APE098", length = 1000)
     public String getApe098(){
          return this.ape098;
     }
     public void setApe098(String ape098){
          this.ape098 = ape098;
     }

     @Column(name = "APF078", length = 1000)
     public String getApf078(){
          return this.apf078;
     }
     public void setApf078(String apf078){
          this.apf078 = apf078;
     }

     @Column(name = "AAE189", length = 1000)
     public String getAae189(){
          return this.aae189;
     }
     public void setAae189(String aae189){
          this.aae189 = aae189;
     }
     
     @Column(name = "AAE103", length = 1)
     public String getAae103(){
          return this.aae103;
     }
     public void setAae103(String aae103){
          this.aae103 = aae103;
     }

     @Override
     public String toString() {
          return ToStringBuilder.reflectionToString(this);
     }


}
