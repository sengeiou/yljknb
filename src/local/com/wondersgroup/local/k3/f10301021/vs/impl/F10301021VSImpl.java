package com.wondersgroup.local.k3.f10301021.vs.impl;

import java.util.Date;
import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301021.bs.F10301021BS;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301021.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301021.vs.F10301021VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10301021VSImpl implements F10301021VS{
	
	private F10301021BS f10301021bs;
	
	public F10301021BS getF10301021bs() {
		return f10301021bs;
	}

	public void setF10301021bs(F10301021BS f10301021bs) {
		this.f10301021bs = f10301021bs;
	}

	public List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if (approvalVo.getAaz318() == null || approvalVo.getAaz318() == 0) {
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}
		return this.getF10301021bs().queryApprovalData(approvalVo);
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
		ApprovalClassList acl = this.getF10301021bs().qryMaxApprovalId();
		if (approvalVo.getAclid().equals( acl.getAclid())) {
			Af31DTO af31Dto = this.getF10301021bs().getAf31ByAaz077(approvalVo.getAaz077());
			String apa011 = null;
			if ("是".equals(approvalVo.getAiltg())) {
				apa011 = "1";
			} else if ("否".equals(approvalVo.getAiltg())) {
				apa011 = "0";
			}
			af31Dto.setApa011(apa011);
			if (AuditConstants.APA011_CODE_1.equals(apa011)) {
				String aaz318 = String.valueOf(approvalVo.getAaz318());
				Af53DTO af53Dto = this.getF10301021bs().getAf53ByAaz318(aaz318);
				af53Dto.setAae426(AuditConstants.AAE426_CODE_10);
				this.getF10301021bs().updateAf53(af53Dto);
			}else if (AuditConstants.APA011_CODE_0.equals(apa011)) {
				
				String aaz318 = String.valueOf(approvalVo.getAaz318());
				
				List<Af31> af31s = this.getF10301021bs().getAf31ById(aaz318);
				
				for (Af31 af31 : af31s) {
					
					Af31 af31F = new Af31();
					
					BeanTools.copyProperties(af31, af31F);
					
					af31F.setJlbz(Integer.getInteger(AuditConstants.JLBZ_CODE_0));
					
					CommonHibernateDaoUtils.update(af31F);
				}
				
				Af53DTO af53dto = this.getF10301021bs().getAf53ByAaz318(aaz318);
				af53dto.setAae426(AuditConstants.AAE426_CODE_7);
				this.getF10301021bs().updateAf53(af53dto);
			}
			//this.getF10301007BS().updateAf31(af31Dto);
			approvalVo.setAilspfl(1);
		}else if ("否".equals(approvalVo.getAiltg())) {
			
			String aaz318 = String.valueOf(approvalVo.getAaz318());
			
			List<Af31> af31s = this.getF10301021bs().getAf31ById(aaz318);
			
			for (Af31 af31 : af31s) {
				
				Af31 af31F = new Af31();
				
				BeanTools.copyProperties(af31, af31F);
				
				af31F.setJlbz(Integer.getInteger(AuditConstants.JLBZ_CODE_0));
				
				CommonHibernateDaoUtils.update(af31F);
			}
			
			Af53DTO af53dto = this.getF10301021bs().getAf53ByAaz318(aaz318);
			af53dto.setAae426(AuditConstants.AAE426_CODE_7);
			this.getF10301021bs().updateAf53(af53dto);
		}
		return this.getF10301021bs().operateApproval(approvalVo);
	}
}
