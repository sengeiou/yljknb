package com.wondersgroup.local.k5.f10505001.vs;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10505001.vo.F10505001VO;
import com.wondersgroup.local.k5.f10505001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10505001.vo.SubmitVO;

public interface F10505001VS {
	/**
	 * 查询代医师申述的单据列表 baz031='04' and baz101='2'
	 * **/
	public Map<String, Object> queryMedDocument(Page page, F10505001VO f10505001vo);

	/**
	 * 查询代医师申述的单据对应的明细
	 * **/
	public Map<String, Object> queryMedDocumentDetail(Page page, Kc62VO kc62VO);


	/**
	 * 医师申述处理日志
	 * */
	public SubmitVO docSubmit(SubmitVO submintVO);

	/**
	 * 上传文件
	 * */
	public SubmitVO upload(SubmitVO vo);
	
	/**
     * 申诉处理单据明细子表信息KC72
     * @param page
     * @param medDocumentVO
     * @return
     */
	public void updateComplaintHandlingKc62(
			List<ComplaintHandlingKC86VO> listKc81);
}
