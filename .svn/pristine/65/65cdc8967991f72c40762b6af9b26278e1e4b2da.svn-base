package com.wondersgroup.local.k5.f10506001.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k5.f10506001.vs.F10506001VS;
import com.wondersgroup.mycommon.web.vo.GridColumnVO;
import com.wondersgroup.wssip.util.ExportExcelUtils;

public class ExportExcelAction extends BaseAjaxAction {

	public static final long serialVersionUID = 1L;
	
	private F10506001VS f10506001VS;
	
	public F10506001VS getF10506001VS() {
		return f10506001VS;
	}
	public void setF10506001VS(F10506001VS f10506001vs) {
		f10506001VS = f10506001vs;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	protected String operate() {
		
		String ids = this.getServletRequest().getParameter("bazids");
		String json = this.getServletRequest().getParameter("columns");
		
		try {
			json = URLDecoder.decode(json, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		List<GridColumnVO> columns = VOUtils.getBeanListFromJsonData(json, GridColumnVO.class);
		
		List<Map<String, Object>> data;
		try {
			data = this.getF10506001VS().findKc62ByIds(ids);
			ExportExcelUtils.exportExcel(this.getServletRequest(),this.getServletResponse(), columns, data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return super.operate();
	}
	
	
}
