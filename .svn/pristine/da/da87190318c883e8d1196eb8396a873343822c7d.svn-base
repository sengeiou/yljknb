package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseAf52 {
	 private long abz418;
     private String abf041;
     private Long aaz318;
     private String adf077;
     private String abf079;
     private String aae011;
     private Date aae036;
     private String baz077;
     private String baz079;
     private Date baz097;
     
     @Id
     @Column(name = "ABZ418",  unique = true, nullable = false,precision = 16, scale = 0)
     public long getAbz418(){
          return this.abz418;
     }
     public void setAbz418(long abz418){
          this.abz418 = abz418;
     }

     @Column(name = "ABF041", length = 30)
     public String getAbf041(){
          return this.abf041;
     }
     public void setAbf041(String abf041){
          this.abf041 = abf041;
     }

     @Column(name = "AAZ318", precision = 16, scale = 0)
     public Long getAaz318(){
          return this.aaz318;
     }
     public void setAaz318(Long aaz318){
          this.aaz318 = aaz318;
     }

     @Column(name = "ADF077", length = 1000)
     public String getAdf077(){
          return this.adf077;
     }
     public void setAdf077(String adf077){
          this.adf077 = adf077;
     }

     @Column(name = "ABF079", length = 100)
     public String getAbf079(){
          return this.abf079;
     }
     public void setAbf079(String abf079){
          this.abf079 = abf079;
     }

     @Column(name = "AAE011", length = 20)
     public String getAae011(){
          return this.aae011;
     }
     public void setAae011(String aae011){
          this.aae011 = aae011;
     }

     @Temporal(TemporalType.TIMESTAMP)
     @Column(name = "AAE036", length = 7)
     public Date getAae036(){
          return this.aae036;
     }
     public void setAae036(Date aae036){
          this.aae036 = aae036;
     }

     @Column(name = "BAZ077", length = 20)
     public String getBaz077(){
          return this.baz077;
     }
     public void setBaz077(String baz077){
          this.baz077 = baz077;
     }

     @Column(name = "BAZ079", length = 20)
     public String getBaz079(){
          return this.baz079;
     }
     public void setBaz079(String baz079){
          this.baz079 = baz079;
     }

     @Temporal(TemporalType.TIMESTAMP)
     @Column(name = "BAZ097", length = 7)
     public Date getBaz097(){
          return this.baz097;
     }
     public void setBaz097(Date baz097){
          this.baz097 = baz097;
     }



}
