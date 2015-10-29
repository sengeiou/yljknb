package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @ClassName: BaseKa54 
 * @Description: 疑点处方明细场景信息 
 * @author chenlin
 * @date 2014-7-31 上午09:50:57 
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class BaseKa54  implements java.io.Serializable {


     private Long aaz356;
     private Long aaz328;
     private String aaz213;
     private Integer kcsl;
     private Double kcje;
     private String kcyy;

    public BaseKa54() {
    }

	
    public BaseKa54(Long aaz356) {
        this.aaz356 = aaz356;
    }
   
     @Id 
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
 @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ356", allocationSize = 1)
    
    @Column(name="AAZ356", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz356() {
        return this.aaz356;
    }
    
    public void setAaz356(Long aaz356) {
        this.aaz356 = aaz356;
    }
    
    @Column(name="AAZ328", precision=16, scale=0)
    public Long getAaz328() {
        return this.aaz328;
    }
    
    public void setAaz328(Long aaz328) {
        this.aaz328 = aaz328;
    }
    
    @Column(name="AAZ213", length=26)
    public String getAaz213() {
        return this.aaz213;
    }
    
    public void setAaz213(String aaz213) {
        this.aaz213 = aaz213;
    }
    
    @Column(name="KCSL", precision=8, scale=0)
    public Integer getKcsl() {
        return this.kcsl;
    }
    
    public void setKcsl(Integer kcsl) {
        this.kcsl = kcsl;
    }
    
    @Column(name="KCJE", precision=8)
    public Double getKcje() {
        return this.kcje;
    }
    
    public void setKcje(Double kcje) {
        this.kcje = kcje;
    }
    
    @Column(name="KCYY", length=200)
    public String getKcyy() {
        return this.kcyy;
    }
    
    public void setKcyy(String kcyy) {
        this.kcyy = kcyy;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}


