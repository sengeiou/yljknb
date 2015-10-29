package com.wondersgroup.local.k4.f10402007.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.local.k4.f10402007.vo.DxzbVO;
import com.wondersgroup.local.k4.f10402007.vs.F10402007VS;

public class QueryCaseNumberDxzbAction extends BaseAjaxAction {

			private static final long serialVersionUID = 1L;
			
			private F10402007VS f10402007VS;
			
			private DxzbVO dxzbVO = new DxzbVO();
		
			public F10402007VS getF10402007VS() {
				return f10402007VS;
			}

			public void setF10402007VS(F10402007VS f10402007vs) {
				f10402007VS = f10402007vs;
			}

			public DxzbVO getDxzbVO() {
				return dxzbVO;
			}

			public void setDxzbVO(DxzbVO dxzbVO) {
				this.dxzbVO = dxzbVO;
			}

			protected String operate() {
				
				int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
				int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
				
			   String zbmc = this.getServletRequest().getParameter("zbmc");
			    dxzbVO.setZbmc(zbmc);
			   String zt = this.getServletRequest().getParameter("zt");
			   dxzbVO.setZt(zt);
			   String dxmc = this.getServletRequest().getParameter("dxmc");
			   dxzbVO.setDxmc(dxmc);
			   String mc = this.getServletRequest().getParameter("mc");
			   dxzbVO.setMc(mc);
			   String dxlx = this.getServletRequest().getParameter("dxlx");
			   dxzbVO.setDxlx(dxlx);

				Page page = new Page(start * limit + 1, limit, -1, limit, null);
				
				Map<String, Object> resultVO = null;

				resultVO = this.getF10402007VS().queryCaseWithPage(page,dxzbVO);
				
				String result = VOUtils.getJsonData(resultVO);
				
				return result;
			}

		}






