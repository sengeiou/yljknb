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
import com.wondersgroup.local.k3.f10301008.vo.Af63VO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class RecoveryAction extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private F10301008VS f10301008vs;
	private Af63VO af63vo = new Af63VO();
	public F10301008VS getF10301008vs() {
		return f10301008vs;
	}
	public void setF10301008vs(F10301008VS f10301008vs) {
		this.f10301008vs = f10301008vs;
	}
	public Af63VO getAf63vo() {
		return af63vo;
	}
	public void setAf63vo(Af63VO af63vo) {
		this.af63vo = af63vo;
	}
	@Override
	public ValueObject getValueObject() {
		return getAf63vo();
	}
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String saveAf63(){
		af63vo = this.getF10301008vs().recovery(af63vo);
		String jsonData = prefix + VOUtils.getJsonData(af63vo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public void exportWord_hf(){
		Map<String, Object> dataMap = this.getF10301008vs().queryAf63WithMap(af63vo);
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
		String fileName = "恢复医疗服务保险结算单_";
		
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			file = WordGeneter.createDoc(dataMap, "f10301008_hf");
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
	
	public String loadBeAuditTargetInfoByAaz077(){
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		String result = null;
		
		if(StringTools.hasText(aaz077)){
			
			BeAuditTargetVO returnVO = this.getF10301008vs().queryBeAuditTargetInfoById(aaz077);
			
			result = VOUtils.getJsonData(returnVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
}
