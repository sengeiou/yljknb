package com.wondersgroup.local.k5.f10509001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10509001.vo.Kc83VO;
import com.wondersgroup.local.k5.f10509001.vs.F10509001VS;

public class UploadAction extends BaseAjaxAction{
	
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10509001VS f10509001VS;
	
	private Kc83VO kc83vo = new Kc83VO();

	public F10509001VS getF10509001VS() {
		return f10509001VS;
	}

	public void setF10509001VS(F10509001VS f10509001vs) {
		f10509001VS = f10509001vs;
	}

	public Kc83VO getKc83vo() {
		return kc83vo;
	}

	public void setKc83vo(Kc83VO kc83vo) {
		this.kc83vo = kc83vo;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getKc83vo();
	}

	@Override
	protected String operate() {
		kc83vo=this.getF10509001VS().uploadFile(kc83vo);
		String result = prefix + VOUtils.getJsonData(kc83vo) + suffex;		
		return result;
	}

}
