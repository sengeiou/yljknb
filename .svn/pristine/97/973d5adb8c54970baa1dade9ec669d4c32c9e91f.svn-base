package com.wondersgroup.local.k2.f10204001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204001.vo.F10204001VO;
import com.wondersgroup.local.k2.f10204001.vs.F10204001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10204001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10204001VO f10204001VO = new F10204001VO();

	private F10204001VS f10204001VS;

	public F10204001VS getF10204001VS() {
		return f10204001VS;
	}

	public void setF10204001VS(F10204001VS f10204001vs) {
		f10204001VS = f10204001vs;
	}

	public F10204001VO getF10204001VO() {
		return f10204001VO;
	}

	public void setF10204001VO(F10204001VO f10204001vo) {
		f10204001VO = f10204001vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10204001VO();
	}

	/**
	 * 分页查询违规单据信息
	 * 
	 * @return
	 */
	public String queryMedDocument() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;
		String organcode=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANCODE);//获取当前登录人的医院ids
		if (!StringTools.hasText(f10204001VO.getAkb020())) {
			f10204001VO.setAkb020(organcode);
		}
		resultVO = this.getF10204001VS().queryMedDocument(page, f10204001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

	/**
	 * 分页查询违规单据明细信息
	 * 
	 * @return
	 */
	public String queryMedDocumentDetail() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10204001VS().queryMedDocumentDetail(page,
				f10204001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

}
