/** 
 * @(#)NavigationAction.java 2008-8-28
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

package com.wondersgroup.wssip.application.workspace;

import java.sql.Timestamp;

import com.wondersgroup.framework.core.web.struts2.action.BaseAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.framework.menu.service.MenuService;

/**
 * 菜单导航统一控制Action
 * 
 * @author Yao Jianping
 * @version $Revision: 13 $ 2008-8-28
 * @author $Date: 2010-04-15 13:19:11 +0800 (周四, 15 四月 2010) $ by $Author: Suhl $
 * @since 1.0
 */
public class NavigationAction extends BaseAction {

	private static final long serialVersionUID = 127726587125791444L;

	@SuppressWarnings("unused")
	private MenuService menuService;

	private final NavigatorInfo navigatorInfo = new NavigatorInfo();

	private String actionType;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	/**
	 * @see com.wondersgroup.framework.core.web.struts2.action.BaseAction#operate()
	 */
	@Override
	protected String operate() {

		if (logger.isDebugEnabled()) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			logger.debug("++load navigation on ：" + timestamp);
		}
		/*String menuItem = getServletRequest().getParameter("menuId");
		String businessType = getBusinessType(menuItem);

		// 设置业务上下文的业务类型
		Environment environment = BusinessContextUtils.getEnvironment();
		environment.setBusinessType(businessType);
		navigatorInfo.setMenuUrl(formatCurrentMenu(menuItem));
		getSession().put(SessionConstants.WSSIP_ENVIRONMENT_BUSINESSTYPE, businessType);*/

		return SUCCESS;
	}

	/**
	 * @see com.wondersgroup.framework.core.web.struts2.action.BaseAction#getValueObject()
	 */
	@Override
	public ValueObject getValueObject() {
		return navigatorInfo;
	}

	/**
	 * 根据当前菜单生成 导航位置信息，如 公共管理 -> 公共基本信息管理 -> 个人信息管理
	 * 
	 * @param menuItem
	 * @return
	 */
	@SuppressWarnings("unused")
	private String formatCurrentMenu(String menuItem) {
		return "导航信息";
	}

	/**
	 * @param menuItem
	 */
	@SuppressWarnings("unused")
	private String getBusinessType(String menuItem) {
		if (menuItem != null && menuItem.length() == 8) {
			return menuItem + "01";
		}
		else {
			return "f" + menuItem;
		}
	}
}
