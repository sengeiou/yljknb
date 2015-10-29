package com.wondersgroup.local.k2.f10205001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10205001.vo.F10205001VO;
import com.wondersgroup.local.k2.f10205001.vs.F10205001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10205001Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private F10205001VO f10205001VO = new F10205001VO();

	private F10205001VS f10205001VS;

	public F10205001VS getF10205001VS() {
		return f10205001VS;
	}

	public void setF10205001VS(F10205001VS f10205001vs) {
		f10205001VS = f10205001vs;
	}

	public F10205001VO getF10205001VO() {
		return f10205001VO;
	}

	public void setF10205001VO(F10205001VO f10205001vo) {
		f10205001VO = f10205001vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10205001VO();
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
		if (!StringTools.hasText(f10205001VO.getAkb020())) {
			f10205001VO.setAkb020(organcode);
		}
		resultVO = this.getF10205001VS().queryMedDocument(page, f10205001VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}


	public String dealMedDocument() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		f10205001VO = (F10205001VO) VOUtils.getBeanFromJsonData(submitData,
				F10205001VO.class);
		
		f10205001VO.setOrgname((String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		
		f10205001VO.setOperatorId((String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_ID));
		
		f10205001VO.setOperatorName((String) getSession().get(
				SessionConstants.WSSIP_OPERATOR_NAME));
		
		f10205001VO = this.getF10205001VS().dealMedDocument(f10205001VO);
		
		String jsonData = prefix + VOUtils.getJsonData(f10205001VO) + suffex;
		
		createJSonData(jsonData);
		
		return AJAX;
		
	}
}
