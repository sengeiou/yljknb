package com.wondersgroup.local.k3.f10301006.vs.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af39DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.k3.f10301006.bs.F10301006BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301006.vo.Af38VO;
import com.wondersgroup.local.k3.f10301006.vo.Af39VO;
import com.wondersgroup.local.k3.f10301006.vo.AuditVerdictVO;
import com.wondersgroup.local.k3.f10301006.vo.CaseConclusionVO;
import com.wondersgroup.local.k3.f10301006.vs.F10301006VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301006VSImpl implements F10301006VS{

	private AdminDisposalBS adminDisposalBS;
	private F10301006BS f10301006BS;

	public F10301006BS getF10301006BS() {
		return f10301006BS;
	}

	public void setF10301006BS(F10301006BS f10301006bs) {
		f10301006BS = f10301006bs;
	}

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public AuditVerdictVO saveAuditVerdict(AuditVerdictVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301006VS-01:保存稽核结论登记 的时候 传入 对象 returnVO 参数为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz077())){
			throw new BusinessException("F10301006VS-02:保存稽核结论登记 的时候 传入对象  主键 aaz077 参数为空!");
		}
		
		Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(returnVO.getAaz077());
		
		if(AuditConstants.APA011_CODE_1.equals(af31Dto.getApa011())){
			throw new BusinessException("F10301006VS-03:保存稽核结论登记 的时候  该对象已被其他管理员进行了结论确认，不能修改!");
		}
		
		af31Dto.setApa011(AuditConstants.APA011_CODE_0);
		
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		af31Dto.setAae011(aae011);
		
		af31Dto.setJlbz(Integer.parseInt(AuditConstants.JLBZ_CODE_1));
		
		af31Dto.setAae036(new Date());//设置经办时间
		
		//要求清空一些字段
		af31Dto.setAae189(null);
		af31Dto.setAae012(null);
		af31Dto.setAae034(null);
		
		BeanTools.copyPropertiesIgnoreNull(returnVO,af31Dto);
		
		af31Dto = this.getAdminDisposalBS().updateAf31(af31Dto);
		
		//设置案件状态
		String aaz318 = String.valueOf(returnVO.getAaz318());
				
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301006VS-11:根据案件对象，查询 aaz318 为空！");
		}
				
		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(aaz318);
				
		if(af53Dto == null){
			throw new BusinessException("F10301006VS-12:根据 aaz318  查询案件对象 为空！");
		}
								
		//af53Dto.setAae426(AuditConstants.AAE426_CODE_8);//设置案件状态为调查完成
				
		af53Dto = this.getAdminDisposalBS().updateAf53(af53Dto);
		
		return returnVO;
	}
	
	public Map<String, Object> queryAuditCaseWithPage(Page page , CaseConclusionVO returnVO){
		
		//returnVO.setAae426(AuditConstants.AAE426_CODE_7);
		
		Page result = this.getF10301006BS().queryAf53ByIdsNew(page, returnVO);
		
		/*for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAbb025() != 0){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
			
		}*/
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page , CaseConclusionVO returnVO){
		
		returnVO.setAae426(AuditConstants.AAE426_CODE_7);
		
		Page result = this.getF10301006BS().queryAf53WithPageInfo(page,returnVO);
		if(result.getTotalPageCount()>0){
			for(int i=0;i<result.getTotalPageCount();i++){
				Af53DTO af53dto = (Af53DTO)result.getResult().get(i);
				af53dto.setAae034s(DateTools.parseDate(String.valueOf(af53dto.getAae034()), "yyyyMMdd"));
				result.getResult().set(i, af53dto);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public CaseDetailsVO registDone(CaseDetailsVO resultVO) {
		
		Af53DTO af53DTO = new Af53DTO();
		
		af53DTO.setAaz318(resultVO.getAaz318());
		
		af53DTO.setAae426(AuditConstants.AAE426_CODE_8);//设置案件状态为待结论确认
		
		af53DTO.setAae427(AuditConstants.AAE426_CODE_8);
		
		af53DTO = getF10301006BS().updateAf53(af53DTO);
		
		getF10301006BS().updateAf31ByAaz318(af53DTO.getAaz318());
		
		return resultVO;
	}

	public Af38VO saveConclusion(Af38VO af38vo) {
		if(!StringTools.hasText(af38vo.getAaz077())){
			throw new BusinessException("F10301006VS-13:稽核对象 为空！");
		}
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		Af38DTO af38dto = new Af38DTO();
		BeanTools.copyPropertiesIgnoreNull(af38vo, af38dto);
		af38dto.setBaz023(aae011);
		af38dto.setBaz024(new Date());
		Af31 af31 = this.getF10301006BS().getAf31(af38vo.getAaz077());
		af31.setJlbz(Integer.valueOf(AuditConstants.JLBZ_CODE_1));
		af38dto.setAaa027(af31.getAaa027());
		af31.setApa163(af38dto.getApa163());
		af31.setApa168(af38dto.getApa168());
		af31.setApa763(af38dto.getApa763());
		this.getF10301006BS().updateAf31(af31);
		this.getF10301006BS().saveAf38(af38dto);
		return af38vo;
	}

	public Af39VO saveNotify(Af39VO af39vo) {
		Af39DTO af39dto = new Af39DTO();
		BeanTools.copyPropertiesIgnoreNull(af39vo, af39dto);
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		af39dto.setAaz071(aae011);
		af39dto.setAaz029(new Date());
		Aa10DTO aa10dto = this.getF10301006BS().getAa10ByCode(af39dto.getAaa027());
		
		String aaz006 = "";
		Af39DTO af39dto_old = this.getF10301006BS().getAf39ByAaz007(af39dto.getAaz077());
		if(af39dto_old == null){
			Af39DTO af39dto2 = this.getF10301006BS().getMaxAaz006();
			String aaz006_1 =  DateTools.getSystemYear();
			if(af39dto2.getAaz006() == null || "0000000".equals(af39dto2.getAaz006())){
				aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			}else{
				aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af39dto2.getAaz006())) + 1));
			}
		}else{
			aaz006 = af39dto_old.getAaz006();
		}
		af39dto.setAaz006(aaz006);
		
		af39dto = this.getF10301006BS().saveAf39(af39dto);
		BeanTools.copyPropertiesIgnoreNull(af39dto, af39vo);
		return af39vo;
	}

	public Map<String, Object> queryAf39WithMap(Af39VO af39vo) {
		if(af39vo.getAab077() == null){
			throw new BusinessException("F10301006VS-14:告知对象 为空！");
		}
		Map<String, Object> dataMap = this.getF10301006BS().queryAf39WithMap(af39vo.getAab077());
		return dataMap;
	}
	
	
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077, String apa709) {

		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException(
					"CommonVSImpl:根據主键查詢被稽核对象     af31 详情 ，傳入參數，主鍵aaz077為空!");
		}

		BeAuditTargetVO returnVO = new BeAuditTargetVO();

		Af31DTO af31Dto = getAdminDisposalBS().getAf31ByAaz077(aaz077, apa709);

		if (af31Dto == null) {
			throw new BusinessException("CommonVSImpl:根據主键aaz077查詢af31對象为空!");
		}
		BeanTools.copyProperties(af31Dto, returnVO);

		return returnVO;
	}
	
}
