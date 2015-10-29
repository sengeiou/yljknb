package com.wondersgroup.wssip.application.workspace;

import java.util.ArrayList;
import java.util.List;

import com.wondersgroup.framework.core.exception.BusinessException;
import com.wondersgroup.framework.core.web.struts2.action.BaseAction;
import com.wondersgroup.framework.menu.bo.MenuResource;
import com.wondersgroup.framework.menu.service.MenuService;
import com.wondersgroup.framework.security.bo.SecurityUser;
import com.wondersgroup.wssip.application.ApplicationConstants;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.commons.security.UserSecurityAgent;

public class FrameAction extends BaseAction implements ApplicationConstants {

	private static final long serialVersionUID = 1L;

	private static final String USER = SessionConstants.WSSIP_OPERATOR;

	private MenuService menuService;

	private List<MenuResource> topMenuList = new ArrayList<MenuResource>();

	@SuppressWarnings("rawtypes")
	private List<List> topChildMenuList = new ArrayList<List>();

	private List<MenuResource> secondMenuList;

	private MenuResource[] topMenus;

	private MenuResource[] secondMenus;

	private long menuId;

	private MenuResource menuResource = new MenuResource();

	@SuppressWarnings("unused")
	private String userId;

	@SuppressWarnings("unused")
	private String userName;

	private boolean devMod = false;

	public String doAuthTop() {
		UserSecurityAgent agent = getSecurityAgent();
		topMenuList = agent.getTopResources(MenuResource.class, "MENU_RESOURCE");
		if (topMenuList == null) {
			topMenuList = new ArrayList<MenuResource>();
		}
		for (MenuResource topMenu : topMenuList) {
			secondMenuList = agent.getChildResources(MenuResource.class, "MENU_RESOURCE", topMenu.getResourceId());
			topChildMenuList.add(secondMenuList != null ? secondMenuList : new ArrayList<MenuResource>());
		}

		return SUCCESS;
	}

	public String doTop() {

		if (!devMod) {
			return doAuthTop();
		}
		else {

			MenuResource rootMenuResource = menuService.getMenuResourceById(Long.parseLong(MENU_ROOT));

			topMenus = menuService.getChildMenuResourceOrderlyByParentMenu(rootMenuResource);

			for (int i = 0; i < topMenus.length; i++) {
				secondMenuList = new ArrayList<MenuResource>();
				secondMenus = menuService.getChildMenuResourceOrderlyByParentMenu(topMenus[i]);
				for (int j = 0; j < secondMenus.length; j++) {
					secondMenuList.add(secondMenus[j]);
				}

				topChildMenuList.add(secondMenuList);

			}
			// 将Top菜单资源数组转成ArrayList
			for (int i = 0; i < topMenus.length; i++) {
				topMenuList.add(topMenus[i]);
			}

			return SUCCESS;
		}
	}

	public String doAuthLeft() {

		if (menuId > 0) {
			UserSecurityAgent agent = getSecurityAgent();
			topMenuList = agent.getChildResources(MenuResource.class, "MENU_RESOURCE", String.valueOf(menuId));
			if (topMenuList == null) {
				topMenuList = new ArrayList<MenuResource>();
			}
			for (MenuResource topMenu : topMenuList) {
				secondMenuList = agent.getChildResources(MenuResource.class, "MENU_RESOURCE", topMenu.getResourceId());
				topChildMenuList.add(secondMenuList != null ? secondMenuList : new ArrayList<MenuResource>());
			}
		}

		return SUCCESS;
	}

	public String doLeft() {

		if (!devMod) {
			doAuthLeft();

		}
		else {
			if (menuId > 0) {

				menuResource = menuService.getMenuResourceById(menuId);
				topMenus = menuService.getChildMenuResourceOrderlyByParentMenu(menuResource);

				for (int i = 0; i < topMenus.length; i++) {
					secondMenuList = new ArrayList<MenuResource>();
					secondMenus = menuService.getChildMenuResourceOrderlyByParentMenu(topMenus[i]);
					for (int j = 0; j < secondMenus.length; j++) {
						secondMenuList.add(secondMenus[j]);
					}

					topChildMenuList.add(secondMenuList);

				}
				// 将Top菜单资源数组转成ArrayList
				for (int i = 0; i < topMenus.length; i++) {
					topMenuList.add(topMenus[i]);
				}
			}

		}

		return SUCCESS;
	}

	public String doLeftbottom() {
		return SUCCESS;
	}

	public String doBar() {
		return SUCCESS;
	}

