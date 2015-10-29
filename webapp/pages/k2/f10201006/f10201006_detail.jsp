<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>批量处理查询</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>

<body style="background-color:#F3F3F3 ;">
	<div class="mainlistCon">
		<div class="listTit">
			<h3 class="cxTit fL">
				<span class="iconCx">违规明细</span>
			</h3>
			<div class="fR pT5R9">
				<span class="btnMini"><em><input type="button"
						value="批量处理" onclick="plcl();" /> </em> </span>
			</div>
		</div>
		<div id="datagrid1" class="mini-datagrid" style="width: 100%; height: 336px;"
			idField="id" multiSelect="true" allowResize="false" url="dd.json">
			<div property="columns">
				<div type="checkcolumn"></div>
				<div field="aac003" width="80" headerAlign="center">参保人姓名</div>
				<div field="aac002" width="100" headerAlign="center">社会保障号</div>
				<div field="aac001" width="80" headerAlign="center" visible="false">参保人ID</div>
				<div field="aac004" width="80" headerAlign="center">性别</div>
				<div field="aac006" width="80" headerAlign="center">出生日期</div>
				<div field="akb020" width="80" headerAlign="center" visible="false">机构编号</div>
				<div field="akb021" width="100" headerAlign="center">机构名称</div>
				<div field="ake002" width="100" headerAlign="center" align="center"
					allowSort="true">三大目录名称</div>
				<div field="ake003" width="80" headerAlign="center" align="center"
					allowSort="true">三大目录类别</div>
				<div field="aaa167" width="80" headerAlign="center" align="center"
					allowSort="true">违反规则</div>
				<div field="aaa133" width="150" headerAlign="center" align="center"
					allowSort="true">违规说明</div>
			</div>
		</div>
	</div>
<script type="text/javascript">
	mini.parse();
	var grid1 = mini.get("datagrid1");
	grid1.load();
	function plcl() {
		if(grid1.getSelecteds().length>0){
			mini
				.open({
					url : "${pageContext.request.contextPath}/pages/k2/f10201006/f10201006_plcl.jsp",
					title : "批量处理",
					width : 350,
					height : 250,
					onload : function() {
					},
					ondestroy : function(action) {

					}
				});
		}else{
			mini.alert("请选择行数据");
		}
		
	}
	
</script>
</body>
</html>
