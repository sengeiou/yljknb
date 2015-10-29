package com.wondersgroup.local.k3.f10301016.freemarkerUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class WordGeneter {
	private static Configuration configuration = null;
	private static Map<String, Template> allTemplates = null;
	
	static{
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		configuration.setClassForTemplateLoading(WordGeneter.class, "/com/wondersgroup/local/k3/f10301016/ftl");
		allTemplates = new HashMap<String, Template>();
		try {
			allTemplates.put("f10301016_bl", configuration.getTemplate("f10301016_bl.ftl"));
			allTemplates.put("f10301006_gz", configuration.getTemplate("f10301006_gz.ftl"));
			allTemplates.put("f10301001_yddj", configuration.getTemplate("f10301001_yddj.ftl"));
			allTemplates.put("f10301008_cd1_1", configuration.getTemplate("f10301008_cd1_1.ftl"));
			allTemplates.put("f10301008_cd1_2", configuration.getTemplate("f10301008_cd1_2.ftl"));
			allTemplates.put("f10301008_zt2_1", configuration.getTemplate("f10301008_zt2_1.ftl"));
			allTemplates.put("f10301008_cd3_1", configuration.getTemplate("f10301008_cd3_1.ftl"));
			allTemplates.put("f10301008_cd3_2", configuration.getTemplate("f10301008_cd3_2.ftl"));
			allTemplates.put("f10301008_zt3_3", configuration.getTemplate("f10301008_zt3_3.ftl"));
			allTemplates.put("f10301008_yj", configuration.getTemplate("f10301008_yj.ftl"));
			allTemplates.put("f10301008_xqxg", configuration.getTemplate("f10301008_xqxg.ftl"));
			allTemplates.put("f10301008_hf", configuration.getTemplate("f10301008_hf.ftl"));
			allTemplates.put("f10301008_sdhz", configuration.getTemplate("f10301008_sdhz.ftl"));
			allTemplates.put("f10301004_lasp", configuration.getTemplate("f10301004_lasp.ftl"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static final File createDoc(Map<?,?> dataMap,String type){
		//String path = WordGeneter.class.getResource("").getPath();
		//System.out.println(path);
		
		String name = "temp.doc";
		//File file = new File(path+ File.separator +name);
		File file = new File(name);
		Template template = allTemplates.get(type);
		try {
			Writer out = new OutputStreamWriter(new FileOutputStream(file),"utf-8");
			template.process(dataMap, out);
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
	public static String getRandomFileName(){
		String randomSysdate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		return randomSysdate;
	}
	
	public static String getFileName(String userAgent , String fileName){
		try {
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				fileName = URLEncoder.encode(fileName, "UTF8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				fileName = new String(fileName.getBytes(), "ISO-8859-1");
			} else {
				fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return fileName+getRandomFileName();
	}
}
