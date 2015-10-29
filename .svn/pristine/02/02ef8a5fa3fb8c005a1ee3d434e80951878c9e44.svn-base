package com.wondersgroup.local.k3.f10301008.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301008.vo.VerdictConveyVO;
import com.wondersgroup.local.k3.f10301008.vo.VerdictFinishVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.wssip.util.StringTools;

//查询结论传达
public class QueryConveyAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private F10301008VS f10301008VS;
	
	private VerdictConveyVO verdictConveyVO = new VerdictConveyVO();
	
	private VerdictFinishVO verdictFinishVO = new VerdictFinishVO();

	public F10301008VS getF10301008VS() {
		return f10301008VS;
	}

	public void setF10301008VS(F10301008VS f10301008vs) {
		f10301008VS = f10301008vs;
	}

	public VerdictConveyVO getVerdictConveyVO() {
		return verdictConveyVO;
	}

	public void setVerdictConveyVO(VerdictConveyVO verdictConveyVO) {
		this.verdictConveyVO = verdictConveyVO;
	}
	
	public VerdictFinishVO getVerdictFinishVO() {
		return verdictFinishVO;
	}

	public void setVerdictFinishVO(VerdictFinishVO verdictFinishVO) {
		this.verdictFinishVO = verdictFinishVO;
	}

	@Override
	public ValueObject getValueObject(){
		return this.getVerdictConveyVO();
	}
	
	@Override
	protected String operate(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.f10301008VS.queryAuditCaseWithPage(page, verdictConveyVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String loadVerdictConveyInfoByabz001(){
		
		String abz001 = this.getServletRequest().getParameter("abz001");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(abz001)){
			
			verdictConveyVO.setAbz001(abz001);//设设置案件编号
			
			resultVO = this.getF10301008VS().queryAuditCaseWithPage(page, verdictConveyVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadVerdictCaseInfoByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			VerdictConveyVO returnVO = this.getF10301008VS().queryVerdictCaseInfoByAaz318(aaz318);
			
			result = VOUtils.getJsonData(returnVO);
			
			createJSonData(result);
		}
		
		return AJAX;
	}
	
	public String loadVerdictBeAuditByAaz318(){
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1,limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		String result = null;
		
		if(StringTools.hasText(aaz318)){
			
			verdictFinishVO.setAaz318(Long.valueOf(aaz318));
			
			resultVO = this.getF10301008VS().queryBeAuditWithPage(page, verdictFinishVO);
			
			result = VOUtils.getJsonData(resultVO);
			
			createJSonData(result);
		}
		return AJAX;
	}
}
