package com.wondersgroup.local.common.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.common.vs.CommonVS;

public class QueryHistorySJZAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private CommonVS commonVS;
	
	private QueryHistoryVO queryHistoryVO = new QueryHistoryVO();
	
	private String fileUrl;
	
	public QueryHistoryVO getQueryHistoryVO() {
		return queryHistoryVO;
	}

	public void setQueryHistoryVO(QueryHistoryVO queryHistoryVO) {
		this.queryHistoryVO = queryHistoryVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getQueryHistoryVO();
	}

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

	@Override
	protected String operate() {
		QueryHistoryVO vo = new QueryHistoryVO();
		vo = this.getCommonVS().querySZJ(queryHistoryVO);
		String result = VOUtils.getJsonData(vo);
		return result;
	}
	
	//下载文件流
	public InputStream getInputStream(){
		//获取文件的全路径
		return ServletActionContext.getServletContext().getResourceAsStream(fileUrl);
	}
		//下载excel模板

	public String downLoad(){
		//下载保存时的中文名字
		Ke02DTO ke02=this.getCommonVS().getKe02ById(queryHistoryVO);
		fileUrl=ke02.getBaz036();
		String ypcjxxFileName = ke02.getBaz037();
		try {
			String fileName = new String(ypcjxxFileName.getBytes(),"iso8859-1");
			getServletRequest().setAttribute("fileName", fileName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String fileExist(){
		Ke02DTO ke02=this.getCommonVS().getKe02ById(queryHistoryVO);
		String result="{\"success\":false}";
		String realurl=ServletActionContext.getServletContext().getRealPath(ke02.getBaz036());
		File file=new File(realurl);
		if (file.exists()) {
			result="{\"success\":true}";
		}
		createJSonData(result);
		return AJAX;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
