<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核结论传达</title>
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
						 url="${pageContext.request.contextPath}/k3/f10301008/loadVerdictConveyByabz001.action?method=loadVerdictConveyInfoByabz001">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="operation" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
							<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
							<!-- <div field="aaz281" width="100" headerAlign="center">疑点问题受理记录ID</div> -->
							<div field="abz001" width="100" headerAlign="center">案件编号</div>
							<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
								案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
							</div>
							<div field="aae426" width="100"	headerAlign="center" type="comboboxcolumn">
								案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
							</div>
							<div field="apf094" width="100" headerAlign="center">案情描述</div>
							<div field="aae011" width="100" headerAlign="center">立案经办人</div>
							<%--<div field="aae036" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案经办时间</div>
							--%><div field="aae189" width="100" headerAlign="center">批示意见</div>
							<div field="apa047" width="100" headerAlign="center">督办期限</div>
							<div field="acc789" width="100" headerAlign="center">办案责任人</div>
							<div field="aae012" width="100" headerAlign="center">立案确认人</div>
							<%--<div field="abb025s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">结案日期</div>
							--%><div field="ape028" width="100" headerAlign="center">信息来源方名称</div>
							<div field="apa704" width="100" headerAlign="center" type="comboboxcolumn">
								信息来源方类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA704']}">
							</div>
							<div field="ape713" width="100" headerAlign="center">信息来源方联系人</div>
							<div field="aae006" width="100" headerAlign="center">地址</div>
							<div field="aae007" width="100" headerAlign="center">邮政编码</div>
							<div field="aae005" width="100" headerAlign="center">联系电话</div>
							<div field="aae159" width="100" headerAlign="center">联系电子邮箱</div>
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
				<div id="toolbar1" class="mini-toolbar" style="height: 10%;">
					<table style="width:100%;">
						<tr>
							<span class="btnMini"  style="margin:0 10px;"><em><input type="button"   onclick="returnProve()" value="送达回证"/></em></span>
						</tr>
					</table>
				</div>
				
					<div id="grid2" class="mini-datagrid" style="width: 100%; height: 178px;" 
					     idField="id" multiSelect="true" allowResize="false" pageSize="10"
						 url="${pageContext.request.contextPath}/k3/f10301008/loadBeAuditByAaz318.action?method=loadVerdictBeAuditByAaz318">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="operation" width="180" headerAlign="center" renderer="rendererGrid2">操作</div>
							<div field="aaz077" dataType="string" width="100" headerAlign="center">被稽核对象ID</div>
							<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
							<div field="aaz010" width="100" headerAlign="center">被稽核对象ID</div>
							<div field="aae425" width="100" headerAlign="center" type="comboboxcolumn">
								传达状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE425']}">
							</div>
							<div field="ape008" width="100" headerAlign="center">被稽核对象</div>
							<div field="apa163" width="100" headerAlign="center" visible="false">是否暂停待遇</div>
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
					url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_selectcase.jsp",
					title:"查询案件信息",
					width: 700,
                	height: 480,
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
			
			//grid2
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
            	var s = "<a href='###' onclick = searchCaseInfo('" + record.aaz318 + "','" + record.abb006 + "','"+ record.aaz281 + "') >详情</a> ";
            	var s1 = "<a href='###' onclick = moveCase('" + record.aaz318 + "') >移交</a> ";
            	return s + " | " + s1;
			}
			
			function moveCase(aaz318){
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_caseMove.jsp",
					title:"稽核案件移交",
					width: 800, 
					height: 400,
					onload: function (){
						var iframe = this.getIFrameEl();
						var data = {aaz318 : aaz318};
						iframe.contentWindow.setData(data);
					},
					ondestroy: function (action){
							
					}
				});
			}
			
			//根據abb006 跳轉  1(系統監控) 2(外部受理) 3(主動稽核)
			function searchCaseInfo(aaz318 , abb006,aaz281){
				var url = "";
				if(aaz281 == null){
					url = "${pageContext.request.contextPath}/pages/pub/casetabsinfo.jsp";
				}else{
					if(aaz318 != null){
						if(abb006 == '1'){
							url = "${pageContext.request.contextPath}/pages/pub/casetabsinfo.jsp";
						}else if(abb006 == '2' || abb006 == '3'){
							url = "${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_caseinfo.jsp";
						}
					}else{
						mini.alert("传入稽核案件的主键 aaz318 为空");
					}
				}
				mini.open({
					url:url,
					title:"稽核案件详情",
					width: 800, 
					height: 400,
					onload: function (){
						var iframe = this.getIFrameEl();
						var data = {aaz318 : aaz318};
						iframe.contentWindow.setData(data);
					},
					ondestroy: function (action){
							
					}
				});
			}
			
			//grid2操作
			function rendererGrid2(e){
				
				var grid2 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s1 = "<a href='###' onclick = searchTargetInfo('" + record.apa709 + "','"	+ record.aaz077 + "') >详情</a>";
            	/* var s2 = "<a href='###' onclick = notify('" + record.aaz077 + "','"	+ record.aaz318 + "') >传达</a>"; */
            	var s2 = "<a href='###' onclick = conver('" + record.apa163 + "','" + record.apa709 + "','" + record.aaa027 + "','"	 + record.aaz077 + "','"	+ record.aaz318 + "') >传达</a>";
            	var s3 = "<a href='###' onclick = changeOfTime('" + record.aaz077 + "') >限期改正</a>";
            	var s4 = "<a href='###' onclick = recovery('" + record.aaz077 + "') >恢复结算</a>";
            	var s = s1 + " | " + s2 + " | " + s3 + " | " + s4;
            	return s;
			}
			
			//查询被稽核对象信息 1(参保人) 2(医师) 3(医疗服务机构)
			function searchTargetInfo(apa709,aaz077){
				if(aaz077 != null){
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
						width: 820, 
						height: 500,
						onload: function (){
							var iframe = this.getIFrameEl();
	                    	var data = {aaz077 : aaz077};
	                    	iframe.contentWindow.setData(data);
						},
						ondestroy: function (action) {
							
	                	}
					});
				}else{
					mini.alert("传入被稽核對象的主键 aaz077 为空"); 
				}
			}
			
			function recovery(aaz077){
				var record = grid2.getSelected();
				if(record.apa709 != "3" && record.apa709 != "2"){
					mini.alert("对不起，此对象不支持恢复医疗保险待遇!");
					return;
				}
				if(record.aae425 != "2"){
					mini.alert("对不起，请传达后进行恢复医疗保险待遇操作!");
					return;
				}
				if(record.apa163 != "1"){
					mini.alert("对不起，此对象未停止医疗保险待遇,不需要恢复!");
					return;
				}
				if(aaz077 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_recovery.jsp",
						title:"恢复医疗服务保险待遇",
						width:750,
						height:530,
						onload:function(){
							var iframe = this.getIFrameEl();
							var data = {aaz077 : aaz077};
							iframe.contentWindow.setData(data);
						},
						ondestroy:function(action){
							//grid2.reload();
						}
					});
				}else{
					mini.alert("aaz077 为空");
				}
				
			}
			
			function changeOfTime(aaz077){
				var record = grid2.getSelected();
				if(record.apa709 != "3"){
					mini.alert("对不起，此对象不支持限期改正!");
					return;
				}
				if(record.aae425 != "2"){
					mini.alert("对不起，传达之后才能做限期改正操作!");
					return;
				}
				if(aaz077 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_changeOfTime.jsp",
						title:"限期改正",
						width:800,
						height:480,
						onload:function(){
							var iframe = this.getIFrameEl();
							var data = {aaz077 : aaz077};
							iframe.contentWindow.setData(data);
						},
						ondestroy:function(action){
							//grid2.reload();
						}
					});
				}else{
					mini.alert("aaz077 为空");
				}
			}
			
			//传达
			function conver(apa163 , apa709 , aaa027 , aaz077 , aaz318){
				if(apa709 != null && aaa027!= null && aaz077 != null && aaz318 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_conver.jsp",
						title:"传达信息维护",
						width:800,
						height:550,
						onload:function(){
							var iframe = this.getIFrameEl();
							var data = {apa163 : apa163 , apa709 : apa709 , aaa027 : aaa027,aaz077 : aaz077 , aaz318 : aaz318};
							iframe.contentWindow.setData(data);
						},
						ondestroy:function(action){
							grid2.reload();
						}
					});
				}else{
					mini.alert("传达记录 aaa027  aaz077 aaz318 为空");
				}
			} 
			
			function returnProve(){
				var records = grid2.getSelecteds();
				if(records.length != 1){
					mini.alert("请选择一条记录进行操作!");
					return;
				}
				mini.open({
					url:"${pageContext.request.contextPath}/pages/k3/f10301008/f10301008_returnProve.jsp",
					title:"送达回证",
					width:800,
					height:480,
					onload:function(){
						var iframe = this.getIFrameEl();
						var data = {aaz077 : records[0].aaz077 };
						iframe.contentWindow.setData(data);
					},
					ondestroy:function(action){
						//grid2.reload();
					}
				});
			}
			
			//重置
			function resetForm(){
				var queryForm = new mini.Form("editForm1");
				queryForm.reset();
			}
			
			//关闭
			function onCloseClick(e){
            	lookup1.hidePopup();
			}
		</script>
	</body>
</html>