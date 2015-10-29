package com.wondersgroup.local.k4.f10402002.action;

import java.util.Date;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;

public class InitRuleDataAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected String operate() {
		RuleVO resultVO = new RuleVO();
		resultVO.setAae011(BusinessContextUtils.getUserContext().getOperatorName());
		resultVO.setAae036(new Date());
		String result=VOUtils.getJsonData(resultVO);
		return result;
	}
}
