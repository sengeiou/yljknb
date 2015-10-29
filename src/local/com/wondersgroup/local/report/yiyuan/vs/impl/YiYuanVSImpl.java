package com.wondersgroup.local.report.yiyuan.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.analysisreport.report1.bs.Report1BS;
import com.wondersgroup.bc.analysisreport.report1.model.dto.YiYuanDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.report.yiyuan.vo.YiYuanVO;
import com.wondersgroup.local.report.yiyuan.vs.YiYuanVS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class YiYuanVSImpl implements YiYuanVS{
	
	private Report1BS report1BS;
	
	public void setReport1BS(Report1BS report1BS) {
		this.report1BS = report1BS;
	}

	public Report1BS getReport1BS() {
		return report1BS;
	}


	public Map<String, Object> queryYdxxWithYydm(Page page, YiYuanVO yiyuanVO) {
		
		Page result = this.getReport1BS().queryYdxxWithYydm(page, yiyuanVO);
		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryLswgWithYydm(Page page, YiYuanVO yiyuanVO) {
		
		Page result = this.getReport1BS().queryLswgWithYydm(page, yiyuanVO);
		return GridUtils.getGridData(result);
	}

	public YiYuanVO getYiyuaninfo(YiYuanVO yiyuanVO) {
		YiYuanVO resultVO=this.getReport1BS().getYiyuaninfo(yiyuanVO);
		return resultVO;
	}

	public String getFeeItemsConstituentDataYiyuan(YiYuanVO yiyuanVO) {
		return this.getReport1BS().getFeeItemsConstituentDataYiyuan(yiyuanVO);
	}

	public String getFundSourceConsituentDataYiyuan(YiYuanVO yiyuanVO) {
		return this.getReport1BS().getFundSourceConsituentDataYiyuan(yiyuanVO);
	}

	public String getOtherIndicatorsDataYiyuan(YiYuanVO yiyuanVO) {
		return this.getReport1BS().getOtherIndicatorsDataYiyuan(yiyuanVO);
	}

	public String getCurrentYearMonthlyDistributionDataYiyuan(YiYuanVO yiyuanVO) {
		
		List<YiYuanDTO> result = this.getReport1BS().getCurrentYearMonthlyDistributionDataYiyuan(yiyuanVO);
	    String xAxisCategories="";
		
	    String dates1="";//接诊人数
		
	    String dates2="";//费用发生额
		
	    String dates3="";//月度支出额
		
		for (YiYuanDTO yiyuanDTO : result) {
			
			xAxisCategories=xAxisCategories+""+yiyuanDTO.getRn()+",";
			
			dates1 = dates1 + yiyuanDTO.getJzrs()+",";
			
			dates2 = dates2 + yiyuanDTO.getFyfse() + ",";
			
			dates3 = dates3 + yiyuanDTO.getYdzce() + ",";
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		
		dates3="["+dates3.substring(0, dates3.length()-1)+"]";
		//\"name\":\"现金\",\"y\":"
		return "["+xAxisCategories+","+dates1+","+dates2+","+dates3+"]";
	}

	public String getYsslDataYiyuan(YiYuanVO yiyuanVO) {
		List<YiYuanDTO> result = this.getReport1BS().getYsslDataYiyuan(yiyuanVO);
	    String xAxisCategories="";
		
	    String dates1="";//医生数量
	    
	 if(result.size()>0 ){
		 
		for (YiYuanDTO yiyuanDTO : result) {
			
			xAxisCategories=xAxisCategories+"\""+yiyuanDTO.getKsmc()+"\",";
			
			dates1 = dates1 + yiyuanDTO.getYssl()+",";
			
		}
	
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		return "["+xAxisCategories+","+dates1+"]";
		}
	     xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length())+"]";
		
		dates1="["+dates1.substring(0, dates1.length())+"]";
		
		return "["+xAxisCategories+","+dates1+"]";	}

	public String getJzslDataYiyuan(YiYuanVO yiyuanVO) {
		List<YiYuanDTO> result = this.getReport1BS().getJzslDataYiyuan(yiyuanVO);
	    String xAxisCategories="";
		
	    String dates1="";//接诊数量
	    
		if(result.size()>0){
			
		for (YiYuanDTO yiyuanDTO : result) {
			
			xAxisCategories=xAxisCategories+"\""+yiyuanDTO.getKsmc()+"\",";
			
			dates1 = dates1 + yiyuanDTO.getJzrs()+",";
			
		}
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		return "["+xAxisCategories+","+dates1+"]";
		}
        xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length())+"]";
		
		dates1="["+dates1.substring(0, dates1.length())+"]";
		
		return "["+xAxisCategories+","+dates1+"]";
	}

}
