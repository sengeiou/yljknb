package com.wondersgroup.local.k2.f10201002.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201002.vo.MedDocumentVO;
import com.wondersgroup.local.k2.f10201002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10201002.vs.F10201002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentDetailOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentVO medDocumentVO = new MedDocumentVO();
	
	private F10201002VS f10201002VS;

	public F10201002VS getF10201002VS() {
		return f10201002VS;
	}

	public void setF10201002VS(F10201002VS f10201002vs) {
		f10201002VS = f10201002vs;
	}
	
	public MedDocumentVO getMedDocumentVO() {
		return medDocumentVO;
	}

	public void setMedDocumentVO(MedDocumentVO medDocumentVO) {
		this.medDocumentVO = medDocumentVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentVO();
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		PreCheckVO returnVO = (PreCheckVO) VOUtils.getBeanFromJsonData(submitData,PreCheckVO.class);
		
		returnVO = this.getF10201002VS().preCheckMedDocDetail(returnVO);
		
		String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}
	
    public String queryMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10201002VS().queryMedDocumentDetail(page,medDocumentVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
		
	}
    
    public String queryMedDocumentDetailIllegal(){
		
    	MedDocumentVO resultVO = new MedDocumentVO();
    	
    	BeanTools.copyProperties(medDocumentVO, resultVO);
		
		resultVO = this.getF10201002VS().queryMedDocumentDetailIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
    
    public String queryCheckRecord(){
    	
    	String baz003 = this.getServletRequest().getParameter("baz003");
    	
    	List<PreCheckVO> returnVO = this.getF10201002VS().queryCheckRecordByBaz003(baz003);
    	
    	String result = "{\"success\":true,\"result\":"  + VOUtils.getJsonDataFromCollection(returnVO) + "}";
    	
    	createJSonData(result);
    	
    	return AJAX;
    }
    
}
