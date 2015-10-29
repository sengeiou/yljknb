<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>示例</title>
  </head>
  
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/miniui/themes/default/miniui.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/miniui/themes/icons.css">
  
  <script type="text/javascript" src="${pageContext.request.contextPath}/resource/miniui/themes/miniui.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resource/miniui/jquery.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resource/miniui/miniui.js"></script>
  
  <body>
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		疾病分类查询条件
    	</legend>
    	<div id="editForm1" style="margin: 1px;position: relative;">
    		<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
    			<tr>
    				<td>疾病分类：</td>
    				<td><input id="diseaseClassify" class="mini-textbox" emptyText=""/></td>
    				<td>疾病编码：</td>
    				<td><input id="diseaseCode" class="mini-textbox" emptyText=""/></td>
    				<td>疾病名称：</td>
    				<td><input id="diseaseName" class="mini-textbox" emptyText=""/></td>
    				<td padding-top: 5px; padding-right: 20px;"
                        colspan="">
                        <a class="mini-button" iconCls="icon-search" onclick="search()">查询</a>
                        <a class="mini-button" iconCls="icon-edit" onclick="reset()">重置</a>
                    </td>
    			</tr>
    		</table>
    	</div>
    </fieldset>
    
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		疾病信息
    	</legend>
    	<div style="width: 100%;">
    		<div class="mini-toolbar" style="border-bottom: 0;">
    			<table style="width: 100%;">
    				<tr>
    					<td style="width: 100%;">
    						<a class="mini-button" iconCls="icon-ok" onclick="ensure()">确定</a>
                        	<a class="mini-button" iconCls="icon-upgrade" onclick="revert()">返回</a>
    					</td>
    				</tr>
    			</table>
    		</div>
    		<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true"
			 	 style="width:100%;height:280px;" allowResize="true"
                 url="#">
                 <div property="columns">
                 	<div type="checkcolumn"></div>
	                <div field="" width="100" headerAlign="center" allowSort="true">疾病分类</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">疾病编码</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">疾病名称</div>
                 </div>
            </div>
    	</div>
    </fieldset>
  </body>
</html>
