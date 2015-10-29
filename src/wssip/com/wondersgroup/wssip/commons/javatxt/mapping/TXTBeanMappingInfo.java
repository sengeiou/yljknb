/** 
 * @(#)DBFBeanMappingInfo.java Apr 15, 2009
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

package com.wondersgroup.wssip.commons.javatxt.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.wondersgroup.wsscclib.javadbf.mapping.DBFFieldInfo;

/**
 * DBF JavaBean映射信息
 * 
 * @author suhualin
 * @version $Revision: 14672 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class TXTBeanMappingInfo {
	private final Class<?> beanType;

	private final List<DBFFieldInfo> fieldInfos = new ArrayList<DBFFieldInfo>();

	public TXTBeanMappingInfo(Class<?> beanType) {
		this.beanType = beanType;
	}

	/**
	 * @return the beanType
	 */
	public Class<?> getBeanType() {
		return beanType;
	}

	/**
	 * @return the fieldInfos
	 */
	public List<DBFFieldInfo> getFieldInfos() {
		return fieldInfos;
	}

	/**
	 * @param fieldInfo
	 * @return
	 */
	public TXTBeanMappingInfo addField(DBFFieldInfo fieldInfo) {
		fieldInfos.add(fieldInfo);
		return this;
	}

	/**
	 * @param fieldInfos
	 * @return
	 */
	public TXTBeanMappingInfo addFieldInfos(Collection<DBFFieldInfo> fieldInfos) {
		this.fieldInfos.addAll(fieldInfos);
		return this;
	}
}
