package com.wondersgroup.local.k3.f10301004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301004.vo.Ac01VO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vo.Kb01VO;
import com.wondersgroup.local.k3.f10301004.vo.Kf05VO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;

public class RelateRecordAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301004VS f10301004VS;
	private InquiryInputVO inquiryInputVO = new InquiryInputVO();
	
	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	public InquiryInputVO getInquiryInputVO() {
		return inquiryInputVO;
	}

	public void setInquiryInputVO(InquiryInputVO inquiryInputVO) {
		this.inquiryInputVO = inquiryInputVO;
	}

	@Override
	public ValueObject getValueObject() {
		return inquiryInputVO;
	}
	@Override
	protected String operate() {
		
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
//		String data = this.getServletRequest().getParameter("data");
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301004VS().queryAf37WithPage(page,inquiryInputVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String relateRecord() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		String aaz381 = this.getServletRequest().getParameter("aaz381");
		
		CaseDetailsVO resultVO = new CaseDetailsVO();
		resultVO.setAaz318(Long.parseLong(aaz318));
		resultVO.setAaz381(Long.parseLong(aaz381));
		this.getF10301004VS().relateRecord(resultVO);
		
		String result = prefix + suffex;
		createJSonData(result);
		return AJAX;
	}
	
	/**
	 * 医师
	 * @return
	 */
	public String queryKf05ByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		Kf05VO kf05vo = new Kf05VO();
		
		kf05vo.setAaz077(aaz077);
		
		String resultVO = "";
		
		kf05vo = this.getF10301004VS().queryKc05ByAaz077(kf05vo);
		
		resultVO = VOUtils.getJsonData(kf05vo);
		
		createJSonData(resultVO);
		
		return AJAX;
	}
	
	/**
	 * 参保人
	 * @return
	 */
	public String queryAc01ByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		Ac01VO ac01vo = new Ac01VO();
		
		ac01vo.setAaz077(aaz077);
		
		String resultVO = "";
		
		ac01vo = this.getF10301004VS().queryAc01ByAaz077(ac01vo);
		
		resultVO = VOUtils.getJsonData(ac01vo);
		
		createJSonData(resultVO);
		
		return AJAX;
	}
	
	/**
	 * 医疗机构
	 * @return
	 */
	public String queryKb01ByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		Kb01VO kb01vo = new Kb01VO();
		
		kb01vo.setAaz077(aaz077);
		
		String resultVO = "";
		
		kb01vo = this.getF10301004VS().queryKb01ByAaz077(kb01vo);
		
		resultVO = VOUtils.getJsonData(kb01vo);
		
		createJSonData(resultVO);
		
		return AJAX;
	}

}
