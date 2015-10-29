<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>参保人详情</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz010" name="aaz010" value="" class="mini-hidden" required="true"/>
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">参保人员详情</span></h3> -->
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">人员编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac001" name="aac001" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">社会保障号码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac002" name="aac002" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">姓名：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">性别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac004" name="aac004" class="mini-combobox" data="${dic['AAC004']}"
												allowInput="false" onvaluechanged="onSex"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">出生日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac006s" name="aac006s" class="mini-datepicker" allowInput="false"
												ondrawdate="onDrawDate"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">离退休情况：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac084" name="aac084" class="mini-combobox" allowInput="false"
												data="${dic['AAC084']}" onvaluechanged="onRetire"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">参保单位编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab001" name="aab001" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">参保单位名称：</td>
							<td ><!--colspan="3"-->
								<div class="inputL" style="width:130px;">
									<div class="inputR">
										<div class="inputC">
											<input id="aab004" name="aab004" class="mini-textbox" style="width:100%;" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td style="text-align: right; padding-top: 5px; padding-right:4px;"
								colspan="6" class="mainlistCon">
								<span class="btnMini">
									<em>
										<input type="button" value="返回" onclick="closeWin()"/>
									</em>
								</span>
							</td>
						</tr>
					</table>
				</div>
			</fieldset>
		</form>
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form_info");
			//form.setEnable(true);
			
			var aac004s;
			var aac084s;
			
			function setData(data){
				data = mini.clone(data);
				$.ajax({
					url:"${pageContext.request.contextPath}/k3/f10301003/loadInsuredPerson.action?method=loadInsuredPersonInfo",
					//url:"${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
					type:"post",
					data:{aaz010 : data.aaz010,aaz077:data.aaz077},
					success: function (text){
						var data = mini.decode(text);
						form.setData(data);
						
						aac004s = data.aac004;
						aac084s = data.aac084;
					}
				});
			}
			
			function onSex(){
				var aac004 = mini.get("aac004").getValue();
				if(aac004 != aac004s){
					mini.get("aac004").setValue(aac004s);
				}
			}
			
			function onRetire(){
				var aac084 = mini.get("aac084").getValue();
				if(aac084 != aac084s){
					mini.get("aac084").setValue(aac084s);
				}
			}
			
			function closeWin(){
				CloseWindow();
			}
			
			function CloseWindow(action) {            
				if (window.CloseOwnerWindow){
					   return window.CloseOwnerWindow(action);
				}else{
					  window.close();
				}            
			}
		</script>
	</body>
</html>