package com.wondersgroup.local.k4.f10401003.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401003.vo.RuleTasksVO;
import com.wondersgroup.local.k4.f10401003.vs.F10401003VS;

public class QueryTaskAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
    private F10401003VS f10401003VS;
	
	private RuleTasksVO ruleTasksVO = new RuleTasksVO();
	
	
	public RuleTasksVO getRuleTasksVO() {
		return ruleTasksVO;
	}

	public void setRuleTasksVO(RuleTasksVO ruleTasksVO) {
		this.ruleTasksVO = ruleTasksVO;
	}

	public F10401003VS getF10401003VS() {
		return f10401003VS;
	}

	public void setF10401003VS(F10401003VS f10401003vs) {
		f10401003VS = f10401003vs;
	}

	protected String operate() {
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		String aaz327 = this.getServletRequest().getParameter("aaz327");
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		ruleTasksVO.setAaz327(Long.parseLong(aaz327));
		resultVO =this.f10401003VS.queryTaskWithPage(page, ruleTasksVO);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}
	

}
