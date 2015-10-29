package com.wondersgroup.local.k2.f10204002.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204002.vo.F10204002VO;
import com.wondersgroup.local.k2.f10204002.vs.F10204002VS;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.StringTools;

public class F10204002Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private F10204002VO f10204002VO = new F10204002VO();

	private F10204002VS f10204002VS;

	public F10204002VO getF10204002VO() {
		return f10204002VO;
	}

	public void setF10204002VO(F10204002VO f10204002vo) {
		f10204002VO = f10204002vo;
	}

	public F10204002VS getF10204002VS() {
		return f10204002VS;
	}

	public void setF10204002VS(F10204002VS f10204002vs) {
		f10204002VS = f10204002vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10204002VO();
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
		if (!StringTools.hasText(f10204002VO.getAkb020())) {
			f10204002VO.setAkb020(organcode);
		}
		resultVO = this.getF10204002VS().queryMedDocument(page, f10204002VO);

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

		resultVO = this.getF10204002VS().queryMedDocumentDetail(page,
				f10204002VO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}
	
	/**
	 * 查询违规单据汇总统计信息
	 * 
	 * @return
	 */
	public String searchWithHospital() {

		String akb020 = this.getServletRequest().getParameter("akb020orakb021");
		//System.out.println(akb020);
		List<GatherVO> result = this.f10204002VS.searchWithHospital(akb020);

		String text = prefix + VOUtils.getJsonDataFromCollection(result)
				+ suffex;

		createJSonData(text);

		return AJAX;

	}


}
