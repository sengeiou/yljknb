<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医护人员详情</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz010" name="aaz010" value="" class="mini-hidden" required="true"/>
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<!-- <h3 class="cxTit pTb8"><span class="iconCx">医护人员详情</span></h3> -->
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
						<tr>
							<td>姓名：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aac003" name="aac003" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>联系电话：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae005" name="aae005" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>公民身份证号码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aab014" name="aab014" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>个人编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz263" name="aaz263" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>医疗机构编号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akb020" name="akb020" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>医疗机构名称：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
							<input id="akb021" name="akb021" class="mini-textbox" allowInput="false"/>
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>科室：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae386" name="aae386" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>行政职务代码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc049" name="akc049" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC049']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>专业技术职务：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaf009" name="aaf009" class="mini-combobox" emptyText="请选择..."
												data="${dic['AAF009']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>药师类别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc278" name="akc278" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC278']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>药师职业类别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc279" name="akc279" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC279']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>执业范围：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc281" name="akc281" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC281']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>药师资格证号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc282" name="akc282" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC282']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>药师注册证号：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc283" name="akc283" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC283']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>医师资格证编码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc054" name="akc054" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>第一职业地点：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc057" name="akc057" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>多点职业标志：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc051" name="akc051" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC051']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>医师执业证编码：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc056" name="akc056" class="mini-textbox" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td>门诊大病医师：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc052" name="akc052" class="mini-combobox" emptyText="请选择..."
												data="${dic['AKC052']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>当前是否有效：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae100" name="aae100" class="mini-combobox" emptyText="请选择..."
												data="${dic['AAE100']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
							<td>医保处方权状态：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="akc053" name="akc053" class="mini-combobox" emptyText="请选择..."
												data="${dic['AAE053']}" allowInput="false"/>
										</div>
									</div>
								</div>
							</td>
						</tr>
						
						<tr>
							<td>备注：</td>
							<td colspan="6">
								<div style="padding-right:20px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="aae013" name="aae013" class="mini-textarea" style="width: 100%;height:100px;" 
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
							<td style="text-align: right; padding-top: 5px; padding-right:20px;"
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
			
			function setData(data){
				data = mini.clone(data);
				$.ajax({
					url:"${pageContext.request.contextPath}/k3/f10301003/loadPhysician.action?method=loadPhysicianInfo",
					//url:"${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
					type:"post",
					data:{aaz010: data.aaz010,aaz077:data.aaz077},
					success: function (text){
						var data = mini.decode(text);
						form.setData(data);
					}
				});
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