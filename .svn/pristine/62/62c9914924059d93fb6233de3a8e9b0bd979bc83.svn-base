package com.wondersgroup.local.k5.f10506001.action;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506001.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10506001.vs.F10506001VS;

public class QueryHosAction extends BaseAjaxAction {
	private static final long serialVersionUID = 1L;

	private static final String prefix = "{\"success\":true,\"result\":";

	private static final String suffex = "}";
	
	private HosDetailVO hosDetailVO = new HosDetailVO();
	
	private F10506001VS f10506001VS;
	
	@Override
	public ValueObject getValueObject() {
		return this.getHosDetailVO();
	}
	
	@Override
	protected String operate() {
		List<HosDetailVO> resultVO=new ArrayList<HosDetailVO>();
		resultVO= this.f10506001VS.queryMedDocumentByHos(hosDetailVO);
		String result = prefix + VOUtils.getJsonDataFromCollection(resultVO) + suffex;
		return result;
	}
	
	public F10506001VS getF10506001VS() {
		return f10506001VS;
	}

	public void setF10506001VS(F10506001VS f10506001vs) {
		f10506001VS = f10506001vs;
	}

	public HosDetailVO getHosDetailVO() {
		return hosDetailVO;
	}

	public void setHosDetailVO(HosDetailVO hosDetailVO) {
		this.hosDetailVO = hosDetailVO;
	}

	public static String getPrefix() {
		return prefix;
	}

	public static String getSuffex() {
		return suffex;
	}

}
