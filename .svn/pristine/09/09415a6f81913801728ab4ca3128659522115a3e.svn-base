package com.wondersgroup.local.k3.f10301008.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af53;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Aa10DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af34DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af38DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af52DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af54DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af62DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af63DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af64DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditCaseDTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.AuditConveyDTO;
import com.wondersgroup.bc.k3.f10301008.bs.F10301008BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301008.vo.Af52VO;
import com.wondersgroup.local.k3.f10301008.vo.Af54VO;
import com.wondersgroup.local.k3.f10301008.vo.Af62VO;
import com.wondersgroup.local.k3.f10301008.vo.Af63VO;
import com.wondersgroup.local.k3.f10301008.vo.Af64VO;
import com.wondersgroup.local.k3.f10301008.vo.ConveyRecordVO;
import com.wondersgroup.local.k3.f10301008.vo.QueryDetailsVO;
import com.wondersgroup.local.k3.f10301008.vo.VerdictFinishVO;
import com.wondersgroup.local.k3.f10301008.vo.VerdictConveyVO;
import com.wondersgroup.local.k3.f10301008.vs.F10301008VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301008VSImpl implements F10301008VS{

	private AdminDisposalBS adminDisposalBS;
	private F10301008BS f10301008BS;

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}
	
	public F10301008BS getF10301008BS() {
		return f10301008BS;
	}

	public void setF10301008BS(F10301008BS f10301008bs) {
		f10301008BS = f10301008bs;
	}

	public Map<String, Object> queryAuditCaseWithPage(Page page ,VerdictConveyVO returnVO){
		
		Page result = this.getAdminDisposalBS().queryAf53Convey(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			AuditCaseDTO audDto = (AuditCaseDTO) result.getResult().get(i);
			if(audDto.getAbb025() != 0 && audDto.getAbb025() != null){
				
				String str = String.valueOf(audDto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				audDto.setAbb025s(abb025s);
			}
			
			if(audDto.getAae034() != 0 && audDto.getAae034() != null){
				
				String str = String.valueOf(audDto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				audDto.setAae034s(aae034s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public VerdictConveyVO queryVerdictCaseInfoByAaz318(String aaz318) {
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301008VS-00：根据aaz318查询对案件  af53 详情，aaz318为空!");
		}
		
		VerdictConveyVO returnVO = new VerdictConveyVO();
		
		Af53DTO af53DTO = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af53DTO == null){
			throw new BusinessException("F10301008VS-01:根據逐漸查詢af53對象失敗!");
		}
		
		if(af53DTO.getAbb025() != null){
			
			String str = String.valueOf(af53DTO.getAbb025());
			
			Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
			
			af53DTO.setAbb025s(abb025s);
		}
		
		if(af53DTO.getAae034() != null){
			
			String str = String.valueOf(af53DTO.getAae034());
			
			Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
			
			af53DTO.setAae034s(aae034s);
		}
		
		//abb006 1 (系統監控) 2(外部受理)3(主動稽核)
		if(AuditConstants.ABB006_CODE_1.equals(af53DTO.getAbb006())){
			
			BeanTools.copyProperties(af53DTO,returnVO);
			
		}
		
		if(AuditConstants.ABB006_CODE_2.equals(af53DTO.getAbb006()) || AuditConstants.ABB006_CODE_3.equals(af53DTO.getAbb006())){
			
			String aaz281 = String.valueOf(af53DTO.getAaz281());
			
			if(!StringTools.hasText(aaz281)){
				throw new BusinessException("F10301008VS-02:根據逐漸查詢af32 时 主键 aaz281为空!");
			}
			
			Af32DTO af32Dto = this.adminDisposalBS.getAf32ById(aaz281);
			
			if(af32Dto != null){
				
				BeanTools.copyProperties(af53DTO,returnVO);
						
				BeanTools.copyPropertiesIgnoreNull(af32Dto, returnVO);
			}
		}
		
		return returnVO;
	}

	public ConveyRecordVO saveConveyRecord(ConveyRecordVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301008VS-03:保存稽核传入记录对象为空!");
		}
		
		if(!StringTools.hasText(returnVO.getAaz077())){
			throw new BusinessException("F10301008VS-04:被稽核对象主键aaz077为空!");
		}
		
		Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(returnVO.getAaz077());
		
		//判断状态 如果是告知终结 
		if(AuditConstants.AAE425_CODE_2.equals(af31Dto.getAae425())){
			throw new BusinessException("F10301008VS-05:被稽核对象 已经被其他管理员 告知终结!");
		}else {
			
			af31Dto.setAae425(AuditConstants.AAE425_CODE_2);
			
			this.getAdminDisposalBS().updateAf31(af31Dto);
		}
		
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		returnVO.setAae011(aae011);//设置当前操作人
		
		//主键为空 新增保存  主键不为空 修改保存
		if(returnVO.getAaz147() == null){
			
			Af34DTO af34Dto = new Af34DTO();
			
			BeanTools.copyProperties(returnVO,af34Dto);
			
			af34Dto.setAae036(new Date());//设置当前时间
			
			af34Dto = this.getAdminDisposalBS().saveAf34(af34Dto);
			
		}else{
			
			String aaz147 = String.valueOf(returnVO.getAaz147());
			
			Af34DTO af34Dto = this.getAdminDisposalBS().getAf34ById(aaz147);
			
			BeanTools.copyPropertiesIgnoreNull(returnVO,af34Dto);
			
			af34Dto.setAae036(new Date());//设置当前时间
			
			af34Dto = this.getAdminDisposalBS().updateAf34(af34Dto);
		}
		
		return returnVO;
	}

	public Map<String, Object> queryConveyRecordWithPage(Page page,ConveyRecordVO returnVO) {
		
		Page result = this.getAdminDisposalBS().queryAf34WinthPage(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			AuditConveyDTO acDto = (AuditConveyDTO) result.getResult().get(i);
			
			String str = String.valueOf(acDto.getApe741());
			
			Date ape741 = DateTools.parseDate(str, "yyyyMMdd");
			
			acDto.setApe741s(ape741);
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public ConveyRecordVO deleteConveyRecordByIds(String aaz147s) {
		
		ConveyRecordVO returnVO = new ConveyRecordVO();
		
		this.getAdminDisposalBS().deleteAf34ByIds(aaz147s);
		
		return returnVO;
	}

	public VerdictFinishVO finishConvey(String aaz077) {
		
		VerdictFinishVO returnVO = new VerdictFinishVO();
		
		if(!StringTools.hasText(aaz077)){
			throw new BusinessException("F10301008VS-06:稽核传达告知终结 传入参数aaz077为空!");
		}
		
		Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(aaz077);
		
		//查询案件相关人数 告知 没有终结的总条数
		List<Af31DTO> af31List1 = this.getAdminDisposalBS().queryAf31List(af31Dto);
		
		if(af31Dto == null){
			throw new BusinessException("F10301008VS-07:根据主键aaz077查询af31为空!");
		}
		
		//判断告知是否终止aae425  0（尚未告知）1（部分告知）2（告知终止）
		if(AuditConstants.AAE425_CODE_2.equals(af31Dto.getAae425())){
			throw new BusinessException("F10301008VS-08:稽核传达 该对象已经被其他管理员 告知终结 禁止操作!");
		}
		
		af31Dto.setAae425(AuditConstants.AAE425_CODE_2);//设置对象告知终结
		
		af31Dto = this.getAdminDisposalBS().updateAf31(af31Dto);
		
		if(af31Dto == null){
			throw new BusinessException("F10301008VS-07: 修改af31 aae425状态失败 !");
		}
		
		BeanTools.copyProperties(af31Dto,returnVO);
		
		String aaz318 = String.valueOf(af31Dto.getAaz318());
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301008VS-08: 根据af31 查询 aaz318 失败 !");
		}
		
		//查询案件相关人数 apa011 ==1 告知终结 的条数
		List<Af31DTO> af31List2 = this.getAdminDisposalBS().queryAf31List(af31Dto);
		
		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af31List1.size() - af31List2.size() == 1){
			
			af53Dto.setAae425(AuditConstants.AAE425_CODE_2);//设置 案件 告知终结
			
			af53Dto = this.getAdminDisposalBS().updateAf53(af53Dto);
			
		}
		
		return returnVO;
	}

	public Map<String, Object> queryBeAuditWithPage(Page page,VerdictFinishVO returnVO) {
		
		Page result = this.getAdminDisposalBS().queryConveyBeAudit(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public Af54VO queryAf54Info(Af54VO af54vo) {
		if(!StringTools.hasText(af54vo.getApa709())){
			throw new BusinessException("F10301008VS-09: 传入对象类型为空 !");
		}
		if(af54vo.getAaz077() == null){
			throw new BusinessException("F10301008VS-09: 传入对象ID为空 !");
		}
		Af54DTO af54dto = new Af54DTO();
		BeanTools.copyPropertiesIgnoreNull(af54vo, af54dto);
		af54dto = this.getF10301008BS().queryAf54Info(af54dto);
		/*if(StringTools.hasText(af54dto.getApa701())){
			String[] strs = af54dto.getApa701().split(",");
			String apa701 = "";
			for (int i = 0; i < strs.length; i++) {
				if(StringTools.hasText(strs[i])){
					Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode(strs[i]);
					apa701 += (i+1) + "、" + aa10dto.getAaa103();
				}
			}
			af54dto.setApa701(apa701);
		}*/
		BeanTools.copyPropertiesIgnoreNull(af54dto, af54vo);
		return af54vo;
	}

	public Af54VO saveConver(Af54VO af54vo) {
		Af54DTO af54dto = new Af54DTO();
		BeanTools.copyPropertiesIgnoreNull(af54vo, af54dto);
		Af31 af31 = this.getF10301008BS().getAf31ById(af54dto.getAaz077());
		af31.setAae425("2");
		this.getF10301008BS().updateAf31(af31);
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode_1(af54dto.getAaa027());
		Af54DTO af54dto2 = this.getF10301008BS().getMaxAbe177();
		String aaz006 = "";
		String aaz006_1 =  DateTools.getSystemYear();
		if(af54dto2.getAbe177() == null || "0000000".equals(af54dto2.getAbe177())){
			aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
		}else{
			aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af54dto2.getAbe177())) + 1));
		}
		af54dto.setAbe177(aaz006);
		af54dto.setAae011(aae011);
		af54dto.setAae036(new Date());
		
		List<Af31DTO> af31dtos = this.getF10301008BS().getAf31ListByAaz318(af31.getAaz318(),af54dto.getAaz077());
		boolean flag = true;
		if(af31dtos != null){
			for (int i = 0; i < af31dtos.size(); i++) {
				Af31DTO af31Dto = af31dtos.get(i);
				if(!("2".equals(af31Dto.getAae425()))){
					flag = false;
					break;
				}
			}
		}
		if(flag){
			Af53 af53 = this.getF10301008BS().getAf53ById(af31.getAaz318());
			af53.setAae425("2");
			this.getF10301008BS().updateAf53(af53);
		}
		
		af54dto = this.getF10301008BS().saveAf54(af54dto);
		af54vo.setAaz048(af54dto.getAaz048());
		return af54vo;
	}

	public Map<String, Object> queryAf54WithMap(Af54VO af54vo) {
		if(!StringTools.hasText(af54vo.getType())){
			throw new BusinessException("F10301008VS-10: 传入对象类型为空 !");
		}
		if(af54vo.getAaz077() == null){
			throw new BusinessException("F10301008VS-11: 传入对象ID为空 !");
		}
		if(af54vo.getAaz048() == null){
			throw new BusinessException("F10301008VS-12: 传入传达对象ID为空 !");
		}
		Af54DTO af54Dto = new Af54DTO();
		BeanTools.copyPropertiesIgnoreNull(af54vo, af54Dto);
		Map<String, Object> dataMap = this.getF10301008BS().queryAf54WithMap(af54Dto);
		return dataMap;
	}
	
	public QueryDetailsVO queryDetailsByAaz077(String aaz077) {
		Af38DTO af38dto = new Af38DTO();
		
		QueryDetailsVO queryDetailsVO = new QueryDetailsVO();
		
		af38dto = this.getAdminDisposalBS().queryAf38ByAaz077(aaz077);
		
		if (af38dto == null) {
			
			return queryDetailsVO;
			
		}else{
		
			BeanTools.copyPropertiesIgnoreNull(af38dto, queryDetailsVO);
		}
		return queryDetailsVO;
	}

	public Af52VO caseMove(Af52VO af52vo) {
		if(af52vo.getAaz318() == null){
			throw new BusinessException("F10301008VS-13: 移交传入案件ID为空 !");
		}
		Af53 af53 = this.getF10301008BS().getAf53ById(af52vo.getAaz318());
		af53.setApa168("1");
		this.getF10301008BS().updateAf53(af53);
		
		Af52DTO af52dto = new Af52DTO();
		BeanTools.copyPropertiesIgnoreNull(af52vo, af52dto);
		
		Af52DTO af52dto3 = this.getF10301008BS().getAf52ByAaz318(af53.getAaz318());
		if(af52dto3 == null){
			Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode_1(af53.getAaa027());
			Af52DTO af52dto2 = this.getF10301008BS().getMaxAbf041();
			String aaz006 = "";
			String aaz006_1 =  DateTools.getSystemYear();
			if(af52dto2.getAbf041() == null || "0000000".equals(af52dto2.getAbf041())){
				aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			}else{
				aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af52dto2.getAbf041())) + 1));
			}
			af52dto.setAbf041(aaz006);
		}else{
			af52dto.setAbf041(af52dto3.getAbf041());
		}
		
		this.getF10301008BS().saveAf52(af52dto);
		BeanTools.copyPropertiesIgnoreNull(af52dto, af52vo);
		return af52vo;
	}
	
	public Map<String, Object> queryAf52WithMap(Af52VO af52vo) {
		if(af52vo.getAbz418() == 0){
			throw new BusinessException("F10301008VS-14: 传入移交对象ID为空 !");
		}
		Af52DTO af52Dto = new Af52DTO();
		BeanTools.copyPropertiesIgnoreNull(af52vo, af52Dto);
		Map<String, Object> dataMap = this.getF10301008BS().queryAf52WithMap(af52Dto);
		return dataMap;
	}

	public Af62VO changeOfTime(Af62VO af62vo) {
		if(af62vo.getAaz077() == null){
			throw new BusinessException("F10301008VS-15: 移交传入对象ID为空 !");
		}
		Af31 af31 = this.getF10301008BS().getAf31ById(af62vo.getAaz077());
		Af62DTO af62dto = new Af62DTO();
		BeanTools.copyPropertiesIgnoreNull(af62vo, af62dto);
		af62dto.setAaa027(af31.getAaa027());
		af62dto.setAaz318(af31.getAaz318());
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		af62dto.setAae011(aae011);
		af62dto.setAae036(new Date());
		
		Af62DTO af62dto2 = this.getF10301008BS().getAf62ByAaz077(af62vo.getAaz077());
		if(af62dto2 == null){
			Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode_1(af62dto.getAaa027());
			Af62DTO af62dto3 = this.getF10301008BS().getMaxAke001();
			String aaz006 = "";
			String aaz006_1 =  DateTools.getSystemYear();
			if(af62dto3.getAke001() == null || "0000000".equals(af62dto3.getAke001())){
				aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			}else{
				aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af62dto3.getAke001())) + 1));
			}
			af62dto.setAke001(aaz006);
		}else{
			af62dto.setAke001(af62dto2.getAke001());
		}
		af62dto = this.getF10301008BS().saveAf62(af62dto);
		af31.setApa164("1");
		this.getF10301008BS().updateAf31(af31);
		BeanTools.copyPropertiesIgnoreNull(af62dto, af62vo);
		return af62vo;
	}

	public Map<String, Object> queryAf62WithMap(Af62VO af62vo) {
		if(af62vo.getBaz071() == 0){
			throw new BusinessException("F10301008VS-16: 导出数据传入ID为空 !");
		}
		Map<String, Object> dataMap = this.getF10301008BS().queryAf62WithMap(af62vo.getBaz071());
		return dataMap;
	}

	public Af63VO recovery(Af63VO af63vo) {
		if(af63vo.getAaz077() == null){
			throw new BusinessException("F10301008VS-17: 恢复传入对象ID为空 !");
		}
		Af31 af31 = this.getF10301008BS().getAf31ById(af63vo.getAaz077());
		af31.setApa165("1");
		this.getF10301008BS().updateAf31(af31);
		Af63DTO af63dto = new Af63DTO();
		BeanTools.copyPropertiesIgnoreNull(af63vo, af63dto);
		af63dto.setAaa027(af31.getAaa027());
		af63dto.setAaz318(af31.getAaz318());
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		af63dto.setAae011(aae011);
		af63dto.setAae036(new Date());
		
		Af63DTO af63dto2 = this.getF10301008BS().getAf63ByAaz077(af63vo.getAaz077());
		if(af63dto2 == null){
			Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode_1(af63dto.getAaa027());
			Af63DTO af63dto3 = this.getF10301008BS().getMaxAke001_af63();
			String aaz006 = "";
			String aaz006_1 =  DateTools.getSystemYear();
			if(af63dto3.getAke001() == null || "0000000".equals(af63dto3.getAke001())){
				aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			}else{
				aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af63dto3.getAke001())) + 1));
			}
			af63dto.setAke001(aaz006);
		}else{
			af63dto.setAke001(af63dto2.getAke001());
		}
		af63dto = this.getF10301008BS().saveAf63(af63dto);
		BeanTools.copyPropertiesIgnoreNull(af63dto, af63vo);
		return af63vo;
	}

	public Map<String, Object> queryAf63WithMap(Af63VO af63vo) {
		if(af63vo.getAde001() == 0){
			throw new BusinessException("F10301008VS-18: 导出数据传入ID为空 !");
		}
		Map<String, Object> dataMap = this.getF10301008BS().queryAf63WithMap(af63vo.getAde001());
		return dataMap;
	}

	public Af64VO queryReturnInfo(Af64VO af64vo) {
		if(!StringTools.hasText(af64vo.getAaz077())){
			throw new BusinessException("F10301008VS-19:  查询数据传入ID为空 !");
		}
		Af31 af31 = this.getF10301008BS().getAf31ById(af64vo.getAaz077());
		String bae079 = "";
		int i = 1;
		if(StringTools.hasText(af31.getAae425()) && "2".equals(af31.getAae425())){
			Af54DTO af54dto = this.getF10301008BS().getLastAf54ByAaz077(af31.getAaz077());
			if(af54dto != null){
				bae079 += i + ".违规行为处理决定书(" + af54dto.getAbe177() + ")\n";
				i++;
				if(StringTools.hasText(af54dto.getAde064())){
					bae079 += i + ".停止医疗保险服务费用结算通知书(" + af54dto.getAbe177() + ")\n";
					i++;
				}
			}
		}
		if(StringTools.hasText(af31.getApa164()) && "1".equals(af31.getApa164())){
			Af62DTO af62dto = this.getF10301008BS().getLastAf62ByAaz077(af31.getAaz077());
			if(af62dto != null){
				bae079 += i + ".限期改正通知书(" + af62dto.getAke001() + ")\n";
				i++;
			}
		}
		if(StringTools.hasText(af31.getApa165()) && "1".equals(af31.getApa165())){
			Af63DTO af63dto = this.getF10301008BS().getAf63ByAaz077(af31.getAaz077());
			if(af63dto != null){
				bae079 += i + ".恢复医疗保险服务费用结算通知书(" + af63dto.getAke001() + ")\n";
				i++;
			}
		}
		
		af64vo.setBae079(bae079);
		af64vo.setAaz010(af31.getAaz010());
		af64vo.setApe008(af31.getApe008());
		return af64vo;
	}

	public Af64VO saveReturnProveInfo(Af64VO af64vo) {
		if(af64vo.getAaz077() == null){
			throw new BusinessException("F10301008VS-18: 送达回证传入对象ID为空 !");
		}
		Af31 af31 = this.getF10301008BS().getAf31ById(af64vo.getAaz077());
		Af64DTO af64dto = new Af64DTO();
		BeanTools.copyPropertiesIgnoreNull(af64vo, af64dto);
		af64dto.setAaa027(af31.getAaa027());
		af64dto.setAaz318(af31.getAaz318());
		String aae011 = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		af64dto.setAae011(aae011);
		af64dto.setAae036(new Date());
		
		Af64DTO af64dto2 = this.getF10301008BS().getAf64ByAaz077(af64vo.getAaz077());
		if(af64dto2 == null){
			Aa10DTO aa10dto = this.getF10301008BS().getAa10ByCode_1(af64dto.getAaa027());
			Af64DTO af64dto3 = this.getF10301008BS().getMaxAke001_af64();
			String aaz006 = "";
			String aaz006_1 =  DateTools.getSystemYear();
			if(af64dto3.getAke001() == null || "0000000".equals(af64dto3.getAke001())){
				aaz006 = aa10dto.getAaa105() + aaz006_1 + "001";
			}else{
				aaz006 = aa10dto.getAaa105() + String.valueOf(((Integer.valueOf(af64dto3.getAke001())) + 1));
			}
			af64dto.setAke001(aaz006);
		}else{
			af64dto.setAke001(af64dto2.getAke001());
		}
		af64dto = this.getF10301008BS().saveAf64(af64dto);
		BeanTools.copyPropertiesIgnoreNull(af64dto, af64vo);
		return af64vo;
	}

	public Map<String, Object> queryAf64WithMap(Af64VO af64vo) {
		if(af64vo.getAge001() == 0){
			throw new BusinessException("F10301008VS-19: 导出数据传入ID为空 !");
		}
		Map<String, Object> dataMap = this.getF10301008BS().queryAf64WithMap(af64vo.getAge001());
		return dataMap;
	}
	
	/**
	 * 对象恢复查询
	 */
	public BeAuditTargetVO queryBeAuditTargetInfoById(String aaz077) {

		if (!StringTools.hasText(aaz077)) {
			throw new BusinessException(
					"CommonVSImpl:根據主键查詢被稽核对象     af31 详情 ，傳入參數，主鍵aaz077為空!");
		}

		BeAuditTargetVO returnVO = new BeAuditTargetVO();

		Af31DTO af31Dto = getF10301008BS().getAf31DtoById(aaz077);

		if (af31Dto == null) {
			throw new BusinessException("CommonVSImpl:根據主键aaz077查詢af31對象为空!");
		}
		BeanTools.copyProperties(af31Dto, returnVO);

		return returnVO;
	}

	public BeAuditTargetVO queryAf31ByAaz077(String aaz077) {
		BeAuditTargetVO beAuditTargetVO = new BeAuditTargetVO();
		
		Af31DTO af31dto = this.getF10301008BS().queryAf31ByAaz077(aaz077);
		
		BeanTools.copyProperties(af31dto, beAuditTargetVO);
		
		return beAuditTargetVO;
	}
}
