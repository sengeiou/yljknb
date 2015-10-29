package com.wondersgroup.local.k2.f10204003.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204003.vo.F10204003VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.local.k2.f10204003.vs.F10204003VS;

public class F10204003Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private F10204003VO f10204003VO = new F10204003VO();

	private F10204003VS f10204003VS;

	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	public F10204003VO getF10204003VO() {
		return f10204003VO;
	}

	public void setF10204003VO(F10204003VO f10204003vo) {
		f10204003VO = f10204003vo;
	}

	public F10204003VS getF10204003VS() {
		return f10204003VS;
	}

	public void setF10204003VS(F10204003VS f10204003vs) {
		f10204003VS = f10204003vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10204003VO();
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

		resultVO = this.getF10204003VS().queryMedDocument(page, f10204003VO);

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
		List<GatherVO> result = this.f10204003VS.searchWithHospital(akb020);

		String text = prefix + VOUtils.getJsonDataFromCollection(result)
				+ suffex;

		createJSonData(text);

		return AJAX;

	}
	
	public String queryMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids= this.getServletRequest().getParameter("ids");
		f10204003VO.setIds(ids);
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10204003VS().queryMedDocumentDetail(page,f10204003VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}

}
