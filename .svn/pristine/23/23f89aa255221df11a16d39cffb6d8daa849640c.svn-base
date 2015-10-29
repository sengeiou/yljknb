/** 
 * @(#)StringUtils.java Jun 3, 2010
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

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * @author xieguojun
 * @version $Revision$ Jun 3, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class StringTools extends org.springframework.util.StringUtils{
	
	/**
	 * 比较str1大于str2
	 * @param str1
	 * @param str2
	 * @return str1>str2 返回true
	 */
	public static	boolean greateThan(String str1,String str2){
		
		if(str1 ==null ||str2 ==null)
			return false;
		
		if(str1.compareTo(str2)>0)
			return true;
		
		return false;
		
	}
	
	/**
	 * 比较str1少于str2
	 * @param str1
	 * @param str2
	 * @return  str1<str2 返回true
	 */
	public	static	boolean lessThan(String str1,String str2){
		
		return greateThan(str2,str1);
	}
	
	/**
	 * 比较字符相等
	 * @param str1
	 * @param str2
	 * @return  str1==str2 返回true
	 */
	public static boolean equals(String str1,String str2){
		
		return !greateThan(str1,str2) && !lessThan(str1,str2);
		
	}
	
	public static String copyByte(String src,int start,int length){
		
		if(src ==null)
			return "";
		
		byte[] srcData =src.getBytes();
		
		byte[] data =new byte[length];
		
		System.arraycopy(srcData, start, data, 0, length);
		
		return new String(data);
		
	}
	
	/**
	 * author:xieguojun
	 * 分割字符串，忽略多个delim 
	 * 例如多个空格，当作一个delim
	 * @param str
	 * @param delim
	 * @return
	 */
	public static String[] split(String str, String delim){
		StringTokenizer token =new StringTokenizer(str,delim);
		
		String[] result =new String[token.countTokens()];
		int loop =0;
		
		while(token.hasMoreTokens()){
			result[loop++] =token.nextToken();
		}
		
		return result;		
	}
	
	/**
	 * 判断字符串是否满足正则表达式
	 * @param str
	 * @return
	 */
	public static boolean isFormat(String foramt,String str){ 
	     Pattern pattern = Pattern.compile(foramt); 
	     return pattern.matcher(str).matches();    
	}
	
	/**
	 * 给目标补足指定位数
	 * @param src 目标字符串
	 * @param length 补位后字符串长度
	 * @param token 用于补位的字符串
	 * @param pre 前面补位还是后面补位
	 * @return
	 */
	public static String upToSize(String src,int length,String token,boolean pre){
		if(pre==true){//前面补位
			while((src.length()+token.length())<=length){
				src=token+src;
			}
		}else{//后面补位
			while((src.length()+token.length())<=length){
				src=src+token;
			}
		}
		return src;
	}
	
}
