package com.wondersgroup.local.k5.f10505002.action;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10505002.vo.F10505002VO;
import com.wondersgroup.local.k5.f10505002.vs.F10505002VS;

@SuppressWarnings("serial")
public class F10505002Action extends BaseAjaxAction {
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";
	private F10505002VO f10505002VO = new F10505002VO();
	private F10505002VS f10505002VS;
	
	public F10505002VO getF10505002VO() {
		return f10505002VO;
	}

	public void setF10505002VO(F10505002VO f10505002vo) {
		f10505002VO = f10505002vo;
	}

	public F10505002VS getF10505002VS() {
		return f10505002VS;
	}

	public void setF10505002VS(F10505002VS f10505002vs) {
		f10505002VS = f10505002vs;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getF10505002VO();
	}

	@Override
	protected String operate() {
		List<F10505002VO> resultVO=new ArrayList<F10505002VO>();
		resultVO = this.getF10505002VS().queryMedDocumentByHos(f10505002VO);
		String result = prefix + VOUtils.getJsonDataFromCollection(resultVO) + suffex;
		return result;
	}
}
