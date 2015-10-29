package com.wondersgroup.wssip.commons.dao.utils;

/** 
 * @(#)CommonDAOUtils.java Jun 2, 2010
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


import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.datasource.DataSourceUtils;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.wssip.commons.dao.CommonJdbcDao;
import com.wondersgroup.wssip.commons.dao.exception.CommonJdbcDaoException;
import com.wondersgroup.wssip.commons.dao.impl.CommonJdbcDaoImpl;

/**
 * @author xieguojun
 * @version $Revision$ Jun 2, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class CommonJdbcDaoUtils {
	
	public CommonJdbcDaoUtils(CommonJdbcDao commonJdbcDAO){
		
		CommonJdbcDaoUtils.commonJdbcDAO = commonJdbcDAO;
	}
	 
	/**
	 * 查询集合数据
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public static <R> List<R> query(String sql,Class<R> clazz,Object... arguments){
		
		return getCommonJdbcDAO().query(sql, clazz,arguments);
	}
	
	
	
	/**
	 * 根据sql，根据clazz的配置，返回对应的单个对象
	 * 1、记录不存在，返回null
	 * 2、记录数位1，返回记录
	 * 3、记录数大于1，抛出异常
	 * @param <R>
	 * @param sql   查询sql
	 * @param clazz 返回dto的class
	 * @param arguments 参数列表
	 * @return
	 */
	public static <R> R get(String sql,Class<R> clazz,Object... arguments){
		
		try {
			return (R)getCommonJdbcDAO().get(sql, clazz,arguments);
		}
		catch (CommonJdbcDaoException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 获取第一条记录，没有查询到数据返回null
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public static <R> R getFirst(String sql,Class<R> clazz,Object... arguments){
		
		return (R)getCommonJdbcDAO().getFirst(sql, clazz,arguments);
	}
	
	/**
	 * 用于查询基本类型数据
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public static <R> R queryObject(String sql,Class<R> clazz,Object ...arguments){
		
		return getCommonJdbcDAO().queryObject(sql, clazz, arguments);
	}
	/**
	 * 查询数据集合，不封装为对象，是一个Map结构
	 * 
	 * @param sql
	 * @param arguments
	 * @return
	 */
	public static List<Map<String,Object>> queryForList(String sql,Object ...arguments){
		return getCommonJdbcDAO().queryForList(sql, arguments);
	}
	
	/**
	 * 
	 * @param sql
	 * @param arguments
	 * @return
	 */
	public static Map<String,Object> queryForMap(String sql,Object ...arguments){
		return getCommonJdbcDAO().queryForMap(sql, arguments);
	}
	
	/**
	 * 用于分页查询
	 * @param <R>
	 * @param page
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public static <R> Page queryWithPage(Page page,String sql,Class<R> clazz, Object...arguments){
		return getCommonJdbcDAO().queryWithPage(page, sql, clazz, arguments);
	}
 
	/**
	 * 执行SQL更新语句，返回影响的记录数 
	 * @param <R>
	 * @param sql	 
	 * @param arguments
	 * @return
	 */
	public static <R> int update(String sql,Object ...arguments){
		
		return getCommonJdbcDAO().update(sql, arguments);
	}
	public static void delete(String sql){
		getCommonJdbcDAO().delete(sql);
	}
	/**
	 * 执行SQL更新语句
	 * @author wuchunying
	 * @return
	 */
	public static void insert(String sql){
		
		getCommonJdbcDAO().insert(sql);
	}
	
	private static CommonJdbcDao commonJdbcDAO;

	public static CommonJdbcDao getCommonJdbcDAO() {
		return commonJdbcDAO;
	}

	public static void setCommonJdbcDAO(CommonJdbcDao commonJdbcDAO) {
		CommonJdbcDaoUtils.commonJdbcDAO = commonJdbcDAO;
	}
	
	/**
	 * 获取申请案明细
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public static <R> List<R> querySqApplyDetails(String sql,Class<R> clazz,Object ...arguments){
		
		return getCommonJdbcDAO().querySqApplyDetails(sql, clazz, arguments);
	}

	public static Page querySqApplyDetailsWithPage(Page page, String sql, Class<?> clazz, Object...arguments) {
		return getCommonJdbcDAO().querySqApplyDetailsWithPage(page, sql, clazz, arguments);
	}

	public static Connection getConnection() {
		try {
			return DataSourceUtils
					.getConnection(((CommonJdbcDaoImpl) getCommonJdbcDAO())
							.getDataSource());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
}
