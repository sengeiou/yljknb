/**
 * @(#)DateUtils.java Jun 5, 2010
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;

/**
 * @author liming
 * @version $Revision$ Jun 5, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class DateTools extends com.wondersgroup.framework.util.DateUtils {
	/**
	 * 得到系统当前日期
	 * 
	 * @return
	 */
	public static String getSystemYearMonthDay() {
		Date currentDate = BusinessContextUtils.getEnvironment().getCurrentDate();

		return getYYYYMMDD(currentDate);
	}
	
	/**
	 * 得到系统当前日期
	 * 
	 * @return java.util.Date
	 */
	public static java.util.Date getSystemDate() {
		Date currentDate = BusinessContextUtils.getEnvironment().getCurrentDate();
		return currentDate;
	}

	/**
	 * 获取yyyyMMdd格式的日期字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String getYYYYMMDD(java.util.Date date) {

		return formatDate(date, "yyyyMMdd");
	}

	/**
	 * 格式化日期
	 * 
	 * @param date 日期
	 * @param format 格式化
	 * @return
	 */
	public static String formatDate(java.util.Date date, String format) {

		java.text.SimpleDateFormat aateFormat = new java.text.SimpleDateFormat(format);

		return aateFormat.format(date);
	}

	/**
	 * author:xieguojun 判断字符串str是否满足yyyyMMdd时间格式
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isDate(String str) {
		return isDate(str, "yyyyMMdd");
	}

	/**
	 * 判断给定的字符串是否满足format时间格式
	 * 
	 * @param str
	 * @param format yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static boolean isDate(String str, String format) {

		if (StringUtils.isBlank(str)) {
			return false;
		}

		int pos = 0;

		pos = format.indexOf("yyyy");
		String yyyy = str.substring(pos, pos + 4);

		pos = format.indexOf("MM");
		String mm = str.substring(pos, pos + 2);

		pos = format.indexOf("dd");
		String dd = str.substring(pos, pos + 2);

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, Integer.parseInt(yyyy));
		cal.set(Calendar.MONTH, Integer.parseInt(mm) - 1);
		cal.set(Calendar.DATE, Integer.parseInt(dd));

		String tmp = null;
		pos = format.indexOf("HH");
		if (pos != -1) {
			tmp = str.substring(pos, pos + 2);
			cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tmp));
		}

		pos = format.indexOf("mm");
		if (pos != -1) {
			tmp = str.substring(pos, pos + 2);
			cal.set(Calendar.MINUTE, Integer.parseInt(tmp));
		}

		pos = format.indexOf("ss");
		if (pos != -1) {
			tmp = str.substring(pos, pos + 2);
			cal.set(Calendar.SECOND, Integer.parseInt(tmp));
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);

		java.util.Date date = cal.getTime();
		tmp = dateFormat.format(date);

		if (tmp.equals(str)) {
			return true;
		}

		return false;
	}

	/**
	 * 将字符串日期时间转换为date 20100810140202 yyyyMMddHHmmss
	 * 
	 * @param dateStr
	 * @param format
	 * @return
	 */
	public static java.util.Date parseDate(String dateStr, String format) {

		java.util.Date date = null;

		java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(format);

		try {
			date = dateFormat.parse(dateStr);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

	/**
	 * 得到当前日期的前一天
	 * 
	 * @param currDate
	 * @return
	 */
	public static String getPreviousDayFromDate(Date currDate) {
		if (currDate == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(currDate);
		cal.add(Calendar.DATE, -1);
		return formatDate(cal.getTime(), "yyyyMMdd");
	}
	
	/**
	 * 得到当前日期的前一天

	 * 
	 * @param currDate
	 * @return
	 */
	public static String getPreviousDayFromDate(Date currDate, String format) {
		if (currDate == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(currDate);
		cal.add(Calendar.DATE, -1);
		return formatDate(cal.getTime(), format);
	}

	/**
	 * 见月进年
	 * 
	 * @param curDate 当前时间，或者大的时间
	 * @param oldDate 老时间
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static int jianYueJinNian(java.util.Date curDate, java.util.Date oldDate) {

		if (curDate == null || oldDate == null)
			return -1;

		int year = curDate.getYear() - oldDate.getYear();

		int month = curDate.getMonth() - oldDate.getMonth();

		if (month > 0)
			year++;

		return year;
	}


	/**
	 * 判断dateStr1是否小于dateStr2
	 * 
	 * @param dateStr1
	 * @param dateStr2
	 * @param format
	 * @return
	 */
	public static boolean before(String dateStr1, String dateStr2, String format) {

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);

		Date date1 = null;
		Date date2 = null;

		try {
			date1 = dateFormat.parse(dateStr1);
			date2 = dateFormat.parse(dateStr2);
		}
		catch (ParseException e) {
			e.printStackTrace();
			throw new BusinessException(String.format("转换时间格式错误，dateStr1=%s,dateStr2=%s,format=%s", dateStr1, dateStr2,
					format));
		}

		return before(date1, date2);
	}

	/**
	 * 判断date1是否在date2前
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean before(Date date1, Date date2) {

		return date1.before(date2);
	}

	/**
	 * 根据传入的日期、类型（年、月、日……）、数目，来生成一个新的时间
	 * 
	 * @param oldDate：旧日期
	 * @param type：（可以是：Calendar.YEAE、Calendar.MONTH、Calendar.DATE……）
	 * @param count：传入负数表示取传入日期之前的日期
	 * @return
	 */
	public static Date processDate(Date oldDate, int type, int count) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(oldDate);
		cal.add(type, count);
		return cal.getTime();

	}

	/**
	 * 分解月份为年月格式(两位年两位月) 例如:24->0200 25->0201 23->0111
	 * 
	 * @param months
	 * @return
	 */
	public static String parseMonth(int months) {

		StringBuffer result = new StringBuffer();

		int year = months / 12;
		int month = months % 12;

		if (year < 10)
			result.append("0");
		result.append(year);

		if (month < 10)
			result.append("0");
		result.append(month);

		return result.toString();
	}

	/**
	 * 获得上一月
	 * 
	 * @param currentMonth
	 * @return
	 */
	public static String getPreviousMonth(String currentMonth) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Integer.valueOf(Integer.parseInt(currentMonth) - 1));
		cal.setTime(processDate(cal.getTime(), Calendar.MONTH, -1));
		return cal.get(Calendar.MONTH) + 1 + "";
	}
	/**
	 * 获得下个月1号

	 * 
	 * @param 
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static String getNextMonth() {
		
		Date currentDate = BusinessContextUtils.getEnvironment().getCurrentDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.set(Calendar.MONTH,currentDate.getMonth()+1);
		cal.set(Calendar.DATE, 1);
		String s = formatDate(cal.getTime(), "yyyyMMdd");
		return s;
	}

	/**
	 * 将yyyyMMdd的字符串格式格式化为yyyy-MM-dd HH:mm:ss
	 * 
	 * @param yyyyMMdd
	 * @return
	 */
	public static String formatyyyyMMdd(String yyyyMMdd) {
		if (!StringTools.hasText(yyyyMMdd))
			return "";

		return formatDate(parseDate(yyyyMMdd, "yyyyMMdd"), "yyyy-MM-dd HH:mm:ss");
	}

	public static void main(String args[]) {

//		Long l=null;
//		 System.out.println(parseDate(l.toString(), "yyyyMM"));

//		System.out.println(getOverLapDate("201001-201010", "201002-201004"));
//
//		System.out.println(getOverLapDate("201004", "201002-201004"));
//
//		System.out.println(before("201001", "201003", "yyyyMM"));
//
//		System.out.println(parseMonth(23));
//		System.out.println(parseMonth(24));
//		System.out.println(parseMonth(25));
//
//		System.out.println(parseDate("20100701", "yyyyMMdd"));
//
//		System.out.println(formatDate(processDate(new Date(), Calendar.DATE, 1), "yyyyMMdd"));
//
//		System.out.println(getPreviousMonth("12"));
//
//		System.out.println(formatyyyyMMdd("19830115"));
//
//		System.out.println(123 + getPreviousYear());
//
//		System.out.println(123 + getNextYear());
		Date date= new Date();
		System.out.println(getNextMonth());
		
		System.out.println(formatDate(date, "yyyyMMddHHmmss"));
	}

	/**
	 * 获得系统当前年份
	 * 
	 * @return
	 */
	public static String getSystemYear() {
		Date currentDate = BusinessContextUtils.getEnvironment().getCurrentDate();
		return getYYYYMMDD(currentDate).substring(0, 4);
	}

	/**
	 * 取得前一年
	 * 
	 * @param currentMonth
	 * @return
	 */
	public static String getPreviousYear() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(Integer.parseInt(getSystemYear()) - 1));
		cal.setTime(processDate(cal.getTime(), Calendar.YEAR, -1));
		return cal.get(Calendar.YEAR) + 1 + "";
	}

	/**
	 * 取得后一年
	 * 
	 * @param currentMonth
	 * @return
	 */
	public static String getNextYear() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(Integer.parseInt(getSystemYear()) - 1));
		cal.setTime(processDate(cal.getTime(), Calendar.YEAR, 1));
		return cal.get(Calendar.YEAR) + 1 + "";
	}

	/**
	 * 根据传进来的参数获得当年，上一年，下年
	 * 
	 * @param flag
	 * @return yyyy
	 */
	public static String getStringNd(String flag) {

		if ("1".equals(flag)) {
			return getSystemYear();
		}
		else if ("2".equals(flag)) {
			return getNextYear();
		}
		else if ("3".equals(flag)) {
			return getPreviousYear();
		}
		else {
			return null;
		}
	}

	/**
	 * 得到当前日期的前后某天
	 * 
	 * @param currDate
	 * @param num
	 * @return
	 */
	public static String getSomeDayDayFromDate(Date currDate, int num) {
		if (currDate == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(currDate);
		cal.add(Calendar.DATE, num);
		return formatDate(cal.getTime(), "yyyyMMdd");
	}

	/**
	 * 根据生日计算年龄
	 * @param birthDay
	 * @return
	 * @throws Exception
	 */
	public static int getAge(Date birthDay){
		Calendar cal = Calendar.getInstance();

		if (cal.before(birthDay)) {
			return -1;
		}

		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
		cal.setTime(birthDay);

		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				// monthNow==monthBirth
				if (dayOfMonthNow < dayOfMonthBirth) {
					age--;
				}
				else {
					// do nothing
				}
			}
			else {
				// monthNow>monthBirth
				age--;
			}
		}
		else {
			// monthNow<monthBirth
			// donothing
		}

		return age;
	}
	
	/** * 取得指定月份的第一天 * * @param strdate String * @return String */
	public static String getMonthBegin(Date date) {
		return formatDateByFormat(date, "yyyy-MM") + "-01";
	}

	/** * 取得指定月份的最后一天 * * @param strdate tring * @return String */
	public static String getMonthEnd(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return formatDate(calendar.getTime());
	}
	
	/**
	 * * 以指定的格式来格式化日期 * * @param date Date * @param format String * @return
	 * String
	 */
	public static String formatDateByFormat(java.util.Date date, String format) {
		String result = "";
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}
		return result;
	}
	
	/** * 常用的格式化日期 * * @param date Date * @return String */
	public static String formatDate(java.util.Date date) {
		return formatDateByFormat(date, "yyyy-MM-dd");
	}
	
	/**
	 * 将指定格式的字符串转换为日期型
	 *
	 * @param strDate
	 *            - 日期
	 * @param format
	 *            --oracle型日期格式
	 * @return 转换得到的日期
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Date stringToDate(final String strDate,
			final String oracleFormat) {
		if (strDate == null) {
			return null;
		}
		Hashtable h = new Hashtable();
		String javaFormat = new String();
		String s = oracleFormat.toLowerCase();
		if (s.indexOf("yyyy") != -1) {
			h.put(new Integer(s.indexOf("yyyy")), "yyyy");
		} else if (s.indexOf("yy") != -1) {
			h.put(new Integer(s.indexOf("yy")), "yy");
		}
		if (s.indexOf("mm") != -1) {
			h.put(new Integer(s.indexOf("mm")), "MM");
		}

		if (s.indexOf("dd") != -1) {
			h.put(new Integer(s.indexOf("dd")), "dd");
		}
		if (s.indexOf("hh24") != -1) {
			h.put(new Integer(s.indexOf("hh24")), "HH");
		}
		if (s.indexOf("mi") != -1) {
			h.put(new Integer(s.indexOf("mi")), "mm");
		}
		if (s.indexOf("ss") != -1) {
			h.put(new Integer(s.indexOf("ss")), "ss");
		}

		int intStart = 0;
		while (s.indexOf("-", intStart) != -1) {
			intStart = s.indexOf("-", intStart);
			h.put(new Integer(intStart), "-");
			intStart++;
		}

		intStart = 0;
		while (s.indexOf("/", intStart) != -1) {
			intStart = s.indexOf("/", intStart);
			h.put(new Integer(intStart), "/");
			intStart++;
		}

		intStart = 0;
		while (s.indexOf(" ", intStart) != -1) {
			intStart = s.indexOf(" ", intStart);
			h.put(new Integer(intStart), " ");
			intStart++;
		}

		intStart = 0;
		while (s.indexOf(":", intStart) != -1) {
			intStart = s.indexOf(":", intStart);
			h.put(new Integer(intStart), ":");
			intStart++;
		}

		if (s.indexOf("年") != -1) {
			h.put(new Integer(s.indexOf("年")), "年");
		}
		if (s.indexOf("月") != -1) {
			h.put(new Integer(s.indexOf("月")), "月");
		}
		if (s.indexOf("日") != -1) {
			h.put(new Integer(s.indexOf("日")), "日");
		}
		if (s.indexOf("时") != -1) {
			h.put(new Integer(s.indexOf("时")), "时");
		}
		if (s.indexOf("分") != -1) {
			h.put(new Integer(s.indexOf("分")), "分");
		}
		if (s.indexOf("秒") != -1) {
			h.put(new Integer(s.indexOf("秒")), "秒");
		}

		int i = 0;
		while (h.size() != 0) {
			Enumeration e = h.keys();
			int n = 0;
			while (e.hasMoreElements()) {
				i = ((Integer) e.nextElement()).intValue();
				if (i >= n) {
					n = i;
				}
			}
			String temp = (String) h.get(new Integer(n));
			h.remove(new Integer(n));

			javaFormat = temp + javaFormat;
		}

		SimpleDateFormat df = new SimpleDateFormat(javaFormat);
		Date myDate = new Date();
		try {
			myDate = df.parse(strDate);
		} catch (Exception e) {
			return null;
		}

		return myDate;
	}
}
