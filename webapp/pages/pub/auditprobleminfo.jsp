<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>案件詳情</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">疑点问题详情</span></h3>
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">受理方式：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa703" name="apa703" class="mini-combobox" data="${dic['APA703']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">受理日期：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape711s" name="ape711s" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">统筹区：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027" name="aaa027" class="mini-combobox" data="${dic['AAA027']}"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">信息来源方类型：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa704" name="apa704" class="mini-combobox" data="${dic['APA704']}"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">来源方名称：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape028" name="ape028" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">来源方联系人：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape713" name="ape713" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">信息来源方式：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa705" name="apa705" class="mini-combobox" data="${dic['APA705']}"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">邮政编码：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae007" name="aae007" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">地址：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae006" name="aae006" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">联系电话：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae005" name="aae005" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">电子邮箱：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae159" name="aae159" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">案件编号：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="abz001" name="abz001" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">问题处理状态：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa165" name="apa165" class="mini-combobox" data="${dic['APA165']}"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">问题关闭人：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape133" name="ape133" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">问题关闭日期：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape027s" name="ape027s" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">经办人：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae011" name="aae011" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">经办时间：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae036" name="aae036" class="mini-datepicker" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">备注：</td>
							<td>
								<div class="inputL" style="width:160px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae013" name="aae013" class="mini-textbox" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">问题简述：</td>
							<td colspan="6">
								<div style="padding-right:4px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="ape712" name="ape712" class="mini-textarea" style="width: 100%;"/>
									</div>
									<div class="textareaBl">
										<div class="textareaBr">
											<div class="textareaBc">
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</fieldset>
		</form>
		<script type="text/javascript">
			mini.parse();
			var form = new mini.Form("form_info");
			form.setEnabled(false);
			
			//标准方法接口定义
			function setData(data){
				data = mini.clone(data)
				$.ajax({
					url:"${pageContext.request.contextPath}/common/loadAuditCaseByAaz318.action?method=loadAuditCaseInfoByAaz318",
					type:"post",
					data: {aaz318: data.aaz318},
					success: function (text){
						var data = mini.decode(text);
						form.setData(data);
					}
				});
			}
		</script>
	</body>
</html>