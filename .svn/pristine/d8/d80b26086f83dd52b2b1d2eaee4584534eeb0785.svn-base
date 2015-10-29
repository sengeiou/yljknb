/** 
 * @(#)MappingUtils.java May 20, 2009
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.util.CollectionUtils;

/**
 * @author suhualin
 * @version $Revision: 16083 $ May 20, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class MappingUtils {
	private static ColumnMapFactory columnMapFactory;

	private static ColumnConverter columnConverter;

	/**
	 * @param columnMapFactory the columnMapFactory to set
	 */
	public void setColumnMapFactory(ColumnMapFactory columnMapFactory) {
		MappingUtils.columnMapFactory = columnMapFactory;
	}

	/**
	 * @param columnConverter the columnConverter to set
	 */
	public void setColumnConverter(ColumnConverter columnConverter) {
		MappingUtils.columnConverter = columnConverter;
	}

	/**
	 * 获取映射信息
	 * 
	 * @param beanType 映射类型
	 * @return
	 */
	public static BeanMapInfo getBeanMapInfo(Class<?> beanType) {
		return columnMapFactory.getMapInfo(beanType);
	}

	/**
	 * 将通用数据转换为JavaBean数据
	 * 
	 * @param baseInfo 基础信息
	 * @param details 详细信息Map
	 * @param beanType JavaBean类型
	 * @return
	 */
	public static <T> T toBean(ColumnIndexModel baseInfo, Map<String, List<ColumnDetailModel>> detailInfos,
			Class<T> beanType) {
		BeanMapInfo beanMapInfo = columnMapFactory.getMapInfo(beanType);
		if (beanMapInfo == null) {
			throw new IllegalArgumentException(String
					.format("Bean type %s doesn't support mapping", beanType.getName()));
		}

		T bean;
		try {
			bean = beanType.newInstance();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}

		populateBean(baseInfo, bean, beanMapInfo);

		for (Entry<String, List<ColumnDetailModel>> entry : detailInfos.entrySet()) {
			BeanMapInfo detailMapInfo = beanMapInfo.getDetailMapInfo(entry.getKey());
			if (detailMapInfo != null) {
				populateBeanDetail(entry.getValue(), bean, entry.getKey(), detailMapInfo);
			}
		}

		return bean;
	}

	@SuppressWarnings({ "unchecked"})
	public static <T extends ColumnIndexModel, D extends ColumnDetailModel> T fromBean(Class<T> columnIndexModelType,
			List<D> detailInfos, Object bean, Class<D> detailInfoType) {
		if (bean == null) {
			return null;
		}

		BeanMapInfo beanMapInfo = columnMapFactory.getMapInfo(bean.getClass());
		if (beanMapInfo == null) {
			throw new IllegalArgumentException(String.format("Bean type %s doesn't support mapping", bean.getClass()
					.getName()));
		}
		T model;
		try {
			model = columnIndexModelType.newInstance();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}

		populateColumnIndexModel(model, bean, beanMapInfo);
		for (Entry<String, BeanMapInfo> entry : beanMapInfo.getDetailMapInfos().entrySet()) {
			String[] keys = StringUtils.split(entry.getKey(), ':');
			populateColumnIndexModelDetail(detailInfoType, (List<ColumnDetailModel>) detailInfos, bean, keys[0], keys[1], entry.getValue());
		}

		return model;
	}

	/**
	 * 填充基本信息到JavaBean
	 * 
	 * @param model
	 * @param bean
	 * @param beanMapInfo
	 */
	protected static void populateBean(ColumnIndexModel model, Object bean, BeanMapInfo beanMapInfo) {
		if (model == null || bean == null) {
			return;
		}
		else {
			for (ColumnMapInfo columnMapInfo : beanMapInfo.getColumnMapInfos()) {
				try {
					PropertyUtils.setProperty(bean, columnMapInfo.getProperty(), columnConverter.fromString(model
							.getData(columnMapInfo.getColumnIndex()), columnMapInfo));
				}
				catch (RuntimeException e) {
					throw e;
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	/**
	 * 填充详细信息到JavaBean
	 * 
	 * @param details
	 * @param bean
	 * @param property
	 * @param beanMapInfo
	 */
	protected static void populateBeanDetail(List<ColumnDetailModel> details, Object bean, String property,
			BeanMapInfo beanMapInfo) {
		if (details == null || details.size() == 0 || bean == null) {
			return;
		}
		else {
			List<Object> detailInfos = new ArrayList<Object>();
			for (ColumnIndexModel model : details) {
				Object element;
				try {
					element = beanMapInfo.getType().newInstance();
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
				populateBean(model, element, beanMapInfo);
				detailInfos.add(element);
			}
			try {
				PropertyUtils.setProperty(bean, property, detailInfos);
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * 填充数据到列数据模型
	 * 
	 * @param model
	 * @param bean
	 * @param beanMapInfo
	 */
	protected static void populateColumnIndexModel(ColumnIndexModel model, Object bean, BeanMapInfo beanMapInfo) {
		if (model == null || bean == null) {
			return;
		}
		else {
			for (ColumnMapInfo columnMapInfo : beanMapInfo.getColumnMapInfos()) {
				try {
					model.setData(columnMapInfo.getColumnIndex(), columnConverter.toString(PropertyUtils.getProperty(
							bean, columnMapInfo.getProperty()), columnMapInfo));
				}
				catch (RuntimeException e) {
					e.printStackTrace();
					throw e;
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	/**
	 * 填充详细信息到JavaBean
	 * 
	 * @param details
	 * @param bean
	 * @param property
	 * @param beanMapInfo
	 */
	protected static <T extends ColumnDetailModel> void populateColumnIndexModelDetail(Class<T> columnIndexModelType,
			List<ColumnDetailModel> details, Object bean, String property, String mapKey, BeanMapInfo beanMapInfo) {
		if (bean == null) {
			return;
		}
		else {
			Collection<?> detailInfos = null;
			try {
				detailInfos = (Collection<?>) PropertyUtils.getProperty(bean, property);
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}

			if (CollectionUtils.isEmpty(detailInfos)) {
				return;
			}

			for (Object element : detailInfos) {
				ColumnDetailModel model;
				try {
					model = columnIndexModelType.newInstance();
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
				populateColumnIndexModel(model, element, beanMapInfo);
				model.setMapKey(mapKey);
				details.add(model);
			}
		}
	}
}
