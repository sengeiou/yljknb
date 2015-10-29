/** 
 * @(#)BusinessCodeUtils.java 2010-7-14
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

package com.wondersgroup.wssip.application.businesscode;

import java.util.List;

import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDTO;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDetailDTO;
import com.wondersgroup.wssip.application.businesscode.service.BusinessCodeService;

 
/**
 * @author xieguojun
 * @version $Revision$ 2010-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class BusinessCodeUtils {
	
	private static BusinessCodeService businessCodeService;
	
	public BusinessCodeUtils(BusinessCodeService businessCodeService){
			
		BusinessCodeUtils.businessCodeService =businessCodeService;
	}
	
   public static BusinessCodeDTO queryBusinessCodeDTO(String type){
		
		String sql="select bc_type as type,bc_sql as sql from ip_business_code where bc_status ='1' and bc_type='"+type+"'";
		
		return  businessCodeService.queryBusinessCodeDTO(sql);
	}
	
	public static List<BusinessCodeDTO> queryBusinessCode(){
		
		String sql="select bc_type as type,bc_sql as sql from ip_business_code where bc_status ='1' ";
		
		return  businessCodeService.query(sql);
	}
	
	public static List<BusinessCodeDetailDTO> queryDetails(String sql){
	
		return businessCodeService.queryDetails(sql);
	}

}
