<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>稽核案件详情</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">稽核案件详情</span></h3> -->
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR">案件编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abz001" name="abz001" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">案件来源：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abb006" name="abb006" class="mini-combobox" onvaluechanged="sourceWay"
												   emptyText="请选择..." data="${dic['ABB006']}" allowInput="false" >
										</div>
									</div>
								</div>
							</td>
							<td class="textR">案件状态：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae426" name="aae426" class="mini-combobox" onvaluechanged="onState"
												   emptyText="请选择..." data="${dic['AAE426']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">立案经办人：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae011" name="aae011" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">经办时间：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae036" name="aae036" class="mini-datepicker" ondrawdate="onDrawDate"
												allowInput="false" showClearButton="false" showTodayButton="false"/>
										</div>
									</div>
								</div>
							</td>
							<td class="textR">办案责任人：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="acc789" name="acc789" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">督办期限（起始时间）：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa047" name="apa047" class="mini-textbox" allowInput="false"/>
											<!-- <input id="apa047" name="apa047" class="mini-datepicker" ondrawdate="onDrawDate"
												allowInput="false" showClearButton="false" showTodayButton="false"/> -->
										</div>
									</div>
								</div>
							</td>
							<td class="textR">督办期限（终止时间）：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="apa048" name="apa048" class="mini-textbox" allowInput="false"/> 
											<!-- <input id="apa048" name="apa048" class="mini-datepicker" ondrawdate="onDrawDate"
												allowInput="false" showClearButton="false" showTodayButton="false"/> -->
										</div>
									</div>
								</div>
							</td>
							<td class="textR">立案确认人：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae012" name="aae012" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">立案确认日期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae034s" name="aae034s" class="mini-datepicker" ondrawdate="onDrawDate"
												allowInput="false" showClearButton="false" showTodayButton="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td class="textR">案情描述：</td>
							<td colspan="6">
								<div style="padding-right:14px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="apf094" name="apf094" class="mini-textarea" style="width:100%;height:100px;"
											allowInput="false"/>
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
						<tr>
							<td class="textR">立案批示意见：</td>
							<td colspan="6">
								<div style="padding-right:14px;padding-top:2px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="aae189" name="aae189" class="mini-textarea" style="width: 100%; height:100px;" 
											allowInput="false"/>
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
						<tr>
							<td style="text-align: right; padding-top: 5px; padding-right:12px;"
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
			form.setEnabled(true);
			
			/* var abb006s;
			var aae426s; */
			
			//标准方法接口定义
		/* 	function setData(data){
				data = mini.clone(data)
				$.ajax({
					url:"${pageContext.request.contextPath}/common/loadAuditCaseByAaz318.action?method=loadAuditCaseInfoByAaz318",
					type:"post",
					data: {aaz318: data.aaz318},
					success: function (text){
						var data = mini.decode(text);
						form.setData(data);
						//alert(data.abz001);
						abb006s = data.abb006;
						aae426s = data.aae426;
					}
				});
			} */
			
			//标准方法接口定义
			function setData(data){
				data = mini.clone(data)
				$.ajax({
					url:"${pageContext.request.contextPath}/k3/f10301008/loadVerdictCaseByAaz318.action?method=loadVerdictCaseInfoByAaz318",
					type:"post",
					data: {aaz318: data.aaz318},
					success: function (text){
						var data = mini.decode(text);
						form.setData(data);
					}
				});
			}
			
			/* function sourceWay(){
				var abb006 = mini.get("abb006").getValue();
				
				if(abb006 != abb006s){
					mini.get("abb006").setValue(abb006s);
				}
			} */
			
			/* function onState(){
				var aae426 = mini.get("aae426").getValue();
				
				if(aae426 != aae426s){
					mini.get("aae426").setValue(aae426s);
				}
			} */
			
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