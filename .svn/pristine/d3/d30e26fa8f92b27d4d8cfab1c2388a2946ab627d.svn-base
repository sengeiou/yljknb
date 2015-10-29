/** 
 * @(#)SqApplyRowMapperUtils.java 2010-7-13
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.wssip.commons;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.BeanMapInfo;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnMapInfo;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.MappingUtils;
import com.wondersgroup.wssip.commons.dao.exception.RowMapperException;

/**
 * @author xieguojun
 * @version $Revision$ 2010-7-13
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class SqApplyRowMapperUtils extends RowMapperUtils {

	/**
	 * @param dto
	 * @param rs
	 * @throws RowMapperException
	 */
	public static void invoke(Object dto, ResultSet rs) throws RowMapperException {

		BeanMapInfo beanMapInfo = MappingUtils.getBeanMapInfo(dto.getClass());

		try {
			for (ColumnMapInfo cmi : beanMapInfo.getColumnMapInfos()) {

				Class<?> clazz = cmi.getPropertyType();
				String type = clazz.getName();

				String colName = cmi.getProperty();

				int index = cmi.getColumnIndex();
				String property =cmi.getProperty();

				Method[] methods = getMethods(dto.getClass(), colName);

				Method setter = methods[0];

				if(log.isDebugEnabled()){
					log.info(String.format("process invoke [%s]",colName));
				}
				
				Object value = null;
			 
				if ("short".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getShort(index);
					else
						value =	rs.getShort(property);
				}
				else if ("int".equalsIgnoreCase(type) || "java.lang.Integer".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getInt(index);
					else
						value = rs.getInt(property);
				}
				else if ("long".equalsIgnoreCase(type)||"java.lang.Long".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getLong(index);
					else
						value = rs.getLong(property);
				}
				else if ("float".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getFloat(index);
					else
						value = rs.getFloat(property);
				}
				else if ("double".equalsIgnoreCase(type) || "java.lang.Double".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getDouble(index);
					else
						value = rs.getDouble(property);
				}
				else if ("boolean".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getBoolean(index);
					else
						value = rs.getBoolean(property);
				}
				else if ("java.lang.String".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getString(index);
					else
						value = rs.getString(property);

				}
				else if ("java.sql.Date".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getDate(index);
					else
						value = rs.getDate(property);
				}
				else if ("java.sql.Timestamp".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getTimestamp(index);
					else
						value = rs.getTimestamp(property);
				}
				else if ("java.sql.Time".equalsIgnoreCase(type)) {
					if(index >=0)
						value = rs.getTime(index);
					else
						value = rs.getTime(property);

					// 处理java.util.Date
				}
				else if ("java.util.Date".equalsIgnoreCase(type)) {
					java.sql.Date date =null;
					if(index >=0)
						date=rs.getDate(index);
					else
						value = rs.getDate(property);
					if (date != null)
						value = new java.util.Date(date.getTime());
				}
				else if ("java.util.Timestamp".equalsIgnoreCase(type)) {
					java.sql.Timestamp date =null;
					
					if(index >=0)
						date=rs.getTimestamp(index);
					else
						value = rs.getTimestamp(property);
					if (date != null)
						value = new java.util.Date(date.getTime());
				}
				else if ("java.util.Time".equalsIgnoreCase(type)) {
					java.sql.Time date =null;
					
					if(index >=0)
						date =rs.getTime(index);
					else
						value = rs.getTime(property);
					if (date != null)
						value = new java.util.Date(date.getTime());

				}
				else if ("java.io.InputStream".equalsIgnoreCase(type)) {
					value = null;
				}
				else if ("char".equalsIgnoreCase(type)) {
					String str = null;
					
					if(index >=0)
						str =rs.getString(index);
					else
						value = rs.getString(property);
					value = str.charAt(0);
				}

				try {
					setter.invoke(dto, value);
				}
				catch (Exception e) {
					throw new RowMapperException(String.format("invoke error[method:%s]", setter.getName()), e);
				}

			}
		}
		catch (SQLException se) {
			throw new RowMapperException(String.format("SQL异常:%s", se.getMessage()), se);
		}

	}

}
