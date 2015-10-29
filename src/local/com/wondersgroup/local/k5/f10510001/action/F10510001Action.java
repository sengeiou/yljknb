package com.wondersgroup.local.k5.f10510001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10510001.vo.F10510001VO;
import com.wondersgroup.local.k5.f10510001.vs.F10510001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10510001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10510001VO f10510001VO = new F10510001VO();

	private F10510001VS f10510001VS;
	
	public F10510001VO getF10510001VO() {
		return f10510001VO;
	}

	public void setF10510001VO(F10510001VO f10510001vo) {
		f10510001VO = f10510001vo;
	}

	public F10510001VS getF10510001VS() {
		return f10510001VS;
	}

	public void setF10510001VS(F10510001VS f10510001vs) {
		f10510001VS = f10510001vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10510001VO();
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
		if (!StringTools.hasText(f10510001VO.getAkb020())) {
			f10510001VO.setAkb020(organcode);
		}
		resultVO = this.getF10510001VS().queryMedDocument(page, f10510001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}


}
