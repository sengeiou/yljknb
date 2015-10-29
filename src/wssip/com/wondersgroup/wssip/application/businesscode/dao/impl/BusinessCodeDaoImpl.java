/** 
 * @(#)BusinessCodeDaoImpl.java 2010-7-14
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

package com.wondersgroup.wssip.application.businesscode.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.wondersgroup.wssip.application.businesscode.dao.BusinessCodeDao;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDTO;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDetailDTO;
 

/**
 * @author xieguojun
 * @version $Revision$ 2010-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BusinessCodeDaoImpl extends JdbcTemplate implements BusinessCodeDao{
	
	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.businesscode.dao.BusinessCodeDao#queryBusinessCodeDTO(java.lang.String)
	 */
	public BusinessCodeDTO queryBusinessCodeDTO(String sql) {
		return (BusinessCodeDTO)queryForObject(sql, new RowMapper(){
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				BusinessCodeDTO result =new BusinessCodeDTO();				
				result.setType(rs.getString("type"));
				result.setSql(rs.getString("sql"));				
				return result;
			}});
	}
 

	/**
	 * 
	 * @see com.wondersgroup.wssip.commons.businesscode.dao.BusinessCodeDao#queryDetails(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<BusinessCodeDetailDTO> queryDetails(String sql) {

		return query(sql, new RowMapper(){
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				BusinessCodeDetailDTO result =new BusinessCodeDetailDTO();
				
				result.setId(rs.getString("code"));
				result.setText(rs.getString("value"));
				
				return result;
			}});
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.businesscode.dao.BusinessCodeDao#query(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<BusinessCodeDTO> query(String sql) {
		
		return query(sql, new RowMapper(){
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				BusinessCodeDTO result =new BusinessCodeDTO();
				
				result.setType(rs.getString("type"));
				result.setSql(rs.getString("sql"));
				
				return result;
			}});
	}



}
