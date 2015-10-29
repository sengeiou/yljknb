/** 
 * @(#)BeanMappingConfig.java Apr 15, 2009
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

import java.math.BigDecimal;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;

import com.wondersgroup.wsscclib.javadbf.mapping.PropertyMappingStrategy;

/**
 * @author suhualin
 * @version $Revision: 14877 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class BeanMappingConfig {
	private PropertyMappingStrategy propertyMappingStrategy;

	private String charset;

	private TXTTypeMapping typeMapping;
	
	//是否trim空格
	private	boolean	trim;

	public PropertyMappingStrategy getPropertyMappingStrategy() {
		return propertyMappingStrategy;
	}

	public void setPropertyMappingStrategy(PropertyMappingStrategy propertyMappingStrategy) {
		this.propertyMappingStrategy = propertyMappingStrategy;
	}

	public TXTTypeMapping getTypeMapping() {
		return typeMapping;
	}

	public void setTypeMapping(TXTTypeMapping typeMapping) {
		this.typeMapping = typeMapping;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public boolean isTrim() {
		return trim;
	}

	public void setTrim(boolean trim) {
		this.trim = trim;
	}



	public static ThreadLocal<BeanMappingConfig> context = new ThreadLocal<BeanMappingConfig>() {
		/**
		 * @see java.lang.ThreadLocal#initialValue()
		 */
		@Override
		protected BeanMappingConfig initialValue() {
			BeanMappingConfig beanMappingConfig = new BeanMappingConfig();
			beanMappingConfig.setPropertyMappingStrategy(PropertyMappingStrategy.NORMAL);
			beanMappingConfig.setCharset("GBK");
			beanMappingConfig.setTypeMapping(new DefaultTXTTypeMapping());
			ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
			return beanMappingConfig;
		}
	};

	/**
	 * @return
	 */
	public static BeanMappingConfig getRunningConfig() {
		return context.get();
	}

}
