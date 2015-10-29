package com.wondersgroup.local.k3.f10301008.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301008.vo.ConveyRecordVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.wssip.util.StringTools;

public class DeleteConveyRecordAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301008VS f10301008VS;
	
	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}

	@Override
	protected String operate(){
		
		String aaz147s = this.getServletRequest().getParameter("submitIds");
		
		String result = null;
		
		if(StringTools.hasText(aaz147s)){
			
			ConveyRecordVO resultVO = this.getF10301008VS().deleteConveyRecordByIds(aaz147s);
			
			result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		}
		
		return result;
	}
}
