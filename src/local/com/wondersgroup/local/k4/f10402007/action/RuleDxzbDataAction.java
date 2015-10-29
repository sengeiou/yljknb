package com.wondersgroup.local.k4.f10402007.action;

import java.util.Date;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;

public class RuleDxzbDataAction extends BaseAjaxAction{
			
			private static final long serialVersionUID = 1L;
	
			@Override
			protected String operate(){
				DxzbVO resultVO = new DxzbVO();
				resultVO.setCjrmc(BusinessContextUtils.getUserContext().getOperatorName());
				resultVO.setCjsj(new Date());
				String result=VOUtils.getJsonData(resultVO);
				return result;
			}

		}




