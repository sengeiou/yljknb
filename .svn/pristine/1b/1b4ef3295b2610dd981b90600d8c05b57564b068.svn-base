package com.wondersgroup.local.k5.f10504003.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10504003.vo.MedDocumentVO;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10504003.vs.F10504003VS;

public class F10504003Action extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private MedDocumentVO medDocumentVO = new MedDocumentVO();
	private F10504003VS f10504003VS;

	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}

	public F10504003VS getF10504003VS() {
		return f10504003VS;
	}

	public void setF10504003VS(F10504003VS f10504003vs) {
		f10504003VS = f10504003vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentVO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	public String queryCompainAction() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10504003VS().queryCompainDocument(page,
				medDocumentVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}
	
	/**
	 * 分页查询
	 * @return
	 */
	public String querySuspectedDocumentDetail() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10504003VS().querySuspectedDocumentDetail(page,
				medDocumentVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	public String queryNumber() {
		String akb020orakb021 = this.getServletRequest().getParameter("akb020orakb021");
		List<QueryNumberVO> result = this.getF10504003VS().queryNumber(akb020orakb021);
		String text = prefix + VOUtils.getJsonDataFromCollection(result)	+ suffex;
		createJSonData(text);
		return AJAX;
	}

}
