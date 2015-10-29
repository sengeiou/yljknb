package com.wondersgroup.local.jkgz.bs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.dialect.Dialect;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wondersgroup.local.jkgz.bs.JkgzBS;
import com.wondersgroup.wssip.commons.dao.exception.CommonJdbcDaoException;
import com.wondersgroup.wssip.commons.dao.mapper.UserRowMapper;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;

@SuppressWarnings("unchecked")
public class JkgzBSImpl extends JdbcDaoSupport implements JkgzBS {

	public <R> List<R> queryWithPage(int start, int pageSize, Class<R> clazz,
			String sql, Object... arguments) {
		Dialect dialect = null;
		if (dialect == null) {
			dialect = new org.hibernate.dialect.Oracle10gDialect();
		}
		String querySQL = dialect.getLimitString(sql, start, pageSize);
		Object[] obj = new Object[arguments.length + 2];
		for (int i = 0; i < arguments.length; i++) {
			obj[i] = arguments[i];
		}
		obj[arguments.length] = Integer.valueOf(start + pageSize - 1);
		obj[(arguments.length + 1)] = Integer.valueOf(start - 1);
		List<R> result = getJdbcTemplate().query(querySQL, obj,
				new UserRowMapper(clazz));
		return result == null ? new ArrayList<R>() : result;
	}

	public <R> R get(Class<R> clazz, String sql, Object... arguments) {
		List<R> dtos = getJdbcTemplate().query(sql, arguments,
				new UserRowMapper(clazz));
		if (dtos.size() == 0) {
			return null;
		} else if (dtos.size() > 1) {
			throw new CommonJdbcDaoException(
					"返回的记录数为大于1，如果只想获取第一条记录，请使用getFirst");
		}
		return dtos.get(0);
	}

	public <R> List<R> query(Class<R> clazz, String sql, Object... arguments) {
		List<R> result = getJdbcTemplate().query(sql, arguments,
				new UserRowMapper(clazz));
		return result == null ? new ArrayList<R>() : result;
	}
	
	public Object getObject(String sql,Class clazz, Object... arguments){
		return CommonJdbcDaoUtils.queryObject(sql, clazz, arguments);
	}
	
	public Map<String,Object> queryForMap(String sql,Object... arguments){
		return getJdbcTemplate().queryForMap(sql, arguments);
	}
	
	public void insertOrUpdate(String sql,Object... arguments){
		getJdbcTemplate().update(sql,arguments); 
	}
}
