package com.wondersgroup.local.k5.f10505001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10505001.vo.F10505001VO;
import com.wondersgroup.local.k5.f10505001.vs.F10505001VS;

@SuppressWarnings("serial")
public class DocApplyAction extends BaseAjaxAction {

	private F10505001VO f10505001VO = new F10505001VO();
	private F10505001VS f10505001VS;

	public F10505001VO getF10505001VO() {
		return f10505001VO;
	}

	public void setF10505001VO(F10505001VO f10505001vo) {
		f10505001VO = f10505001vo;
	}

	public F10505001VS getF10505001VS() {
		return f10505001VS;
	}

	public void setF10505001VS(F10505001VS f10505001vs) {
		f10505001VS = f10505001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10505001VO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	/**
	 * 查询代医师申述的单据列表
	 * **/
	public String queryMedDocument() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10505001VS().queryMedDocument(page, f10505001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}
	
}
