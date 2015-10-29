package com.wondersgroup.local.k2.f10203003.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203003.vo.HosDetailVO;
import com.wondersgroup.local.k2.f10203003.vs.F10203003VS;

public class QueryHosAction extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private F10203003VS f10203003VS;

	private HosDetailVO hosDetailVO = new HosDetailVO();

	public F10203003VS getF10203003VS() {
		return f10203003VS;
	}

	public void setF10203003VS(F10203003VS f10203003vs) {
		f10203003VS = f10203003vs;
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
		List<HosDetailVO> list= this.getF10203003VS().queryMedDocumentByHos(hosDetailVO);

		String jsonData = prefix + VOUtils.getJsonDataFromCollection(list) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}
