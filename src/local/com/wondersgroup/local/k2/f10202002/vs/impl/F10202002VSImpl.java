package com.wondersgroup.local.k2.f10202002.vs.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CountDTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.bs.MedAuditBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k2.f10202002.vo.F10202002VO;
import com.wondersgroup.local.k2.f10202002.vs.F10202002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;

public class F10202002VSImpl implements F10202002VS {
	private MedAuditBS medAuditBS;

	public MedAuditBS getMedAuditBS() {
		return medAuditBS;
	}

	public void setMedAuditBS(MedAuditBS medAuditBS) {
		this.medAuditBS = medAuditBS;
	}

	public List<Map<String,Object>> getF10202002Chart(F10202002VO f10202002vo) {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<CountDTO> result = this.getMedAuditBS().getF10202002Chart(f10202002vo);
		for(CountDTO d : result){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", d.getLabel());
			map.put("y", d.getValue());
			map.put("code", d.getSum_text());
			list.add(map);
		}
		return list;
	}

	public Object queryF10202002Rules(Page page, F10202002VO f10202002vo) {
		page = this.getMedAuditBS().queryF10202002Rules(page, f10202002vo);
		return GridUtils.getGridData(page);
	}

	public Map<String, Object> queryF10202002Detail(Page page, F10202002VO f10202002vo) {
		if (f10202002vo == null) {
			throw new BusinessException(
					"F10201002VS-01:分页查询违规单据明细统计信息传入medDocumentVO为空!");
		}

		//Kc62DTO queryDto = new Kc62DTO();

		//BeanTools.copyProperties(f10202002vo, queryDto);

		Page result = this.getMedAuditBS().queryF10202002Detail(page, f10202002vo);

		return GridUtils.getGridData(result);
	}

	public List<F10202002VO> queryKc62ByBaz001(F10202002VO resultVO) {
		if (resultVO == null) {
			throw new BusinessException(
					"F10201002VS-08:查询单据明细违规信息传入medDocumentVO为空!");
		}
		
		List<F10202002VO> result = this.getMedAuditBS().queryKc62(resultVO);
		return result;
	}



	
}
