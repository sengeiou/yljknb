package com.wondersgroup.local.k5.f10506003.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506003.vo.MedDocumentVO;
import com.wondersgroup.local.k5.f10506003.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10506003.vs.F10506003VS;
import com.wondersgroup.wssip.util.BeanTools;

public class F10506003Action extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";

	private MedDocumentVO medDocumentVO = new MedDocumentVO();
	private F10506003VS f10506003VS;

	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}

	public F10506003VS getF10506003VS() {
		return f10506003VS;
	}

	public void setF10506003VS(F10506003VS f10506003vs) {
		f10506003VS = f10506003vs;
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

		resultVO = this.getF10506003VS().queryCompainDocument(page,
				medDocumentVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}
	
	public String querySuspectedDocumentDetail() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids = this.getServletRequest().getParameter("ids");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10506003VS().querySuspectedDocumentDetail(page, ids);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String querySusDocumentDetailIllegal(){
		MedDocumentVO resultVO = new MedDocumentVO();
    	
    	BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10506003VS().querySusDocumentDetailIllegal(resultVO);
		
        String result = "{\"success\":true,\"result\":["  + VOUtils.getJsonData(resultVO) + "]}";
    	
    	createJSonData(result);
		return AJAX;
	}

	public String queryNumber() {
		String akb020orakb021 = this.getServletRequest().getParameter("akb020orakb021");
		List<QueryNumberVO> result = this.getF10506003VS().queryNumber(akb020orakb021);
		String text = prefix + VOUtils.getJsonDataFromCollection(result)	+suffex ;
		createJSonData(text);
		return AJAX;
	}

}
