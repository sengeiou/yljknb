package com.wondersgroup.local.k3.f10301007.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.AuditConstants;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.bs.AdminDisposalBS;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.Af31;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ac01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kb01DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Ke15DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Kf05DTO;
import com.wondersgroup.bc.k3.f10301007.bs.F10301007BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.DateUtils;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditCaseInfoVO;
import com.wondersgroup.local.k3.f10301007.vo.AuditConclusionVO;
import com.wondersgroup.local.k3.f10301007.vs.F10301007VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301007VSImpl implements F10301007VS{

	private AdminDisposalBS adminDisposalBS;
	private F10301007BS f10301007BS;

	public F10301007BS getF10301007BS() {
		return f10301007BS;
	}

	public void setF10301007BS(F10301007BS f10301007bs) {
		f10301007BS = f10301007bs;
	}

	public AdminDisposalBS getAdminDisposalBS() {
		return adminDisposalBS;
	}

	public void setAdminDisposalBS(AdminDisposalBS adminDisposalBS) {
		this.adminDisposalBS = adminDisposalBS;
	}
	
	
	public Map<String, Object> queryAuditCaseWithPage(Page page , AuditCaseInfoVO returnVO){
		
			returnVO.setAae426(AuditConstants.AAE426_CODE_8);
		
		Page result = this.getAdminDisposalBS().queryAf53ByIds(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAbb025() != 0){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
			
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
	public Map<String, Object> queryAuditCaseWithPageInfo(Page page ,AuditCaseInfoVO returnVO){
		
		returnVO.setAae426(AuditConstants.AAE426_CODE_8);
		
		Page result = this.getF10301007BS().queryAf53WithPage(page, returnVO);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			
			Af53DTO af53Dto = (Af53DTO) result.getResult().get(i);
			
			if(af53Dto.getAbb025() != 0 && af53Dto.getAae034() != null){
				
				String str = String.valueOf(af53Dto.getAbb025());
				
				Date abb025s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAbb025s(abb025s);
			}
			
			if(af53Dto.getAae034() != null && af53Dto.getAae034() != 0){
				
				String str = String.valueOf(af53Dto.getAae034());
				
				Date aae034s = DateTools.parseDate(str, "yyyyMMdd");
				
				af53Dto.setAae034s(aae034s);
			}
		}
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}
	
	
	
	public Map<String, Object> queryBeAuditInfo(Page page,AuditConclusionVO returnVO) {
		if(!StringTools.hasText(returnVO.getApa011())){
			returnVO.setApa011(AuditConstants.APA011_CODE_0);
		}
		
		Page result = this.getAdminDisposalBS().queryAf31WithPage(page, returnVO);
		
		Map<String, Object> map = GridUtils.getGridData(result);
		
		return map;
	}

	public AuditConclusionVO surveyReview(String aaz318) {
		
		if(aaz318 == null){
			throw new BusinessException("F10301007VS-01:稽核确认 调查重审的时候 传入returnVO 为空！");
		}
		
		/*if(!StringTools.hasText(returnVO.getAaz077())){
			throw new BusinessException("F10301007VS-02:稽核确认 调查重审的时候 传入主键 阿安置 aaz077  为空！");
		}*/
		
		//Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(returnVO.getAaz077());
		
		/*if(af31Dto == null){
			throw new BusinessException("F10301007VS-03: 调查重审 核对象结论 af31 为空！");
		}
		*/
		/*if(AuditConstants.APA011_CODE_1.equals(af31Dto.getApa011())){
			throw new BusinessException("F10301007VS-04:核对象结论已经被 其他管理员 确认通过，不能进行此操作！");
		}
		
		if(AuditConstants.APA011_CODE_2.equals(af31Dto.getApa011())){
			throw new BusinessException("F10301007VS-05:该稽核对象结论已经 其他管理员 被调查重审，不能进行此操作！");
		}*/
		
		//af31Dto.setApa011(AuditConstants.APA011_CODE_2);//设置对象结论 调查重审
		/*af31Dto.setDcbz( Integer.valueOf(AuditConstants.DCBZ_CODE_0));
		
		String operator = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		af31Dto.setAae012(operator);
		
		String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
		
		Integer currentDate = Integer.valueOf(str);//將日期轉換成 Integer類型
		
		af31Dto.setAae034(currentDate);
		
		BeanTools.copyPropertiesIgnoreNull(returnVO , af31Dto);
		
		this.getAdminDisposalBS().updateAf31ByAaz318(aaz318);*/

		
		//String aaz318 = String.valueOf(returnVO.getAaz318());
		String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
		
		Integer currentDate = Integer.valueOf(str);//將日期轉換成 Integer類型
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301007VS-11:根据案件对象，查询 aaz318 为空！");
		}
		
		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		List<Af31> af31s = this.getF10301007BS().getAf31ById(aaz318);
		for (Af31 af31 : af31s) {
			
			Af31 af31F = new Af31();
			
			BeanTools.copyProperties(af31, af31F);
			
			af31F.setDcbz(Integer.getInteger(AuditConstants.DCBZ_CODE_0));
			
			af31F.setJlbz(Integer.getInteger(AuditConstants.JLBZ_CODE_0));
			
			CommonHibernateDaoUtils.update(af31F);
		}
		
		if(af53Dto == null){
			throw new BusinessException("F10301007VS-12:根据 aaz318  查询案件对象 为空！");
		}
			
			af53Dto.setAae426(AuditConstants.AAE426_CODE_3);//设置案件状态为已结案
			
			af53Dto.setAae425(AuditConstants.AAE425_CODE_0);//设置告知终结标志
			
			af53Dto.setAbb025(currentDate);//设置结案 日期
			
			af53Dto = this.getF10301007BS().updateAf53(af53Dto);
			
			AuditConclusionVO returnVO = new AuditConclusionVO();
		
		return returnVO;
	}

	public AuditConclusionVO confirmPass(AuditConclusionVO returnVO) {
		
		if(returnVO == null){
			throw new BusinessException("F10301007VS-06:稽核确认 确认通过 传入returnVO 为空！");
		}
		
		if(!StringTools.hasText(returnVO.getAaz077())){
			throw new BusinessException("F10301007VS-07:稽核确认  确认通过 的时候 传入主键 阿安置 aaz077  为空！");
		}

		Af31DTO af31Dto = this.getAdminDisposalBS().getAf31ById(returnVO.getAaz077());
		
		if(af31Dto == null){
			throw new BusinessException("F10301007VS-08:  确认通过 核对象结论 af31 为空！");
		}
		
		if(AuditConstants.APA011_CODE_1.equals(af31Dto.getApa011())){
			throw new BusinessException("F10301007VS-09:核对象结论已经被 其他管理员 确认通过，不能进行此操作！");
		}
		
		if(AuditConstants.APA011_CODE_2.equals(af31Dto.getApa011())){
			throw new BusinessException("F10301007VS-10:该稽核对象结论已经 其他管理员 被调查重审，不能进行此操作！");
		}
		
		af31Dto.setApa011(AuditConstants.APA011_CODE_1);//设置对象结论 确认通过
		
		String operator = BusinessContextUtils.getUserContext().getOperatorName();//当前操作人
		
		af31Dto.setAae012(operator);
		
		String str = DateUtils.format(new Date(), "yyyyMMdd");//获取当前日期
		
		Integer currentDate = Integer.valueOf(str);//將日期轉換成 Integer類型
		
		af31Dto.setAae034(currentDate);
		
		af31Dto.setAae425(AuditConstants.AAE425_CODE_0);//设置 告知终结标志 尚未告知aae425
		
		af31Dto.setApa168(AuditConstants.APA168_CODE_0);//设置 移交标志 尚未移交 apa168
		
		BeanTools.copyPropertiesIgnoreNull(returnVO , af31Dto);
		
		af31Dto = this.getAdminDisposalBS().updateAf31(af31Dto);
		
		
		//查询一个案件的相关当事人数
		//List<Af31DTO> af31List1 = this.getAdminDisposalBS().queryAf31List(returnVO);
		
		returnVO.setApa011(AuditConstants.APA011_CODE_3);
		
		//查询一个案件的相关当事人结论通过的人数(apa011结论确认状态为1，表示确认通过)
		//List<Af31DTO> af31List2 = this.getAdminDisposalBS().queryAf31List(returnVO);
		
		String aaz318 = String.valueOf(returnVO.getAaz318());
		
		if(!StringTools.hasText(aaz318)){
			throw new BusinessException("F10301007VS-11:根据案件对象，查询 aaz318 为空！");
		}
		
		Af53DTO af53Dto = this.getAdminDisposalBS().getAf53ById(aaz318);
		
		if(af53Dto == null){
			throw new BusinessException("F10301007VS-12:根据 aaz318  查询案件对象 为空！");
		}
		
		// 如果满足 af31List1.size()-af31List2.size() == 1 ，就结案
			
			//af53Dto.setAae426(AuditConstants.AAE426_CODE_9);//设置案件状态为已结案
			
			af53Dto.setAae425(AuditConstants.AAE425_CODE_0);//设置告知终结标志
			
			af53Dto.setAbb025(currentDate);//设置结案 日期
			
			af53Dto = this.getAdminDisposalBS().updateAf53(af53Dto);
			
		
		
		//添加黑灰名单
		Ke15DTO ke15Dto = new Ke15DTO();
		
		BeanTools.copyPropertiesIgnoreNull(af31Dto , ke15Dto);
		
		ke15Dto.setAae030(currentDate);//设置当前日期
		
		if(StringTools.hasText(af31Dto.getApe008())){
			
			ke15Dto.setApe035(af31Dto.getApe008());//设置 对象名称
			
		}
		
		boolean flag = false;// 用于判断是否加入黑灰名单
		//判断是都 需要处理
		if(AuditConstants.APA154_CODE_1.equals(af31Dto.getApa154())){
			//纳入重点监控的话，加入灰名单
			//其他的满足其中一个 加入 黑名单
			if(AuditConstants.APA157_CODE_1.equals(af31Dto.getApa157())){
				
				ke15Dto.setApa151(AuditConstants.APA151_CODE_2);//设置灰名单
				
				flag = true;
				
			}else if(AuditConstants.APA155_CODE_1.equals(af31Dto.getApa155()) ||
					AuditConstants.APA156_CODE_1.equals(af31Dto.getApa156())  || 
					AuditConstants.APA158_CODE_1.equals(af31Dto.getApa158())  || 
					AuditConstants.APA161_CODE_1.equals(af31Dto.getApa161())  ||
					AuditConstants.APA162_CODE_1.equals(af31Dto.getApa162())  ||
					AuditConstants.APA163_CODE_1.equals(af31Dto.getApa163())){
				
				ke15Dto.setApa151(AuditConstants.APA151_CODE_1);//设置黑名单
				
				flag = true;
				
			}
			
		}else if(AuditConstants.APA154_CODE_0.equals(af31Dto.getApa154())){
			flag = false;
		}else{
			flag = false;
		}
				
		if(flag){
			
			ke15Dto = this.getAdminDisposalBS().SavaKe15(ke15Dto);
			
			// 更新基础信息表的监控等级
			if(!StringTools.hasText(af31Dto.getAaz010())){
				throw new BusinessException("F10301007VS-13:根据 af31 查询 aaz010 为空  ！");
			}
			
			String apa151 = this.getAdminDisposalBS().getKe15Apa151ByAaz010(af31Dto.getAaz010());
			
			if(StringTools.hasText(apa151)){
				
				//参保人
				if(AuditConstants.APA709_CODE_1.equals(af31Dto.getApa709())){
					
					Ac01DTO ac01Dto = getAdminDisposalBS().getAc01ById(af31Dto.getAaz010());
					
					ac01Dto.setApa151(apa151);
					
					ac01Dto = this.getAdminDisposalBS().updateAc01(ac01Dto);
				}
				
				//医师
				if(AuditConstants.APA709_CODE_2.equals(af31Dto.getApa709())){
					
					Kf05DTO kf05Dto = getAdminDisposalBS().getKf05ById(af31Dto.getAaz010());
					
					kf05Dto.setApa151(apa151);
					
					kf05Dto = this.getAdminDisposalBS().updateKf05(kf05Dto);
				}
				
				//医疗服务机构
				if(AuditConstants.APA709_CODE_3.equals(af31Dto.getApa709())){
					
					Kb01DTO kb01Dto = getAdminDisposalBS().getKb01ById(af31Dto.getAaz010());
					
					kb01Dto.setApa151(apa151);
					
					kb01Dto = this.getAdminDisposalBS().updateKb01(kb01Dto);
				}
			}
		}
		
		return returnVO;
	}

	/**
	 * 确认待审批
	 */
	public CaseDetailsVO confirmToSurvey(CaseDetailsVO resultVO) {
		
		Af53DTO af53DTO = new Af53DTO();
		
		af53DTO.setAaz318(resultVO.getAaz318());
		
		af53DTO = getF10301007BS().confirmToSurvey(af53DTO);
		
		return resultVO;
	}
	
}
