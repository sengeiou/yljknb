package com.wondersgroup.local.k6.f10603003.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kf28DTO;
import com.wondersgroup.bc.statisticalanalysis.StatisticalAnalysisConstants;
import com.wondersgroup.bc.statisticalanalysis.statistic.bs.StatisticBS;
import com.wondersgroup.bc.statisticalanalysis.statistic.model.dto.YlfwjgfxfyzbDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k6.f10603003.vo.F10603003VO;
import com.wondersgroup.local.k6.f10603003.vs.F10603003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10603003VSImpl implements F10603003VS{
	private StatisticBS statisticBS;
	public StatisticBS getStatisticBS() {
		return statisticBS;
	}
	public void setStatisticBS(StatisticBS statisticBS) {
		this.statisticBS = statisticBS;
	}
	public List<Map<String, Object>> queryMediPartFee(F10603003VO vo) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		YlfwjgfxfyzbDTO ylfwjgfxfyzbDTO=new YlfwjgfxfyzbDTO();
		Kf28DTO dto=new Kf28DTO();
		if(vo == null){
			throw new BusinessException("F10603003VS-00:传入参数为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10603003VS-01:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		String userid = BusinessContextUtils.getUserContext().getOperatorId();//当前操作人id
		vo.setUserid(userid);//设置当前人id
		vo.setIsdelete(StatisticalAnalysisConstants.ISDELETE_CODE_0);//不重新生成
		BeanTools.copyProperties(vo, ylfwjgfxfyzbDTO);
		ylfwjgfxfyzbDTO=this.getStatisticBS().qureyAnalId(ylfwjgfxfyzbDTO);
		if(ylfwjgfxfyzbDTO.getAppmsg()!=null){
			throw new BusinessException("F10603003VS-02:"+ylfwjgfxfyzbDTO.getAppmsg());
		}
		BeanTools.copyProperties(ylfwjgfxfyzbDTO,dto );
		if(vo.getRank()!=null){
			dto.setRank(vo.getRank());
		}
		List<Kf28DTO> result=this.getStatisticBS().queryMediPartFee(dto);
		if(result.size() <= 0){
			throw new BusinessException("F10603003VS-03:根据条件查询结果为空!");
		}
		for(Kf28DTO d:result){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", d.getLabel());
			map.put("y", d.getValueA());
			map.put("id",d.getId());
			list.add(map);
		}
		return list;
	}
	public Map<String, Object> queryDisease(Page page, F10603003VO vo) {
		if(vo == null){
			throw new BusinessException("F10603003VS-04:传入参数为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10603003VS-05:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		if(!StringTools.hasText(vo.getAaz107())){
			throw new BusinessException("F10603003VS-06:传入医疗服务机构ID为空");
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Kf28DTO dto=new Kf28DTO();
		BeanTools.copyProperties(vo,dto);
		page=this.getStatisticBS().queryDiseaseWithPage(page, dto);
		return GridUtils.getGridData(page);
	}
	public Map<String, Object> queryIdentify(Page page, F10603003VO vo) {
		if(vo == null){
			throw new BusinessException("F10603003VS-07:传入参数为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10603003VS-08:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		if(!StringTools.hasText(vo.getAaz107())){
			throw new BusinessException("F10603003VS-09:传入医疗服务机构ID为空");
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Kf28DTO dto=new Kf28DTO();
		BeanTools.copyProperties(vo,dto);
		page=this.getStatisticBS().queryIdentifyWithPage(page, dto);
		return GridUtils.getGridData(page);
	}
	public Map<String, Object> queryMedical(Page page, F10603003VO vo) {
		if(vo == null){
			throw new BusinessException("F10603003VS-10:传入参数为空");
		}		
		if(vo.getAae041()==null||vo.getAae041().length()<7||
				vo.getAae042()==null||vo.getAae042().length()<7){
			throw new BusinessException("F10603003VS-11:查询日期错误");
		}
		else{
			//时间转化 如：2014-01 变成201401
			vo.setAae041(vo.getAae041().substring(0, 4)+vo.getAae041().substring(5, 7));
			vo.setAae042(vo.getAae042().substring(0, 4)+vo.getAae042().substring(5, 7));
		}
		if(!StringTools.hasText(vo.getAaz107())){
			throw new BusinessException("F10603003VS-12:传入医疗服务机构ID为空");
		}
		vo.setApe032(StatisticalAnalysisConstants.APE032_CODE_M);
		Kf28DTO dto=new Kf28DTO();
		BeanTools.copyProperties(vo,dto);
		page=this.getStatisticBS().queryMedicalWithPage(page, dto);
		return GridUtils.getGridData(page);
	}
}
