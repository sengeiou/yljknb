package com.wondersgroup.wssip.commons.dao.utils;

/** 
 * @(#)CommonHibernateDaoUtils.java Jun 4, 2010
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

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.storeprocedure.SpParameters;
import com.wondersgroup.framework.core5.storeprocedure.bean.SpSupportBean;
import com.wondersgroup.wsscclib.codec.CodecFactory;
import com.wondersgroup.wssip.commons.dao.CommonHibernateDao;
import com.wondersgroup.wssip.commons.dao.bo.SpCallDTO;
import com.wondersgroup.wssip.commons.dao.exception.SpCallException;

/**
 * @author xieguojun
 * @version $Revision$ Jun 4, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class YbkrnlHibernateDaoUtils {

	public YbkrnlHibernateDaoUtils(CommonHibernateDao commonHibernateDao) {
		YbkrnlHibernateDaoUtils.commonHibernateDao = commonHibernateDao;
	}

	private static CommonHibernateDao commonHibernateDao;

	public static CommonHibernateDao getCommonHibernateDao() {
		return commonHibernateDao;
	}

	public static void setCommonHibernateDao(CommonHibernateDao commonHibernateDao) {
		YbkrnlHibernateDaoUtils.commonHibernateDao = commonHibernateDao;
	}

	/**
	 * 根据流水号类型，获取核心库序列号
	 * 
	 * @param 流水号类型
	 * @return
	 */
	public static String getSequence(String type) {

		return getCommonHibernateDao().getSequence(type);
	}

	/**
	 * 根据数据库序列号名，获取序列号
	 * 
	 * @param sequenceName
	 * @return
	 */
	public static String getSequenceValue(String sequenceName) {

		return getCommonHibernateDao().getSequenceValue(sequenceName);
	}

	/**
	 * 获取序列号
	 * 
	 * @param sequenceName
	 * @param format 格式化字符串(oracle格式）
	 * @return
	 */
	public static String getSequenceValue(String sequenceName, String format) {

		return commonHibernateDao.getSequenceValue(sequenceName, format).trim();
	}

	/**
	 * 单笔数据加载
	 * 
	 * @param <T>
	 * @param clazz
	 * @param id
	 * @return
	 */
	public static <T> T load(Class<T> clazz, Serializable id) {

		return commonHibernateDao.load(clazz, id);
	}

	/**
	 * 数据保存
	 * 
	 * @param <T>
	 * @param t
	 */
	public static <T> void save(T t) {

		getCommonHibernateDao().save(t);
	}

	/**
	 * 数据更新
	 * 
	 * @param <T>
	 * @param t
	 */
	public static <T> void update(T t) {

		getCommonHibernateDao().update(t);
	}

	/**
	 * 数据删除
	 * 
	 * @param <T>
	 * @param t
	 */
	public static <T> void delete(T t) {

		getCommonHibernateDao().delete(t);
	}

	/**
	 * 集合数据保存
	 * 
	 * @param <T>
	 * @param datas
	 */
	public static <T> void save(List<T> datas) {

		for (T t : datas) {
			save(t);
		}
	}

	/**
	 * 集合数据更新
	 * 
	 * @param <T>
	 * @param datas
	 */
	public static <T> void update(List<T> datas) {

		for (T t : datas) {
			update(t);
		}
	}

	/**
	 * 刷新session
	 */
	public static void flushSession() {
		getCommonHibernateDao().flush();
	}

	/**
	 * 查询单条记录，查询条件能够匹配数据条数： =1：返回 >1:异常 =0:null
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public static <T> T get(String hql, Object... values) {

		return getCommonHibernateDao().get(hql, values);
	}

	/**
	 * 查询第一条记录，查询不到数据返回null
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public static <T> T findFirst(String hql, Object... values) {

		return getCommonHibernateDao().findFirst(hql, values);
	}

	/**
	 * 查询列表数据
	 * 
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public static <T> List<T> find(String hql, Object... values) {

		return getCommonHibernateDao().find(hql, values);
	}

	/**
	 * @param <T>
	 * @param criteria
	 * @return
	 */
	public static <T> List<T> findByCriteria(DetachedCriteria criteria) {

		return getCommonHibernateDao().findByCriteria(criteria);
	}

	/**
	 * @param <T>
	 * @param criteria
	 * @param start
	 * @param limit
	 * @return
	 */
	public static <T> List<T> findByCriteria(DetachedCriteria criteria, int start, int limit) {

		return getCommonHibernateDao().findByCriteria(criteria, start, limit);
	}

	/**
	 * 调用存储函数
	 * 
	 * @param <T>
	 * @param name
	 * @param resultType
	 * @return
	 */
	public static <T> T executeStoreFunction(String name, Class<T> resultType) {
		return getCommonHibernateDao().executeStoreFunction(name, resultType);
	}

	/**
	 * 调用存储过程，不带任何参数
	 * 
	 * @param name
	 */
	public static void executeStoreProcedure(String name) {
		getCommonHibernateDao().executeStoreProcedure(name);
	}

	/**
	 * 调用存储过程
	 * 
	 * @param name
	 * @param parameters 入参
	 * @param inValues
	 * @return
	 */
	public static Object[] executeStoreProcedure(final String name, final SpParameters parameters,
			final Object... inValues) {
		return getCommonHibernateDao().executeStoreProcedure(name, parameters, inValues);
	}

	/**
	 * 调用sp，返回代码不为0时，表示执行异常
	 * 
	 * @param name sp name
	 * @param paramsStr 入参
	 * @return 查询返回数据
	 * @throws SpCallException 查询异常抛出异常
	 */
	public static <T> T executeStoreProcedure(String name, Object inBean, Class<T> outBeanClass)
			throws BusinessException {
		String result = null;
		String paramsStr = CodecFactory.DEFAULT.encode(inBean);

		SpCallDTO spCallDTO = getCommonHibernateDao().executeStoreProcedure(name, paramsStr);

		if (spCallDTO.getRetCode().equals(0))
			result = spCallDTO.getResult();
		else
			throw new BusinessException(spCallDTO.getErrMsg());

		if (outBeanClass == null || result == null)
			return null;

		return CodecFactory.DEFAULT.decode(result, outBeanClass);
	}

	/**
	 * @param name
	 * @param inBean
	 * @return
	 * @throws BusinessException
	 */
	public static SpCallDTO executeStoreProcedureIgnoreException(String name, Object inBean) throws BusinessException {

		String paramsStr = CodecFactory.DEFAULT.encode(inBean);

		return getCommonHibernateDao().executeStoreProcedure(name, paramsStr);
	}

	/**
	 * @param name
	 * @param parameterBean
	 */
	public static void executeStoreProcedure(final String name, final SpSupportBean parameterBean) {
		getCommonHibernateDao().executeStoreProcedure(name, parameterBean);
	}

	/**
	 * @param name
	 * @param inBean
	 * @return
	 * @throws BusinessException
	 */
	public static SpCallDTO executeStoreProcedure(String name, SpCallDTO spCallDTO) throws BusinessException {
		SpCallDTO result = getCommonHibernateDao().executeStoreProcedure(name, spCallDTO.getParamsStr());

		if (result.getRetCode() != 0) {
			throw new BusinessException(result.getErrMsg());
		}

		return result;
	}

	public static String getStoreFun(String name, String paraments) {

		return getCommonHibernateDao().getStoreFun(name, paraments);
	}
}
