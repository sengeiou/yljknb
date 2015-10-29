package com.wondersgroup.local.k2.f10202003.action;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10202003.vo.F10202003VO;
import com.wondersgroup.local.k2.f10202003.vs.F10202003VS;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

@SuppressWarnings("serial")
public class F10202003Action extends BaseAjaxAction {
	private F10202003VS f10202003VS;
	private F10202003VO f10202003VO = new F10202003VO();

	public F10202003VS getF10202003VS() {
		return f10202003VS;
	}

	public void setF10202003VS(F10202003VS f10202003vs) {
		f10202003VS = f10202003vs;
	}

	public F10202003VO getF10202003VO() {
		return f10202003VO;
	}

	public void setF10202003VO(F10202003VO f10202003vo) {
		f10202003VO = f10202003vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10202003VO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	public String queryMedDocument() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10202003VS().queryMedDocument(page, f10202003VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
	}

	public String queryMedDocumentDetail() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		String ids = this.getServletRequest().getParameter("ids");
		f10202003VO.setIds(ids);
		String baz023str = this.getServletRequest().getParameter("baz023");
		Date baz023 = null;
		if (StringTools.hasText(baz023str)) {
			baz023 = DateTools.getDateFromYYYYMMDDString(baz023str);
			f10202003VO.setBaz023(baz023);
		}
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10202003VS().queryMedDocumentDetail(page,
				f10202003VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
	}
}
