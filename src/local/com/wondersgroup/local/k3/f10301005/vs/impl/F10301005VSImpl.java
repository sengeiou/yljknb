package com.wondersgroup.local.k3.f10301005.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301005.bs.F10301005BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k3.f10301005.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301005.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301005.vs.F10301005VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301005VSImpl implements F10301005VS{
	
	private AdminDisposalBS adminDisposalBS;
	private F10301005BS f10301005BS;

	public F10301005BS getF10301005BS() {
		return f10301005BS;
	}

	public void setF10301005BS(F10301005BS f10301005bs) {
		f10301005BS = f10301005bs;
	}

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public BeAuditInfoVO desRegister(BeAuditInfoVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301005VS-01:撤销案件的时候 传入案件对象 为空!");
		}
		
		String aaz318 = String.valueOf(returnVO.getAaz318());
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301005VS-02:撤销案件的时候 传入案件 主键 aaz318 为空!");
		}
				
		Af53DTO af53Dto  =this.getAdminDisposalBS().getAf53ById(aaz318);
		
		List<Af31DTO> af31List = this.adminDisposalBS.queryAf31List(returnVO);
		
		//針對af53的驗證   aae426 1立案 待确认 2 不予立案  3 立案待查 4 已结案 5 案件撤销
		if(AuditConstants.AAE426_CODE_1.equals(af53Dto.getAae426())){
			throw new BusinessException("F10301005VS-03:撤销案件的时候 案件 还没有立案  请先立案");
		}
		
		if(AuditConstants.AAE426_CODE_2.equals(af53Dto.getAae426())){
			throw new BusinessException("F10301005VS-04:撤销案件的时候 案件 已被其他管理员 不予立案");
		}
		
		if(AuditConstants.AAE426_CODE_4.equals(af53Dto.getAae426())){
			throw new BusinessException("F10301005VS-05:撤销案件的时候 案件 已被其他管理员 已结案");
		}
		
		if(AuditConstants.AAE426_CODE_5.equals(af53Dto.getAae426())){
			throw new BusinessException("F10301005VS-06:撤销案件的时候 案件 已被其他管理员 aae426 撤销");
		}
		
		//針對 af31的驗證 apa011 0待確認 1確認通過 2調查重審
		
		String operator = BusinessContextUtils.getUserContext().getOperatorName();//获取当前操作人
		
		String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
		
		Integer currentDate = Integer.valueOf(str);//將日期轉換成 Integer類型
		
		//設置af53
		af53Dto.setAae426(AuditConstants.AAE426_CODE_5);
		
		af53Dto.setAbb025(currentDate);
		
		af53Dto = this.adminDisposalBS.updateAf53(af53Dto);
		
		//設置af31
		if(af31List.size() > 0){
			
			for (Af31DTO af31Dto : af31List) {
				
				if(AuditConstants.APA005_CODE_02.equals(af31Dto.getApa005())){
					throw new BusinessException("F10301005VS-07:撤销案件的时候 案件 已被其他管理员   撤销");
				}
				
				af31Dto.setApa005(AuditConstants.APA005_CODE_02);
				
				af31Dto.setApe725(operator);
				
				af31Dto.setApe727(currentDate);
				
				af31Dto.setApa011(AuditConstants.APA011_CODE_1);
				
				af31Dto.setAae012(operator);
				
				af31Dto.setAae034(currentDate);
				
				BeanTools.copyPropertiesIgnoreNull(returnVO, af31Dto);
				
				af31Dto = this.getAdminDisposalBS().updateAf31(af31Dto);
			}
			
		}
		return returnVO;
	}
	
	public Map<String, Object> queryAuditCaseWithPage(Page page ,CaseDetailsVO caseDetailsVO){
		
		Page result = this.getF10301005BS().queryAf53ByIdsNew(page,caseDetailsVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page,CaseDetailsVO caseDetailsVO){
		
		Page result =  this.getF10301005BS().queryAf53WithPageInfo(page,caseDetailsVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAbb025() != 0 && af53Dto.getAae034() != null){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
			
			if(af53Dto.getAae034() != null && af53Dto.getAae034() != 0){
				
				String str = String.valueOf(af53Dto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAae034s(aae034s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
}
