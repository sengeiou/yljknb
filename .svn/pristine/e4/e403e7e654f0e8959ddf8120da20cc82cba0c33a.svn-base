/** 
 * @(#)DicAction.java Sep 4, 2008
 * 
 * Copyright (c) 1995-2008 Wonders Information Co.,Ltd. 
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

package com.wondersgroup.wssip.application.dictionary;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.wsscclib.dictionary.spec.dao.CodeNameDAO.MatchMode;
import com.wondersgroup.wssip.commons.dictionary.DictionaryUtils;
import com.wondersgroup.wssip.commons.dictionary.codes.bo.Aa09;
import com.wondersgroup.wssip.commons.dictionary.codes.bo.Aa10;

/**
 * 字典Action，用于字典查询
 * 
 * @author suhualin
 * @version $Revision: 13 $ Dec 24, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class DicAction extends BaseAjaxAction {

	private static final long serialVersionUID = 1L;

	private DicVO dicVO = new DicVO();


	/**
	 * @see com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction#operate()
	 */
	@Override
	protected String operate() {

		List<DicVO> resultList = getDicList(dicVO);
		if (CollectionUtils.isNotEmpty(resultList)) {
			DicVO empty = new DicVO();
			resultList.add(0, empty);
		}
		String result = VOUtils.getJsonDataFromCollection(resultList);
		return result;
	}

	/**
	 * @see com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction#getValueObject()
	 */
	@Override
	public ValueObject getValueObject() {
		return dicVO;
	}

	public DicVO getDicVO() {
		return dicVO;
	}

	public void setDicVO(DicVO dicVO) {
		this.dicVO = dicVO;
	}

	/**
	 * @see com.wondersgroup.demo.workspace.vs.DicVS#getDicList(com.wondersgroup.demo.workspace.vo.DicVO)
	 */
	public List<DicVO> getDicList(DicVO dicVO) {

		String codeType = dicVO.getCodeType();
		String code = dicVO.getCode();
		long parentId = dicVO.getParentId();
		String codeLike = dicVO.getCodeLike();
		int likeMode = dicVO.getLikeMode();
		if (logger.isDebugEnabled()) {
			logger.debug("codeType=" + codeType);
			logger.debug("code=" + code);
			logger.debug("parentId=" + parentId);
			logger.debug("codeLike=" + codeLike);
			logger.debug("likeMode=" + likeMode);
			logger.debug("full=" + dicVO.isFull());
		}

		List<DicVO> resultList = new ArrayList<DicVO>();

		if (StringUtils.isBlank(codeType)) {
			return resultList;
		}

		if (!"".equals(codeLike)) {
			// 取相关业务类型的字典代码
			Aa09 aa09 = DictionaryUtils.getCodeService().getCodeTypeByCode(codeType);

			List<Aa10> list = new ArrayList<Aa10>();
			switch (likeMode) {
			case 0:
				list = DictionaryUtils.getCodeService()
						.findCodeInfosByTypeAndCodeLike(aa09, codeLike, MatchMode.PREFIX);
				break;

			case 1:
				list = DictionaryUtils.getCodeService()
						.findCodeInfosByTypeAndCodeLike(aa09, codeLike, MatchMode.SUFFIX);
				break;

			case 2:
				list = DictionaryUtils.getCodeService().findCodeInfosByTypeAndCodeLike(aa09, codeLike,
						MatchMode.ANYWHERE);
				break;
			case 3: {
				if (codeLike.length() == 2) {

					List<Aa10> list1 = DictionaryUtils.getCodeService().findCodeInfosByTypeAndCodeLike(aa09, codeLike,
							MatchMode.PREFIX);
					for (int i = 0; i < list1.size(); i++) {
						Aa10 aa10 = list1.get(i);
						String acode = aa10.getCode();
						if (acode.equals(codeLike + "0000")) {
							continue;
						}
						else {
							if (acode.substring(4, 6).equals("00")) {
								list.add(aa10);
							}
							else {
								continue;
							}
						}
					}
				}
				else if (codeLike.length() == 4) {
					List<Aa10> list2 = DictionaryUtils.getCodeService().findCodeInfosByTypeAndCodeLike(aa09, codeLike,
							MatchMode.PREFIX);
					for (int i = 0; i < list2.size(); i++) {
						Aa10 aa10 = list2.get(i);
						String acode = aa10.getCode();
						if (acode.equals(codeLike + "00")) {
							continue;
						}
						else {
							list.add(aa10);
						}
					}
				}
				else {

					list = DictionaryUtils.getCodeService().findCodeInfosByTypeAndCodeLike(aa09, "0000",
							MatchMode.SUFFIX);

				}
			}
			}

			resultList = copyProperties(list);
			return resultList;
		}

		if (StringUtils.isNotEmpty(dicVO.getParentCode())) {
			// 取父代码下的属于该类别的子代码,需要codeType 和 parentId
			Aa09 childCodeType = DictionaryUtils.getCodeService().getCodeTypeByCode(codeType);
			Aa09 parentCodeType = null;
			if (StringUtils.isNotEmpty(dicVO.getParentCodeType())) {
				parentCodeType = DictionaryUtils.getCodeService().getCodeTypeByCode(dicVO.getParentCodeType());
			}
			else {
				parentCodeType = childCodeType;
			}
			Aa10 aa10 = DictionaryUtils.getCodeService()
					.getCodeInfoByTypeAndCode(parentCodeType, dicVO.getParentCode());

			List<Aa10> list = null;
			if (dicVO.isFull()) {
				list = DictionaryUtils.getFullCodeService().getChildCodes(childCodeType, aa10);
			}
			else {
				list = DictionaryUtils.getCodeService().getChildCodes(childCodeType, aa10);
			}
			resultList = copyProperties(list);
			return resultList;
		}

		if (parentId == 0) {
			// 取代码类别下全部代码,需要codeType
			Aa09 aa09 = DictionaryUtils.getCodeService().getCodeTypeByCode(codeType);
			List<Aa10> list = null;
			if (dicVO.isFull()) {
				list = DictionaryUtils.getFullCodeService().getAllCodes(aa09);
			}
			else {
				list = DictionaryUtils.getCodeService().getAllCodes(aa09);
			}
			resultList = copyProperties(list);
			return resultList;

		}
		else if (parentId > 0) {
			// 取父代码下的属于该类别的子代码,需要codeType 和 parentId
			Aa09 aa09 = DictionaryUtils.getCodeService().getCodeTypeByCode(codeType);
			Aa10 aa10 = DictionaryUtils.getCodeService().getCodeInfoById(parentId);

			List<Aa10> list = null;
			if (dicVO.isFull()) {
				list = DictionaryUtils.getFullCodeService().getChildCodes(aa09, aa10);
			}
			else {
				list = DictionaryUtils.getCodeService().getChildCodes(aa09, aa10);
			}
			resultList = copyProperties(list);
			return resultList;
		}

		return resultList;
	}

	private List<DicVO> copyProperties(List<Aa10> list2) {
		List<DicVO> resultList = new ArrayList<DicVO>();
		for (int i = 0; i < list2.size(); i++) {
			Aa10 a = list2.get(i);
			DicVO b = new DicVO();
			b.setCode(a.getCode());
			b.setCodeType(a.getCatalog().getCode());
			b.setId(String.valueOf(a.getId()));
			b.setCodeTypeId(a.getCatalog().getId());
			b.setName(a.getName());
			resultList.add(b);
		}

		return resultList;
	}
}
