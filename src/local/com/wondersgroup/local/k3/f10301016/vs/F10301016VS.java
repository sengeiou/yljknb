package com.wondersgroup.local.k3.f10301016.vs;

import java.util.Map;

import com.wondersgroup.bc.medicarecostaudit.medaudit.model.dto.Ke04DTO;
import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.local.k3.f10301016.vo.InquiryInputVO;


public interface F10301016VS {

	/**
	 * 查询笔录
	 * @param page
	 * @param inquiryInputVO
	 * @return
	 */
	Map<String, Object> queryAf37WithPage(Page page,InquiryInputVO inquiryInputVO);

	/**
	 * 保存笔录
	 * @param inquiryInputVO
	 * @return
	 */
	InquiryInputVO saveInquiry(InquiryInputVO inquiryInputVO);

	/**
	 * 查询修改笔录
	 * @param inquiryInputVO
	 * @return
	 */
	InquiryInputVO loadInquiry(InquiryInputVO inquiryInputVO);

	/**
	 * 保存修改笔录
	 * @param inquiryInputVO
	 * @return
	 */
	InquiryInputVO updateAf37(InquiryInputVO inquiryInputVO);

	/**
	 * 删除询问笔录
	 * @param aaz381s
	 * @return
	 */
	InquiryInputVO deleteInquiryByIds(String aaz381s);
	/**
	 * 获取导出询问笔录word数据
	 * @param inquiryInputVO
	 * @return
	 */
	Map<String, Object> queryAf37WithMap(InquiryInputVO inquiryInputVO);

	Ke04DTO getKe04ById(InquiryInputVO inquiryInputVO);
	
}
