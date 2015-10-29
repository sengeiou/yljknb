package com.wondersgroup.local.k4.f10402007.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;

public class DownLoadAction extends BaseAjaxAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//下载excel流
	public InputStream getInputStream(){
		String excelFileName = "Dxzb_Temp.xls";
		//获取excel的全路径
		return ServletActionContext.getServletContext().getResourceAsStream("/pages/k4/f10402007/"+excelFileName);
	}
	//下载excel模板

	public String downLoad(){
		//下载保存时的中文名字
		String ypcjxxFileName = "药品采集导入模板.xls";
		try {
			
			String excelName = new String(ypcjxxFileName.getBytes(),"iso8859-1");
			getServletRequest().setAttribute("excelName", excelName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	
	

}
