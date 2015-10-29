package com.wondersgroup.local.k3.f10301004.vs.impl;

import java.util.Date;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Ac01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kb01;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Kf05;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af30DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af37DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af61DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.k3.f10301004.bs.F10301004BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301004.vo.Ac01VO;
import com.wondersgroup.local.k3.f10301004.vo.Af61VO;
import com.wondersgroup.local.k3.f10301004.vo.BeAuditInfoVO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301004.vo.Kb01VO;
import com.wondersgroup.local.k3.f10301004.vo.Kf05VO;
import com.wondersgroup.local.k3.f10301004.vo.SurveyRecordVO;
import com.wondersgroup.local.k3.f10301004.vs.F10301004VS;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301004VSImpl implements F10301004VS{
	
	private AdminDisposalBS adminDisposalBS;
	private F10301004BS f10301004BS;

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}

	public F10301004BS getF10301004BS() {
		return f10301004BS;
	}

	public void setF10301004BS(F10301004BS f10301004bs) {
		f10301004BS = f10301004bs;
	}

	public Map<String, Object> queryAuditCaseWithPage(Page page,CaseDetailsVO returnVO) {
		
		//CaseDetailsVO returnVO = new CaseDetailsVO();
				
		//Page result = this.getAdminDisposalBS().queryAuditCaseInfoWithPage(page, caseDetailsVO);
		
		returnVO.setAae426(AuditConstants.AAE426_CODE_3);
		
		Page result = this.getAdminDisposalBS().queryAf53WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryCaseInfoByAbz001(Page page,String abz001) {
		
		if(!StringTools.hasText(abz001)){
			throw new BusinessException("F10301004VS-01：根据案件编号zbz001查询案件详情，abz001为空");
		}
		
		CaseDetailsVO returnVO = new CaseDetailsVO();
		
		if(StringTools.hasText(abz001)){
			returnVO.setAbz001(abz001);//設置案件編號
			returnVO.setAae426(AuditConstants.AAE426_CODE_3);//設置案件狀態 立案待查
		}
		
		Page result = this.getAdminDisposalBS().queryAf53WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Map<String, Object> queryBeAuditInfoByAaz318(Page page,String aaz318) {
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301004VS-02：根据aaz318查询被稽核对象，aaz318为空!");
		}
		
		BeAuditInfoVO returnVO = new BeAuditInfoVO();
		
		if(aaz318 != null){
			returnVO.setAaz318(Long.valueOf(aaz318));//設置af31.aaz318 = af53.aaz318
			returnVO.setApa011(AuditConstants.APA011_CODE_0);//設置apa011 = 0
		}
		
		Page result = this.getAdminDisposalBS().queryAf31WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	public CaseDetailsVO queryAuditCaseDetailsById(String aaz318) {
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301004VS-03:根據逐漸查詢af53對象，傳入參數，主鍵aaz318為空!");
		}
		
		CaseDetailsVO returnVO = new CaseDetailsVO();
		
		Af53DTO af53DTO = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af53DTO == null){
			throw new BusinessException("F10301004VS-08:根據逐漸查詢af53對象失敗!");
		}
		
		//abb006 1 (系統監控) 2(外部受理)3(主動稽核)
		if(AuditConstants.ABB006_CODE_1.equals(af53DTO.getAbb006())){
			
			String aaz281 = String.valueOf(af53DTO.getAaz281());
			
			Af32DTO af32Dto = this.adminDisposalBS.getAf32ById(aaz281);
			
			if(af32Dto != null){
				
				BeanTools.copyProperties(af53DTO,returnVO);
				
				BeanTools.copyPropertiesIgnoreNull(af32Dto, returnVO);
			}
		}
		
		if(AuditConstants.ABB006_CODE_2.equals(af53DTO.getAbb006()) || AuditConstants.ABB006_CODE_3.equals(af53DTO.getAbb006())){
			
			BeanTools.copyProperties(af53DTO,returnVO);
		}
		
		return returnVO;
	}

	public BeAuditInfoVO queryBeAuditTargetInfoById(String aaz077) {
		
		if(!StringTools.hasText(aaz077)){
			throw new BusinessException("F10301004VS-04:根據主键查詢af31對象，傳入參數，主鍵aaz077為空!");
		}
		
		BeAuditInfoVO returnVO = new BeAuditInfoVO();
		
		Af31DTO af31Dto = getAdminDisposalBS().getAf31ById(aaz077);
		
		if(af31Dto == null){
			throw new BusinessException("F10301004VS-05:根據主键aaz077查詢af31對象为空!");
		}
		
		String apa709 = af31Dto.getApa709();//判断对象类型1(参保人) 2(医师) 3(医疗服务机构)
		String aaz010 = af31Dto.getAaz010();//获取当事人ID
		
		if(!StringTools.hasText(apa709)){
			throw new BusinessException("F10301004VS-06:稽核对象类型不明！");
		}
		
		if(!StringTools.hasText(aaz010)){
			throw new BusinessException("F10301004VS-07:稽核对象当事人ID为空！");
		}
		
		//参保人
		if(AuditConstants.APA709_CODE_1.equals(apa709)){
			
			Ac01DTO ac01Dto = getAdminDisposalBS().getAc01ById(aaz010);
			
			if(ac01Dto != null){
				
				BeanTools.copyProperties(af31Dto, returnVO);
				
				BeanTools.copyPropertiesIgnoreNull(ac01Dto, returnVO);
			}
		}
		
		//医师
		if(AuditConstants.APA709_CODE_2.equals(apa709)){
			
			Kf05DTO kf05Dto = getAdminDisposalBS().getKf05ById(aaz010);
			
			if(kf05Dto != null){
				
				BeanTools.copyProperties(af31Dto, returnVO);
				
				BeanTools.copyPropertiesIgnoreNull(kf05Dto, returnVO);
			}
		}
		
		//医疗服务机构
		if(AuditConstants.APA709_CODE_3.equals(apa709)){
			
			Kb01DTO kb01Dto = getAdminDisposalBS().getKb01ById(aaz010);
			
			if(kb01Dto != null){
				
				BeanTools.copyProperties(af31Dto, returnVO);
				
				BeanTools.copyPropertiesIgnoreNull(kb01Dto, returnVO);
			}
		}
		
		return returnVO;
	}

	public SurveyRecordVO saveSurveyRecord(SurveyRecordVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301004VS-08:保存时传入 稽核调查记录 对象 surveyRecordVO 为空！");
		}
		
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		returnVO.setAae011(aae011);
	
		if(returnVO.getAaz148() == null){
			
			Af30DTO af30Dto = new Af30DTO();
			
			BeanTools.copyProperties(returnVO, af30Dto);
			
			af30Dto.setApa702(AuditConstants.APA702_CODE_0);//设置成未发单
			
			af30Dto.setAae036(new Date());//获取当前日期
			
			af30Dto = this.getAdminDisposalBS().saveAf30(af30Dto);
		}else{
			
			String aaz148 = String.valueOf(returnVO.getAaz148());
			
			Af30DTO af30Dto = this.getAdminDisposalBS().getAf30ById(aaz148);
			
			if(AuditConstants.APA702_CODE_1.equals(af30Dto.getApa702())){
				throw new BusinessException("F10301004VS-14:修改稽核调查记录 已被其他管理员 发单 ！");
			}
			
			BeanTools.copyPropertiesIgnoreNull(returnVO,af30Dto);
			
			af30Dto.setApa702(AuditConstants.APA702_CODE_0);//设置成未调查完成
			
			af30Dto.setAae036(new Date());//获取当前日期
			
			af30Dto = this.getAdminDisposalBS().updateAf30(af30Dto);
			
		}
		//设置案件状态
		String aaz318 = String.valueOf(returnVO.getAaz318());
		String aaz077 = String.valueOf(returnVO.getAaz077());
		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException("F10301004VS-DCBZ:根据对象ID查询为空");
		}
		
		Af31DTO af31DTO = this.getAdminDisposalBS().getAf31ById(aaz077);
		
		af31DTO.setDcbz(Integer.parseInt(AuditConstants.DCBZ_CODE_1));
		
		af31DTO.setJlbz(Integer.parseInt(AuditConstants.JLBZ_CODE_0));
		
		af31DTO = this.getAdminDisposalBS().updateAf31(af31DTO);
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301004VS-11:根据案件对象，查询 aaz318 为空！");
		}
		
		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af53Dto == null){
			throw new BusinessException("F10301004VS-12:根据 aaz318  查询案件对象 为空！");
		}
						
		//af53Dto.setAae426(AuditConstants.AAE426_CODE_7);//设置案件状态为调查完成
		
		af53Dto = this.getAdminDisposalBS().updateAf53(af53Dto);

		return returnVO;
		
	}

	public Map<String, Object> querySurveyRecordWithPage(Page page,SurveyRecordVO returnVO) {
		
		Page result = this.getAdminDisposalBS().querySurveyRecordWithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public SurveyRecordVO querySurveyRecordInfo(String aaz148) {
		
		if(!StringTools.hasText(aaz148)){
			throw new BusinessException("F10301004VS-09:查询 稽核调查记录 详情aaz148 为空！");
		}
		
		SurveyRecordVO returnVO = new SurveyRecordVO();
		
		Af30DTO af30Dto = this.getAdminDisposalBS().getAf30ById(aaz148);
		
		if(af30Dto != null){
			BeanTools.copyProperties(af30Dto, returnVO);
		}
		
		return returnVO;
	}

	public SurveyRecordVO updateSurveyRecord(SurveyRecordVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301004VS-10:发单稽核调查记录 对象returnVO 为空 ！");
		}
		
		String aaz148 = String.valueOf(returnVO.getAaz148());
		
		if(!StringTools.hasText(aaz148)){
			throw new BusinessException("F10301004VS-10:发单稽核调查记录 对象returnVO 主键为空 ！");
		}
		
		Af30DTO af30Dto = this.getAdminDisposalBS().getAf30ById(aaz148);
		
		if(AuditConstants.APA702_CODE_1.equals(af30Dto.getApa702())){
			throw new BusinessException("F10301004VS-11:发单稽核调查记录 已被其他管理员 发单 ！");
		}
		
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();
		
		returnVO.setAae011(aae011);//当前操作人
		
		returnVO.setAae036(new Date());//当前时间
		
		returnVO.setApa702(AuditConstants.APA702_CODE_1);//设置成已发单
		
		BeanTools.copyPropertiesIgnoreNull(returnVO,af30Dto);
		
		af30Dto = this.getAdminDisposalBS().updateAf30(af30Dto);

		return returnVO;
	}

	/**
	 * 案件调查完成
	 */
	public CaseDetailsVO surveyDone(CaseDetailsVO resultVO) {
		
		Af53DTO af53DTO = new Af53DTO();
		
		af53DTO.setAaz318(resultVO.getAaz318());
		
		af53DTO = getAdminDisposalBS().surveyDone(af53DTO);
		
		return resultVO;
	}

	/**
	 * 案件关联笔录
	 */
	public void relateRecord(CaseDetailsVO resultVO) {
		
		Af53DTO af53dto = new Af53DTO();
		
		BeanTools.copyProperties(resultVO, af53dto);
		
		Af37DTO af37dto = this.getF10301004BS().getAf37ByAaz381(af53dto.getAaz381());
		
		Af37DTO af37dto2 = new Af37DTO();
		
		if (af37dto.getAaz318() == 0 || "".equals(String.valueOf(af37dto.getAaz318()))) {
			
			this.getF10301004BS().relateRecord(af53dto);
			
		}else {
			
			af37dto2.setAaa027(af37dto.getAaa027());
			af37dto2.setAac002(af37dto.getAac002());
			af37dto2.setAac003(af37dto.getAac003());
			af37dto2.setAac004(af37dto.getAac004());
			af37dto2.setAac005(af37dto.getAac005());
			af37dto2.setAae005(af37dto.getAae005());
			af37dto2.setAae006(af37dto.getAae006());
			af37dto2.setAae007(af37dto.getAae007());
			af37dto2.setAae013(af37dto.getAae013());
			af37dto2.setAbe177(af37dto.getAbe177());
			af37dto2.setApa065(af37dto.getApa065());
			af37dto2.setApe029(af37dto.getApe029());
			af37dto2.setApe134(af37dto.getApe134());
			af37dto2.setApe135(af37dto.getApe135());
			af37dto2.setApe712(af37dto.getApe712());
			af37dto2.setAaz318(af53dto.getAaz318());
			
			this.getF10301004BS().relateRecordByAaz381(af37dto2);
		}
	}
		
	public Map<String, Object> queryAf37WithPage(Page page, InquiryInputVO inquiryInputVO) {
		
		Af37DTO af37dto = new Af37DTO();
		
		BeanTools.copyProperties(inquiryInputVO, af37dto);
		
		Page result = this.getF10301004BS().queryAf37WithPage(page,af37dto);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Af61VO queryApprovalInfo(Af61VO af61vo) {
		if(af61vo.getAaz318() == null){
			throw new BusinessException("F10301004VS-12:ID为空 ！");
		}
		af61vo = this.getF10301004BS().queryApprovalInfo(af61vo);
		if(StringTools.hasText(af61vo.getApa701())){
			String[] strs = af61vo.getApa701().split(",");
			String apa701 = "";
			for (int i = 0; i < strs.length; i++) {
				if(StringTools.hasText(strs[i])){
					Aa10DTO aa10dto = this.getF10301004BS().getAa10ByCode(strs[i]);
					apa701 += (i+1) + "、" + aa10dto.getAaa103();
				}
			}
			af61vo.setApa701(apa701);
		}
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();
		af61vo.setAae011(aae011);
		af61vo.setAae036(new Date());
		return af61vo;
	}

	public Af61VO saveAf61(Af61VO af61vo) {
		if(af61vo.getAaz318() == null){
			throw new BusinessException("F10301004VS-13:ID为空 ！");
		}
		Af53 af53 = this.getF10301004BS().getAf53ByAaz318(af61vo.getAaz318());
		af61vo.setAaa027(af53.getAaa027());
		af61vo.setAbe010(af53.getAbz001());
		
		Af61DTO af61dto = new Af61DTO();
		BeanTools.copyPropertiesIgnoreNull(af61vo, af61dto);
		
		af61dto = this.getF10301004BS().saveAf61(af61dto);
		BeanTools.copyPropertiesIgnoreNull(af61dto, af61vo);
		return af61vo;
	}

	public Map<String, Object> queryAf61WithMap(Af61VO af61vo) {
		if(af61vo.getAbz618() == 0){
			throw new BusinessException("F10301004VS-14:ID为空 ！");
		}
		Map<String, Object> dataMap = this.getF10301004BS().queryAf61WithMap(af61vo.getAbz618());
		return dataMap;
	}
	
	public Kf05VO queryKc05ByAaz077(Kf05VO kf05vo) {
		Af31DTO af31dto = this.getAdminDisposalBS().getAf31ById(kf05vo.getAaz077());
		
		Kf05 kf05 = this.getF10301004BS().queryKc05ByAaz263(af31dto.getAaz010(), af31dto.getAaz077());
		
		Kf05VO kf05vo2 = new Kf05VO();
		
		if (kf05 == null) {
			throw new BusinessException("F10301004VSImpl-01:There is no data in table KF05.");
		}else{
		
			BeanTools.copyPropertiesIgnoreNull(kf05, kf05vo2);
		}
		return kf05vo2;
	}

	public Ac01VO queryAc01ByAaz077(Ac01VO ac01vo) {
		
		Af31DTO af31dto = this.getAdminDisposalBS().getAf31ById(ac01vo.getAaz077());
		
		Ac01 ac01 = this.getF10301004BS().queryAc01ByAaz077(af31dto.getAaz010(), af31dto.getAaz077());
		
		Ac01VO ac01vo1 = new Ac01VO();
		
		BeanTools.copyPropertiesIgnoreNull(ac01, ac01vo1);
		
		Date aac006s = DateTools.parseDate(String.valueOf(ac01vo1.getAac006()), "yyyyMMdd");
		
		ac01vo1.setAac006s(aac006s);
		
		return ac01vo1;
	}

	public Kb01VO queryKb01ByAaz077(Kb01VO kb01vo) {
		
		Af31DTO af31dto = this.getAdminDisposalBS().getAf31ById(kb01vo.getAaz077());
		
		Kb01 kb01 = this.getF10301004BS().queryKb01ByAaz077(af31dto.getAaz010(), af31dto.getAaz077());
		
		Kb01VO kb01vo2 = new Kb01VO();
		
		BeanTools.copyPropertiesIgnoreNull(kb01, kb01vo2);
		
		return kb01vo2;
	}

	public void deleteObject(String aaz077) {
		this.getF10301004BS().delete(aaz077);
	}
}
