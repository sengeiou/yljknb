package com.wondersgroup.local.k5.f10504001.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k2.f10204001.vo.PreCheckVO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10504001.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10504001.vo.QueryDocVO;
import com.wondersgroup.local.k5.f10504001.vs.F10504001VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;

public class ComplaintHandlingInfoAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private ComplaintHandlingKc62VO complaintHandlingKc62VO = new ComplaintHandlingKc62VO();

	private F10504001VS f10504001InfoVs;
	
	public F10504001VS getF10504001InfoVs() {
		return f10504001InfoVs;
	}

	public void setF10504001InfoVs(F10504001VS f10504001InfoVs) {
		this.f10504001InfoVs = f10504001InfoVs;
	}

	public ComplaintHandlingKc62VO getComplaintHandlingKc62VO() {
		return complaintHandlingKc62VO;
	}

	public void setComplaintHandlingKc62VO(
			ComplaintHandlingKc62VO complaintHandlingKc62VO) {
		this.complaintHandlingKc62VO = complaintHandlingKc62VO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getComplaintHandlingKc62VO();
	}
	
	@Override
	protected String operate() {
		return super.operate();
	}
	
    public String queryComplaintHandlingPage(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));

		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO = this.getF10504001InfoVs().queryComplaintHandlingPage(page, complaintHandlingKc62VO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
    
   public String queryComplaintHandlingInfoDetail(){
		
	    ComplaintHandlingKc62VO resultVO = new ComplaintHandlingKc62VO();
    	
    	BeanTools.copyProperties(complaintHandlingKc62VO, resultVO);
		
		resultVO = this.getF10504001InfoVs().queryComplaintHandlingInfoDetail(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
   
   // start  医生协助 //
   public String updateComplaintHandlingKc62(){
		String submitData=this.getServletRequest().getParameter("submitData");
		String tag=this.getServletRequest().getParameter("tag");
		String baz021=this.getServletRequest().getParameter("baz021");
		
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
			kc81Vo.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
			kc81Vo.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
			kc81Vo.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
			listKc81.add(kc81Vo);
		}else if("2".equals(tag)||"4".equals(tag)){
			String data[]=submitData.split(",");
			if(data.length>0){
				for (int i = 0; i < data.length; i++) {
					ComplaintHandlingKC86VO kc81Vos=new ComplaintHandlingKC86VO();
					kc81Vos.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
					kc81Vos.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
					kc81Vos.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
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
				kc81Vo.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
				kc81Vo.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
				kc81Vo.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
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
	 
		QueryDocVO returnVO=this.getF10504001InfoVs().updateComplaintHandlingKc62(listKc81);
		
		String result = prefix  + VOUtils.getJsonData(returnVO) + suffex;
	    	
	    createJSonData(result);
	    	
	    return AJAX;
  }
   // end 医生协助 //
    
   //   直接申诉
   public String preCheckZjss(){
	   
	   PreCheckVO returnVO = new PreCheckVO();
		String ids=this.getServletRequest().getParameter("ids");
		String baz021=this.getServletRequest().getParameter("baz021");
		returnVO.setOperatorId((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ID));
		returnVO.setOperatorName((String) getSession().get(SessionConstants.WSSIP_OPERATOR_NAME));
		returnVO.setOrgan((String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME));
		String baz031 = this.getServletRequest().getParameter("baz031");
		String fname=this.getServletRequest().getParameter("fname");
		String fpath=this.getServletRequest().getParameter("fpath");
		String filedataFileName=this.getServletRequest().getParameter("filedataFileName");
		returnVO.setIds(ids);
		returnVO.setBaz021(baz021);
		returnVO.setBaz031(baz031);
		returnVO.setRealpath(fpath);
		returnVO.setTargetFileName(fname);
		returnVO.setFiledataFileName(filedataFileName);
		returnVO = this.getF10504001InfoVs().preCheckZjssDetail(returnVO);
	   
		String result = prefix + VOUtils.getJsonData(returnVO) + suffex;

		createJSonData(result);
    	
	    return AJAX;
   }

}
