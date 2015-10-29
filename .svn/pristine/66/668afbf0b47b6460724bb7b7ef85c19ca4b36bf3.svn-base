package com.wondersgroup.local.jkgz.service.save;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String systemPath=System.getProperty("user.dir")+"/webapp/WEB-INF/classes/systemContext.xml";
		systemPath.replace("\\","/");
		ApplicationContext ac = new FileSystemXmlApplicationContext(systemPath);
		Gz_save gz_save=(Gz_save) ac.getBean("gzSave");
		gz_save.save_main("124760216", "263404471,263404472", "GZ0307");
	}
}
