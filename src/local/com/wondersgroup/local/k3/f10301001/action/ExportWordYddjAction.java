package com.wondersgroup.local.k3.f10301001.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301001.vo.AuditProblemVO;
import com.wondersgroup.local.k3.f10301001.vs.F10301001VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;

public class ExportWordYddjAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	AuditProblemVO auditProblemVO = new AuditProblemVO();
	
	private F10301001VS f10301001VS;

	public F10301001VS getF10301001VS() {
		return f10301001VS;
	}

	public void setF10301001VS(F10301001VS f10301001vs) {
		f10301001VS = f10301001vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		
		return auditProblemVO;
	}
	
	public void exportWord_yddj() {
		
		Map<String, Object> dataMap = this.getF10301001VS().queryAf32WithMap(auditProblemVO);
		String ape711 = String.valueOf(dataMap.get("ape711"));
		ape711 = ape711.substring(0,4) + "." + ape711.substring(4, 6) + "." + ape711.substring(6, 8) + ".";
		dataMap.remove("APE711");
		dataMap.put("APE711", ape711);
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "疑点登记表_";
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301001_yddj");
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
