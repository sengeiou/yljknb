package com.wondersgroup.bc.k3.f10301006.bs.impl;


import java.util.List;
import java.util.Map;


import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af38;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af39;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af39DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.bc.k3.f10301006.bs.F10301006BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301006BSImpl implements F10301006BS{
	//查询待稽核结论登记的案件
		public Page queryAf53ByIdsNew(Page page , AuditCaseDTO auditCaseDTO){
			StringBuffer sql = new StringBuffer(
					" select * from af53 a where a.aaz318 is not null");
			// 案件状态 
			sql.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_7 + "'");
			//案件编号
		    if (StringTools.hasText(auditCaseDTO.getAbz001())) {
				sql.append(" and a.abz001 like '%" + auditCaseDTO.getAbz001() + "%'");
			}
		    //案情描述
		    if (StringTools.hasText(auditCaseDTO.getApf094())) {
				sql.append(" and a.apf094 like '%" + auditCaseDTO.getApf094() + "%'");
			}
//
//			if (StringTools.hasText(af53Dto.getAae426())) {
//				sql.append(" and a.aae426 = '7'");
//			}
//			if (StringTools.hasText(af53Dto.getApa011())) {
//				sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
//						+ af53Dto.getApa011() + "')");
//			} else {
//
//				sql.append(" and a.aaz318 in (select b.aaz318 from af31 b where b.apa011 = '"
//						+ AuditConstants.APA011_CODE_0 + "')");
//			}

			Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
					AuditCaseDTO.class);

			return result;
		}
		
		
		public Page queryAf53WithPageInfo(Page page, Af53DTO af53Dto){
			StringBuffer sql = new StringBuffer("select * from af53 a where a.aaz318 is not null");
			// 案件状态 调查完成
			sql.append(" and a.aae426 = '" + AuditConstants.AAE426_CODE_7 + "'");
			// 编号abz001
			if (StringTools.hasText(af53Dto.getAbz001())) {
				sql.append(" and a.abz001 = '" + af53Dto.getAbz001() + "'");
			}
			sql.append(" order by a.aaz318");

			Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
					Af53DTO.class);

			return result;
		}

		public Af53DTO updateAf53(Af53DTO af53dto) {
			
			StringBuffer sql = new StringBuffer("select * from af31 a where a.aaz077 is not null and a.jlbz = '1' ");
			
			sql.append(" and a.aaz318 = '" + af53dto.getAaz318() + "'");
			
			sql.append(" order by a.aaz077 ");
			
			List<Af31> list = CommonJdbcDaoUtils.query(sql.toString(), Af31.class);
			
			if (list.size() == 0) {
				throw new BusinessException("F10301006BSImpl-1:至少登记一个结论.");
			}
			
			Af53 af53 = CommonHibernateDaoUtils.load(Af53.class, af53dto.getAaz318());
			
			BeanTools.copyPropertiesIgnoreNull(af53dto, af53);
			
			CommonHibernateDaoUtils.update(af53);
			
			return af53dto;
		}


		public Af38DTO saveAf38(Af38DTO af38dto) {
			String abb001 = CommonHibernateDaoUtils.getSequenceValue("SEQ_ABB001");
			Af38 af38 = new Af38();
			BeanTools.copyPropertiesIgnoreNull(af38dto, af38);
			af38.setAbb001(Long.valueOf(abb001));
			af38dto.setAbb001(Long.valueOf(abb001));
			CommonHibernateDaoUtils.save(af38);
			return af38dto;
		}


		public Af31 getAf31(String aaz077) {
			Af31 af31 = CommonHibernateDaoUtils.load(Af31.class, aaz077);
			return af31;
		}


		public Af31 updateAf31(Af31 af31) {
			CommonHibernateDaoUtils.update(af31);
			return af31;
		}


		public Aa10DTO getAa10ByCode(String aaa027) {
			String sql = "select a.* from aa10 a where a.aaa100 = 'AAA027' and a.aaa102 = ?";
			return CommonJdbcDaoUtils.getFirst(sql, Aa10DTO.class, aaa027);
		}


		public Af39DTO getMaxAaz006() {
			String sql = "SELECT max(substr(nvl(a.aaz006,'0000000'),-7,7)) as aaz006 from af39 a";
			return CommonJdbcDaoUtils.getFirst(sql, Af39DTO.class);
		}


		public Af39DTO saveAf39(Af39DTO af39dto) {
			Af39 af39 = new Af39();
			BeanTools.copyPropertiesIgnoreNull(af39dto, af39);
			String aab077 = CommonHibernateDaoUtils.getSequenceValue("SEQ_AAB077");
			af39.setAab077(Long.valueOf(aab077));
			af39dto.setAab077(Long.valueOf(aab077));
			CommonHibernateDaoUtils.save(af39);
			return af39dto;
		}


		public Map<String, Object> queryAf39WithMap(Long aab077) {
			String sql = "select a.*, b.ape726, (select t1.aaa103 from aa10 t1 where t1.aaa100 = 'APA701' and t1.aaa102 = " +
					"(select t2.apa701 from af31 t2 where t2.aaz077 = (select t3.aaz077 from af39 t3 where t3.aab077 = ?))) as apa701 " +
					"from af39 a, af38 b where a.aaz077 = b.aaz077 and a.aab077 = ? ";
			return CommonJdbcDaoUtils.queryForMap(sql, aab077, aab077);
		}


		public void updateAf31ByAaz318(Long aaz318) {
			String sql = "update af31 a set a.apa011 = '0' where a.jlbz = '1' and a.aaz318 = ?";
			CommonJdbcDaoUtils.update(sql, aaz318);
		}


		public Af39DTO getAf39ByAaz007(String aaz007) {
			String sql = "select a.* from af39 a where a.aaz077 = ?";
			return CommonJdbcDaoUtils.getFirst(sql, Af39DTO.class, aaz007);
		}
		
		

}
