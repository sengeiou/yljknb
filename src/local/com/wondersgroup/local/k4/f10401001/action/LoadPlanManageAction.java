package com.wondersgroup.local.k4.f10401001.action;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401001.vs.F10401001VS;

public class LoadPlanManageAction extends BaseAjaxAction {

	private F10401001VS f10401001VS;
	private PlanManageVO planManageVo=new PlanManageVO();
	public PlanManageVO getPlanManageVo() {
		return planManageVo;
	}

	public void setPlanManageVo(PlanManageVO planManageVo) {
		this.planManageVo = planManageVo;
	}

	public F10401001VS getF10401001VS() {
		return f10401001VS;
	}

	public void setF10401001VS(F10401001VS f10401001vs) {
		f10401001VS = f10401001vs;
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected String operate() {

		String id = getServletRequest().getParameter("aaz100");
		PlanManageVO resultVO = f10401001VS.find(id);
		
		return VOUtils.getJsonData(resultVO);

	}

}
