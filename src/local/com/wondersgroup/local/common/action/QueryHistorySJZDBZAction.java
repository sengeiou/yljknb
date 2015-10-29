package com.wondersgroup.local.common.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.QueryHistoryVO;
import com.wondersgroup.local.common.vs.CommonVS;

public class QueryHistorySJZDBZAction extends BaseAjaxAction {

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
		vo = this.getCommonVS().querySZJDBZ(queryHistoryVO);
		String result = VOUtils.getJsonData(vo);
		return result;
	}
	
	//下载文件流
	public InputStream getInputStream(){
		//获取文件的全路径
		return ServletActionContext.getServletContext().getResourceAsStream(fileUrl);
	}
		//下载excel模板

	public String downLoadDBZ(){
		//下载保存时的中文名字
		Ke03DTO ke03=this.getCommonVS().getKe03ById(queryHistoryVO);
		fileUrl=ke03.getBaz036();
		String ypcjxxFileName = ke03.getBaz037();
		try {
			String fileName = new String(ypcjxxFileName.getBytes(),"iso8859-1");
			getServletRequest().setAttribute("fileName", fileName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String fileExistDBZ(){
		Ke03DTO ke03=this.getCommonVS().getKe03ById(queryHistoryVO);
		String result="{\"success\":false}";
		String realurl=ServletActionContext.getServletContext().getRealPath(ke03.getBaz036());
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
