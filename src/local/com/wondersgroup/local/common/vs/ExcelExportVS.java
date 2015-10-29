package com.wondersgroup.local.common.vs;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public interface ExcelExportVS {
	@SuppressWarnings("rawtypes")
	public String runEngine(String classname,OutputStream fOut,Map params,HttpServletResponse response);
}
