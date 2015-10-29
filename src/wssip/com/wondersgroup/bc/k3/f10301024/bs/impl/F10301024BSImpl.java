package com.wondersgroup.bc.k3.f10301024.bs.impl;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.bc.k3.f10301024.bs.F10301024BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k3.f10301024.vo.QueryApprovalVo;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301024BSImpl implements F10301024BS{

	public Page queryRecheckDetail(Page page, CaseInfoDTO af53Dto) {
		
		StringBuffer sql = new StringBuffer("select * from af53 a where a.aaz318 is not null");
		sql.append(" and a.aae426 = '5' ");
		
		if (af53Dto.getAae034() != null) {
		
			sql.append(" a.aae034 = '" + af53Dto.getAae034() + "'");
		}
		
		// 案件状态 aae426
		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}

		// 案件来源 
		if (StringTools.hasText(af53Dto.getAbb006())) {
			sql.append(" and a.abb006 = '" + af53Dto.getAbb006() + "'");
		}
		//案情关键字apf094
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}

		// 案件编号 abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), CaseInfoDTO.class);

		return result;
		
	}
	
	public List<QueryApprovalVo> queryApproalData(String aaz318) {
		
		if (!StringTools.hasText(aaz318)) {
			
			throw new BusinessException("F10301024BSImpl-01: aaz318 is null");
			
		}
		
		StringBuffer sql1 = new StringBuffer("select * from af53 a where a.aaz318 = '" + aaz318 + "'");
		
		Af53 af53 = CommonJdbcDaoUtils.get(sql1.toString(), Af53.class);
		
		StringBuffer sql = new StringBuffer("select a.*,b.aclname from APPROVAL_INFO_LIST a,APPROVAL_CLASS_LIST b where a.aclid = b.aclid and a.ailfl = 1 and aaz318 = ");
		
		sql.append(aaz318) ;
		
		sql.append(" and a.aclid in (1, 2) ");
		
		sql.append(" and a.aae427 = '" + af53.getAae427() + "'");
		
		sql.append(" and (a.ailspfl=0 or (a.ailspfl=1 and a.ailtg is not null))   order by a.ailtime desc,a.ailid asc");
		
		List<QueryApprovalVo> list = CommonJdbcDaoUtils.query(sql.toString(), QueryApprovalVo.class);
		
		/*for (QueryApprovalVo queryApprovalVo : list) {
			if (1 == queryApprovalVo.getAclid() && "未审批".equals(queryApprovalVo.getAilzt())) {
				throw new BusinessException("一级未审批");
			}
		}*/
		
		return list;
	}

	public ApprovalClassList qryMaxApprovalId() {
		String sql = "select max(aclid) aclid from APPROVAL_CLASS_LIST";
		return CommonJdbcDaoUtils.get(sql, ApprovalClassList.class);
	}
	
	public List<Af53DTO> findCaseID(String ids) {
		String aaz318s = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				aaz318s += "'" + id[i] + "'";
			} else {
				aaz318s += "'" + id[i] + "',";
			}
		}

		String sql = "select * from af53 where aaz318 in ( " + aaz318s + ")";

		List<Af53DTO> af53dtos = CommonJdbcDaoUtils.query(sql.toString(),
				Af53DTO.class);

		return af53dtos;
	}
	
	public void updateAf53(Af53DTO af53Dto) {
		if (af53Dto == null) {
			throw new BusinessException("F10301003BS-02:传入参数af53Dto为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

	}
	
	public QueryApprovalVo operateApproval(QueryApprovalVo approvalVo) {
		String sql = "select * from APPROVAL_INFO_LIST where aclid = "
				+ approvalVo.getAclid() + " and ailfl = 1 and aaz318 = "
				+ approvalVo.getAaz318() +" and ailid="+approvalVo.getAilid();
		ApprovalInfoList a = CommonJdbcDaoUtils
				.get(sql, ApprovalInfoList.class);
		BeanTools.copyPropertiesIgnoreNull(approvalVo, a);
		CommonHibernateDaoUtils.update(a);
		if (approvalVo.getAilspfl()!=null) {
			if(approvalVo.getAilspfl()==1){
				CommonJdbcDaoUtils.update("update APPROVAL_INFO_LIST set ailspfl=1 where aaz318="+ approvalVo.getAaz318()+" and ailfl=1 and ailspfl=0 and aclid<>"+ approvalVo.getAclid());
			}
		}
		BeanTools.copyProperties(a, approvalVo);
		return approvalVo;
	}

	public void jumpOut(String aaz318) {
		
		StringBuffer sql = new StringBuffer("update af53 a set a.aae426 = 7 where a.aaz318 = '" + aaz318 + "'");
		
		CommonJdbcDaoUtils.update(sql.toString());
	}

}
