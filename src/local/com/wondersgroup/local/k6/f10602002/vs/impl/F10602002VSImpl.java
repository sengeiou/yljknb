package com.wondersgroup.local.k6.f10602002.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke12DTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k6.f10602002.vo.F10602002VO;
import com.wondersgroup.local.k6.f10602002.vs.F10602002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10602002VSImpl implements F10602002VS{
	private StatisticBS statisticBS;
	
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}
	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}
	public List<Map<String, Object>> queryInvoice(F10602002VO vo) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		if(vo == null){
			throw new BusinessException("F10602002VS-00:传入参数为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10602002VS-01:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Ke12DTO dto=new Ke12DTO();
		BeanTools.copyPropertiesIgnoreNull(vo, dto);
		List<Ke12DTO> result = this.getStatisticBS().queryInvoice(dto);
		if(result.size() <= 0){
			throw new BusinessException("F10602002VS-02:根据条件查询结果为空!");
		}
		for(Ke12DTO d:result){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", d.getLabel());
			map.put("y", d.getValueA());
			map.put("id",d.getId());
			list.add(map);
		}
		return list;
	}
	public Map<String, Object> queryCharge(Page page,F10602002VO vo) {
		if(vo == null){
			throw new BusinessException("F10602002VS-03:传入参数为空");
		}
		vo.setAke003(vo.getId());
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10602002VS-04:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Ke12DTO dto=new Ke12DTO();
		BeanTools.copyProperties(vo,dto);
		page=this.getStatisticBS().queryChargeWithPage(page, dto);
		return GridUtils.getGridData(page);
	}
	public String queryDoctRank(F10602002VO vo) {
		if(vo == null){
			throw new BusinessException("F10602002VS-05:传入参数为空");
		}
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10602002VS-06:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Ke12DTO dto=new Ke12DTO();
		BeanTools.copyProperties(vo,dto);
		List<Ke12DTO> result=this.getStatisticBS().queryDoctRank(dto);
		if(result.size() <= 0){
			throw new BusinessException("F10602002VS-07:根据条件查询结果为空!");
		}
		String xAxisCategories="";
		String dates1="";
		String dates2="";
		for(Ke12DTO k:result){
			xAxisCategories=xAxisCategories+"\""+k.getLabel()+"\",";
			dates1 = dates1 + k.getValueA()+",";
			dates2 = dates2 + k.getId() + ",";
		}
		xAxisCategories="["+xAxisCategories.substring(0, xAxisCategories.length()-1)+"]";
		
		dates1="["+dates1.substring(0, dates1.length()-1)+"]";
		dates2="["+dates2.substring(0, dates2.length()-1)+"]";
		return "{\"xAxisCategories\":"+xAxisCategories+",\"dates1\":"+dates1+",\"dates2\":"+dates2+"}";
	}
}
