<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构违规申诉</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script>
	var ape139Map=[{'id':'0','text':'待申诉'},{'id':'2','text':'补充材料'}];
	var apa709Map=[{'id':'2','text':'医师'},{'id':'3','text':'医疗服务机构'}];
</script>
</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">受理开始日期：</td>
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
						<td class="textR">受理结束日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711e" name="ape711e" class="mini-datepicker" format="yyyy-MM-dd"
										 allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">申诉状态：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape139" name="ape139" class="mini-combobox"
										       data="ape139Map" textField="text" valueField="id" 
										       value="" emptyText="请选择..." allowInput="false" />
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

			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit fL"><span class="iconCx">违规信息</span></h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="确认违规" onclick="consent()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="申诉" onclick="breComp()"/>
							</em>
						</span>
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
						<span class="btnMini">
							<em>
								<input type="button" value="补充材料" onclick="addBreComp()"/>
							</em>
						</span>
					</div>
				</div>
				
				<div id="grid1" class="mini-datagrid" idField="id" multiSelect="false" style="width: 100%; height:416px;"
					allowResize="true" url="${pageContext.request.contextPath}/k5/f10503001/queryViolationComplaintAction.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="ape139" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							申诉状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APE139']}">
						</div>
						<div field="abz001" width="80" headerAlign="center" allowSort="true" >案件编号</div>
						<div field="ape008" width="80" headerAlign="center" allowSort="true" >被稽核对象</div>
						<div field="ape727s" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">申诉起始时间</div>
						<div field="ape727e" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">申诉截止时间</div>
						<div field="apa701" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							问题类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA701']}">
						</div>
						<div field="apf094" width="300" headerAlign="center" allowSort="true">案情描述</div>
						<div field="ape752" width="80" headerAlign="center" allowSort="true" >
							违规金额
						</div>
						<div field="aaz529"  visible="false">申诉ID</div>
						<div field="aaz281"  visible="false">疑点问题记录ID"</div>
						<div field="aaz107"  visible="false">医疗机构编号</div>
						<div field="aae100"  visible="false">是否上传过材料</div>
						<div field="aaz077"  visible="false">被稽核对象ID</div>
					</div>
				</div>
			</div>
				
		<script type="text/javascript">
			mini.parse();
			mini.get("ape139").setValue("0");
			var grid = mini.get("grid1");
			var queryForm = new mini.Form("form1");
			
			var data=queryForm.getData(true,false);
			grid.load(data);
			
			function search() {
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true,false);
				grid.load(data);
			}
			
			function consent(){
				var row = grid.getSelected();
				if (row) {
					mini.confirm("确认违规","确认",
					function(action){
						if (action == "ok"){
							$.ajax({
				     		url:"${pageContext.request.contextPath}/k5/f10503001/consentBreach.action?method=consentBreach",
				     		type:"post",
				     		data: {aaz529 : row.aaz529},
				     		success: function (text){
				     			if(text.success){
				     				mini.showMessageBox({
			        				title: "提示",
			        				message: " 确认违规操作成功",
			        				buttons: ["确定"],
			        				iconCls: "mini-messagebox-info",
			        				callback: function(action){
		            					search();
		         					}});
				     			}
		     				}
		     				});
						}
					}
					);
				} else {
					mini.alert("请选择一条记录!");
				}
				
			}
			
			function breComp() {
				var row = grid.getSelected();
				if (row) {
					if(row.ape139==0){
						mini.open({
						url : "${pageContext.request.contextPath}/pages/k5/f10503001/f10503001_reg.jsp",
						title: "申诉信息", 
						width: 560, 
						height: 360,
						onload: function () {
							var iframe = this.getIFrameEl();
							var data =  {aaz281 : row.aaz281,
							aaa027 : row.aaa027,aaz529 : row.aaz529};
							iframe.contentWindow.SetData(data);
						},
						ondestroy: function (action) {
							grid.reload();
						}
						});
					}else{
						mini.alert("该记录已申诉请补充材料!");
					}
				} else {
					mini.alert("请选择一条记录!");
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
		
			function addBreComp() {
				var row = grid.getSelected();
				if (row) {
					if(row.ape139==2){
						mini.open({
						url : "${pageContext.request.contextPath}/pages/k5/f10503001/f10503001_reg_second.jsp",
						title: "补充材料", 
						width: 560, 
						height: 360,
						onload: function () {
							var iframe = this.getIFrameEl();
							var data =  {aaz281 : row.aaz281,
							aaa027 : row.aaa027,aaz529 : row.aaz529};
							iframe.contentWindow.SetData(data);
						},
						ondestroy: function (action) {
							grid.reload();
						}
						});
					}else{
						mini.alert("该记录还未申诉!");
					}
				} else {
					mini.alert("请选择一条记录!");
				}
			}
			
			function resetForm(){
				var queryForm = new mini.Form("form1");
				queryForm.reset();
				mini.get("ape139").setValue("0");
			}
			
		</script>
	</body>
</html>
