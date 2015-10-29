package com.wondersgroup.local.k4.f10402007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadResultVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadVO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class UploadDxzbAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
    private F10402007VS f10402007VS;
	

	public F10402007VS getF10402007VS() {
		return f10402007VS;
	}

	public void setF10402007VS(F10402007VS f10402007vs) {
		f10402007VS = f10402007vs;
	}
	
	private DxzbUploadVO dxzbUploadVO = new DxzbUploadVO();

	public DxzbUploadVO getDxzbUploadVO() {
		return dxzbUploadVO;
	}

	public void setDxzbUploadVO(DxzbUploadVO dxzbUploadVO) {
		this.dxzbUploadVO = dxzbUploadVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getDxzbUploadVO();
	}

	@Override
	protected String operate() {

		DxzbUploadResultVO resultVO = this.getF10402007VS().uploadDxzbInfo(dxzbUploadVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		 
//		try {
//			this.writerJson(result);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
		return result;
	}
	
}
