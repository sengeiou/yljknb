<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>修改规则模板</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="../f10402001/checkBtnEdit.js"></script>
	</head>
	<body>
		<form id="form" action="" method="post">
			<input id="doType" name="doType" class="mini-hidden" />
			<div id="editForm1" style="margin: 10px; position: relative;">
				<table class="cxTab" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td class="textR">
							统筹区编码:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa027" class="mini-combobox" emptyText="请选择..."
											data="${dic['AAA027']}" textField="text" valueField="id" />
									</div>
								</div>
							</div>
							<input name="aaz319" class="mini-hidden" />
							<input name="aae100" class="mini-hidden" />
						</td>
						<td class="textR">
							<span style="color: red;">*</span>规则名：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa167" maxLength="100" class="mini-textbox"
											required="true" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							<span style="color: red;">*</span>模板名称：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input  allowInput="false" class="mini-buttonedit"
											onbuttonclick="queryModel" name="aaz320" textName="aaa169" onvalidation="checkButtonEdit"
											required="true" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							规则医疗分类：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa178" class="mini-combobox" emptyText="请选择..."
											data="${dic['AAA178']}" textField="text" valueField="id" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							监控类型：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa153" name="aaa153" class="mini-combobox"
											emptyText="请选择..." data="${dic['AAA153']}"
											readonly="readonly" textField="text" valueField="id" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							规则编号：
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input id="aaa168" name="aaa168" class="mini-textbox"
											readonly="readonly" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							增量方案参数列表:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa181" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							阈值比较方式:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa154" class="mini-combobox" emptyText="请选择..."
											textField="text" data="${dic['AAA154']}" valueField="id" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							增量方案参数说明:
						</td>
						<td colspan="3">
							<div style="padding-right: 4px; width:91%;margin-bottom:3px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aaa105" class="mini-textarea" style="width: 100%;"
										vtype="maxLength:400" />
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
						<td class="textR">
							实现方案参数列表:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa152" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							场景粒度:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="aaa179" class="mini-combobox" emptyText="请选择..."
											data="${dic['AAA179']}" textField="text" data="cjld"
											valueField="id" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">
							实现方案参数说明:
						</td>
						<td colspan="3">
							<div style="padding-right: 4px; width:91%;margin-bottom:3px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aae317" class="mini-textarea" style="width: 100%;"
										vtype="maxLength:400" />
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
						<td class="textR">
							<span style="color: red;">*</span>对象类型:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input name="apa709" class="mini-combobox" emptyText="请选择..."
											required="true" textField="text" data="${dic['APA709']}"
											valueField="id" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							规则描述:
						</td>
						<td >
							<div style="width:77%; margin-bottom:3px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc">
										</div>
									</div>
								</div>
								<div class="textareaLay">
									<input name="aaa133" class="mini-textarea" style="width: 100%;"
										vtype="maxLength:400" />
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
						<td class="textR">
							经办人:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input enabled="false" name="aae011" class="mini-textbox" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">
							经办日期:
						</td>
						<td>
							<div class="inputL" style="width: 130px">
								<div class="inputR">
									<div class="inputC">
										<input enabled="false" name="aae036" format="yyyy-MM-dd"
											onvaluechanged="onValueChanged" class="mini-datepicker"
											readonly="readonly" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<div style="padding-left:435px; ">
								<span class="btnMini"> 
									<em> 
										<input type="button" value="提交" onclick="SaveData();"/>
									 </em> 
								</span>
								<span class="btnMini"> 
									<em>
										 <input type="button"value="关闭" onclick="closeWin();"/>
									</em>
								</span>
							</div>
						</td>
					</tr>
				</table>
			</div>
			</fieldset>
		</form>
		<script type="text/javascript">
	mini.parse();
	var form = new mini.Form("form");

	function SetData(data) {
		$
				.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10402002/loadRule.action",
					type : "post",
					data : data,
					success : function(text) {
						var data = mini.decode(text);
						form.setData(data);
					}
				});
	}

	function SaveData() {
		var data = form.getData();
		form.validate();
		if (form.isValid() == false) {
			return;
		}
		var json = mini.encode(data);
		mini.mask( {
			el : document.body,
			cls : 'mini-mask-loading',
			html : '处理中...'
		});
		$
				.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10402002/updateRule.action",
					type : "post",
					data : {
						submitData : json
					},
					success : function(text) {
						mini.unmask(document.body);
						if (text.success) {
							mini.showMessageBox( {
								title : "提示",
								message : "成功修改一条记录",
								buttons : [ "确定" ],
								iconCls : "mini-messagebox-info",
								callback : function(action) {
									closeWin();
								}
							});
						} else {
							mini.alert(text.msg);
						}
					}
				});
	}

	function queryModel() {
		var btn = this;
		mini.open( {
			url : "../pages/k4/f10402002/f10402002_queryModel.jsp",
			title : "请选择模板",
			width : 1000,
			height : 450,
			ondestroy : function(action) {
			if(action=="ok"){
				var iframe = this.getIFrameEl();
				var data = iframe.contentWindow.GetData();
				data = mini.clone(data); //必须。克隆数据
				if (data) {
					btn.setValue(data.aaz320);
					btn.setText(data.aaa169);
					mini.get("aaa153").setValue(data.aaa153);
					getAaa168(data.aaa153);
				}
			}
		}
		});
	}

	function getAaa168(aaa153) {
		var aaa168;
		$
				.ajax( {
					url : "${pageContext.request.contextPath}/k4/f10402002/createAaa168.action",
					type : "post",
					data : {
						aaa153 : aaa153
					},
					success : function(data) {
						mini.get("#aaa168").setValue(data.aaa168);
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
