package com.wondersgroup.local.k6.f10605001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k6.f10605001.vo.MedInstitutionVO;
import com.wondersgroup.local.k6.f10605001.vs.F10605001VS;

public class SelectMedAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;
	
	private F10605001VS f10605001VS;
	
	private MedInstitutionVO medInstitutionVO = new MedInstitutionVO();

	

	public F10605001VS getF10506001VS() {
		return f10605001VS;
	}

	public void setF10605001VS(F10605001VS f10605001vs) {
		f10605001VS = f10605001vs;
	}

	public MedInstitutionVO getMedInstitutionVO() {
		return medInstitutionVO;
	}

	public void setMedInstitutionVO(MedInstitutionVO medInstitutionVO) {
		this.medInstitutionVO = medInstitutionVO;
	}
	
    @Override
    public ValueObject getValueObject() {
    	return this.getMedInstitutionVO();
    }
    
    @Override
    public String operate () {
    	
    	return super.operate();
    }
    
    
    public String selectMed() {
    	
    	int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		String submitData  = this.getServletRequest().getParameter("submitData");
		
		MedInstitutionVO medInstitutionVO = new MedInstitutionVO();
		
		medInstitutionVO = (MedInstitutionVO) VOUtils.getBeanFromJsonData(submitData,MedInstitutionVO.class);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10506001VS().queryMedInstitutionObjWithPage(page, medInstitutionVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(result);
		
		return AJAX;
    }

    
}
