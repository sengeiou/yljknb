package com.wondersgroup.local.k5.f10504002.vs;


import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504002.vo.ComplaintHandlingVO;

public interface F10504002VS {

	/**
	 * 申诉审核单据信息KC63
	 * @param page
	 * @author hry
	 * @return
	 */
	Map<String, Object> queryComplaintHandling(Page page, ComplaintHandlingVO complaintHandlingVO);
	
	/**
     * 申诉审核单据明细信息KC73
     * @param page
     * @param medDocumentVO
     * @return
     */
	ComplaintHandlingVO queryComplaintHandlingDetail(ComplaintHandlingVO complaintHandlingVO);
	
	/**
	 * 申诉审核单据子表明细分页信息KC62
	 * @param page
	 * @author hanruyi
	 * @return
	 */
	Map<String, Object> queryComplaintHandlingPage(Page page, ComplaintHandlingKc62VO complaintHandlingKc62VO);
	 
	/**
     * 申诉审核单据明细子表信息KC72
     * @param page
     * @param medDocumentVO
     * @return
     */
	ComplaintHandlingKc62VO queryComplaintHandlingInfoDetail(ComplaintHandlingKc62VO complaintHandlingKc62VO);
	
	/**
     * 申诉审核单据明细子表信息KC72
     * @param page
     * @param medDocumentVO
     * @return
     */
	void updateComplaintHandlingKc62(List<ComplaintHandlingKC86VO> listKc81);
	
	
}
