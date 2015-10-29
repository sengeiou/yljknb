package com.wondersgroup.local.k3.f10301008.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301008.vo.ConveyRecordVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;

public class QueryConveyRecordAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301008VS f10301008VS;
	
	private ConveyRecordVO conveyRecordVO = new ConveyRecordVO();

	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}

	public ConveyRecordVO getConveyRecordVO() {
		return conveyRecordVO;
	}

	public void setConveyRecordVO(ConveyRecordVO conveyRecordVO) {
		this.conveyRecordVO = conveyRecordVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getConveyRecordVO();
	}

	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301008VS().queryConveyRecordWithPage(page, conveyRecordVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
}
