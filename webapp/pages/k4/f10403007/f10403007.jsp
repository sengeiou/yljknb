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
  	var oc = [{
  		id : 1,
  		text : '市本级'
  	}];
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
  	function searchThreeCatalogueUnifyCode(){
  		mini.open({
  			url: '${pageContext.request.contextPath}/pages/k4/searchJsp/threeCatalogueUnifyCode.jsp',
			title: '查询三目统一编码', 
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
    				<td>统筹区编码：</td>
    				<td>
    					<input id="oc" class="mini-combobox" emptyText="请选择..." 
    				           style="width: 320px;" data="oc"/>
    				</td>
    				<td>三大目录类别：</td>
    				<td>
    					<input id="tcc" class="mini-combobox" emptyText="请选择..." 
    						   style="width: 320px;" data="tcc"/>
    				</td>
    			</tr>
    			<tr>
    				<td>三目统一编码：</td>
    				<td>
    					<input id="tcn" class="mini-buttonedit" onbuttonclick="searchThreeCatalogueUnifyCode()" 
    						   style="width: 320px;"/>
    				</td>
    				<td>三目名称：</td>
    				<td><input id="tn" class="mini-textbox" emptyText="" style="width: 320px;"/></td>
    			</tr>
    			<tr>
    				<td style="text-align: right; padding-top: 5px; padding-right: 20px;"
                        colspan="4">
                        <a class="mini-button" iconCls="icon-search" onclick="search()">查询</a>
                        <a class="mini-button" iconCls="icon-edit" onclick="reset()">重置</a>
                    </td>
    			</tr>
    		</table>
    	</div>
    </fieldset>
    
    <fieldset style="width: 100%; border: solid 1px #aaa;">
    	<legend>
    		重点项目信息
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
	                <div field="" width="100" headerAlign="center" allowSort="true">统筹区编码</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三目类别</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三目统一编码</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">三目统一名称</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">规则编号</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">规则名称</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">有效标志</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">监控使用</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">分析使用</div>
	                <div field="" width="100" headerAlign="center" allowSort="true">经办人</div>
	                <div field="" width="100" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd">经办日期</div>
                 </div>
            </div>
    	</div>
    </fieldset>
  </body>
</html>
