package com.wondersgroup.bc.k3.f10301016.bs;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.bo.Ke04;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke04DTO;
import com.wondersgroup.framework.core.bo.Page;

public interface F10301016BS {
	
	/**
	 * 询问笔录查询
	 * @param page
	 * @param inquiryInputVO
	 * @return
	 */
	Page queryAf37WithPage(Page page, Af37DTO af37DTO);

	/**
	 * 保存询问笔录
	 */
	public Af37DTO save(Af37DTO af37DTO);

	/**
	 * 根据ID查找询问笔录
	 * @param af37dto
	 * @return
	 */
	Af37DTO loadAf37ById(Af37DTO af37dto);

	/**
	 * 修改访问笔录
	 * @param af37dto
	 * @return
	 */
	Af37DTO updateAf37(Af37DTO af37dto);

	/**
	 * 根据IDs删除询问笔录
	 * @param ids
	 */
	void deleteInquryByIds(String ids);
	/**
	 * 获取询问笔录导出数据
	 * @param aaz381
	 * @return
	 */
	Map<String, Object> queryAf37WithMap(Long aaz381);

	/**
	 * 稽核附件
	 * @param dto
	 * @return
	 */
	Ke04DTO saveKe04(Ke04DTO dto);

	Ke04 queryKe04ByAaz381(Long aaz381);

	void deleteKe04ByAaz381(Long aaz381);

	Ke04DTO getKe04ById(Long aaz381);

	Aa10DTO getAA10ByAaa102(String aaa027);

	Af37DTO getMaxAbe177();

}
