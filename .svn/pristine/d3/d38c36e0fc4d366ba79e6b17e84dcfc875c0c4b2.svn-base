/** 
 * @(#)ColumnMapFactoryAnnotationImpl.java May 20, 2009
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

import java.beans.PropertyDescriptor;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.BeanMapInfo;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnMapFactory;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnMapInfo;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.ColumnType;

/**
 * @author suhualin
 * @version $Revision: 15901 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class ColumnMapFactoryAnnotationImpl implements ColumnMapFactory {
	private static Log log = LogFactory.getLog(ColumnMapFactoryAnnotationImpl.class);

	private static Map<Class<?>, BeanMapInfo> cache = new HashMap<Class<?>, BeanMapInfo>();

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.mapping.ColumnMapFactory#getMapInfo(java.lang.Class)
	 */
	public BeanMapInfo getMapInfo(Class<?> beanType) {
		synchronized (cache) {
			if (cache.containsKey(beanType)) {
				return cache.get(beanType);
			}
			BeanMapInfo beanMapInfo = new BeanMapInfo(beanType);
			Map<String, BeanMapInfo> detailMapInfos = new HashMap<String, BeanMapInfo>();
			if (beanType.getAnnotation(SqApplyDataMap.class) != null) {
				Map<Integer, ColumnMapInfo> result = new TreeMap<Integer, ColumnMapInfo>();
				for (Field field : beanType.getDeclaredFields()) {
					parseElement(field.getType(), field, field.getName(), result, detailMapInfos);
				}

				PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(beanType);
				for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
					parseElement(propertyDescriptor.getPropertyType(), propertyDescriptor.getReadMethod(),
							propertyDescriptor.getName(), result, detailMapInfos);
				}
				if (log.isWarnEnabled() && result.size() == 0) {
					log.warn(new StringBuffer("Class ").append(beanType.getName()).append(
							" doesn't contain any mapped property").toString());
				}
				beanMapInfo.setColumnMapInfos(result.values());
				if (detailMapInfos.size() > 0) {
					beanMapInfo.setDetailMapInfos(detailMapInfos);
				}
				cache.put(beanType, beanMapInfo);
				return beanMapInfo;
			}
			else {
				if (log.isWarnEnabled()) {
					log.warn(new StringBuffer("Class ").append(beanType.getName()).append(" doesn't support codec")
							.toString());
				}
				return null;
			}
		}
	}

	private void parseElement(Class<?> type, AnnotatedElement element, String name, Map<Integer, ColumnMapInfo> result,
			Map<String, BeanMapInfo> detailMapInfos) {
		SqApplyDataColumn column = element.getAnnotation(SqApplyDataColumn.class);
		if (column != null) {
			result.put(column.columnIndex(), generateColumnMapInfo(type, element, name, column));
		}

		SqApplyDetailColumn detailColumn = element.getAnnotation(SqApplyDetailColumn.class);
		if (detailColumn != null) {
			BeanMapInfo detailMapInfo = getMapInfo(detailColumn.elementType());
			if (detailMapInfo != null) {
				detailMapInfos.put(name + ":" + detailColumn.mapKey(), detailMapInfo);
			}
			else {
				if (log.isWarnEnabled()) {
					log.warn("property " + name + "ignored");
				}
			}
		}
	}

	private ColumnMapInfo generateColumnMapInfo(Class<?> type, AnnotatedElement element, String name,
			SqApplyDataColumn column) {
		ColumnMapInfo columnMapInfo = new ColumnMapInfo();
		columnMapInfo.setProperty(name);
		columnMapInfo.setColumnIndex(column.columnIndex());
		columnMapInfo.setFormat(StringUtils.isEmpty(column.format()) ? null : column.format());
		columnMapInfo.setPropertyType(type);
		if (String.class.equals(type)) {
			columnMapInfo.setColumnType(ColumnType.STRING);
		}
		else if (Number.class.isAssignableFrom(ClassUtils.primitiveToWrapper(type))) {
			columnMapInfo.setColumnType(ColumnType.NUMBER);
		}
		else if (Date.class.isAssignableFrom(type)) {
			columnMapInfo.setColumnType(ColumnType.DATE);
		}
		else {
			throw new IllegalArgumentException("Field [" + type.getName() + " " + name + "] of class " + type.getName()
					+ " not support");
		}
		return columnMapInfo;
	}
}
