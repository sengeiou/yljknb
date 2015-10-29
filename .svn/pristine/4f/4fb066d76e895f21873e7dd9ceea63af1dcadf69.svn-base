package com.wondersgroup.local.k3.f10301014.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301014.bs.F10301014BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k3.f10301014.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301014.vs.F10301014VS;
import com.wondersgroup.wssip.bc.commons.event.BusilogUtils;
import com.wondersgroup.wssip.bc.commons.event.model.dto.BusilogCreateDTO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;


public class F10301014VSImpl implements F10301014VS {
	
	private F10301014BS f10301014BS;
	
	public F10301014BS getF10301014BS() {
		return f10301014BS;
	}

	public void setF10301014BS(F10301014BS f10301014bs) {
		f10301014BS = f10301014bs;
	}

	
	public Map<String, Object> queryAuditCaseWithPage(Page page,StateCheckVO stateCheckVO){
		
		Page result =  this.getF10301014BS().queryAuditCaseDetailsWithPage(page,stateCheckVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAae034() != 0){
				
				String str = String.valueOf(af53Dto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAae034s(aae034s);
			}
			
			if(af53Dto.getAbb025() != 0){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public StateCheckVO updateAuditCaseByIds(String aaz318s){
		if (!StringTools.hasText(aaz318s)) {
			throw new BusinessException("F10301014VS-1:提示，根据主键座结案操作，主键为空！");
		}

		@SuppressWarnings("unused")
		BusilogCreateDTO busilogCreateDto = BusilogUtils
				.createBusinessLog("1030100103");// 业务日志 根据主键删除疑点信息
		
		String[] aaz318Str = aaz318s.split(",");

		String ids = "";
		
		for (int i = 0; i < aaz318Str.length; i++) {

			//String aaz318 = aaz318Str[i];

			//Af53DTO af53Dto = this.getF10301014BS().getAf53ById(aaz318);

		/*	if (AuditConstants.APA165_CODE_2.equals(af32Dto.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_3.equals(af32Dto.getApa165())) {
				continue;
			}

			if (AuditConstants.APA165_CODE_4.equals(af32Dto.getApa165())) {
				continue;
			}*/

			if (i == aaz318Str.length - 1) {
				ids = ids + aaz318Str[i];
			} else {
				ids = ids + aaz318Str[i] + ",";
			}
		}
		StateCheckVO resultVO = new StateCheckVO();
		
		this.getF10301014BS().updateAf53ByIds(ids);
		
		return resultVO;
		
	}
	
	public StateCheckVO updateAuditCaseInfo(StateCheckVO returnVO){
		if(returnVO == null){
			throw new BusinessException("F10301014VS-02:修改的时候 案件對象 resultVO 参数为空!");
		}
		
		if(returnVO.getAaz318() == null){
			throw new BusinessException("F10301014VS-03:修改的时候 传入案件主鍵 318为空!");
		}
		Af53DTO af53DTO = this.getF10301014BS().getAf53ById(String.valueOf(returnVO.getAaz318()));
		
		//aae426 1(立案待确认) 2(不予立案) 3(立案待查) 4(已结案) 5(案件撤销)
		if(AuditConstants.AAE426_CODE_2.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301014VS-08:案件状态已被其他管理员否决，不予立案!");
		}
		
		if(AuditConstants.AAE426_CODE_3.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301014VS-09:案件状态已被其他管理员立案待查!");
		}
		
		if(AuditConstants.AAE426_CODE_4.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301014VS-10:案件状态，已结案!");
		}
		
		if(AuditConstants.AAE426_CODE_5.equals(af53DTO.getAae426())){
			throw new BusinessException("F10301014VS-10:案件状态，已撤销!");
		}
		
		if(returnVO.getAae034() == null || returnVO.getAae034() == 0){
			String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
			af53DTO.setAae034(Integer.valueOf(str));//设置日期
		}else{
			af53DTO.setAae034(returnVO.getAae034());
		}
		
		String aae012 = BusinessContextUtils.getUserContext().getOperatorName();//获取 当前操作人
		
		af53DTO.setAae012(aae012);//设置操作人
		
		BeanTools.copyPropertiesIgnoreNull(returnVO,af53DTO);
		
		af53DTO = this.getF10301014BS().updateAf53(af53DTO);
		this.getF10301014BS().updateAf31ByAf53(af53DTO.getAaz318());
		
		return returnVO;
		
	}
	
	public StateCheckVO queryAuditCaseInfoById(String aaz318){
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301014VS-04:根據逐漸查詢af53對象，傳入參數，主鍵aaz318為空!");
		}
		StateCheckVO returnVO = new StateCheckVO();
		
		Af53DTO af53DTO = this.getF10301014BS().getAf53ById(aaz318);
		
		if(af53DTO != null){
			
			BeanTools.copyProperties(af53DTO,returnVO);
			
		}
		
		return returnVO;
	}
	
	
	
}
