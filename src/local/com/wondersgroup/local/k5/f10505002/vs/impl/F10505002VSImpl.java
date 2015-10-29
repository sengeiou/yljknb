package com.wondersgroup.local.k5.f10505002.vs.impl;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.k5.f10505001.bs.DocAfterBS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10505002.vo.F10505002VO;
import com.wondersgroup.local.k5.f10505002.vs.F10505002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class F10505002VSImpl implements F10505002VS{
	private DocAfterBS docAfterBS;

	public void setDocAfterBS(DocAfterBS docAfterBS) {
		this.docAfterBS = docAfterBS;
	}

	public DocAfterBS getDocAfterBS() {
		return docAfterBS;
	}
	public List<F10505002VO> queryMedDocumentByHos(F10505002VO vo) {
		if (vo == null) {
			throw new BusinessException("F10505002VS-00:传入vo为空");
		}
		Kc63DTO dto = new Kc63DTO();
		BeanTools.copyProperties(vo, dto);
		List<Kc63DTO> list=this.getDocAfterBS().queryKc63ByHosptl(dto);
		List<F10505002VO> hosList=new ArrayList<F10505002VO>();
	//	int i=0;
		for(Kc63DTO kc63DTO:list){
			//if("42503096900".equals(kc63DTO.getAkb020().trim())){
		//	if(i++<5){
				F10505002VO f10505001vo=new F10505002VO();
				BeanTools.copyProperties(kc63DTO,f10505001vo);
				hosList.add(f10505001vo);
				
		//	}
			
		}
		return hosList;
	}
}
