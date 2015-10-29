package com.wondersgroup.local.k5.f10506001.vs.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.wondersgroup.bc.k5.K5Context;
import com.wondersgroup.bc.k5.f10506001.bs.F10506001BS;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc62DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc63DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc72DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc73DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Kc81DTO;
import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke02DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core5.business.context.support.BusinessContextUtils;
import com.wondersgroup.framework.core5.util.ModelUtils;
import com.wondersgroup.local.k5.f10506001.vo.F10506001VO;
import com.wondersgroup.local.k5.f10506001.vo.HosDetailVO;
import com.wondersgroup.local.k5.f10506001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10506001.vo.RuleManageVO;
import com.wondersgroup.local.k5.f10506001.vs.F10506001VS;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.local.commons.util.GridUtils;
import com.wondersgroup.wssip.util.BeanTools;
import com.wondersgroup.wssip.util.DateTools;
import com.wondersgroup.wssip.util.StringTools;

public class F10506001VSImpl implements F10506001VS {
	private F10506001BS f10506001BS;

	public F10506001BS getF10506001BS() {
		return f10506001BS;
	}

	public void setF10506001BS(F10506001BS f10506001bs) {
		f10506001BS = f10506001bs;
	}

	/**
	 * 
	 * @Description:分页查询违规单据统计信息（kc63）
	 * @author 张磊
	 * @date 2015-1-5 下午01:37:33
	 */
	public Map<String, Object> queryViolationsDocumentsCount(Page page,
			F10506001VO f10506001vo) {
		if (f10506001vo == null) {
			throw new BusinessException(
					"F10506001VS-01:分页查询违规单据统计信息传入f10506001vo为空!");
		}
		Kc63DTO queryDto = new Kc63DTO();

		BeanTools.copyProperties(f10506001vo, queryDto);

		Page result = this.getF10506001BS().queryKc63WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	/**
	 * 
	 * @Description:分页查询违规单据明细统计信息(kc62)
	 * @author 张磊
	 * @date 2015-1-5 下午02:09:12
	 */
	public Map<String, Object> queryViolationsDocumentsDetail(Page page,
			F10506001VO f10506001vo) {
		if (f10506001vo.getIds() == null) {
			throw new BusinessException("F10201006VS-00:分页查询传入ids为空!");
		}
		String strid = "";
		String[] ids = f10506001vo.getIds().split(",");
		for (int i = 0; i < ids.length; i++) {
			if ((i + 1) == ids.length) {
				strid += "'" + ids[i] + "'";
			} else {
				strid += "'" + ids[i] + "',";
			}
		}
		Kc62DTO queryDto = new Kc62DTO();

		BeanTools.copyProperties(f10506001vo, queryDto);

		queryDto.setBaz001(strid);

		Page result = this.getF10506001BS().queryKc62WithPage(page, queryDto);

		return GridUtils.getGridData(result);
	}

	/**
	 * 
	 * @Description:查询单据明细违规信息
	 * @author 张磊
	 * @date 2015-1-5 下午02:53:09
	 */
	public F10506001VO queryViolationsDocumentsDetailIllegal(
			F10506001VO f10506001VO) {
		if (f10506001VO == null) {
			throw new BusinessException(
					"F10506001VS-08:查询单据明细违规信息传入f10506001VO为空!");
		}

		Kc63DTO kc63Dto = this.getF10506001BS().getKc63ById(
				f10506001VO.getBaz001());

		if (!StringTools.hasText(kc63Dto.getBaz001())) {
			throw new BusinessException("F10506001VS-10:没有查询到违规单据信息!");
		}

		Kc72DTO queryDto = new Kc72DTO();

		BeanTools.copyProperties(f10506001VO, queryDto);

		List<Kc72DTO> kc72List = this.getF10506001BS().queryKc72(queryDto);

		BeanTools.copyProperties(kc63Dto, f10506001VO);

		f10506001VO.setKc72List(kc72List);

		return f10506001VO;
	}

	/**
	 * 
	 * @Description:查询单据明细审核信息
	 * @author 张磊
	 * @date 2015-1-5 下午03:09:14
	 */
	public List<PreCheckVO> queryCheckRecordByBaz003(String baz003) {
		if (!StringTools.hasText(baz003)) {
			throw new BusinessException("F10506001VS-07:查询违规明细审核记录传入baz003为空!");
		}

		List<PreCheckVO> checkList = new ArrayList<PreCheckVO>();

		Kc81DTO queryDto = new Kc81DTO();
		queryDto.setBaz003(baz003);

		List<Kc81DTO> kc81List = this.getF10506001BS().queryKc81Info(queryDto);

		if (CollectionUtils.isNotEmpty(kc81List)) {
			checkList = ModelUtils.copyAs(kc81List, PreCheckVO.class);
		}

		for (PreCheckVO checkVO : checkList) {
			checkVO.setBaz023Str(DateTools.getYYYYMMDD(checkVO.getBaz023()));
			checkVO.setBaz041Str("[扣款金额:" + checkVO.getBaz041() + "]");
			if (checkVO.getBae041() != null) {
				checkVO.setBae041Str("[医师扣分:" + checkVO.getBae041() + "分]");
			} else {
				checkVO.setBae041Str("[医师扣分:0分]");
			}
		}

		return checkList;
	}

	/**
	 * 
	 * @Description:查询违规单据违规信息
	 * @author 张磊
	 * @date 2015-1-5 下午03:56:55
	 */
	public F10506001VO queryViolationsDocumentIllegal(F10506001VO f10506001VO) {
		if (f10506001VO == null) {
			throw new BusinessException(
					"F10506001VS-09:查询违规单据违规信息传入f10506001VO为空!");
		}

		Kc73DTO queryDto = new Kc73DTO();

		BeanTools.copyProperties(f10506001VO, queryDto);

		List<Kc73DTO> kc73List = this.getF10506001BS().queryKc73(queryDto);

		f10506001VO.setKc73List(kc73List);

		return f10506001VO;
	}


	/**
	 * 
	 * @Description:复议处理
	 * @author 张磊
	 * @return
	 * @date 2015-1-8 上午09:28:59
	 */
	public F10506001VO preCheckMedDocDetail(F10506001VO f10506001vo) {

		if (!StringTools.hasText(f10506001vo.getKc62Ids())) {
			throw new BusinessException("F10506001VS:查询违规明细处理记录传入ids为空!");
		}

		List<Kc62DTO> kc62Dtos = this.getF10506001BS().findCaseID(
				f10506001vo.getKc62Ids());
		int suCount = 0;
		int toCount = 0;
		int erCount = 0;
		toCount = kc62Dtos.size();
		for (Kc62DTO kc62Dto : kc62Dtos) {
			if (K5Context.BAZ102_CODE_4.equals(kc62Dto.getBaz102())
					&& K5Context.BAZ102_CODE_4.equals(f10506001vo.getBaz102())) {
			} else {
				Boolean find = this.getF10506001BS().queryKc05(kc62Dto.getBaz003());
				if (K5Context.BAZ102_CODE_4.equals(f10506001vo.getBaz102())) {
					if (find) {
						suCount++;
					} else {
						erCount++;
						continue;
					}
				}
				
				Kc81DTO kc81dto = new Kc81DTO();
				kc81dto.setBaz001(kc62Dto.getBaz001());
				kc81dto.setBaz003(kc62Dto.getBaz003());
				kc81dto.setBaz031(kc62Dto.getBaz031()); // 审核状态
				if (K5Context.BAZ102_CODE_6.equals(f10506001vo.getBaz102())) {
					kc81dto.setBaz021("放弃复议"); // 放弃复议
				}else {
					kc81dto.setBaz021("提出复议："+f10506001vo.getBaz021()); // 复议处理意见
				}
				kc81dto.setBaz022(f10506001vo.getOperatorName()); // 经办人
				kc81dto.setBaz023(CommonJdbcDaoUtils.queryObject(
						"select sysdate from dual", Date.class));// 经办时间
				kc81dto.setBaz025(K5Context.BAZ025_CODE_2);// 人工审核
				kc81dto.setAae100(K5Context.AAE100_CODE_1);// 有效标志
				kc81dto.setAae002(CommonJdbcDaoUtils.queryObject("select sysdate from dual", Date.class));
				kc81dto.setBaz026(f10506001vo.getOrgan());
				kc81dto.setBaz033(kc62Dto.getBaz033());// 明细违规
				kc81dto.setBaz101(kc62Dto.getBaz101());
				kc81dto.setBaz102(f10506001vo.getBaz102());// 复议状态
				f10506001BS.saveKc81Info(kc81dto);
				// 返回kc81的主键
				f10506001vo.setBaz005(kc81dto.getBaz005());
				// 同步单据明细复议状态
				kc62Dto.setBaz102(f10506001vo.getBaz102());
				if (K5Context.BAZ102_CODE_5.equals(f10506001vo.getBaz102())) {
					kc62Dto.setBaz102(K5Context.BAZ102_CODE_5);
				} else if (K5Context.BAZ102_CODE_1.equals(f10506001vo
						.getBaz102())) {
					kc62Dto.setBaz102(K5Context.BAZ102_CODE_1);
				} else if (K5Context.BAZ102_CODE_6.equals(f10506001vo
						.getBaz102())) {
					kc62Dto.setBaz102(K5Context.BAZ102_CODE_6);
				}
				kc62Dto.setBaz022(f10506001vo.getOperatorName());
				kc62Dto.setBaz023(new Date());
				this.getF10506001BS().updateKc62(kc62Dto);

				if (StringTools.hasText(f10506001vo.getTargetFileName())) {

					this.saveUpload(f10506001vo);
				}

			}
		}
		f10506001vo.setToCount(toCount);
		f10506001vo.setErCount(erCount);
		f10506001vo.setSuCount(suCount);
		return f10506001vo;
	}

	/**
	 * 
	 * @Description:获取规则类别
	 * @author 张磊
	 * @date 2015-1-8 上午10:23:11
	 */
	public String getGzlbJson() {
		StringBuffer json = new StringBuffer();
		List<RuleManageVO> ybgzfls = f10506001BS.getYbgzfl();
		json.append("[");
		for (int i = 0; i < ybgzfls.size(); i++) {
			json.append("{");
			json.append("id:'" + ybgzfls.get(i).getYbgzflbm() + "',");
			json.append("text:'" + ybgzfls.get(i).getYbgzflmc() + "'");
			json.append("}");
			if (i < ybgzfls.size() - 1) {
				json.append(",");
			}
		}
		json.append("]");
		return json.toString();
	}

	/**
	 * 
	 * @Description:获取规则名称
	 * @author 张磊
	 * @date 2015-1-8 上午10:23:19
	 */
	public String getGzxxJson(String bm) {
		StringBuffer json = new StringBuffer();
		List<RuleManageVO> ybgzfls = this.f10506001BS.getYbgzflxx(bm);
		json.append("[");
		for (int i = 0; i < ybgzfls.size(); i++) {
			json.append("{");
			json.append("id:'" + ybgzfls.get(i).getYbgzflbm() + "',");
			json.append("text:'" + ybgzfls.get(i).getYbgzflmc() + "'");
			json.append("}");
			if (i < ybgzfls.size() - 1) {
				json.append(",");
			}
		}
		json.append("]");
		return json.toString();
	}

	public List<HosDetailVO> queryMedDocumentByHos(HosDetailVO hosDetailVO) {
		if (hosDetailVO == null) {
			throw new BusinessException("F10506001VS-01:hosDetailVO为空!");
		}
		List<HosDetailVO> list = this.f10506001BS
				.queryMedDocumentByHos(hosDetailVO);
		return list;
	}

	/**
	 * 保存ke02附件信息
	 * */
	private F10506001VO saveUpload(F10506001VO f10506001vo) {
		Ke02DTO dto = new Ke02DTO();
		String[] str = f10506001vo.getTargetFileName().split("\\.");
		String ftype = str[str.length - 1];
		String fpath = K5Context.UPLOADPATH + "/"
				+ f10506001vo.getTargetFileName();
		String fname = f10506001vo.getFiledataFileName();
		String fuser = BusinessContextUtils.getUserContext().getOperatorName();// 当前操作人
		dto.setBaz035(ftype);
		dto.setBaz036(fpath);
		dto.setBaz037(fname);
		dto.setBaz038(fuser);
		dto.setBaz005(f10506001vo.getBaz005());
		dto = this.getF10506001BS().saveKe02(dto);
		BeanTools.copyProperties(dto, f10506001vo);
		return f10506001vo;
	}

	public List<Map<String, Object>> findKc62ByIds(String ids) throws ParseException {
		if(!StringTools.hasText(ids)) {
			throw new BusinessException("F10201002-12: 未获取到相应的Ids");
		}
		
		String strids = "";
		String[] id = ids.split(",");
		for (int i = 0; i < id.length; i++) {
			if ((i + 1) == id.length) {
				strids += "'" + id[i] + "'";
			} else {
				strids += "'" + id[i] + "',";
			}
		}
		List<Map<String, Object>> listKc62 = this.getF10506001BS().findKc62List(strids);
		
		return listKc62;
	}

}
