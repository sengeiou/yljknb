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
  	var risk = [{
  		id : 1,
  		text : '职工基本医疗保险'
  	},{
  		id : 2,
  		text : '公务员医疗补助'
  	},{
  		id : 3,
  		text : '大额医疗费用补助'
  	},{
  		id : 4,
  		text : '离休人员医疗保障'
  	},{
  		id : 5,
  		text : '一至六级残疾军人医疗补助'
  	},{
  		id : 6,
  		text : '老红军医疗保障'
  	},{
  		id : 7,
  		text : '企业补充医疗保险'
  	},{
  		id : 8,
  		text : '新型农村合作医疗'
  	},{
  		id : 9,
  		text : '城乡居民基本医疗保险'
  	},{
  		id : 10,
  		text : '城镇居民基本医疗保险'
  	},{
  		id : 11,
  		text : '工伤保险'
  	},{
  		id : 12,
  		text : '生育保险'
  	},{
  		id : 13,
  		text : '城乡医疗救助'
  	},{
  		id : 14,
  		text : '优抚对象医疗补助'
  	}];
  	var vt = [{
  		id : 1,
  		text : '有效'
  	},{
  		id : 2,
  		text : '无效'
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
    				<td>险种：</td>
    				<td>
    					<input id="risk" class="mini-combobox" emptyText="请选择..." 
    				           required="true" style="width: 320px;" data="risk"/>
    				</td>
    				<td>有效标志：</td>
    				<td>
    					<input id="vt" class="mini-combobox" emptyText="请选择..." 
    						   style="width: 320px;" data="vt"/>
    				</td>
    			</tr>
    			<tr>
    				<td>三大目录类别：</td>
    				<td>
    					<input id="tcc" class="mini-combobox" emptyText="请选择..." 
    						   style="width: 320px;" data="tcc"/>
    				</td>
    				<td>三大目录名称：</td>
    				<td>
    					<input id="tcn" class="mini-buttonedit" onbuttonclick="searchThreeCatalogueName()" 
    						   style="width: 320px;"/>
    				</td>
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
    		险种与三目信息
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
	                 	<div field="" width="100" headerAlign="center" allowSort="true">详细</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true">险种分类</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true">三大目录类别</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true">三大目录名称</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true">有效标志</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true">经办人</div>
	                 	<div field="" width="100" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd">经办日期</div>
                 	</div>
            </div>
    	</div>
    </fieldset>
    
  </body>
</html>
