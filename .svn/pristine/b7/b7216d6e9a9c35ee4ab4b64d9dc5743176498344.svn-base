package com.wondersgroup.local.k3.f10301009.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301009.vo.TransferTurnVO;
import com.wondersgroup.local.k3.f10301009.vo.TurnMessageVO;
import com.wondersgroup.local.k3.f10301009.vs.F10301009VS;
import com.wondersgroup.wssip.util.StringTools;

public class QueryCaseTransTurnAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301009VS f10301009VS;
	
	private TransferTurnVO transferTurnVO = new TransferTurnVO();
	
	private TurnMessageVO turnMessageVO = new TurnMessageVO();

	public F10301009VS getF10301009VS() {
		return f10301009VS;
	}

	public void setF10301009VS(F10301009VS f10301009vs) {
		f10301009VS = f10301009vs;
	}

	public TransferTurnVO getTransferTurnVO() {
		return transferTurnVO;
	}

	public void setTransferTurnVO(TransferTurnVO transferTurnVO) {
		this.transferTurnVO = transferTurnVO;
	}

	public TurnMessageVO getTurnMessageVO() {
		return turnMessageVO;
	}

	public void setTurnMessageVO(TurnMessageVO turnMessageVO) {
		this.turnMessageVO = turnMessageVO;
	}

	@Override
	public ValueObject getValueObject(){
		return this.getTransferTurnVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10301009VS().queryTransTurnCasees(page, transferTurnVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadTurnCaseInfoByAbz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		if(StringTools.hasText(abz001)){
			
			transferTurnVO.setAbz001(abz001);
			
			resultVO = this.getF10301009VS().queryTurnCaseByAbz001(page, transferTurnVO);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadTurnBeAuditInfoByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		if(StringTools.hasText(aaz318)){
			
			turnMessageVO.setAaz318(Long.valueOf(aaz318));
			
			resultVO = this.getF10301009VS().queryTurnBeAuditByAaz318(page, turnMessageVO);
			
			String result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
}
