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
 * @author ltt
 * @version $Revision$ 2012-12-10
 * @author 经办处理处罚执行结果
 * @since 1.0
 */
@MappedSuperclass
public class BaseAf35 {

	private Long aaz049;
    private String aaa027;
    private Long aaz318;
    private String abz001;
    private String aaz188;
    private String ape098;
    private String apf078;
    private String ape728;
    private String aae189;
    private String abf039;
    private String aae011;
    private Date aae036;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
    @SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_AAZ049", allocationSize = 1)
    @Column(name="AAZ049", unique=true, nullable=false, precision=16, scale=0)
    public Long getAaz049() {
        return this.aaz049;
    }
    
    public void setAaz049(Long aaz049) {
        this.aaz049 = aaz049;
    }
    
    @Column(name="AAA027", nullable=false, length=6)
    public String getAaa027() {
        return this.aaa027;
    }
    
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    
    @Column(name="AAZ318", nullable=false, precision=16, scale=0)
    public Long getAaz318() {
        return this.aaz318;
    }
    
    public void setAaz318(Long aaz318) {
        this.aaz318 = aaz318;
    }
    
    @Column(name="ABZ001", nullable=false, length=20)
    public String getAbz001() {
        return this.abz001;
    }
    
    public void setAbz001(String abz001) {
        this.abz001 = abz001;
    }
    
    @Column(name="AAZ188", length=20)
    public String getAaz188() {
        return this.aaz188;
    }
    
    public void setAaz188(String aaz188) {
        this.aaz188 = aaz188;
    }
    
    @Column(name="APE098", length=100)
    public String getApe098() {
        return this.ape098;
    }
    
    public void setApe098(String ape098) {
        this.ape098 = ape098;
    }
    
    @Column(name="APF078", length=1000)
    public String getApf078() {
        return this.apf078;
    }
    
    public void setApf078(String apf078) {
        this.apf078 = apf078;
    }
    
    @Column(name="APE728", length=1000)
    public String getApe728() {
        return this.ape728;
    }
    
    public void setApe728(String ape728) {
        this.ape728 = ape728;
    }
    
    @Column(name="AAE189", length=1000)
    public String getAae189() {
        return this.aae189;
    }
    
    public void setAae189(String aae189) {
        this.aae189 = aae189;
    }
    
    @Column(name="ABF039", length=50)
    public String getAbf039() {
        return this.abf039;
    }
    
    public void setAbf039(String abf039) {
        this.abf039 = abf039;
    }
    
    @Column(name="AAE011", length=50)
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
