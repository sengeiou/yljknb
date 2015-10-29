package com.wondersgroup.local.k5.f10504002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10504002.vs.F10504002VS;
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

	private F10504002VS f10504002vs;

	
	public F10504002VS getF10504002vs() {
		return f10504002vs;
	}

	public void setF10504002vs(F10504002VS f10504002vs) {
		this.f10504002vs = f10504002vs;
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
		
		resultVO = this.getF10504002vs().queryComplaintHandling(page, complaintHandlingVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
    
   public String queryComplaintHandlingDetail(){
		
	   ComplaintHandlingVO resultVO = new ComplaintHandlingVO();
    	
    	BeanTools.copyProperties(complaintHandlingVO, resultVO);
		
		resultVO = this.getF10504002vs().queryComplaintHandlingDetail(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
 
    
}
