package com.wondersgroup.local.k4.f10402007.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class QueryApplyDxzbInfo extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	
	private F10402007VS f10402007VS; 

	public F10402007VS getF10402007VS() {
		return f10402007VS;
	}

	public void setF10402007VS(F10402007VS f10402007vs) {
		f10402007VS = f10402007vs;
	}

	public String querySuccDxzbInfo() {

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		String bsz005 = this.getServletRequest().getParameter("bsz005_succ");

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10402007VS().queryDxzbApplyInfo(page, bsz005);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);
		
		

		return AJAX;
		
	}
	
	public String queryFailDxzbInfo() {

		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		String bsz005 = this.getServletRequest().getParameter("bsz005_fail");

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10402007VS().queryDxzbApplyInfo(page, bsz005);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;
		
	}
}
