/** 
 * @(#)BeanMapInfo.java May 20, 2009
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

package com.wondersgroup.bc.sqapplydis.sqlapply.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author suhualin
 * @version $Revision: 15902 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class BeanMapInfo {
	private final Class<?> type;

	private Collection<ColumnMapInfo> columnMapInfos;

	private Map<String, BeanMapInfo> detailMapInfos = new HashMap<String, BeanMapInfo>();

	public BeanMapInfo(Class<?> type) {
		this.type = type;
	}

	public Class<?> getType() {
		return type;
	}

	public Collection<ColumnMapInfo> getColumnMapInfos() {
		return columnMapInfos;
	}

	public void setColumnMapInfos(Collection<ColumnMapInfo> columnMapInfos) {
		this.columnMapInfos = columnMapInfos;
	}

	/**
	 * @return the detailMapInfos
	 */
	public Map<String, BeanMapInfo> getDetailMapInfos() {
		return detailMapInfos;
	}

	public BeanMapInfo getDetailMapInfo(String mapKey) {
		if (detailMapInfos == null) {
			return null;
		}
		else {
			for (Entry<String, BeanMapInfo> entry : detailMapInfos.entrySet()) {
				if (entry.getKey().indexOf(":" + mapKey) >= 0) {
					return entry.getValue();
				}
			}
			return null;
		}
	}

	/**
	 * @param detailMapInfos the detailMapInfos to set
	 */
	public void setDetailMapInfos(Map<String, BeanMapInfo> detailMapInfos) {
		this.detailMapInfos = detailMapInfos;
	}
}
