/** 
 * @(#)DBFFieldType.java Apr 15, 2009
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

/**
 * DBF字段类型
 * 
 * @author suhualin
 * @version $Revision: 14877 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public enum TXTFieldType {
	/**
	 * DBF字符串类型
	 */
	STRING(TXTField.FIELD_TYPE_C, true, false)
	/**
	 * DBF全数字类型
	 */
	, NUMBER(TXTField.FIELD_TYPE_N, true, true)
	/**
	 * DBF浮点数数字类型
	 */
	, FLOAT(TXTField.FIELD_TYPE_F, true, true)
	/**
	 * DBF日期类型，内部格式YYYYMMDD
	 */
	, DATE(TXTField.FIELD_TYPE_D, false, false)
	/**
	 * DBF逻辑类型，布尔型，取值T/t,Y/y为真，取值F/f,N/n为假，取值?为null值
	 */
	, BOOLEAN(TXTField.FIELD_TYPE_L, false, false)
	/**
	 * DBF注释类型
	 */
	, MEMO(TXTField.FIELD_TYPE_M, false, false),
	/**
	 * 动态类型，仅用于JavaBean属性和DBF字段的映射用
	 */
	DYNAMIC((byte) 0, false, false);

	byte type;

	boolean lengthRequired;

	boolean scaleRequired;

	TXTFieldType(byte type, boolean lengthRequired, boolean scaleRequired) {
		this.type = type;
		this.lengthRequired = lengthRequired;
		this.scaleRequired = true;
	}

	/**
	 * @return the lengthRequired
	 */
	public boolean isLengthRequired() {
		return lengthRequired;
	}

	/**
	 * @return the scaleRequired
	 */
	public boolean isScaleRequired() {
		return scaleRequired;
	}

	/**
	 * @return the type
	 */
	public byte getType() {
		return type;
	}

	/**
	 * @param rawType
	 * @return
	 */
	public static TXTFieldType getFieldType(byte rawType) {
		for (TXTFieldType fieldType : values()) {
			if (fieldType.getType() == rawType) {
				return fieldType;
			}
		}
		return null;
	}
}
