package com.wondersgroup.local.k6.f10601002.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.CbrjyqsDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc50DTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10601002.vo.F10601002VO;
import com.wondersgroup.local.k6.f10601002.vs.F10601002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10601002VSImpl implements F10601002VS {
	private StatisticBS statisticBS;
	
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}
	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}
	public Map<String, Object> querySeeDoctTrendWithPage(Page page,
			F10601002VO vo) {
		if(vo == null){
			throw new BusinessException("F10601002VS-00:传入参数为空");
		}
		if(!StringTools.hasText(vo.getApe032())){
			throw new BusinessException("F10601002VS-01:传入统计周期为空");
		}
		if(!StringTools.hasText(vo.getPsqs())){
			throw new BusinessException("F10601002VS-02:传入分析指标为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10601002VS-03:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		vo.setUserid(userid);//设置当前人id
		vo.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		CbrjyqsDTO cbrjyqsDTO=new CbrjyqsDTO();
		BeanTools.copyProperties(vo, cbrjyqsDTO);	
		cbrjyqsDTO=this.getStatisticBS().queryProccid(cbrjyqsDTO);
		if(cbrjyqsDTO.getAppmsg()!=null)
			throw new BusinessException("F10601002VS-04:"+cbrjyqsDTO.getAppmsg());
		vo.setProccid(cbrjyqsDTO.getAnalid());
		Kc50DTO kc50DTO=new Kc50DTO();
		BeanTools.copyProperties(vo,kc50DTO);
		
		Page result=this.getStatisticBS().querySeeDoctTrendWithPage(page,kc50DTO);
		
		return GridUtils.getGridData(result);
	}
	public String queryMoveAverage(F10601002VO vo) {
		if(vo == null){
			throw new BusinessException("F10601002VS-05:传入参数为空");
		}
		if(!StringTools.hasText(vo.getApe032())){
			throw new BusinessException("F10601002VS-06:传入统计周期为空");
		}
		if(!StringTools.hasText(vo.getPsqs())){
			throw new BusinessException("F10601002VS-07:传入分析指标为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10601002VS-08:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		vo.setUserid(userid);//设置当前人id
		vo.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		CbrjyqsDTO cbrjyqsDTO=new CbrjyqsDTO();
		BeanTools.copyProperties(vo, cbrjyqsDTO);
		cbrjyqsDTO=this.getStatisticBS().queryProccid(cbrjyqsDTO);
		if(cbrjyqsDTO.getAppmsg()!=null)
			throw new BusinessException("F10601002VS-04:"+cbrjyqsDTO.getAppmsg());
		vo.setProccid(cbrjyqsDTO.getAnalid());
		List<Kc50DTO> result=this.getStatisticBS().queryMoveAverage(vo);
		if(result.size() <= 0){
			throw new BusinessException("F10601002VS-09:根据条件查询结果为空!");
		}
		String xAxisCategories="";
		String dates1="";
		String dates2="";
		for(Kc50DTO kc50DTO:result){
			xAxisCategories=xAxisCategories+"\""+kc50DTO.getLabel()+"\",";
			dates1 = dates1 + kc50DTO.getValueB()+",";
			dates2 = dates2 + kc50DTO.getValueC() + ",";
		}
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		return "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+dates1+",\"dates2\":"+dates2+"}";
	}
}
