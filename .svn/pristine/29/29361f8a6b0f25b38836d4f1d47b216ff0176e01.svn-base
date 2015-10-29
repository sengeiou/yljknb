/** 
 * @(#)AnnotationDBFBeanMappingBuilder.java Apr 15, 2009
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

import java.beans.PropertyDescriptor;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import com.wondersgroup.wsscclib.javadbf.mapping.DBFFieldInfo;
import com.wondersgroup.wssip.commons.javatxt.annotation.TXTFieldProperty;
import com.wondersgroup.wssip.commons.javatxt.annotation.TXTSupport;

/**
 * @author suhualin
 * @version $Revision: 14672 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class AnnotationTXTBeanMappingBuilder {
	private static Map<Class<?>, TXTBeanMappingInfo> cache = new HashMap<Class<?>, TXTBeanMappingInfo>();

	private static TXTTypeMapping typeMapping = new DefaultTXTTypeMapping();

	/**
	 * @param typeMapping
	 *            the typeMapping to set
	 */
	public void setTypeMapping(TXTTypeMapping typeMapping) {
		AnnotationTXTBeanMappingBuilder.typeMapping = typeMapping;
	}

	/**
	 * 通过JavaBean类型构建DBF映射信息
	 * 
	 * @param beanType
	 *            JavaBean类型
	 * @return
	 */
	public synchronized static TXTBeanMappingInfo build(final Class<?> beanType) {
		TXTBeanMappingInfo result = cache.get(beanType);
		if (result == null) {
			if (beanType.getAnnotation(TXTSupport.class) != null) {
				result = new TXTBeanMappingInfo(beanType);
				Map<Integer, DBFFieldInfo> map = new TreeMap<Integer, DBFFieldInfo>();
				for (Field field : beanType.getDeclaredFields()) {
					parseProperty(beanType, field.getName(), field.getType(),
							field, map);
				}
				PropertyDescriptor[] propertyDescriptors = PropertyUtils
						.getPropertyDescriptors(beanType);
				for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
					parseProperty(beanType, propertyDescriptor.getName(),
							propertyDescriptor.getPropertyType(),
							propertyDescriptor.getReadMethod(), map);
				}
				result.addFieldInfos(map.values());
				cache.put(beanType, result);
			} else {
				throw new IllegalArgumentException(String.format(
						"%s未使用TXTSupport注释", beanType.getName()));
			}
		}
		return result;
	}

	private static void parseProperty(Class<?> beanType, String property,
			Class<?> type, AnnotatedElement annotatedElement,
			Map<Integer, DBFFieldInfo> result) {
		if (annotatedElement != null) {
			TXTFieldProperty fieldProperty = annotatedElement
					.getAnnotation(TXTFieldProperty.class);
			if (fieldProperty != null) {
				DBFFieldInfo fieldInfo = new DBFFieldInfo();

				fieldInfo.setProperty(property);

				if (StringUtils.isNotEmpty(fieldProperty.field())) {
					fieldInfo.setName(fieldProperty.field());
				}

				TXTFieldType fieldType = fieldProperty.type() == TXTFieldType.DYNAMIC ? typeMapping
						.fromJavaType(type)
						: fieldProperty.type();

				if (fieldType == null) {
					throw new IllegalArgumentException(String.format(
							"未指定类%s的属性%s的字段类型", beanType.getName(), property));
				}

				fieldInfo.setType(fieldType.getType());

				if (fieldProperty.length() <= 0) {
					if (fieldType.isLengthRequired()) {
						throw new IllegalArgumentException(String.format(
								"未指定类%s的属性%s的字段长度", beanType.getName(),
								property));
					}
				} else if (fieldType.isLengthRequired()) {
					fieldInfo.setLength(fieldProperty.length());
				}

				if (fieldProperty.scale() >= 0 && fieldType.isScaleRequired()) {
					fieldInfo.setScale(fieldProperty.scale());
				}

				result.put(fieldProperty.order(), fieldInfo);
			}
		}
	}
}
