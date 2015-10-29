package com.wondersgroup.wssip.application.workspace;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;

/**
 * 刷新Action，防止登录过期
 * 
 * @author suhualin
 * @version $Revision: 13 $ Dec 24, 2009
 * @author (lastest modification by $Author: Suhl $)
 * @since 1.0
 */
public class RefreshAction extends BaseAjaxAction {
	private static final long serialVersionUID = 7062311565191723756L;

	public String doRefresh() {
		this.createJSonData("{\"success\":true,result:\"refresh1\"}");
		return AJAX;
	}

	public String doRefresh2() {
		this.createJSonData("{\"success\":true,result:\"refresh2\"}");
		return AJAX;
	}
}
