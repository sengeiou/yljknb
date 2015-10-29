package com.wondersgroup.local.k5.f10502001.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10502001.vo.F10502001VO;
import com.wondersgroup.local.k5.f10502001.vs.F10502001VS;

public class QueryKb41MessageAction extends BaseAjaxAction{

		private static final long serialVersionUID = 1L;
		
		private F10502001VS f10502001VS;
		
		private F10502001VO resultvo=new F10502001VO();
		
		
		public F10502001VS getF10502001VS() {
			return f10502001VS;
		}

		public void setF10502001VS(F10502001VS f10502001vs) {
			f10502001VS = f10502001vs;
		}

		public F10502001VO getResultvo() {
			return resultvo;
		}

		public void setResultvo(F10502001VO resultvo) {
			this.resultvo = resultvo;
		}

		public ValueObject getValueObject() {
			return this.getResultvo();
		}

		protected String operate() {
			
			int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
			int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
			
			Page page = new Page(start * limit + 1, limit, -1, limit, null);
			
			Map<String, Object> resultVO = null;
			
			resultVO=this.getF10502001VS().queryKb41Message(page, resultvo);
			
			String result=VOUtils.getJsonData(resultVO);
			
			return result;
		}

	}



