<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>查询案件信息</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<div id="" style="margin-top:0px; position: relative;">
			<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
					<tr>
						<td class="textR">案件编号：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="abz001" name="abz001" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">案情关键字：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="apf094" name="apf094" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
						<td>
							<input type="button" value="" class="cxsubmit" onclick="onSearchClick()" />
							<input type="reset" value="" class="cxreset" onclick="onClearClick()"/>
						</td>
					</tr>
				</table>
			</form>
			</div>
		</div>
		
		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit pTb8"><span class="iconCx">案件信息</span></h3>
				</div>
				
				<div id="datagrid1" class="mini-datagrid" style="width:100%; height:300px;" showPageSize="true"
					borderStyle="border:0" showPageIndex="true" onrowdblclick="onRowDblclick" multiSelect="false"
					pageSize="10" allowResize="true" allowCellSelect="true" onselectionchanged="onSelectionChanged"
					url="${pageContext.request.contextPath}/common/queryAuditCase.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="aaa027" width="100" headerAlign="center">统筹区</div>
						<div field="abz001" width="100" headerAlign="center">案件编号</div>
						<div field="apf094" width="100" headerAlign="center">案情描述</div>
						<div field="abb006" width="100" headerAlign="center" type="comboboxcolumn">
							 案件来源<input property="editor" class="mini-combobox" style="width:100%" data="${dic['ABB006']}">
						</div>
						<div field="aae426" width="100" headerAlign="center" type="comboboxcolumn">
							 案件状态<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AAE426']}">
						</div>
						<div field="acc789" width="100" headerAlign="center">办案责任人</div>
						<div field="apa047" width="100" headerAlign="center">督办期限</div>
						<div field="abb025s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">结案日期</div>
						<div field="aae189" width="100" headerAlign="center">立案批示意见</div>
					</div>
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
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			
			var queryForm = new mini.Form("form1");
			var grid = mini.get("datagrid1");
			//grid.load();
			
			function onSearchClick() {
				var data = queryForm.getData(true, false);
				grid.load(data);
			}
			
			function onClearClick(){
				queryForm.reset();
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
			
			function closeWin() {
				CloseWindow();
			}
			
			function resetForm() {
				queryForm.reset();
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