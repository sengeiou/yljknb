package com.wondersgroup.local.k5.f10503002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503002.vs.F10503002VS;

public class ViolationComplaintQueryAction extends BaseAjaxAction{

private static final long serialVersionUID = 1L;
	
	private ViolationComplaintVO violationComplaintVO =new ViolationComplaintVO();
	
	private F10503002VS f10503002VS;
	
	public F10503002VS getF10503002VS() {
		return f10503002VS;
	}

	public void setF10503002VS(F10503002VS f10503002vs) {
		f10503002VS = f10503002vs;
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
	
public String toOrgBreCompQuery(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10503002VS().toOrgBreCompQuery(page,violationComplaintVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}

public String toCenterBreAuditDetail(){
	
	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
	int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

	Page page = new Page(start * limit + 1, limit, -1, limit, null);
	
	Map<String, Object> resultVO = null;
	
	resultVO=this.getF10503002VS().queryBreAuditDetail(page,violationComplaintVO);
	
	createJSonData(VOUtils.getJsonData(resultVO));
	
	return AJAX;
	
}

}
