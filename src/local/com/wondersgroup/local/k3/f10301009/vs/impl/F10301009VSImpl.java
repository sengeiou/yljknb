package com.wondersgroup.local.k3.f10301009.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditPersonDTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k3.f10301009.vo.TransferTurnVO;
import com.wondersgroup.local.k3.f10301009.vo.TurnMessageVO;
import com.wondersgroup.local.k3.f10301009.vs.F10301009VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301009VSImpl implements F10301009VS{

	private AdminDisposalBS adminDisposalBS;

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public Map<String, Object> queryTransTurnCasees(Page page,TransferTurnVO returnVO) {
		
		Page result = this.getAdminDisposalBS().queryAf53TransTurn(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			AuditCaseDTO audDto = (AuditCaseDTO) result.getResult().get(i);
			
			if(audDto.getAbb025() != 0){
				
				String str = String.valueOf(audDto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				audDto.setAbb025s(abb025s);
			}
			
			if(audDto.getAae034() != 0){
				
				String str = String.valueOf(audDto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				audDto.setAae034s(aae034s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryTurnCaseByAbz001(Page page,TransferTurnVO returnVO) {
		
		returnVO.setAae426(AuditConstants.AAE426_CODE_10);
		
		Page result = this.getAdminDisposalBS().queryAf53WithPage(page, returnVO);
		
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

	public TurnMessageVO saveTurnInfo(TurnMessageVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301009VS-00：录入移交信息  returnVO 对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz077())){
			throw new BusinessException("F10301009VS-01：录入移交信息   对应被稽核对象主键 aaz077 为空!");
		}
		
		Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(returnVO.getAaz077());
		
		if(af31Dto == null){
			throw new BusinessException("F10301009VS-02：录入移交信息  根据主键 aaz077查询对象为空!");
		}
		
		BeanTools.copyPropertiesIgnoreNull(returnVO,af31Dto);
		
		//判断状态是否是 已移交 0（未移交）1（已移交）
		if(AuditConstants.APA168_CODE_0.equals(af31Dto.getApa168())){
			af31Dto.setApa168(AuditConstants.APA168_CODE_1);//设置已移交状态
		}
		
		af31Dto = this.getAdminDisposalBS().updateAf31(af31Dto);
		
		return returnVO;
	}

	public Map<String, Object> queryTurnBeAuditByAaz318(Page page,TurnMessageVO returnVO) {
		
		Page result = this.getAdminDisposalBS().queryTranTurn(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			AuditPersonDTO audDto = (AuditPersonDTO) result.getResult().get(i);
			
			if(audDto.getAbb087() != 0){
				
				String str = String.valueOf(audDto.getAbb087());
				
				Date abb087s = DateTools.parseDate(str, "yyyyMMdd");
				
				audDto.setAbb087s(abb087s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
}
