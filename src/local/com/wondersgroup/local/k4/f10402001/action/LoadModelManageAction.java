package com.wondersgroup.local.k4.f10402001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vs.F10402001VS;

public class LoadModelManageAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;
	
	private F10402001VS f10402001VS;
	
	@Override
	protected String operate(){
		String id=getServletRequest().getParameter("aaz320");
		ModelManageVO resultVO = f10402001VS.queryModelById(id);
		return VOUtils.getJsonData(resultVO);
	}

	public F10402001VS getF10402001VS() {
		return f10402001VS;
	}

	public void setF10402001VS(F10402001VS f10402001vs) {
		f10402001VS = f10402001vs;
	}
}
