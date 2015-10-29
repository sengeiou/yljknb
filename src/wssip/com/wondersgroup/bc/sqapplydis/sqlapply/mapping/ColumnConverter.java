/** 
 * @(#)ColumnConverter.java May 20, 2009
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

package com.wondersgroup.bc.sqapplydis.sqlapply.mapping;

/**
 * @author suhualin
 * @version $Revision: 15901 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public interface ColumnConverter {
	/**
	 * 将对象转换为字符串
	 * 
	 * @param value
	 * @return
	 */
	String toString(Object value, ColumnMapInfo columnMapInfo);

	/**
	 * 从字符串转换为对象
	 * 
	 * @param value
	 * @return
	 */
	Object fromString(String value, ColumnMapInfo columnMapInfo);
}
