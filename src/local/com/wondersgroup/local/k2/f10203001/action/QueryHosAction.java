package com.wondersgroup.local.k2.f10203001.action;

import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203001.vo.HosDetailVO;
import com.wondersgroup.local.k2.f10203001.vs.F10203001VS;

public class QueryHosAction extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private F10203001VS f10203001VS;

	private HosDetailVO hosDetailVO = new HosDetailVO();

	public F10203001VS getF10203001VS() {
		return f10203001VS;
	}

	public void setF10203001VS(F10203001VS f10203001vs) {
		f10203001VS = f10203001vs;
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
		List<HosDetailVO> list= this.getF10203001VS().queryMedDocumentByHos(hosDetailVO);

		String jsonData = prefix + VOUtils.getJsonDataFromCollection(list) + suffex;
		createJSonData(jsonData);
		return AJAX;
	}
}
