/** 
 * @(#)AbstractColumnConverter.java May 20, 2009
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

package com.wondersgroup.bc.sqapplydis.sqlapply.mapping.converter;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnConverter;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnMapInfo;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnType;


/**
 * @author suhualin
 * @version $Revision: 15901 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public abstract class AbstractColumnConverter implements ColumnConverter {

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.mapping.ColumnConverter#fromString(java.lang.String)
	 */
	public Object fromString(String value, ColumnMapInfo columnMapInfo) {
		if (columnMapInfo.getColumnType() == ColumnType.STRING) {
			return value;
		}
		else {
			if (StringUtils.isBlank(value)) {
				return null;
			}
			else {
				return nullSafeFromString(value, columnMapInfo);
			}
		}
	}

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.mapping.ColumnConverter#toString(java.lang.Object,
	 *      com.wondersgroup.cayth.wsbs.apply.mapping.ColumnMapInfo)
	 */
	public String toString(Object value, ColumnMapInfo columnMapInfo) {
		if (value == null || value instanceof String) {
			return (String) value;
		}
		else {
			return nullSafeToString(value, columnMapInfo);
		}
	}

	/**
	 * 非空对象转换为字符串
	 * 
	 * @param value
	 * @param columnMapInfo
	 * @return
	 */
	protected abstract String nullSafeToString(Object value, ColumnMapInfo columnMapInfo);

	/**
	 * 非空字符串转换为对象
	 * 
	 * @param value
	 * @param columnMapInfo
	 * @return
	 */
	protected abstract Object nullSafeFromString(String value, ColumnMapInfo columnMapInfo);
}
