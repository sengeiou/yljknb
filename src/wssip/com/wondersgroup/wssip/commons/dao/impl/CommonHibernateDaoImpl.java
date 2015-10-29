/** 
 * @(#)CommonHibernateDaoImpl.java Jun 3, 2010
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
 
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.dialect.Dialect;
import org.hibernate.impl.SessionImpl;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
import com.wondersgroup.framework.core5.storeprocedure.BeanStoreProcedure;
import com.wondersgroup.framework.core5.storeprocedure.SpParameter;
import com.wondersgroup.framework.core5.storeprocedure.SpParameters;
import com.wondersgroup.framework.core5.storeprocedure.StoreProcedure;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;
import com.wondersgroup.wssip.commons.dao.CommonHibernateDao;
import com.wondersgroup.wssip.commons.dao.bo.SpCallDTO;
import com.wondersgroup.wssip.commons.dao.exception.SpCallException;

/**
 * @author xieguojun
 * @version $Revision$ Jun 3, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class CommonHibernateDaoImpl extends HibernateDaoSupport implements CommonHibernateDao{

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#load(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	public <T> T load(Class<T> clazz,Serializable id) {
		return (T)this.getHibernateTemplate().get(clazz, id);
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#save(java.lang.Object)
	 */
	public <T> void save(T t) {		 
		this.getHibernateTemplate().save(t);
		//flush();
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#update(java.lang.Object)
	 */
	public <T> void update(T t) {
		this.getHibernateTemplate().update(t);
		//flush();
	}
	
	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#delete(java.lang.Object)
	 */
	public <T> void delete(T t) {
		this.getHibernateTemplate().delete(t);
		flush();
	}
	
	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#flush()
	 */
	public void flush(){
		getHibernateTemplate().flush();
	}
	
	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#getYbkrnlSequence(java.lang.String)
	 */
	public String getSequence(String type) {
		
        String queryString="select FUNC_GENERATE_LSH('"+type+"') id from dual";
		
		SQLQuery query = getSession().createSQLQuery(queryString);

		return String.valueOf(query.uniqueResult());
	}


	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#getSequenceValue(java.lang.String)
	 */
	public String getSequenceValue(String sequenceName) {
		
		Dialect dialect = ((SessionImpl) getSession()).getFactory().getDialect();

		String queryString = dialect.getSequenceNextValString(sequenceName);

		SQLQuery query = getSession().createSQLQuery(queryString);

		return String.valueOf(query.uniqueResult());
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#getSequenceValue(java.lang.String, java.lang.String)
	 */
	public String getSequenceValue(String sequenceName, String format) {

		String queryString=getSequenceNextValString(sequenceName,format);
		
		SQLQuery query = getSession().createSQLQuery(queryString);

		return String.valueOf(query.uniqueResult());
	}
	
	protected	String getSelectSequenceNextValString(String sequenceName){
		return sequenceName+".nextval";
	}
	
	protected String getSequenceNextValString(String sequenceName) {
		return "select " + getSelectSequenceNextValString( sequenceName ) + " from dual";
	}
	
	protected String getSequenceNextValString(String sequenceName,String format) {
		if(format ==null)
			return getSelectSequenceNextValString(sequenceName);
		
		return "select to_char(" + getSelectSequenceNextValString( sequenceName )+",'" +format+ "') from dual";
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#get(java.lang.String)
	 */
	public <T> T get(String hql,Object...values ) {
		
		List<T> datas =find(hql,values);	
		
		if(datas.size()>1){
			throw new RuntimeException();
		}else if(datas.size()==1){
			return datas.get(0);			
		}

		return null;
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#find(java.lang.String, java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> find(String hql, Object... values) {
		 
		return getHibernateTemplate().find(hql, values);
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#findFirst(java.lang.String, java.lang.Object[])
	 */
	public <T> T findFirst(String hql, Object... values) {
	 
		List<T> datas =find(hql,values);	
		
		if(datas.size()>=1)
			return datas.get(0);
		
		return null;
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#findByCriteria(org.hibernate.Criteria)
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> findByCriteria(DetachedCriteria criteria) {
		
		return this.getHibernateTemplate().findByCriteria(criteria);
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#findByCriteria(org.hibernate.Criteria, int, int)
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> findByCriteria(DetachedCriteria criteria, int start, int limit) {
		 
		return this.getHibernateTemplate().findByCriteria(criteria, start, limit);
	}
	
	
	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#executeStoreFunction(java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
	public <T> T executeStoreFunction(String name, Class<T> resultType) {
		return (T) executeStoreProcedure(name, new SpParameters().setReturnParameter(SpParameter
				.createReturnParameter(resultType)))[0];
	}

	 
	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#executeStoreProcedure(java.lang.String)
	 */
	public void executeStoreProcedure(String name) {
		executeStoreProcedure(name, (SpParameters) null);
	}

	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#executeStoreProcedure(java.lang.String, com.wondersgroup.framework.core5.storeprocedure.SpParameters, java.lang.Object[])
	 */
	public Object[] executeStoreProcedure(final String name, final SpParameters parameters, final Object... inValues) {
		return (Object[]) getHibernateTemplate().execute(new HibernateCallback() {
			@SuppressWarnings("deprecation")
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				session.flush(); 
				return new StoreProcedure(name, parameters).execute(session.connection(), inValues);
			}
		});
	}

	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#executeStoreProcedure(java.lang.String, com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean)
	 */
	public void executeStoreProcedure(final String name, final SpSupportBean parameterBean) {
		getHibernateTemplate().execute(new HibernateCallback() {
			@SuppressWarnings("deprecation")
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				session.flush();  
				BeanStoreProcedure.execute(session.connection(), name, parameterBean);
				return null;
			}
		});
	}

	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.dao.CommonHibernateDao#executeStoreProcedure(java.lang.String, java.lang.String)
	 */
	public SpCallDTO executeStoreProcedure(String name,String paramsStr) throws SpCallException{
		
		SpCallDTO spCallDTO =new SpCallDTO();
		spCallDTO.setParamsStr(paramsStr);
		
		this.executeStoreProcedure(name, spCallDTO);
		
		return spCallDTO;
	}

	/**
	 * 执行存储函数
	 * @param name
	 * @param paraments
	 * @return
	 */
	public String getStoreFun(String name,String paraments) {
		
        String queryString="select "+name+"("+paraments+") id from dual";
		
		SQLQuery query = getSession().createSQLQuery(queryString);

		return String.valueOf(query.uniqueResult());
	}
}
