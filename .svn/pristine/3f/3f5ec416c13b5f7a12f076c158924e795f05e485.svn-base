<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构信息</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<form  id="form1" action="" method="post">
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<h3 class="cxTit pTb8"><span class="iconCx">医疗服务机构信息</span></h3>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td>医疗机构类型:</td>
						<td>
						<div class="inputL" style="width:160px">
							<div class="inputR">
								<div class="inputC">
						<input id="akb022" name="akb022" class="mini-combobox" 
							data="${dic['AKB022']}" textField="text" valueField="id"
							 required="true" emptyText="请选择医疗机构类型..."/>
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
					<td>医疗机构编号:</td>
					<td>
						<div class="inputL" style="width:160px">
							<div class="inputR">
								<div class="inputC">
					<input name="akb020" class="mini-textBox"/>
						</div></div></div>
					</td>
					<td>医院等级:</td>
					<td>
						<div class="inputL" style="width:160px">
							<div class="inputR">
								<div class="inputC">
					<input id="aka101" name="aka101" class="mini-combobox" 
							data="${dic['AKA101']}" textField="text" valueField="id"
							 required="true" emptyText="请选择医院等级..."/>
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
					allowResize="true" url="${pageContext.request.contextPath}/k3/f10301002/queryOrganize.action?method=queryOrganize">
					<div property="columns">
					<div type="indexcolumn" ></div>
					<div field="akb020" width="80" headerAlign="center" >医疗服务机构编号</div>    
		            <div field="akb021" width="60" headerAlign="center" >医疗服务机构名称</div>    
		            <div field="akb022" width="80" headerAlign="center" >医疗服务机构类型
		            	<input property="editor" class="mini-combobox" style="width:100%;" data="${dic['AKB022']}" />
		            </div>    
		            <div field="aka101" width="80" headerAlign="center" >医疗服务机构等级
		            	<input property="editor" class="mini-combobox" style="width:100%;" data="${dic['AKA101']}" />
		            </div>    
		            <div field="akb011" width="80" headerAlign="center" >联网结算
		            	<input property="editor" class="mini-combobox" style="width:100%;" data="${dic['AKB011']}" />
		            </div>    
		            <div field="akb023" width="80" headerAlign="center" >机构分类代码
		            	<input property="editor" class="mini-combobox" style="width:100%;" data="${dic['AKB023']}" />
		            </div>    
		            <div field="akb100" width="80" headerAlign="center" >分院标志
		            	<input property="editor" class="mini-combobox" style="width:100%;" data="${dic['AKB100']}" />
		            </div>    
		            <div field="akb101" width="80" headerAlign="center" >上级医疗服务机构</div>    
		            <div field="aae004" width="80" headerAlign="center" >医保联系人</div>    
		            <div field="aae006" width="80" headerAlign="center" >机构地址</div>    
		            <div field="aae007" width="80" headerAlign="center" >邮政编码人</div>    
		            <div field="aae005" width="80" headerAlign="center" >联系电话</div>    
		            <div field="aaz107" width="80" headerAlign="center" >医疗服务机构ID</div> 
					</div>
				</div>
				<div style="margin:10px;text-align:center">
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
        	akb020:row.akb020,
        	akb021:row.akb021,
        	akb022:row.akb022,
        	aka101:row.aka101,
        	akb011:row.akb011,
        	akb023:row.akb023,
        	akb100:row.akb100,
        	akb101:row.akb101,
        	aae004:row.aae004,
        	aae006:row.aae006,
        	aae007:row.aae007,
        	aae005:row.aae005,
        	aaz107:row.aaz107
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
