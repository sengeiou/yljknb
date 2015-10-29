package com.wondersgroup.mycommon.web.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.mycommon.service.PubService;
import com.wondersgroup.mycommon.web.vo.ModifyPwdVO;

@SuppressWarnings("serial")
public class ModifyPwdAction extends BaseAjaxAction {

	private ModifyPwdVO vo = new ModifyPwdVO();
	
	private PubService pubService;
	
	public void setPubService(PubService pubService) {
		this.pubService = pubService;
	}
	
	@Override
	public ValueObject getValueObject() {
		return vo;
	}
	
	@Override
	protected String operate(){
		pubService.modifypwd(vo);
		return "";
	}

}
