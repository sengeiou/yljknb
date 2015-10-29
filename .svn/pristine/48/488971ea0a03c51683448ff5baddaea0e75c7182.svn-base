package com.wondersgroup.local.k3.f10301009.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301009.vo.TurnMessageVO;
import com.wondersgroup.local.k3.f10301009.vs.F10301009VS;

public class SaveTurnMessageAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301009VS f10301009VS;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	public F10301009VS getF10301009VS() {
		return f10301009VS;
	}

	public void setF10301009VS(F10301009VS f10301009vs) {
		f10301009VS = f10301009vs;
	}
	
	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		TurnMessageVO returnVO = new TurnMessageVO();
		
		returnVO = (TurnMessageVO)VOUtils.getBeanFromJsonData(submitData, TurnMessageVO.class);
		
		returnVO = this.getF10301009VS().saveTurnInfo(returnVO);
		
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}

}
