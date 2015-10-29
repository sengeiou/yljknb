/** 
 * @(#)CommonHibernateDao.java Jun 3, 2010
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

import org.hibernate.criterion.DetachedCriteria;

import com.wondersgroup.framework.core5.storeprocedure.SpParameters;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;
import com.wondersgroup.wssip.commons.dao.bo.SpCallDTO;


/**
 * hibernate公用dao
 * 
 * @author xieguojun
 * @version $Revision$ Jun 3, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public interface CommonHibernateDao{
	
	public <T> void save(T t);
	
	public <T> void update(T t);
	
	public <T> void delete(T t);
	
	public <T> T load(Class<T> clazz,java.io.Serializable id);
	
	public void flush();
	
	/**
	 * 根据流水号类型，获取核心库序列号
	 * 
	 * @param 流水号类型
	 * @return
	 */
	public String getSequence(String type);
	
	/**
	 * 根据数据库序列号名，获取序列号
	 * 
	 * @param sequenceName
	 * @return
	 */
	public String getSequenceValue(String sequenceName);
	
	/**
	 * 获取序列号
	 * 
	 * @param sequenceName
	 * @param format 格式化字符串(oracle格式）
	 * @return
	 */
	public String getSequenceValue(String sequenceName,String format);
	
	/**
	 * 查询单条记录，查询条件能够匹配数据条数： =1：返回 >1:异常 =0:null
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public <T> T get(String hql,Object...values);
	
	/**
	 * 查询列表数据
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public <T> List<T> find(String hql,Object... values);
	
	/**
	 * 查询第一条记录，查询不到数据返回null
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public <T> T findFirst(String hql,Object... values);
	
	/**
	 * @param <T>
	 * @param criteria
	 * @return
	 */
	public <T> List<T> findByCriteria(DetachedCriteria criteria);
	
	/**
	 * @param <T>
	 * @param criteria
	 * @param start
	 * @param limit
	 * @return
	 */
	public <T> List<T> findByCriteria(DetachedCriteria criteria,int start,int limit);
	
	/**
	 * 调用存储函数
	 * 
	 * @param <T>
	 * @param name
	 * @param resultType
	 * @return
	 */
	public <T> T executeStoreFunction(String name, Class<T> resultType);
	
	/**
	 * 调用存储过程，不带任何参数
	 * 
	 * @param name
	 */
	public void executeStoreProcedure(String name);
	
	/**
	 * 调用存储过程
	 * 
	 * @param name
	 * @param parameters 入参
	 * @param inValues
	 * @return
	 */
	public Object[] executeStoreProcedure(final String name, final SpParameters parameters, final Object... inValues);
	
	/**
	 * @param name
	 * @param parameterBean
	 */
	public void executeStoreProcedure(final String name, final SpSupportBean parameterBean);

	 /**
		 * 调用sp，返回代码不为0时，表示执行异常
		 * 
		 * @param name sp name
		 * @param paramsStr 入参
		 * @return
		 */
	public SpCallDTO executeStoreProcedure(String name,String paramsStr);
	
	/**
	 * 通过sql调用存储函数，传入存储函数名称和参数
	 * @param name
	 * @param paraments
	 * @return
	 */
	public String getStoreFun(String name,String paraments);
}
