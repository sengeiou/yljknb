package com.wondersgroup.local.k5.f10506002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10506002.vs.F10506002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class ComplaintHandlingPageAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private ComplaintHandlingVO complaintHandlingVO = new ComplaintHandlingVO();

	public ComplaintHandlingVO getComplaintHandlingVO() {
		return complaintHandlingVO;
	}

	public void setComplaintHandlingVO(ComplaintHandlingVO complaintHandlingVO) {
		this.complaintHandlingVO = complaintHandlingVO;
	}

	private F10506002VS f10506002vs;

	public F10506002VS getF10506002vs() {
		return f10506002vs;
	}

	public void setF10506002vs(F10506002VS f10506002vs) {
		this.f10506002vs = f10506002vs;
	}

	
	@Override
	public ValueObject getValueObject() {
		return this.getComplaintHandlingVO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
    public String queryComplaintHandling(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10506002vs().queryComplaintHandling(page, complaintHandlingVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
    
   public String queryComplaintHandlingDetail(){
		
	   ComplaintHandlingVO resultVO = new ComplaintHandlingVO();
    	
    	BeanTools.copyProperties(complaintHandlingVO, resultVO);
		
		resultVO = this.getF10506002vs().queryComplaintHandlingDetail(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
 
    
}
