package com.wondersgroup.local.k5.f10502002.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf06DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502002.vs.F10502002VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10502002VSImpl implements F10502002VS {
	private AuditComplaintBS auditComplaintBS;

	public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
		this.auditComplaintBS = auditComplaintBS;
	}

	public AuditComplaintBS getAuditComplaintBS() {
		return auditComplaintBS;
	}

	public Map<String, Object> queryKf66Message(Page page, F10502002VO resultvo) {

			Page result=this.getAuditComplaintBS().queryKf66Message(page, resultvo);
			
			return GridUtils.getGridData(result);
		}

	public F10502002VO saveKf66Message(F10502002VO resultVO) {
		
		auditComplaintBS.saveKf66Message(resultVO);
		
		return resultVO;
	}

	public F10502002VO findUpdateMessage(String aaz307) {
		F10502002VO resultVO=new F10502002VO();
		if(aaz307==null){
			throw new BusinessException("f10502002VO-10:提示，根据主键查询一个kb41对象，主键baz047为空!");
		}
		
		Kf06DTO Kf06dto=this.getAuditComplaintBS().findKf06UpdateMessage(aaz307);
		BeanTools.copyProperties(Kf06dto, resultVO);
		return resultVO;
	}

	public F10502002VO updateKf66Message(F10502002VO resultVO) {

		auditComplaintBS.updateKf66(resultVO);
		return resultVO;
	}

	public F10502002VO loadAddMessage(F10502002VO f10502002vo) {
		f10502002vo=this.getAuditComplaintBS().loadAddMessage(f10502002vo);
		return f10502002vo;
	}

	public Map<String, Object> queryKf06Message(Page page, F10502002VO resultvo) {
		F10502002VO queryDto=new F10502002VO();
		
		BeanTools.copyProperties(resultvo,queryDto);
		
		Page result=this.getAuditComplaintBS().queryKf06Message(page,queryDto);
		
		return GridUtils.getGridData(result);
	}

	public F10502002VO deleteKf06Message(F10502002VO resultVO) {
		
		resultVO=this.getAuditComplaintBS().deleteKf06Message(resultVO);
		
		return resultVO;
	}
	}


