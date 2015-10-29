package com.wondersgroup.bc.k3.f10301016.bs.impl;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af37;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.k3.f10301016.bs.F10301016BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke04;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke04DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301016BSImpl implements F10301016BS{

	public Page queryAf37WithPage(Page page, Af37DTO af37dto) {
		
		StringBuffer sql = new StringBuffer("select * from af37 a where 1 = 1 ");
		
		if (StringTools.hasText(af37dto.getApe711Start())) {
			
			sql.append(" and a.ape712 >= '" + af37dto.getApe711Start() + "'");
		}
		if (StringTools.hasText(af37dto.getApe711End())) {
			
			sql.append(" and a.ape712 <= '" + af37dto.getApe711End() + "'");
		}
		if (StringTools.hasText(af37dto.getApa065())) {
			
			sql.append(" and a.apa065 = '" + af37dto.getApa065() + "'");
		}
		Page result = CommonJdbcDaoUtils.queryWithPage(page, sql.toString(), Af37.class);
		
		return result;
	}

	/**
	 * 保存笔录询问
	 */
	public Af37DTO save(Af37DTO af37dto) {
		if (af37dto == null) {
			throw new BusinessException("F10301016BSImpl-01:传入对象为空");
		}
		
		Af37 af37 = new Af37();
		
		BeanTools.copyProperties(af37dto, af37);
		
		CommonHibernateDaoUtils.save(af37);
		
		BeanTools.copyProperties(af37, af37dto);
		
		return af37dto;
	}

	public Af37DTO loadAf37ById(Af37DTO af37dto) {
		
		Af37 af37 = new Af37();
		
		BeanTools.copyProperties(af37dto, af37);
		
		af37 = CommonHibernateDaoUtils.load(Af37.class, af37.getAaz381());
		
		BeanTools.copyProperties(af37, af37dto);
		
		return af37dto;
	}

	public Af37DTO updateAf37(Af37DTO af37dto) {
		
		Af37 af37 = new Af37();
		
		BeanTools.copyProperties(af37dto, af37);
		
		CommonHibernateDaoUtils.update(af37);
		
		return af37dto;
	}
	

	public void deleteInquryByIds(String ids) {
		String sql = "delete from af37 a where a.aaz381 in (" + ids + ")";
		CommonJdbcDaoUtils.delete(sql);
	}

	public Map<String, Object> queryAf37WithMap(Long aaz381) {
		String sql = "select a.*,b.aaa103 as aac004 from af37 a , aa10 b where a.aac004 = b.aaa102 and b.aaa100 = 'AAC004' and a.aaz381 = ? ";
		return CommonJdbcDaoUtils.queryForMap(sql, aaz381);
	}

	/**
	 * 保存附件信息
	 */
	public Ke04DTO saveKe04(Ke04DTO Ke04Dto) {
		Ke04 ke04 = new Ke04();
		BeanTools.copyPropertiesIgnoreNull(Ke04Dto, ke04);
		String baz010 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BAZ010");
		ke04.setBaz010(baz010);
		StringBuffer sql = new StringBuffer(
				" insert into ke04(baz010, aaz381, baz035, baz036, baz037, baz038, baz039)");

		if (StringTools.hasText(ke04.getBaz010())) {
			sql.append("values('" + ke04.getBaz010() + "', '" + ke04.getAaz381() + "', '" + ke04.getBaz035() + "', '"
					+ ke04.getBaz036() + "', '" + ke04.getBaz037() + "', '"
					+ ke04.getBaz038() + "', " + "sysdate" + ")");
		}
		CommonJdbcDaoUtils.insert(sql.toString());
		BeanTools.copyProperties(ke04, Ke04Dto);
		return Ke04Dto;
	}

	public Ke04 queryKe04ByAaz381(Long aaz381) {
		
		String sql = "select * from ke04 a where a.aaz381 = " + aaz381 ;
		
		Ke04 ke04 = CommonJdbcDaoUtils.get(sql, Ke04.class);
		
		return ke04;
	}

	public void deleteKe04ByAaz381(Long aaz381) {
		
		String sql = "delete ke04 a where a.aaz381 = " + aaz381 ;
		
		CommonJdbcDaoUtils.delete(sql);
	}

	public Ke04DTO getKe04ById(Long aaz381) {
		
		Ke04DTO ke04 = CommonJdbcDaoUtils.get(
				
				"select * from ke04 where aaz381=?", Ke04DTO.class, aaz381);
		
		return ke04;
	}

	public Aa10DTO getAA10ByAaa102(String aaa027) {
		
		StringBuffer sql = new StringBuffer("select * from aa10 a where a.aaa100 = 'AAA027' and a.aaa102 = ?");
		
		return CommonJdbcDaoUtils.getFirst(sql.toString(), Aa10DTO.class, aaa027);
	}

	public Af37DTO getMaxAbe177() {
		StringBuffer sql = new StringBuffer("SELECT max(substr(nvl(a.abe177,'0000000'),-7,7)) as abe177 from af37 a");
		return CommonJdbcDaoUtils.getFirst(sql.toString(), Af37DTO.class);
	}

}
