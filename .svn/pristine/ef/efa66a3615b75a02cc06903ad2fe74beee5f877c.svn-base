<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核案件结案</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editForm1" class="cxTabbox">
			<div id="" style="margin: 0 10px; position: relative;">
				<form id="form1" action="#">
					<table style="width: 100%;" class="cxTab">
						<tr>
							<td class="textR">立案确认日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae034s" name="aae034s" format="yyyy-MM-dd" class="mini-datepicker" 
								   			   onvaluechanged="onValueChanged1" vtype="date:yyyyMMdd" allowInput="false"/>
											<input id="aae034" name="aae034" value="" class="mini-hidden" required="true"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">案件状态：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae426" name="aae426" class="mini-combobox" 
												   emptyText="请选择案件状态..." data="${dic['AAE426']}" />
									   	</div>
									 </div>
								</div>
							</td>
							<td class="textR">案件来源：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abb006" name="abb006" class="mini-combobox" 
												   emptyText="请选择案件来源..." data="${dic['ABB006']}" />
									   	</div>
									</div>
								</div>
							</td>
							<td class="textR">案件编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abz001" name="abz001" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						
						<tr>
							<td class="textR">案情关键字：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apf094" name="apf094" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td style="text-align:right; padding-top: 5px; padding-right:40px;"
								colspan="6">
								<input type="button" value="" class="cxsubmit" onclick="search()" />
								<input type="reset" value="" class="cxreset" onclick="resetForm()" />
							</td>
						</tr>
					</table>
				</form>
			</div>
			</div>

			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">案件信息</span></h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="案件结案" onclick="agreeCase()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="二次处理" onclick="secondProcess()"/>
							</em>
						</span>
					</div>
				</div>
				
				<div id="datagrid1" class="mini-datagrid" style="width: 100%; height: 150px;" idField="id" multiSelect="true"
					allowResize="false" pageSize="10" onselectionchanged="onSelectionChanged" selectOnLoad="true" 
					url="${pageContext.request.contextPath}/k3/f10301014/queryCaseInfoNew.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="operation" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
						<div field="aaz281" width="100" headerAlign="center">疑点问题ID</div>
						<div field="aaz318" width="100" headerAlign="center">稽核案件ID</div>
						<div field="abz001" width="100" headerAlign="center">案件编号</div>
						<div field="aae426" width="100" headerAlign="center" type="comboboxcolumn">
							案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
						</div>
						<!--<div field="ape711s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案登记日期</div>-->
						<div field="aae034s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">立案确认日期</div>
						<div field="apf094" width="100" headerAlign="center">案情描述</div>
						<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
							案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
						</div>
						<div field="aae011" width="100" headerAlign="center">立案人</div>
					</div>
				</div>
			</div>
			
			<div class="mainlistCon" style="margin-top:-5px;">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">被稽核对象信息</span></h3>
				</div>
				
				<div id="datagrid2" class="mini-datagrid" style="width: 100%; height: 150px;" 
					 idField="id" multiSelect="true" allowResize="false" pageSize="10"
					 url="${pageContext.request.contextPath}/k3/f10301003/queryBeAuditTargetInfo.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="operation" width="100" headerAlign="center" renderer="rendererGrid2">操作</div>
						<div field="aaz077" width="100" headerAlign="center">被稽核对象ID</div>
						<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
							对象类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
						</div>
						<div field="aaz010" width="100" headerAlign="center">当事人ID</div>
						<div field="ape008" width="100" headerAlign="center">当事人名称</div>
					</div>
				</div>
			</div>
			
		<script type="text/javascript">
			mini.parse();
			
			mini.get("aae426").setValue("10");
			
			var queryForm = new mini.Form("form1");
			var data = queryForm.getData(true);
			var json = mini.encode(data);
						
			var grid1 = mini.get("datagrid1");
			var grid2 = mini.get("datagrid2");
			
			grid1.load(data);
			
			function search(){
				var data = queryForm.getData(true);
				grid1.load(data , function(){
					if(grid1.getData().length == 0){
						grid2.setData(null);
					}
				} , function(){});
			}
			
			//联动查询
			function onSelectionChanged(e){
				var grid = e.sender;
				var record = grid.getSelected();
				if (record){
					grid2.load({aaz318:record.aaz318});
				}
			}
			
			//操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = searchCaseInfo('"+record.aaz318+"')>详情</a>";
            	return s;
			}
			
			function searchCaseInfo(aaz318){
				if(aaz318 != null){
					mini.open({
						url: "${pageContext.request.contextPath}/pages/pub/casedelinfo.jsp",
						title: "稽核案件详情",
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
				}/* else{
					mini.alert("传入稽核案件详情的主键为空"); 
				}	 */
			}
			
			function rendererGrid2(e){
				var grid2 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = searchTargetInfo('" + record.apa709 + "','"+ record.aaz010 + "','"+record.aaz077+"') >详情</a>";
            	return s;
			}
			
			//apa709  1(参保人) 2(医师) 3(医疗服务机构) 4(人员) 5(单位)
			function searchTargetInfo(apa709,aaz010,aaz077){
				switch(apa709){
					case "1":
						 mini.open({
							url:"${pageContext.request.contextPath}/pages/k3/f10301003/f10301003_insuredInfo.jsp",
							title:"参保人详情",
							width:750,
							height:180,
							onload:function(){
								var iframe = this.getIFrameEl();
								var data = {aaz010 : aaz010,aaz077 : aaz077};
								iframe.contentWindow.setData(data);
							},
							ondestroy:function(action){
								grid2.reload();
							}
						});
						break;
						
					case "2":
						mini.open({
							url: "${pageContext.request.contextPath}/pages/k3/f10301003/f10301003_staffInfo.jsp",
							title:"医护人员详情",
							width:800,
							height:380,
							onload:function(){
								var iframe = this.getIFrameEl();
								var data = {aaz010 : aaz010,aaz077 : aaz077};
								iframe.contentWindow.setData(data);
							},
							ondestroy:function(action){
								grid2.reload();
							}
						});
						break;
						
					case "3":
						mini.open({
							url: "${pageContext.request.contextPath}/pages/k3/f10301003/f10301003_medicalInfo.jsp",
							title:"两定机构详情",
							width:800,
							height:250,
							onload:function(){
								var iframe = this.getIFrameEl();
								var data = {aaz010 : aaz010,aaz077 : aaz077};
								iframe.contentWindow.setData(data);
							},
							ondestroy:function(action){
								grid2.reload();
							}
						});
						break;
						case "4":
						 mini.open({
							url:"${pageContext.request.contextPath}/pages/k3/f10301003/f10301003_renyuanInfo.jsp",
							title:"人员详情",
							width:750,
							height:180,
							onload:function(){
								var iframe = this.getIFrameEl();
								var data = {aaz010 : aaz010,aaz077 : aaz077};
								iframe.contentWindow.setData(data);
							},
							ondestroy:function(action){
								grid2.reload();
							}
						});
						break;
						case "5":
						 mini.open({
							url:"${pageContext.request.contextPath}/pages/k3/f10301003/f10301003_unitlInfo.jsp",
							title:"单位详情",
							width:750,
							height:280,
							onload:function(){
								var iframe = this.getIFrameEl();
								var data = {aaz010 : aaz010,aaz077 : aaz077};
								iframe.contentWindow.setData(data);
							},
							ondestroy:function(action){
								grid2.reload();
							}
						});
						break;
					
					default:
						mini.alert("传入参数apa709为空!");
				}
			}
			
			//案件结案
			function agreeCase(){
				var rows = grid1.getSelecteds();
				if(rows.length > 0){
					mini.confirm("确定该案件做结案？","确认",
						function(action){
							if (action == "ok"){
								var ids = [];
								var aae426;
								for (var i = 0, l = rows.length; i < l; i++){
									var r = rows[i];
									aae426 = r.aae426;
									if(aae426 == '1'){
										mini.alert("该案件立案待确认，不能结案！");
										return;
									}
									if(aae426 == '2'){
										mini.alert("该案件已经不予立案，不能做结案操作！");
										return;
									}
									if(aae426 == '3'){
										mini.alert("该案件状态立案待查，不能结案！");
										return;
									}
									if(aae426 == '4'){
										mini.alert("该案件已结案，不能再次结案！");
										return;
									}
									if(aae426 == '5'){
										mini.alert("该案件已撤销，不能结案！");
										return;
									}
									if(aae426 == '6'){
										mini.alert("该案件已立案待审批，不能结案！");
										return;
									}
									if(aae426 == '7'){
										mini.alert("该案件调查完成，不能结案！");
										return;
									}
									if(aae426 == '8'){
										mini.alert("该案件的结论待确认，不能结案！");
										return;
									}
									if(aae426 == '9'){
										mini.alert("该案件结论待审批，不能结案！");
										return;
									}
									ids.push(r.aaz318);
								}
								var id = ids.join(',');
								$.ajax({
									url: "${pageContext.request.contextPath}/k3/f10301014/agreeAuditCase.action",
									post:"post",
									data: {submitIds: id},
									success: function (text) {
					                    grid1.reload();
					                },
					                error: function () {
					                }
								}); 
							}else{
								//mini.alert("---------final-------");
							}
						}
					); 
				}else{
					mini.alert("请选中一条记录");
				}
			}
			
			
			//二次处理
			function secondProcess(){
				var row = grid1.getSelected();//确定选中的哪一行
				if(row){
					if(row.aae426 == '10'){
						mini.open({
							url: "${pageContext.request.contextPath}/pages/k3/f10301014/f10301014_secondProcess.jsp",
							title: "二次处理",
							width: 600, 
							height: 200,
							onload: function (){
								var iframe = this.getIFrameEl();
								var data = {aaz318 : row.aaz318};
								iframe.contentWindow.setData(data);
							},
							ondestroy: function (action){
								grid1.reload();
							}
						});
					}else if(row.aae426 == '2'){
						mini.alert("该案件不予立案");
					}else if(row.aae426 == '3'){
						mini.alert("该案件立案待查");
					}else if(row.aae426 == '4'){
						mini.alert("该案件已结案");
					}
				}else{
					mini.alert("必须选中一条记录");
				}
				
			}
    		
    		function onValueChanged1(){
    			var aae034Date = mini.get("aae034s").getValue();
        		mini.get("aae034").setValue(getDateYmd(aae034Date));
    		}
    		
    		function getDateYmd(date) {
		    	var year = date.getFullYear();
		    	var month = (date.getMonth() + 1).toString();
		    	var day = (date.getDate()).toString();
		    	if(month.length == 1) {
		    		month = "0" + month;
		    	}
		    	if(day.length == 1) {
		    		day = "0" + day;
		    	}
		    	return year + month + day;
		    }
    		
    		//重置
    		function resetForm(){
    			queryForm.reset();
    			mini.get("aae426").setValue("1");
    		}
		</script>
	</body>
</html>