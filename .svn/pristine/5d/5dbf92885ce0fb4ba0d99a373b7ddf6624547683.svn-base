package com.wondersgroup.local.k4.f10402003.action;

import java.util.Date;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10402003.vo.AnalysisRuleVO;

public class InitAnalysisRuleAction extends BaseAjaxAction{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected String operate() {
		AnalysisRuleVO rulevo=new AnalysisRuleVO();
		rulevo.setAae036(new Date());
		rulevo.setAae011(BusinessContextUtils.getUserContext().getOperatorName());
		String result=VOUtils.getJsonData(rulevo);
		return result;
	}
	
}
