<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核案件撤销</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<!-- <h3 class="cxTit pTb8"><span class="iconCx">查询条件</span></h3> -->
			<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
			<div id="" style="margin: 10px; position: relative;">
				<table style="width: 38%;" class="cxTab">
					<tr>
						<td class="textR">案件编号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="abz001" name="abz001" class="mini-buttonedit" 
											onbuttonclick="onButtonEdit" textName="abz001"/>
									</div>
								</div>
							</div>
						</td>	
						<td style="text-align: left; padding-top: 2px; padding-right: 20px;">
							<input type="button" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="resetForm()" />
				        </td>
					</tr>
				</table>
			</div>
			</form>
			</div>
		</fieldset>
		
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit pTb8"><span class="iconCx">案件信息</span></h3>
				</div>
				
				<div id="grid1" class="mini-datagrid" style="width: 100%; height: 170px;" 
				     idField="id" multiSelect="true" allowResize="false" pageSize="10" onload="afterload"
					 url="${pageContext.request.contextPath}/k3/f10301005/loadAuditCaseInfoByAbz001.action?method=loadAuditCaseInfoByAbz001">
					 <div property="columns">
					 	<div type="indexcolumn"></div>
						<div field="operation" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
						<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
						<div field="aaz281" width="100" headerAlign="center">疑点问题受理记录ID</div>
						<div field="abz001" width="100" headerAlign="center">案件编号</div>
						<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
							案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
						</div>
						<div field="aae426" width="100"	headerAlign="center" type="comboboxcolumn">
							案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
						</div>
						<div field="apf094" width="100" headerAlign="center">案情描述</div>
						<div field="aae189" width="100" headerAlign="center">批示意见</div>
						<div field="apa047" width="100" headerAlign="center">督办期限</div>
						<div field="acc789" width="100" headerAlign="center">办案责任人</div>
						<div field="aae034s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案确认日期</div>
					 </div>
				</div>
			</div>
		</fieldset>
		
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit pTb8"><span class="iconCx">被稽核对象</span></h3>
				</div>
				
				<div id="grid2" class="mini-datagrid" style="width: 100%; height: 178px;" 
					     idField="id" multiSelect="true" allowResize="false" pageSize="10"
						 url="${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz318.action?method=loadBeAuditTargetInfoByAaz318">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="operation" width="100" headerAlign="center" renderer="rendererGrid2">操作</div>
						<div field="aaz077" dataType="string" width="100" headerAlign="center">被稽核对象ID</div>
						<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
						<div field="aaz010" width="100" headerAlign="center">被调查人ID</div>
						<div field="ape008" width="100" headerAlign="center">被调查人姓名</div>
						<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
							稽核对象类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
						</div>
					</div>	 
				</div>
			</div>
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			
			var grid1 = mini.get("grid1");
			var grid2 = mini.get("grid2");
			
			var queryForm = new mini.Form("form1");
			
			function onButtonEdit(e){
				var bnEdit = this;
				
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301005/f10301005_selectcase.jsp",
					title:"查询案件信息",
					width: 700,
                	height: 450,
                	ondestroy: function (action){
                		if (action == "ok"){
                			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			bnEdit.setValue(data.abz001);
                			bnEdit.setText(data.abz001);
                			search();
                		}
                	}
				});
			}
			
			//查询
			function search(){
				var data = queryForm.getData(true, false);
				grid1.load(data);
			}
			
			//重置
			function reset(){
				var queryForm = new mini.Form("editForm1");
				queryForm.reset();
			}
			
			//加载grid2
			function afterload(e){
				var grid = e.sender;
				if(e.data.length == 0){
					grid2.clearRows();
				}
				if(e.data != null){
					grid2.load({aaz318:e.data[0].aaz318}); 
				}
			}
			
			//grid1操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = revoke('" + record.aaz318 + "') >撤销</a> ";
            	return s;
			}
			
			function revoke(aaz318){
				if(aaz318 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301005/f10301005_revoke.jsp",
						title:"稽核案件撤销",
						width: 600, 
						height: 200,
						onload: function (){
							var iframe = this.getIFrameEl();
							var data = {aaz318 : aaz318};
							iframe.contentWindow.setData(data);
						},
						ondestroy: function (action){
							search();
							grid2.load(); 
						}
					});
				}else{
					mini.alert("传入稽核案件详情的主键为空");
				}
			}
			
			//grid2操作
			function rendererGrid2(e){
				var grid2 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s1 = "<a href='###' onclick = searchTargetInfo('" + record.apa709 + "','"	+ record.aaz077 + "') >详情</a>";
            	var s2 = "<a href='###' onclick = searchRecord('" + record.aaz077 + "','"	+ record.aaz318 + "') >记录</a>";
            	return s1 + " | " + s2
			}
			
			//查询被稽核对象信息 apa709 1(参保人) 2(医师) 3(医疗服务机构)
			function searchTargetInfo(apa709,aaz077){
				var url = "";
				if(apa709 == '1'){
					url = "${pageContext.request.contextPath}/pages/pub/personinfo.jsp";
				}else if(apa709 == '2'){
					url = "${pageContext.request.contextPath}/pages/pub/doctorinfo.jsp";
				}else if(apa709 == '3'){
					url = "${pageContext.request.contextPath}/pages/pub/medinstitutioninfo.jsp";
				}
				
				mini.open({
					url: url,
					title: "对象详情", 
					width: 800, 
					height: 500,
					onload: function (){
						var iframe = this.getIFrameEl();
                    	var data = {aaz077 : aaz077};
                    	iframe.contentWindow.setData(data);
					},
					ondestroy: function (action) {
						
                	}
				});
			}
			
			//查询记录
			function searchRecord(aaz077,aaz318){
				if(aaz077 != null && aaz318 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301005/f10301005_record.jsp",
						title:"调查记录列表",
						width:800,
						height:440,
						onload:function(){
							var iframe = this.getIFrameEl();
							var data = {aaz077 : aaz077 , aaz318 : aaz318};
							iframe.contentWindow.setData(data);
						},
						ondestroy:function(action){
							
						}
					});
				}else{
					mini.alert("查询调查记录  aaz077 aaz318 为空");
				}
			}
		</script>
	</body>
</html>
