package com.wondersgroup.local.k4.f10402001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vs.F10402001VS;

public final class UpdateModelManageAction extends BaseAjaxAction{

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;
	
	private F10402001VS f10402001VS;
	
	private ModelManageVO modelManageVo=new ModelManageVO();
	
	@Override
	protected String operate() {
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		ModelManageVO modelVO = new ModelManageVO();
		
		modelVO = (ModelManageVO) VOUtils.getBeanFromJsonData(submitData, ModelManageVO.class);
		
		modelVO.setAae100("1");
		
		modelVO = f10402001VS.updateModel(modelVO);
		
		String result = prefix + VOUtils.getJsonData(modelVO) + suffex;
		
		return result;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getModelManageVo();
	}
	
	public F10402001VS getF10402001VS() {
		return f10402001VS;
	}

	public void setF10402001VS(F10402001VS f10402001vs) {
		f10402001VS = f10402001vs;
	}

	public ModelManageVO getModelManageVo() {
		return modelManageVo;
	}

	public void setModelManageVo(ModelManageVO modelManageVo) {
		this.modelManageVo = modelManageVo;
	}

}
