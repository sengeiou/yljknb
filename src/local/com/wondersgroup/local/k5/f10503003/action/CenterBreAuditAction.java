package com.wondersgroup.local.k5.f10503003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503003.vs.F10503003VS;

public class CenterBreAuditAction extends BaseAjaxAction{

private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private ViolationComplaintVO violationComplaintVO =new ViolationComplaintVO();
	
	private F10503003VS f10503003VS;
	
	public F10503003VS getF10503003VS() {
		return f10503003VS;
	}

	public void setF10503003VS(F10503003VS f10503003vs) {
		f10503003VS = f10503003vs;
	}

	public ViolationComplaintVO getViolationComplaintVO() {
		return violationComplaintVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getViolationComplaintVO();
	}

	public void setViolationComplaintVO(ViolationComplaintVO violationComplaintVO) {
		this.violationComplaintVO = violationComplaintVO;
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
public String toCenterBreAuditQuery(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10503003VS().queryBreAudit(page,violationComplaintVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}

public String toCenterBreAuditDetail(){
	
	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
	int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

	Page page = new Page(start * limit + 1, limit, -1, limit, null);
	
	Map<String, Object> resultVO = null;
	
	resultVO=this.getF10503003VS().queryBreAuditDetail(page,violationComplaintVO);
	
	createJSonData(VOUtils.getJsonData(resultVO));
	
	return AJAX;
	
}

public String toBreAuditPass(){
	
	violationComplaintVO=this.getF10503003VS().toBreAuditPass(violationComplaintVO);
	
	String result = VOUtils.getJsonData(violationComplaintVO);
	
	createJSonData(result);
	
	return AJAX;
}

public String toBreAuditNotPass(){
	
	violationComplaintVO=this.getF10503003VS().toBreAuditNotPass(violationComplaintVO);
	
	String result = VOUtils.getJsonData(violationComplaintVO);
	
	createJSonData(result);
	
	return AJAX;
}

public String breAuditPass(){
	
String submitData = this.getServletRequest().getParameter("submitData");
	
	ViolationComplaintVO resultVO=new ViolationComplaintVO();
	
	resultVO = (ViolationComplaintVO) VOUtils.getBeanFromJsonData(submitData, ViolationComplaintVO.class);
	
	resultVO=this.getF10503003VS().breAuditPass(resultVO);
	
	String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
 	
 	createJSonData(result);
		
	return AJAX;
}

public String breAuditNotPass(){
	
String submitData = this.getServletRequest().getParameter("submitData");
	
	ViolationComplaintVO resultVO=new ViolationComplaintVO();
	
	resultVO = (ViolationComplaintVO) VOUtils.getBeanFromJsonData(submitData, ViolationComplaintVO.class);
	
	resultVO=this.getF10503003VS().breAuditNotPass(resultVO);
	
	String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
 	
 	createJSonData(result);
		
	return AJAX;
}

}
