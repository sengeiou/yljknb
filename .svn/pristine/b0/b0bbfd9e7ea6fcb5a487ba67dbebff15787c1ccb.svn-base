package com.wondersgroup.local.k5.f10504001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10504001.vs.F10504001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

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

	private F10504001VS f10504001vs;

	public F10504001VS getF10504001vs() {
		return f10504001vs;
	}

	public void setF10504001vs(F10504001VS f10504001vs) {
		this.f10504001vs = f10504001vs;
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
		String organcode=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANCODE);//获取当前登录人的医院ids
		if (!StringTools.hasText(complaintHandlingVO.getAkb020())) {
			complaintHandlingVO.setAkb020(organcode);
		}
		System.out.println("organcode="+organcode);
		resultVO = this.getF10504001vs().queryComplaintHandling(page, complaintHandlingVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
    
   public String queryComplaintHandlingDetail(){
		
	   ComplaintHandlingVO resultVO = new ComplaintHandlingVO();
    	
    	BeanTools.copyProperties(complaintHandlingVO, resultVO);
		
		resultVO = this.getF10504001vs().queryComplaintHandlingDetail(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
 
    
}
