/** 
/** 
 * @(#)PageUtils.java 2008-9-19
 * 
 * Copyright (c) 1995-2008 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.wssip.local.commons.util;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.bo.Page;

/**
 * List数据转为Page对象类
 * 
 * @author Liudd
 * @version $Revision: 13 $ 2008-9-19
 * @author ($Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ modification by $Author: Suhl $)
 * @since 1.0
 */
public class PageUtils {

	@SuppressWarnings("rawtypes")
	public static Page getPage(List tempList, Integer startIndex, Integer limits) {
		// 获取起始记录位置
		int start = 0;
		if (startIndex != null) {
			start = startIndex;
		}
		// 获取页面容量
		int limit = tempList.size();
		if (limits != null) {
			limit = limits;
		}

		List list = tempList;
		int totalCount = list.size();

		list = getSubList(tempList, start, start + limit);

		Page page = getPageFromList(list, start, totalCount, limit);
		return page;
	}

	/**
	 * @param list
	 * @param start
	 * @param totalCount
	 * @param limit
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private static Page getPageFromList(List list, int startIndex, int totalCount, int pageSize) {

		int avaCount = (list == null) ? 0 : list.size();
		return new Page(startIndex, avaCount, totalCount, pageSize, list);
	}

	/**
	 * @param ac98list
	 * @param start
	 * @param i
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static List getSubList(List list, int start, int endIndex) {
		if (list == null || list.isEmpty()) {
			return null;
		}
		List result = new ArrayList();
		if (start > endIndex) {
			return null;
		}

		endIndex = endIndex > list.size() ? list.size() : endIndex;

		for (int i = start; i < endIndex; i++) {
			result.add(list.get(i));
		}

		return result;
	}
}
