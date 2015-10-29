package com.wondersgroup.local.k6.f10604001.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FxTempDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.FyYyTempDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k6.f10604001.vo.FxVO;
import com.wondersgroup.local.k6.f10604001.vo.FyVO;
import com.wondersgroup.local.k6.f10604001.vo.FyYyTempVO;
import com.wondersgroup.local.k6.f10604001.vo.FyZVO;
import com.wondersgroup.local.k6.f10604001.vo.PmVO;
import com.wondersgroup.local.k6.f10604001.vs.F10604001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10604001VSImpl implements F10604001VS{

	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}
	
	public Map<String, Object> queryFyzbWithPage(Page page, FyVO fyVO){
		
		Page result = this.getMedAuditBS().queryFyTempWithPage(page, fyVO);
		
		return GridUtils.getGridData(result);
	}
	
	public Map<String, Object> queryFyzbZTempWithPage(Page page,FyZVO fyZVO){
		
		Page result = this.getMedAuditBS().queryfyZTempWithPage(page, fyZVO);
		
		return GridUtils.getGridData(result);
	}
	
	public List<Map<String, Object>> queryPie(FyVO fyVO) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		List<FyVO> result = this.getMedAuditBS().queryPie(fyVO);
		for(FyVO d : result){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", d.getFylb());
			map.put("y", d.getFyzb());
			list.add(map);
		}
		return list;
	}
	
	public Map<String, Object> queryPmTempWithPage(Page page, PmVO pmVO){
		
		Page result = this.getMedAuditBS().queryPmTempWithPage(page, pmVO);
		
		return GridUtils.getGridData(result);
	}

	public String queryColumn(PmVO pmVO) {
		List<PmVO> result = this.getMedAuditBS().queryColumn(pmVO);
		String xAxisCategories="";
		String dates="";
		for(PmVO d : result){
			xAxisCategories=xAxisCategories+"\""+d.getXmmc()+"\",";
			dates=dates+d.getPc()+",";			
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		dates="["+dates.substring(0, dates.length()-1)+"]";
		return "{\"xAxisCategories\":"+xAxisCategories+",\"dates\":"+dates+"}";
	}
	
	
	public Map<String, Object> queryFxTempXbWithPage(Page page , FxVO fxVO){
		
		Page result = this.getMedAuditBS().queryFxTempXbWithPage(page, fxVO);
		
		return GridUtils.getGridData(result);
	}
	
	public Map<String, Object> queryfxTempNldWithPage(Page page , FxVO fxVO){
		
		Page result = this.getMedAuditBS().queryfxTempNldWithPage(page, fxVO);
		
		return GridUtils.getGridData(result);
	}
	
	public String queryStrip(FxVO fxVO){
		
		List<FxTempDTO> result = this.getMedAuditBS().queryFxList(fxVO);
		
		String xAxisCategories="";
		
		String dates1="";//宗总人次
		
		String dates2="";//平均费用
		
		for (FxTempDTO fxTempDTO : result) {
			
			xAxisCategories=xAxisCategories+"\""+fxTempDTO.getNld()+"\",";
			
			dates1 = dates1 + fxTempDTO.getRc()+",";
			
			dates2 = dates2 + fxTempDTO.getPffy() + ",";
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		
		return "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+dates1+",\"dates2\":"+dates2+"}";
	}

	public Map<String, Object> queryFyYyTempWithPage(Page page,
			FyYyTempVO fyYyTempVO) {
		
		Page result = this.getMedAuditBS().queryFyYyTempWithPage(page, fyYyTempVO);
		
		return GridUtils.getGridData(result);
	}
	
	public String queryFyYyTempStrip(FyYyTempVO fyYyTempVO){
		
		List<FyYyTempDTO> result = this.getMedAuditBS().queryFyYyTempList(fyYyTempVO);
		
		String xAxisCategories="";
		
		String dates1="";//平均费用
		
		String dates2="";//平均费用标准
		
		for (FyYyTempDTO fyYyTempDTO : result) {
			
			xAxisCategories=xAxisCategories+"\""+fyYyTempDTO.getYymc()+"\",";
			
			dates1 = dates1 + fyYyTempDTO.getPjfy()+",";
			
			dates2 = dates2 + fyYyTempDTO.getPjfybz() + ",";
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		
		return "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+dates1+",\"dates2\":"+dates2+"}";
	}
	
}
