package com.wondersgroup.local.k4.f10402005.vs.impl;

import java.util.Map;


import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbDicGzmsDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;


import com.wondersgroup.local.k4.f10402005.vo.AddRuleVO;
import com.wondersgroup.local.k4.f10402005.vs.F10402005VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;




public class F10402005VSImpl implements F10402005VS {
	
	private RuleManageBS ruleManageBS;
	
	
	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}


	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}


	public AddRuleVO addRule(AddRuleVO resultVO) {
		
		ruleManageBS.addTbDicGzms(resultVO);
	
		return resultVO;
	}


	public Map<String, Object> queryRuleMessage(Page page, AddRuleVO addRuleVO) {
			
			Page result=this.getRuleManageBS().queryRuleMessage(page, addRuleVO);
			
			return GridUtils.getGridData(result);
		
	}



	public AddRuleVO updateRuleMessage(AddRuleVO resultVO,String gzdm1) {
	
		ruleManageBS.updateTbDicGzms(resultVO,gzdm1);
		return resultVO;
	}


	public AddRuleVO find(String id) {
		AddRuleVO resultVO=new AddRuleVO();
		if(id==null){
			throw new BusinessException("F10402005VS-10:提示，根据主键查询一个tbdicgzms对象，主键id为空!");
		}
		
		TbDicGzmsDTO tbdicgzmsDTO=this.getRuleManageBS().findtbdicgzms(id);
		BeanTools.copyProperties(tbdicgzmsDTO, resultVO);
		return resultVO;
	}


	public void deleteRuleMessage(String idStr) {
		this.ruleManageBS.deleteTbDicGzms(idStr);

	}



 

}
