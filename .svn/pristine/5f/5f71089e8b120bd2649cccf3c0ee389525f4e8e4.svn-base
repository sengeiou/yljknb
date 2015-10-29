package com.wondersgroup.local.k4.f10402007.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class AddDxzbAction extends BaseAjaxAction {

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";

	private static final long serialVersionUID = 1L;

	private F10402007VS f10402007VS;

	private DxzbVO dxzbVO = new DxzbVO();
	
	public F10402007VS getF10402007VS() {
		return f10402007VS;
	}

	public void setF10402007VS(F10402007VS f10402007vs) {
		f10402007VS = f10402007vs;
	}

	public DxzbVO getDxzbVO() {
		return dxzbVO;
	}

	public void setDxzbVO(DxzbVO dxzbVO) {
		this.dxzbVO = dxzbVO;
	}

	@Override
	protected String operate() {

		String submitData = this.getServletRequest().getParameter("submitData");

		DxzbVO dxzbVO = new DxzbVO();

		dxzbVO = (DxzbVO) VOUtils.getBeanFromJsonData(submitData, DxzbVO.class);

		dxzbVO.setZt("0");

		dxzbVO = f10402007VS.saveDxzb(dxzbVO);

		String result = prefix + VOUtils.getJsonData(dxzbVO) + suffex;

		return result;

	}
	


}
