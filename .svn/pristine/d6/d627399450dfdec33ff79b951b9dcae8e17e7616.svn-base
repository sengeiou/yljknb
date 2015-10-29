package com.wondersgroup.local.k5.f10504001.vs;


import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingVO;
import com.wondersgroup.local.k5.f10504001.vo.QueryDocVO;
import com.wondersgroup.local.k5.f10504003.vo.QueryNumberVO;

public interface F10504001VS {

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
	QueryDocVO updateComplaintHandlingKc62(List<ComplaintHandlingKC86VO> listKc81);
	/**
	 * 查询所有的审核操作的医院汇总数据
	 * @param akb020orakb021
	 * @param baz101
	 * @return
	 */
	List<QueryNumberVO> queryNumber(String akb020orakb021,String baz101);

	/**
	 * 申诉处理 -- 直接申诉 
	 * @param returnVO
	 * @return
	 */
	PreCheckVO preCheckZjssDetail(PreCheckVO returnVO);

	List<Map<String, Object>> findKc62ByIds(String ids) throws ParseException;

 
}
