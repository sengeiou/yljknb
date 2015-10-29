<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>案件详情</title>
		<%@ include file="../../pages/pub/pubsource.jsp"%>
	</head>
	
	<body>
		<div id="tabs1" class="mini-tabs" activeIndex="0" style="width:100%;" plain="false">
			<!-- 案件详情 -->
			<div title="案件详情" >
				<form id="form_info1" action="" method="post">
					<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
					
					<fieldset style="width: 100%; border: solid 1px #aaa;">
						<legend>案件详情</legend>
						
						<div id="infoForm1" style="margin: 10px; position: relative;">
							<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
								<tr>
									<td>案件编号：</td>
									<td><input id="abz001" name="abz001" class="mini-textbox" /></td>
									<td>案件来源：</td>
									<td>
										<input id="abb006" name="abb006" class="mini-combobox" 
											   emptyText="请选择..." data="${dic['ABB006']}"/>
									</td>
									<td>案件状态：</td>
									<td>
										<input id="aae426" name="aae426" class="mini-combobox" 
											   emptyText="请选择..." data="${dic['AAE426']}"/>
									</td>
								</tr>
								<tr>
									<td>立案经办人：</td>
									<td><input id="aae011" name="aae011" class="mini-textbox" /></td>
									<td>经办时间：</td>
									<td><input id="aae036" name="aae036" class="mini-textbox" /></td>
									<td>办案责任人：</td>
									<td><input id="acc789" name="acc789" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>督办期限：</td>
									<td><input id="apa047" name="apa047" class="mini-textbox" /></td>
									<td>立案确认人：</td>
									<td><input id="aae012" name="aae012" class="mini-textbox" /></td>
									<td>立案确认日期：</td>
									<td><input id="aae034" name="aae034" class="mini-textbox" /></td>
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
			</div>
			
			<!-- 登记的疑点问题 -->
			<div title="登记的疑点问题" >
				<form id="form_info2" action="" method="post">
					<input id="aaz318" name="aaz318" value="" class="mini-hidden" required="true"/>
					
					<fieldset style="width: 100%; border: solid 1px #aaa;">
						<legend>疑点信息详情</legend>
						
						<div id="infoForm2" style="margin: 10px; position: relative;">
							<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
								<tr>
									<td>受理方式：</td>
									<td>
										<input id="apa703" name="apa703" class="mini-combobox" data="${dic['APA703']}" />
									</td>
									<td>受理日期：</td>
									<td>
										<input id="ape711s" name="ape711s" class="mini-textbox" />
									</td>
									<td>统筹区：</td>
									<td>
										<input id="aaa027" name="aaa027" class="mini-combobox" data="${dic['AAA027']}"/>
									</td>
								</tr>
								<tr>
									<td>信息来源方类型：</td>
									<td>
										<input id="apa704" name="apa704" class="mini-combobox" data="${dic['APA704']}"/>
									</td>
									<td>来源方名称：</td>
									<td><input id="ape028" name="ape028" class="mini-textbox" /></td>
									<td>来源方联系人：</td>
									<td><input id="ape713" name="ape713" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>信息来源方式：</td>
									<td><input id="apa705" name="apa705" class="mini-combobox" data="${dic['APA705']}"/></td>
									<td>邮政编码：</td>
									<td><input id="aae007" name="aae007" class="mini-textbox" /></td>
									<td>地址：</td>
									<td><input id="aae006" name="aae006" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>联系电话：</td>
									<td><input id="aae005" name="aae005" class="mini-textbox" /></td>
									<td>电子邮箱：</td>
									<td><input id="aae159" name="aae159" class="mini-textbox" /></td>
									<td>案件编号：</td>
									<td><input id="abz001" name="abz001" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>问题处理状态：</td>
									<td><input id="apa165" name="apa165" class="mini-combobox" data="${dic['APA165']}"/></td>
									<td>问题关闭人：</td>
									<td><input id="ape133" name="ape133" class="mini-textbox" /></td>
									<td>问题关闭日期：</td>
									<td><input id="ape027" name="ape027" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>经办人：</td>
									<td><input id="aae011" name="aae011" class="mini-textbox" /></td>
									<td>经办时间：</td>
									<td><input id="aae036" name="aae036" class="mini-textbox" /></td>
									<td>备注：</td>
									<td><input id="aae013" name="aae013" class="mini-textbox" /></td>
								</tr>
								<tr>
									<td>问题简述：</td>
									<td colspan="6">
										<input id="ape712" name="ape712" class="mini-textarea" style="width: 100%;"/>
									</td>
								</tr>
							</table>
						</div>
					</fieldset>
				</form>
			</div>
			
			<!-- 就诊信息 -->
			<div title="就诊信息" >
				<div id="infoForm3" style="margin: 10px; position: relative;">
					<table class="form-table" border="0" cellpadding="1" cellspacing="2" style="width: 100%">
						<tr>
							<td style="text-align: left; padding-top: 5px; padding-right: 20px;">
								
							</td>
						</tr>
					</table>
				</div>
			</div>
			
			<!-- 历史违规记录 -->
			<div title="历史违规记录" >
				4
			</div>
		</div>
	</body>
</html>