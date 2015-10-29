package com.wondersgroup.local.jkgz.zsk.encryption.DAO;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.HeapMemoryBlock;


public class encryptionForSQLite {
	
	public static void main(String[] args)  {
		  System.loadLibrary("sqlite3");
		  JNative jnative = null;
		  JNative encryptionJNative = null;
		  JNative closeJNative = null;
		  JNative decipheringJNative= null;
		  try{
			  /*打开数据库*/
			  Pointer pstruct = new Pointer(new HeapMemoryBlock(1024));	//sqlite3句柄
			  
			  jnative = new JNative("sqlite3","sqlite3_open_v2");
			  jnative.setParameter(0, "C:\\Users\\Administrator\\Desktop\\DbVisualizer\\mydb.db");
			  jnative.setParameter(1, pstruct);
			  int flag = 0x00000002;
			  jnative.setParameter(2, flag);
			  String zVfs = null;
			  jnative.setParameter(3, zVfs );
			  jnative.setRetVal(Type.INT); 
			  jnative.invoke();//调用方法 
	          System.out.println( "open result:"+jnative.getRetVal()); 
	          
	          /*生成密码*/
	          KeyGenerator kg = KeyGenerator.getInstance("AES");  
	          kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256  
	          SecretKey sk = kg.generateKey();
	          BigInteger num = new BigInteger(1, sk.getEncoded());
	          System.out.println("Key: "+ num.toString());
	          
	          /*数据库解密*/
	          Pointer decipheringPstruct = new Pointer(new HeapMemoryBlock(40));
	          decipheringPstruct.setMemory(sk.getEncoded());
	          decipheringJNative = new JNative("sqlite3","sqlite3_key");
	          decipheringJNative.setRetVal(Type.INT); 
	          decipheringJNative.setParameter(0,  pstruct);
	          decipheringJNative.setParameter(1,  decipheringPstruct);
	          decipheringJNative.setParameter(2,  128);
	          System.out.println("start deciphering");
	          decipheringJNative.invoke();//调用方法 
	          System.out.println("deciphering result:"+decipheringJNative.getRetVal());
	          
	          /*数据库加密*/
	          Pointer encryptionPstruct = new Pointer(new HeapMemoryBlock(40));
	          encryptionPstruct.setMemory(sk.getEncoded());
	          int keyLength = 128;
	          encryptionJNative = new JNative("sqlite3","sqlite3_rekey");
	          encryptionJNative.setRetVal(Type.INT); 
	          encryptionJNative.setParameter(0,  pstruct);
	          encryptionJNative.setParameter(1,  encryptionPstruct);
	          encryptionJNative.setParameter(2,  keyLength);
	          encryptionJNative.invoke();//调用方法 
	          
	          System.out.println( "encryption result:"+encryptionJNative.getRetVal()); 
	          
	          /*关闭数据库*/
	          closeJNative = new JNative("sqlite3","sqlite3_close");
	          closeJNative.setRetVal(Type.INT);
	          closeJNative.setParameter(0, pstruct);
	          closeJNative.invoke();
	          System.out.println( "close result:"+closeJNative.getRetVal());
		  } catch (IllegalAccessException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		} catch (NativeException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		} finally{ 
	           if(jnative!=null){ 
	        	   try {
					jnative.dispose();
				} catch (NativeException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				}//释放 
		       }
	           if(encryptionJNative!=null){
	        	   try {
					encryptionJNative.dispose();
				} catch (NativeException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				}
	           }
	           if(closeJNative!=null){
	        	   try {
					closeJNative.dispose();
				} catch (NativeException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println(e.toString());
				}
	           }
		  } 
	}
}
