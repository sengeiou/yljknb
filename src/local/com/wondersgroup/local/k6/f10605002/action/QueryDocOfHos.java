package com.wondersgroup.local.k6.f10605002.action;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10605002.vo.F10605002VO;
import com.wondersgroup.local.k6.f10605002.vs.F10605002VS;

@SuppressWarnings("serial")
public class QueryDocOfHos extends BaseAjaxAction{
	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";
	private F10605002VO f10605002VO=new F10605002VO();
	private F10605002VS f10605002VS ;
	@Override
	protected String operate() {
		List<F10605002VO> resultVO=new ArrayList<F10605002VO>();
		resultVO=this.getF10605002VS().queryDocOfHos(f10605002VO);
		String result = prefix + VOUtils.getJsonDataFromCollection(resultVO) + suffex;
		return result;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getF10605002VO();
	}
	public F10605002VO getF10605002VO() {
		return f10605002VO;
	}
	public void setF10605002VO(F10605002VO f10605002vo) {
		f10605002VO = f10605002vo;
	}
	public F10605002VS getF10605002VS() {
		return f10605002VS;
	}
	public void setF10605002VS(F10605002VS f10605002vs) {
		f10605002VS = f10605002vs;
	}
}
