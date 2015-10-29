/** 
 * @(#)WorkspaceAction.java Dec 28, 2009
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

package com.wondersgroup.wssip.local.application.workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.StringUtils;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.wssip.application.workspace.AbstractWorkspaceAction;
import com.wondersgroup.wssuap.core.base.model.BaseUapMenuResource;

/**
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class WorkspaceAction extends AbstractWorkspaceAction {

	private List<BaseUapMenuResource> topMenuList = new ArrayList<BaseUapMenuResource>();

	private Map<String, List<BaseUapMenuResource>> topChildMenuList = new TreeMap<String, List<BaseUapMenuResource>>();

	private List<BaseUapMenuResource> secondMenuList;

	private String menuId;

	private BaseUapMenuResource menuResource = new BaseUapMenuResource();

	public String doTop() {
		topMenuList = getTopMenus();
		topChildMenuList = getAllChildMenus(topMenuList);
		return SUCCESS;
	}

	public String doLeft() {
		String menuId = getServletRequest().getParameter("menuId");
		if (StringUtils.isNotBlank(menuId)) {
			menuResource = getMenuResourceById(Long.parseLong(menuId));
			topMenuList = getChildMenus(menuId);
			topChildMenuList = getAllChildMenus(topMenuList);
		} else {
			menuResource = new BaseUapMenuResource();
			topMenuList = new ArrayList<BaseUapMenuResource>();
		}
		return SUCCESS;
	}

	public String doSecodeMenu() {
		if (StringUtils.isNotBlank(menuId)) {
			topMenuList = new ArrayList<BaseUapMenuResource>(getChildMenus(menuId));
			Collections.reverse(topMenuList);
		}
		return SUCCESS;
	}
	
	public String doTitle(){
		if(StringUtils.isNotBlank(menuId)){
			if("password".equals(menuId)){
				menuResource.setUrl("密码修改");
			}else{
				
				BaseUapMenuResource rootMenu = getApplicationRootMenu();
				menuResource = getMenuResourceById(Long.parseLong(menuId));
				BaseUapMenuResource menu  = getMenuResourceById(Long.parseLong(menuId));
				String path = menu.getName();
				while(true){
					menu = getMenuResourceById(menu.getParentmenuid());
					if(menu == null){
						break;
					}
					if(menu.getParentmenuid() == null || menu.getParentmenuid() == rootMenu.getMenuid()){
						break;
					}
					path = menu.getName() + " > " + path;
				}
				
				path = "["+menuResource.getCode()+"]"+path;
				menuResource.setUrl(path);
			}
		}
		return SUCCESS;
	}
	
	public String doBar() {
		return SUCCESS;
	}

	public String doMain() {
		return SUCCESS;
	}
	
	public String getUserId() {
		if (getSession().get(WSSIP_OPERATOR_ID) != null) {
			return (String) getSession().get(WSSIP_OPERATOR_ID);
		}else {
			throw new BusinessException("未登录或者登录超时，请重新登录!");
		}
	}

	public String getUserName() {
		if (getSession().get(WSSIP_OPERATOR_NAME) != null) {
			return (String) getSession().get(WSSIP_OPERATOR_NAME);
		}else {
			throw new BusinessException("未登录或者登录超时，请重新登录!");
		}
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public void setTopMenuList(List<BaseUapMenuResource> topMenuList) {
		this.topMenuList = topMenuList;
	}

	public void setTopChildMenuList(Map<String, List<BaseUapMenuResource>> topChildMenuList) {
		this.topChildMenuList = topChildMenuList;
	}

	public void setSecondMenuList(List<BaseUapMenuResource> secondMenuList) {
		this.secondMenuList = secondMenuList;
	}

	public void setMenuResource(BaseUapMenuResource menuResource) {
		this.menuResource = menuResource;
	}

	public BaseUapMenuResource getMenuResource() {
		return menuResource;
	}

	public List<BaseUapMenuResource> getTopMenuList() {
		return topMenuList;
	}

	public Map<String, List<BaseUapMenuResource>> getTopChildMenuList() {
		return topChildMenuList;
	}

	public List<BaseUapMenuResource> getSecondMenuList() {
		return secondMenuList;
	}
	
}
