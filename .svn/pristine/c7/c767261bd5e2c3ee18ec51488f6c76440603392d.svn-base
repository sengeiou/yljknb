package com.wondersgroup.local.k6.f10603006.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediFeeTrendDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.MediMoveAvgDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603006.vo.MediFeeTendVO;
import com.wondersgroup.local.k6.f10603006.vs.F10603006VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10603006VSImpl implements F10603006VS{

	private StatisticBS statisticBS;

	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}

	public String queryStrip(MediFeeTendVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603006VS-00:传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		if(StringTools.hasText(returnVO.getFyqs())){
			returnVO.setAnalcode(returnVO.getFyqs());
		}
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setAaa027("310000");
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		MediFeeTrendDTO mftDto = new MediFeeTrendDTO();
		
		BeanTools.copyProperties(returnVO, mftDto);
		
		mftDto = this.getStatisticBS().queryAnalidByMediFee(mftDto);//调用存储过程
		
		if(!StringTools.hasText(mftDto.getAnalid())){
			throw new BusinessException("F10603006VS-01:根据存过 查询分析id为空!");
		}
		
		returnVO.setAnalid(mftDto.getAnalid());//设置分析id
		
		List<MediMoveAvgDTO> result = this.getStatisticBS().queryMediFeeTrendList(returnVO);
		
		String xAxisCategories="";//横坐标 时间 memo
		
		String dates1="";//valueA 医疗费用
		
		String dates2="";//valueB 移动平均
		
		for (MediMoveAvgDTO mediMoveAvgDTO : result) {
			
			xAxisCategories=xAxisCategories+"\""+mediMoveAvgDTO.getMemo()+"\",";
			
			dates1 = dates1 + mediMoveAvgDTO.getValueA()+",";
			
			dates2 = dates2 + mediMoveAvgDTO.getValueB() + ",";
		}
		
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		
		String jsonData = "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+dates1
				+",\"dates2\":"+dates2+ ",\"analid\":"+returnVO.getAnalid() + "}";
		
		return jsonData;
	}

	public Map<String, Object> queryMediFeeTrendWithPage(Page page,MediFeeTendVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10603006VS-01:传入参数为空!");
		}
		
		if(StringTools.hasText(returnVO.getAae041Star())){
			
			String aae041 = returnVO.getAae041Star().replaceAll("-", "");
			
			returnVO.setAae041(aae041);
		}
		
		if(StringTools.hasText(returnVO.getAae042End())){
			
			String aae042 = returnVO.getAae042End().replaceAll("-", "");
			
			returnVO.setAae042(aae042);
		}
		
		Page result = this.getStatisticBS().queryMediFeeTrendWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
}
