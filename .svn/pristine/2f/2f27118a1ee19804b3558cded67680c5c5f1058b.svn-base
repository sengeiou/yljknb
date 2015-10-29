package com.wondersgroup.local.k5.f10502004.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502004.vs.F10502004VS;
import com.wondersgroup.wssip.util.StringTools;

public class AuditPassHospAction extends BaseAjaxAction {
	
private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
private	F10502001VO f10502001VO=new F10502001VO();
private F10502004VS f10502004VS;
	public F10502001VO getF10502001VO() {
	return f10502001VO;
}

public void setF10502001VO(F10502001VO f10502001vo) {
	f10502001VO = f10502001vo;
}

	@Override
	public ValueObject getValueObject() {
		return this.getF10502001VO();
	
	}
	public String operate(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
			
			F10502001VO resultVO=new F10502001VO();
			
			resultVO = (F10502001VO) VOUtils.getBeanFromJsonData(submitData, F10502001VO.class);
			
			resultVO=this.getF10502004VS().AuditPass(resultVO);
			
			String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
		 	
		 	createJSonData(result);
				
			return AJAX;
		}

	public void setF10502004VS(F10502004VS f10502004VS) {
		this.f10502004VS = f10502004VS;
	}

	public F10502004VS getF10502004VS() {
		return f10502004VS;
	}

public String auditPassyy(){
		
		F10502001VO resultVO=new F10502001VO();
		
		String baz048 = this.getServletRequest().getParameter("baz048");
		
		
		if (StringTools.hasText(baz048)) {
			resultVO.setBaz048(baz048);		
		}
		
		resultVO=this.getF10502004VS().auditPassyy(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	public String auditNotPassyy(){
		
		F10502001VO resultVO=new F10502001VO();
		
		String baz048 = this.getServletRequest().getParameter("baz048");
		
		
		if (StringTools.hasText(baz048)) {
			resultVO.setBaz048(baz048);		
		}
		
		resultVO=this.getF10502004VS().auditNotPassyy(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	public String auditPassks(){
		
		F10502002VO resultVO=new F10502002VO();
		
		String baz047 = this.getServletRequest().getParameter("baz047");
		
		String apa120 = this.getServletRequest().getParameter("apa120");
		
		if (StringTools.hasText(baz047)) {
			resultVO.setBaz047(baz047);		
		}
		if (StringTools.hasText(apa120)) {
			resultVO.setApa120(apa120);		
		}
		
		resultVO=this.getF10502004VS().auditPassks(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	public String auditNotPassks(){
		
		F10502002VO resultVO=new F10502002VO();
		
		String baz047 = this.getServletRequest().getParameter("baz047");
		
		String apa120 = this.getServletRequest().getParameter("apa120");
		
		if (StringTools.hasText(baz047)) {
			resultVO.setBaz047(baz047);		
		}
		if (StringTools.hasText(apa120)) {
			resultVO.setApa120(apa120);		
		}
		
		resultVO=this.getF10502004VS().auditNotPassks(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	
public String auditPassys(){
		
		F10502003VO resultVO=new F10502003VO();
		
		String baz046 = this.getServletRequest().getParameter("baz046");
		
		String apa120 = this.getServletRequest().getParameter("apa120");
		
		if (StringTools.hasText(baz046)) {
			resultVO.setBaz046(baz046);		
		}
		if (StringTools.hasText(apa120)) {
			resultVO.setApa120(apa120);		
		}
		
		resultVO=this.getF10502004VS().auditPassys(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	public String auditNotPassys(){
		
		F10502003VO resultVO=new F10502003VO();
		
		String baz046 = this.getServletRequest().getParameter("baz046");
		
		String apa120 = this.getServletRequest().getParameter("apa120");
		
		if (StringTools.hasText(baz046)) {
			resultVO.setBaz046(baz046);		
		}
		if (StringTools.hasText(apa120)) {
			resultVO.setApa120(apa120);		
		}
		
		resultVO=this.getF10502004VS().auditNotPassys(resultVO);
		
		String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
	 	
	 	createJSonData(result);
			
		return AJAX;
	}
	
}
