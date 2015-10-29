package com.wondersgroup.local.k2.f10203003.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k2.f10203003.bs.F10203003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203001.vo.Kc62VO;
import com.wondersgroup.local.k2.f10203003.vo.F10203003VO;
import com.wondersgroup.local.k2.f10203003.vo.HosDetailVO;
import com.wondersgroup.local.k2.f10203003.vs.F10203003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10203003VSImpl implements F10203003VS {

	private F10203003BS f10203003BS;


	public F10203003BS getF10203003BS() {
		return f10203003BS;
	}


	public void setF10203003BS(F10203003BS f10203003bs) {
		f10203003BS = f10203003bs;
	}



	public Map<String, Object> queryMedDocument(Page page,F10203003VO f10203003vo) {
		if (f10203003vo == null) {
			throw new BusinessException(
					"F10203003VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10203003vo, queryDto);

		Page result = this.getF10203003BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}


	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		if (hosDetailVO == null) {
			throw new BusinessException(
					"F10203003VS-01:hosDetailVO为空!");
		}
		List<HosDetailVO> list = this.getF10203003BS().queryMedDocumentByHos(hosDetailVO);
		return list;
	}


	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10203003VO f10203003vo) {
		if (f10203003vo.getIds() == null) {
			throw new BusinessException("F10203001VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10203003vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();
		
		BeanTools.copyProperties(f10203003vo, queryDto);
		
		queryDto.setBaz001(strid);
		
		Page result = this.getF10203003BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	

}
