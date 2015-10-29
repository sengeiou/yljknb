/** 
 * @(#)SimpleColumnConverterImpl.java May 20, 2009
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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Date;

import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnMapInfo;
import com.wondersgroup.framework.core5.util.ClassUtils;
import com.wondersgroup.framework.core5.util.DateUtils;

/**
 * @author suhualin
 * @version $Revision: 15902 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class SimpleColumnConverterImpl extends AbstractColumnConverter {

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.mapping.converter.AbstractColumnConverter#nullSafeFromString(java.lang.String,
	 *      com.wondersgroup.cayth.wsbs.apply.mapping.ColumnMapInfo)
	 */
	@Override
	protected Object nullSafeFromString(String value, ColumnMapInfo columnMapInfo) {
		switch (columnMapInfo.getColumnType()) {
		case NUMBER:
			BigDecimal bigDecimal = new BigDecimal(value);
			Class<?> propertyType = ClassUtils.primitiveToWrapper(columnMapInfo.getPropertyType());
			if (BigDecimal.class.equals(propertyType)) {
				return bigDecimal;
			}
			else if (Short.class.equals(propertyType)) {
				return bigDecimal.shortValue();
			}
			else if (Integer.class.equals(propertyType)) {
				return bigDecimal.intValue();
			}
			else if (Long.class.equals(propertyType)) {
				return bigDecimal.longValue();
			}
			else if (Float.class.equals(propertyType)) {
				return bigDecimal.floatValue();
			}
			else if (Double.class.equals(propertyType)) {
				return bigDecimal.doubleValue();
			}
			else if (BigInteger.class.equals(propertyType)) {
				return bigDecimal.toBigInteger();
			}
			else {
				throw new IllegalArgumentException(String.format("Number type %s doesn't support", propertyType
						.getName()));
			}
		case DATE:
			java.util.Date date = DateUtils.parseDate(value, columnMapInfo.getFormat());
			if (date == null) {
				return null;
			}
			else {
				if (java.util.Date.class.equals(columnMapInfo.getPropertyType())) {
					return date;
				}
				else if (java.sql.Date.class.equals(columnMapInfo.getPropertyType())) {
					return new java.sql.Date(date.getTime());
				}
				else if (java.sql.Time.class.equals(columnMapInfo.getPropertyType())) {
					return new java.sql.Time(date.getTime());
				}
				else if (java.sql.Timestamp.class.equals(columnMapInfo.getPropertyType())) {
					return new java.sql.Timestamp(date.getTime());
				}
				else {
					throw new IllegalArgumentException(String.format("Date type %s doesn't support now", columnMapInfo
							.getPropertyType().getName()));
				}
			}
		default:
		}
		return null;
	}

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.mapping.converter.AbstractColumnConverter#nullSafeToString(java.lang.Object,
	 *      com.wondersgroup.cayth.wsbs.apply.mapping.ColumnMapInfo)
	 */
	@Override
	protected String nullSafeToString(Object value, ColumnMapInfo columnMapInfo) {
		switch (columnMapInfo.getColumnType()) {
		case NUMBER:
			DecimalFormat decimalFormat = new DecimalFormat(columnMapInfo.getFormat());
			return decimalFormat.format(value);
		case DATE:
			return DateUtils.format((Date) value, columnMapInfo.getFormat());
		default:
		}
		return null;
	}

}
