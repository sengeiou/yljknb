package com.wondersgroup.local.k5.f10502001.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.model.dto.Kb41DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502001.vs.F10502001VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10502001VSImpl implements F10502001VS {
		
		private AuditComplaintBS auditComplaintBS;

		public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
			this.auditComplaintBS = auditComplaintBS;
		}

		public AuditComplaintBS getAuditComplaintBS() {
			return auditComplaintBS;
		}

	public F10502001VO updateHospMessage(F10502001VO resultVO) {
			
			auditComplaintBS.updateHospMessage(resultVO);
		
			return resultVO;
		}

	public F10502001VO find(String aaz107) {
		
		F10502001VO resultVO=new F10502001VO();
		if(aaz107==null){
			throw new BusinessException("f10502001VO-10:提示，根据主键查询一个kb41对象，主键aaz107为空!");
		}
		
		Kb41DTO Kb41dto=this.getAuditComplaintBS().findKb41(aaz107);
		BeanTools.copyProperties(Kb41dto, resultVO);
		return resultVO;
	}

	public Map<String, Object> queryKb41Message(Page page, F10502001VO resultvo) {
		Page result=this.getAuditComplaintBS().queryKb41Message(page, resultvo);
		
		return GridUtils.getGridData(result);
	}


		
		
	}



