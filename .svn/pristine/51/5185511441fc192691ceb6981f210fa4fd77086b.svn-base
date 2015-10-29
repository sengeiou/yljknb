/*
	DBFWriter
	Class for defining a DBF structure and addin data to that structure and 
	finally writing it to an OutputStream.

	This file is part of JavaDBF packege.

	author: anil@linuxense.com
	license: LGPL (http://www.gnu.org/copyleft/lesser.html)

	$Id: DBFWriter.java 15070 2009-04-27 00:57:14Z Suhl $
 */
package com.wondersgroup.wssip.commons.javatxt.core;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wondersgroup.wsscclib.javadbf.core.DBFBase;
import com.wondersgroup.wsscclib.javadbf.core.DBFException;
import com.wondersgroup.wssip.commons.javatxt.mapping.BeanMappingConfig;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTField;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTFieldType;
import com.wondersgroup.wssip.commons.javatxt.mapping.TXTTypeMapping;

/**
 * An object of this class can create a DBF file. Create an object, <br>
 * then define fields by creating DBFField objects and<br>
 * add them to the DBFWriter object<br>
 * add records using the addRecord() method and then<br>
 * call write() method.
 */
public class TXTWriter extends DBFBase {

	/* other class variables */
	TXTHeader header;

	List<Object[]> v_records = new ArrayList<Object[]>();

	int recordCount = 0;

	TXTFieldType[] fieldTypes;

	RandomAccessFile raf = null; /*
									 * Open and append records to an existing
									 * DBF
									 */

	boolean appendMode =false;
	
	private final String fieldSeperator;
	
	private final String lineSeperator;

	/**
	 * @return the appendMode
	 */
	public boolean isAppendMode() {
		return appendMode;
	}

	/**
	 * Creates an empty Object.
	 */
	public  TXTWriter(String fieldSeparator,String lineSeparator) {

		this.header = new TXTHeader();
		this.fieldSeperator=fieldSeparator;
		this.lineSeperator=lineSeparator;		
	}

	/**
	 * Creates a DBFWriter which can append to records to an existing DBF file.
	 * 
	 * @param dbfFile.
	 *            The file passed in shouls be a valid DBF file.
	 * @exception Throws
	 *                DBFException if the passed in file does exist but not a
	 *                valid DBF file, or if an IO error occurs.
	 */
	public TXTWriter(File dbfFile,String fieldSeparator,String lineSeparator) throws DBFException {

		try {
			this.fieldSeperator=fieldSeparator;
			this.lineSeperator=lineSeparator;

			this.raf = new RandomAccessFile(dbfFile, "rw");

			/*
			 * before proceeding check whether the passed in File object is an
			 * empty/non-existent file or not.
			 */
			if (!dbfFile.exists() || dbfFile.length() == 0) {
				this.header = new TXTHeader();
				return;
			}

			header = new TXTHeader();
			this.header.read(raf);
			appendMode = true;
			initFieldTypes();
			/* position file pointer at the end of the raf */
			this.raf.seek(this.raf.length() - 1 /*
												 * to ignore the END_OF_DATA
												 * byte at EoF
												 */);
			if(dbfFile.length()>0){//如果追加记录则先输出换行符
				this.raf.writeChars(lineSeparator);
			}
		} catch (FileNotFoundException e) {

			throw new DBFException("Specified file is not found. "
					+ e.getMessage());
		} catch (IOException e) {

			throw new DBFException(e.getMessage() + " while reading header");
		}

		this.recordCount = this.header.numberOfRecords;
	}

	/**
	 * 返回字段定义
	 * 
	 * @return
	 */
	public TXTField[] getFields() {
		return this.header.fieldArray;
	}

	/**
	 * 初始化字段类型
	 * 
	 * @throws DBFException
	 */
	private void initFieldTypes() throws DBFException {
		TXTField[] fields = this.header.fieldArray;
		this.fieldTypes = new TXTFieldType[fields.length];
		for (int i = 0; i < fields.length; i++) {
			this.fieldTypes[i] = TXTFieldType.getFieldType(fields[i]
					.getDataType());
			if (this.fieldTypes[i] == null) {
				throw new DBFException("不支持的字段类型"
						+ (char) fields[i].getDataType());
			}
		}
	}

