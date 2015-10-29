package com.wondersgroup.local.k6.f10602003.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctDrugDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke13DTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10602003.vo.DoctDrugVO;
import com.wondersgroup.local.k6.f10602003.vs.F10602003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10602003VSImpl implements F10602003VS{
	
	private StatisticBS statisticBS;
	
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}
	
	public String queryStrip(DoctDrugVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10602003VS-00:医师药品图表，传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始日期
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束日期
			
			returnVO.setAae042(aae042);
		}
		
		if(StringTools.hasText(returnVO.getDtrug())){
			returnVO.setAnalcode(returnVO.getDtrug());
		}
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		DoctDrugDTO ddDto = new DoctDrugDTO();
		
		BeanTools.copyProperties(returnVO, ddDto);
		
		ddDto = this.getStatisticBS().queryAnalidByDoctDrug(ddDto);//调用存储过程
		
		if(!StringTools.hasText(ddDto.getAnalid())){
			throw new BusinessException("F10602003VS-01:医师药品，通过存过查询 分析id为空!");
		}
		
		returnVO.setAnalid(ddDto.getAnalid());//设置分析id
		
		Ke13DTO ke13Dto = new Ke13DTO();
		
		ke13Dto.setRank(returnVO.getRank());
		
		ke13Dto.setAnalid(returnVO.getAnalid());
		
		List<AnalTopDTO> result = this.getStatisticBS().queryDoctExpenWithPage(ke13Dto);
		
		if(result.size() <= 0){
			throw new BusinessException("F10602003VS-08:医师药品，查询图表数据为空!");
		}
		
		String xAxisCategories="";//横坐标 医师id
		
		String dates1="";//value  费用
		
		for (AnalTopDTO analTopDTO : result) {
			
			xAxisCategories = xAxisCategories+"\""+ analTopDTO.getTopid() +"\",";
			
			dates1 = dates1 + analTopDTO.getValueA() +",";
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		String jsonData = "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+ dates1 + "}";
		
		return jsonData;
	}

	public Map<String, Object> queryDoctDrugDiseaseWithPage(Page page,DoctDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602003VS-02:查询甲类，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602003VS-03:查询甲类，传入医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始日期
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束日期
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//设置三大目录类别  药品
		
		returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_1);//设置收费项目等级  甲类
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//设置统计周期按月
		
		Page result = this.getStatisticBS().queryDoctDrugCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctDrugMedicalWithPage(Page page,DoctDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602003VS-04:查询乙类，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602003VS-05:查询乙类，传入医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始日期
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束日期
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//设置三大目录类别  药品
		
		returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_2);//设置收费项目等级  乙类
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//设置统计周期按月
		
		Page result = this.getStatisticBS().queryDoctDrugCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctDrugIdentifyWithPage(Page page,DoctDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602003VS-06:查询丙类，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602003VS-07:查询丙类，传入医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始日期
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束日期
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//设置三大目录类别  药品
		
		returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_3);//设置收费项目等级  丙类
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//设置统计周期按月
		
		Page result = this.getStatisticBS().queryDoctDrugCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
}
