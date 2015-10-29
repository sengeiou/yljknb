<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>立案登记</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>

<body>
	<form  id="form1" action="" method="post">
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<legend> </legend>
			<h3 class="cxTit pTb8"><span class="iconCx"> 立案信息</span></h3>
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR">受理方式:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa703" class="mini-combobox"
											data="${dic['APA703']}" textField="text" valueField="id"
											emptyText="请选择受理方式..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">受理日期:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="ape711" class="mini-textBox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">统筹区:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa027" class="mini-combobox"
											data="${dic['AAA027']}" textField="text" valueField="id"
											emptyText="请选择统筹区..." />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">信息来源方类型:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa704" class="mini-combobox"
											data="${dic['APA704']}" textField="text" valueField="id"
											emptyText="请选择信息来源方类型..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">来源方名称:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="ape028" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">来源方联系人:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="ape713" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">信息来源方式:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa705" class="mini-combobox"
											data="${dic['APA705']}" textField="text" valueField="id"
											emptyText="请选择信息来源方式..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">邮政编码:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae007" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">地址:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae006" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">联系电话:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae005" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">电子邮箱:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae159" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">案件编号:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="abz001" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">问题处理状态:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa165" class="mini-combobox"
											data="${dic['APA165']}" textField="text" valueField="id"
											emptyText="请选择问题处理状态..." />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">问题关闭人:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
						    			<input name="ape133" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">问题关闭日期:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="ape027" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">经办人:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae011" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">经办时间:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae036" class="mini-datepicker" dateFormat="yyyy-MM-dd" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">备注:</td>
						<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
										<input name="aae013" class="mini-textBox" allowInput="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">问题简述：</td>
						<td colspan="5"><input name="ape712" class="mini-textarea" style="height: 120px; width: 600px" 
							required="true" maxlength="4000" /></td>
					</tr>
				</table>
			</div>
		</fieldset>
	</form>
	
	<script type="text/javascript">
		mini.parse();

		var form = new mini.Form("#form1");
		form.setEnabled(false);

		function loadData(data) {
			var data = mini.clone(data);
			$.ajax({
				url : "${pageContext.request.contextPath}/k3/f10301002/auditFile.action?method=loadAuditFile",
				type : "post",
				data : {
					aaz281 : data.aaz281
				},
				success : function(text) {
					var data = mini.decode(text);
					form.setData(data);
				}
			});
		}

		function closeWin() {
			CloseWindow();
		}

		function CloseWindow(action) {
			if (window.CloseOwnerWindow) {
				return window.CloseOwnerWindow(action);
			} else {
				window.close();
			}
		}
	</script>
</body>
</html>