	/**
	 * Sets fields.
	 */
	public void setFields(TXTField[] fields) throws DBFException {

		if (this.header.fieldArray != null) {
			throw new DBFException("已存在字段定义，不能重复设置");
		}

		if (fields == null || fields.length == 0) {

			throw new DBFException("至少应该包含一个字段");
		}

		for (int i = 0; i < fields.length; i++) {

			if (fields[i] == null) {

				throw new DBFException("字段[" + (i + 1) + "]为空");
			}
		}

		this.header.fieldArray = fields;

		initFieldTypes();

		try {

			if (this.raf != null && this.raf.length() == 0) {

				/*
				 * this is a new/non-existent file. So write header before
				 * proceeding
				 */
				//字段信息不输入
				this.header.write(this.raf);
			}
		} catch (IOException e) {
			throw new DBFException("将字段定义写入TXT数据文件时发生错误:" + e.getMessage());
		}
	}

	/**
	 * Add a record.
	 */
	public void addRecord(Object[] values,boolean last) throws DBFException {

		if (this.header.fieldArray == null) {

			throw new DBFException("在增加记录之前请先制定数据定义");
		}

		if (values == null) {

			throw new DBFException("记录不能为空");
		}

		if (values.length != this.header.fieldArray.length) {

			throw new DBFException("记录字段数目和定义不匹配");
		}

		for (int i = 0; i < this.header.fieldArray.length; i++) {

			if (values[i] == null) {
				continue;
			}

			switch (this.header.fieldArray[i].getDataType()) {

			case 'C':
				if (!(values[i] instanceof String)) {
					throw new DBFException("Invalid value for field " + i);
				}
				break;

			case 'L':
				if (!(values[i] instanceof Boolean)) {
					throw new DBFException("Invalid value for field " + i);
				}
				break;

			case 'N':
				if (!(values[i] instanceof Number)) {
					throw new DBFException("Invalid value for field " + i);
				}
				break;

			case 'D':
				if (!(values[i] instanceof Date)) {
					throw new DBFException("Invalid value for field " + i);
				}
				break;

			case 'F':
				if (!(values[i] instanceof Number)) {

					throw new DBFException("Invalid value for field " + i);
				}
				break;
			}
		}

		if (this.raf == null) {

			v_records.add(values);
		} else {

			try {

				writeRecord(this.raf, values,last);
				this.recordCount++;
			} catch (IOException e) {

				throw new DBFException("Error occured while writing record. "
						+ e.getMessage());
			}
		}
	}

	/**
	 * Writes the set data to the OutputStream.
	 */
	public void write(OutputStream out) throws DBFException {

		try {

			if (this.raf == null) {

				DataOutputStream outStream = new DataOutputStream(out);

				this.header.numberOfRecords = v_records.size();
				this.header.write(outStream);

				/* Now write all the records */
				int t_recCount = v_records.size();
				for (int i = 0; i < t_recCount; i++) { /*
														 * iterate through
														 * records
														 */

					Object[] t_values = v_records.get(i);

					writeRecord(outStream, t_values,i==t_recCount-1);
				}
				outStream.flush();
			} else {

				/*
				 * everything is written already. just update the header for
				 * record count and the END_OF_DATA mark
				 */
				this.header.numberOfRecords = this.recordCount;
				this.raf.seek(0);
				this.header.write(this.raf);
				this.raf.seek(raf.length());
				this.raf.close();
			}

		} catch (IOException e) {

			throw new DBFException(e.getMessage());
		}
	}

	public void write() throws DBFException {

		this.write(null);
	}

	private void writeRecord(DataOutput dataOutput, Object[] objectArray,boolean last)
			throws IOException {
		TXTTypeMapping typeMapping = BeanMappingConfig.getRunningConfig()
				.getTypeMapping();
		for (int i = 0; i < this.header.fieldArray.length; i++) {
			dataOutput.write(typeMapping.fromJavaObject(fieldTypes[i],
					objectArray[i], this.header.fieldArray[i]));
			//dataOutput.writeChars(this.fieldSeperator);
			dataOutput.writeBytes(this.fieldSeperator);
			if (i == this.header.fieldArray.length - 1) {
				dataOutput.writeBytes(this.lineSeperator);
				//dataOutput.writeChars(this.lineSeperator);
			}
		}
	}
}