	public String doTitle() {

		if (menuId > 0) {

			String path = "";
			String smenuId = menuId + "";
			String s1 = smenuId.substring(0, 2);
			String s2 = smenuId.substring(2, 4);
			String s3 = smenuId.substring(4, 6);

			menuResource = menuService.getMenuResourceById(Long.parseLong(s1 + "000000"));
			if (menuResource != null)
				path = path + menuResource.getResourceName();
			menuResource = menuService.getMenuResourceById(Long.parseLong(s1 + s2 + "0000"));
			if (menuResource != null)
				path = path + " > " + menuResource.getResourceName();
			menuResource = menuService.getMenuResourceById(Long.parseLong(s1 + s2 + s3 + "00"));
			if (menuResource != null)
				path = path + " > " + menuResource.getResourceName();
			menuResource = menuService.getMenuResourceById(menuId);
			if (menuResource != null)
				path = "[" + menuResource.getId() + "]" + path + " > " + menuResource.getResourceName();

			menuResource.setExt3(path);
		}

		return SUCCESS;
	}

	public String doAuthSecondMenu() {

		if (menuId > 0) {
			UserSecurityAgent agent = getSecurityAgent();

			List<MenuResource> menus = agent.getChildResources(MenuResource.class, "MENU_RESOURCE", String
					.valueOf(menuId));
			topMenuList = new ArrayList<MenuResource>();
			if (menus != null) {
				for (MenuResource menu : menus) {
					topMenuList.add(0, menu);
				}
			}

			for (MenuResource topMenu : topMenuList) {
				secondMenuList = agent.getChildResources(MenuResource.class, "MENU_RESOURCE", topMenu.getResourceId());
				topChildMenuList.add(secondMenuList != null ? secondMenuList : new ArrayList<MenuResource>());
			}
		}

		return SUCCESS;
	}

	public String doSecondMenu() {

		if (!devMod) {
			doAuthSecondMenu();
		}
		else {
			if (menuId > 0) {

				menuResource = menuService.getMenuResourceById(menuId);
				topMenus = menuService.getChildMenuResourceOrderlyByParentMenu(menuResource);

				for (int i = 0; i < topMenus.length; i++) {
					secondMenuList = new ArrayList<MenuResource>();
					secondMenus = menuService.getChildMenuResourceOrderlyByParentMenu(topMenus[i]);
					for (int j = 0; j < secondMenus.length; j++) {
						secondMenuList.add(secondMenus[j]);
					}

					topChildMenuList.add(secondMenuList);

				}
				// 将Top菜单资源数组转成ArrayList
				for (int i = 0; i < topMenus.length; i++) {
					topMenuList.add(topMenus[topMenus.length - i - 1]);
				}
			}

		}
		return SUCCESS;

	}

	public String doMainleft() {
		return SUCCESS;
	}

	public String doMainright() {
		return SUCCESS;
	}

	public String doMainbottom() {
		return SUCCESS;
	}

	public String doMain() {
		return SUCCESS;
	}

	public String doBar2() {
		return SUCCESS;
	}

	public String doRightmenu() {
		return SUCCESS;
	}

	public String doFoot() {
		return SUCCESS;
	}

	// 

	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public List<MenuResource> getTopMenuList() {
		return topMenuList;
	}

	public void setTopMenuList(List<MenuResource> topMenuList) {
		this.topMenuList = topMenuList;
	}

	public List<MenuResource> getSecondMenuList() {
		return secondMenuList;
	}

	public void setSecondMenuList(List<MenuResource> secondMenuList) {
		this.secondMenuList = secondMenuList;
	}

	@SuppressWarnings("rawtypes")
	public List<List> getTopChildMenuList() {
		return topChildMenuList;
	}

	@SuppressWarnings("rawtypes")
	public void setTopChildMenuList(List<List> topChildMenuList) {
		this.topChildMenuList = topChildMenuList;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public MenuResource getMenuResource() {
		return menuResource;
	}

	public void setMenuResource(MenuResource menuResource) {
		this.menuResource = menuResource;
	}

	public String getUserId() {
		if (getSession().get(USER) != null) {

			SecurityUser user = (SecurityUser) (getSession().get(USER));
			return user.getId() + "";
		}
		else {
			throw new BusinessException("未登录或者登录超时，请重新登录!");
		}
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		if (getSession().get(USER) != null) {
			SecurityUser user = (SecurityUser) (getSession().get(USER));
			return user.getName();
		}
		else {
			return "";
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserSecurityAgent getSecurityAgent() {
		UserSecurityAgent agent = (UserSecurityAgent) getSession().get(SessionConstants.WSSIP_OPERATOR_SECURITYAGENT);
		if (agent != null) {
			return agent;
		}
		else {
			throw new BusinessException("未登录或者登录超时，请重新登录!");
		}
	}
}
