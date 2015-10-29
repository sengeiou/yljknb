/** 
 * @(#) GridUtils.java
 *
 * @(#) com.wondersgroup.wssip.local.commons.util.GridUtils
 * @(#) Administrator
 * @(#) 2013-8-13 
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 */
package com.wondersgroup.wssip.local.commons.util;

import java.util.HashMap;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;

/**
 * @author Administrator
 *	
 *	
 */
public class GridUtils {
	
	public static Map<String,Object> getGridData(Page page){
		
		Map<String,Object> result = new HashMap<String, Object>();
		
		result.put("total", page.getTotalSize());
		result.put("data", page.getResult());
		
		return result;
	}

}
