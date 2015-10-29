package com.wondersgroup.local.k2.f10206001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10206001.vo.F10206001VO;
import com.wondersgroup.local.k2.f10206001.vs.F10206001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10206001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10206001VO f10206001VO = new F10206001VO();

	private F10206001VS f10206001VS;

	public F10206001VS getF10206001VS() {
		return f10206001VS;
	}

	public void setF10206001VS(F10206001VS f10206001vs) {
		f10206001VS = f10206001vs;
	}

	public F10206001VO getF10206001VO() {
		return f10206001VO;
	}

	public void setF10206001VO(F10206001VO f10206001vo) {
		f10206001VO = f10206001vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10206001VO();
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
		String organcode = (String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANCODE);// 获取当前登录人的医院ids
		if (!StringTools.hasText(f10206001VO.getAkb020())) {
			f10206001VO.setAkb020(organcode);
		}
		resultVO = this.getF10206001VS().queryMedDocument(page, f10206001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}


}
