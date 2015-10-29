package com.wondersgroup.local.common.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.common.vs.CommonVS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryBeAuditTargetAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private CommonVS commonVS;
	
	private BeAuditTargetVO beAuditTargetVO = new BeAuditTargetVO();

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

	public BeAuditTargetVO getBeAuditTargetVO() {
		return beAuditTargetVO;
	}

	public void setBeAuditTargetVO(BeAuditTargetVO beAuditTargetVO) {
		this.beAuditTargetVO = beAuditTargetVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getBeAuditTargetVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getCommonVS().queryBeAuditInfo(page, beAuditTargetVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadBeAuditTargetInfoByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			beAuditTargetVO.setAaz318(Long.valueOf(aaz318));
			
			resultVO = this.getCommonVS().queryBeAuditInfo(page, beAuditTargetVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadBeAuditTargetInfoByAaz077(){
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		
		String result = null;
		
		if(StringTools.hasText(aaz077)){
			
			BeAuditTargetVO returnVO = this.getCommonVS().queryBeAuditTargetInfoById(aaz077);
			
			result = VOUtils.getJsonData(returnVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}

}
