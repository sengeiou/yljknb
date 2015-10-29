package com.wondersgroup.local.k5.f10507002.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k5.f10507002.bs.F10507002BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203002.vo.Kc62VO;
import com.wondersgroup.local.k5.f10507002.vo.F10507002VO;
import com.wondersgroup.local.k5.f10507002.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10507002.vs.F10507002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10507002VSImpl implements F10507002VS {

	private F10507002BS f10507002BS;


	public F10507002BS getF10507002BS() {
		return f10507002BS;
	}


	public void setF10507002BS(F10507002BS f10507002bs) {
		f10507002BS = f10507002bs;
	}



	public Map<String, Object> queryMedDocument(Page page,F10507002VO f10507002vo) {
		if (f10507002vo == null) {
			throw new BusinessException(
					"F10507002VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10507002vo, queryDto);

		Page result = this.getF10507002BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	
	public Map<String, Object> querySuspectedDocumentDetail(Page page,
			String ids) {
		if ("".equals(ids)) {
			throw new BusinessException("F10506003VS-02:分页查询传入ids为空!");
		}
		String strid = "";
		String[] id =ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				strid += "'" + id[i] + "'";
			} else {
				strid += "'" + id[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();

		queryDto.setBaz001(strid);

		Page result = this.getF10507002BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	
	public F10507002VO querySusDocumentDetailIllegal(
			F10507002VO f10507002VO) {
		if (f10507002VO == null) {
			throw new BusinessException(
					"F10203002VS-02:查询单据明细违规信息传入medDocumentVO为空!");
		}

		Kc63DTO kc63Dto = this.getF10507002BS().getKc63ById(
				f10507002VO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10203002VS-03:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10507002VO, queryDto);

		List<Kc72DTO> kc72List = this.getF10507002BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, f10507002VO);

		f10507002VO.setKc72List(kc72List);

		return f10507002VO;
	}


	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		if (hosDetailVO == null) {
			throw new BusinessException(
					"F10507002VS-01:hosDetailVO为空!");
		}
		List<HosDetailVO> list = this.getF10507002BS().queryMedDocumentByHos(hosDetailVO);
		return list;
	}

	

}
