/** 
 * @(#) ExportExcelUtils.java
 *
 * @(#) com.wondersgroup.wssip.util.ExportExcelUtils
 * @(#) Administrator
 * @(#) 2013-8-28 
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 */
package com.wondersgroup.wssip.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.mycommon.web.vo.GridColumnVO;

/**
 * @author Administrator
 * 
 */
public class ExportExcelUtils {

	public static void exportExcel(HttpServletRequest request ,HttpServletResponse response, List<GridColumnVO> columns, List<Map<String, Object>> data) {
		final String userAgent = request.getHeader("USER-AGENT");
		String fileName = "疑点明细表格" + randomFileName();
		
		try {
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				fileName = URLEncoder.encode(fileName, "UTF8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				fileName = new String(fileName.getBytes(), "ISO-8859-1");
			} else {
				fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		response.setCharacterEncoding("UTF-8");
		response.addHeader("Content-Disposition", "attachment;filename=" + fileName + ".xls");
		response.setContentType("application/ms-excel");
		try {
			response.getWriter().write(exportTable(columns, data));
			response.getWriter().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static String exportTable(List<GridColumnVO> columns, List<Map<String, Object>> data) {

		StringBuffer sb = new StringBuffer();

		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		sb.append("<table cellspacing=\"0\" cellpadding=\"5\" rules=\"all\" border=\"1\">");
		
		sb.append("<tr height='40' style=\"font-weight: bold; white-space: nowrap;\">");
		
		for (GridColumnVO column : columns) {
			sb.append("<td>" + column.getHeader().trim() + "</td>");
		}
		
		sb.append("</tr>");

		for (int i = 0; i < data.size(); i++) {
			Map<String, Object> record = data.get(i);
			sb.append("<tr height='30'>");
			for (GridColumnVO column : columns) {
				
				if (column.getField() == null) continue;
				Object value = record.get(column.getField());
				if(value == null){
					value = "";
				}
				sb.append("<td>" + value.toString().trim() + "</td>");
			}
			sb.append("</tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}

	private static String randomFileName() {
		String sysdate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		int rom = new Random().nextInt(10000);
		String filename = sysdate + String.valueOf(rom);
		return filename;
	}

}
