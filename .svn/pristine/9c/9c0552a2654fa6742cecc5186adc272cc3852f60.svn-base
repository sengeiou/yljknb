<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>查询人员信息</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
</script>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">参保人员信息</span></h3> -->
				<div id="editForm1" class="cxTabbox">
				<div id="" style="margin-top:0px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">医保号:</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac001" name="aac001" class="mini-textBox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">姓名:</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textBox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">社保卡号:</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac002" name="aac002" class="mini-textBox" />
										</div>
									</div>
								</div>
							</td>
							<td>
								<input type="button" value="" class="cxsubmit" onclick="search()" />
								<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
							</td>
						</tr>
					</table>
				</div>
				</div>
			</fieldset>
			
			<fieldset style="border: solid 0px #aaa; position: relative;">
				<div class="mainlistCon">
					<div class="listTit">
						<h3 class="cxTit pTb8"><span class="iconCx">参保人员列表</span></h3>
					</div>
					<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true" style="width: 100%; height:250px;"
						onselectionchanged="onSelectionChanged" onrowdblclick="onRowDblclick" allowResize="true" pageSize="10" 
						url="${pageContext.request.contextPath}/common/queryInsuPerson.action">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="aac001" width="50" headerAlign="center" allowSort="true">医保号</div>
							<div field="aac002" width="50" headerAlign="center" allowSort="true">社会保障号码</div>
							<div field="aac003" width="50" headerAlign="center" allowSort="true">姓名</div>
							<div field="aac004" width="50" headerAlign="center" allowSort="true" type="comboboxcolumn">
								性别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC004']}">
							</div>
							<div field="aac006" width="60" headerAlign="center" allowSort="true">出生日期</div>
							<div field="aac084" width="50" headerAlign="center" allowSort="true" type="comboboxcolumn">
								离退休标志<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAC084']}">
							</div>
							<div field="apa151" width="50" headerAlign="center" allowSort="true" type="comboboxcolumn">
								监控等级<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA151']}">
							</div>
							<div field="aae005" width="70" headerAlign="center" allowSort="true">联系电话</div>
						</div>
					</div>
					<div style="text-align:center;margin:10px;" class="mainlistCon">
						<span class="btnMini">
							<em>
								<input type="button" value="确定" onclick="selectValue()" id="e_btn" name="e_btn"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
							</em>
						</span>
					</div>
				</div>
			</fieldset>
		</form>
		
		<script type="text/javascript">
			mini.parse();

			var queryForm = new mini.Form("form1");
			var grid = mini.get("grid1");
			
			function search() {
				var data = queryForm.getData(true, false);
				grid.load(data);
			}
		
			function selectValue() {
				var row = grid.getSelected();
				if (row == null) {
					mini.alert("请选择一条记录");
				} else {
					CloseWindow("ok");
				}
			}
		
			function GetData() {
				var row = grid.getSelected();
				return row;
			}
		
			function onRowDblclick(e) {
				CloseWindow("ok");
			}
		
			function onSelectionChanged(e) {
				var grid = e.sender;
				var record = grid.getSelected();
				var btn = new mini.get("e_btn");
				btn.enabled = true;
			}
		
			function resetForm() {
				queryForm.reset();
			}
			function closeWin() {
				CloseWindow();
			}
		
			function CloseWindow(action) {
				if (window.CloseOwnerWindow) {
					window.CloseOwnerWindow(action);
				} else {
					window.close();
				}
			}
		</script>
	</body>
</html>
