/** 
 * @(#)BusinessCodeApplicationListener.java 2010-7-14
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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

 
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDTO;
import com.wondersgroup.wssip.application.businesscode.dto.BusinessCodeDetailDTO;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.TimeClock;
 

/**
 * 业务类的数据缓存，例如：银行，区域等
 * 1、需要缓存的数据，请在business_code配置，数据列只能识别code和value，不是的请使用别名
 * 2、需要使用的请在WEB-INF.xml配置，cache_business配置为true表示缓存，配置了businessJsonsKey表示缓存json，配置了businessListsKey表示缓存list
 * 
 * @author xieguojun
 * @version $Revision$ 2010-7-14
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */

public class BusinessCodeApplicationListener implements ServletContextListener{

	private static final Logger logger = Logger.getLogger(BusinessCodeApplicationListener.class);
	
	/** 
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	/** 
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		cacheBusinessCode(sce.getServletContext());
	}
	
	@SuppressWarnings("rawtypes")
	private	void cacheBusinessCode(ServletContext context){
		
		String cache =context.getInitParameter("cache_business");
		
		boolean cacheJson =false;
		boolean cacheList =false;
		
		String codeJsonsKey =context.getInitParameter("businessJsonsKey");
		String codeListsKey =context.getInitParameter("businessListsKey");
		
		if(codeJsonsKey !=null)
			cacheJson =true;
		
		if(codeListsKey !=null)
			cacheList =true;
		
		
		if(cache ==null || !"true".equals(cache)||(!cacheJson && !cacheList) ){
			
			if(logger.isInfoEnabled()){
				logger.info("break cache bank info.");
			}
			return;
		}
		
		
		List<BusinessCodeDTO> businessCodes =BusinessCodeUtils.queryBusinessCode();
		
		int length=businessCodes.size();
		
		if(logger.isInfoEnabled()){
			logger.info(String.format("businessCodes size:%d",length));
		}
		
		Map<String,String> jsonMap =new HashMap<String,String>();
		Map<String,List> listMap =new HashMap<String,List>();
		
		int index=0;
		
		TimeClock timeClock = new TimeClock();
		for(BusinessCodeDTO businessCode:businessCodes){
			index++;
			timeClock.start();
			if (logger.isInfoEnabled()) {
				logger.info(String.format("Start loading business code '%s'[%d/%d]", businessCode.getType(), index,length));
			}
			
			List<BusinessCodeDetailDTO> details =BusinessCodeUtils.queryDetails(businessCode.getSql());
			
			if(cacheJson){
				jsonMap.put(businessCode.getType().toUpperCase(), toJson(details));
			}
			
			if(cacheList){
				listMap.put(businessCode.getType().toUpperCase(), details);
			}
			
			if (logger.isInfoEnabled()) {
				logger.info(String.format("Business Code '%s' loaded in %dms,business codes size:%d", businessCode.getType(), timeClock.stop(),details.size()));
			}
			
		}
		
		if(cacheJson){
			if (logger.isInfoEnabled()) {
				logger.info("cache business code json");
			}
			context.setAttribute(codeJsonsKey, jsonMap);
		}
		
		if(cacheList){
			if (logger.isInfoEnabled()) {
				logger.info("cache business code list");
			}
			context.setAttribute(codeListsKey, listMap);
		}
		
		// 当前日期以及前一天
		Date curDay = new Date();
		
		String sysDay = DateTools.formatDate(curDay, "yyyy/MM/dd");
		String preDay = DateTools.getPreviousDayFromDate(curDay, "yyyy/MM/dd");
		
		context.setAttribute("sysday", sysDay);
		context.setAttribute("preday", preDay);
	}
	
	private String toJson(List<BusinessCodeDetailDTO> detail) {
//		StringBuffer result = new StringBuffer(1024);
//
//		result.append("[['','']");
//		for (int i = 0; i < detail.size(); i++) {
//
//			String code = detail.get(i).getId();
//			String value = detail.get(i).getText();
//
//			result.append(",['").append(code).append("','").append(value).append("']");
//		}
//		result.append("]");
//		return result.toString();
		
		
		String result = VOUtils.getJsonDataFromCollection(detail).replace("\"", "'");
		
		return result;
		
	}

}
