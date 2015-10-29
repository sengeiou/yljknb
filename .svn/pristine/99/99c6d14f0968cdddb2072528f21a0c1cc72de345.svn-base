package com.wondersgroup.local.k2.f10201003.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10201003.vo.MedInteractiveVO;
import com.wondersgroup.local.k2.f10201003.vo.TalkVO;
import com.wondersgroup.local.k2.f10201003.vs.F10201003VS;
import com.wondersgroup.wssip.util.BeanTools;

public class MedInteractiveAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	
	private MedInteractiveVO medInteractiveVO = new MedInteractiveVO();
	
	private F10201003VS f10201003VS;

	public F10201003VS getF10201003VS() {
		return f10201003VS;
	}

	public void setF10201003VS(F10201003VS f10201003vs) {
		f10201003VS = f10201003vs;
	}

	public MedInteractiveVO getMedInteractiveVO() {
		return medInteractiveVO;
	}

	public void setMedInteractiveVO(MedInteractiveVO medInteractiveVO) {
		this.medInteractiveVO = medInteractiveVO;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getMedInteractiveVO();
	}
	
	@Override
	protected String operate() {
		
        String submitData = this.getServletRequest().getParameter("submitData");
		
        TalkVO resultVO = new TalkVO();
		
		resultVO = (TalkVO) VOUtils.getBeanFromJsonData(submitData, TalkVO.class);
		
		resultVO = this.getF10201003VS().saveInteractiveInfo(resultVO);
		
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;
		
		return result;
		
	}
	
	public String queryMedInteractiveInfo(){

		MedInteractiveVO returnVO = new MedInteractiveVO();
		
		BeanTools.copyProperties(medInteractiveVO, returnVO);
		
		returnVO = this.getF10201003VS().queryMedInteractiveInfo(returnVO);
		
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;
		
		createJSonData(result);
		
		return AJAX;
	}

}
