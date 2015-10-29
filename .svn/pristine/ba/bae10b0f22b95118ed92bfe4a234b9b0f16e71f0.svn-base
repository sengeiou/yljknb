package com.wondersgroup.local.k3.f10301008.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301008.vo.ConveyRecordVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;

public class SaveConveyRecordAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private F10301008VS f10301008VS;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}

	@Override
	protected String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		ConveyRecordVO returnVO = new ConveyRecordVO();
		
		returnVO = (ConveyRecordVO)VOUtils.getBeanFromJsonData(submitData, ConveyRecordVO.class);
		
		returnVO = this.getF10301008VS().saveConveyRecord(returnVO);
		
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;
		
		return result;
	}
	
}
