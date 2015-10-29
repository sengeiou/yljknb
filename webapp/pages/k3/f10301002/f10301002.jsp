<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核立案登记</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body style="overflow-x: hidden; overflow-y: hidden;">
		<div id="editForm1" class="cxTabbox">
		<!-- <h3 class="cxTit pTb8"><span class="iconCx">查询条件</span></h3> -->
			<form id="form1" action="#">
			<div id="editForm1" style="margin:0 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">受理方式：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa703" name="apa703" class="mini-combobox"
										       data="${dic['APA703']}" textField="text" valueField="id"
										       emptyText="请选择受理方式..."  allowInput="false" />
							 		</div>
							 	</div>
							</div>
						</td>
						<td class="textR">受理日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" class="mini-datepicker" format="yyyy-MM-dd"
										onvaluechanged="onValueChanged" allowInput="false" />
										<input id="ape711" name="ape711" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">问题状态：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa165" name="apa165" class="mini-combobox"
										       data="${dic['APA165']}" textField="text" valueField="id" 
										       value="" emptyText="请选择问题状态..." allowInput="false" />
							       </div>
							   </div>
							</div>
						</td>
						<td class="textR">举报人类型：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa704" name="apa704" class="mini-combobox"
										       data="${dic['APA704']}" textField="text" valueField="id" 
										       emptyText="请选择举报方类型..."  allowInput="false" />
							       </div>
							   </div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">举报人单位：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape028" name="ape028" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">问题关键字：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape712" name="ape712" class="mini-textbox" />
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
					<h3 class="cxTit fL"><span class="iconCx">疑点问题</span></h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="问题详情" onclick="check()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="稽核立案" onclick="add()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="问题关闭" onclick="closeProblem()"/>
							</em>
						</span>
					</div>
				</div>
				<div id="grid1" class="mini-datagrid" idField="id"multiSelect="true" style="width: 100%; height:340px;"
					allowResize="true" url="${pageContext.request.contextPath}/k3/f10301002/queryAuditFile.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div type="indexcolumn" ></div>
						<div field="aaa027" width="90" headerAlign="center" allowSort="true">统筹区</div>
						<div field="aaz281" width="120" headerAlign="center" allowSort="true" >疑点问题ID</div>
						<div field="apa165" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							问题状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA165']}">
						</div>
						<div field="ape711s" width="80" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd">受理日期</div>
						<div field="ape712" width="300" headerAlign="center" allowSort="true">疑点问题描述</div>
						<div field="apa703" width="80" headerAlign="center" allowSort="true" type="comboboxcolumn">
							受理方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA703']}">
						</div>
						<div field="apa704" width="90" headerAlign="center" allowSort="true" type="comboboxcolumn">
							举报人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA704']}">
						</div>
						<div field="apa705" width="90" headerAlign="center" allowSort="true" type="comboboxcolumn">
							举报方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA705']}">
						</div>
						<div field="ape028" width="90" headerAlign="center" allowSort="true" >举报人单位</div>
						<div field="ape713" width="80" headerAlign="center" allowSort="true">举报人姓名</div>
						<div field="aae005" width="80" headerAlign="center" allowSort="true">举报人电话</div>
						<div field="aae006" width="120" headerAlign="center" allowSort="true">举报人地址</div>
						<div field="aae007" width="80" headerAlign="center" allowSort="true">邮政编码</div>
						<div field="aae159" width="110" headerAlign="center" allowSort="true">电子邮箱</div>
						<div field="aae011" width="80" headerAlign="center" allowSort="true">经办人</div>
						<div field="aae036" width="110" headerAlign="center" allowSort="true" dateFormat="yyyy-MM-dd">经办时间</div>
					</div>
				</div>
			</div>
				
		<script type="text/javascript">
			mini.parse();
			
			mini.get("apa165").setValue("1");
			var apa165 = mini.get("apa165").getValue();
			
			var grid = mini.get("grid1");
			var queryForm = new mini.Form("form1");
			
			var data=queryForm.getData(true,false);
			grid.load(data);
			
			function search() {
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true,false);
				grid.load(data);
			}
			
			function check() {
				var row = grid.getSelected();
				if(row != null){
					var apa705 = row.apa705;
				}
				if (row) {
					mini.open({
						url : "${pageContext.request.contextPath}/pages/k3/f10301001/f10301001_info.jsp",
						title: "疑点问题详情", 
						width: 800, 
						height: 500,
						onload: function () {
							var iframe = this.getIFrameEl();
							var data =  {aaz281 : row.aaz281};
							iframe.contentWindow.setData(data);
						},
						ondestroy: function (action) {
							grid.reload();
						}
					});
				} else {
					mini.alert("请选择一个疑点问题!");
				}
			}
		 	//稽核立案操作
			function add() {
				var row = grid.getSelecteds();
				if (row.length==1) {
					var apa165=row[0].apa165;
					if(apa165==2){
						mini.alert("该问题已经被关闭!");
						return;
					}
					mini.open({
						url : "${pageContext.request.contextPath}/pages/k3/f10301002/f10301002_add.jsp",
						title : "立案登记",
						width : 800,
						height : 500,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {aaz281 : row[0].aaz281,apa165 : row[0].apa165,aaa027 : row[0].aaa027,apa703 : row[0].apa703};
							iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			               grid.reload();
			            }
			        });
				}else{
					if(row.length>1){
						mini.alert("不能选择多个疑点问题!");
						return;
					}else{
			        	mini.alert("请选择一个疑点问题！");
					}
				}
			}
		
			function closeProblem() {
				var row = grid.getSelecteds();
				if (row.length>0) {
					var aaz281str='';
					var apa165;
					for(var i=0;i<row.length;i++){
						apa165=row[i].apa165;
						if(apa165==2){
							mini.alert("选择的问题已经被关闭!");
							return;
						}
						if(apa165==3){
							mini.alert("选择的问题已经被立案!");
							return;
						}
						if(apa165==4){
							mini.alert("选择的问题已经被否定了!");
							return;
						}
						if(i==row.length-1){
							aaz281str=aaz281str+row[i].aaz281;
						}else{
							aaz281str=aaz281str+row[i].aaz281+",";
						}
					}
					mini.open({
						url : "${pageContext.request.contextPath}/pages/k3/f10301002/f10301002_close.jsp",
						title: "关闭疑点问题", width: 700, height:230,
						onload: function () {
							var iframe = this.getIFrameEl();
							var data = {aaz281str : aaz281str};
							iframe.contentWindow.setData(data);
						},
							ondestroy: function (action) {
							grid.reload();
						}
					});
				} else {
					alert("请选中一条记录");
				}
			}
			
			function resetForm(){
				var queryForm = new mini.Form("form1");
				queryForm.reset();
				mini.get("apa165").setValue("1");
			}
			
			function onValueChanged(){
		        var ape711Date = mini.get("ape711s").getValue();
		        if(ape711Date==""){
		        	 mini.get("ape711").setValue("");
		        }else{
		        	 mini.get("ape711").setValue(getDateYmd(ape711Date));
		        }
		       
		    }
			
		</script>
	</body>
</html>
