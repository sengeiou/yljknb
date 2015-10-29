package com.wondersgroup.local.k6.f10603005.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AcceptDTO;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.AnalAttenMediDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603005.vo.AcceptPeopleVO;
import com.wondersgroup.local.k6.f10603005.vs.F10603005VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10603005VSImpl implements F10603005VS {
	private StatisticBS statisticBS;
	
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}

	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}


	public String queryStrip(AcceptPeopleVO returnVO){
		
		if(returnVO == null){
			throw new BusinessException("F10603005VS-00:传入参数为空!");
		}
		if(returnVO.getAae041()==null||returnVO.getAae041().length()<7||
				returnVO.getAae042()==null||returnVO.getAae042().length()<7){
			throw new BusinessException("F10601002VS-03:查询日期错误");
		}
		else{
			String aae041s = returnVO.getAae041().replaceAll("-", "");
			returnVO.setAae041(aae041s);
			String aae042s = returnVO.getAae042().replaceAll("-", "");
			returnVO.setAae042(aae042s);
		}
		
//		returnVO.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);//按月查询
		
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		
		returnVO.setUserid(userid);//设置当前人id
		
		returnVO.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		
		if(StringTools.hasText(returnVO.getMdrc())){
			returnVO.setAnalcode(returnVO.getMdrc());
		}
		
		AcceptDTO acceptVO = new AcceptDTO();
		
		BeanTools.copyProperties(returnVO, acceptVO);//赋值（将页面接收到的值赋值到存储过程要用的dto里）
		
		acceptVO = this.getStatisticBS().queryAnalidByAccept(acceptVO);//调用存储过程（得到分析ID）
		
		if(!StringTools.hasText(acceptVO.getAnalid())){
			throw new BusinessException("F10603005VS-01:通过存过查询 分析id为空!");
		}
		
		returnVO.setAnalid(acceptVO.getAnalid());//设置分析id
		List<AnalAttenMediDTO> result = this.getStatisticBS().queryAcceptPeopleList(returnVO);
		
		if(result.size()<=0){
			throw new BusinessException("F10603005VS-02:查询图表数据为空");
		}
		String xAxisCategories = "";//横坐标时间
		String dates1 = "";
		String dates2 = "";
		
		for (AnalAttenMediDTO analAttenMediDTO : result) {
			xAxisCategories = xAxisCategories+"\""+ analAttenMediDTO.getLabel() +"\",";
			
			dates1 = dates1 + analAttenMediDTO.getValueA() +",";
			
			dates2 = dates2 + analAttenMediDTO.getValueB() +",";
		}
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		
		String jsonData = "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+ dates1 + ",\"dates2\":"+ dates2 + 
		",\"analid\":"+ acceptVO.getAnalid() + "}";
		
		return jsonData;
	}

	public Map<String, Object> queryYLJGJZRCFZQSWithPage(Page page,
			AcceptPeopleVO acpeVO) {
		
		Page result = this.getStatisticBS().queryYLJGJZRCFZQSWithPage(page,
				acpeVO);

		Map<String, Object> map = GridUtils.getGridData(result);

		return map;
		
	}

}