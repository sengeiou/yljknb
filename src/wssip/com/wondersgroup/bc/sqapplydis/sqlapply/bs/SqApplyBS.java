/** 
 * @(#)CommunityApplyBS.java Jul 16, 2009
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

package com.wondersgroup.bc.sqapplydis.sqlapply.bs;

import java.util.List;

import com.wondersgroup.bc.sqapplydis.SqApplyStatusConstants;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApply;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApplyData;
import com.wondersgroup.bc.sqapplydis.sqlapply.model.bo.SqApplyDetail;
import com.wondersgroup.framework.core.bo.Page;

/**
 * @author suhualin
 * @version $Revision: 19818 $ Jul 16, 2009
 * @author (lastest modification by $Author: Chenk $)
 * @since 1.0
 */
public interface SqApplyBS extends SqApplyStatusConstants {
	/**
	 * 保存申请信息
	 * 
	 * @param apply
	 *            申请案件信息
	 * @param applyInfo
	 *            JavaBean结构申请数据WithOutFlush
	 */
	<T> void saveApplyInfo(SqApply apply, T applyInfo);
	
	/**
	 * 获取审请详细信息
	 * 
	 * @param <R>
	 * @param clazz:需要转换的DTO
	 * @param bsz005
	 * @return
	 */
	public <R> List<R> querySqApplyDetails(Class<R> clazz, String bsz005);
	
	/**
	 * 保存申请信息
	 * 
	 * @param apply
	 *            申请案件信息
	 * @param applyInfo
	 *            JavaBean结构申请数据WithOutFlush
	 */
	<T> void saveApplyInfoWithOutFlush(SqApply apply, T applyInfo);


	/**
	 * 保存申请案件信息
	 * 
	 * @param apply
	 *            案件信息
	 */
	void saveApply(SqApply apply);

	/**
	 * 修改申请案件信息
	 * 
	 * @param apply
	 *            案件信息
	 */
	void updateSqApply(SqApply apply);

	/**
	 * 获取申请案件信息
	 * 
	 * @param bsz005
	 *            案件标识
	 * @return
	 */
	SqApply getApply(String bsz005);

	/**
	 * 获取审请信息
	 * 
	 * @param page
	 * @return
	 */
	SqApplyData querySqApplyData(String bsz005);

	/**
	 * 获取审请详细信息
	 * 
	 * @param List
	 *            <SqApplyDetail>
	 * @return
	 */
	List<SqApplyDetail> getSqApplyDetail(String bsz005);
	
	/**
	 * 修改申请案件明细信息
	 * 
	 * @param apply
	 *            案件信息
	 */

	void updateSqApplyDetail(SqApplyDetail applydetail);

	/**
	 * 获取申请明细信息
	 * 
	 * @param String
	 */

	SqApplyDetail getSqApplyDetailByBSZ007(String bsz007);

	/**
	 * 获取审请详细信息
	 * 
	 * @param List
	 *            <SqApplyDetail>
	 * @return
	 */
	List<SqApplyDetail> getSqApplyDetail(String bsz005, String status);

	/**
	 * SQ分页查询
	 * 
	 * @param page
	 * @param filters
	 * @param sorts
	 */
	public Page querySqApplyDetailsWithPage(Page page, Class<?> clazz ,String bsz005);

}
