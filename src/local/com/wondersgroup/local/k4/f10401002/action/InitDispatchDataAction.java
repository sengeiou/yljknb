package com.wondersgroup.local.k4.f10401002.action;

import java.util.Date;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10401002.vo.DispatchManageVO;
public class InitDispatchDataAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected String operate() {
		DispatchManageVO resultVO = new DispatchManageVO();
		resultVO.setAae011(BusinessContextUtils.getUserContext().getOperatorName());
		resultVO.setAae036(new Date());
		String result=VOUtils.getJsonData(resultVO);
		return result;
	}
}
