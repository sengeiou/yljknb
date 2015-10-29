package com.wondersgroup.local.k5.f10503001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10503001.vo.ViolationComplaintVO;
import com.wondersgroup.local.k5.f10503001.vs.F10503001VS;
import com.wondersgroup.wssip.util.BeanTools;

public class ViolationComplaintAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private ViolationComplaintVO violationComplaintVO =new ViolationComplaintVO();
	
	private F10503001VS f10503001VS;
	
	public F10503001VS getF10503001VS() {
		return f10503001VS;
	}
	
	public void setF10503001VS(F10503001VS f10503001vs) {
		f10503001VS = f10503001vs;
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

public String queryOrgDoubtList(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10503001VS().queryOrgDoubtList(page,violationComplaintVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
		
	}

public String toOrgVioCompReg(){
	
	violationComplaintVO=this.getF10503001VS().toOrgVioCompReg(violationComplaintVO);
	
	String result = VOUtils.getJsonData(violationComplaintVO);
	
	createJSonData(result);
	
	return AJAX;
}
public String toOrgVioCompRegAdd(){
	
	violationComplaintVO=this.getF10503001VS().toOrgVioCompReg(violationComplaintVO);
	
	String result = VOUtils.getJsonData(violationComplaintVO);
	
	createJSonData(result);
	
	return AJAX;
}

public String consentBreach(){
	
	ViolationComplaintVO resultVO=new ViolationComplaintVO();
	
	BeanTools.copyProperties(violationComplaintVO,resultVO);
	
	resultVO=this.getF10503001VS().consentBreach(violationComplaintVO);
	
	String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
 	
 	createJSonData(result);
		
	return AJAX;
}

public String saveOrgVioCompReg(){
	
	String submitData = this.getServletRequest().getParameter("submitData");
	
	ViolationComplaintVO resultVO=new ViolationComplaintVO();
	
	resultVO = (ViolationComplaintVO) VOUtils.getBeanFromJsonData(submitData, ViolationComplaintVO.class);
	
	resultVO=this.getF10503001VS().saveOrgVioCompReg(resultVO);
	
	String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
 	
 	createJSonData(result);
		
	return AJAX;
}


public String addOrgVioCompReg(){
	
	String submitData = this.getServletRequest().getParameter("submitData");
	
	ViolationComplaintVO resultVO=new ViolationComplaintVO();
	
	resultVO = (ViolationComplaintVO) VOUtils.getBeanFromJsonData(submitData, ViolationComplaintVO.class);
	
	resultVO=this.getF10503001VS().addOrgVioCompReg(resultVO);
	
	String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
 	
 	createJSonData(result);
		
	return AJAX;
}

//public String viewPerson(){
//	
//	String aaz077 = this.getServletRequest().getParameter("aaz077");
//	
//	Af31DTO resultVO=null;
//	
//	resultVO=this.getF10503001VS().getPersonAuditInfoAndBaseInfo(aaz077);
//	// 结论确认日期
//	if (resultVO.getAae034()>0) {
//		resultVO.setAae034s(DateUtils.getDateFromYYYYMMDDString(resultVO.getAae034().toString()));
//	}
//	// 结论定论日期
//	if (resultVO.getApe727()>0) {
//		resultVO.setApe727s(DateUtils.getDateFromYYYYMMDDString(resultVO.getApe727().toString()));
//	}
//	// 重点监控截止日期
//	if (resultVO.getAae031()>0) {
//		resultVO.setAae031s(DateUtils.getDateFromYYYYMMDDString(resultVO.getAae031().toString()));
//	}
//	String result = VOUtils.getJsonData(resultVO);
//	
//	createJSonData(result);
//	
//	return AJAX;
//}

}
