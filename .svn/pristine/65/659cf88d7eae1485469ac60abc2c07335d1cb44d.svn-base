package com.wondersgroup.local.common.action;

import java.io.IOException;
import java.io.OutputStream;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.common.vo.ExcelServiceInfoVO;
import com.wondersgroup.local.common.vs.ExcelExportVS;

public class ExcelExportAction extends BaseAjaxAction {

	private static final long serialVersionUID = 6833754917270308231L;

	private ExcelExportVS excelExportVS;

	private ExcelServiceInfoVO excelServiceInfoVO = new ExcelServiceInfoVO();

	public ExcelServiceInfoVO getExcelServiceInfoVO() {
		return excelServiceInfoVO;
	}

	public void setExcelServiceInfoVO(ExcelServiceInfoVO excelServiceInfoVO) {
		this.excelServiceInfoVO = excelServiceInfoVO;
	}

	public ExcelExportVS getExcelExportVS() {
		return excelExportVS;
	}

	public void setExcelExportVS(ExcelExportVS excelExportVS) {
		this.excelExportVS = excelExportVS;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getExcelServiceInfoVO();
	}

	@Override
	protected String operate() {
		OutputStream outputStream = null;
		try {
			outputStream = this.getServletResponse().getOutputStream();
			excelExportVS.runEngine(excelServiceInfoVO.getClassname(),
					outputStream, this.getServletRequest().getParameterMap(),
					this.getServletResponse());
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null){
				outputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
