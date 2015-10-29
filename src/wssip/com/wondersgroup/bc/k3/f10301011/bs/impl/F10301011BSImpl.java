package com.wondersgroup.bc.k3.f10301011.bs.impl;

import java.util.List;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalInfoList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.bc.k3.f10301011.bs.F10301011BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301011BSImpl implements F10301011BS{
 

	public Page queryRecheckDetail(Page page, CaseInfoDTO af53Dto) {
		
        StringBuffer sql = new StringBuffer(" select * from af53 a where a.aaz318 is not null");
			sql.append(" and aae426 = '14' ");
        //案件编号 	
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%' ");
		}
		/*//案件名称
		if (StringTools.hasText(af53Dto.getApf093())) {
			sql.append(" and a.apf093 like '%" + af53Dto.getApf093() + "%' ");
		}
		//登记时间
		if(af53Dto.getApe711() != null){
			sql.append(" and a.ape711 = '"+af53Dto.getApe711()+"' ");
		}*/
		 
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),CaseInfoDTO.class);
		
		return result;
	}

	public Page queryRegisterDetail(Page page, Af32DTO af32Dto) {
		 StringBuffer sql = new StringBuffer(" select b.* from af53 a, af32 b where a.aaz318=b.aaz318 ");
		       Page result=new Page();
			if (!"".equalsIgnoreCase(af32Dto.getAaz318s())) {
				sql.append(" and b.aaz318 in (" + af32Dto.getAaz318s()+ ")");
				  result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),Af32DTO.class);
			}			
			return result;
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

		List<Af53DTO> af53dtos = CommonJdbcDaoUtils.query(sql.toString(),Af53DTO.class);
		
		return af53dtos;
	}

	public Af53DTO updateAf53(Af53DTO af53Dto) {
		if (af53Dto == null) {
			throw new BusinessException("F10301003BS-02:传入参数af53Dto为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

		BeanTools.copyProperties(af53, af53Dto);

		return af53Dto;
	}

	public Af31DTO saveAf31(Af31DTO af31dto) {
		Af31 af31 =new Af31();
		//String aaz364 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAZ364");
		
		BeanTools.copyPropertiesIgnoreNull(af31dto, af31);
		
	//	af31.setAaz364(aaz364);
		
		CommonHibernateDaoUtils.save(af31);
		
		BeanTools.copyPropertiesIgnoreNull(af31, af31dto);
		
		return af31dto;
	}
	
	public List<QueryApprovalVo> queryApprovalData(QueryApprovalVo approvalVo) {
		// 先查询审批信息表中有没有该条稽核案件id的信息 没有则按审批分类表插入
		Long aaz318 = approvalVo.getAaz318();
		if (aaz318 == null || aaz318 == 0) {
			return null;
		}
		StringBuffer s1 = new StringBuffer(
				"select a.*,b.aclname from APPROVAL_INFO_LIST a,APPROVAL_CLASS_LIST b where a.aclid = b.aclid and a.ailfl = 2 and aaz318 = ");
		s1.append(aaz318) ;
		s1.append(" and (a.ailspfl=0 or (a.ailspfl=1 and a.ailtg is not null))   order by a.ailtime desc,a.ailid asc");
		List<QueryApprovalVo> l1 = CommonJdbcDaoUtils.query(s1.toString(),
				QueryApprovalVo.class);
		return l1;
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

	public ApprovalClassList qryMaxApprovalId() {
		String sql = "select max(aclid) aclid from APPROVAL_CLASS_LIST";
		return CommonJdbcDaoUtils.get(sql, ApprovalClassList.class);
	}
	
	public Page queryAf53ByIds(Page page, Af53DTO af53Dto){
		
		StringBuffer sql = new StringBuffer(
				" select * from af53 a where a.aaz318 is not null ");

		//案件编号
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		//案情描述
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}

		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}
		if (StringTools.hasText(af53Dto.getApa011())) 
			/*{
			sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
					+ af53Dto.getApa011() + "')");
		} else */
		{

			sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
					+ AuditConstants.APA011_CODE_1 + "')");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}
	
	
	public Page queryAf53WithPageInfo(Page page, Af53DTO af53Dto){
		
		StringBuffer sql = new StringBuffer(
				"select * from af53 a where a.aaz318 is not null");

		// 编号abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 = '" + af53Dto.getAbz001() + "'");
		}

		// 案件状态 立案待查 3 已结案4 aae426
		/*if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and (a.aae426 = '" + af53Dto.getAae426()
					+ "' or a.aae426 ='4' ) ");
		}*/
		 if (StringTools.hasText(af53Dto.getAae426())) {
			 sql.append(" and (a.aae426 = '" + af53Dto.getAae426() + "') ");
		 }
		 
			Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
					Af53DTO.class);

			return result;
	}

	public List<Af31> getAf31ById(String aaz318) {
		
		StringBuffer sql = new StringBuffer("select * from af31 a where a.jlbz = 1 and a.aaz318 = " + aaz318);
		
		List<Af31> listAf31 = CommonJdbcDaoUtils.query(sql.toString(), Af31.class);
		
		return listAf31;
	}

	public Page queryAf31WithPage(Page page, Af31DTO af31Dto) {

		StringBuffer sb = null;
		if (StringTools.hasText(af31Dto.getAae426())) {
			sb = new StringBuffer(
					"select * from af31 a where a.aaz077 is not null and jlbz = '1' ");
		}else{
			sb = new StringBuffer(
					"select * from af31 a where a.aaz077 is not null and jlbz = '1' ");
		}

		if (af31Dto.getAaz318() != null) {
			sb.append(" and a.aaz318 = " + af31Dto.getAaz318());
		}

		/*if (StringTools.hasText(af31Dto.getApa011())) {
			sb.append(" and a.apa011 = '" + af31Dto.getApa011() + "'");
		}*/

		sb.append(" order by a.aaz077");

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sb.toString(),
				Af31.class);

		return result;

	}

}
