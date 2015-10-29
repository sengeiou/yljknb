/** 
 * @(#)DBFTypeMapping.java Apr 15, 2009
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

import com.wondersgroup.wsscclib.javadbf.core.DBFException;

/**
 * DBF数据类型和Java类型的映射
 * 
 * @author suhualin
 * @version $Revision: 15070 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public interface TXTTypeMapping {
	/**
	 * 根据Java类型获取对应的字段类型
	 * 
	 * @param javaType
	 *            Java 类型
	 * @return
	 */
	TXTFieldType fromJavaType(Class<?> javaType);

	/**
	 * 根据DBF字段类型获取对应的Java类型
	 * 
	 * @param fieldType
	 *            DBF字段类型
	 * @return
	 */
	Class<?> toJavaType(TXTFieldType fieldType);

	/**
	 * 根据DBF字段类型和Java对象值获取对应的DBF字段字节数组值
	 * 
	 * @param fieldType
	 *            DBF字段类型
	 * @param value
	 *            Java对象值
	 * @param field
	 *            字段定义
	 * @return
	 */
	byte[] fromJavaObject(TXTFieldType fieldType, Object value, TXTField field)
			throws DBFException;

	/**
	 * 根据DBF字段类型和DBF字段值字节数组获取对应的Java对象
	 * 
	 * @param fieldType
	 *            DBF字段类型
	 * @param value
	 *            DBF字段值字节数组
	 * @return
	 */
	Object toJavaObject(TXTFieldType fieldType, byte[] value)
			throws DBFException;
}
