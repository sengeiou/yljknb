package com.wondersgroup.local.k4.f10401001.vs.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;


import com.wondersgroup.bc.ruleknowledgemanage.planmanage.bs.PlanManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.planmanage.model.dto.Af51DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.common.vo.DownLoadFile;
import com.wondersgroup.local.common.vo.ExcelVO;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10401001.vs.F10401001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10401001VSImpl implements F10401001VS,DownLoadFile{
	private PlanManageBS planManageBS;
	

	public PlanManageBS getPlanManageBS() {
		return planManageBS;
	}

	public void setPlanManageBS(PlanManageBS planManageBS) {
		this.planManageBS = planManageBS;
	}

	
	public Map<String, Object> queryPlanManageWithPage(Page page,
			PlanManageVO planManageVO) {
		
		Page result=this.getPlanManageBS().queryPlanManageWithPage(page, planManageVO);
		
		return GridUtils.getGridData(result);
	}

	public PlanManageVO addPlanManage(PlanManageVO resultVO) {
		
		
		
		planManageBS.addImplScheme(resultVO);
		
		return resultVO;
		
	}

	public PlanManageVO updatePlanManage(PlanManageVO resultVO) {
		
		planManageBS.updateImplScheme(resultVO);
		
		return resultVO;
	}

	public PlanManageVO find(String aaz100) {
		 
		PlanManageVO resultVO=new PlanManageVO();
		if(aaz100==null){
			throw new BusinessException("F10401001VS-10:提示，根据主键查询一个af51对象，主键aaz100为空!");
		}
		
		Af51DTO af51DTO=this.getPlanManageBS().findaf51(aaz100);
		BeanTools.copyProperties(af51DTO, resultVO);
		return resultVO;
	}

	public PlanManageVO updateAae100(String aaz100, String aae100) {
		/*UserContext userContext = BusinessContextUtils.getUserContext();
		String aae011 = userContext.getOperatorName();*/
		//System.out.println(aaz100+"===========");
		PlanManageVO resultVO=new PlanManageVO();
		if(!StringUtils.hasText(aaz100)){
			throw new BusinessException("F10401001VS-10:提示，根据主键aaz100查询一个af51对象，主键aaz100为空!");
		}
		if(!StringTools.hasText(aae100)){
			throw new BusinessException("F10401001VS-10:提示，根据aaz100查询一个af51对象，aae100为空!");
		}
		Af51DTO af51DtO=this.getPlanManageBS().updateaf51Aae100(aaz100, aae100);
		BeanTools.copyProperties(af51DtO, resultVO);
		//System.out.println(resultVO+"==================================");
		return resultVO;
		
	}

	
	public ExcelVO getOption(Map<String,Object> map) {
		
		ExcelVO returnVO = new ExcelVO();
		//构造查询条件
		String aaa201 = ((String[])map.get("aaa201"))[0];
		String aaa143 = ((String[])map.get("aaa143"))[0];
		String aae100 = ((String[])map.get("aae100"))[0];
		String aae011 = ((String[])map.get("aae011"))[0];
		Af51DTO  queryDto = new Af51DTO();
		
		queryDto.setAaa201(aaa201);
		queryDto.setAaa143(aaa143);
		queryDto.setAae100(aae100);
		queryDto.setAae011(aae011);
		
		returnVO.setTitle("方案信息");
		
		//构造表头
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("aaa201", "方案名称");
		linkedHashMap.put("aaa143", "方案分类");
		linkedHashMap.put("aaa026", "实现类型");
		linkedHashMap.put("aaa133", "方案描述");
		linkedHashMap.put("aae100", "有效标志");
		linkedHashMap.put("aae011", "经办人");
		linkedHashMap.put("aae036", "经办时间");
		returnVO.setHeads(linkedHashMap);
		//查询数据
		List<Map<String,Object>> list = this.getPlanManageBS().queryAf51ForExport(queryDto);
		returnVO.setList(list);
		
		return returnVO;
	}

}
