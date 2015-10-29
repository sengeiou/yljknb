package com.wondersgroup.local.jkgz.test;

import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;

public class Test {
	public static void main(String[] args) throws SerialException, SQLException {
		String systemPath = System.getProperty("user.dir")
				+ "/webapp/WEB-INF/classes/systemContext.xml";
		systemPath.replace("\\", "/");
		//ApplicationContext ac = new FileSystemXmlApplicationContext(systemPath);
//		JkgzMainVS vs = (JkgzMainVS) ac.getBean("jkgzMain");
//		vs.main("330200");
		isClear("");
	}

	public static String isClear(String baz003) throws SQLException {
		String str = "yboltp.pk_fysh.Func_zx('A1240001504232252935',";
		str += "                              '124000          ',";
		str += "                              '40',";
		str += "                              '75',";
		str += "                              0,";
		str += "                              0,";
		str += "                              0,";
		str += "                              'system',";
		str += "                              'system',";
		str += "                              '0',";
		str += "                              'V2.0自动扣除:dddd',";
		str += "                              '0',";
		str += "                              '0',";
		str += "                              '[{mxzdh:\"B1240001504247990499\",tjmxxh:\"0001\",xh:\"14\",mxxmfsrq:\"2015-04-23 16:00:22\"}]')";
		String res=CommonHibernateDaoUtils.executeStoreFunction(str, String.class);
		System.out.println(res);
		return "";
	}
}
