package com.wondersgroup.local.k3.f10301016.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.FreemarkerUtils;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;


public class ExportWordAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private String filePath;//file path
		
	private String fileName; //file name
	
	private String fileOnlyName;//file only name
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileOnlyName() {
		return fileOnlyName;
	}

	public void setFileOnlyName(String fileOnlyName) {
		this.fileOnlyName = fileOnlyName;
	}

	
	public String createWord() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		InquiryInputVO inquiryInputVO = (InquiryInputVO) VOUtils.getBeanFromJsonData(submitData, InquiryInputVO.class);
		
		/** 用于组装word页面需要的数据 */
		Map<String, Object> dataMap = new HashMap<String, Object>();
		String ape712 = String.valueOf(inquiryInputVO.getApe712());
		
		ape712 = ape712.substring(0,4) + "年" + ape712.substring(4, 6) + "月" + ape712.substring(6, 8) + "日";
		
		/** 组装数据 */
		dataMap.put("ape712", ape712);
		dataMap.put("aae007", inquiryInputVO.getAae007());
		dataMap.put("ape134", inquiryInputVO.getApe134());
		dataMap.put("ape135", inquiryInputVO.getApe135());
		dataMap.put("aac002", inquiryInputVO.getAac002());
		dataMap.put("aac003", inquiryInputVO.getAac003());
		dataMap.put("aac004", inquiryInputVO.getAac004());
		dataMap.put("aac005", inquiryInputVO.getAac005());
		dataMap.put("apa065", inquiryInputVO.getApa065());
		dataMap.put("ape029", inquiryInputVO.getApe029());
		dataMap.put("aae006", inquiryInputVO.getAae006());
		dataMap.put("aae005", inquiryInputVO.getAae005());
		
		/** 文件名称，唯一字符串 */
		Random r = new Random();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
		StringBuffer sb = new StringBuffer();
		sb.append(sdf1.format(new Date()));
		sb.append("_");
		sb.append(r.nextInt(100));
		
		//文件路径
		filePath = ServletActionContext.getServletContext().getRealPath("/") + "upload";
		
		//文件唯一名称
		fileOnlyName = "mbxwbl_"+sb+".doc";
		
		//文件名称
		fileName = "mbxwbl.doc";
		
		 /** 生成word */
		FreemarkerUtils.createWord(dataMap, "mbxwbl.ftl", filePath, fileOnlyName);
		
		return "createWordSuccess";
		
	}
	
	/**
	 * @Desc: 下载生成的word文档，入口，用来跳转至struts XML配置
	 * @Author: Gerald Yang
	 * @Date: 2015-9-8 10:00:42
	 * @return 
	 */
	public String downloadWord() {
		
		/** 先判断文件是否已生成  */
		
		try {
			//解决中文乱码
			filePath = URLDecoder.decode(filePath, "UTF-8");
			fileOnlyName = URLDecoder.decode(fileOnlyName, "UTF-8");
			fileName = URLDecoder.decode(fileName, "UTF-8");
			
			//如果文件不存在，则会跳入异常，然后可以进行异常处理
			new FileInputStream(filePath + File.separator +  fileOnlyName);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		} 
		
		return "downloadWord";
	}
	
	 /**
     * @Desc：下载生成的word文档
     * 该方法是struts.xml文件中的： <param name="inputName">wordFile</param> 中自动对应的get方法，该方法自动调用
     * @Author：Gerald Yang
     * @Date：2014-1-22 pm07:36:29
     * @return 返回最终生成的word文档 文件流
     */
	public InputStream getWordFile() {
		
		try {
			//解决中文乱码
			fileName = URLDecoder.decode(fileName,"UTF-8");
			
			/** 返回最终生成的word文件流  */
			return new FileInputStream(filePath + File.separator + fileOnlyName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
}
