/** 
 * @(#)BeanUtils.java Jun 3, 2010
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

package com.wondersgroup.wssip.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
import org.springframework.util.Assert;

/**
 * @author xieguojun
 * @version $Revision$ Jun 3, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BeanTools extends org.springframework.beans.BeanUtils {

	/**
	 * 拷贝时，忽略属性
	 */
	public static final String[] IGNORE_PROPS = new String[] { "", "" };

	/**
	 * @author xieguojun
	 * 拷贝属性
	 * 
	 * @param source
	 * @param target
	 * @param ignore 是否忽略BeanUtils.IGNORE_PROPS的字段
	 * @throws BeansException
	 */
	public static void copyProperties(Object source, Object target, boolean ignore) throws BeansException {
		if (ignore)
			copyProperties(source, target, IGNORE_PROPS);
		else
			copyProperties(source, target);
	}
	
	/**
	 * @author xieguojun
	 * 拷贝属性，忽略元数据空值复制

	 * 
	 * @param source
	 * @param target
	 * @param 

	 * @throws BeansException
	 */
	public static void copyPropertiesIgnoreNull(Object source, Object target)
			throws BeansException {
		_copyProperties(source,target,true,true);
	}
	
	/**
	 * @author xieguojun
	 * 拷贝属性，忽略元数据空值复制
	 * 
	 * @param source
	 * @param target
	 * @param ignore 是否忽略BeanUtils.IGNORE_PROPS的字段
	 * @throws BeansException
	 */
	public static void copyPropertiesIgnoreNull(Object source, Object target, boolean ignore)
			throws BeansException {
		_copyProperties(source,target,ignore,true);
	}

	/**
	 * @author xieguojun
	 * @param source
	 * @param target
	 * @param ignore     是否忽略属性IGNORE_PROPS复制
	 * @param ignoreNull 是否忽略空值复制
	 * @throws BeansException
	 */
	@SuppressWarnings("rawtypes")
	private static void _copyProperties(Object source, Object target,boolean ignore, boolean ignoreNull)
			throws BeansException {

		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

	 
		PropertyDescriptor[] targetPds = getPropertyDescriptors(target.getClass());
		List ignoreList = ignore ? null : Arrays.asList(IGNORE_PROPS);

		for (int i = 0; i < targetPds.length; i++) {
			PropertyDescriptor targetPd = targetPds[i];
			if (targetPd.getWriteMethod() != null
					&& (ignore || (!ignoreList.contains(targetPd.getName())))) {
				
				PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
				if (sourcePd != null && sourcePd.getReadMethod() != null) {
					try {
						Method getter = sourcePd.getReadMethod();
						if (!Modifier.isPublic(getter.getDeclaringClass().getModifiers())) {
							getter.setAccessible(true);
						}
						Object value = getter.invoke(source, new Object[0]);
						
						if(ignoreNull && value ==null)
							continue;
						
						Method setter = targetPd.getWriteMethod();
						if (!Modifier.isPublic(setter.getDeclaringClass().getModifiers())) {
							setter.setAccessible(true);
						}
						setter.invoke(target, new Object[] { value });
					}
					catch (Throwable ex) {
						throw new FatalBeanException("Could not copy properties from source to target", ex);
					}
				}
			}
		}
	}
	

	public static void main(String args[]) {

		

	}
}
