/** 
 * @(#)CommonDAO.java Jun 2, 2010
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

package com.wondersgroup.wssip.commons.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.wssip.commons.dao.exception.CommonJdbcDaoException;

/**
 * @author xieguojun
 * @version $Revision$ Jun 2, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public interface CommonJdbcDao{	
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
	public <R> R get(String sql,Class<R> clazz,Object... arguments)  throws CommonJdbcDaoException;
	
	/**
	 * 获取第一条记录，没有查询到数据返回null
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> R getFirst(String sql,Class<R> clazz,Object... arguments);
	 
	/**
	 * 查询集合数据
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> List<R> query(String sql,Class<R> clazz,Object... arguments);
	
	
	/**
	 * 执行SQL更新语句，返回影响的记录数 
	 * @param <R>
	 * @param sql	 
	 * @param arguments
	 * @return
	 */
	public int update(String sql, Object... arguments);
	
	/**
	 * 用于查询基本类型数据
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> R queryObject(String sql, Class<R> clazz, Object... arguments);
	
	public void insert(String sql);
	public void delete(String sql);
	
	/**
	 * 分页查询
	 * 
	 * @param <R>
	 * @param page
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws HibernateException 
	 */
	public <R> Page queryWithPage(Page page, String sql, Class<R> clazz, Object... arguments);
	
	
	List<Map<String,Object>> queryForList(String sql,Object... arguments);
	
	Map<String,Object> queryForMap(String sql,Object... arguments);
	
	/**
	 * 获取申请案明细
	 * 
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> List<R> querySqApplyDetails(String sql, Class<R> clazz,
			Object... arguments);

	public Page querySqApplyDetailsWithPage(Page page, String sql,Class<?> clazz, Object... arguments);
 
}
