package com.wondersgroup.local.report.geren.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.report.geren.vo.GerenGridVO;
import com.wondersgroup.local.report.geren.vo.GerenVO;
import com.wondersgroup.local.report.geren.vs.GerenVS;

public class GerenAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private GerenVO gerenVO = new GerenVO();

	@Override
	public ValueObject getValueObject() {
		return this.getGerenVO();
	}

	public GerenVO getGerenVO() {
		return gerenVO;
	}

	public void setGerenVO(GerenVO gerenVO) {
		this.gerenVO = gerenVO;
	}

	private GerenVS gerenVS;

	public GerenVS getGerenVS() {
		return gerenVS;
	}

	public void setGerenVS(GerenVS gerenVS) {
		this.gerenVS = gerenVS;
	}

	/**
	 * 生成时间轴的aciton
	 * 
	 * @return
	 */
	public String timeline() {
		String json = this.getGerenVS().getTimeline(gerenVO);
		this.createJSonData(json);
		return AJAX;
	}

	/**
	 * 查询参保人的信息
	 * 
	 * @return
	 */
	public String gereninfo() {

		GerenVO resultVO = this.getGerenVS().getGereninfo(gerenVO);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	/**
	 * 费用项目构成 图表数据
	 * 
	 * @return
	 */
	public String getFeeItemsConstituentDataGeren() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getGerenVS().getFeeItemsConstituentDataGeren(vo);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 资金来源构成 图表数据
	 * 
	 * @return
	 */
	public String getFundSourceConsituentDataGeren() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getGerenVS()
				.getFundSourceConsituentDataGeren(vo);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 其它指标 条形图
	 * 
	 * @return
	 */
	public String getOtherIndicatorsDataGeren() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		String jsonData = this.getGerenVS().getOtherIndicatorsDataGeren(vo);
		createJSonData(jsonData);
		return AJAX;
	}

	/**
	 * 查询就诊情况数据
	 * @return
	 */
	public String queryJZQKGrid() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getGerenVS().queryJZQKGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	/**
	 * 查询费用明细数据
	 * @return
	 */
	public String queryFYMXGrid() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setJzlx(this.getServletRequest().getParameter("jzlx"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		vo.setFylb(this.getServletRequest().getParameter("fylb"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getGerenVS().queryFYMXGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}

	/**
	 * 查询疑点信息数据
	 * @return
	 */
	public String queryYDXXGrid() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getGerenVS().queryYDXXGrid(page, vo);

		createJSonData(VOUtils.getJsonData(resultVO));

		return AJAX;
	}
	
	/**
	 * 查询历史违规数据
	 * @return
	 */
	public String queryLSWGGrid() {
		GerenGridVO vo = new GerenGridVO();
		vo.setId(this.getServletRequest().getParameter("id"));
		vo.setTjsj1(this.getServletRequest().getParameter("tjsjt1"));
		vo.setTjsj2(this.getServletRequest().getParameter("tjsjt2"));
		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getGerenVS().queryLSWGGrid(page, vo);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}

}
