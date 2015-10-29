package com.wondersgroup.local.k5.f10506002.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKC86VO;
import com.wondersgroup.local.k5.f10506002.vo.ComplaintHandlingKc62VO;
import com.wondersgroup.local.k5.f10506002.vo.QueryNumberVO;
import com.wondersgroup.local.k5.f10506002.vs.F10506002VS;
import com.wondersgroup.wssip.application.SessionConstants;
import com.wondersgroup.wssip.util.BeanTools;

public class ComplaintHandlingInfoAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private ComplaintHandlingKc62VO complaintHandlingKc62VO = new ComplaintHandlingKc62VO();
	
	private F10506002VS f10506002InfoVs;
	
	public F10506002VS getF10506002InfoVs() {
		return f10506002InfoVs;
	}

	public void setF10506002InfoVs(F10506002VS f10506002InfoVs) {
		this.f10506002InfoVs = f10506002InfoVs;
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
		
		resultVO = this.getF10506002InfoVs().queryComplaintHandlingPage(page, complaintHandlingKc62VO);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
    
   public String queryComplaintHandlingInfoDetail(){
		
	    ComplaintHandlingKc62VO resultVO = new ComplaintHandlingKc62VO();
    	
    	BeanTools.copyProperties(complaintHandlingKc62VO, resultVO);
		
		resultVO = this.getF10506002InfoVs().queryComplaintHandlingInfoDetail(resultVO);
		
        String result = prefix  + VOUtils.getJsonData(resultVO) + suffex;
    	
    	createJSonData(result);
    	
    	return AJAX;
		
	}
   
   // start 直接申诉 AND 医生协助 //
   public String updateComplaintHandlingKc62(){
		String submitData=this.getServletRequest().getParameter("submitData");
		String tag=this.getServletRequest().getParameter("tag");
		String baz021=this.getServletRequest().getParameter("baz021");
		
		ComplaintHandlingKC86VO kc81Vo=new ComplaintHandlingKC86VO();
		String groupName=(String) getSession().get(SessionConstants.WSSIP_OPERATOR_ORGANNAME);
		baz021=(groupName+"："+baz021);//给编辑内容加登录人的组织结构名称
		List<ComplaintHandlingKC86VO> listKc81=new ArrayList<ComplaintHandlingKC86VO>();
		if("1".equals(tag)){
			String data[]=submitData.split(":");
			kc81Vo.setBaz001(data[0]);
			kc81Vo.setBaz003(data[1]);
			kc81Vo.setBaz031(data[2]);
			kc81Vo.setBaz102(data[3]);
			kc81Vo.setBaz021(data[4]);
			kc81Vo.setBaz033(data[5]);
			kc81Vo.setBazValue(data[6]);
			listKc81.add(kc81Vo);
		}else if("2".equals(tag)){
			String data[]=submitData.split(",");
			if(data.length>0){
				for (int i = 0; i < data.length; i++) {
					ComplaintHandlingKC86VO kc81Vos=new ComplaintHandlingKC86VO();
					String baz[]=data[i].split(":");
					
					kc81Vos.setBaz001(baz[0]);
					kc81Vos.setBaz003(baz[1]);
					kc81Vos.setBaz031(baz[2]);
					kc81Vos.setBaz102(baz[3]);
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
				kc81Vo.setBaz102(tags[3]);
				kc81Vo.setBaz033(tags[4]);
				kc81Vo.setBazValue(tags[5]);
				kc81Vo.setBaz021(baz021);
				listKc81.add(kc81Vo);
			}
		}
	 
		this.getF10506002InfoVs().updateComplaintHandlingKc62(listKc81);
		
		String result = prefix  + VOUtils.getJsonData(complaintHandlingKc62VO) + suffex;
	    	
	    createJSonData(result);
	    	
	    return AJAX;
  }
   //  直接申诉 AND 医生协助 //
    
   public String queryNumber() {
	   String akb020 = this.getServletRequest().getParameter("akb020");
		List<QueryNumberVO> result = this.getF10506002InfoVs().queryNumber(akb020);
		String text = "{\"success\":true,\"result\":" + VOUtils.getJsonDataFromCollection(result)	+ "}";
		createJSonData(text);
	   return AJAX;
   }
}
