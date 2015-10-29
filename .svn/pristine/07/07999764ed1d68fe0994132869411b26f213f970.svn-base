package com.wondersgroup.local.k4.f10402008.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k4.f10402008.vo.F10402008VO;
import com.wondersgroup.local.k4.f10402008.vo.YbgzmxVO;
import com.wondersgroup.local.k4.f10402008.vs.F10402008VS;

public class F10402008Action extends BaseAjaxAction{

	
	private static final long serialVersionUID = 1L;
	
	private F10402008VS f10402008VS;
	private F10402008VO vo=new F10402008VO();
	
	/**
	 * 获取规则类别
	 * @return
	 */
	public String getGzlb(){
		String json=f10402008VS.getGzlbJson();
//		json="{\"data\":\""+json+"\"}";
		createJSonData(json);
		return AJAX;
	}
	
	/**
	 * 获取规则名称
	 * @return
	 */
	public String getGzflxx(){
		String json=f10402008VS.getGzxxJson(getServletRequest().getParameter("id"));
		
		createJSonData(json);
		return AJAX;
	}
	
	public String queryZsdWithPage(){
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		resultVO = f10402008VS.queryZsdWithPage(page, vo);
		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
		
	}
	
	public String loadZsdxx(){
		String zsdid=getServletRequest().getParameter("zsdid");
		YbgzmxVO gzmxvo=f10402008VS.loadZsdxx(zsdid);
		createJSonData(VOUtils.getJsonData(gzmxvo));
		return AJAX;
	}
	
	public String queryLjtjWithPage(){
		String zsdid=getServletRequest().getParameter("zsdid");
		String xgbz=getServletRequest().getParameter("xgbz");
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		resultVO=f10402008VS.queryLjtjWithPage(page,zsdid,xgbz);
		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}
	
	public String queryLjsjWithPage(){
		String sjzdb=getServletRequest().getParameter("sjzdb");
		String sjzszd=getServletRequest().getParameter("sjzszd");
		String sjtjzd=getServletRequest().getParameter("sjtjzd");
		String sjzdlx=getServletRequest().getParameter("sjzdlx");
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		Map<String, Object> resultVO = null;
		
		resultVO=f10402008VS.queryLjsjWithPage(page,sjzdb,sjtjzd,sjzszd,sjzdlx);
		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}
	
	public String saveSjnr(){
		String sjnr=getServletRequest().getParameter("sjnr");
		String ybgztjljbm=getServletRequest().getParameter("ybgztjljbm");
		String ybgzbm=getServletRequest().getParameter("ybgzbm");
		f10402008VS.saveSjnr(sjnr,ybgztjljbm,ybgzbm);
		String json="{\"success\":\"true\"}";
		createJSonData(json);
		return AJAX;
	}
	
	public String updateZsdmx(){
		String submitData = this.getServletRequest().getParameter("submitData");
		YbgzmxVO mxvo=new YbgzmxVO();
		mxvo = (YbgzmxVO) VOUtils.getBeanFromJsonData(submitData, YbgzmxVO.class);
		f10402008VS.updateZsdmx(mxvo);
		String json="{\"success\":\"true\"}";
		createJSonData(json);
		return AJAX;
	}
	
	public String startOrEnd(){
		String id=this.getServletRequest().getParameter("id");
		f10402008VS.startOrEnd(id);
		String json="{\"success\":\"true\"}";
		createJSonData(json);
		return AJAX;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getVo();
	}

	public F10402008VS getF10402008VS() {
		return f10402008VS;
	}

	public void setF10402008VS(F10402008VS f10402008vs) {
		f10402008VS = f10402008vs;
	}

	public F10402008VO getVo() {
		return vo;
	}

	public void setVo(F10402008VO vo) {
		this.vo = vo;
	}

}
