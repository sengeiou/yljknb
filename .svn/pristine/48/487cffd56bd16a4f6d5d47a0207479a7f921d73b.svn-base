package com.wondersgroup.local.k5.f10502002.action;

import java.util.Map;

import com.wondersgroup.framework.core.bo.Page;
import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10502002.vo.F10502002VO;
import com.wondersgroup.local.k5.f10502002.vs.F10502002VS;

public class QueryKf66MessageAction extends BaseAjaxAction{

			private static final long serialVersionUID = 1L;
			
			private F10502002VS f10502002VS;
			
			private F10502002VO resultvo=new F10502002VO();
			
			

			public F10502002VS getF10502002VS() {
				return f10502002VS;
			}

			public void setF10502002VS(F10502002VS f10502002vs) {
				f10502002VS = f10502002vs;
			}

			public F10502002VO getResultvo() {
				return resultvo;
			}

			public void setResultvo(F10502002VO resultvo) {
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
				resultvo.setAaz107("128900");
				resultVO=this.getF10502002VS().queryKf66Message(page, resultvo);
				
				String result=VOUtils.getJsonData(resultVO);
				
				return result;
			}
			
			public String queryKf06Message(){
				
				int start = Integer.parseInt(this.getServletRequest().getParameter("pageIndex"));
				int limit = Integer.parseInt(this.getServletRequest().getParameter("pageSize"));
				
				Page page = new Page(start * limit + 1, limit, -1, limit, null);
				
				Map<String, Object> resultVO = null;
				resultvo.setAaz107("128900");
				resultVO=this.getF10502002VS().queryKf06Message(page, resultvo);
				
				createJSonData(VOUtils.getJsonData(resultVO));
				
				return AJAX;
			}

		}





