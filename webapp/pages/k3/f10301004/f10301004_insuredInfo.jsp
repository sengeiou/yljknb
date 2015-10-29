<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>参保人详情</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">参保人详情</span></h3>
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
						<tr>
							<td>人员编号：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac001" name="aac001" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>姓名：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac003" name="aac003" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>性别：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac004" name="aac004" class="mini-combobox" emptyText="请选择性别..."/>
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>出生日期：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac006" name="aac006" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>离退休：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac084" name="aac084" class="mini-combobox" emptyText="请选择离退休状态..."/>
							</div></div></div>
							</td>
							<td>社会保障号码：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aac002" name="aac002" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>监控等级：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa151" name="apa151" class="mini-combobox" emptyText="请选择监控等级..."/>
							</div></div></div>
							</td>
							<td>联系电话：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae005" name="aae005" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>稽核对象类型：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa709" name="apa709" class="mini-combobox" emptyText="请选择稽核对象类型..."/>
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>稽核问题类型：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa701" name="apa701" class="mini-combobox" emptyText="请选择稽核问题类型..."/>
							</div></div></div>
							</td>
							<td>稽核结论类型：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa005" name="apa005" class="mini-combobox" emptyText="请选择稽核结论类型..."/>
							</div></div></div>
							</td>
							<td>稽核定论人：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="ape725" name="ape725" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>稽核定论日期：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="ape727" name="ape727" class="mini-textbox" />
							</div></div></div>
							</td>
							
						</tr>
						<tr>
							<td>稽核结论：</td>
							<td colspan="6">
								<input id="ape726" name="ape726" class="mini-textarea" style="width: 100%;"/>
							</td>
						</tr>
						<tr>
							<td>不予处理：</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="" ></div>
							</td>
						</tr>
						<tr>
							<td>给予处理：</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="经办处理处罚" >经办处理处罚</div>
							</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="行政处理处罚" >行政处理处罚</div>
							</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="司法处理" >司法处理</div>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="冻结社会保障卡就医" >冻结社会保障卡就医</div>
							</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="暂停个人医保待遇" >暂停个人医保待遇</div>
							</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="纳入重点监控" >纳入重点监控</div>
							</td>
						</tr>
						<tr>
							<td>违规金额</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="ape752" name="ape752" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>重点监控截止日期：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae031" name="aae031" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>结论确认状态：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa011" name="apa011" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>结论确认人：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae012" name="aae012" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>结论确认日期：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae034" name="aae034" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>结论批示意见：</td>
							<td colspan="6">
								<input id="aae189" name="aae189" class="mini-textarea" style="width: 100%;"/>
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
			//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			$.ajax({
     				url:"${pageContext.request.contextPath}/k3/f10301004/loadBeAuditTarget.action?method=loadBeAuditTargetInfo",
     				type: "post",
	     			data:{aaz077:data.aaz077},
	     			success: function (text){
	     				var data = mini.decode(text);
	     				form.setData(data);
	     			}
     			});
     		}
		</script>
	</body>
</html>