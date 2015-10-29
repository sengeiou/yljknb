package com.wondersgroup.bc.k3.f10301014.bs.impl;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301014.bs.F10301014BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301014BSImpl implements F10301014BS{
	
	public Page queryAuditCaseDetailsWithPage(Page page, Af53DTO af53Dto) {

//		StringBuffer sql = new StringBuffer("select * from af53 a where a.aaz318 in" +
//				" (select b.aaz318 from af31 b where b.apa168='1' or b.aae425 = '2')");
		
		StringBuffer sql = new StringBuffer("select a.* from af53 a where a.aae426 = '10' and a.aae425 = '2' ");

		// 立案日期 aae034;
		if (af53Dto.getAae034() != null) {
			// String str = DateUtils.format(af53Dto.getAae036(), "yyyyMMdd");
			sql.append(" and a.aae034 = '" + af53Dto.getAae034() + "'");
		}
		// 案件状态 aae426
		if (StringTools.hasText(af53Dto.getAae426())) {
			sql.append(" and a.aae426 = '" + af53Dto.getAae426() + "'");
		}
		// 案件来源
		if (StringTools.hasText(af53Dto.getAbb006())) {
			sql.append(" and a.abb006 = '" + af53Dto.getAbb006() + "'");
		}
		// 案件编号 abz001
		if (StringTools.hasText(af53Dto.getAbz001())) {
			sql.append(" and a.abz001 like '%" + af53Dto.getAbz001() + "%'");
		}
		// 案情关键字
		if (StringTools.hasText(af53Dto.getApf094())) {
			sql.append(" and a.apf094 like '%" + af53Dto.getApf094() + "%'");
		}

		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(),
				Af53DTO.class);

		return result;
	}
	
	//根据主键ID查询案件信息
	public Af53DTO getAf53ById(String aaz318){

		Af53DTO af53DTO = new Af53DTO();

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				Long.parseLong(aaz318));

		if (af53 != null) {
			BeanTools.copyProperties(af53, af53DTO);
		}

		return af53DTO;
	}
	
	//修改案件的状态为结案操作
 	public void updateAf53ByIds(String aaz318s){
 		
		if (aaz318s == null) {
			throw new BusinessException(
					"F10301014BS-01:批量修改af53Dto,传入af53Dto的主键为空!");
		}
		String sql = "update af53 a set a.aae426 = '4' where a.aaz318 in (" + aaz318s + ")";
		
		CommonJdbcDaoUtils.update(sql);
		
 	}
	
 	public Af53DTO updateAf53(Af53DTO af53Dto){
		if (af53Dto == null) {
			throw new BusinessException("F10301014BS-02:传入参数af53Dto为空!");
		}

		if (af53Dto.getAaz318() == null) {
			throw new BusinessException("F10301014BS-03:传入参数af53Dto 主键为空!");
		}

		Af53 af53 = CommonHibernateDaoUtils.load(Af53.class,
				af53Dto.getAaz318());

		BeanTools.copyPropertiesIgnoreNull(af53Dto, af53);

		CommonHibernateDaoUtils.update(af53);

		BeanTools.copyProperties(af53, af53Dto);
		
		return af53Dto;
		
 	}

	public void updateAf31ByAf53(Long aaz318) {
		String sql = "update af31 a set a.dcbz='0',jlbz='0',apa168='',aae425='',apa163='',apa011='',apa164='',apa165='',apa763='' where a.aaz318 = ?";
		CommonJdbcDaoUtils.update(sql, aaz318);
	}
	
	

}
