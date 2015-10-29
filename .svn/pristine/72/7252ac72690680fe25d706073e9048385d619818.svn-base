package com.wondersgroup.local.k4.f10402001.action;

import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;

public class LoadModelInitData extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	@Override
	protected String operate() {

		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		ModelManageVO resultVO = new ModelManageVO();

		resultVO.setAae011(BusinessContextUtils.getUserContext()
				.getOperatorName());

		resultVO.setAae036(fmt.format(new Date()));

		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}

}
