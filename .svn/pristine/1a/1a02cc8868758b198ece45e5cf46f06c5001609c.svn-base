/** 
 * @(#)DicVO.java Sep 4, 2008
 * 
 * Copyright (c) 1995-2008 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.wssip.application.dictionary;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

/**
 * @author shaoyifeng
 * @version $Revision: 13 $ Sep 4, 2008
 * @author ($Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ modification by $Author: Suhl $)
 * @since 1.0
 */
public class DicVO implements ValueObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9044002396110528118L;

	private String id; // 代码ID

	private long codeTypeId = 0; // 代码类别ID

	private String codeType = ""; // 代码类别编码

	private String code = ""; // 代码值

	private String name = ""; // 代码名称

	private String codeLike = ""; // 代码相关

	private String parentCodeType = "";// 附代码类型

	private String parentCode = ""; // 父亲代码

	private int likeMode = 0; // Like代码匹配模式

	private long parentId = 0;

	private boolean full = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCodeTypeId() {
		return codeTypeId;
	}

	public void setCodeTypeId(long codeTypeId) {
		this.codeTypeId = codeTypeId;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getParentCode() {
		return parentCode;
	}

	/**
	 * @param parentCode the parentCode to set
	 */
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	/**
	 * @param parentCodeType the parentCodeType to set
	 */
	public void setParentCodeType(String parentCodeType) {
		this.parentCodeType = parentCodeType;
	}

	/**
	 * @return the parentCodeType
	 */
	public String getParentCodeType() {
		return parentCodeType;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getCodeLike() {
		return codeLike;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public int getLikeMode() {
		return likeMode;
	}

	public void setLikeMode(int likeMode) {
		this.likeMode = likeMode;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public String getText() {
		return getName();
	}

	public String getValue() {
		return getCode();
	}
}
