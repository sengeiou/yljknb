/** 
/** 
/** 
 * @(#)AbstractWorkspaceAction.java Dec 28, 2009
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

package com.wondersgroup.wssip.application.workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.struts2.action.BaseAction;
import com.wondersgroup.wssip.application.ApplicationConstants;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssuap.client.menu.MenuService;
import com.wondersgroup.wssuap.core.base.model.BaseUapMenuResource;
import com.wondersgroup.wssuap.core.base.model.bo.UapUser;

/**
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public abstract class AbstractWorkspaceAction extends BaseAction implements ApplicationConstants, SessionConstants {

	private MenuService menuService;

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	@SuppressWarnings("unchecked")
	protected Map<String, List<BaseUapMenuResource>> getApplicationMenus() {
		UapUser uapUser = (UapUser) getSession().get(SessionConstants.WSSIP_OPERATOR);

		if (uapUser == null) {
			throw new BusinessException("δ��¼���ߵ�¼��ʱ�������µ�¼��");
		}
		//cl 20140827
		Map<String, List<BaseUapMenuResource>> applicationMenusMap = (Map<String, List<BaseUapMenuResource>>)getSession().get("menu"); 
		
		return applicationMenusMap;
	}
	
	/**
	 * ��ȡϵͳ��˵�
	 */
	protected BaseUapMenuResource getApplicationRootMenu(){
		
		Map<String, List<BaseUapMenuResource>> applicationMenusMap = getApplicationMenus();
		
		List<BaseUapMenuResource> rootMenuList = applicationMenusMap.get(null);
		
		return rootMenuList != null ? rootMenuList.get(0) : new BaseUapMenuResource();
	}

	/**
	 * ��ȡ�����˵��б�
	 */
	protected List<BaseUapMenuResource> getTopMenus() {
		
		List<BaseUapMenuResource> topMenuList = null;
		
		BaseUapMenuResource rootMenu = getApplicationRootMenu();
		
		if(rootMenu != null){
			topMenuList = getChildMenus(String.valueOf(rootMenu.getMenuid()));
		}
		
		return topMenuList;
	}

	/**
	 * ��ݸ��˵���ʾ��ȡ�Ӳ˵��б�
	 */
	protected List<BaseUapMenuResource> getChildMenus(String parentMenuId) {
		Map<String, List<BaseUapMenuResource>> applicationMenusMap = getApplicationMenus();

		List<BaseUapMenuResource> childMeunList = applicationMenusMap.get(parentMenuId);

		return childMeunList != null ? childMeunList : new ArrayList<BaseUapMenuResource>();
	}

	/**
	 * ��ȡ���и��˵����Ӳ˵�
	 */
	protected Map<String, List<BaseUapMenuResource>> getAllChildMenus(List<BaseUapMenuResource> parentMenus) {

		Map<String, List<BaseUapMenuResource>> childMenuMap = new HashMap<String, List<BaseUapMenuResource>>();
		if (parentMenus != null) {
			for (BaseUapMenuResource parentMenu : parentMenus) {
				List<BaseUapMenuResource> childMenus = getChildMenus(String.valueOf(parentMenu.getMenuid()));
				childMenuMap.put(String.valueOf(parentMenu.getMenuid()), childMenus);
			}
		}
		return childMenuMap;
	}
	
	protected BaseUapMenuResource getMenuResourceById(Long menuId) {
		return menuService.getMenuResource(menuId);
	}

	protected BaseUapMenuResource getParentMenuResourceById(Long menuId) {
		BaseUapMenuResource childMenuResource = menuService.getMenuResource(menuId);
		return menuService.getMenuResource(childMenuResource.getParentmenuid());
	}

}
