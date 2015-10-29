package com.wondersgroup.local.report.geren.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.analysisreport.report.bs.ReportBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.geren.vo.GerenGridVO;
import com.wondersgroup.local.report.geren.vo.GerenVO;
import com.wondersgroup.local.report.geren.vs.GerenVS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class GerenVSImpl implements GerenVS {

	private ReportBS reportBS;

	public ReportBS getReportBS() {
		return reportBS;
	}

	public void setReportBS(ReportBS reportBS) {
		this.reportBS = reportBS;
	}

	public GerenVO getGereninfo(GerenVO gerenVO) {
		GerenVO resultVO = this.getReportBS().getGereninfo(gerenVO);
		return resultVO;
	}

	public String getTimeline(GerenVO gerenVO) {
		return this.getReportBS().getTimeline(gerenVO);
	}

	public String getFeeItemsConstituentDataGeren(GerenGridVO vo) {
		return this.getReportBS().getFeeItemsConstituentDataGeren(vo);
	}

	public String getFundSourceConsituentDataGeren(GerenGridVO vo) {
		return this.getReportBS().getFundSourceConsituentDataGeren(vo);
	}

	public String getOtherIndicatorsDataGeren(GerenGridVO vo) {
		return this.getReportBS().getOtherIndicatorsDataGeren(vo);
	}

	public Map<String, Object> queryJZQKGrid(Page page, GerenGridVO vo) {
		Page result = this.getReportBS().queryJZQKGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryFYMXGrid(Page page, GerenGridVO vo) {
		Page result = this.getReportBS().queryFYMXGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryYDXXGrid(Page page, GerenGridVO vo) {
		Page result = this.getReportBS().queryYDXXGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryLSWGGrid(Page page, GerenGridVO vo) {
		Page result = this.getReportBS().queryLSWGGrid(page, vo);
		return GridUtils.getGridData(result);
	}

}
