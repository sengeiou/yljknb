package com.wondersgroup.local.jkgz.zsk.encryption;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.log4j.Logger;

import com.sun.jna.ptr.PointerByReference;
import com.wondersgroup.local.jkgz.zsk.encryption.sqlite3JNA.Clibrary;

public class encryptionForSQLite {
	private static  Logger log = Logger.getLogger(encryptionForSQLite.class);
	public static String getfilePath() throws IOException{
		Properties properties = new Properties();
		File file = new File("E:\\Java\\workspace\\yljk\\src\\local\\com\\wondersgroup\\local\\jkgz\\zsk\\encryption\\fileConfig.properties");
		FileInputStream fis = new FileInputStream(file);
		properties.load(fis);
		fis.close();
		System.out.println("FilePath:"+properties.getProperty("filepath"));  
		return properties.getProperty("filepath");
	}
	public static void saveKey(String key){
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			File file = new File("key.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(key.getBytes());
			bos.flush();
			log.info("SAVE KEY");
			log.info("CLASS : saveKey;");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {  
		int ret = 0;
		PointerByReference pbr = new PointerByReference();
		/*打开数据库*/
		try {
			String filepath = getfilePath();
			log.info("GET SQLITE FILE PATH：");
			log.info("CLASS : getfilePath");
			ret = Clibrary.INSTANTCE.sqlite3_open(filepath,pbr);
		} catch (IOException e1) {
			e1.printStackTrace();
			log.error("CAN'T GET SQLITE FILEPATH");
			log.error(e1.toString());
		} 	
		if(ret != sqlite3JNA.SQLITE_OK){
			log.error("CANT'T OPEN SQLITE;");
			log.error("ERROR CODE: "+ret);
		}else{
			log.info("OPEN SQLITE:");
			log.info("CLASS:sqlite_open");
		}
	    /*生成密码*/
        KeyGenerator kg = null;
		try {
			kg = KeyGenerator.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}  
        kg.init(128);
        SecretKey sk = kg.generateKey();
        BigInteger num = new BigInteger(1, sk.getEncoded());
        System.out.println("Key: "+ num.toString());
        
        /*数据库加密*/
		ret = Clibrary.INSTANTCE.sqlite3_rekey(pbr.getValue(), num.toString(),num.toString().length());
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println("can't set key for sqlite");
			log.error("CANT'T ENCRYPTION FOR SQLITE;");
			log.error("ERROR CODE: "+ret);
		}else{
			saveKey(num.toString());
			log.info("ENCRYPTION FOR SQLITE:");
			log.info("CLASS:sqlite3_rekey");
		}
		/*关闭数据库*/
	    ret = Clibrary.INSTANTCE.sqlite3_close(pbr.getValue());	
		if(ret != sqlite3JNA.SQLITE_OK){
			System.out.println("can't close sqlite");
			log.error("CANT'T CLOSE FOR SQLITE;");
			log.error("ERROR CODE: "+ret);
		}else{
			log.info("CLOSE SQLITE");
			log.info("CLASS:sqlite3_close");
		}
	} 
}