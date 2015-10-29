package com.wondersgroup.local.k3.f10301016.freemarkerUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * @Desc: WordUtils
 * @Author: Gerald	Yang
 * @Date: 2015-9-7 15:21:35
 */
public class FreemarkerUtils {

	/**
	 * @Desc: create word file
	 * @author Gerald Yang
	 * @Date:2015-9-7 15:03:54
	 * @param dataMap word中需要展示的动态数据，用map集合来保存
	 * @param templateName word模板名称，例如：test.ftl
	 * @param filePath 文件生成的目标路径，例如：D:/wordFile/
	 * @param fileName 生成的文件名称，例如：test.doc
	 */
	public static void createWord(Map<String, Object> dataMap,String templateName,String filePath,String fileName) {
		
		try {
			//创建配置实例
			Configuration configuration = new Configuration();
			
			//设置编码
			configuration.setDefaultEncoding("UTF-8");
			
			//ftl文件统一放置包ftl下面
			configuration.setClassForTemplateLoading(InquiryInputVO.class, "/com/wondersgroup/local/k3/f10301016/ftl");
			
			//获取模板
			Template template = configuration.getTemplate(templateName);
			
			//输出文件
			File outFile = new File(filePath + File.separator + fileName);
			
			 //如果输出目标文件夹不存在，则创建
			if (!outFile.getParentFile().exists()) {
				outFile.getParentFile().mkdirs();
				
			}
			
			 //将模板和数据模型合并生成文件 
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));
			
			 //生成文件
			template.process(dataMap, out);
			
			//close stream
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
