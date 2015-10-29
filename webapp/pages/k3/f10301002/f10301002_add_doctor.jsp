<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医护人员信息</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<form  id="form1" action="" method="post">
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<h3 class="cxTit pTb8"><span class="iconCx">医护人员信息</span></h3>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td>姓名:</td>
						<td>
						<div class="inputL" style="width:160px">
							<div class="inputR">
								<div class="inputC">
						<input name="aac003" class="mini-textBox" />
						</div></div></div>
						</td>
						<td>医疗机构名称:</td>
						<td>
						<div class="inputL" style="width:160px">
							<div class="inputR">
								<div class="inputC">
						<input name="akb021" class="mini-textBox"/>
						</div></div></div>
						</td>
						<td>
							<input type="button" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
						</td>
					</tr><tr>
					<td>公民身份号码:</td>
					<td>
					<div class="inputL" style="width:160px">
						<div class="inputR">
							<div class="inputC">
					<input name="aab014" class="mini-textBox"/>
					</div></div></div>
					</td>
					<td>医护人员编号:</td>
					<td>
					<div class="inputL" style="width:160px">
						<div class="inputR">
							<div class="inputC">
					<input name="aaz263" class="mini-textBox"/>
					</div></div></div>
					</td>
					</tr>
				</table>
			</div>
		</fieldset>
		<fieldset style="border: solid 0px #aaa; position: relative;">
		<h3 class="cxTit pTb8"><span class="iconCx">对象违反的问题类型</span></h3>
		<div style="margin: 10px;">
			<div style="width: 100%;">
				<table style="width: 100%;" class="cxTab">
					<tr>
					<td>稽核问题类型：</td>
					<td colspan="5">
					<div class="inputL" style="width:160px">
						<div class="inputR">
							<div class="inputC">
					<input id="apa701" name="apa701" class="mini-combobox" style="width:600px;"
							data="${dic['APA701']}" textField="text" valueField="id"
							 required="true" emptyText="请选择稽核问题类型..."/>
							 </div></div></div>
					</td>
					</tr>
				</table>
			</div>
			<div id="grid1" class="mini-datagrid" idField="id"
					multiSelect="true" style="width: 100%; height: 200px;" onselectionchanged="onSelectionChanged" onrowdblclick="onRowDblclick"
					allowResize="true" url="${pageContext.request.contextPath}/k3/f10301002/queryDoctor.action?method=queryDoctor">
					<div property="columns">
						<div type="indexcolumn" ></div>
						<div field="aaz263" headerAlign="center" allowSort="true">
							医护人员编号
						</div>
						<div field="aac003" headerAlign="center" allowSort="true">
							姓名
						</div>
						<div field="aab014" width="50" headerAlign="center" allowSort="true">
							公民身份号码
						</div>
						<div field="aae005" width="50" headerAlign="center" allowSort="true">
							联系电话
						</div>
						<div field="akb021" width="60" headerAlign="center" allowSort="true">
							医疗服务机构
						</div>
						<div field="aaz307" width="50" headerAlign="center" allowSort="true">
							科室
						</div>
						<div field="akc049" width="50" headerAlign="center" allowSort="true">
							行政职务
						</div>
						<div field="aaf009" width="70" headerAlign="center" allowSort="true">
							专业技术职务
						</div>
						<div field="akc054" width="70" headerAlign="center" allowSort="true">
							资格证编码
						</div>
						<div field="akc056" width="70" headerAlign="center" allowSort="true">
							执业证编码
						</div>
					</div>
				</div>
				<div style="margin:10px;text-align:center;">
					<span class="bnt"><a id="btn" name="btn" class="mini-button" iconCls="icon-search" onclick="selectValue();" >确定</a></span>
					<span class="bnt"><a class="mini-button" iconCls="icon-edit" onclick="closeWin()">返回</a></span>
				</div>
		</div>
		</fieldset>
	</form>
	<script type="text/javascript">
	mini.parse();

	var form = new mini.Form("#form1");
	var grid = mini.get("grid1");
	function search() {
		var form = new mini.Form("#form1");
		var data = form.getData(true,false);
		grid.load(data);
	}
	
	function selectValue(){
		 var row = grid.getSelected();
		 if(row==null){
		 	alert("请选择一条记录");
		 }else{
		 	CloseWindow("ok");
		 }
	}
	
	function GetData(){
		var row = grid.getSelected();
		var apa701=mini.getbyName("apa701");
        var data = {
        	apa701:apa701.getValue(),
        	aaz263:row.aaz263,
        	aac003:row.aac003,
        	aab014:row.aab014,
        	aae005:row.aae005,
        	akb021:row.akb021,
        	aaz307:row.aaz307,
        	akc049:row.akc049,
        	aaf009:row.aaf009,
        	akc054:row.akc054,
        	akc056:row.akc056
        };
        return data;
	}
	
	function onRowDblclick(e) {
       CloseWindow("ok");
    }
	
	function onSelectionChanged(e){
		var grid = e.sender;
	    var record = grid.getSelected();
	    var btn = new mini.get("#btn");
	    btn.enabled=true;
	}
		
	function resetForm() {
		var form = new mini.Form("#form1");
		form.reset();
    }
	function closeWin() {
		CloseWindow();
	}
	
	function CloseWindow(action) {
		if (window.CloseOwnerWindow){
			window.CloseOwnerWindow(action);
		}else{
			window.close();
		} 
	}
	
	</script>
</body>
</html>
