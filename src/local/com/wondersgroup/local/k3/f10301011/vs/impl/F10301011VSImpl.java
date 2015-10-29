package com.wondersgroup.local.k3.f10301011.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.bc.k3.f10301011.bs.F10301011BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301011.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301011.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301011.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301011.vs.F10301011VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301011VSImpl implements F10301011VS {

	private F10301011BS f10301011BS;
	private AdminDisposalBS f10301007BS;

	public F10301011BS getF10301011BS() {
		return f10301011BS;
	}

	public void setF10301011BS(F10301011BS f10301011bs) {
		f10301011BS = f10301011bs;
	}

	public AdminDisposalBS getF10301007BS() {
		return f10301007BS;
	}

	public void setF10301007BS(AdminDisposalBS f10301007bs) {
		f10301007BS = f10301007bs;
	}

	public Map<String, Object> queryRecheck(Page page,
			QueryRecheckVO queryRecheckVO) {

		if (queryRecheckVO == null) {

			throw new BusinessException(
					"F10301011VS-00:分页查询复审信息传入queryRecheckVO为空!");

		}

		CaseInfoDTO queryDto = new CaseInfoDTO();

		BeanTools.copyProperties(queryRecheckVO, queryDto);

		Page result = this.getF10301011BS().queryRecheckDetail(page, queryDto);

		for (int i = 0; i < result.getResult().size(); i++) {
			CaseInfoDTO af53Dto = (CaseInfoDTO) result.getResult().get(i);
			// 登记时间
			/*
			 * if(af53Dto.getApe711()!=null && af53Dto.getApe711()!=0){ Date
			 * ape711s = DateTools.parseDate(
			 * String.valueOf(af53Dto.getApe711()), "yyyyMMdd");
			 * af53Dto.setApe711s(ape711s); }
			 */
			// 接案时间
			if (af53Dto.getAae034() != null && af53Dto.getAae034() != 0) {
				Date aae034s = DateTools.parseDate(
						String.valueOf(af53Dto.getAae034()), "yyyyMMdd");
				af53Dto.setAae034s(aae034s);
			}
			// 结案时间
			if (af53Dto.getAbb025() != null && af53Dto.getAbb025() != 0) {
				Date abb025s = DateTools.parseDate(
						String.valueOf(af53Dto.getAbb025()), "yyyyMMdd");
				af53Dto.setAbb025s(abb025s);
			}
			// 要求完成时间
			if (af53Dto.getApa047() != null && af53Dto.getApa047() != 0) {
				Date apa047s = DateTools.parseDate(
						String.valueOf(af53Dto.getApa047()), "yyyyMMdd");
				af53Dto.setApa047s(apa047s);
			}
			// 实际完成时间
			if (af53Dto.getApe703() != null && af53Dto.getApe703() != 0) {
				Date ape703s = DateTools.parseDate(
						String.valueOf(af53Dto.getApe703()), "yyyyMMdd");
				af53Dto.setApe703s(ape703s);
			}
		}

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryRegister(Page page,
			QueryRegisterVO queryRegisterVO) {
		if (queryRegisterVO == null) {
			throw new BusinessException(
					"F10301011VS-01:分页查询复审登陆信息表queryRegisterVO为空!");
		}

		Af32DTO queryDto = new Af32DTO();

		BeanTools.copyProperties(queryRegisterVO, queryDto);

		Page result = this.getF10301011BS().queryRegisterDetail(page, queryDto);

		for (int i = 0; i < result.getResult().size(); i++) {
			Af32DTO af32Dto = (Af32DTO) result.getResult().get(i);

			// 案件受理日期
			if (af32Dto.getApe711() != null && af32Dto.getApe711() != 0) {
				Date ape711s = DateTools.parseDate(
						String.valueOf(af32Dto.getApe711()), "yyyyMMdd");
				af32Dto.setApe711s(ape711s);
			}
			// 现场稽核日期
			/*
			 * if(af32Dto.getApe716()!=null && af32Dto.getApe716()!=0){ Date
			 * ape716s = DateTools.parseDate(
			 * String.valueOf(af32Dto.getApe716()), "yyyyMMdd");
			 * af32Dto.setApe716s(ape716s); }
			 */
		}
		return GridUtils.getGridData(result);
	}

	public AuditConclusionVO StateCheck(AuditConclusionVO returnVO) {

		Af31DTO af31Dto = this.getF10301007BS().getAf31ById(
				returnVO.getAaz077());
		af31Dto.setApa011(returnVO.getApa011());
		if (AuditConstants.APA011_CODE_0.equals(returnVO.getApa011())) {
			String aaz318 = String.valueOf(returnVO.getAaz318());
			Af53DTO af53Dto = this.getF10301007BS().getAf53ById(aaz318);
			af53Dto.setAae426(AuditConstants.AAE426_CODE_3);
			this.getF10301007BS().updateAf53(af53Dto);
		}
		this.getF10301007BS().updateAf31(af31Dto);

		return returnVO;

	}

	public List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if (approvalVo.getAaz318() == null || approvalVo.getAaz318() == 0) {
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}
		return this.getF10301011BS().queryApprovalData(approvalVo);
	}

	public QueryApprovalVo operateApproval(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if (approvalVo.getAaz318() == null || approvalVo.getAaz318() == 0) {
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}

		UserContext userContext = BusinessContextUtils.getUserContext();
		String ailmen = userContext.getOperatorName();
		approvalVo.setAilmen(ailmen);
		approvalVo.setAiltime(new Date());
		ApprovalClassList acl = this.getF10301011BS().qryMaxApprovalId();
		if (approvalVo.getAclid().equals( acl.getAclid())) {
			Af31DTO af31Dto = this.getF10301007BS().getAf31ById(
					approvalVo.getAaz077());
			String apa011 = null;
			if ("是".equals(approvalVo.getAiltg())) {
				apa011 = "1";
			} else if ("否".equals(approvalVo.getAiltg())) {
				apa011 = "0";
			}
			af31Dto.setApa011(apa011);
			if (AuditConstants.APA011_CODE_1.equals(apa011)) {
				String aaz318 = String.valueOf(approvalVo.getAaz318());
				Af53DTO af53Dto = this.getF10301007BS().getAf53ById(aaz318);
				af53Dto.setAae426(AuditConstants.AAE426_CODE_10);
				this.getF10301007BS().updateAf53(af53Dto);
			}else if (AuditConstants.APA011_CODE_0.equals(apa011)) {
				
				String aaz318 = String.valueOf(approvalVo.getAaz318());
				
				List<Af31> af31s = this.getF10301011BS().getAf31ById(aaz318);
				
				for (Af31 af31 : af31s) {
					
					Af31 af31F = new Af31();
					
					BeanTools.copyProperties(af31, af31F);
					
					af31F.setJlbz(Integer.getInteger(AuditConstants.JLBZ_CODE_0));
					
					CommonHibernateDaoUtils.update(af31F);
				}
				
				Af53DTO af53dto = this.getF10301007BS().getAf53ById(aaz318);
				af53dto.setAae426(AuditConstants.AAE426_CODE_7);
				this.getF10301007BS().updateAf53(af53dto);
			}
			//this.getF10301007BS().updateAf31(af31Dto);
			approvalVo.setAilspfl(1);
		}
		return this.getF10301011BS().operateApproval(approvalVo);
	}
	
	public Map<String, Object> queryAuditCaseWithPage(Page page ,StateCheckVO stateCheckVO){
		
		stateCheckVO.setAae426(AuditConstants.AAE426_CODE_9);
		
		Page result = this.getF10301011BS().queryAf53ByIds(page, stateCheckVO);
	
		for (int i = 0; i < result.getResult().size(); i++) {
		
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
		
				if(af53Dto.getAbb025() != 0){
			
					String str = String.valueOf(af53Dto.getAbb025());
			
					Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
			
					af53Dto.setAbb025s(abb025s);
		}
		
	}
	
	Map<String, Object> map = GridUtils.getGridData(result);
	
	return map;
	
	}
	
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page,StateCheckVO stateCheckVO){
		
		stateCheckVO.setAae426(AuditConstants.AAE426_CODE_9);
		
		Page result = this.getF10301011BS().queryAf53WithPageInfo(page,stateCheckVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryBeAuditInfo(Page page,AuditConclusionVO returnVO) {
		if(!StringTools.hasText(returnVO.getApa011())){
			returnVO.setApa011(AuditConstants.APA011_CODE_0);
		}
		
		Page result = this.getF10301011BS().queryAf31WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	
}
