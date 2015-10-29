package com.wondersgroup.local.k4.f10401002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401002.vo.RuleTaskVO;
import com.wondersgroup.local.k4.f10401002.vs.F10401002VS;

public class QueryAnalyzeAction  extends BaseAjaxAction{

	 
	private static final long serialVersionUID = 1L;
	
	private F10401002VS f10401002VS;
	
	private RuleTaskVO ruleTastVO=new RuleTaskVO();

	public F10401002VS getF10401002VS() {
		return f10401002VS;
	}

	public void setF10401002VS(F10401002VS f10401002vs) {
		f10401002VS = f10401002vs;
	}

	public RuleTaskVO getRuleTastVO() {
		return ruleTastVO;
	}

	public void setRuleTastVO(RuleTaskVO ruleTastVO) {
		this.ruleTastVO = ruleTastVO;
	}
	
	protected String operate() {
		
		int start = 0;//Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = 5;//Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO=null;
		resultVO=this.f10401002VS.findAnalyzeWithPage(page, this.getServletRequest().getParameter("aaz325"));
		String result=VOUtils.getJsonData(resultVO);
		return result;
	}
	

}
