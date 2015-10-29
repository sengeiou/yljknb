package com.wondersgroup.local.k2.f10204002.vs.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k2.f10204002.bs.F10204002BS;
import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k2.f10204002.vo.F10204002VO;
import com.wondersgroup.local.k2.f10204002.vo.Kc62VO;
import com.wondersgroup.local.k2.f10204002.vo.PreCheckVO;
import com.wondersgroup.local.k2.f10204002.vs.F10204002VS;
import com.wondersgroup.local.k2.f10204003.vo.GatherVO;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10204002VSImpl implements F10204002VS {

	private F10204002BS f10204002BS;

	public F10204002BS getF10204002BS() {
		return f10204002BS;
	}

	public void setF10204002BS(F10204002BS f10204002bs) {
		f10204002BS = f10204002bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10204002VO f10204002vo) {
		if (f10204002vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10204002vo, queryDto);

		Page result = this.getF10204002BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public Map<String, Object> queryMedDocumentDetail(Page page,
			F10204002VO f10204002vo) {
		if (f10204002vo.getIds() == null) {
			throw new BusinessException("F10204002VS-00:分页查询传入ids为空！");
		}

		String strid = "";
		String[] ids = f10204002vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62VO queryDto = new Kc62VO();

		BeanTools.copyProperties(f10204002vo, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getF10204002BS().queryKc62WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	public F10204002VO queryMedDocumentDetailIllegal(F10204002VO f10204002vo) {
		if (f10204002vo == null) {
			throw new BusinessException(
					"F10204002VS-01:查询单据明细违规信息传入f10204002vo为空!");
		}

		Kc63DTO kc63Dto = this.getF10204002BS().getKc63ById(
				f10204002vo.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10204002VS-02:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10204002vo, queryDto);

		List<Kc72DTO> kc72List = this.getF10204002BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, f10204002vo);

		f10204002vo.setKc72List(kc72List);

		return f10204002vo;
	}

	/**
	 * 
	 * 主动复议批量操作
	 */
	public PreCheckVO preCheckMedDocDetail(PreCheckVO returnVO) {
		if (!StringTools.hasText(returnVO.getIds())) {
			//System.out.println(returnVO.getIds());
			throw new BusinessException("F10204002VS:主动复议单据明细传入kc62ids为空！");
		}

		if (!StringTools.hasText(returnVO.getBaz021())) {
			throw new BusinessException("F10204002VS:主动复议单据明细信息传入baz021为空!");
		}

		if (!StringTools.hasText(returnVO.getBaz102())) {
			throw new BusinessException("F10204002VS:主动复议单据明细信息传入baz102为空!");
		}

		List<Kc62DTO> kc62Dtos = this.getF10204002BS().findCaseID(
				returnVO.getIds());

		// 主动复议单据明细
		for (Kc62DTO kc62Dto : kc62Dtos) {

			Kc81DTO kc81Dto = new Kc81DTO();

			kc81Dto.setBaz001(kc62Dto.getBaz001());
			kc81Dto.setBaz003(kc62Dto.getBaz003());
			kc81Dto.setBaz031(kc62Dto.getBaz031()); // 审核状态
			kc81Dto.setBaz021(returnVO.getBaz021()); // 审核意见
			kc81Dto.setBaz022(returnVO.getOperatorName());// 经办人
			kc81Dto.setBaz023(CommonJdbcDaoUtils.queryObject(
					"select sysdate from dual", Date.class));// 经办时间
			// 审核类型(人工审核)
			kc81Dto.setBaz025(K2Context.BAZ025_CODE_2);
			kc81Dto.setAae100(K2Context.AAE100_CODE_1);// 有效标志
			kc81Dto.setBaz033(kc62Dto.getBaz033());// 违规类型
			kc81Dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));// 经办月份
			kc81Dto.setBaz026(returnVO.getOrgan());//存放经办机构
			kc81Dto.setBaz102(returnVO.getBaz102()); // 复议状态改变
			kc81Dto.setBaz021("主动复议申请："+kc81Dto.getBaz021());
			// 保存主动复议日志
			this.getF10204002BS().saveKc81(kc81Dto);
			
			//获取kc81表的主键
			returnVO.setBaz005(kc81Dto.getBaz005());

			// 同步单据明细复议状态
			kc62Dto.setBaz102(returnVO.getBaz102());
			if (K2Context.BAZ102_CODE_1.equals(returnVO.getBaz102())) {
				kc62Dto.setBaz102(K2Context.BAZ102_CODE_1);
			}

			kc62Dto.setBaz022(returnVO.getOperatorName());
			kc62Dto.setBaz023(new Date());
			this.getF10204002BS().updateKc62(kc62Dto);
			
			//保存上传信息
			if (StringTools.hasText(returnVO.getTargetFileName())) {

				this.saveUpload(returnVO);
			}

		}

		return returnVO;

	}

	public PreCheckVO uploadFile(PreCheckVO resultVO) {
		if (resultVO == null || resultVO.getFiledata() == null) {
			throw new BusinessException("F10204002VS-02:上传文件为空");
		}
		
		String realpath = ServletActionContext.getServletContext().getRealPath(
				K5Context.UPLOADPATH);// 获取服务器路径
		realpath = realpath.replace('\\', '/');

		String[] str = resultVO.getFiledataFileName().split("\\.");
		String ftype = str[str.length - 1];
		String sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS")
				.format(new Date());
		String targetFileName = sdf + "." + ftype;
		for (int i = 0; i < 1; i++) {
			File target = new File(realpath, targetFileName);
			try {
				FileUtils.copyFile(resultVO.getFiledata(), target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		resultVO.setRealpath(realpath);
		resultVO.setTargetFileName(targetFileName);
		return resultVO;
	}

	/**
	 * 保存ke02附件信息
	 * */
	private PreCheckVO saveUpload(PreCheckVO returnVO) {
		
		Ke02DTO dto = new Ke02DTO();
		String[] str = returnVO.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fpath =K5Context.UPLOADPATH+"/"+returnVO.getTargetFileName();
		String fname = returnVO.getFiledataFileName();
		
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz005(returnVO.getBaz005());
		dto = this.getF10204002BS().saveKe02(dto);
		BeanTools.copyProperties(dto, returnVO);
		
		return returnVO;
		
	}

	/**
	 * 查询医院汇总信息
	 * 
	 * @param akb020
	 * @return
	 */
	public List<GatherVO> searchWithHospital(String akb020) {
		List<GatherVO> result = this.getF10204002BS().queryWithHospital(akb020);
		return result;
	}
	
}
