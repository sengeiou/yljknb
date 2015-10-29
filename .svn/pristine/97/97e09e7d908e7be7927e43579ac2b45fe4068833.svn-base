/** 
 * @(#)TXTReader.java 2010-8-6
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

package com.wondersgroup.wssip.commons.javatxt.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.wondersgroup.wsscclib.javadbf.core.DBFBase;
import com.wondersgroup.wsscclib.javadbf.core.DBFException;

/**
 * @author xieguojun
 * @version $Revision$ 2010-8-6
 * @author ($Date$ modification by $Author$)
 * @since 1.0
 */
public class TXTReader  extends DBFBase {

	final int	recordLength;

	RandomAccessFile raf = null; 
	
	public TXTReader(File file,int recordLength) throws DBFException{
		
		try {
			this.raf =new RandomAccessFile(file, "r");
		}
		catch (FileNotFoundException e) {
			throw new DBFException(e.getMessage());
		}
		this.recordLength =recordLength;
	}
	
	public String reader(int startRecord,int recordCount) throws DBFException {
		
		StringBuffer result =new StringBuffer();
		
		int limit =0;
		int start =startRecord*recordLength;
		long fileLength;
		try {
			if(this.raf !=null){
				
				fileLength =raf.length();
				
				if(recordCount ==-1){
					limit =(int) (fileLength-start);
				}else{
					limit =recordLength*recordCount;
					
					if(limit>fileLength-start)
						limit =(int)( fileLength-start);
				}
				
				byte [] b =new byte[limit];		
				if(start <0)
					raf.seek(start);
				raf.read(b);
				result.append(new String(b,getCharactersetName()));
			}else{
				
			}
		}
		catch (IOException e) {
			throw new DBFException(e.getMessage());
		}
		
		return result.toString();
	}

}
