package com.wondersgroup.local.k5.f10503004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503004.vs.F10503004VS;

public class CenterCheckAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private ViolationComplaintVO violationComplaintVO =new ViolationComplaintVO();
	
	private F10503004VS f10503004VS;
	
	public ViolationComplaintVO getViolationComplaintVO() {
		return violationComplaintVO;
	}

	public void setViolationComplaintVO(ViolationComplaintVO violationComplaintVO) {
		this.violationComplaintVO = violationComplaintVO;
	}

	public F10503004VS getF10503004VS() {
		return f10503004VS;
	}

	public void setF10503004VS(F10503004VS f10503004vs) {
		f10503004VS = f10503004vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getViolationComplaintVO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
public String queryBreAuditCount(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10503004VS().queryBreAuditCount(page,violationComplaintVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}

public String queryOrgAuditCount(){
	
	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
	int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

	Page page = new Page(start * limit + 1, limit, -1, limit, null);
	
	Map<String, Object> resultVO = null;
	
	resultVO=this.getF10503004VS().queryOrgAuditCount(page,violationComplaintVO);
	
	createJSonData(VOUtils.getJsonData(resultVO));
	
	return AJAX;
	
}
public String queryDoctorAuditCount(){
	
	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
	int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

	Page page = new Page(start * limit + 1, limit, -1, limit, null);
	
	Map<String, Object> resultVO = null;
	
	resultVO=this.getF10503004VS().queryDoctorAuditCount(page,violationComplaintVO);
	
	createJSonData(VOUtils.getJsonData(resultVO));
	
	return AJAX;
	
}
	
}
