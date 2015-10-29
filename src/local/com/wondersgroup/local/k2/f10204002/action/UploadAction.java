package com.wondersgroup.local.k2.f10204002.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204002.vs.F10204002VS;

@SuppressWarnings("serial")
public class UploadAction extends BaseAjaxAction{
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10204002VS f10204002VS;
	
	private PreCheckVO resultVO = new PreCheckVO();
	
	public F10204002VS getF10204002VS() {
		return f10204002VS;
	}

	public void setF10204002VS(F10204002VS f10204002vs) {
		f10204002VS = f10204002vs;
	}


	public PreCheckVO getResultVO() {
		return resultVO;
	}

	public void setResultVO(PreCheckVO resultVO) {
		this.resultVO = resultVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getResultVO();
	}

	@Override
	protected String operate() {
		PreCheckVO resultVO = new PreCheckVO();
		resultVO=this.getF10204002VS().uploadFile(resultVO);
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;		
		return result;
	}

}
