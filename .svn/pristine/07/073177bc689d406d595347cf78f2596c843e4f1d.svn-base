<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>批量处理</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
<body style="background-color:#F3F3F3 ;">
	<div class="mainlistCon">
		<div style="text-align:center; margin:10px;">
			<form id="form2" action="#">
				<table cellpadding="0" class="cxTab" cellspacing="0" border="0"
					width="100%">
					<tr>
						<td colspan="4"></td>
					</tr>
					<tr>
						<td>审核意见：</td>
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
									<input id="medDetailListStr" name="medDetailListStr"
										class="mini-hidden" required="true" /> <input id="baz031"
										name="baz031" class="mini-hidden" required="true" /> <input
										id="baz033" name="baz033" class="mini-hidden" required="true" />
								</div>
								<div class="textareaBl">
									<div class="textareaBr">
										<div class="textareaBc"></div>
									</div>
								</div>
							</div></td>
					</tr>
					<tr>
						<td style="padding-bottom:6px;">扣款金额：</td>
						<td colspan="4">
							<div class="inputL" style="width: 150px">
								<div class="inputR">
									<div class="inputC">
										<input id="baz041" name="baz041" value="0.00"
											class="mini-textbox" />
									</div>
								</div>
							</div></td>
					</tr>
					<tr>
						<td nowrap="nowrap" colspan="5"
							style="text-align: center; padding-top: 5px;"><span
							class="btnMini"><em><input type="button"
									onclick="preCheck('01')" value="确定" /> </em> </span> <span class="btnMini"><em><input
									type="button" onclick="preCheck('05')" value="取消" /> </em> </span></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		valuechanged1();
		//tab页1的js查询
		function valuechanged1() {
			var yishisjz = document.getElementById('yishisjz');
			$
					.ajax({
						url : "${pageContext.request.contextPath}/k2/f10201006/getChartSZJ.action",
						type : "post",
						data : {},
						success : function(text) {
							bulidTimeTxtBox(yishisjz, text.sjz, 300, 300);
						}
					});
		}
	</script>
</body>
</html>
