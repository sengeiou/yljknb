<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构详情</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz077" name="aaz077" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">医疗服务机构详情</span></h3>
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
						<tr>
							<td>医疗机构编号：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb020" name="akb020" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>医疗机构名称：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb021" name="akb021" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>医疗机构类型：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb022" name="akb022" class="mini-combobox" emptyText="请选择医疗机构类型..."/>
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>医院等级：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aka101" name="aka101" class="mini-combobox" emptyText="请选择医院等级..."/>
							</div></div></div>
							</td>
							<td>联网结算标识：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb011" name="akb011" class="mini-combobox" emptyText="请选择>联网结算标识..."/>
							</div></div></div>
							</td>
							<td>医疗机构分类：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb023" name="akb023" class="mini-combobox" emptyText="请选择医疗机构分类..."/>
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>医疗机构许可证：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb026" name="akb026" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>分院标志：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb100" name="akb100" class="mini-combobox" emptyText="请选择分院标志..."/>
							</div></div></div>
							</td>
							<td>上级医疗机构：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="akb101" name="akb101" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>医保联系人：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae004" name="aae004" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>电话：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae005" name="aae005" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>邮编：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae007" name="aae007" class="mini-textbox" />
							</div></div></div>
							</td>
						</tr>
						<tr>
							<td>机构地址：</td>
							<td colspan="5">
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
								<input id="aae006" name="aae006" class="mini-textbox" style="width: 96%;"/>
								</div></div></div>
							</td>
						</tr>
						<tr>
							<td>稽核对象类型：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa709" name="apa709" class="mini-combobox" emptyText="请选择稽核对象类型..."/>
							</div></div></div>
							</td>
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
						</tr>
						<tr>
							<td>稽核定论人：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="ape725" name="ape725" class="mini-textbox" />
							</div></div></div>
							</td>
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
							<td colspan="5">
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
								<div id="" name="" class="mini-checkbox" checked="" text="停止医疗服务资格" >停止医疗服务资格</div>
							</td>
							<td>
								<div id="" name="" class="mini-checkbox" checked="" text="纳入重点监控" >纳入重点监控</div>
							</td>
						</tr>
						<tr>
							<td>违规金额：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="ape752" name="ape752" class="mini-textbox" />
							</div></div></div>
							</td>
							<td>重点监控截止期：</td>
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
							<input id="apa011" name="apa011" class="mini-combobox" emptyText="请选择结论确认状态..."/>
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
							<td colspan="5">
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