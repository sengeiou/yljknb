package com.wondersgroup.local.k2.f10202004.action;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10202004.vo.F10202004VO;
import com.wondersgroup.local.k2.f10202004.vs.F10202004VS;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

@SuppressWarnings("serial")
public class F10202004Action extends BaseAjaxAction {
	private F10202004VS f10202004VS;
	private F10202004VO f10202004VO = new F10202004VO();

	public F10202004VS getF10202004VS() {
		return f10202004VS;
	}

	public void setF10202004VS(F10202004VS f10202004vs) {
		f10202004VS = f10202004vs;
	}

	public F10202004VO getF10202004VO() {
		return f10202004VO;
	}

	public void setF10202004VO(F10202004VO f10202004vo) {
		f10202004VO = f10202004vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10202004VO();
	}

	@Override
	protected String operate() {
		System.out.println(1);
		return super.operate();
	}

	public String queryMedDocument() {
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10202004VS().queryMedDocument(page, f10202004VO);

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
		f10202004VO.setIds(ids);
		String baz023str = this.getServletRequest().getParameter("baz023");
		Date baz023 = null;
		if (StringTools.hasText(baz023str)) {
			baz023 = DateTools.getDateFromYYYYMMDDString(baz023str);
			f10202004VO.setBaz023(baz023);
		}
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10202004VS().queryMedDocumentDetail(page,
				f10202004VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
	}
}
