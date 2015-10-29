<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构信息</title>
<%@ include file="../../pages/pub/pubsource.jsp"%>
</script>
</head>
<body>
	<form id="form1" action="" method="post">
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
			<input id="baz031" name="baz031" class="mini-hidden" />
				<div id="" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
						width="100%">
						<tr>
							<td class="textR">医疗机构编号:</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textBox" />
										</div>
									</div>
								</div></td>
								<td></td>
							<td class="textR">医疗机构名称:</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb021" name="akb021" class="mini-textBox" />
										</div>
									</div>
								</div></td>
								<td
								style="text-align: center; padding-top: 5px;" colspan="2"
								><input type="button" value="" class="cxsubmit"
								onclick="search()" /> <input type="reset" value=""
								class="cxreset" onclick="resetForm()" /></td>
						</tr>
					</table>
				</div>
			</div>
		</fieldset>

		<fieldset style="border: solid 0px #aaa; position: relative;">
			<div class="mainlistCon">
				<div class="listTit">
					<h3 class="cxTit pTb8">
						<span class="iconCx">医疗服务机构列表</span>
					</h3>
				</div>

				<div style="margin-top:0px;">
					<div id="grid1" class="mini-datagrid" idField="id"
						multiSelect="true" style="width: 100%; height:220px;"
						onselectionchanged="onSelectionChanged" allowResize="true"
						pageSize="10" showColumnsMenu="true"
						url="${pageContext.request.contextPath}/common/queryHospitalDBZ.action">
						<div property="columns">
							<div type="checkcolumn"></div>
							<div field="akb020" width="50" headerAlign="center">医疗服务机构编号</div>
							<div field="akb021" width="100" headerAlign="center">医疗服务机构名称</div>
						</div>
					</div>
					<div style="text-align:center;margin:10px;" class="mainlistCon">
						<span class="btnMini"> <em> <input type="button"
								value="确定" onclick="selectValue()" id="e_btn" name="e_btn" /> </em> </span>
						<span class="btnMini"> <em> <input type="button"
								value="返回" onclick="closeWin()" id="b_btn" name="b_btn" /> </em> </span>
					</div>
				</div>
			</div>
		</fieldset>
	</form>
	<script type="text/javascript">
		mini.parse();
		function SetData(data) {
			var baz031=mini.get("baz031");
			baz031.setValue(data.baz031);
		}
		var form = new mini.Form("form1");
		var grid = mini.get("grid1");

		function search() {
			var data = form.getData(true, false);
			grid.load(data);
		}

		function selectValue() {
			var rows = grid.getSelecteds();
			if (rows == 0) {
				mini.alert("请选择一条记录");
			} else {
				CloseWindow("ok");
			}
		}

		function GetData() {
			var rows = grid.getSelecteds();
			return rows;
		}

		function onSelectionChanged(e) {
			var grid = e.sender;
			var record = grid.getSelected();
			var btn = new mini.get("e_btn");
			btn.enabled = true;
		}

		function resetForm() {
			form.reset();
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
