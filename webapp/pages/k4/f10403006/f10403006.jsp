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
  	var tcc = [{
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
  	var vt = [{
  		id : 1,
  		text : '有效'
  	},{
  		id : 2,
  		text : '无效'
  	}];
  	function searchThreeCatalogueName(){
  		mini.open({
  			url: '${pageContext.request.contextPath}/pages/k4/searchJsp/threeCatalogueName.jsp',
			title: '查询三大目录名称', 
			width:850, 
			height:450,
  		});
  	}
  </script>
  
  <body>
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		查询条件
    	</legend>
    	<div id="editForm1" style="margin: 1px;position: relative;">
    		<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
    			<tr>
    				<td>三大目录类别：</td>
    				<td>
    					<input id="tcc" class="mini-combobox" emptyText="请选择..." 
    				           style="width: 200px;" data="tcc"/>
    				</td>
    				<td>三大目录名称：</td>
    				<td>
    					<input id="tcn" class="mini-buttonedit" onbuttonclick="searchThreeCatalogueName()" 
    						   style="width: 200px;"/>
    				</td>
    				<td>有效标志：</td>
    				<td>
    					<input id="vt" class="mini-combobox" emptyText="请选择..." 
    						   style="width: 200px;" data="vt"/>
    				</td>
    			</tr>
    			<tr>
    				<td>依赖三大目录类别：</td>
    				<td>
    					<input id="itcc" class="mini-combobox" emptyText="请选择..." 
    				           style="width: 200px;" data="tcc"/>
    				</td>
    				<td>依赖三大目录名称:</td>
    				<td>
    					<input id="itcn" class="mini-buttonedit"  style="width: 200px;"
    					       onbuttonclick="searchThreeCatalogueName()"/>
    				</td>
    			</tr>
    			<tr>
    				<td style="text-align: right; padding-top: 5px; padding-right: 20px;"
                        colspan="6">
                        <a class="mini-button" iconCls="icon-search" onclick="search()">查询</a>
                        <a class="mini-button" iconCls="icon-edit" onclick="reset()">重置</a>
                    </td>
    			</tr>
    		</table>
    	</div>
    </fieldset>
    
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		疾病药品信息
    	</legend>
    	<div style="width: 100%;">
    		<div class="mini-toolbar" style="border-bottom: 0;">
    			<table style="width: 100%;">
    				<td style="width: 100%;">
    					<a class="mini-button" iconCls="icon-add" onclick="add()">添加</a>
                        <a class="mini-button" iconCls="icon-unlock" onclick="unseal()">启用</a>
                        <a class="mini-button" iconCls="icon-lock" onclick="stand()">禁用</a>
                        <a class="mini-button" iconCls="icon-cut" onclick="remove()">删除</a>
    				</td>
    			</table>
    		</div>
    		<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true"
			 	 style="width:100%;height:280px;" allowResize="true"
                 url="#">
                 <div property="columns">
                 	<div type="checkcolumn"></div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三大目录类别</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三大目录名称</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">依赖三大目录类别</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">依赖三大目录名称</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">有效标志</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">经办人</div>
	                <div field="" width="100" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd">经办日期</div>
                 </div>
           </div>
    	</div>
    </fieldset>
    
  </body>
</html>
