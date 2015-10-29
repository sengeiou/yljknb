/** 
 * @(#)SqApplyDataColumn.java May 20, 2009
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

package com.wondersgroup.bc.sqapplydis.sqlapply.mapping.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author suhualin
 * @version $Revision: 15901 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.METHOD })
public @interface SqApplyDataColumn {
	/**
	 * 列索引
	 */
	int columnIndex();

	/**
	 * 格式
	 */
	String format() default "";
}
