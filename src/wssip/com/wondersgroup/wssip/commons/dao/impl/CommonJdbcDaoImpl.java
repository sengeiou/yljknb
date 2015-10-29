/** 
 * @(#)CommonDAOImpl.java Jun 2, 2010
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
package com.wondersgroup.wssip.commons.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.dialect.Dialect;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.wssip.commons.SqApplyRowMapperUtils;
import com.wondersgroup.wssip.commons.dao.CommonJdbcDao;
import com.wondersgroup.wssip.commons.dao.InstanceUtils;
import com.wondersgroup.wssip.commons.dao.exception.CommonJdbcDaoException;
import com.wondersgroup.wssip.commons.dao.mapper.UserRowMapper;

/**
 * @author xieguojun
 * @version $Revision$ Jun 2, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class CommonJdbcDaoImpl extends JdbcDaoSupport implements CommonJdbcDao{
	 
	/** 
	 * @throws CommonJdbcDaoException 
	 * @see com.wondersgroup.wssip.commons.dao.CommonDAO#get(java.lang.String, java.lang.Class, java.lang.Object[])
	 */
	public <R> R get(String sql, Class<R> clazz, Object... arguments) throws CommonJdbcDaoException {
		
		List<R> dtos =query(sql,clazz,arguments);
		
		if(dtos.size() ==0){
			return null;
		}else if(dtos.size()>1){
			throw new CommonJdbcDaoException("返回的记录数为大于1，如果只想获取第一条记录，请使用getFirst");
		}
		
		return dtos.get(0);
		 
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonDAO#query(java.lang.String, java.lang.Class, java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	public <R> List<R> query(String sql, Class<R> clazz, Object... arguments) {
		
		List<R> result =getJdbcTemplate().query(sql,arguments,new UserRowMapper(clazz)); 
		
		return result==null?new ArrayList<R>():result;
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonJdbcDao#getFirst(java.lang.String, java.lang.Class, java.lang.Object[])
	 */
	public <R> R getFirst(String sql, Class<R> clazz, Object... arguments) {

		List<R> dtos =query(sql,clazz,arguments);
		
		if(dtos.size()==0)
			return null;
		
		return dtos.get(0);
	}
	
	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonDAO#update(java.lang.String, java.lang.Object[])
	 */
	public int update(String sql,  Object... arguments) {
		
		int result =getJdbcTemplate().update(sql,arguments); 
		
		return result;
	}
	
	/**
	 * 用于查询基本类型数据
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <R> R queryObject(String sql, Class<R> clazz, Object... arguments){
		try{
			return (R)getJdbcTemplate().queryForObject(sql, arguments, clazz);
		}
	    catch(Exception ex){
	    	return null;
	    }		
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> queryForList(String sql,Object... arguments){
		return getJdbcTemplate().queryForList(sql, arguments);
	}
	
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> queryForMap(String sql,Object... arguments){
		return getJdbcTemplate().queryForMap(sql, arguments);
	}
	
	
	public void insert(String sql){
		getJdbcTemplate().execute(sql);
	}
	public void delete(String sql){
		getJdbcTemplate().execute(sql);
	}
	
	public <R> Page queryWithPage(Page page, String sql, Class<R> clazz, Object... arguments) {
		
		//String countSQL = "select count(*) " + sql.substring(sql.toLowerCase().indexOf(" from ") + 1);
		String countSQL = "select count(*) from (" + sql + ")";
		page.setTotalSize(getJdbcTemplate().queryForInt(countSQL, arguments));
		
		Dialect dialect = null;
		
//		try {
//			Configuration conf = new  Configuration().configure();
//			String dialect_class = conf.configure().getProperty("dialect");
//			dialect = (Dialect)InstanceUtils.getInstance(Class.forName(dialect_class));
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		if(dialect == null){
			dialect = new org.hibernate.dialect.Oracle10gDialect();
		}
		
		String querySQL = dialect.getLimitString(sql, page.getStart(), page.getPageSize());
		Object[] obj = new Object[arguments.length + 2];
		for (int i = 0; i < arguments.length; i++) {
			obj[i] = arguments[i];
		}
		obj[arguments.length] = Integer.valueOf(page.getStart() + page.getPageSize() - 1);
		obj[(arguments.length + 1)] = Integer.valueOf(page.getStart() - 1);
		
		List<R> result = query(querySQL, clazz, obj);
		page.setCurrentPageSize(result.size());
		page.setResult(result);
		return page;
	}
	
	/**
	 * @see com.wondersgroup.wssip.commons.dao.CommonJdbcDao#querySqApplyDetails(java.lang.String,
	 *      java.lang.Class, java.lang.Object[])
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <R> List<R> querySqApplyDetails(String sql, final Class<R> clazz,Object... arguments) {


		List<R> result = getJdbcTemplate().query(sql, arguments,
				new RowMapper() {

					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {

						Object dto = InstanceUtils.getInstance(clazz);

						SqApplyRowMapperUtils.invoke(dto, rs);

						return dto;
					}
				});

		return result == null ? new ArrayList() : result;
	}

	@SuppressWarnings("rawtypes")
	public Page querySqApplyDetailsWithPage(Page page, String sql, final Class<?> clazz, Object... arguments) {
		
		String countSQL = "select count(*) from (" + sql + ")";
		page.setTotalSize(getJdbcTemplate().queryForInt(countSQL, arguments));
		
		Dialect dialect = null;
		
		if(dialect == null){
			dialect = new org.hibernate.dialect.Oracle10gDialect();
		}
		
		String querySQL = dialect.getLimitString(sql, page.getStart(), page.getPageSize());
		Object[] obj = new Object[arguments.length + 2];
		for (int i = 0; i < arguments.length; i++) {
			obj[i] = arguments[i];
		}
		obj[arguments.length] = Integer.valueOf(page.getStart() + page.getPageSize() - 1);
		obj[(arguments.length + 1)] = Integer.valueOf(page.getStart() - 1);
		
		//List result = query(querySQL, clazz, obj);
		
		List result = getJdbcTemplate().query(querySQL, obj,
				new RowMapper() {

					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {

						Object dto = InstanceUtils.getInstance(clazz);

						SqApplyRowMapperUtils.invoke(dto, rs);

						return dto;
					}
				});
		
		
		page.setCurrentPageSize(result.size());
		page.setResult(result);
		
		return page;
	}

}
