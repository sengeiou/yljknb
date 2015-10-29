package com.wondersgroup.local.k5.f10506003.vs.impl;

import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.k5.f10506003.bs.F10506003BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10203002.vo.Kc62VO;
import com.wondersgroup.local.k5.f10506003.vo.MedDocumentVO;
import com.wondersgroup.local.k5.f10506003.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10506003.vs.F10506003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10506003VSImpl implements F10506003VS {

	private F10506003BS f10506003BS;

	public F10506003BS getF10506003BS() {
		return f10506003BS;
	}

	public void setF10506003BS(F10506003BS f10506003bs) {
		f10506003BS = f10506003bs;
	}

	public Map<String, Object> queryCompainDocument(Page page,
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10506003VS-00:分页查询违规单据统计信息传入medDocumentVO为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		Page result = this.getF10506003BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public List<QueryNumberVO> queryNumber(String akb020orakb021) {
		//要查询的医院编号
//    	String yybh = "'42491010400','42500377601','42501272800','42501272801','42508443000'";
    	List<QueryNumberVO> result = this.getF10506003BS().getQueryNumberVO(akb020orakb021);
		return result;
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

		Page result = this.getF10506003BS().queryKc62sWithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}
	
	public MedDocumentVO querySusDocumentDetailIllegal(
			MedDocumentVO medDocumentVO) {
		if (medDocumentVO == null) {
			throw new BusinessException(
					"F10203002VS-02:查询单据明细违规信息传入medDocumentVO为空!");
		}

		Kc63DTO kc63Dto = this.getF10506003BS().getKc63ById(
				medDocumentVO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10203002VS-03:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(medDocumentVO, queryDto);

		List<Kc72DTO> kc72List = this.getF10506003BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, medDocumentVO);

		medDocumentVO.setKc72List(kc72List);

		return medDocumentVO;
	}
	
	

}
