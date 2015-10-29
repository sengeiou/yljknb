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
  
  <script type="text/javascript">
  	var tc = [{
  		id : 1,
  		text : '药品'
  	},{
  		id : 2,
  		text : '诊疗项目'
  	},{
  		id : 3,
  		text : '服务设施'
  	},{
  		id : 4,
  		text : '医用材料'
  	}];
  </script>
  
  <body>
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		三目编码查询
    	</legend>
    	<div id="editForm1" style="margin: 1px;position: relative;">
    		<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
    			<tr>
    				<td>三目类别：</td>
    				<td><input id="tc" class="mini-combobox" emptyText="" data="tc"/></td>
    				<td>三目统一编码：</td>
    				<td><input id="tcn" class="mini-textbox" emptyText=""/></td>
    				<td>三目名称：</td>
    				<td><input id="tn" class="mini-textbox" emptyText=""/></td>
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
    		三目信息
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
	                <div field="" width="100" headerAlign="center" allowSort="true">统筹区编码</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">目录类别</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三目统一编码</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三目名称</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">收费等级</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">规格</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">计价单位</div>
                 </div>
            </div>
    	</div>
    </fieldset>
  </body>
</html>
