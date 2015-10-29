package com.wondersgroup.local.k6.f10603002.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediClinDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603002.vo.MediClinVO;
import com.wondersgroup.local.k6.f10603002.vs.F10603002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10603002VSImpl implements F10603002VS{

	private StatisticBS statisticBS;

	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}

	public String queryStrip(MediClinVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603002VS-00:传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		if(StringTools.hasText(returnVO.getMidfee())){
			returnVO.setAnalcode(returnVO.getMidfee());
		}
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		returnVO.setAaa027("310000");
		
		MediClinDTO mediClinDTO = new MediClinDTO();
		
		BeanTools.copyProperties(returnVO, mediClinDTO);
		
		mediClinDTO = this.getStatisticBS().queryAnalidByMediClinFee(mediClinDTO);//调用存储过程
		
		if(!StringTools.hasText(mediClinDTO.getAnalid())){
			throw new BusinessException("F10603002VS-01:通过存过查询 分析id为空!");
		}
		
		returnVO.setAnalid(mediClinDTO.getAnalid());//设置分析id
		//returnVO.setAnalid("1000000000005417");
		
		List<AnalTopDTO> result = this.getStatisticBS().queryMediClinExpenList(returnVO);
		
		if(result.size() <= 0){
			throw new BusinessException("F10603002VS-02:查询图表数据为空!");
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

	public Map<String, Object> queryMediClinMediWithPage(Page page,MediClinVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603002VS-03:查詢機構門診 參數為空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603002VS-04:查询 醫療機構主鍵 aaz107 为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediClinMediWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediClinIdentifyWithPage(Page page,MediClinVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603002VS-05:查詢機構門診 參數為空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603002VS-06:查询 醫療機構主鍵 aaz107 为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediClinIdentifyWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryMediClinDiseaseWithPage(Page page,MediClinVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603002VS-07:查詢機構門診 參數為空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz107())){
			throw new BusinessException("F10603002VS-08:查询 醫療機構主鍵 aaz107 为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月统计
		
		Page result = this.getStatisticBS().queryMediClinDiseaseWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
}
