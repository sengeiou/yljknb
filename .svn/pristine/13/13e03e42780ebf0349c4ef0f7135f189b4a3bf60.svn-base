package com.wondersgroup.local.k5.f10502003.vs.impl;

import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.businesscollaboration.auditcomplaint.bs.AuditComplaintBS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k5.f10502003.vo.F10502003VO;
import com.wondersgroup.local.k5.f10502003.vs.F10502003VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;

public class F10502003VSImpl implements F10502003VS {

		private AuditComplaintBS auditComplaintBS;

		public void setAuditComplaintBS(AuditComplaintBS auditComplaintBS) {
			this.auditComplaintBS = auditComplaintBS;
		}

		public AuditComplaintBS getAuditComplaintBS() {
			return auditComplaintBS;
		}

		public Map<String, Object> queryKf65Message(Page page, F10502003VO resultvo) {

				Page result=this.getAuditComplaintBS().queryKf65Message(page, resultvo);
				
				return GridUtils.getGridData(result);
			}

		public F10502003VO saveKf65Message(F10502003VO resultVO) {
			auditComplaintBS.saveKf65Message(resultVO);
			
			return resultVO;
		}

		public Map<String, Object> queryKf05Message(Page page,
				F10502003VO resultvo) {
			Page result=this.getAuditComplaintBS().queryKf05Message(page, resultvo);
			
			return GridUtils.getGridData(result);
		}

		public F10502003VO loadUpdateMessage(F10502003VO f10502003vo) {
			f10502003vo=this.getAuditComplaintBS().loadUpdateMessage(f10502003vo);
			return f10502003vo;
		}

		public F10502003VO find(String aaz263) {
			F10502003VO resultVO=new F10502003VO();
			if(aaz263==null){
				throw new BusinessException("F10402005VS-10:提示，根据主键查询一个resultVO对象，主键id为空!");
			}
			
			Kf05DTO kf05DTO=this.getAuditComplaintBS().find(aaz263);
			BeanTools.copyProperties( kf05DTO,resultVO );
			return resultVO;
}

		public F10502003VO updateKf65Message(F10502003VO resultVO) {

			auditComplaintBS.updateKf65(resultVO);
			return resultVO;
		}

		public F10502003VO deleteKf05Message(F10502003VO resultVO) {
			resultVO=this.getAuditComplaintBS().deleteKf05Message(resultVO);
			
			return resultVO;
		}

		}
		




