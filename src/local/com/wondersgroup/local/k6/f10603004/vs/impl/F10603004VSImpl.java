package com.wondersgroup.local.k6.f10603004.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediDrugDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603004.vo.MediDrugVO;
import com.wondersgroup.local.k6.f10603004.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10603004.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10603004.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10603004.vs.F10603004VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10603004VSImpl implements F10603004VS{

	private StatisticBS statisticBS;

	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}

	public String queryStrip(MediDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-00:传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		if(StringTools.hasText(returnVO.getMidrug())){
			returnVO.setAnalcode(returnVO.getMidrug());
		}
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		returnVO.setAaa027("310000");//设置统筹区编码
		
		MediDrugDTO mediDrugDto = new MediDrugDTO();
		
		BeanTools.copyProperties(returnVO, mediDrugDto);
		
		mediDrugDto = this.getStatisticBS().queryAnalidByMediDrug(mediDrugDto);//调用存储过程
		
		if(!StringTools.hasText(mediDrugDto.getAnalid())){
			throw new BusinessException("F10603004VS-01:通过存过查询 分析id为空!");
		}
		
		returnVO.setAnalid(mediDrugDto.getAnalid());//设置分析id
		
		List<AnalTopDTO> result = this.getStatisticBS().queryMediDrugExpenList(returnVO);
		
		if(result.size() <= 0){
			throw new BusinessException("F10603004VS-02:查询图表数据为空!");
		}
		
		String xAxisCategories="";//横坐标 id主键 lable名称
		
		String datas1="";//value  值
		
		List<Map<String , Object>> mapList = new ArrayList<Map<String,Object>>();
		
		for (AnalTopDTO analTopDTO : result) {
			
			xAxisCategories = xAxisCategories+"\""+ analTopDTO.getToplabel() +"\",";//x轴
			
			Map<String , Object> map = new HashMap<String, Object>();
			
			map.put("id", analTopDTO.getTopid());
			
			map.put("y", analTopDTO.getValueA());
			
			mapList.add(map);
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		datas1 = VOUtils.getJsonDataFromCollection(mapList);
		
		String jsonData = "{\"xAxisCategories\":"+xAxisCategories+",\"datas1\":"+ datas1 + "}";
		
		return jsonData;
	}

	public Map<String, Object> queryMediDrugDiseaseWithPage(Page page,MediDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-03:查询图表数据为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603004VS-04:查询 医疗机构主键为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		//returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_1);//甲类
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//三大目录类别
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediDrugDiseaseWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediDrugMedicalWithPage(Page page,MediDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-05:查询图表数据为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603004VS-06:查询 医疗机构主键为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		//returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_2);//乙类
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//三大目录类别
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediDrugMedicalWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediDrugIdentifyWithPage(Page page,MediDrugVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-07:查询图表数据为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603004VS-08:查询 医疗机构主键为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		//returnVO.setAka065(StatisticalAnalysisConstants.AKA065_CODE_3);//丙类
		
		returnVO.setAke003(StatisticalAnalysisConstants.AKE003_CODE_1);//三大目录类别
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediDrugIdentifyWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediDrugVisitWithPage(Page page,VisitInfoVO returnVO) {
		

		if(returnVO == null){
			throw new BusinessException("F10603004VS-09:查询查询医疗机构就诊信息,传入参数对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603004VS-10:查询查询医疗机构就诊信息,传入 aaz107 为空!");
		}
		
		Page result = this.getStatisticBS().queryMediVisitWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediDrugPresWithPage(Page page,PresInfoVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-11:查询医疗机构处方信息,传入参数对象为空!");
		}
		
		if(returnVO.getAaz217() == null){
			throw new BusinessException("F10603004VS-12:查询医疗机构处方信息,传入参数  aaz217 为空!");
		}
		
		Page result = this.getStatisticBS().queryPresInfoByAaz217(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediDrugViolaWithPage(Page page,ViolRecdVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603004VS-13:查询医疗机构违规信息,传入参数对象为空!");
		}
		
//		if(!StringTools.hasText(returnVO.getAaz107())){
//			throw new BusinessException("F10603004VS-14:查询医疗机构违规信息,传入参数 aaz107为空!");
//		}
		
//		returnVO.setAaz010(returnVO.getAaz107());////设置当事人id
//		
//		returnVO.setApa709(StatisticalAnalysisConstants.APA709_CODE_3);//设置当事人类型
		
		Page result = this.getStatisticBS().queryVoisRecdWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
}
