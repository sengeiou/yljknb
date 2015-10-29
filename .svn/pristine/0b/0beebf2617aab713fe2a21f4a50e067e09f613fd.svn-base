package com.wondersgroup.local.k3.f10301008.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletOutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301008.vo.Af62VO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;
import com.wondersgroup.wssip.util.DateTools;

public class ChangeOfTime extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private F10301008VS f10301008vs;
	private Af62VO af62vo = new Af62VO();
	public F10301008VS getF10301008vs() {
		return f10301008vs;
	}
	public void setF10301008vs(F10301008VS f10301008vs) {
		this.f10301008vs = f10301008vs;
	}
	public Af62VO getAf62vo() {
		return af62vo;
	}
	public void setAf62vo(Af62VO af62vo) {
		this.af62vo = af62vo;
	}
	@Override
	public ValueObject getValueObject() {
		return getAf62vo();
	}
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String saveAf62(){
		af62vo = this.getF10301008vs().changeOfTime(af62vo);
		String jsonData = prefix + VOUtils.getJsonData(af62vo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public String queryAf31ByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		BeAuditTargetVO resultVO = this.getF10301008vs().queryAf31ByAaz077(aaz077);
		String result = VOUtils.getJsonData(resultVO);
		createJSonData(result);
		return AJAX;
	}
	
	public void exportWord_xqxg(){
		Map<String, Object> dataMap = this.getF10301008vs().queryAf62WithMap(af62vo);
		Date aae036 = (Date) dataMap.get("aae036");
		if(aae036 != null){
			String aae036s = DateTools.formatDate(aae036, "yyyyMMdd");
			aae036s = aae036s.substring(0,4) + "年" + aae036s.substring(4, 6) + "月" + aae036s.substring(6, 8) + "日";
			dataMap.put("AAE036S", aae036s);
		}else{
			dataMap.put("AAE036S", "无");
		}
		
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "限期修改单_";
		
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301008_xqxg");
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
