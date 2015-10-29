package com.wondersgroup.local.common.action;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.GzSummaryVO;
import com.wondersgroup.local.common.vs.CommonVS;

@SuppressWarnings("serial")
public class QueryGzSummaryAction extends BaseAjaxAction{
	private GzSummaryVO gzsummaryVO=new GzSummaryVO();
	private CommonVS commonVS;
	public CommonVS getCommonVS() {
		return commonVS;
	}
	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}
	public void setGzsummaryVO(GzSummaryVO gzsummaryVO) {
		this.gzsummaryVO = gzsummaryVO;
	}
	public GzSummaryVO getGzsummaryVO() {
		return gzsummaryVO;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getGzsummaryVO();
	}
	@Override
	protected String operate() {
		List<GzSummaryVO> resultVO=new ArrayList<GzSummaryVO>();
		resultVO=this.getCommonVS().queryGzSummary(gzsummaryVO);
		String result = VOUtils.getJsonDataFromCollection(resultVO);
		return "{\"success\":true,\"result\":"+result+"}";
	}
}
