package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseAf61 {
	 private long abz618;
     private String aaa027;
     private Long aaz318;
     private String aaz077;
     private String apf094;
     private String abe010;
     private String abb006;
     private String ade054;
     private String apa701;
     private String ape714;
     private String aae306;
     private String aae305;
     private Integer ape711;
     private String aac302;
     private String aae061;
     private String ape726;
     private String aae011;
     private Date aae036;
     private String aae013;
     private String adf004;
     private String adf005;
     private Date adf006;
     private String adf007;
     private String adf008;
     private Date adf009;
     
     @Id
     @Column(name = "ABZ618",  unique = true, nullable = false,precision = 16, scale = 0)
     public long getAbz618(){
          return this.abz618;
     }
     public void setAbz618(long abz618){
          this.abz618 = abz618;
     }

     @Column(name = "AAA027", length = 6)
     public String getAaa027(){
          return this.aaa027;
     }
     public void setAaa027(String aaa027){
          this.aaa027 = aaa027;
     }

     @Column(name = "AAZ318", precision = 16, scale = 0)
     public Long getAaz318(){
          return this.aaz318;
     }
     public void setAaz318(Long aaz318){
          this.aaz318 = aaz318;
     }

     @Column(name = "AAZ077", length = 20)
     public String getAaz077(){
          return this.aaz077;
     }
     public void setAaz077(String aaz077){
          this.aaz077 = aaz077;
     }

     @Column(name = "APF094", length = 4000)
     public String getApf094(){
          return this.apf094;
     }
     public void setApf094(String apf094){
          this.apf094 = apf094;
     }

     @Column(name = "ABE010", length = 20)
     public String getAbe010(){
          return this.abe010;
     }
     public void setAbe010(String abe010){
          this.abe010 = abe010;
     }

     @Column(name = "ABB006", length = 2)
     public String getAbb006(){
          return this.abb006;
     }
     public void setAbb006(String abb006){
          this.abb006 = abb006;
     }

     @Column(name = "ADE054", length = 500)
     public String getAde054(){
          return this.ade054;
     }
     public void setAde054(String ade054){
          this.ade054 = ade054;
     }

     @Column(name = "APA701", length = 300)
     public String getApa701(){
          return this.apa701;
     }
     public void setApa701(String apa701){
          this.apa701 = apa701;
     }

     @Column(name = "APE714", length = 100)
     public String getApe714(){
          return this.ape714;
     }
     public void setApe714(String ape714){
          this.ape714 = ape714;
     }

     @Column(name = "AAE306", length = 150)
     public String getAae306(){
          return this.aae306;
     }
     public void setAae306(String aae306){
          this.aae306 = aae306;
     }

     @Column(name = "AAE305", length = 40)
     public String getAae305(){
          return this.aae305;
     }
     public void setAae305(String aae305){
          this.aae305 = aae305;
     }

     @Column(name = "APE711", precision = 8, scale = 0)
     public Integer getApe711(){
          return this.ape711;
     }
     public void setApe711(Integer ape711){
          this.ape711 = ape711;
     }

     @Column(name = "AAC302", length = 20)
     public String getAac302(){
          return this.aac302;
     }
     public void setAac302(String aac302){
          this.aac302 = aac302;
     }

     @Column(name = "AAE061", length = 40)
     public String getAae061(){
          return this.aae061;
     }
     public void setAae061(String aae061){
          this.aae061 = aae061;
     }

     @Column(name = "APE726", length = 1000)
     public String getApe726(){
          return this.ape726;
     }
     public void setApe726(String ape726){
          this.ape726 = ape726;
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

     @Column(name = "AAE013", length = 200)
     public String getAae013(){
          return this.aae013;
     }
     public void setAae013(String aae013){
          this.aae013 = aae013;
     }

     @Column(name = "ADF004", length = 200)
     public String getAdf004(){
          return this.adf004;
     }
     public void setAdf004(String adf004){
          this.adf004 = adf004;
     }

     @Column(name = "ADF005", length = 20)
     public String getAdf005(){
          return this.adf005;
     }
     public void setAdf005(String adf005){
          this.adf005 = adf005;
     }

     @Temporal(TemporalType.TIMESTAMP)
     @Column(name = "ADF006", length = 7)
     public Date getAdf006(){
          return this.adf006;
     }
     public void setAdf006(Date adf006){
          this.adf006 = adf006;
     }

     @Column(name = "ADF007", length = 200)
     public String getAdf007(){
          return this.adf007;
     }
     public void setAdf007(String adf007){
          this.adf007 = adf007;
     }

     @Column(name = "ADF008", length = 20)
     public String getAdf008(){
          return this.adf008;
     }
     public void setAdf008(String adf008){
          this.adf008 = adf008;
     }

     @Temporal(TemporalType.TIMESTAMP)
     @Column(name = "ADF009", length = 7)
     public Date getAdf009(){
          return this.adf009;
     }
     public void setAdf009(Date adf009){
          this.adf009 = adf009;
     }


}
