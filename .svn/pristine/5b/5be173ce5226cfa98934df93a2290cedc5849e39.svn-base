package com.wondersgroup.local.k5.f10506002.vs;


import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10506002.vo.QueryNumberVO;

public interface F10506002VS {

	/**
	 * 申诉处理单据信息KC63
	 * @param page
	 * @author gongwanghai
	 * @return
	 */
	Map<String, Object> queryComplaintHandling(Page page, ComplaintHandlingVO complaintHandlingVO);
	
	/**
     * 申诉处理单据明细信息KC73
     * @param page
     * @param medDocumentVO
     * @return
     */
	ComplaintHandlingVO queryComplaintHandlingDetail(ComplaintHandlingVO complaintHandlingVO);
	
	/**
	 * 申诉处理单据子表明细分页信息KC62
	 * @param page
	 * @author gongwanghai
	 * @return
	 */
	Map<String, Object> queryComplaintHandlingPage(Page page, ComplaintHandlingKc62VO complaintHandlingKc62VO);
	 
	/**
     * 申诉处理单据明细子表信息KC72
     * @param page
     * @param medDocumentVO
     * @return
     */
	ComplaintHandlingKc62VO queryComplaintHandlingInfoDetail(ComplaintHandlingKc62VO complaintHandlingKc62VO);
	
	/**
     * 申诉处理单据明细子表信息KC72
     * @param page
     * @param medDocumentVO
     * @return
     */
	void updateComplaintHandlingKc62(List<ComplaintHandlingKC86VO> listKc81);
	
	/**
	 * 医院汇总
	 * @param akb020
	 * @return
	 */
	List<QueryNumberVO> queryNumber(String akb020);
 
}
