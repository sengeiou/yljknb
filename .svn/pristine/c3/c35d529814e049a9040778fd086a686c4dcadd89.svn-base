package com.wondersgroup.local.k4.f10402007.vs.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.bs.RuleManageBS;
import com.wondersgroup.bc.ruleknowledgemanage.rulemanage.model.dto.TbRuleDxzbDTO;
import com.wondersgroup.bc.sqapplydis.sqlapply.bs.SqApplyBS;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApply;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.local.k4.f10402007.vo.DxzbDetailVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadResultVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbUploadVO;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402007.vo.F10402007VO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;
import com.wondersgroup.wssip.commons.file.ImportResult;
import com.wondersgroup.wssip.commons.file.excel.ExcelService;
import com.wondersgroup.wssip.commons.file.excel.impl.ExcelServiceImpl;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10402007VSImpl implements F10402007VS{
	
	private RuleManageBS ruleManageBS;
	
	private SqApplyBS sqApplyBS;

	public SqApplyBS getSqApplyBS() {
		return sqApplyBS;
	}

	public void setSqApplyBS(SqApplyBS sqApplyBS) {
		this.sqApplyBS = sqApplyBS;
	}


	public RuleManageBS getRuleManageBS() {
		return ruleManageBS;
	}


	public void setRuleManageBS(RuleManageBS ruleManageBS) {
		this.ruleManageBS = ruleManageBS;
	}


	public DxzbVO saveDxzb(DxzbVO dxzbVO) {
		if (dxzbVO == null) {
			throw new BusinessException("传入DxzbVO为空!");
		}

		TbRuleDxzbDTO tbruledxzbdto = new TbRuleDxzbDTO();
		
		BeanTools.copyProperties(dxzbVO, tbruledxzbdto);

		ruleManageBS.SaveTbRuleDxzb(tbruledxzbdto);
		
		BeanTools.copyProperties(tbruledxzbdto, dxzbVO);

		return dxzbVO;
	}


	public Map<String, Object> queryMldx(Page page, DxzbVO dxzbVO) {
		
		Page result = null;
		if(StringUtils.isNotEmpty(dxzbVO.getDxlx())){
			if(dxzbVO.getDxlx().equals("CL")){
				 result	= ruleManageBS.queryCLMl(page, dxzbVO);
			}else if(dxzbVO.getDxlx().equals("FWXM")){
				result = ruleManageBS.queryFwxmMl(page, dxzbVO);
			}else if(dxzbVO.getDxlx().equals("YP")){
				result = ruleManageBS.queryYpMl(page, dxzbVO);
			} 
		}
		else{
			result = ruleManageBS.queryAllMl(page,dxzbVO);
		}
		
		return GridUtils.getGridData(result);
	}


	public Map<String, Object> queryDxzbMessage(Page page, DxzbVO dxzbVO) {
	     Page result=this.getRuleManageBS().queryDxzbMessage(page, dxzbVO);
		
		return GridUtils.getGridData(result);
	}


	public DxzbVO find(String id) {
		DxzbVO resultVO=new DxzbVO();
		if(id==null){
			throw new BusinessException("根据主键查询一个tbruledxzb对象，主键id为空!");
		}
		
		TbRuleDxzbDTO tbruledxzbDTO=this.getRuleManageBS().findtbruledxzb(id);
		BeanTools.copyProperties(tbruledxzbDTO, resultVO);
		return resultVO;
	}


	public DxzbVO updateDxzbMessage(DxzbVO resultVO) {
		
		ruleManageBS.updateTbRuleDxzb(resultVO);
		
		return resultVO;
	}


	public void deleteDxzbRuleMessage(String idStr) {
		this.ruleManageBS.deleteTbRuleDxzb(idStr);
		
	}


	public Map<String, Object> queryCaseWithPage(Page page,
			DxzbVO dxzbVO) {
		  Page result=this.getRuleManageBS().queryDxzbMessage(page, dxzbVO);
			
			return GridUtils.getGridData(result);
	}


	public Map<String, Object> queryGzzbByGzmsId(Page page,String gzdm) {
		if(StringUtils.isEmpty(gzdm)){
			throw new BusinessException("传入规则模块ID为空!");
		}
		 Page resulto=ruleManageBS.queryGzzbByGzmsId(page,gzdm);
		return GridUtils.getGridData(resulto);
	}


	public DxzbUploadResultVO uploadDxzbInfo(DxzbUploadVO dxzbUploadVO) {
		/**
		 * 读取上传的信息
		 */
		List<DxzbVO> dxzbList = this.upload(dxzbUploadVO);
		/**
		 * 校验信息
		 */
		DxzbUploadResultVO upLoadResultVO = this.checkDxzbInfo(dxzbUploadVO, dxzbList);

		return upLoadResultVO;
	}


	private DxzbUploadResultVO checkDxzbInfo(DxzbUploadVO dxzbUploadVO,List<DxzbVO> dxzbList) {

		List<DxzbDetailVO> sucList = new ArrayList<DxzbDetailVO>();
		List<DxzbDetailVO> failerList = new ArrayList<DxzbDetailVO>();

		DxzbUploadResultVO upLoadResultVO = new DxzbUploadResultVO();
		
		
		/**
		 * 后台校验上传的信息
		 */
		for (DxzbVO dxzbVO : dxzbList) {
			
			DxzbDetailVO applyDetailVO = new DxzbDetailVO();
			
			if(!StringTools.hasText(dxzbVO.getMsg())){
				BeanTools.copyProperties(dxzbVO, applyDetailVO);
				Integer count=ruleManageBS.checkDm("select count(*) from TB_DIC_GZMS t where gzdm='"+dxzbVO.getGzdm()+"'");
				if(count==0){
					applyDetailVO.setMsg("在数据库中未找到改规则代码的匹配项");
					failerList.add(applyDetailVO);
					continue;
				}
			}
			if(!StringTools.hasText(dxzbVO.getMsg())){
				BeanTools.copyProperties(dxzbVO, applyDetailVO);
				Integer count=ruleManageBS.checkDm("select count(*) from TB_DIC_GZZB t where zbdm='"+dxzbVO.getZbdm()+"'");
				if(count==0){
					applyDetailVO.setMsg("在数据库中未找到该指标代码的匹配项");
					failerList.add(applyDetailVO);
					continue;
				}
			}
			// 做后台校验...
			BeanTools.copyProperties(dxzbVO, applyDetailVO);
			
			sucList.add(applyDetailVO);
			
		}
		upLoadResultVO.setFailerList(failerList);
		upLoadResultVO.setSuccessList(sucList);
		
		
		/**
		 * 保存至临时数据表
		 */
		if (!CollectionUtils.isEmpty(sucList)) {
			SqApply apply = new SqApply();
			apply.setAaa121("10402007");
			apply.setInsertdate(DateTools.getSystemDate());
			F10402007VO f10402007VO = new F10402007VO();
			f10402007VO.setDetails(sucList);
			this.getSqApplyBS().saveApplyInfo(apply, f10402007VO);
			upLoadResultVO.setBsz005_suc(apply.getBsz005());
		}
		if (!CollectionUtils.isEmpty(failerList)) {
			SqApply apply = new SqApply();
			apply.setAaa121("10402007");
			apply.setInsertdate(DateTools.getSystemDate());
			F10402007VO f10402007VO = new F10402007VO();
			f10402007VO.setDetails(failerList);
			this.getSqApplyBS().saveApplyInfo(apply, f10402007VO);
			upLoadResultVO.setBsz005_fail(apply.getBsz005());
		}
		
		return upLoadResultVO;
	}


	private List<DxzbVO> upload(DxzbUploadVO dxzbUploadVO) {
		
		/**
		 * 上传文件
		 */
		ExcelService excelService = new ExcelServiceImpl();
		ImportResult importResult = null;
		try {
			importResult = excelService.read(new FileInputStream(dxzbUploadVO.getFiledata()), 2);
		}catch (FileNotFoundException e) {
			throw new BusinessException("上传文件失败:" + e.getMessage());
		}
		
		List<List<String>> resultList = importResult.getResultList();
		
		List<DxzbVO> dxzbList = new ArrayList<DxzbVO>();
		
		if (resultList != null && resultList.size() > 0) {
			
			for (int a = 0; a < resultList.size(); a++) {
				
				List<String> result = new ArrayList<String>();
				
				result = resultList.get(a);
				
				DxzbVO dxzbVO = new DxzbVO();
				/**
				 * //取得数据作基本校验...
				 */
				
				if (StringTools.hasText(result.get(0))) {
					dxzbVO.setDxid(result.get(0));
				} else {
					dxzbVO.setMsg("模板中监控对象Id为空!");
				}
				
				if (StringTools.hasText(result.get(1))) {
					dxzbVO.setDxmc(StringTools.trimAllWhitespace(result.get(1)));
				}else{
					dxzbVO.setMsg("模板中对象名称为空!");
				}
				
				if (StringTools.hasText(result.get(2))) {
					dxzbVO.setDxlx(StringTools.trimAllWhitespace(result.get(2)));
				}else{
					dxzbVO.setMsg("模板中对象类型为空!");
				}
				if (StringTools.hasText(result.get(3))) {
					dxzbVO.setGzdm(StringTools.trimAllWhitespace(result.get(3)));
				}else{
					dxzbVO.setMsg("模板中规则代码为空!");
				}
				
				if (StringTools.hasText(result.get(4))) {
					dxzbVO.setMc(StringTools.trimAllWhitespace(result.get(4)));
				}else{
					dxzbVO.setMsg("模板中规则名称为空!");
				}
				if (StringTools.hasText(result.get(5))) {
					dxzbVO.setZbdm(StringTools.trimAllWhitespace(result.get(5)));
				}else{
					dxzbVO.setMsg("模板中指标代码为空!");
				}
				
				if (StringTools.hasText(result.get(6))) {
					dxzbVO.setZbmc(StringTools.trimAllWhitespace(result.get(6)));
				}else{
					dxzbVO.setMsg("模板中指标名称为空!");
				}
				
				if (StringTools.hasText(result.get(7))) {
					dxzbVO.setZbz(StringTools.trimAllWhitespace(result.get(7)));
				}else{
					dxzbVO.setMsg("模板中指标值为空!");
				}
				
				if (StringTools.hasText(result.get(8))) {
					dxzbVO.setGzly(StringTools.trimAllWhitespace(result.get(8)));
				}else{
					dxzbVO.setMsg("模板中规则来源为空!");
				}
				
				if (StringTools.hasText(result.get(9))) {
					dxzbVO.setSm(StringTools.trimAllWhitespace(result.get(9)));
				}else{
					dxzbVO.setMsg("模板中说明为空!");
				}
				
				
				dxzbList.add(dxzbVO);
			}
			
		}
		
		return dxzbList;
	}


	public DxzbVO saveBacthDxzbInfo(DxzbVO resultVO) {
		
		if(!StringTools.hasText(resultVO.getBsz005_suc())){
			throw new BusinessException("传入成功信息ID为空!");
		}
		
		List<DxzbDetailVO> applyDetailVOList = sqApplyBS.querySqApplyDetails(DxzbDetailVO.class,resultVO.getBsz005_suc());
		
		//保存对象指标
		for(DxzbDetailVO dxzbDetail : applyDetailVOList){
			/**
			 * 	//保存对象指标...
			 */
		
			TbRuleDxzbDTO tbruledxzbdto = new TbRuleDxzbDTO();
		
			BeanTools.copyProperties(dxzbDetail, tbruledxzbdto);

			ruleManageBS.SaveTbRuleDxzb(tbruledxzbdto);

		}

		return resultVO;
	}

	public Map<String, Object> queryDxzbApplyInfo(Page page, String bsz005) {
		
//		if(!StringTools.hasText(bsz005)){
//			throw new BusinessException("F10402006VS-12:传入bsz005为空!");
//		}
		
        Page result = this.getSqApplyBS().querySqApplyDetailsWithPage(page, DxzbDetailVO.class, bsz005);

        return GridUtils.getGridData(result);
        
	}


	
}
