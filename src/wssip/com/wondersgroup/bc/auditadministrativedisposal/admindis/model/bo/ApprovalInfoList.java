package com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@org.hibernate.annotations.Entity (dynamicUpdate = true)
@Table( name = "APPROVAL_INFO_LIST")
public class ApprovalInfoList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer ailid;  // id
	private Integer aclid;  // 审批分类id
	private String ailmen;  //审批人
	private Date ailtime;  //审批时间
	private String ailyj;  //审批意见
	private String ailzt;   //审批状态
	private String ailtg;  // 是否通过  ‘是/否’ 
	private Long aaz318;   // 稽核案件id
	private Integer ailfl;   //1立案审批， 2为结论确认审批
	private Integer ailspfl; //审批标志 0未最终审批 1已最终审批
	private String aae427; //判断哪一审批
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SEQUENCE")
	@SequenceGenerator(name="SEQUENCE", sequenceName="SEQ_APPROVAL_INFO_LIST", allocationSize = 1)
	@Column(name = "AILID",nullable=false,unique=true,scale=0)
	public Integer getAilid() {
		return ailid;
	}
	public void setAilid(Integer ailid) {
		this.ailid = ailid;
	}
	
	@Column(name = "ACLID", length = 9)
	public Integer getAclid() {
		return aclid;
	}
	public void setAclid(Integer aclid) {
		this.aclid = aclid;
	}
	
	@Column(name = "AILMEN", length = 32)
	public String getAilmen() {
		return ailmen;
	}
	public void setAilmen(String ailmen) {
		this.ailmen = ailmen;
	}
	
	@Column(name = "AILTIME")
	public Date getAiltime() {
		return ailtime;
	}
	public void setAiltime(Date ailtime) {
		this.ailtime = ailtime;
	}
	
	@Column(name = "AILYJ", length = 1000)
	public String getAilyj() {
		return ailyj;
	}
	public void setAilyj(String ailyj) {
		this.ailyj = ailyj;
	}
	
	@Column(name = "AILZT", length = 100)
	public String getAilzt() {
		return ailzt;
	}
	public void setAilzt(String ailzt) {
		this.ailzt = ailzt;
	}
	
	@Column(name = "AILTG", length = 2)
	public String getAiltg() {
		return ailtg;
	}
	
	@Column(name = "AAE427", length = 3)
	public void setAiltg(String ailtg) {
		this.ailtg = ailtg;
	}
	
	@Column(name = "aaz318" , length = 16)
	public Long getAaz318() {
		return aaz318;
	}
	public void setAaz318(Long aaz318) {
		this.aaz318 = aaz318;
	}
	
	@Column(name = "AILFL" , length = 2)
	public Integer getAilfl() {
		return ailfl;
	}
	public void setAilfl(Integer ailfl) {
		this.ailfl = ailfl;
	}
	
	@Column(name = "AILSPFL" , length = 1)
	public Integer getAilspfl() {
		return ailspfl;
	}
	public void setAilspfl(Integer ailspfl) {
		this.ailspfl = ailspfl;
	}
	public String getAae427() {
		return aae427;
	}
	public void setAae427(String aae427) {
		this.aae427 = aae427;
	}
	

}
