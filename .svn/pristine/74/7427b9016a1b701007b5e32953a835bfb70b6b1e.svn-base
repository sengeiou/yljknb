/** 
 * @(#)DefaultDBFTypeMapping.java Apr 15, 2009
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

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.ArrayUtils;

import com.wondersgroup.wsscclib.javadbf.core.DBFException;
import com.wondersgroup.wsscclib.javadbf.core.Utils;

/**
 * @author suhualin
 * @version $Revision: 15070 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class DefaultTXTTypeMapping implements TXTTypeMapping {
	private static Class<?>[] mappings;

	static {
		mappings = new Class<?>[5];
		mappings[TXTFieldType.STRING.ordinal()] = String.class;
		mappings[TXTFieldType.NUMBER.ordinal()] = java.math.BigDecimal.class;
		mappings[TXTFieldType.FLOAT.ordinal()] = Float.class;
		mappings[TXTFieldType.DATE.ordinal()] = Date.class;
		mappings[TXTFieldType.BOOLEAN.ordinal()] = Boolean.class;
	}

	/**
	 * @see com.wondersgroup.wsscclib.javadbf.DBFTypeMapping#fromJavaType(java.lang.Class)
	 */
	public TXTFieldType fromJavaType(Class<?> javaType) {
		int index = ArrayUtils.indexOf(mappings, javaType);
		return index >= 0 ? TXTFieldType.values()[index] : null;
	}

	/**
	 * @see com.wondersgroup.wsscclib.javadbf.DBFTypeMapping#toJavaType(com.wondersgroup.wsscclib.javadbf.DBFFieldType)
	 */
	public Class<?> toJavaType(TXTFieldType fieldType) {
		return mappings[fieldType.ordinal()];
	}

	/**
	 * @see com.wondersgroup.wsscclib.javadbf.DBFTypeMapping#fromJavaObject(com.wondersgroup.wsscclib.javadbf.DBFFieldType,
	 *      java.lang.Object)
	 */
	public byte[] fromJavaObject(TXTFieldType fieldType, Object value, TXTField field) throws DBFException {
		byte[] result = null;
		Converter converter = null;
		Class<?> destJavaType = null;
		if (value != null) {
			TXTFieldType mapping = fromJavaType(value.getClass());
			if (mapping != fieldType) {
				destJavaType = toJavaType(fieldType);
				converter = ConvertUtils.lookup(destJavaType);
				if (converter == null) {
					throw new DBFException(String.format("值类型[%s]和字段类型不匹配[%s]", mapping, fieldType));
				}
			}
		}
		if (converter != null) {
			value = converter.convert(destJavaType, value);
		}
		switch (fieldType) {
		case STRING:
			try {
				if (value != null) {
					result = Utils.textPadding(value.toString(), BeanMappingConfig.getRunningConfig().getCharset(),
							field.getFieldLength());
				}
				else {
					result = Utils.textPadding("", BeanMappingConfig.getRunningConfig().getCharset(), field
							.getFieldLength());
				}
			}
			catch (UnsupportedEncodingException e) {
				throw new DBFException("不支持的编码格式:" + e.getMessage());
			}
			break;
		case NUMBER:
		case FLOAT:
			try {
				if (value != null) {
					result = Utils.numberFormating((Number) value, BeanMappingConfig.getRunningConfig().getCharset(),
							field.getFieldLength(), field.getDecimalCount());
				}
				else {
					result = Utils.textPadding("?", BeanMappingConfig.getRunningConfig().getCharset(), field
							.getFieldLength(), Utils.ALIGN_RIGHT);
				}
			}
			catch (UnsupportedEncodingException e) {
				throw new DBFException("不支持的编码格式:" + e.getMessage());
			}
			break;
		case DATE:
			try {
				if (value != null) {
					result = new byte[8];
					GregorianCalendar calendar = new GregorianCalendar();
					calendar.setTime((Date) value);
					System.arraycopy(String.valueOf(calendar.get(Calendar.YEAR)).getBytes(), 0, result, 0, 4);
					System.arraycopy(Utils.textPadding(String.valueOf(calendar.get(Calendar.MONTH) + 1),
							BeanMappingConfig.getRunningConfig().getCharset(), 2, Utils.ALIGN_RIGHT, (byte) '0'), 0,
							result, 4, 2);
					System.arraycopy(Utils.textPadding(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
							BeanMappingConfig.getRunningConfig().getCharset(), 2, Utils.ALIGN_RIGHT, (byte) '0'), 0,
							result, 6, 2);
				}
				else {
					result = "        ".getBytes();
				}
			}
			catch (UnsupportedEncodingException e) {
				throw new DBFException("不支持的编码格式:" + e.getMessage());
			}

			break;

		case BOOLEAN:
			if (value != null) {

				if ((Boolean) value == Boolean.TRUE) {

					result = new byte[] { ((byte) 'T') };
				}
				else {
					result = new byte[] { ((byte) 'F') };
				}
			}
			else {
				result = new byte[] { ((byte) '?') };
			}
			break;
		default:
			throw new DBFException("不支持的数据类型" + fieldType);
		}

		return result;
	}

	/**
	 * @see com.wondersgroup.wsscclib.javadbf.DBFTypeMapping#toJavaObject(com.wondersgroup.wsscclib.javadbf.DBFFieldType,
	 *      byte[])
	 */
	public Object toJavaObject(TXTFieldType fieldType, byte[] value) throws DBFException {
		Object result = null;
		switch (fieldType) {
		case STRING:
			try {
				String temp = Utils
						.trimRightSpaces(new String(value, BeanMappingConfig.getRunningConfig().getCharset()));
				if (temp.length() == 0) {
					temp = null;
				}
				result = temp;
			}
			catch (UnsupportedEncodingException e) {
				throw new DBFException("不支持的编码格式:" + e.getMessage());
			}
			break;
		case NUMBER:
			try {

				value = Utils.trimLeftSpaces(value);

				if (value.length > 0 && !Utils.contains(value, (byte) '?')) {

					result = new BigDecimal(new String(value));
				}
				else {
					result = null;
				}
			}
			catch (NumberFormatException e) {
				throw new DBFException("Failed to parse Number: " + e.getMessage());
			}

			break;
		case FLOAT:
			try {

				value = Utils.trimLeftSpaces(value);

				if (value.length > 0 && !Utils.contains(value, (byte) '?')) {

					result = new Float(new String(value));
				}
				else {
					result = null;
				}
			}
			catch (NumberFormatException e) {
				throw new DBFException("Failed to parse Number: " + e.getMessage());
			}
			break;
		case DATE:
			try {
				GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(new String(value, 0, 4)), Integer
						.parseInt(new String(value, 4, 2)) - 1, Integer.parseInt(new String(value, 6, 2)));

				result = calendar.getTime();
			}
			catch (NumberFormatException e) {
				/* this field may be empty or may have improper value set */
				result = null;
			}

			break;

		case BOOLEAN:
			if (value[0] == '?') {
				result = null;
			}
			else if (value[0] == 'Y' || value[0] == 'y' || value[0] == 'T' || value[0] == 't') {
				result = Boolean.TRUE;
			}
			else {
				result = Boolean.FALSE;
			}
			break;
		default:
			break;
		}
		return result;
	}

}
