<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核案件详情</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<form id="form_info" action="" method="post">
			<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<h3 class="cxTit pTb8"><span class="iconCx">集合案件详情：</span></h3>
				<div id="infoForm1" style="margin: 10px; position: relative;">
					<table class="cxTab" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
						<tr>
							<td>案件编号：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="abz001" name="abz001" class="mini-textbox" />
							 </div></div></div>
							</td>
							<td>案件来源：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
								<input id="abb006" name="abb006" class="mini-combobox" 
									   emptyText="请选择案件来源..." data="${dic['ABB006']}"/>
									    </div></div></div>
							</td>
							<td>案件状态：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
								<input id="aae426" name="aae426" class="mini-combobox" 
									   emptyText="请选择案件状态..." data="${dic['AAE426']}"/>
									    </div></div></div>
							</td>
						</tr>
						<tr>
							<td>立案经办人：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae011" name="aae011" class="mini-textbox" />
							 </div></div></div>
							</td>
							<td>经办时间：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae036" name="aae036" class="mini-datepicker" />
							 </div></div></div>
							</td>
							<td>办案责任人：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="acc789" name="acc789" class="mini-textbox" />
							 </div></div></div>
							</td>
						</tr>
						<tr>
							<td>督办期限：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="apa047" name="apa047" class="mini-textbox" />
							 </div></div></div>
							</td>
							<td>立案确认人：</td>
							<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae012" name="aae012" class="mini-textbox" />
							 </div></div></div>
							</td>
							<td>立案确认日期：</td>
							<td>
							<div class="inputL" style="width:160px">
								<div class="inputR">
									<div class="inputC">
							<input id="aae034" name="aae034" class="mini-textbox" />
							 </div></div></div>
							</td>
						</tr>
						<tr>
							<td>案情描述：</td>
							<td colspan="5">
								<input id="apf094" name="apf094" class="mini-textarea" style="width: 100%;"/>
							</td>
						</tr>
						<tr>
							<td>立案批示意见：</td>
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
					url:"${pageContext.request.contextPath}/k3/f10301003/loadAuditCase.action?method=loadAuditCaseDetails",
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