package com.wondersgroup.local.k5.f10508001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10508001.vo.F10508001VO;
import com.wondersgroup.local.k5.f10508001.vs.F10508001VS;
import com.wondersgroup.wssip.application.SessionConstants;

@SuppressWarnings("serial")
public class F10508001Action extends BaseAjaxAction {
	private F10508001VS f10508001VS;
	private F10508001VO f10508001VO = new F10508001VO();

	public F10508001VS getF10508001VS() {
		return f10508001VS;
	}

	public void setF10508001VS(F10508001VS f10508001vs) {
		f10508001VS = f10508001vs;
	}

	public F10508001VO getF10508001VO() {
		return f10508001VO;
	}

	public void setF10508001VO(F10508001VO f10508001vo) {
		f10508001VO = f10508001vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10508001VO();
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

		String organcode=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANCODE);//获取当前登录人的医院ids
		f10508001VO.setAkb020(organcode);
		resultVO = this.getF10508001VS().queryMedDocument(page, f10508001VO);

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
		f10508001VO.setIds(ids);
		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10508001VS().queryMedDocumentDetail(page,
				f10508001VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
	}
}
