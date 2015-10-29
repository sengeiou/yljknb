package com.wondersgroup.local.k3.f10301008.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k3.f10301008.vo.VerdictFinishVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.wssip.util.StringTools;

//告知终结
public class NotifyFinishAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301008VS f10301008VS;

	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}
	
	@Override
	protected String operate(){
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		String result = null;
		
		if(StringTools.hasText(aaz077)){
			
			VerdictFinishVO returnVO = this.getF10301008VS().finishConvey(aaz077);
			
			result = VOUtils.getJsonData(returnVO);
		}
		
		return result;
	}

}
