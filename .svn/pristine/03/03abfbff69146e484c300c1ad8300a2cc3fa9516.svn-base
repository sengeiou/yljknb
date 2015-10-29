package com.wondersgroup.bc.k3.f10301021.bs.impl;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301021.bs.F10301021BS;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k3.f10301021.vo.QueryApprovalVo;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10301021BSImpl implements F10301021BS{

	public List<QueryApprovalVo> queryApprovalData(QueryApprovalVo approvalVo) {
		// 先查询审批信息表中有没有该条稽核案件id的信息 没有则按审批分类表插入
		Long aaz318 = approvalVo.getAaz318();
		if (aaz318 == null || aaz318 == 0) {
			return null;
		}
		StringBuffer s1 = new StringBuffer(
				"select a.*,b.aclname from APPROVAL_INFO_LIST a,APPROVAL_CLASS_LIST b where a.aclid = b.aclid and a.ailfl = 2 and aaz318 = ");
		s1.append(aaz318) ;
		s1.append(" and a.aclid in (1, 2) ");
		s1.append(" and (a.ailspfl=0 or (a.ailspfl=1 and a.ailtg is not null))   order by a.ailtime desc,a.ailid asc");
		List<QueryApprovalVo> l1 = CommonJdbcDaoUtils.query(s1.toString(),
				QueryApprovalVo.class);
		
		/*for (QueryApprovalVo queryApprovalVo : l1) {
			if (1 == queryApprovalVo.getAclid() && "未审批".equals(queryApprovalVo.getAilzt())) {
				throw new BusinessException("一级未审批");
			}
		}*/
		return l1;
	}
	
	public ApprovalClassList qryMaxApprovalId() {
		String sql = "select max(aclid) aclid from APPROVAL_CLASS_LIST";
		return CommonJdbcDaoUtils.get(sql, ApprovalClassList.class);
	}
	
	public Af31DTO getAf31ByAaz077(String aaz077) {

		Af31DTO af31Dto = new Af31DTO();

		Af31 af31 = CommonHibernateDaoUtils.load(Af31.class, aaz077);

		if (af31 != null) {
			BeanTools.copyProperties(af31, af31Dto);
		}

		return af31Dto;
	}
	
	public Af53DTO getAf53ByAaz318(String aaz318) {

		Af53DTO af53Dto = new Af53DTO();

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				Long.parseLong(aaz318));

		if (af53 != null) {
			BeanTools.copyProperties(af53, af53Dto);
		}

		return af53Dto;
	}
	
	public void updateAf53(Af53DTO af53Dto) {

		if (af53Dto == null) {
			throw new BusinessException("AdminDisposalBS-20:传入参数af53Dto为空!");
		}

		if (af53Dto.getAaz318() == null) {
			throw new BusinessException("AdminDisposalBS-21:传入参数af53Dto 主键为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

		BeanTools.copyProperties(af53, af53Dto);

		if (AuditConstants.AAE426_CODE_4.equals(af53Dto.getAae426())) {
			String s2 = "select * from APPROVAL_CLASS_LIST";
			List<ApprovalClassList> l2 = CommonJdbcDaoUtils.query(s2,
					ApprovalClassList.class);
			for (ApprovalClassList acl : l2) {
				ApprovalInfoList ail = new ApprovalInfoList();
				ail.setAclid(acl.getAclid());
				ail.setAilzt("未审批");
				ail.setAaz318(af53Dto.getAaz318());
				ail.setAilfl(2);
				ail.setAilspfl(0);
				CommonHibernateDaoUtils.save(ail);
			}
		} else if (AuditConstants.AAE426_CODE_6.equals(af53Dto.getAae426())) {
			String s2 = "select * from APPROVAL_CLASS_LIST";
			List<ApprovalClassList> l2 = CommonJdbcDaoUtils.query(s2,
					ApprovalClassList.class);
			for (ApprovalClassList acl : l2) {
				ApprovalInfoList ail = new ApprovalInfoList();
				ail.setAclid(acl.getAclid());
				ail.setAilzt("未审批");
				ail.setAaz318(af53Dto.getAaz318());
				ail.setAilfl(1);
				ail.setAilspfl(0);
				CommonHibernateDaoUtils.save(ail);
			}
		}
	}
	
	public List<Af31> getAf31ById(String aaz318) {
		
		StringBuffer sql = new StringBuffer("select * from af31 a where a.jlbz = 1 and a.aaz318 = " + aaz318);
		
		List<Af31> listAf31 = CommonJdbcDaoUtils.query(sql.toString(), Af31.class);
		
		return listAf31;
	}
	
	public QueryApprovalVo operateApproval(QueryApprovalVo approvalVo) {
		String sql = "select * from APPROVAL_INFO_LIST where aclid = "
				+ approvalVo.getAclid() + " and ailfl = 2 and aaz318 = "
				+ approvalVo.getAaz318()+" and ailid="+approvalVo.getAilid();
		ApprovalInfoList a = CommonJdbcDaoUtils
				.get(sql, ApprovalInfoList.class);
		BeanTools.copyPropertiesIgnoreNull(approvalVo, a);
		CommonHibernateDaoUtils.update(a);
		if (approvalVo.getAilspfl()!=null) {
			if(approvalVo.getAilspfl()==1){
				CommonJdbcDaoUtils.update("update APPROVAL_INFO_LIST set ailspfl=1 where aaz318="+ approvalVo.getAaz318()+" and ailfl=2 and ailspfl=0 and aclid<>"+ approvalVo.getAclid());
			}
		}
		BeanTools.copyProperties(a, approvalVo);
		return approvalVo;
	}
}
