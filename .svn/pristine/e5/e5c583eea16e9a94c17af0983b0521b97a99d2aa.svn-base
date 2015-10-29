package com.wondersgroup.local.k4.f10402007.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;

import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class QueryGzzbByGzmsIdAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10402007VS f10402007VS;
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		String gzdm=getServletRequest().getParameter("gzdm");
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		 resultVO = this.getF10402007VS().queryGzzbByGzmsId(page,gzdm);
		return VOUtils.getJsonData(resultVO);
		
	}

	public void setF10402007VS(F10402007VS f10402007VS) {
		this.f10402007VS = f10402007VS;
	}

	public F10402007VS getF10402007VS() {
		return f10402007VS;
	}

	
}



