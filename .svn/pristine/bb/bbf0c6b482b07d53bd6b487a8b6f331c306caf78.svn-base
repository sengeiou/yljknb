package com.wondersgroup.local.k3.f10301002.action;

import java.util.List;
import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k3.f10301002.vo.AuditCaseCecordVO;
import com.wondersgroup.local.k3.f10301002.vo.AuditFileVO;
import com.wondersgroup.local.k3.f10301002.vo.DoctorVO;
import com.wondersgroup.local.k3.f10301002.vo.OrganizeVO;
import com.wondersgroup.local.k3.f10301002.vo.PersonVO;
import com.wondersgroup.local.k3.f10301002.vo.StaffListVO;
import com.wondersgroup.local.k3.f10301002.vo.UnitListVO;
import com.wondersgroup.local.k3.f10301002.vs.F10301002VS;
import com.wondersgroup.wssip.util.BeanTools;

public class AuditFileAction extends BaseAjaxAction{

	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10301002VS f10301002VS;
	
	private AuditFileVO auditFileQuery=new AuditFileVO();
	
	public AuditFileVO getAuditFileQuery() {
		return auditFileQuery;
	}

	public void setAuditFileQuery(AuditFileVO auditFileQuery) {
		this.auditFileQuery = auditFileQuery;
	}

	public F10301002VS getF10301002VS() {
		return f10301002VS;
	}
	
	public void setF10301002VS(F10301002VS f10301002vs) {
		f10301002VS = f10301002vs;
	}
	
	@Override
	public ValueObject getValueObject() {
		return this.getAuditFileQuery();
	}
	
	@Override
	protected String operate() {
		
		AuditCaseCecordVO resultVO=new AuditCaseCecordVO();
		
		BeanTools.copyProperties(auditFileQuery, resultVO);
		
		resultVO = this.getF10301002VS().queryAuditDetailInfo(resultVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		return result;
	}
	
	public String lordAuditFile(){
		
		String aaz281 = this.getServletRequest().getParameter("aaz281");
		
		AuditFileVO returnVO=this.getF10301002VS().getAuditFileById(aaz281);
		
		createJSonData(VOUtils.getJsonData(returnVO));
		
		return AJAX;
	}
	
	public String closeQuestion(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		AuditFileVO resultVO=new AuditFileVO();
		
		resultVO = (AuditFileVO) VOUtils.getBeanFromJsonData(submitData, AuditFileVO.class);
		
		int succCount = this.getF10301002VS().closeQuestion(resultVO);
		
		String[] str = resultVO.getAaz281str().split(",");
		
		int totalCount = str.length ;
		
		int failCount=totalCount-succCount;
		
		String result="";
		
		if (succCount>0) {
			
			result =
					"{\"success\":true,\"messsage\":\"本次共关闭【" + totalCount + "】条记录，其中关闭成功【" + 
							succCount +"】条记录，关闭失败【" + failCount + "】条记录\"}";
		}else {
			
			result =
					"{\"success\":false,\"messsage\":\"本次共关闭的【" + 
							totalCount + "】条记录全部失败，可能被其他经办人员关闭、否定或立案了！\"}";
		}
		
		createJSonData(VOUtils.getJsonData(result));
		
		return AJAX;
	}
	
	public String queryPerson(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10301002VS().queryPerson(page,auditFileQuery);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	public String queryDoctor(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10301002VS().queryDoctor(page,auditFileQuery);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	public String queryOrganize(){
		
		int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
		int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
		
		Page page = new Page(start * limit + 1, limit, -1, limit, null);
		
		Map<String, Object> resultVO = null;
		
		resultVO=this.getF10301002VS().queryOrganize(page,auditFileQuery);
		
		createJSonData(VOUtils.getJsonData(resultVO));
		
		return AJAX;
	}
	
	@SuppressWarnings("unchecked")
	public String saveAuditFile(){
		
		String submitData = this.getServletRequest().getParameter("submitData");
		
		String grid1 = this.getServletRequest().getParameter("grid1");
		
		String grid2 = this.getServletRequest().getParameter("grid2");
		
		String grid3 = this.getServletRequest().getParameter("grid3");
		
		String grid4 = this.getServletRequest().getParameter("grid4");
		
		String grid5 = this.getServletRequest().getParameter("grid5");
		
		AuditCaseCecordVO resultVO=new AuditCaseCecordVO();
		
		resultVO = (AuditCaseCecordVO) VOUtils.getBeanFromJsonData(submitData, AuditCaseCecordVO.class);
		
		List<PersonVO> personList=VOUtils.getBeanListFromJsonData(grid1, PersonVO.class);
		
		List<DoctorVO> doctorList=VOUtils.getBeanListFromJsonData(grid2, DoctorVO.class);
		
		List<OrganizeVO> organizeList=VOUtils.getBeanListFromJsonData(grid3, OrganizeVO.class);
		
		List<StaffListVO> staffList=VOUtils.getBeanListFromJsonData(grid4, StaffListVO.class);
		
		List<UnitListVO> unitList=VOUtils.getBeanListFromJsonData(grid5, UnitListVO.class);
		
		resultVO = this.getF10301002VS().saveOrUpdateAuditCaseCecord(resultVO,personList,doctorList,organizeList,staffList,unitList);
		
		createJSonData(prefix + VOUtils.getJsonData(resultVO) + suffex);
		
		return AJAX;
	}
	
	public String deleteCase(){
		
		AuditCaseCecordVO resultVO=new AuditCaseCecordVO();
		
		BeanTools.copyProperties(auditFileQuery, resultVO);
		
		resultVO = this.getF10301002VS().deleteCase(resultVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(prefix + result + suffex);
		
		return AJAX;
	}
	
	/**
	 * 修改参保人信息（新增人员和单位）
	 * @return
	 */
	public String updateCbr(){
		
		AuditCaseCecordVO resultVO=new AuditCaseCecordVO();
		
		BeanTools.copyProperties(auditFileQuery, resultVO);
		
		resultVO = this.getF10301002VS().deleteCase(resultVO);
		
		String result = VOUtils.getJsonData(resultVO);
		
		createJSonData(prefix + result + suffex);
		
		return AJAX;
	}

}
