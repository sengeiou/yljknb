<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>单病种处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<script type="text/javascript">
	mini.parse();
	var cyyj = [ {
		"id" : "1",
		"text" : "常用语句1"
	}, {
		"id" : "2",
		"text" : "常用语句2"
	}, {
		"id" : "3",
		"text" : "常用语句3"
	} ];
</script>
<body style="background-color:#F3F3F3 ;">
	<div class="mainlistCon">
		<div style="text-align:center; margin:10px;">
			<form id="form" action="#">
				<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
					width="100%">
					<tr>
						<td></td>
						<td colspan="4"><input id="cyyj" style="width:40px;"
							showClose="true" popupWidth="150" name="cyyj" textField="text"
							class="mini-combobox" data="cyyj" multiSelect="true"
							oncloseclick="onCloseClick" onvaluechanged="onValueChanged">
								<div property="columns">
									<div header="常用语句" field="text"></div>
								</div> </input>
						</td>
					</tr>
					<tr>
						<td>请输入内容：</td>
						<td colspan="4">
							<div style="padding-right:4px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="baz021" name="baz021" class="mini-textarea"
										emptyText="请输入审核意见"></textarea>
									<input id="baz031" name="baz031" class="mini-hidden"
										required="true" /> <input id="baz033" name="baz033" value="2"
										class="mini-hidden" required="true" /> <input id="ids"
										name="ids" class="mini-hidden" required="true" />
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc"></div>
									</div>
								</div>
							</div></td>

					</tr>

					<input id="baz041" name="baz041" class="mini-textbox"
						visible="false" />

					<tr>
						<td nowrap="nowrap" colspan="5"
							style="text-align: center; padding-top: 5px;"><span
							class="btnMini"><em><input type="button"
									onclick="saveData()" value="确定" /> </em> </span> <span class="btnMini"><em><input
									type="button" onclick="closeWin()" value="取消" /> </em> </span></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("form");

		function SetData(data) {
			mini.get("ids").setValue(data.ids);
			mini.get("baz031").setValue(data.baz031);
		}
		function onCloseClick(e) {
			var obj = e.sender;
			obj.setText("");
			obj.setValue("");
			mini.get("baz021").setValue("");
		}
		function onValueChanged(e) {
			var obj = e.sender;
			var text = "";
			var textstr = obj.getText().split(",");
			for ( var i = 0; i < textstr.length; i++) {
				if ((i + 1) == textstr.length) {
					text = text + textstr[i];
				} else {
					text = text + textstr[i] + "\n";
				}
			}
			mini.get("baz021").setValue(text);
		}
		function saveData() {
			var data = form.getData();
			form.validate();
			if (form.isValid() == false) {
				return;
			}
			var length = mini.get("baz021").getValue().replace(/[^\x00-\xff]/g,
					"xx").length;
			if (length > 400) {
				mini.alert("录入内容不能超过200字 ");
			}
			if (length <= 400) {
				var json = mini.encode(data);
				mini.mask({
					el : document.body,
					cls : 'mini-mask-loading',
					html : '处理中...'
				});
				$
						.ajax({
							url : "${pageContext.request.contextPath}/k2/f10205001/dealMedDocument.action",
							type : "post",
							data : {
								submitData : json
							},
							success : function(text) {
								mini.unmask(document.body);
								if (text.success) {
									var result = text.result;
									if (result[0].error > 0) {
										mini.showMessageBox({
											title : "提示",
											message : result[0].success
													+ "条操作成功,"
													+ result[0].error
													+ "条已被他人操作。",
											buttons : [ "确定" ],
											iconCls : "mini-messagebox-info",
											callback : function(action) {
												closeWin();
											}
										});
									} else {
										mini.showMessageBox({
											title : "提示",
											message : "操作成功！",
											buttons : [ "确定" ],
											iconCls : "mini-messagebox-info",
											callback : function(action) {
												closeWin();
											}
										});
									}
								} else {
									mini.alert(text.msg);
								}
							}
						});

			}
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
