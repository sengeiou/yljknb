package com.wondersgroup.local.k3.f10301004.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301004.vo.Af61VO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;
import com.wondersgroup.wssip.util.DateTools;

public class ApprovalAction extends BaseAjaxAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private F10301004VS f10301004vs;
	private Af61VO af61vo = new Af61VO();
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	public F10301004VS getF10301004vs() {
		return f10301004vs;
	}
	public void setF10301004vs(F10301004VS f10301004vs) {
		this.f10301004vs = f10301004vs;
	}
	public Af61VO getAf61vo() {
		return af61vo;
	}
	public void setAf61vo(Af61VO af61vo) {
		this.af61vo = af61vo;
	}
	@Override
	public ValueObject getValueObject() {
		return getAf61vo();
	}
	@Override
	protected String operate() {
		af61vo = this.getF10301004vs().queryApprovalInfo(af61vo);
		String result = VOUtils.getJsonData(af61vo);
		return result;
	}
	
	public String saveAf61(){
		af61vo = this.getF10301004vs().saveAf61(af61vo);
		String jsonData = prefix + VOUtils.getJsonData(af61vo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public void exportWord_lasp(){
		Map<String, Object> dataMap = this.getF10301004vs().queryAf61WithMap(af61vo);
		Date aae036 = (Date) dataMap.get("aae036");
		if(aae036 != null){
			String aae036s = DateTools.formatDate(aae036, "yyyyMMdd");
			aae036s = aae036s.substring(0,4) + "年" + aae036s.substring(4, 6) + "月" + aae036s.substring(6, 8) + "日";
			dataMap.put("AAE036S", aae036s);
		}else{
			dataMap.put("AAE036S", "无");
		}
		Date adf006 = (Date) dataMap.get("adf006");
		if(adf006 != null){
			String adf006s = DateTools.formatDate(adf006, "yyyyMMdd");
			adf006s = adf006s.substring(0,4) + "年" + adf006s.substring(4, 6) + "月" + adf006s.substring(6, 8) + "日";
			dataMap.put("ADF006S", adf006s);
		}else{
			dataMap.put("ADF006S", "无");
		}
		Date adf009 = (Date) dataMap.get("adf009");
		if(adf006 != null){
			String adf009s = DateTools.formatDate(adf009, "yyyyMMdd");
			adf009s = adf009s.substring(0,4) + "年" + adf009s.substring(4, 6) + "月" + adf009s.substring(6, 8) + "日";
			dataMap.put("ADF009S", adf009s);
		}else{
			dataMap.put("ADF009S", "无");
		}
		BigDecimal ape711 = (BigDecimal) dataMap.get("ape711");
		dataMap.remove("ape711");
		if(ape711 != null){
			String ape711s = String.valueOf(ape711);
			String ape711ss = ape711s.substring(0,4) + "-" + ape711s.substring(4, 6) + "-" + ape711s.substring(6, 8) ;
			dataMap.put("APE711", ape711ss);
		}else{
			dataMap.put("APE711", "无");
		}
		
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "立案审批表_";
		
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301004_lasp");
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
