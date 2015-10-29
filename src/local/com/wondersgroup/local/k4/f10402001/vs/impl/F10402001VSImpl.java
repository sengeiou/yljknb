package com.wondersgroup.local.k4.f10402001.vs.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.Ka43DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k4.f10401001.vo.PlanManageVO;
import com.wondersgroup.local.k4.f10402001.vo.ModelManageVO;
import com.wondersgroup.local.k4.f10402001.vo.RuleVO;
import com.wondersgroup.local.k4.f10402001.vs.F10402001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
public class F10402001VSImpl implements F10402001VS{
	RuleManageBS ruleManageBS;
	
	public Map<String, Object> queryModelManageWithPage(Page page,
			ModelManageVO modelManageVo) {
		return GridUtils.getGridData(ruleManageBS.queryModelManageWithPage(page, modelManageVo));
	}

	public Map<String, Object> queryRuleWithPageAndModel(Page page,
			RuleVO ruleVo) {
		return GridUtils.getGridData(ruleManageBS.queryRuleWithPageAndModel(page, ruleVo.getAaz320().toString()));
	}
	

	public Map<String, Object> querySchemeWithPage(Page page, PlanManageVO schemeVo,String type) {
		return GridUtils.getGridData(ruleManageBS.querySchemeWithPage(page, schemeVo,type));
	}
	

	public ModelManageVO saveModel(ModelManageVO modelVO) {
		if (modelVO == null) {
			throw new BusinessException("F10402001-00:传入ModelManageVO为空!");
		}

		Ka43DTO ka43Dto = new Ka43DTO();
		
		BeanTools.copyProperties(modelVO, ka43Dto);

		ruleManageBS.SaveKa43(ka43Dto);
		
		BeanTools.copyProperties(ka43Dto, modelVO);

		return modelVO;
	}
	
	public ModelManageVO updateModel(ModelManageVO modelVO) {
		if (modelVO == null) {
			throw new BusinessException("F10402001-00:传入ModelManageVO为空!");
		}

		Ka43DTO ka43Dto = new Ka43DTO();
		
		BeanTools.copyProperties(modelVO, ka43Dto);

		ruleManageBS.updateKa43(ka43Dto);
		
		BeanTools.copyProperties(ka43Dto, modelVO);

		return modelVO;
	}
	
	public ModelManageVO queryModelById(String id) {
		if(StringUtils.isEmpty(id)){
			throw new BusinessException("F10402002VS-00:传入规则模块ID为空!");
		}
		Ka43DTO ka43Dto=ruleManageBS.queryModelById(Long.valueOf(id));
		ModelManageVO modelVo=new ModelManageVO();
		if(ka43Dto!=null){
			BeanTools.copyProperties(ka43Dto,modelVo);
		}
		return modelVo;
	}
	
	public void updateModelManageAae100(ModelManageVO model) {
		Ka43DTO dto=new Ka43DTO();
		BeanTools.copyProperties(model,dto);
		ruleManageBS.updateKa43Aae100(dto);
	}
	
	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}

	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}

//	public ExcelVO getOption(Map map) {
//
//		ExcelVO returnVO = new ExcelVO();
//		//构造查询条件
//		String aaa169 = ((String[])map.get("aaa169"))[0];
//		String aaa153=((String[])map.get("aaa153"))[0];
//		String aae100=((String[])map.get("aae100"))[0];
//		Ka43DTO  queryDto = new Ka43DTO();
//		queryDto.setAaa169(aaa169);
//		queryDto.setAaa169(aaa153);
//		queryDto.setAaa169(aae100);
//		returnVO.setFilename("规则模板信息");
//		returnVO.setTitle("规则模板信息");
//		//构造表头
//		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();
//		linkedHashMap.put("aaz320", "模板ID");
//		linkedHashMap.put("aaa169", "模板名称");
//		returnVO.setHeads(linkedHashMap);
//		//查询数据
//		List<Map<String,Object>> list = ruleManageBS.queryModelManageForExport(queryDto);
//		returnVO.setList(list);
//		return returnVO;
//	}

}
