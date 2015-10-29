package com.wondersgroup.local.k5.f10509001.vs.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.wondersgroup.bc.k2.K2Context;
import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.k5.f10509001.bs.F10509001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc65DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc83DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke03DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.local.k5.f10509001.vo.F10509001VO;
import com.wondersgroup.local.k5.f10509001.vo.Kc83VO;
import com.wondersgroup.local.k5.f10509001.vs.F10509001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10509001VSImpl implements F10509001VS {

	private F10509001BS f10509001BS;

	public F10509001BS getF10509001BS() {
		return f10509001BS;
	}

	public void setF10509001BS(F10509001BS f10509001bs) {
		f10509001BS = f10509001bs;
	}

	public Map<String, Object> queryMedDocument(Page page,
			F10509001VO f10509001vo) {

		if (f10509001vo == null) {
			throw new BusinessException(
					"F10204001VS-00:分页查询违规单据统计信息传入f10204001vo为空!");
		}

		Kc65DTO queryDto = new Kc65DTO();

		BeanTools.copyProperties(f10509001vo, queryDto);

		Page result = this.getF10509001BS().queryKc65WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}


	public F10509001VO queryMedDocumentDetailIllegal(F10509001VO f10509001vo) {

		if (f10509001vo == null) {
			throw new BusinessException(
					"F10204001VS-01:查询单据明细违规信息传入f10204001vo为空!");
		}

		Kc65DTO kc65Dto = this.getF10509001BS().getKc65ById(
				f10509001vo.getBaz011());

		if (!StringTools.hasText(kc65Dto.getBaz011())) {
			throw new BusinessException("F10204001VS-02:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10509001vo, queryDto);

		List<Kc72DTO> kc72List = this.getF10509001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc65Dto, f10509001vo);

		f10509001vo.setKc72List(kc72List);

		return f10509001vo;
	}


	public Kc83VO uploadFile(Kc83VO kc83vo) {
		if (kc83vo == null || kc83vo.getFiledata() == null) {
			throw new BusinessException("F10509001VS:上传文件为空");
		}
		
		String realpath = ServletActionContext.getServletContext().getRealPath(
				K5Context.UPLOADPATH);// 获取服务器路径
		realpath = realpath.replace('\\', '/');

		String[] str = kc83vo.getFiledataFileName().split("\\.");
		String ftype = str[str.length - 1];
		String sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS")
				.format(new Date());
		String targetFileName = sdf + "." + ftype;
		for (int i = 0; i < 1; i++) {
			File target = new File(realpath, targetFileName);
			try {
				FileUtils.copyFile(kc83vo.getFiledata(), target);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		kc83vo.setRealpath(realpath);
		kc83vo.setTargetFileName(targetFileName);
		return kc83vo;
	}

	public Kc83VO preCheckMedDocDetail(Kc83VO kc83vo) {
		if (!StringTools.hasText(kc83vo.getIds())) {
			throw new BusinessException("F10509001VS:单据传入kc62ids为空！");
		}

		List<Kc65DTO> kc65Dtos = this.getF10509001BS().findCaseID(
				kc83vo.getIds());

		// 主动复议单据明细
		for (Kc65DTO kc65Dto : kc65Dtos) {

			Kc83DTO kc83Dto = new Kc83DTO();

			kc83Dto.setBaz011(kc65Dto.getBaz011());
			kc83Dto.setBaz031(kc65Dto.getBaz031()); // 审核状态
			kc83Dto.setBaz021(kc83vo.getBaz021()); // 审核意见
			kc83Dto.setBaz022(kc83vo.getOperatorName());// 经办人
			kc83Dto.setBaz023(CommonJdbcDaoUtils.queryObject(
					"select sysdate from dual", Date.class));// 经办时间
			kc83Dto.setAae100(K2Context.AAE100_CODE_1);// 有效标志
			kc83Dto.setBaz033("1");// 违规类型
			kc83Dto.setBaz026(kc83vo.getOrgan());//存放经办机构
			if (K2Context.BAZ031_CODE_12.equals(kc83vo.getBaz031())) {
				kc65Dto.setBaz031(K2Context.BAZ031_CODE_12);
				kc65Dto.setAka133(kc83vo.getAka133());
				kc83Dto.setAka131(kc83vo.getAka133());
				kc83Dto.setBaz021("申诉："+kc83vo.getBaz021());
			}else if (K2Context.BAZ031_CODE_13.equals(kc83vo.getBaz031())) {
				kc65Dto.setBaz031(K2Context.BAZ031_CODE_13);
				kc65Dto.setAka134(kc65Dto.getAka132());
				kc83Dto.setBaz021("放弃");
				kc83Dto.setAka131(kc65Dto.getAka132());
			}
			// 保存主动复议日志
			this.getF10509001BS().saveKc83(kc83Dto);
			//获取kc81表的主键
			kc83vo.setBaz013(kc83Dto.getBaz013());
			this.getF10509001BS().updateKc65(kc65Dto);
			//保存上传信息
			if (StringTools.hasText(kc83vo.getTargetFileName())) {

				this.saveUpload(kc83vo);
			}
		}
		return kc83vo;
	}
	
	/**
	 * 保存ke02附件信息
	 * */
	private Kc83VO saveUpload(Kc83VO kc83vo) {
		
		Ke03DTO dto = new Ke03DTO();
		String[] str = kc83vo.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fpath =K5Context.UPLOADPATH+"/"+kc83vo.getTargetFileName();
		String fname = kc83vo.getFiledataFileName();
		
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz013(kc83vo.getBaz013());
		dto = this.getF10509001BS().saveKe03(dto);
		BeanTools.copyProperties(dto, kc83vo);
		
		return kc83vo;
		
	}

}
