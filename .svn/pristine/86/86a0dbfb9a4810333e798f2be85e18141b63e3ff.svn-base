package com.wondersgroup.local.k5.f10505001.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10505001.vo.Kc62VO;
import com.wondersgroup.local.k5.f10505001.vs.F10505001VS;
import com.wondersgroup.wssip.application.SessionConstants;

@SuppressWarnings("serial")
public class DocApplyDetailAction extends BaseAjaxAction {
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10505001VS f10505001VS;
	private Kc62VO kc62VO = new Kc62VO();

	public F10505001VS getF10505001VS() {
		return f10505001VS;
	}

	public void setF10505001VS(F10505001VS f10505001vs) {
		f10505001VS = f10505001vs;
	}

	public Kc62VO getKc62VO() {
		return kc62VO;
	}

	public void setKc62VO(Kc62VO kc62VO) {
		this.kc62VO = kc62VO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getKc62VO();
	}

	@Override
	protected String operate() {
		return super.operate();
	}

	/**
	 * 查询代医师申述的单据对应的明细
	 * **/
	public String queryMedDocumentDetail() {

		int start = Integer.parseInt(this.getServletRequest().getParameter(
				"pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter(
				"pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);

		Map<String, Object> resultVO = null;

		resultVO = this.getF10505001VS().queryMedDocumentDetail(page, kc62VO);

		String result = VOUtils.getJsonData(resultVO);

		createJSonData(result);

		return AJAX;

	}
	// start  医生协助 //
	   public String updateComplaintHandlingKc62(){
			String submitData=this.getServletRequest().getParameter("submitData");
			String tag=this.getServletRequest().getParameter("tag");
			String baz021=this.getServletRequest().getParameter("baz021");
			String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
			baz021=(groupName+"："+baz021);//给编辑内容加登录人的组织结构名称
			ComplaintHandlingKC86VO kc81Vo=new ComplaintHandlingKC86VO();
			
			List<ComplaintHandlingKC86VO> listKc81=new ArrayList<ComplaintHandlingKC86VO>();
			if("1".equals(tag)){
				String data[]=submitData.split(":");
				kc81Vo.setBaz001(data[0]);
				kc81Vo.setBaz003(data[1]);
				kc81Vo.setBaz031(data[2]);
				kc81Vo.setBaz101(data[3]);
				kc81Vo.setBaz021(data[4]);
				kc81Vo.setBaz033(data[5]);
				kc81Vo.setBazValue(data[6]);
				listKc81.add(kc81Vo);
			}else if("2".equals(tag)||"4".equals(tag)){
				String data[]=submitData.split(",");
				if(data.length>0){
					for (int i = 0; i < data.length; i++) {
						ComplaintHandlingKC86VO kc81Vos=new ComplaintHandlingKC86VO();
						String baz[]=data[i].split(":");
						
						kc81Vos.setBaz001(baz[0]);
						kc81Vos.setBaz003(baz[1]);
						kc81Vos.setBaz031(baz[2]);
						kc81Vos.setBaz101(baz[3]);
						kc81Vos.setBaz033(baz[4]);
						kc81Vos.setBazValue(baz[5]);
						kc81Vos.setBaz021(baz021);
						listKc81.add(kc81Vos);
					}
				}else{
					String tags[]=submitData.split(":");

					kc81Vo.setBaz001(tags[0]);
					kc81Vo.setBaz003(tags[1]);
					kc81Vo.setBaz031(tags[2]);
					kc81Vo.setBaz101(tags[3]);
					kc81Vo.setBaz033(tags[4]);
					kc81Vo.setBazValue(tags[5]);
					kc81Vo.setBaz021(baz021);
					listKc81.add(kc81Vo);
				}
			}
		 
			this.getF10505001VS().updateComplaintHandlingKc62(listKc81);
			
			String result = prefix  + VOUtils.getJsonData(kc62VO) + suffex;
		    	
		    createJSonData(result);
		    	
		    return AJAX;
	  }
	   // end 医生协助 //
}
