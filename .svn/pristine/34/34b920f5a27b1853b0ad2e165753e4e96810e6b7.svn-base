package com.wondersgroup.bc.k3.f10301007.bs.impl;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301007.bs.F10301007BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301007BSImpl implements F10301007BS{
	
	public Page queryAf53WithPage(Page page, Af53DTO af53Dto){
		
		StringBuffer sql = new StringBuffer("select * from af53 a where a.aaz318 is not null");
		// 编号abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 = '" + af53Dto.getAbz001() + "'");
		}

		 if (StringTools.hasText(af53Dto.getAae426())) {
			 sql.append(" and (a.aae426 = '" + af53Dto.getAae426() + "') ");
		 }
		
		//sql.append(" order by a.aaz318");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
		
	}
	
	public Af53DTO updateAf53(Af53DTO af53Dto){
		if (af53Dto == null) {
			throw new BusinessException("F10301007BS-01:传入参数af53Dto为空!");
		}

		if (af53Dto.getAaz318() == null) {
			throw new BusinessException("F10301007BS-02:传入参数af53Dto 主键为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

		BeanTools.copyProperties(af53, af53Dto);
		
		return af53Dto;
		
	}

	/**
	 * 确认待审批
	 */
	public Af53DTO confirmToSurvey(Af53DTO af53dto) {
		
		Af53 af53 = new Af53();
		
		af53 = CommonHibernateDaoUtils.load(Af53.class, af53dto.getAaz318());
		
		String sql = "update af31 a set a.apa011 = 1, a.aae425 = '0' where a.jlbz = 1 and a.aaz318 = " + af53dto.getAaz318();
		
		//String sql2 = "from Af31 a where a.aaz318 = ? and a.jlbz = '1'";
		
		
		CommonJdbcDaoUtils.update(sql);
		
		//List<Af31> af31b = CommonHibernateDaoUtils.find(sql2, af53dto.getAaz318());
		
		/*int i = af31a.size();
		int j = af31b.size();
		
		if (i != j) {
			
			throw new BusinessException("F10301004BS-SURVEY:请全部结论确认完成再提交案件");
		}*/
		
		af53.setAae426(AuditConstants.AAE426_CODE_9);
		af53.setAae425(AuditConstants.AAE425_CODE_0);
		
		CommonHibernateDaoUtils.update(af53);
		
		BeanTools.copyProperties(af53, af53dto);
		
		String s2 = "select * from APPROVAL_CLASS_LIST";
		
		List<ApprovalClassList> l2 = CommonJdbcDaoUtils.query(s2,
				ApprovalClassList.class);
		for (ApprovalClassList acl : l2) {
			ApprovalInfoList ail = new ApprovalInfoList();
			ail.setAclid(acl.getAclid());
			ail.setAilzt("未审批");
			ail.setAaz318(af53dto.getAaz318());
			ail.setAilfl(2);
			ail.setAilspfl(0);
			CommonHibernateDaoUtils.save(ail);
		}
		
		return af53dto;
	}

	public List<Af31> getAf31ById(String aaz318) {
		
		StringBuffer sql = new StringBuffer("select * from af31 a where a.aaz318 = " + aaz318);
		
		List<Af31> listAf31 = CommonJdbcDaoUtils.query(sql.toString(), Af31.class);
		
		return listAf31;
	}
}
	
	

