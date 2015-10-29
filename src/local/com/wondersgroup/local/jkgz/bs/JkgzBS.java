package com.wondersgroup.local.jkgz.bs;

import java.util.List;
import java.util.Map;

/**
 * 监控规则数据访问层
 * @author 王俊钊
 *
 */
public interface JkgzBS {
	/**
	 * 分页查询
	 * @param page
	 * @param gzbm
	 * @return
	 */
	public <R> List<R> queryWithPage(int start,int pageSize,Class<R> clazz,String sql,Object...arguments);
	
	/**
	 * 集合查询
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> List<R> query(Class<R> clazz,String sql, Object... arguments);
	
	/**
	 * 单个查询
	 * @param <R>
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public <R> R get(Class<R> clazz,String sql, Object... arguments);
	
	/**
	 * 属性查询
	 * @param sql
	 * @param clazz
	 * @param arguments
	 * @return
	 */
	public Object getObject(String sql,Class clazz, Object... arguments);
	
	/**
	 * 属性查询
	 * @param sql
	 * @param arguments
	 * @return
	 */
	public Map<String,Object> queryForMap(String sql,Object... arguments);
	
	/**
	 * 新增数据
	 * @param sql
	 * @param arguments
	 */
	public void insertOrUpdate(String sql,Object... arguments);
}
