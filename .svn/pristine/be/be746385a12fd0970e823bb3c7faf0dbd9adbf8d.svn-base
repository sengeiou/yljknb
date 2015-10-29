package com.wondersgroup.local.k6.f10602001.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.AnalTopDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.DoctTendDTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10602001.vo.DoctExpenVO;
import com.wondersgroup.local.k6.f10602001.vo.PresInfoVO;
import com.wondersgroup.local.k6.f10602001.vo.ViolRecdVO;
import com.wondersgroup.local.k6.f10602001.vo.VisitInfoVO;
import com.wondersgroup.local.k6.f10602001.vs.F10602001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10602001VSImpl implements F10602001VS {
	
	private StatisticBS statisticBS;

	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}
	
	public String queryStrip(DoctExpenVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-00:传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);
			
			returnVO.setAae042(aae042);
		}
		
		if(StringTools.hasText(returnVO.getDrfee())){
			returnVO.setAnalcode(returnVO.getDrfee());
		}
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		DoctTendDTO doctTenVO = new DoctTendDTO();
		
		BeanTools.copyProperties(returnVO, doctTenVO);
		
		doctTenVO = this.getStatisticBS().queryAnalidByDoctFee(doctTenVO);//调用存储过程
		
		if(!StringTools.hasText(doctTenVO.getAnalid())){
			throw new BusinessException("F10602001VS-01:通过存过查询 分析id为空!");
		}
		
		returnVO.setAnalid(doctTenVO.getAnalid());//设置分析id
		
		List<AnalTopDTO> result = this.getStatisticBS().queryDoctExpenWithPage(returnVO);
		
		if(result.size() <= 0){
			throw new BusinessException("F10602001VS-02:查询图表数据为空!");
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

	public Map<String, Object> queryDoctMediWithPage(Page page,DoctExpenVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-03:查询医师医疗类别，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602001VS-04:查询医师医疗类别，传入参数医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始时间
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束时间
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		Page result = this.getStatisticBS().queryDoctMediCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctStatuWithPage(Page page,DoctExpenVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-05:查询医师身份类别，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602001VS-06:查询医师身份类别，传入参数医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始时间
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束时间
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		Page result = this.getStatisticBS().queryDoctStatuCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctDiseWithPage(Page page,DoctExpenVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-07:查询医师疾病信息，传入参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602001VS-08:查询医师疾病信息，传入参数医师编号aaz263为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041s())){
			
			String aae041 = returnVO.getAae041s().substring(0, 6);//开始时间
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042s())){
			
			String aae042 = returnVO.getAae042s().substring(0, 6);//结束时间
			
			returnVO.setAae042(aae042);
		}
		
		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		Page result = this.getStatisticBS().queryDoctStatuCateWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctVisitWithPage(Page page,VisitInfoVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-09:查询医师就诊信息,传入参数对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz263())){
			throw new BusinessException("F10602001VS-10:查询医师就诊信息,传入医师编号 aaz263 为空!");
		}
		
		Page result = this.getStatisticBS().queryDoctVisitWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctPresWithPage(Page page,PresInfoVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-11:查询医师处方信息,传入参数对象为空!");
		}
		
		if(returnVO.getAaz217() == null){
			throw new BusinessException("F10602001VS-12:查询医师处方信息,传入参数  aaz217 为空!");
		}
		
		Page result = this.getStatisticBS().queryPresInfoByAaz217(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryDoctViolaWithPage(Page page,ViolRecdVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10602001VS-12:查询医师违规信息,传入参数对象为空!");
		}
		
//		if(!StringTools.hasText(returnVO.getAaz263())){
//			throw new BusinessException("F10602001VS-13:查询医师违规信息,传入参数 医师编号 aaz263为空!");
//		}
		
//		returnVO.setAaz010(returnVO.getAaz263());////设置当事人id
//		
//		returnVO.setApa709(StatisticalAnalysisConstants.APA709_CODE_2);//设置当事人类型
		
		Page result = this.getStatisticBS().queryVoisRecdWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
}
