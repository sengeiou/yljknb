package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 结案（告知）抄报关联表
 * @author Administrator
 *
 */
@MappedSuperclass
public abstract class BaseAf33 {
	 private long aaz309;// 结案（告知）抄报关联表主键
     private Long aaz318;//案件标识主键
     private Long aaz049;//案件审理主键
     private String abf040;//抄报部门
     
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE")
     @SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_AAZ309",allocationSize=1)
     @Column(name = "AAZ309",  unique = true, nullable = false,precision = 16, scale = 0)
     public long getAaz309(){
          return this.aaz309;
     }
     public void setAaz309(long aaz309){
          this.aaz309 = aaz309;
     }

     @Column(name = "AAZ318", precision = 16, scale = 0)
     public Long getAaz318(){
          return this.aaz318;
     }
     public void setAaz318(Long aaz318){
          this.aaz318 = aaz318;
     }

     @Column(name = "AAZ049", precision = 16, scale = 0)
     public Long getAaz049(){
          return this.aaz049;
     }
     public void setAaz049(Long aaz049){
          this.aaz049 = aaz049;
     }

     @Column(name = "ABF040", length = 50)
     public String getAbf040(){
          return this.abf040;
     }
     public void setAbf040(String abf040){
          this.abf040 = abf040;
     }

     @Override
     public String toString() {
          return ToStringBuilder.reflectionToString(this);
     }

}
