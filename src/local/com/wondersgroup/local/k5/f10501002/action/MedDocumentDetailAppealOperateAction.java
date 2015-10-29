package com.wondersgroup.local.k5.f10501002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10501002.vo.AppealVO;
import com.wondersgroup.local.k5.f10501002.vo.MedDocumentAppealVO;
import com.wondersgroup.local.k5.f10501002.vs.F10501002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedDocumentDetailAppealOperateAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private MedDocumentAppealVO medDocumentAppealVO = new MedDocumentAppealVO();
	
	private F10501002VS f10501002VS;

	public F10501002VS getF10501002VS() {
		return f10501002VS;
	}

	public void setF10501002VS(F10501002VS f10501002VS) {
		this.f10501002VS = f10501002VS;
	}
	
	public MedDocumentAppealVO getMedDocumentAppealVO() {
		return medDocumentAppealVO;
	}

	public void setMedDocumentAppealVO(MedDocumentAppealVO medDocumentAppealVO) {
		this.medDocumentAppealVO = medDocumentAppealVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getMedDocumentAppealVO();
	}
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AppealVO returnVO = (AppealVO) VOUtils.getBeanFromJsonData(submitData,AppealVO.class);
		
		returnVO = this.getF10501002VS().appealMedDocDetail(returnVO);
		
		String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}
	
    public String queryAppealMedDocumentDetail(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10501002VS().queryAppealMedDocumentDetail(page,medDocumentAppealVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}
    
    public String queryAppealMedDocumentDetailIllegal(){
		
    	MedDocumentAppealVO resultVO = new MedDocumentAppealVO();
		
    	BeanTools.copyProperties(medDocumentAppealVO, resultVO);
    	
		resultVO = this.getF10501002VS().queryAppealMedDocumentDetailIllegal(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
		
		return AJAX;
		
	}
    
}
