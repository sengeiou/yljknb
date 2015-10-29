package com.wondersgroup.local.k5.f10505001.action;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10505001.vo.SubmitVO;
import com.wondersgroup.local.k5.f10505001.vs.F10505001VS;
import com.wondersgroup.wssip.application.SessionConstants;

@SuppressWarnings("serial")
public class DocSubmitAction extends BaseAjaxAction{
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	private F10505001VS f10505001VS;
	private SubmitVO submitVO=new SubmitVO();
	public F10505001VS getF10505001VS() {
		return f10505001VS;
	}
	public void setF10505001VS(F10505001VS f10505001vs) {
		f10505001VS = f10505001vs;
	}
	public void setSubmintVO(SubmitVO submitVO) {
		this.submitVO = submitVO;
	}
	public SubmitVO getSubmintVO() {
		return submitVO;
	}
	@Override
	public ValueObject getValueObject() {
		return this.getSubmintVO();
	}

	@Override
	protected String operate() {
		SubmitVO resultVO = new SubmitVO();
		String ids=this.getServletRequest().getParameter("ids");
		String ysyj=this.getServletRequest().getParameter("ysyj");
		String fname=this.getServletRequest().getParameter("fname");
		String fpath=this.getServletRequest().getParameter("fpath");
		String filedataFileName=this.getServletRequest().getParameter("filedataFileName");
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		ysyj=(groupName+"："+ysyj);//给编辑内容加登录人的组织结构名称
		submitVO.setIds(ids);
		submitVO.setComments(ysyj);
		submitVO.setRealpath(fpath);
		submitVO.setTargetFileName(fname);
		submitVO.setFiledataFileName(filedataFileName);
		resultVO=this.getF10505001VS().docSubmit(submitVO);
		String result = prefix + VOUtils.getJsonData(resultVO) + suffex;		
		return result;
	}

}
