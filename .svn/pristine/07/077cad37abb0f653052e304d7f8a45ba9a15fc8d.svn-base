package com.wondersgroup.local.k5.f10504003.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k5.f10504003.bs.F10504003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10504003.vo.MedDocumentVO;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10504003.vs.F10504003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10504003VSImpl implements F10504003VS {

	private F10504003BS f10504003BS;

	public F10504003BS getF10504003BS() {
		return f10504003BS;
	}

	public void setF10504003BS(F10504003BS f10504003bs) {
		f10504003BS = f10504003bs;
	}

	public Map<String, Object> queryCompainDocument(Page page,
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10504003VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getF10504003BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	/**
	 * 
	 * @Description:分页查询违规单据明细统计信息(kc62)
	 * @date 2015-1-5 下午02:09:12
	 */
	public Map<String, Object> querySuspectedDocumentDetail(Page page,
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO.getIds() == null) {
			throw new BusinessException("F10201006VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = medDocumentVO.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62DTO kc62Dto = new Kc62DTO();

		BeanTools.copyProperties(medDocumentVO, kc62Dto);

		kc62Dto.setBaz001(strid);

		Page result = this.getF10504003BS().queryKc62WithPage(page, kc62Dto);

		return GridUtils.getGridData(result);
	}

	public List<QueryNumberVO> queryNumber(String akb020orakb021) {
		// 要查询的医院编号
		// String yybh =
		// "'42491010400','42500377601','42501272800','42501272801','42508443000'";
		List<QueryNumberVO> result = this.getF10504003BS().getQueryNumberVO(
				akb020orakb021);
		return result;
	}

}
