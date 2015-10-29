package com.wondersgroup.local.k2.f10203002.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10203002.vo.F10203002VO;
import com.wondersgroup.local.k2.f10203002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10203002.vo.QueryNumberVO;
import com.wondersgroup.local.k2.f10203002.vs.F10203002VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10203002Action extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	private static final String prefix = "{\"success\":true,\"result\":[";
	private static final String suffex = "]}";

	private MedDocumentVO medDocumentVO = new MedDocumentVO();
	
	private F10203002VO f10203002VO = new F10203002VO();

	private F10203002VS f10203002VS;

	public F10203002VS getF10203002VS() {
		return f10203002VS;
	}

	public void setF10203002VS(F10203002VS f10203002vs) {
		f10203002VS = f10203002vs;
	}

	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}

	public F10203002VO getF10203002VO() {
		return f10203002VO;
	}

	public void setF10203002VO(F10203002VO f10203002vo) {
		f10203002VO = f10203002vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentVO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	public String querySuspectedDocument() {

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String organcode=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANCODE);//获取当前登录人的医院ids
		if (!StringTools.hasText(medDocumentVO.getAkb020())) {
			medDocumentVO.setAkb020(organcode);
		}
		System.out.println("organcode="+organcode);
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;

		resultVO = this.getF10203002VS().querySuspectedDocument(page, medDocumentVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

	public String querySuspectedDocumentDetail() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String ids = this.getServletRequest().getParameter("ids");
		String baz031 = this.getServletRequest().getParameter("baz031");
		String ake007 =this.getServletRequest().getParameter("ake007");
		f10203002VO.setIds(ids);
		f10203002VO.setBaz031(baz031);
		f10203002VO.setAke007(ake007);
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10203002VS().querySuspectedDocumentDetail(page, f10203002VO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
	}
	
	public String querySusDocumentDetailIllegal(){
		MedDocumentVO resultVO = new MedDocumentVO();
    	
    	BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10203002VS().querySusDocumentDetailIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
		return AJAX;
	}
	
	public String queryNumber(){
		String akb020orakb021 = this.getServletRequest().getParameter("akb020orakb021");
		String baz031 = this.getServletRequest().getParameter("baz031");
		List<QueryNumberVO> result = this.getF10203002VS().queryNumber(akb020orakb021,baz031);
		String text = "{\"success\":true,\"result\":" + VOUtils.getJsonDataFromCollection(result)	+ "}";
		createJSonData(text);
		return AJAX;
	}

}
