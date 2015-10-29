package com.wondersgroup.local.k3.f10301003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301003.vo.InsuredPersonInfoVO;
import com.wondersgroup.local.k3.f10301003.vo.MedicalMechanismVO;
import com.wondersgroup.local.k3.f10301003.vo.PhysicianVO;
import com.wondersgroup.local.k3.f10301003.vs.F10301003VS;
import com.wondersgroup.wssip.util.StringTools;

//查询被稽核对象信息
public class QueryBeAuditTargetInfoAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301003VS f10301003VS;

	public F10301003VS getF10301003VS() {
		return f10301003VS;
	}

	public void setF10301003VS(F10301003VS f10301003vs) {
		f10301003VS = f10301003vs;
	}
	
	@Override
	protected String operate(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			resultVO = this.getF10301003VS().queryBeAuditTargetInfoById(page, aaz318);
			
			result = VOUtils.getJsonData(resultVO);
		}
		
		return result;
	}
	
	
	public String loadInsuredPersonInfo(){
		
		String aaz010 = this.getServletRequest().getParameter("aaz010");
		
		if(StringTools.hasText(aaz010)){
			
			InsuredPersonInfoVO resultVO = getF10301003VS().queryInsuredPersonById(aaz010);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	
	public String loadPhysicianInfo(){
		
		String aaz010 = this.getServletRequest().getParameter("aaz010");
		
		//String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		if(StringTools.hasText(aaz010)){
			
			PhysicianVO resultVO = getF10301003VS().queryPhysicianById(aaz010);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadMedicalMechanismInfo(){
		
		String aaz010 = this.getServletRequest().getParameter("aaz010");
		
		if(StringTools.hasText(aaz010)){
			
			MedicalMechanismVO resultVO = getF10301003VS().queryMedicalMechanismById(aaz010);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}

}
