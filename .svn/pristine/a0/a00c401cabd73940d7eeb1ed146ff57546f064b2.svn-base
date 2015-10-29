package com.wondersgroup.local.report.yiyuan.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.report.yiyuan.vo.YiYuanVO;
import com.wondersgroup.local.report.yiyuan.vs.YiYuanVS;

public class YiYuanQueryAction extends BaseAjaxAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private YiYuanVO yiyuanVO = new YiYuanVO();
	private YiYuanVS yiyuanVS;
	
	public ValueObject getValueObject() {
		return this.getYiyuanVO();
	}
	
	
	public String yiyuaninfo() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		YiYuanVO resultVO = this.getYiyuanVS().getYiyuaninfo(yiyuanVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}
	/**
	 * 费用项目构成 图表数据
	 * 
	 * @return
	 */
	public String getFeeItemsConstituentDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		yiyuanVO.setJzlx(this.getServletRequest().getParameter("jzlx"));
		yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYiyuanVS().getFeeItemsConstituentDataYiyuan(yiyuanVO);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 资金来源构成 图表数据
	 * 
	 * @return
	 */
	public String getFundSourceConsituentDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		yiyuanVO.setJzlx(this.getServletRequest().getParameter("jzlx"));
		yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYiyuanVS().getFundSourceConsituentDataYiyuan(yiyuanVO);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 其它指标 条形图
	 * 
	 * @return
	 */
	public String getOtherIndicatorsDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		yiyuanVO.setJzlx(this.getServletRequest().getParameter("jzlx"));
		yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYiyuanVS().getOtherIndicatorsDataYiyuan(yiyuanVO);
		createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 当年接诊按月分布
	 * 
	 * @return
	 */
	public String getCurrentYearMonthlyDistributionDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		yiyuanVO.setJzlx(this.getServletRequest().getParameter("jzlx"));
		yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
       String jsonData = this.getYiyuanVS().getCurrentYearMonthlyDistributionDataYiyuan(yiyuanVO);
		//String jsonData="[[1,2,3,4,5,6,7,8,9,10,11,12],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0]]";
	  // String jsonData="[[01,02,03,04,05,06,07,08,09,10,11,12],[10,0,0,0,0,0,0,0,0,0,0,0],[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0],[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0]]";
        createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 医院下的科室和医护人员人数
	 * 
	 * @return
	 */
	public String getYsslDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		//yiyuanVO.setAkb020("128900");
		String jsonData = this.getYiyuanVS().getYsslDataYiyuan(yiyuanVO);
		//String jsonData="[[\"耳鼻喉\",\"内科\",\"外科\",\"口腔\",\"口腔\",\"口腔\",\"口腔\",\"口腔\"],[1,2,3,4,5,6,7,8]]";
		createJSonData(jsonData);
		return AJAX;
	}
	/**s
	 * 医院下的科室和就诊人数
	 * 
	 * @return
	 */
	public String getJzslDataYiyuan() {
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
		//yiyuanVO.setAkb020("128900");
		yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYiyuanVS().getJzslDataYiyuan(yiyuanVO);
		createJSonData(jsonData);
		return AJAX;
	}
	public String queryYdxxGrid(){
		yiyuanVO.setAaz107(this.getServletRequest().getParameter("yydm"));
	    yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
	    yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getYiyuanVS().queryYdxxWithYydm(page,yiyuanVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
	public String queryLswgGrid(){
		yiyuanVO.setAkb020(this.getServletRequest().getParameter("yydm"));
	    yiyuanVO.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
	    yiyuanVO.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getYiyuanVS().queryLswgWithYydm(page,yiyuanVO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}

	public void setYiyuanVO(YiYuanVO yiyuanVO) {
		this.yiyuanVO = yiyuanVO;
	}

	public YiYuanVO getYiyuanVO() {
		return yiyuanVO;
	}

	public void setYiyuanVS(YiYuanVS yiyuanVS) {
		this.yiyuanVS = yiyuanVS;
	}

	public YiYuanVS getYiyuanVS() {
		return yiyuanVS;
	}



	
 }