package com.wondersgroup.local.k3.f10301016.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke04DTO;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.local.k3.f10301016.vs.F10301016VS;

public class DownloadAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10301016VS f10301016VS;
	
	private InquiryInputVO inquiryInputVO = new InquiryInputVO();
	
	private String fileUrl;

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public InquiryInputVO getInquiryInputVO() {
		return inquiryInputVO;
	}

	public void setInquiryInputVO(InquiryInputVO inquiryInputVO) {
		this.inquiryInputVO = inquiryInputVO;
	}

	public F10301016VS getF10301016VS() {
		return f10301016VS;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getInquiryInputVO();
	}
	public void setF10301016VS(F10301016VS f10301016vs) {
		f10301016VS = f10301016vs;
	}
	
	//下载文件流
		public InputStream getInputStream(){
			//获取文件的全路径
			return ServletActionContext.getServletContext().getResourceAsStream(fileUrl);
		}
			//下载excel模板

		public String downLoad(){
			//下载保存时的中文名字
			Ke04DTO ke04=this.getF10301016VS().getKe04ById(inquiryInputVO);
			fileUrl=ke04.getBaz036();
			String ypcjxxFileName = ke04.getBaz037();
			try {
				String fileName = new String(ypcjxxFileName.getBytes(),"iso8859-1");
				getServletRequest().setAttribute("fileName", fileName);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return SUCCESS;
		}
		public String fileExist(){
			Ke04DTO ke04=this.getF10301016VS().getKe04ById(inquiryInputVO);
			String result="{\"success\":false}";
			String realurl=ServletActionContext.getServletContext().getRealPath(ke04.getBaz036());
			File file=new File(realurl);
			if (file.exists()) {
				result="{\"success\":true}";
			}
			createJSonData(result);
			return AJAX;
		}
}
