package com.wondersgroup.local.k5.f10507002.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10507002.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10507002.vs.F10507002VS;

public class QueryHosAction extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private F10507002VS f10507002VS;

	private HosDetailVO hosDetailVO = new HosDetailVO();

	public F10507002VS getF10507002VS() {
		return f10507002VS;
	}

	public void setF10507002VS(F10507002VS f10507002vs) {
		f10507002VS = f10507002vs;
	}

	public HosDetailVO getHosDetailVO() {
		return hosDetailVO;
	}
	
	public void setHosDetailVO(HosDetailVO hosDetailVO) {
		this.hosDetailVO = hosDetailVO;
	}

	

	@Override
	public ValueObject getValueObject() {
		return this.getHosDetailVO();
	}

	/**
	 * 查询医院汇总
	 * @return
	 */
	public String queryMedDocumentByHos() {
		List<HosDetailVO> list= this.getF10507002VS().queryMedDocumentByHos(hosDetailVO);

		String jsonData = prefix + VOUtils.getJsonDataFromCollection(list) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}
