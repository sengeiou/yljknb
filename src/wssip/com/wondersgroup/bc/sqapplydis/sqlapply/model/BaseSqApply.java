/** 
 * @(#)BaseSq_Apply.java Jul 15, 2009
 * 
 * Copyright (c) 1995-2009 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Wonders Group.
 * (Social Security Department). You shall not disclose such
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with Wonders Group. 
 *
 * Distributable under GNU LGPL license by gnu.org
 */

package com.wondersgroup.bc.sqapplydis.sqlapply.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @version $Revision$ Jul 15, 2009
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
@MappedSuperclass
public abstract class BaseSqApply {

	private String bsz005; // 事项标识（业务日志标识）

	private String aaa121; // 业务类型

	private Date insertdate; // 生成时间

	private String insertoperator; // 生成操作人

	private String insertoperatorname; // 生成操作人姓名

	private Date updatedate; // 更新时间

	private String updateoperator; // 更新操作人

	private String updateoperatorname; // 更新操作人姓名

	private String status; // 状态

	private String aab301; // 所属行政区代码

	private String aaa027; // 所属区

	private String bab003; // 所属居委（村）

	private String bab004; // 所属社区

	private String aaz002; // 业务日志编号

	private String aaz010; // 当事人ID

	private String aaa028; // 当事人类别

	private String aae140; // 险种类型

	@Id
	@Column(name = "BSZ005", unique = true, insertable = true, updatable = true, length = 20)
	public String getBsz005() {
		return bsz005;
	}

	public void setBsz005(String bsz005) {
		this.bsz005 = bsz005;
	}

	@Column(name = "AAA121", unique = true, insertable = true, updatable = true, length = 10)
	public String getAaa121() {
		return aaa121;
	}

	public void setAaa121(String aaa121) {
		this.aaa121 = aaa121;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_DATE", unique = false, insertable = true, updatable = true, length = 7)
	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	@Column(name = "INSERT_OPERATOR", unique = true, insertable = true, updatable = true, length = 10)
	public String getInsertoperator() {
		return insertoperator;
	}

	public void setInsertoperator(String insertoperator) {
		this.insertoperator = insertoperator;
	}

	@Column(name = "INSERT_OPERATORNAME", unique = true, insertable = true, updatable = true, length = 50)
	public String getInsertoperatorname() {
		return insertoperatorname;
	}

	public void setInsertoperatorname(String insertoperatorname) {
		this.insertoperatorname = insertoperatorname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", unique = false, insertable = true, updatable = true, length = 7)
	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@Column(name = "UPDATE_OPERATOR", unique = true, insertable = true, updatable = true, length = 10)
	public String getUpdateoperator() {
		return updateoperator;
	}

	public void setUpdateoperator(String updateoperator) {
		this.updateoperator = updateoperator;
	}

	@Column(name = "UPDATE_OPERATORNAME", unique = true, insertable = true, updatable = true, length = 10)
	public String getUpdateoperatorname() {
		return updateoperatorname;
	}

	public void setUpdateoperatorname(String updateoperatorname) {
		this.updateoperatorname = updateoperatorname;
	}

	@Column(name = "STATUS", unique = true, insertable = true, updatable = true, length = 1)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "AAB301", unique = true, insertable = true, updatable = true, length = 6)
	public String getAab301() {
		return this.aab301;
	}

	public void setAab301(String aab301) {
		this.aab301 = aab301;
	}

	@Column(name = "BAB003", unique = true, insertable = true, updatable = true, length = 10)
	public String getBab003() {
		return this.bab003;
	}

	public void setBab003(String bab003) {
		this.bab003 = bab003;
	}

	@Column(name = "BAB004", unique = true, insertable = true, updatable = true, length = 10)
	public String getBab004() {
		return this.bab004;
	}

	public void setBab004(String bab004) {
		this.bab004 = bab004;
	}

	@Column(name = "AAZ002", unique = true, insertable = true, updatable = true, length = 16)
	public String getAaz002() {
		return aaz002;
	}

	public void setAaz002(String aaz002) {
		this.aaz002 = aaz002;
	}

	@Column(name = "AAZ010", unique = true, insertable = true, updatable = true, length = 16)
	public String getAaz010() {
		return aaz010;
	}

	public void setAaz010(String aaz010) {
		this.aaz010 = aaz010;
	}

	@Column(name = "AAA028", unique = true, insertable = true, updatable = true, length = 3)
	public String getAaa028() {
		return aaa028;
	}

	public void setAaa028(String aaa028) {
		this.aaa028 = aaa028;
	}

	@Column(name = "AAE140", unique = false, insertable = true, updatable = true, length = 3)
	public String getAae140() {
		return this.aae140;
	}

	public void setAae140(String aae140) {
		this.aae140 = aae140;
	}


	@Column(name = "AAA027")
	public String getAaa027() {
		return aaa027;
	}

	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	
	@Transient
	public String getEntityId() {
		return this.getBsz005();
	}
	
	@Transient
	public String getObjectId() {

		return this.getBsz005();
	}

}
