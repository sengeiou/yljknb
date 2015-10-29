package com.wondersgroup.local.report.yishi.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.analysisreport.report.bs.ReportBS;
import com.wondersgroup.bc.analysisreport.report1.bs.Report1BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yishi.vo.YishiGridVO;
import com.wondersgroup.local.report.yishi.vo.YishiVO;
import com.wondersgroup.local.report.yishi.vs.YishiVS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class YishiVSImpl implements YishiVS {

	private ReportBS reportBS;
	private Report1BS report1BS;

	public void setReportBS(ReportBS reportBS) {
		this.reportBS = reportBS;
	}

	public ReportBS getReportBS() {
		return reportBS;
	}

	public void setReport1BS(Report1BS report1BS) {
		this.report1BS = report1BS;
	}

	public Report1BS getReport1BS() {
		return report1BS;
	}

	public YishiVO getYishiinfo(YishiVO yishiVO) {
		YishiVO resultVO = this.getReportBS().getYishiinfo(yishiVO);
		return resultVO;
	}

	public Map<String, Object> queryFymxGrid(Page page, YishiGridVO vo) {
		Page result = this.getReport1BS().queryFymxGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryLSWGGrid(Page page, YishiGridVO vo) {
		Page result = this.getReport1BS().queryLSWGGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryYdxxGrid(Page page, YishiGridVO vo) {
		Page result = this.getReport1BS().queryYdxxGrid(page, vo);
		return GridUtils.getGridData(result);
	}

	public String getFrequencyTop10Data(YishiGridVO vo) {
		return this.getReportBS().getFrequencyTop10Data(vo);
	}

	public String getFeeTop10Data(YishiGridVO vo) {
		return this.getReportBS().getFeeTop10Data(vo);
	}

	public String getFeeItemsConstituentDataYishi(YishiGridVO vo) {
		return this.getReportBS().getFeeItemsConstituentDataYishi(vo);
	}

	public String getFundSourceConsituentDataYishi(YishiGridVO vo) {
		return this.getReportBS().getFundSourceConsituentDataYishiYishi(vo);
	}

	public String getWorkloadStatisticsDataYishi(YishiGridVO vo) {
		return this.getReportBS().getWorkloadStatisticsDataYishi(vo);
	}

	public String getFeeStatisticsDataYishi(YishiGridVO vo) {
		return this.getReportBS().getFeeStatisticsDataYishi(vo);
	}

	public YishiGridVO getyishisjz(YishiGridVO vo) {
		return this.getReportBS().getyishisjz(vo);
	}

}
