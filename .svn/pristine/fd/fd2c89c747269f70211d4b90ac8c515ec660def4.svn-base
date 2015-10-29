package com.wondersgroup.local.k6.f10601001.vs.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc50DTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k6.f10601001.vo.InsurVisitVO;
import com.wondersgroup.local.k6.f10601001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10601001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10601001.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10601001.vs.F10601001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10601001VSImpl implements F10601001VS{
	
	private StatisticBS statisticBS;
	
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}

	public String queryStrip(InsurVisitVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-00:传入参数为空!");
		}
		
		if(returnVO.getAae041s() != null){
						
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(returnVO.getAae042s() != null){
						
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		List<Kc50DTO> result = this.getStatisticBS().queryInsurWithPage(returnVO);
		
		if(result.size() <= 0){
			throw new BusinessException("F10601001VS-01:根据条件查询结果为空!");
		}
		
		String xAxisCategories="";//横坐标  参保人姓名 锕acc003
		
		String datas1="";//value  费用
		
		List<Map<String , Object>> mapList = new ArrayList<Map<String,Object>>();
		
		for (Kc50DTO kc50dto : result) {
			
			xAxisCategories = xAxisCategories+"\""+ kc50dto.getAac003() +"\",";//x轴
			
			Map<String , Object> map = new HashMap<String, Object>();
			
			map.put("id", kc50dto.getAac001());
			
			map.put("y", kc50dto.getValueA());
			
			mapList.add(map);
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		datas1 = VOUtils.getJsonDataFromCollection(mapList);
		
		String jsonData = "{\"xAxisCategories\":"+xAxisCategories+",\"datas1\":"+datas1+"}";
			
		return jsonData;
	}
	
	public Map<String, Object> queryInsurVistWithPage(Page page , InsurVisitVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-02:传入参数对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAac001())){
			throw new BusinessException("F10601001VS-03:传入参保人ID为空!");
		}
		
		//起始日期
		if(returnVO.getAae041s() != null){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		//结束日期
		if(returnVO.getAae042s() != null){
						
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		Page result = this.getStatisticBS().queryMedicCateWithPage(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Kc50DTO kc50Dto = (Kc50DTO) result.getResult().get(i);
			
			if(kc50Dto.getAae041() != null || !"".equals(kc50Dto.getAae041())){
				
				Date aae041 = DateTools.parseDate(kc50Dto.getAae041(), "yyyyMM");
				
				kc50Dto.setAae041Star(aae041);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
				
		return map;
	} 
	
	public Map<String, Object> queryInsurDiseWithPage(Page page , InsurVisitVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-02:传入参数对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAac001())){
			throw new BusinessException("F10601001VS-03:传入参保人ID为空!");
		}
		
		//起始日期
		if(returnVO.getAae041s() != null){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		//结束日期
		if(returnVO.getAae042s() != null){
						
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		Page result = this.getStatisticBS().queryDiseCateWithPage(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Kc50DTO kc50Dto = (Kc50DTO) result.getResult().get(i);
			
			if(kc50Dto.getAae041() != null || !"".equals(kc50Dto.getAae041())){
				
				Date aae041 = DateTools.parseDate(kc50Dto.getAae041(), "yyyyMM");
				
				kc50Dto.setAae041Star(aae041);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryInsurVisitWithPage(Page page , VisitInfoVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-04:传入参数对象为空!");
		}
		
		if(returnVO.getAac001() == null){
			throw new BusinessException("F10601001VS-05:传入参保人编号aac001为空!");
		}
		
		Page result = this.getStatisticBS().queryInsurVisInfoByAac001(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	public Map<String, Object> queryInsurPresWithPage(Page page , PresInfoVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-06:传入参数对象为空!");
		}
		
		if(returnVO.getAaz217() == null){
			throw new BusinessException("F10601001VS-07:传入参数  aaz217 为空!");
		}
		
		Page result = this.getStatisticBS().queryPresInfoByAaz217(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	public Map<String, Object> queryInsurViosRecdWithPage(Page page , ViolRecdVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10601001VS-08:传入参数对象为空!");
		}
		
//		if(!StringTools.hasText(returnVO.getAac001())){
//			throw new BusinessException("F10601001VS-08:传入参数  aac001 为空!");
//		}
		
//		returnVO.setAaz010(returnVO.getAac001());//设置当事人id
//		
//		returnVO.setApa709(StatisticalAnalysisConstants.APA709_CODE_1);//设置当事人类型
		
		Page result = this.getStatisticBS().queryVoisRecdWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
}
