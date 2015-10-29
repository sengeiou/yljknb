package com.wondersgroup.local.k3.f10301004.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301004.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryBeAuditAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301004VS f10301004VS;

	public F10301004VS getF10301004VS() {
		return f10301004VS;
	}

	public void setF10301004VS(F10301004VS f10301004vs) {
		f10301004VS = f10301004vs;
	}
	
	
	@Override
	protected String operate() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			resultVO = this.getF10301004VS().queryBeAuditInfoByAaz318(page, aaz318);
			
			result = VOUtils.getJsonData(resultVO);
		}
		
		return result;
	}
	
	public String loadBeAuditTargetInfo(){
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		if(StringTools.hasText(aaz077)){
			
			BeAuditInfoVO resultVO = getF10301004VS().queryBeAuditTargetInfoById(aaz077);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}

}
