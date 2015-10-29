<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>规则模板管理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript">
</script>
</head>
<body style="overflow-x: hidden; overflow-y: hidden;">
	<div id="editform" class="cxTabbox">
		<form id="form" action="#">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
				width="100%">
				<tr>
					<td class="textR">规则类别：</td>
					<td>
						<div class="inputL" style="width: 140px">
							<div class="inputR">
								<div class="inputC">
									<input id="gzfl" name="ybfgzflbm"
										onvaluechanged="onDeptChanged" emptyText="请选择..."
										class="mini-combobox"
										url="${pageContext.request.contextPath}/k4/f10402008/getGzfl.action" />
								</div>
							</div>
						</div></td>
					<td class="textR">规则名称：</td>
					<td>
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input id="gzflmc" name="ybgzflbm" emptyText="请选择..."
										class="mini-combobox" />
								</div>
							</div>
						</div></td>
					<td style="text-align: center; padding-top: 5px;" colspan="2">
						<input type="button" value="" class="cxsubmit" onclick="search();" />
						<input type="button" value="" class="cxreset"
						onclick="resetForm();" /></td>
				</tr>
			</table>
		</form>
	</div>

	<div class="listTit">
		<h3 class="cxTit fL">
			<span class="iconCx">模版信息</span>
		</h3>
	</div>

	<div id="datagrid1" class="mini-datagrid"
		style="width: 100%; height: 170px;" onrowclick="changeBtnText"
		idField="id" multiSelect="true" allowResize="false" pageSize="5"
		allowCellEdit="true"
		url="${pageContext.request.contextPath}/k4/f10402008/queryZsdWithPage.action">
		<div property="columns">
			<div type="checkcolumn"></div>
			<div field="ybfgzflmc" width="100" headerAlign="center">规则类别</div>
			<div field="ybgzflmc" width="100" headerAlign="center">规则名称</div>
		</div>
	</div>
	<div class="listTit">
		<h3 class="cxTit fL">
			<span class="iconCx">配置信息</span>
		</h3>
		<div class="fR pT5R9">
			<span class="btnMini"> <em> <input id="edBtn"
					type="button" value="预览" onclick="saveData()" /> </em> </span>
		</div>
	</div>
	<div class="mini-splitter" style="width: 100%; height: 200px;">
		<div size="60%" showCollapseButton="false" style="padding: 5px;">
			<table>
				<tr>
					<td style="padding-bottom:6px;">&nbsp;</td>
					<td style="padding-bottom:6px;">
						<div id="grid1" class="mini-datagrid"
							style="width:200px;height:150px;" idField="" multiSelect="true" 
							url="${pageContext.request.contextPath}/k2/f10201007/querydata.action"
							showPager="false">
							<div property="columns">
								<div type="checkcolumn"></div>
								<div field="id" width="30" visible="false" >id</div>
								<div field="lc" width="80">操作流程</div>
							</div>
						</div>
					</td>
					<td style="width:150px;text-align:center;"><input
						type="button" value=">" onclick="adds()" style="width:40px;" /><br /><br />
						<input type="button" value=">>" onclick="addAll()"
						style="width:40px;" /><br /><br /><input type="button"
						value="&lt;&lt;" onclick="removeAll()" style="width:40px;" /><br /><br />
						<input type="button" value="&lt;" onclick="removes()"
						style="width:40px;" /><br />
					</td>
					<td style="padding-bottom:6px;">
						<div id="grid2" class="mini-datagrid" 
							style="width:200px;height:150px;" idField="" multiSelect="true"
							showPager="false" allowCellEdit="true" allowCellSelect="true">
							<div property="columns">
								<div type="checkcolumn"></div>
								<div field="id" width="30" visible="false">id</div>
								<div field="lc" width="80">操作流程</div>
							</div>
						</div>
					</td>
				</tr>
			</table>
		</div>
		<div showCollapseButton="false" style="padding: 5px;">
		<div style="text-align:center; margin:10px;">
							    <form id="form2" action="#">
									<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
										width="100%">
										<tr>
											<td style="padding-bottom:6px;">
												规则名称：
											</td>
											<td>
											<div class="inputL" style="width: 130px">
												<div class="inputR">
													<div class="inputC">
											    	<input id="gzmc" name="gzmc" value="" class="mini-textbox" allowInput="false"/>
											    	</div>
												</div>
											</div>
											</td>
										</tr>
										<tr>
											<td>
												流程配置：
											</td>
											<td  colspan="2">
											   <div style="padding-right:60px;">
											   <div class="textareaTl"><div class="textareaTr"><div class="textareaTc"></div></div></div>
											   <div class="textareaLay" style="height: 80px">
												   <textarea id="lcnr" name="lcnr" style="height: 80px" class="mini-textarea" emptyText="" allowInput="false"></textarea>
											   </div>
											   <div class="textareaBl"><div class="textareaBr"><div class="textareaBc"></div></div></div>
											   </div>
											</td>
										</tr>
										<tr id="zsje" style="display: none">
											<td style="padding-bottom:6px;">
												终审金额：
											</td>
											<td>
											<div class="inputL" style="width: 130px;">
												<div class="inputR">
													<div class="inputC" >
											    	<input id="zsje" name="zsje" value="" class="mini-textbox" floatErrorText="请输入数字"/>
											    	</div>
												</div>
											</div>
											</td>
										</tr>
										<tr>
											<td nowrap="nowrap" colspan="5" style="text-align: center; padding-top: 5px;">
												<span class="btnMini"><em><input id="saveid" style="display: none" type="button" onclick="" value="保存"/></em></span>
											</td>
										</tr>
									</table>
								</form>
						    </div>
		</div>
	</div>
