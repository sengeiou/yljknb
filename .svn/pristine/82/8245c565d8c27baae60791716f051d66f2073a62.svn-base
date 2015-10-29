/** 
 * @(#)RequestUtils.java Jun 10, 2010
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

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

/**
 * @author xieguojun
 * @version $Revision$ Jun 10, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class RequestUtils {
	
	/**
	 * 获取int变量
	 * @param request
	 * @param name        
	 * @param defaultValue 找不到name对应值时，返回默认值
	 * @return
	 */
	public static int	getParameter(HttpServletRequest request,String name,int defaultValue){
		
		String value =request.getParameter(name);
		
		if(!StringUtils.hasText(value)){
			return defaultValue;
		}
		
		return Integer.parseInt(value);
		
	}
	
	/**
	 * 获取long
	 * @param request
	 * @param name
	 * @param defaultValue 找不到name对应值时，返回默认值
	 * @return
	 */
	public static long	getParameter(HttpServletRequest request,String name,long defaultValue){
		
		String value =request.getParameter(name);
		
		if(!StringUtils.hasText(value)){
			return defaultValue;
		}
		
		return Long.parseLong(value);
		
	}
	
	/**
	 * 
	 * @param request
	 * @param name
	 * @param defaultValue 找不到name对应值时，返回默认值
	 * @return
	 */
	public static String getParameter(HttpServletRequest request,String name,String defaultValue){
		
		String value =request.getParameter(name);
		
		if(!StringUtils.hasText(value)){
			return defaultValue;
		}
		
		return value;
		
	}
		
	

}
