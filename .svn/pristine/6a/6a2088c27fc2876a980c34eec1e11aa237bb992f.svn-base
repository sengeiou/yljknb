package com.wondersgroup.local.k3.f10301010.vs.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.bo.ApprovalClassList;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af31DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af32DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.Af53DTO;
import com.wondersgroup.bc.auditadministrativedisposal.admindis.model.dto.CaseInfoDTO;
import com.wondersgroup.bc.k3.f10301010.bs.F10301010BS;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.UserContext;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k3.f10301010.vo.QueryApprovalVo;
import com.wondersgroup.local.k3.f10301010.vo.QueryRecheckVO;
import com.wondersgroup.local.k3.f10301010.vo.QueryRegisterVO;
import com.wondersgroup.local.k3.f10301010.vo.StateCheckVO;
import com.wondersgroup.local.k3.f10301010.vs.F10301010VS;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10301010VSImpl implements F10301010VS {
	
	private F10301010BS f10301010BS;
	public F10301010BS getF10301010BS() {
		return f10301010BS;
	}
	public void setF10301010BS(F10301010BS f10301010bs) {
		f10301010BS = f10301010bs;
	}

	public Map<String, Object> queryRecheck(Page page,QueryRecheckVO queryRecheckVO) {
		
		if(queryRecheckVO == null){
			
			throw new BusinessException("F10301010VS-00:分页查询复审信息传入queryRecheckVO为空!");
			
		}
		
		CaseInfoDTO queryDto = new CaseInfoDTO();
		
		BeanTools.copyProperties(queryRecheckVO,queryDto);
		
		Page result = this.getF10301010BS().queryRecheckDetail(page, queryDto);
		
		
		return GridUtils.getGridData(result);
	}
	
	public Map<String, Object> queryRegister(Page page, QueryRegisterVO queryRegisterVO) {
		if(queryRegisterVO == null){
			throw new BusinessException("F10301010VS-01:分页查询复审登陆信息表queryRegisterVO为空!");
		}
		
			Af32DTO queryDto = new Af32DTO();
		
			BeanTools.copyProperties(queryRegisterVO,queryDto);
		
			Page result = this.getF10301010BS().queryRegisterDetail(page, queryDto);
		
		for (int i = 0; i < result.getResult().size(); i++) {
			Af32DTO af32Dto = (Af32DTO) result.getResult().get(i);
			
			//案件受理日期
			if(af32Dto.getApe711()!=null && af32Dto.getApe711()!=0){
				Date ape711s = DateTools.parseDate(
					String.valueOf(af32Dto.getApe711()), "yyyyMMdd");
				af32Dto.setApe711s(ape711s);
			}
			//现场稽核日期
			/*if(af32Dto.getApe716()!=null && af32Dto.getApe716()!=0){
				Date ape716s = DateTools.parseDate(
					String.valueOf(af32Dto.getApe716()), "yyyyMMdd");
				af32Dto.setApe716s(ape716s);
				}*/
			}
			return GridUtils.getGridData(result);
		}
	
	public StateCheckVO StateCheck(StateCheckVO stateCheckVO) {

		if(!StringTools.hasText(stateCheckVO.getIds())){
			throw new BusinessException("F10301010VS-02:传入ids为空！");
		}
		if (!StringTools.hasText(stateCheckVO.getAae426())) {
			throw new BusinessException("F10301010VS-03:传入aae426为空!");
		}
		
		if (!StringTools.hasText(stateCheckVO.getAae189())) {
			throw new BusinessException(
					"F10301010VS-04:案件审核意见aae189为空!");
		}
		
		 String aae189 = stateCheckVO.getAae189();
		 List<Af53DTO> af53Dtos = this.getF10301010BS().findCaseID(stateCheckVO.getIds());

		 //修改审案状态和插入记录
		 for(Af53DTO af53Dto : af53Dtos){
			Af31DTO af31DTO= new Af31DTO();
			
			af31DTO.setAaz318(af53Dto.getAaz318());
			af31DTO.setAaa027(af53Dto.getAaa027());
		
			af31DTO.setAae036(new Date());
			af31DTO.setAae189(aae189);
			af53Dto.setAae426(stateCheckVO.getAae426());
			/*	af31DTO.setAcc789(acc789);
			af31DTO.setAaz177(aaz177);
			//保存操作日志
			this.getF10301010BS().saveAf31(af31DTO);*/
			
			//更新审案状态
			this.getF10301010BS().updateAf53(af53Dto);
		}
		return stateCheckVO;
	}
	
	
	public List<QueryApprovalVo> queryData(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if(approvalVo.getAaz318()==null||approvalVo.getAaz318()==0){
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}
		return this.getF10301010BS().queryApprovalData(approvalVo);
	}
	
	
	public QueryApprovalVo operateApproval(QueryApprovalVo approvalVo) {
		if (approvalVo == null) {
			throw new BusinessException("CommonVSImpl:传入vo为空");
		}
		if(approvalVo.getAaz318()==null||approvalVo.getAaz318()==0){
			throw new BusinessException("CommonVSImpl:传入稽核案件id为空");
		}
		
		UserContext userContext = BusinessContextUtils.getUserContext();
		String ailmen = userContext.getOperatorName();
		approvalVo.setAilmen(ailmen);
		approvalVo.setAiltime(new Date());
		ApprovalClassList acl = this.getF10301010BS().qryMaxApprovalId();
		if(approvalVo.getAclid().equals(acl.getAclid())){
			 String aae189 = approvalVo.getAilyj();
			 List<Af53DTO> af53Dtos = this.getF10301010BS().findCaseID(approvalVo.getAaz318()+"");

			 //修改审案状态和插入记录
			 for(Af53DTO af53Dto : af53Dtos){
				Af31DTO af31DTO= new Af31DTO();
				
				af31DTO.setAaz318(af53Dto.getAaz318());
				af31DTO.setAaa027(af53Dto.getAaa027());
			
				af31DTO.setAae036(new Date());
				af31DTO.setAae189(aae189);
				if("是".equals(approvalVo.getAiltg())){
					af53Dto.setAae426("3");
					af53Dto.setAae427("3");
				}else if("否".equals(approvalVo.getAiltg())){
					af53Dto.setAae426("1");
				}
				approvalVo.setAilspfl(1);
				//更新审案状态
				this.getF10301010BS().updateAf53(af53Dto);
			}
		}
		return this.getF10301010BS().operateApproval(approvalVo);
	}
	
	public Af53DTO endProcess(Af53DTO af53dto) {
		return this.getF10301010BS().updateAf53(af53dto);
	}
	
	
	
	
}
