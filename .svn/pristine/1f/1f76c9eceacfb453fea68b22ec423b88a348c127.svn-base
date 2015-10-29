package com.wondersgroup.local.k2.f10204003.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.f10204003.bs.F10204003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10204003.vo.Kc62VO;
import com.wondersgroup.local.k2.f10204003.vo.F10204003VO;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.local.k2.f10204003.vs.F10204003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10204003VSImpl implements F10204003VS {

	private F10204003BS f10204003BS;
	
	public F10204003BS getF10204003BS() {
		return f10204003BS;
	}

	public void setF10204003BS(F10204003BS f10204003bs) {
		f10204003BS = f10204003bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10204003VO f10204001vo) {

		if (f10204001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10204001vo, queryDto);

		Page result = this.getF10204003BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public List<GatherVO> searchWithHospital(String akb020) {
		
		List<GatherVO> result = this.getF10204003BS().queryWithHospital(akb020);
		return result;
	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10204003VO f10204003vo) {
		if (f10204003vo.getIds() == null) {
			throw new BusinessException("F10204003VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10204003vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10204003vo, queryDto);
		
		queryDto.setBaz001(strid);
		
		Page result = this.getF10204003BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
}
