/** 
 * @(#)BusinessCodeServiceImpl.java 2010-7-14
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

package com.wondersgroup.wssip.application.businesscode.service.impl;

import java.util.List;

import com.wondersgroup.wssip.application.businesscode.dao.BusinessCodeDao;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDTO;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDetailDTO;
import com.wondersgroup.wssip.application.businesscode.service.BusinessCodeService;

/**
 * @author xieguojun
 * @version $Revision$ 2010-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BusinessCodeServiceImpl implements BusinessCodeService{ 
	
	private	BusinessCodeDao businessCodeDao;
	
	/** 
	 * @see com.wondersgroup.wssip.commons.businesscode.service.BusinessCodeService#queryBusinessCodeDTO(java.lang.String)
	 */	
	public BusinessCodeDTO queryBusinessCodeDTO(String sql) {
		return businessCodeDao.queryBusinessCodeDTO(sql);
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.businesscode.service.BusinessCodeService#query(java.lang.String)
	 */
	public List<BusinessCodeDTO> query(String sql) {

		return businessCodeDao.query(sql);
	}

	/** 
	 * @see com.wondersgroup.wssip.commons.businesscode.service.BusinessCodeService#queryDetails(java.lang.String)
	 */
	public List<BusinessCodeDetailDTO> queryDetails(String sql) {
		 
		return businessCodeDao.queryDetails(sql);
	}

	public BusinessCodeDao getBusinessCodeDao() {
		return businessCodeDao;
	}

	public void setBusinessCodeDao(BusinessCodeDao businessCodeDao) {
		this.businessCodeDao = businessCodeDao;
	}


	

	 

}
