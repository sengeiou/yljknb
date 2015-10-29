
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>结论确认审批</title>
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
				
					<div id="grid1" class="mini-datagrid" style="width: 100%; height: 170px;" allowResize="false"
					     idField="id" multiSelect="true" pageSize="10" onload="afterload"
						 url="${pageContext.request.contextPath}/k3/f10301011/loadAuditCaseByAbz001.action?method=loadAuditCaseInfoByAbz001">
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
						 url="${pageContext.request.contextPath}/k3/f10301011/loadAuditTargetByAaz318.action?method=loadAuditTargetInfoByAaz318">
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
					url:"${pageContext.request.contextPath}/pages/k3/f10301011/f10301011_selectcase.jsp",
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
					grid2.load({aaz318:e.data[0].aaz318,apa011 : 3}); 
				}
			}
			
			//grid1操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s1 = "<a href='###' onclick = searchCaseInfo('" + record.aaz318 + "','" + record.abb006 + "','"+ record.aaz281 + "') >详情</a> ";
            	var s2 = "<a href='###' onclick = showApprovalTab('" + record.aaz318 + "','1') >审批</a>";
            	var s = s1 + " | " + s2 ;
            	return s;
			}
			
			//根據abb006 跳轉  1(系統監控) 2(外部受理) 3(主動稽核)
			function searchCaseInfo(aaz318 , abb006,aaz281){
				var url = "";
				if(aaz281 == null){
					url = "${pageContext.request.contextPath}/pages/k3/f10301004/f10301004_caseInfo2.jsp";
				}else{
					if(aaz318 != null){
						if(abb006 == '1'){
							url = "${pageContext.request.contextPath}/pages/pub/auditprobleminfo.jsp";
						}else if(abb006 == '2' || abb006 == '3'){
							url = "${pageContext.request.contextPath}/pages/pub/casedelinfo.jsp";
						}
					}else{
						mini.alert("传入稽核案件的主键 aaz318 为空");
					}
				}
				mini.open({
					url:url,
					title:"稽核案件详情",
					width: 850, 
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
            	//var s2 = "<a href='###' onclick = affirm('" + record.aaz077 + "','"	+ record.aaz318 + "','1') >通过</a>";
            	//var s3 = "<a href='###' onclick = affirm('" + record.aaz077 + "','"	+ record.aaz318 + "','0') >不通过</a>";
            	//var s2 = "<a href='###' onclick = showApprovalTab('" + record.aaz077 + "','"	+ record.aaz318 + "','1') >审批</a>";
            	//var s = s1 + " | " + s2 ;
            	return s1;
			}
			
			//弹出多重审批窗口
			function showApprovalTab(aaz318){
			  if(aaz318 != null){
					mini.open({
						url: "${pageContext.request.contextPath}/pages/k3/f10301011/f10301011_approval.jsp",
						title: "结论确认多重审批",
						width: 800, 
						height: 400,
						onload: function (){
							var iframe = this.getIFrameEl();
							var data = {aaz318 : aaz318};
							iframe.contentWindow.setData(data);
						},
						ondestroy: function (action){
							grid1.reload();
						}
					});
				}else{
					mini.alert("传入稽核案件详情的主键为空"); 
				}	
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
				}else{
					mini.alert("传入被稽核對象的主键 aaz077 为空"); 
				}
			}
			
			//确认
			function affirm(aaz077 ,aaz318,apa011){
				if(aaz077 != null && aaz318 != null){
					mini.open({
						url:"${pageContext.request.contextPath}/pages/k3/f10301011/f10301011_shms.jsp",
						title:"稽核结论确认",
						width:500,
						height:180,
						onload:function(){
							var iframe = this.getIFrameEl();
							var data = {aaz077 : aaz077 , aaz318 : aaz318,apa011 : apa011};
							iframe.contentWindow.setData(data);
						},
						ondestroy:function(action){
							search();
							grid2.load(); 
						}
					});
				}else{
					mini.alert("查询调查记录  aaz077 aaz318 为空");
				}
			}
			
			//重置
			function reset(){
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