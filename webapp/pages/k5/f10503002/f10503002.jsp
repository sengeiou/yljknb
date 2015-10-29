<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构违规申诉</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script>
	var apa709Map=[{'id':'2','text':'医师'},{'id':'3','text':'医疗服务机构'}];
</script>
</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">申诉开始日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" class="mini-datepicker" format="yyyy-MM-dd"
										 allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉结束日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711e" name="ape711e" class="mini-datepicker" format="yyyy-MM-dd"
										 allowInput="false" />
									</div>
								</div>
							</div>
						</td><td class="textR">审批状态：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape139" name="ape139" class="mini-combobox"
										       data="${dic['APE139']}" textField="text" valueField="id" 
										       value="" emptyText="请选择..." allowInput="false" />
							       </div>
							   </div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">稽核问题类型：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701" name="apa701" class="mini-combobox" value="" emptyText="请选择..."
											data="${dic['APA701']}" textField="text" valueField="id"
											 />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉对象：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa709" name="apa709" class="mini-combobox"
										       data="apa709Map" textField="text" valueField="id" 
										       value="" emptyText="请选择..."  allowInput="false" />
							       </div>
							   </div>
							</div>
						</td>
						<td style="text-align: right; padding-top: 5px; padding-right:36px;"
							colspan="4">
							<input type="button" value="" class="cxsubmit" onclick="search()" />
							<input type="reset" value="" class="cxreset" onclick="resetForm()" />
						</td>
					</tr>
				</table>
			</div>
			</form>
			</div>
			<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">申诉信息</span></h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="就诊信息" onclick="openJzxx()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="案件结论" onclick="problem()"/>
							</em>
						</span>
					</div>
				</div>
				
				<div id="grid1" class="mini-datagrid" idField="id" multiSelect="false" style="width: 100%; height:178px;"
					allowResize="true" onselectionchanged="onSelectionChanged" url="${pageContext.request.contextPath}/k5/f10503002/toOrgBreCompQuery.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="ape139" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							申诉状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APE139']}">
						</div>
						<div field="abz001" width="80" headerAlign="center" allowSort="true" >案件编号</div>
						<div field="ape008s" width="80" headerAlign="center" allowSort="true" >被稽核对象</div>
						<div field="ape138" width="80" headerAlign="center" allowSort="true" >申诉理由</div>
						<div field="ape008" width="120" headerAlign="center" allowSort="true" >申诉人</div>
						<div field="ape711" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">申诉提交时间</div>
						<div field="apa701" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							问题类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA701']}">
						</div>
						<div field="apf094" width="300" headerAlign="center" allowSort="true">案情描述</div>
						<div field="ape752" width="80" headerAlign="center" allowSort="true" >违规金额</div>
						<div field="aaz529"  visible="false">申诉ID</div>
						<div field="aaz281"  visible="false">疑点问题记录ID"</div>
						<div field="aaz107"  visible="false">医疗机构编号</div>
						<div field="aaz077"  visible="false">被稽核对象ID</div>
					</div>
				</div>
			</div>
			</fieldset>
			<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">申诉信息</span></h3>
				</div>
				<div id="grid2" class="mini-datagrid" idField="id" multiSelect="false" style="width: 100%; height:178px;"
					allowResize="true" url="${pageContext.request.contextPath}/k5/f10503002/toCenterBreAuditDetail.action">
					<div property="columns">
						<div type="indexcolumn" width="10"></div>
						<div field="ape023" width="160" headerAlign="center" allowSort="true" >申诉材料</div>
						<div field="aae036" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">提交时间</div>
						<div field="aae011" width="80" headerAlign="center" allowSort="true" >提交人</div>
					</div>
				</div>
			</div>
			</fieldset>
		<script type="text/javascript">
			mini.parse();
			var grid = mini.get("grid1");
			var grid2 = mini.get("grid2");
			var queryForm = new mini.Form("form1");
			
			var data=queryForm.getData(true,false);
			grid.load(data);
			
			function search() {
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true,false);
				grid.load(data);
				grid2.clearRows();
			}
			
			//联动查询
			function onSelectionChanged(e){
				var grid = e.sender;
				var record = grid.getSelected();
				if (record){
					grid2.load({aaz529:record.aaz529});
				}
			}
			function openJzxx(){
				var row=grid.getSelected();
				if(row){
					var paras;
					$.ajax({
							url:'${pageContext.request.contextPath}/k3/f10306005/f10306005GetParams.action',
							dataType: "json",
							data:row,
							async:false,
							success: function(data){
								if(data.aaz010==""){
									mini.alert("数据异常");
									return false;
								}else{
									paras = "aaz010="+data.aaz010+"&apa709="+data.apa709+"&mid="+data.mid;
									mini.open({
										url : '${pageContext.request.contextPath}/pages/k3/f10305001/f10305001_Jzxx.jsp?' + paras,
										title : '就诊信息',
										width : 900,
										height : 600,
										ondestroy: function (action) {
						                    grid1.reload();
						                }
									});
								}
							}});
					
				}else{
					mini.alert("请选择一条记录!");
				}
			}	
			
			function problem(){
				var row = grid.getSelected();
				if (row) {
					mini.open({
					url : "${pageContext.request.contextPath}/pages/k5/f10503001/f10503001_registe.jsp",
					title: "案件结论", 
					width: 910, 
					height: 380,
					onload: function () {
						var iframe = this.getIFrameEl();
						var data =  {aaz077 : row.aaz077};
						iframe.contentWindow.SetData(data);
					},
					ondestroy: function (action) {
						grid.reload();
					}
					});
				} else {
					mini.alert("请选择一条记录!");
				}
			}
		
			
			function resetForm(){
				var queryForm = new mini.Form("form1");
				queryForm.reset();
			}
			
		</script>
	</body>
</html>