</body>
</html>
<!--导出Excel相关HTML-->
<form id="excelForm" method="post" target="excelIFrame">
	<input type="hidden" name="columns" id="excelData" />
</form>
<iframe id="excelIFrame" name="excelIFrame" style="display: none;"></iframe>
<script type="text/javascript">
	mini.parse();
	var datagrid1 = mini.get("datagrid1");
	var grid1 = mini.get("grid1");
    var grid2 = mini.get("grid2");
	datagrid1.load();
	grid1.load();
	var gzfl = mini.get("gzfl");
    var gzflmc = mini.get("gzflmc");
    
    function onDeptChanged(e) {
        var id = gzfl.getValue();
        gzflmc.setValue("");
        var url = "${pageContext.request.contextPath}/k4/f10402008/getGzflxx.action?id=" + id;
        gzflmc.setUrl(url);
        positionCombo.select(0);
    }
	
	
	var form = new mini.Form("#form");
	
	function closeWin(){
		CloseWindow();
	}

	
	 function CloseWindow(action) {            
         if (window.CloseOwnerWindow){
              return window.CloseOwnerWindow(action);
         }else{
             window.close();
         }            
     }
	function search(){
		var data = form.getData(true);
		grid1.load(data); 
	}
	
    function resetForm(){
   		form.reset();
    }
	function adds() {
	    var items = grid1.getSelecteds();
	    grid1.removeRows(items);
	    grid2.addRows(items);
	}
	function addAll() {
	    var items = grid1.getData();       
	    grid1.removeRows(items);
	    grid2.addRows(items);
	}
	function removes() {
	    var items = grid2.getSelecteds();
	    grid2.removeRows(items);
	    grid1.addRows(items);
	}
	function removeAll() {
	    var items = grid2.getData();
	    grid2.removeRows(items);
	    grid1.addRows(items);
	}
	function saveData() {
	    var data = grid2.getData();
	    var sbtitle=document.getElementById("saveid");
	    var gzmc=mini.get("gzmc");
	    var lcnr=mini.get("lcnr");
	    var zsje=document.getElementById("zsje");
	    var rows=datagrid1.getSelecteds();
	    if(rows.length>0){
	    	gzmc.setValue(rows[0].ybgzflmc);
	    }
	    data.sort(function(a,b){return a.id>b.id?1:-1});
	    var str="";
	    for (var int = 0; int < data.length; int++) {
	    	if(int+1==data.length){
	    		if(data[int].id==4){
	    			str += data[int].id+"."+data[int].lc+"";
	    			zsje.style.display='';
	    		}else{
	    			str += data[int].id+"."+data[int].lc+"";
	    			zsje.style.display='none';
	    		}
	    	}else{
	    		str += data[int].id+"."+data[int].lc+"\n";
	    	}
		}
		
		if(data.length>0){
			lcnr.setValue(str);
			sbtitle.style.display='';
		}else{
			sbtitle.style.display='none';
		}
		
	}
	function edit(){
		var rows=grid1.getSelecteds();
		if(rows.length==1){
			var row=rows[0];
			mini.open({
				url:"../pages/k4/f10402008/f10402008_edit.jsp",
				title:"修改条件逻辑数据",
				 width:650,
				height:480,
				onload:function(){
					var iframe = this.getIFrameEl();
					var data = {zsdid : row.ybgzmxid,ybgzbm:row.ybgzbm,xgbz:row.xgbz};
					iframe.contentWindow.SetData(data);	
				},
				ondestroy:function(action){
					grid1.reload();
				}
		    });
		}else{
			mini.alert("请选中一条记录");
		} 
	}
	
	
</script>
