<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>复议审核批量处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body>
	<div class="mainlistCon">
		<div style="text-align:center; margin:10px;">
			<form id="form" action="#">
				<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
					width="100%">
					<tr>
						<td colspan="4"></td>
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
										emptyText="请输入内容"></textarea>
									<input id="baz102" name="baz102" class="mini-hidden"
										required="true" /> <input id="kc62Ids" name="kc62Ids"
										class="mini-hidden" required="true" />
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc"></div>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td nowrap="nowrap" colspan="5"
							style="text-align: center; padding-top: 5px;"><span
							class="btnMini"><em><input type="button"
									onclick="saveData()" value="确定" /> </em> </span> <span class="btnMini"><em><input
									type="button" onclick="revert()" value="取消" /> </em> </span></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("form");

		function setData(data) {
			mini.get("kc62Ids").setValue(data.kc62Ids);
			mini.get("baz102").setValue(data.baz102);
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
							url : "${pageContext.request.contextPath}/k5/f10506001/sendToDoctor.action",
							type : "post",
							data : {
								submitData : json
							},
							success : function(text) {
								mini.unmask(document.body);
								if (text.success) {
									mini.showMessageBox({
										title : "提示",
										message : "一共" + text.result[0].toCount
												+ "条明细,成功下发"
												+ text.result[0].suCount
												+ ",其余"
												+ text.result[0].erCount
												+ "条由于没有医师编号或者医师编号下发失败",
										buttons : [ "确定" ],
										iconCls : "mini-messagebox-info",
										callback : function(action) {
											revert();
										}
									});
								} else {
									mini.alert(text.msg);
								}
							}
						});
			}
		}

		function revert() {
			closeWindow("cancel");
		}

		function closeWindow(action) {
			if (window.CloseOwnerWindow) {
				return window.CloseOwnerWindow(action);
			} else {
				window.close();
			}
		}
	</script>
</body>
</html>