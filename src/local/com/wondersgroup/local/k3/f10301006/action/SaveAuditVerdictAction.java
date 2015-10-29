package com.wondersgroup.local.k3.f10301006.action;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;


import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.BeAuditTargetVO;
import com.wondersgroup.local.k3.f10301004.vo.CaseDetailsVO;
import com.wondersgroup.local.k3.f10301006.vo.Af38VO;
import com.wondersgroup.local.k3.f10301006.vs.F10301006VS;
import com.wondersgroup.wssip.util.DateTools;

public class SaveAuditVerdictAction extends BaseAjaxAction{

	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private static final long serialVersionUID = 1L;
	
	private F10301006VS f10301006VS;
	private Af38VO af38vo = new Af38VO();

	public F10301006VS getF10301006VS() {
		return f10301006VS;
	}

	public void setF10301006VS(F10301006VS f10301006vs) {
		f10301006VS = f10301006vs;
	}
	
	
	/*public Af38VO getAf38vo() {
		return af38vo;
	}

	public void setAf38vo(Af38VO af38vo) {
		this.af38vo = af38vo;
	}
	*/

	@Override
	public ValueObject getValueObject() {
		return super.getValueObject();
	}

	@Override
	protected String operate(){
		
		String data = this.getServletRequest().getParameter("data");
		String apa709 = this.getServletRequest().getParameter("apa709");
		
		af38vo = (Af38VO) VOUtils.getBeanFromJsonData(data, Af38VO.class);
		if (apa709.equals("1")) {
			
			af38vo.setApe741(DateTools.parseDate(af38vo.getApe741s(), "yyyyMMdd"));
			af38vo.setApe742(DateTools.parseDate(af38vo.getApe742s(), "yyyyMMdd"));
			af38vo.setApa133(DateTools.parseDate(af38vo.getApa133s(), "yyyyMMdd"));
			af38vo.setApa134(DateTools.parseDate(af38vo.getApa134s(), "yyyyMMdd"));
		}
		if (apa709.equals("2")) {
			af38vo.setApe741(DateTools.parseDate(af38vo.getApe741s2(), "yyyyMMdd"));
			af38vo.setApe742(DateTools.parseDate(af38vo.getApe742s2(), "yyyyMMdd"));
		}
		if (apa709.equals("3")) {
			af38vo.setApe741(DateTools.parseDate(af38vo.getApe741s3(), "yyyyMMdd"));
			af38vo.setApe742(DateTools.parseDate(af38vo.getApe742s3(), "yyyyMMdd"));
		}
		
		af38vo = this.getF10301006VS().saveConclusion(af38vo);
		
		String result = prefix + VOUtils.getJsonData(af38vo) + suffex;
		
		return result;
	}

	public String registDone() {
		
		String aaz318 = this.getServletRequest().getParameter("aaz318");
		
		CaseDetailsVO resultVO = new CaseDetailsVO();
		
		resultVO.setAaz318(Long.parseLong(aaz318));
		
		resultVO = this.getF10301006VS().registDone(resultVO);
		
		String text = prefix + suffex;
		
		createJSonData(text);
		
		return AJAX;
	}
	
	public String loadBeAuditTargetInfoByAaz077() {
		
		String aaz077 = this.getServletRequest().getParameter("aaz077");
		String apa709 = this.getServletRequest().getParameter("apa709");
		BeAuditTargetVO result = this.getF10301006VS().queryBeAuditTargetInfoById(aaz077, apa709);
		
		String resultVO = VOUtils.getJsonData(result);
		createJSonData(resultVO);
		return AJAX;
	}
	
	/*public String batchupdate() {
		String data;
		
		try {
			data = ServletActionContext.getRequest().getParameter("data");
			
			JSONArray array = JSONArray.fromObject(data);
			
			Object[] obj = new Object[array.size()];
			
			for (int i = 0; i < array.size(); i++) {
				
				JSONObject jsonObject = array.getJSONObject(i);
				
				JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss"}));
				
				obj[i] = JSONObject.toBean(jsonObject,Af38VO.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
}
