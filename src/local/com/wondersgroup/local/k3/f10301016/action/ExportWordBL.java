package com.wondersgroup.local.k3.f10301016.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;

@SuppressWarnings("serial")
public class ExportWordBL extends BaseAjaxAction{
	
	private InquiryInputVO inquiryInputVO = new InquiryInputVO();
	private F10301016VS f10301016vs;
	

	public InquiryInputVO getInquiryInputVO() {
		return inquiryInputVO;
	}

	public void setInquiryInputVO(InquiryInputVO inquiryInputVO) {
		this.inquiryInputVO = inquiryInputVO;
	}

	public F10301016VS getF10301016vs() {
		return f10301016vs;
	}

	public void setF10301016vs(F10301016VS f10301016vs) {
		this.f10301016vs = f10301016vs;
	}

	@Override
	public ValueObject getValueObject() {
		return getInquiryInputVO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}
	
	public void exportWord_bl(){
		Map<String, Object> dataMap = this.getF10301016vs().queryAf37WithMap(inquiryInputVO);
		String ape712 = String.valueOf(dataMap.get("ape712"));
		ape712 = ape712.substring(0,4) + "年" + ape712.substring(4, 6) + "月" + ape712.substring(6, 8) + "日";
		dataMap.remove("ape712");
		dataMap.put("ape712", ape712);
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "询问笔录单_";
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301016_bl");
			is = new FileInputStream(file);
			
			fileName = WordGeneter.getFileName(userAgent, fileName);
			
			this.servletResponse.setCharacterEncoding("utf-8");  
			this.servletResponse.setContentType("application/msword");  
			// 设置浏览器以下载的方式处理该文件默认名为resume.doc   
			this.servletResponse.addHeader("Content-Disposition", "attachment;filename=" + fileName  + ".doc"); 
			
			sos = this.servletResponse.getOutputStream();
			
			byte[] buffer = new byte[512];
			int bytesToRead = -1;
			while((bytesToRead = is.read(buffer)) != -1){
				sos.write(buffer, 0, bytesToRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				file.delete();
				if(is != null){
					is.close();
				}
				if(sos != null){
					sos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
