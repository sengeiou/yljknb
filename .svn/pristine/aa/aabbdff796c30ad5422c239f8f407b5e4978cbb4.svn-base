package com.wondersgroup.local.k5.f10502001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502001.vs.F10502001VS;

public class LoadHospMessageAction extends BaseAjaxAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private F10502001VO f10502001VO=new F10502001VO();
	private F10502001VS f10502001VS;
	

	@Override
	protected String operate() {
		
		f10502001VO.setAaz107("128900");
		
		F10502001VO resultVO = f10502001VS.find(f10502001VO.getAaz107());
		
		return VOUtils.getJsonData(resultVO);

	}


	public void setF10502001VO(F10502001VO f10502001VO) {
		this.f10502001VO = f10502001VO;
	}


	public F10502001VO getF10502001VO() {
		return f10502001VO;
	}


	public void setF10502001VS(F10502001VS f10502001VS) {
		this.f10502001VS = f10502001VS;
	}


	public F10502001VS getF10502001VS() {
		return f10502001VS;
	}

	
	@Override
	public ValueObject getValueObject() {
		return this.getF10502001VO();
	}

}
