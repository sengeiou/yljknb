/** 
 * @(#)DBFUtils.java Apr 15, 2009
 * 
 * Copyright (c) 1995-2009 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.wssip.commons.javatxt;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.wondersgroup.wsscclib.javadbf.core.DBFException;
import com.wondersgroup.wsscclib.javadbf.mapping.DBFFieldInfo;
import com.wondersgroup.wssip.commons.javatxt.core.TXTReader;
import com.wondersgroup.wssip.commons.javatxt.core.TXTWriter;
import com.wondersgroup.wssip.commons.javatxt.mapping.AnnotationTXTBeanMappingBuilder;
import com.wondersgroup.wssip.commons.javatxt.mapping.BeanMappingConfig;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTBeanMappingInfo;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTField;
import com.wondersgroup.wssip.util.StringTools;

/**
 * @author suhualin
 * @version $Revision: 15070 $ Apr 15, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class TXTUtils {
	/**
	 * 从映射信息获取字段数组信息
	 * 
	 * @param beanMappingInfo 映射信息
	 * @	 */
	private static TXTField[] getFieldsFromMapping(TXTBeanMappingInfo beanMappingInfo) {
		TXTField[] fields = new TXTField[beanMappingInfo.getFieldInfos().size()];

		int i = 0;
		for (DBFFieldInfo fieldInfo : beanMappingInfo.getFieldInfos()) {
			fields[i] = new TXTField();
			fields[i].setName(fieldInfo.getName());
			fields[i].setDataType(fieldInfo.getType());
			if (fieldInfo.getLength() != null) {
				fields[i].setFieldLength(fieldInfo.getLength());
			}
			if (fieldInfo.getScale() != null) {
				fields[i].setDecimalCount(fieldInfo.getScale());
			}
			i++;
		}

		return fields;
	}

	/**
	 * 从JavaBean获取数组形式的数据
	 * 
	 * @param bean JavaBean对象
	 * @param beanMappingInfo 映射信息
	 * @return 字段数据数组
	 */
	private static Object[] getFieldDatasFromBean(Object bean, TXTBeanMappingInfo beanMappingInfo) {
		Object[] result = new Object[beanMappingInfo.getFieldInfos().size()];

		int i = 0;
		for (DBFFieldInfo fieldInfo : beanMappingInfo.getFieldInfos()) {
			try {
				result[i] = PropertyUtils.getProperty(bean, fieldInfo.getProperty());
			}
			catch (Exception e) {
			}
			i++;
		}

		return result;
	}

	/**
	 * 根据字段信息和映射信息创建字段数据映射数组
	 * 
	 * @param fields 字段信息
	 * @param beanMappingInfo 映射信息
	 * @return 映射数组
	 */
	private static int[] createFieldDatasMapping(TXTField[] fields, TXTBeanMappingInfo beanMappingInfo) {
		int[] result = new int[beanMappingInfo.getFieldInfos().size()];
		Arrays.fill(result, -1);

		int index = 0;
		for (DBFFieldInfo fieldInfo : beanMappingInfo.getFieldInfos()) {
			for (int i = 0; i < fields.length; i++) {
				if (fields[i].getName().equals(fieldInfo.getName())) {
					result[index] = i;
					break;
				}
			}
			index++;
		}
		return result;
	}

	/**
	 * 根据映射数组转换字段数组
	 * 
	 * @param fieldDatas 原字段数组
	 * @param mappings 映射数组
	 * @return 映射后的字段数组
	 */
	private static Object[] convertFieldDatas(Object[] fieldDatas, int[] mappings) {
		Object[] result = new Object[fieldDatas.length];
		for (int i = 0; i < fieldDatas.length; i++) {
			if (mappings[i] >= 0) {
				result[i] = fieldDatas[mappings[i]];
			}
		}
		return result;
	}

	/**
	 * 从字段数据数组创建对应的JavaBean对象
	 * 
	 * @param fieldDatas 字段数据数组
	 * @param beanType JavaBean类型
	 * @param beanMappingInfo JavaBean对应的映射信息
	 * @return
	 */
	private static <T> T createBeanFromFieldDatas(Object[] fieldDatas, Class<T> beanType,
			TXTBeanMappingInfo beanMappingInfo) {
		T result = null;
		try {
			result = beanType.newInstance();
			int i = 0;
			for (DBFFieldInfo fieldInfo : beanMappingInfo.getFieldInfos()) {
			 
				BeanUtils.setProperty(result, fieldInfo.getProperty(), fieldDatas[i]);
				i++;
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}

		return result;
	}

	/**
	 * 将数据集导出到TXT文件中
	 * 
	 * @param file TXT文件
	 * @param datas 数据集
	 * @param beanType JavaBean类型
	 */
	public static <T> void exportTXT(File file, Iterable<T> datas, Class<T> beanType) {
		exportTXT(file, datas, beanType, "\t", System.getProperty("line.separator"));
	}

	/**
	 * 
	 * @param file
	 * @param datas
	 * @param beanType
	 * @param fieldSeparator
	 * @param lineSeparator
	 */
	public static <T> void exportTXT(File file, Iterable<T> datas, Class<T> beanType,String fieldSeparator,String lineSeparator) {
		TXTBeanMappingInfo beanMappingInfo = AnnotationTXTBeanMappingBuilder.build(beanType);

		try {
			TXTWriter writer = new TXTWriter(file,fieldSeparator,lineSeparator);
			String charSet = BeanMappingConfig.getRunningConfig().getCharset();
			if (charSet != null) {
				writer.setCharactersetName(charSet);
			}
			if (!writer.isAppendMode()) {
				writer.setFields(getFieldsFromMapping(beanMappingInfo));
				for(Iterator<T> itr=datas.iterator();itr.hasNext();){
					T row=itr.next();
					writer.addRecord(getFieldDatasFromBean(row, beanMappingInfo),!itr.hasNext());
				}
			}
			else {
				int[] mappings = createFieldDatasMapping(writer.getFields(), beanMappingInfo);
				for(Iterator<T> itr=datas.iterator();itr.hasNext();){
					T row=itr.next();
					writer.addRecord(convertFieldDatas(getFieldDatasFromBean(row, beanMappingInfo), mappings),!itr.hasNext());
				}
			}
			writer.write();
		}
		catch (DBFException e) {
			throw new RuntimeException(e);
		}		
	}
	
	/**
	 * 读取txt
	 * @param <T>
	 * @param file
	 * @param beanType
	 * @param startRecord 其实记录,全部读取设置为0
	 * @param recordCount 读取记录数,全部读取设置为-1
	 * @return
	 */
	public static <T> List<T> readTxt(File file,Class<T> beanType,int startRecord,int recordCount){
		
		return readTxt(file,beanType,startRecord,recordCount,"",System.getProperty("line.separator"));
	}
	
	/**
	 * 读取txt
	 * @param <T>
	 * @param file
	 * @param beanType
	 * @param startRecord
	 * @param recordCount
	 * @param fieldSeparator
	 * @param lineSeparator
	 * @return
	 */
	public static <T> List<T> readTxt(File file,Class<T> beanType,int startRecord,int recordCount,String fieldSeparator,String lineSeparator){
		
		boolean trim =BeanMappingConfig.getRunningConfig().isTrim();
		
		List<T> results =new ArrayList<T>();
		
		int recordLength =0;
		
		TXTBeanMappingInfo beanMappingInfo = AnnotationTXTBeanMappingBuilder.build(beanType);
		
		for(DBFFieldInfo fieldInfo:beanMappingInfo.getFieldInfos()){
			recordLength +=fieldInfo.getLength();
		}		
		recordLength +=fieldSeparator.length();
		recordLength +=lineSeparator.length();
		
		try {
			TXTReader reader =new TXTReader(file,recordLength);
			String charSet = BeanMappingConfig.getRunningConfig().getCharset();
			
			if(charSet !=null){
				reader.setCharactersetName(charSet);
			}
			
			String result =reader.reader(startRecord,recordCount);	
			
			String[] arrResult =result.split(lineSeparator);
			Object[] arrRecord ;
			int fieldSize =beanMappingInfo.getFieldInfos().size();
			if(fieldSeparator.equals(lineSeparator)){
				arrRecord =new Object[fieldSize];
				for(int i=0;i<recordCount;++i){
					for(int j=0;j<arrRecord.length;j++){
						if(trim)
							arrRecord[j] =trim(arrResult[i*arrRecord.length+j]);
						else
							arrRecord[j] =arrResult[i*arrRecord.length+j];
					}
					
					results.add(createBeanFromFieldDatas(arrRecord,beanType,beanMappingInfo));
				}
 
			}else{
				
				if(fieldSeparator.length()>0){
					String tmp =null;
					for(int i=0;i<arrResult.length;++i){
						arrRecord =new  Object[fieldSize];
						boolean outlength = false;
						int al = arrResult[i].getBytes().length;
						if(al!=recordLength+fieldSize-4){
							outlength=true;
						}

						
						int loop =0;
						int start =0;
						for(DBFFieldInfo info:beanMappingInfo.getFieldInfos()){
							if(outlength){
								arrRecord[loop++] = StringTools.upToSize(" ", info.getLength(), " ", true);
							}
							else{
								if(start +info.getLength()+1>al){
									tmp =StringTools.copyByte(arrResult[i], start, info.getLength());
								}
								else{
									tmp =StringTools.copyByte(arrResult[i], start, info.getLength()+1);
								}
								
								
								arrRecord[loop++] =trim(tmp);
								
									
								
							}
							start +=info.getLength()+1;
						}
						
						
						
						results.add(createBeanFromFieldDatas(arrRecord,beanType,beanMappingInfo));
					}
				}else{
				
				int length;
				String tmp =null;
				for(int i=0;i<arrResult.length;++i){
					boolean outlength = false;
					int al = arrResult[i].getBytes().length;
					if(al!=recordLength-2){
						outlength=true;
					}
					arrRecord =new  Object[fieldSize];
					int loop =0;
					int start =0;
					for(DBFFieldInfo info:beanMappingInfo.getFieldInfos()){
						length =info.getLength();
						if(outlength){
							arrRecord[loop++] = StringTools.upToSize(" ", length, " ", true);
						}
						else{
							tmp =StringTools.copyByte(arrResult[i], start, length);
							if(trim)
								arrRecord[loop++] =trim(tmp);
							else
								arrRecord[loop++] =tmp;
						}
						
						
						start +=length;
					}
					results.add(createBeanFromFieldDatas(arrRecord,beanType,beanMappingInfo));
				}
			}
			}
			
		}
		catch (DBFException e) {
			e.printStackTrace();
		}
		
		return results;		
	}
	
	public static String trim(String str){
		if(str ==null)
			return null;
		
		return str.trim();
	}
}
