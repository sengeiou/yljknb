package com.wondersgroup.local.k3.f10301006.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301006.vo.Af39VO;
import com.wondersgroup.local.k3.f10301006.vs.F10301006VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;

@SuppressWarnings("serial")
public class SaveNotify extends BaseAjaxAction{
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private F10301006VS f10301006VS;
	private Af39VO af39vo = new Af39VO();
	public F10301006VS getF10301006VS() {
		return f10301006VS;
	}
	public void setF10301006VS(F10301006VS f10301006vs) {
		f10301006VS = f10301006vs;
	}
	public Af39VO getAf39vo() {
		return af39vo;
	}
	public void setAf39vo(Af39VO af39vo) {
		this.af39vo = af39vo;
	}
	@Override
	public ValueObject getValueObject() {
		return getAf39vo();
	}
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String saveNotify(){
		af39vo = this.getF10301006VS().saveNotify(af39vo);
		String jsonData = prefix + VOUtils.getJsonData(af39vo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public void exportWord_gz(){
		Map<String, Object> dataMap = this.getF10301006VS().queryAf39WithMap(af39vo);
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "违规行为告知单_";
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301006_gz");
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
				if(file.exists()){
					file.delete();
				}
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
