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
import com.wondersgroup.local.k3.f10301008.vo.Af54VO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.local.k3.f10301016.freemarkerUtils.WordGeneter;
import com.wondersgroup.wssip.util.DateTools;

public class ConverAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";
	private F10301008VS f10301008vs;
	private Af54VO af54vo = new Af54VO();
	public F10301008VS getF10301008vs() {
		return f10301008vs;
	}
	public void setF10301008vs(F10301008VS f10301008vs) {
		this.f10301008vs = f10301008vs;
	}
	public Af54VO getAf54vo() {
		return af54vo;
	}
	public void setAf54vo(Af54VO af54vo) {
		this.af54vo = af54vo;
	}
	@Override
	public ValueObject getValueObject() {
		return getAf54vo();
	}
	@Override
	protected String operate() {
		return super.operate();
	}
	
	public String queryAf54Info(){
		af54vo = this.getF10301008vs().queryAf54Info(af54vo);
		String jsonData = VOUtils.getJsonData(af54vo);
		createJSonData(jsonData);
		return AJAX;
	}
	
	public String saveConver(){
		af54vo = this.getF10301008vs().saveConver(af54vo);
		String jsonData = prefix + VOUtils.getJsonData(af54vo) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
	
	public void exportWord_cd(){
		Map<String, Object> dataMap = this.getF10301008vs().queryAf54WithMap(af54vo);
		Date baz024 = (Date) dataMap.get("baz024");
		if(baz024 != null){
			String baz024s = DateTools.formatDate(baz024, "yyyyMMdd");
			baz024s = baz024s.substring(0,4) + "年" + baz024s.substring(4, 6) + "月" + baz024s.substring(6, 8) + "日";
			dataMap.put("BAZ024S", baz024s);
		}else{
			String baz024s = DateTools.formatDate(new Date(), "yyyyMMdd");
			baz024s = baz024s.substring(0,4) + "年" + baz024s.substring(4, 6) + "月" + baz024s.substring(6, 8) + "日";
			dataMap.put("BAZ024S", baz024s);
		}
		
		File file = null;
		InputStream is = null;
		ServletOutputStream sos = null;
		String fileName = "";
		if("1_1".equals(af54vo.getType())){
			fileName = "参保人违规处理意见单_";
		}
		if("1_2".equals(af54vo.getType())){
			fileName = "参保人违规行为处理决定书_";
		}
		if("2_1".equals(af54vo.getType())){
			fileName = "医师停止医疗保险服务费用结算通知书_";
		}
		if("3_1".equals(af54vo.getType())){
			fileName = "定点机构违规处理意见单_";
		}
		if("3_2".equals(af54vo.getType())){
			fileName = "定点机构违规行为处理决定书_";
		}
		if("3_3".equals(af54vo.getType())){
			fileName = "医院停止医疗保险服务费用结算通知书_";
		}
		
		final String userAgent = this.servletRequest.getHeader("USER-AGENT");
		try {
			if("1_1".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_cd1_1");
			}
			if("1_2".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_cd1_2");
			}
			if("2_1".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_zt2_1");
			}
			if("3_1".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_cd3_1");
			}
			if("3_2".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_cd3_2");
			}
			if("3_3".equals(af54vo.getType())){
				file = WordGeneter.createDoc(dataMap, "f10301008_zt3_3");
			}
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
