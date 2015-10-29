/** 
 * @(#)DBFFieldProperty.java Apr 15, 2009
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

package com.wondersgroup.wssip.commons.javatxt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.wondersgroup.wssip.commons.javatxt.mapping.TXTFieldType;


/**
 * DBF字段属性
 * 
 * @author suhualin
 * @version $Revision: 15070 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
@Target( { ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TXTFieldProperty {
	/**
	 * 字段位置
	 */
	int order();

	/**
	 * 映射字段，默认为注释的属性名
	 */
	String field() default "";

	/**
	 * 字段类型，默认为注释的属性类型对应的DBF字段类型
	 */
	TXTFieldType type() default TXTFieldType.DYNAMIC;

	/**
	 * 长度
	 * 
	 * @return
	 */
	int length() default 0;

	/**
	 * 小数点位数，用于NUMBER类型
	 * 
	 * @return
	 */
	int scale() default 0;
}
