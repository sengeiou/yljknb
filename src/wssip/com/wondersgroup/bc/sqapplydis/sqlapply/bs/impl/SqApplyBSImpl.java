/** 
 * @(#)CommunityApplyBSImpl.java Jul 16, 2009
 * 
 * Copyright (c) 1995-2009 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Wonders Group.
 * (Social Security Department). You shall not disclose such
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with Wonders Group. 
 *
 * Distributable under GNU LGPL license by gnu.org
 */

package com.wondersgroup.bc.sqapplydis.sqlapply.bs.impl;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.bc.sqapplydis.sqlapply.bs.SqApplyBS;
import com.wondersgroup.bc.sqapplydis.sqlapply.mapping.MappingUtils;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApply;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApplyData;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApplyDetail;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.commons.dao.utils.CommonHibernateDaoUtils;
import com.wondersgroup.wssip.commons.dao.utils.CommonJdbcDaoUtils;
import com.wondersgroup.wssip.util.StringTools;

/**
 * @author suhualin
 * @version $Revision: 19818 $ Jul 16, 2009
 * @author (lastest modification by $Author $)
 * @since 1.0
 */
public class SqApplyBSImpl implements SqApplyBS {


	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#saveApply(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply,
	 *      com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApplyData, java.util.List)
	 */
	public void saveApply(SqApply apply, SqApplyData applyData, List<SqApplyDetail> applyDetails) {
		if (apply.getBsz005() == null) {
			String bsz005 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BSZ005");
			apply.setBsz005(bsz005);
			apply.setStatus(APPLYSTATUS_INIT);
			try{
			CommonHibernateDaoUtils.save(apply);
			}catch(Exception e ){
				e.printStackTrace();
			}
		}
		else {
			deleteApplyData(apply.getBsz005());
		}

		if (applyData != null) {
			applyData.setBsz005(apply.getBsz005());
			CommonHibernateDaoUtils.save(applyData);
		}

		if (applyDetails != null) {
			long xh = 1;
			for (SqApplyDetail detail : applyDetails) {
				String bsz007 = CommonHibernateDaoUtils.getSequenceValue("SEQ_BSZ007");
				detail.setBsz007(bsz007);
				detail.setBsz005(apply.getBsz005());
				detail.setXh(xh++);
				try{
				CommonHibernateDaoUtils.save(detail);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#saveApply(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply,
	 *      com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApplyData, java.util.List)
	 */
	public void saveApplyWithOutFlush(SqApply apply, SqApplyData applyData, List<SqApplyDetail> applyDetails) {
		if (apply.getBsz005() == null) {
			apply.setStatus(APPLYSTATUS_INIT);
			CommonHibernateDaoUtils.save(apply);
		}
		else {
			deleteApplyData(apply.getBsz005());
		}

		if (applyData != null) {
			applyData.setBsz005(apply.getBsz005());
			CommonHibernateDaoUtils.save(applyData);
		}

		if (applyDetails != null) {
			long xh = 1;
			for (SqApplyDetail detail : applyDetails) {
				
				detail.setBsz005(apply.getBsz005());
				detail.setXh(xh++);
				CommonHibernateDaoUtils.save(detail);
			}
		}
		
		CommonHibernateDaoUtils.flushSession();
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#saveApplyInfo(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply,
	 *      java.lang.Object)
	 */
	public <T> void saveApplyInfo(SqApply apply, T applyInfo) {
		List<SqApplyDetail> detailInfos = new ArrayList<SqApplyDetail>();

		SqApplyData applyData = MappingUtils.fromBean(SqApplyData.class, detailInfos, applyInfo, SqApplyDetail.class);

		saveApply(apply, applyData, detailInfos);
	}
	/** 
	 * @see com.wondersgroup.wssip.bc.sqapply.bs.SqApplyBS#saveApplyInfoWithOutFlush(com.wondersgroup.wssip.bc.sqapply.model.bo.SqApply, java.lang.Object)
	 */
	public <T> void saveApplyInfoWithOutFlush(SqApply apply, T applyInfo) {
		List<SqApplyDetail> detailInfos = new ArrayList<SqApplyDetail>();

		SqApplyData applyData = MappingUtils.fromBean(SqApplyData.class, detailInfos, applyInfo, SqApplyDetail.class);

		saveApplyWithOutFlush(apply, applyData, detailInfos);
		
	}

	/**
	 * @see com.wondersgroup.cayth.wsbs.apply.service.WsbsApplyService#deleteApplyData(long)
	 */
	public void deleteApplyData(String bsz005) {

	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#getApply(java.lang.String)
	 */
	public SqApply getApply(String bsz005) {
		return CommonHibernateDaoUtils.load(SqApply.class, bsz005);
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#saveApply(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply)
	 */
	public void saveApply(SqApply apply) {
		CommonHibernateDaoUtils.save(apply);
	}

	/**
	 * 获取审请信息
	 * 
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#querySqApplyData(java.lang.String)
	 */
	public SqApplyData querySqApplyData(String bsz005) {
		// return CommonHibernateDaoUtils.get(" from SqApplyData where bsz005=?", bsz005);
		return CommonJdbcDaoUtils.get("select * from Sq_Apply_Data where bsz005=?", SqApplyData.class, bsz005);
	}

	/**
	 * 获取审请详细信息
	 * 
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#getSqApplyDetail(java.lang.String)
	 */
	public List<SqApplyDetail> getSqApplyDetail(String bsz005) {
		// return CommonHibernateDaoUtils.find(" from SqApplyDetail where bsz005=?", bsz005);
		return CommonJdbcDaoUtils.query("select * from Sq_Apply_Detail where bsz005=? order by xh",
				SqApplyDetail.class, bsz005);
	}


	/**
	 * 修改申请案件信息
	 * 
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#updateSqApply(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply)
	 */
	public void updateSqApply(SqApply apply) {
		CommonHibernateDaoUtils.update(apply);
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#updateSqApplyDetail(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApplyDetail)
	 */
	public void updateSqApplyDetail(SqApplyDetail applydetail) {
		CommonHibernateDaoUtils.update(applydetail);
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#getSqApplyDetailByBSZ007(java.lang.String)
	 */
	public SqApplyDetail getSqApplyDetailByBSZ007(String bsz007) {
		return CommonHibernateDaoUtils.load(SqApplyDetail.class, bsz007);
	}

	/**
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#getSqApplyDetail(java.lang.String,
	 *      java.lang.String)
	 */
	public List<SqApplyDetail> getSqApplyDetail(String bsz005, String status) {
		if (!StringTools.hasText(bsz005)) {
			throw new BusinessException("bsz005 is null");
		}
		String hql = "from SqApplyDetail where bsz005='" + bsz005 + "'";
		if (StringTools.hasText(status)) {
			hql += " and status='" + hql + "'";
		}
		return CommonHibernateDaoUtils.find(hql);
	}

	/** 
	 * @see com.wondersgroup.wssip.bc.sqapply.bs.SqApplyBS#saveApplyInfos(com.wondersgroup.wssip.bc.sqapply.model.bo.SqApply, java.lang.Object)
	 */
	public <T> void saveApplyInfos(SqApply apply, T applyInfo) {
		
		List<SqApplyDetail> detailInfos = new ArrayList<SqApplyDetail>();

		SqApplyData applyData = MappingUtils.fromBean(SqApplyData.class, detailInfos, applyInfo, SqApplyDetail.class);

		saveApplys(apply, applyData, detailInfos);
	}
	
	/**
	 * JDBC通用
	 * @see com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.bs.SqApplyBS#saveApply(com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApply,
	 *      com.wondersgroup.wssip.bc.baseinfomgmt.communityapplymgr.model.bo.SqApplyData, java.util.List)
	 */
	public void saveApplys(SqApply apply, SqApplyData applyData, List<SqApplyDetail> applyDetails) {
		if (apply.getBsz005() == null) {
			apply.setStatus(APPLYSTATUS_INIT);
			CommonHibernateDaoUtils.save(apply);
		}
		else {
			deleteApplyData(apply.getBsz005());
		}

		if (applyData != null) {
			applyData.setBsz005(apply.getBsz005());
			CommonHibernateDaoUtils.save(applyData);
		}

		if (applyDetails != null) {
			long xh = 1;
			for (SqApplyDetail detail : applyDetails) {
				
				detail.setBsz005(apply.getBsz005());
				detail.setXh(xh++);
				CommonHibernateDaoUtils.save(detail);
			}
		}
	}
	
	public <R> List<R> querySqApplyDetails(Class<R> clazz, String bsz005) {
		if (!StringTools.hasText(bsz005)) {
			throw new BusinessException("bsz005 is null ");
		}
		StringBuffer queryQL = new StringBuffer();
		StringBuffer columns = new StringBuffer();

		/**
		 * 最大支持40个业务字段，如修改除修改数据库和映射外，还需要修改业务功能的程序映射INDEX
		 */
		for (int i = 1; i < 41; ++i) {

			if (i != 1)
				columns.append(",");

			columns.append("DATA").append(i < 10 ? "0" + i : i);
		}
		columns.append(",bsz007,bsz005,code,xh,status ");
		queryQL.append("select ").append(columns.toString());
		queryQL.append(" from sq_apply_detail where bsz005=?");
		
		return CommonJdbcDaoUtils.querySqApplyDetails(queryQL.toString(), clazz, bsz005);
		
	}
	
	public Page querySqApplyDetailsWithPage(Page page, Class<?> clazz ,String bsz005) {
		
		StringBuffer queryQL = new StringBuffer();
		StringBuffer columns = new StringBuffer();

		/**
		 * 最大支持40个业务字段，如修改除修改数据库和映射外，还需要修改业务功能的程序映射INDEX
		 */
		for (int i = 1; i < 41; ++i) {

			if (i != 1)
				columns.append(",");

			columns.append("DATA").append(i < 10 ? "0" + i : i);
		}
		columns.append(",bsz007,bsz005,code,xh,status ");
		queryQL.append("select ").append(columns.toString());
		queryQL.append(" from sq_apply_detail where bsz005= ? ");
		
		
		
		return CommonJdbcDaoUtils.querySqApplyDetailsWithPage(page,queryQL.toString(), clazz ,bsz005);
		
	}

}
