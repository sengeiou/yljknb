package com.wondersgroup.local.k4.f10401001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401001.vs.F10401001VS;

public class QueryPlanManageAction  extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10401001VS f10401001VS;
	
	private PlanManageVO planManageVO=new PlanManageVO();
	
	public F10401001VS getF10401001VS() {
		return f10401001VS;
	}

	public void setF10401001VS(F10401001VS f10401001vs) {
		f10401001VS = f10401001vs;
	}

	public PlanManageVO getPlanManageVO() {
		return planManageVO;
	}

	public void setPlanManageVO(PlanManageVO planManageVO) {
		this.planManageVO = planManageVO;
	}
	
	public ValueObject getValueObject() {
		return this.getPlanManageVO();
	}
	
	protected String operate() {
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10401001VS().queryPlanManageWithPage(page, planManageVO);
		
		String result=VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	

}
