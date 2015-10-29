package com.wondersgroup.local.common.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.AuditCaseVO;
import com.wondersgroup.local.common.vs.CommonVS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryAuditCaseAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private CommonVS commonVS;
	
	private AuditCaseVO auditCaseVO = new AuditCaseVO();

	public CommonVS getCommonVS() {
		return commonVS;
	}

	public void setCommonVS(CommonVS commonVS) {
		this.commonVS = commonVS;
	}

	public AuditCaseVO getAuditCaseVO() {
		return auditCaseVO;
	}

	public void setAuditCaseVO(AuditCaseVO auditCaseVO) {
		this.auditCaseVO = auditCaseVO;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getAuditCaseVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getCommonVS().queryAuditCaseWithPage(page, auditCaseVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	
	public String loadAuditCaseInfoByAbz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(abz001)){
			
			auditCaseVO.setAbz001(abz001);//设设置案件编号
			
			resultVO = this.getCommonVS().queryAuditCaseWithPage(page, auditCaseVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadAuditCaseInfoByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			AuditCaseVO resultVO = this.getCommonVS().queryAuditCaseDetailsById(aaz318);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}

}
