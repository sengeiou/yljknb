package com.wondersgroup.local.report.yishi.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yishi.vo.YishiVO;
import com.wondersgroup.local.report.yishi.vs.YishiVS;

public class YishiAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private YishiVO yishiVO = new YishiVO();

	private YishiVS yishiVS;

	@Override
	public ValueObject getValueObject() {
		return this.getYishiVO();
	}

	public YishiVO getYishiVO() {
		return yishiVO;
	}

	public void setYishiVO(YishiVO yishiVO) {
		this.yishiVO = yishiVO;
	}

	public YishiVS getYishiVS() {
		return yishiVS;
	}

	public void setYishiVS(YishiVS yishiVS) {
		this.yishiVS = yishiVS;
	}

	/**
	 * 查询医师的基本信息
	 * 
	 * @return
	 */
	public String yishiinfo() {

		YishiVO resultVO = this.getYishiVS().getYishiinfo(yishiVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	/**
	 * 查询 就诊次数top10排名的图表数据
	 * 
	 * @return
	 */
	public String getFrequencyTop10Data() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getFrequencyTop10Data(vo);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 查询 医保内费用总额排名的图表数据
	 * 
	 * @return
	 */
	public String getFeeTop10Data() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getFeeTop10Data(vo);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 查询费用明细数据
	 * 
	 * @return
	 */
	public String queryFymxGrid() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		vo.setFylb(this.getServletRequest().getParameter("fylb"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = this.getYishiVS()
				.queryFymxGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	/**
	 * 查询历史违规数据
	 * 
	 * @return
	 */
	public String queryLswgGrid() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getYishiVS().queryLSWGGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}

	/**
	 * 查询疑点信息
	 * 
	 * @return
	 */
	public String queryYdxxGrid() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getYishiVS().queryYdxxGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;

	}
	
	/**
	 * 费用项目构成 饼图
	 * 
	 * @return
	 */
	public String getFeeItemsConstituentData() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getFeeItemsConstituentDataYishi(vo);
		createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 资金来源构成 饼图
	 * 
	 * @return
	 */
	public String getFundSourceConsituentData() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getFundSourceConsituentDataYishi(vo);
		createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 工作量统计 条形图
	 * 
	 * @return
	 */
	public String getWorkloadStatisticsData() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getWorkloadStatisticsDataYishi(vo);
		createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 费用统计 条形图
	 * 
	 * @return
	 */
	public String getFeeStatisticsData() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getYishiVS().getFeeStatisticsDataYishi(vo);
		createJSonData(jsonData);
		return AJAX;
	}
	/**
	 * 时间轴
	 * 
	 * @return
	 */
	public String yishisjz() {
		YishiGridVO vo = new YishiGridVO();
		vo.setYsgh(this.getServletRequest().getParameter("id"));
		YishiGridVO resultVO = this.getYishiVS().getyishisjz(vo);
		createJSonData(VOUtils.getJsonData(resultVO));
		return AJAX;
	}
}