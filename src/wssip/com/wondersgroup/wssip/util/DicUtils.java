/** 
 * @(#)DicUtils.java Jun 22, 2010
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

package com.wondersgroup.wssip.util;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.wssip.application.businesscode.BusinessCodeUtils;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDTO;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDetailDTO;
import com.wondersgroup.wssip.commons.dictionary.DictionaryUtils;
import com.wondersgroup.wssip.commons.dictionary.codes.bo.Aa09;
import com.wondersgroup.wssip.commons.dictionary.codes.bo.Aa10;

/**
 * @author xieguojun
 * @version $Revision$ Jun 22, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class DicUtils {
	
/*	public static Map<String,List<BusinessCodeDetailDTO>> getAllDic(HttpServletRequest request){			
		return (Map<String,List<BusinessCodeDetailDTO>> )request.getSession().getServletContext().getAttribute("dicList");	
	}
     
 	public static List<BusinessCodeDetailDTO> getDic(HttpServletRequest request,String type){
 		Map<String,List<BusinessCodeDetailDTO>> allDic=DicUtils.getAllDic(request);
		return allDic.get(type);	
	}*/
 	
 	public static String getDicItemName(String type,String itemCode){
 		if(!StringTools.hasText(type)||!StringTools.hasText(itemCode)) 
 		return null;
 		
 		BusinessCodeDTO dto=BusinessCodeUtils.queryBusinessCodeDTO(type);
 		List<BusinessCodeDetailDTO> detailDTOList=BusinessCodeUtils.queryDetails(dto.getSql());
 		for (BusinessCodeDetailDTO item:detailDTOList){
 			if(itemCode.equals(item.getText()))
 				return item.getText();
 		}
		return null;	
	}
 	
 	
 	/**
 	 *  根据码表的代码与值获取对应的中文
 	 * @param type 码表代码
 	 * @param itemCode 对应的值
 	 * @return 对应值的中文
 	 */
 	public static String getItemName(String type,String itemCode){
 		if(!StringTools.hasText(type)||!StringTools.hasText(itemCode)) 
 		return null;
 		
 		BusinessCodeDTO dto=BusinessCodeUtils.queryBusinessCodeDTO(type);
 		List<BusinessCodeDetailDTO> detailDTOList=BusinessCodeUtils.queryDetails(dto.getSql());
 		for (BusinessCodeDetailDTO item:detailDTOList){
 			if(itemCode.equals(item.getId()))
 				return item.getText();
 		}
		return null;	
	}
     
	/**
	 * 根据dateStr过滤字典
	 * @param aa10s   
	 * @param dateStr  格式yyyyMMdd
	 * @return
	 */
	public static List<Aa10> filterByDate(List<Aa10> aa10s,String dateStr){
		
		if(!StringTools.hasText(dateStr))
			return aa10s;
		
		List<Aa10> result =new ArrayList<Aa10>();
		
		for(Aa10 aa10:aa10s){
			
			if(dateStr.compareTo(aa10.getInDate())<=0 &&dateStr.compareTo(aa10.getOutDate())>=0){
				result.add(aa10);
			}
		}
		
		return result;		
	}
	
	
	/**
	 * 根据codeType和code查找父节点
	 * @param codeType
	 * @param sonCode
	 * @return
	 */
	public static Aa10 getParentAa10(String codeType,String sonCode){
		
		Aa09 aa09 = DictionaryUtils.getCodeService().getCodeTypeByCode(codeType);
		Aa10 aa10 = DictionaryUtils.getCodeService().getCodeInfoByTypeAndCode(aa09,sonCode);
		
		return aa10.getParent(); 
	}

}
