/** 
 * @(#) WelcomeBusinessVO.java
 *
 * @(#) com.wondersgroup.mycommon.web.vo.WelcomeBusinessVO
 * @(#) Administrator
 * @(#) 2013-11-13 
 * 
 * Copyright (c) 1995-2010 Wonders Information Co.,Ltd. 
 * 1518 Lianhang Rd,Shanghai 201112.P.R.C.
 * All Rights Reserved.
 * 
 */
package com.wondersgroup.mycommon.web.vo;

import com.wondersgroup.framework.core5.model.vo.ValueObject;

/**
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class WelcomeBusinessVO implements ValueObject {
	
	private String menuid;// 菜单id
	private String link;// 菜单链接
	private String name;// 菜单名字
	
	private int amount;// 代办业务数量
	
	public WelcomeBusinessVO() {
		super();
	}

	public WelcomeBusinessVO(String menuid, String link, String name, int amount) {
		super();
		this.menuid = menuid;
		this.link = link;
		this.name = name;
		this.amount = amount;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMenuid() {
		return menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	
	
}
