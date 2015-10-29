/** 
 * @(#)NumberUtils.java Jun 3, 2010
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

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang.StringUtils;

/**
 * 常用的数值运算
 * @author xieguojun
 * @version $Revision$ May 21, 2010
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public final class NumberTools {
	
	/**
	 * double格式化
	 * @param d     需要格式化的double数据
	 * @param format 格式化字符串
	 * @return
	 */
	public	static String format(double d, String format) {

		DecimalFormat numberFormat = new DecimalFormat(format);

		return numberFormat.format(d);
	}

	/**
	 * float数据格式化
	 * @param f 需要格式化的float数据
	 * @param format 格式化字符串
	 * @return
	 */
	public static String format(float f, String format) {

		DecimalFormat numberFormat = new DecimalFormat(format);

		return numberFormat.format(f);

	}

	/**
	 * int数据格式化
	 * @param i   需要格式的int数据
	 * @param format 格式化字符串
	 * @return
	 */
	public static String format(int i, String format) {

		DecimalFormat numberFormat = new DecimalFormat(format);

		return numberFormat.format(i);
	}

	/**
	 * long数据格式化
	 * @param l    需要格式化的long数据
	 * @param format 格式化字符串
	 * @return
	 */
	public static String format(long l, String format) {

		DecimalFormat numberFormat = new DecimalFormat(format);

		return numberFormat.format(l);
	}
	
	/**
	 * 进行精确的加法运算，可以避免java double类型运算出现误差
	 * 
	 * @param values 参与加法的参数组,可变参数，不定长度
	 * @return
	 */
	public static double add(double... values){
		//使用String来构造BigDecimal，能够避免引起误差
		BigDecimal sum=new BigDecimal("0.0");
		
		for(double v:values){
			sum =sum.add(new BigDecimal(String.valueOf(v)));
		}
		
		return sum.doubleValue();
	}
	
	/**
	 * 乘法运算
	 * 
	 * @param values 参与乘法的参数组，可变参数，不定长度
	 * @return
	 */
	public static double multi(double... values){
		
		BigDecimal sum=new BigDecimal(0);
	 
		for(double v:values){
			sum =sum.multiply(new BigDecimal(v));
		}
		return sum.doubleValue();
	}
	
	/**
	 * 除法运算
	 * @param v1 被除数
	 * @param v2 除数
	 * @return
	 */
	public static double div(double v1,double v2){
	 
		return new BigDecimal(v1).divide(new BigDecimal(v2)).doubleValue();
	}
	
	/**
	 * 减法运算
	 * @param v1 被减数
	 * @param v2 减数
	 * @return
	 */
	public static double sub(double v1,double v2){
	 
		return new BigDecimal(v1).subtract(new BigDecimal(v2)).doubleValue();
	}
	
	/**
	 * 见pos+1位进pos位，假如pos+1上的数据大于'0'，将pos位的值加1
	 * 见分进角需要调用 roundup(value,1) 
	 * @param value 
	 * @param pos   最终要保留的小数点位数
	 * @return
	 */
	public static double roundup(double value,int pos){
		
		if(pos <0)
			throw new RuntimeException("保留的小数点(pos)不能小于0!");
		
		double result=0.0;
		
		String truncValue =trunc(value,pos);
		String truncValue1 =trunc(value,pos+1);
		
		double dValue =Double.valueOf(truncValue);
		double dValue1 =Double.valueOf(truncValue1);
	
		result =Double.valueOf(truncValue);
		
		//两个值差，那么加上应进值
		if(dValue<dValue1){
			/**
			 * 计算应进值
			 * 如pos=0,那么增加的数据应该为1
			 * 如pos=1,那么增加的数据应该为0.1
			 * 如pos=2,那么增加的数据应该为0.01
			 */
			StringBuffer sb =new StringBuffer();
			
			if(pos > 0){
				sb.append("0.");
			}
			for(int i=0;i<pos-1;++i)
				sb.append("0");
			
			sb.append("1");	
			
			double deviation =Double.valueOf(sb.toString());
			
			result =add(deviation,result); 
		}
		
		return result;
	}
	
	/**
	 * 小数点截断函数
	 * @param value 需要截断的值
	 * @param pos   截断的数据点位置
	 */
	public static String trunc(double value,int pos){
		
		StringBuffer format=new StringBuffer("0");
		
		if(pos >0)
			format.append(".");
		for(int i=0;i<pos;++i){
			format.append("0");
		}
		
		return format(value,format.toString());	  
	}
	
	
	/**
	 * 见角进元
	 * @param value
	 * @return
	 */
	public static long jianJiaoJinYuan(double value){
		
		return (long)roundup(value,0);
	}
	/**
	 * 见分进角
	 * @param value
	 * @return
	 */
	public static double jianFenJinJiao(double value){
		return roundup(value,1);
	}
	
	/**
	 * 见厘进分
	 * @param value
	 * @return
	 */
	public static double jianLiJinFen(double value){
		return roundup(value,2);
	}

	/**
	 * 取整数
	 * @param d
	 * @return
	 */
	public static long	round(double d){
		BigDecimal bd =new BigDecimal(String.valueOf(d));
		
		return bd.longValue();
	}
	
	/**
	 * 四舍五入
	 * @param d
	 * @return
	 */
	public static double	round(double d,int scale){
		BigDecimal bd =new BigDecimal(String.valueOf(d)).setScale(scale,BigDecimal.ROUND_HALF_UP);
		
		return bd.doubleValue();
	}
	
	public static void main(String args[]){
		
		double d =10000.000;
		
		System.out.println(format(d,"####.##"));
		System.out.println(round(d,2));
		System.out.println(round(d,1));
		
	}
	
	/**
	 * 判断给定字符串str是否全部为数字
	 * @param str
	 * @return
	 */
	public static boolean isDigit(String str){
		return StringUtils.isNumeric(str);
	}
	
}
