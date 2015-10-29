<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>稽核结论登记</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<h3 class="cxTit pTb8"><span class="iconCx">稽核调查列表</span></h3>
			<div style="margin: 10px;">
				<div id="grid1" class="mini-datagrid" idField="id" multiSelect="true"
					 style="width: 100%; height: 150px;" allowResize="true"
					 url="${pageContext.request.contextPath}/common/querySurveyRecord.action">
					 <div property="columns">
					 	<div type="indexcolumn"></div>
					 	<div field="optera" width="100" headerAlign="center" renderer="rendererGrid1">操作</div>
					 	<div field="aaz148" width="100" headerAlign="center">稽核调查记录事件ID</div>
					 	<div field="aaz010" width="100" headerAlign="center">当事人ID</div>
					 	<div field="ape128" width="100" headerAlign="center">当事人名称</div>
					 	<div field="apa706" width="100" headerAlign="center" type="comboboxcolumn">
					 		调查取证方式<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA706']}">
					 	</div>
					 	<div field="apa709" width="100" headerAlign="center" type="comboboxcolumn">
					 		被调查人类型<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA709']}">
					 	</div>
					 	<div field="ape718" width="100" headerAlign="center">调查人</div>
					 	<div field="ape722s" width="100" headerAlign="center" dateFormat="yyyy-MM-dd">调查日期</div>
					 	<div field="ape721" width="100" headerAlign="center">调查结果</div>
					 	<div field="ape715" width="100" headerAlign="center">要求准备材料</div>
					 	<div field="ape023" width="100" headerAlign="center">材料说明</div>
					 	<%-- <div field="apa702" width="100" headerAlign="center" type="comboboxcolumn">
					 		是否发单通知<input property="editor" class="mini-combobox" style="width:100%" data="${dic['APA702']}">
					 	</div> --%>
					 </div>
				</div>
			</div>
		</fieldset>
		<h3 class="cxTit pTb8"><span class="iconCx">稽核结论</span></h3>
		<fieldset style="width: 100%; border: solid 0px #aaa; ">
			
			<form id="form1" action="" method="post" style="display: none;" onsubmit="return false;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR"><span style="color: red;">*</span>案由：</td>
						<td colspan="3">
							<div class="inputL" style="width:530px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701_1" name="apa701" class="mini-combobox"
											   data="${dic['APE701']}" emptyText="请选择..."/>
								   	</div>
								</div>
							</div>
						</td>
					</tr>
					<td class="textR">是否改变医疗保险费用结算方式：</td>
						<td>
							<select name="apa763" class="mini-radiobuttonlist" id="apa763" onvaluechanged="onApa763Changed">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					<tr>
						<td class="textR">结算方式时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC"><%--
										<input name = "ape741" id="ape741_01" class="mini-datepicker" enabled="false" />
										--%><input name="ape741_01" id="ape741_01" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApe741" enabled="false"/>
										<input id="ape741s" name="ape741s" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">结算方式时间(终止)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<%--<input name = "ape742" id="ape742_01" onvaluechanged="onValueChanged1" class="mini-datepicker" enabled="false" />--%>
										<input name="ape742_01" id="ape742_01" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApe742" enabled="false"/>
										<input id="ape742s" name="ape742s" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否暂停医疗保险待遇：</td>
						<td>
							<select name="apa163" class="mini-radiobuttonlist" id="apa163_01" onvaluechanged="onApa163Changed" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">追回医保基金损失：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape752" name="ape752" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">暂停时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC"><%--
										<input name = "apa133" id="apa133" class="mini-datepicker" enabled="false"/>
										--%>
										<input name="apa133" id="apa133" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApa133" enabled="false"/>
										<input id="apa133s" name="apa133s" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">暂停时间(终止)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC"><%--
										<input name = "apa134" id="apa134" class="mini-datepicker" enabled="false"/>
										--%>
										<input name="apa134" id="apa134" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApa134" enabled="false"/>
										<input id="apa134s" name="apa134s" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交：</td>
						<td>
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_1" onvaluechanged="apa168Changed_1()" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR">移交行政部门：</td>
						<td>
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_1" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">罚款：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae257_1" name="aae257" class="mini-textbox" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td>
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_1" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR" ><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="3" >
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入查实违规行为..." style="height: 60px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="4" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_01" type="button" value="保存" onclick="saveRegVerd_1()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
			<form id="form2" action="" method="post" style="display: none;" onsubmit="return false;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR"><span style="color: red;">*</span>案由：</td>
						<td colspan="3">
							<div class="inputL" style="width:550px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701_2" name="apa701" class="mini-combobox"
											   data="${dic['APE702']}" emptyText="请选择..."/>
								   	</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">扣分：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae258" name="aae258" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
						<td></td>
						<td></td>
						<!-- <td class="textR">追回医保基金损失：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape752" name="ape752" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td> -->
					</tr>
					<tr>
						<td class="textR">是否停止医疗保险服务费用结算:</td>
						<td>
							<select name="apa163" class="mini-radiobuttonlist" id="apa163" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR">停止医保费用结算时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<%--<input name = "ape741" id="ape741" class="mini-datepicker"  />
										--%>
										<input name="ape741_2" id="ape741_2" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApe741s"/>
										<input id="ape741s2" name="ape741s2" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">停止医保费用结算时间(终止)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<%--<input name = "ape742" id="ape742" class="mini-datepicker"  />
										--%>
										<input name="ape742_2" id="ape742_2" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApe742s"/>
										<input id="ape742s2" name="ape742s2" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交：</td>
						<td>
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_2" onvaluechanged="apa168Changed_2()" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">移交行政部门：</td>
						<td>
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_2" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td>
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_2" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR" ><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="3" >
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入查实违规行为..." style="height: 60px;"></textarea>
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
						<td style="text-align:center; padding-top: 20px; padding-right: 20px;" colspan="4" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_02" type="button" value="保存" onclick="saveRegVerd_2()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
			<form id="form3" action="" method="post" style="display: none;" onsubmit="return false;">
				<table style="width: 100%;" class="cxTab">
					<tr>
						<td class="textR"><span style="color: red;">*</span>案由：</td>
						<td colspan="3">
							<div class="inputL" style="width:530px">
								<div class="inputR">
									<div class="inputC">
										<input id="apa701_3" name="apa701" class="mini-combobox"
											    data="${dic['APA701']}" emptyText="请选择..."/>
								   	</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">核减人次：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae619" name="aae619" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
						<td class="textR">核减人头：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae618" name="aae618" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否停止医疗保险服务费用结算：</td>
						<td>
							<select name="apa163" class="mini-radiobuttonlist" id="apa163" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">追回医保基金损失：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ape752" name="ape752" class="mini-textbox" style="width:100%;" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">结算方式时间(起始)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<%--<input name = "ape741" id="ape741" class="mini-datepicker"  />
									--%>
										<input name="ape741_3" id="ape741_3" class="mini-datepicker" 
									   			   onvaluechanged="onValueChangedApe741ss"/>
										<input id="ape741s3" name="ape741s3" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">结算方式时间(终止)：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<%--<input name = "ape742" id="ape742" class="mini-datepicker"  />
									--%>
										<input name="ape742_3" id="ape742_3" class="mini-datepicker" 
								   			   onvaluechanged="onValueChangedApe742ss"/>
									<input id="ape742s3" name="ape742s3" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交：</td>
						<td>
							<select name="apa168" class="mini-radiobuttonlist" id="apa168_3" onvaluechanged="apa168Changed_3()" >
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR">移交行政部门：</td>
						<td>
							<div class="inputL" style="width:150px;">
								<div class="inputR">
								 	<div class="inputC">
										<input id="ade189_3" name="ade189" class="mini-textbox" style="width:100%;" enabled="false"/>
									</div>
								</div>
							</div>
						</td>
						<td class="textR">罚款：</td>
						<td>
							<div class="inputL" style="width:150px">
								<div class="inputR">
								 	<div class="inputC">
										<input id="aae257_3" name="aae257" class="mini-textbox" style="width:100%;" enabled="false" />
									</div>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="textR">是否移交警方追究刑事责任：</td>
						<td>
							<select name="apa169" class="mini-radiobuttonlist" id="apa169_3" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
						<td class="textR">是否取消定点资格：</td>
						<td>
							<select name="apa457" class="mini-radiobuttonlist" id="apa457" enabled="false">
								<option value="1">是</option>
								<option value="0" selected="selected">否</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="textR" ><span style="color: red;">*</span>承办人意见：</td>
						<td colspan="3" >
							<div style="padding-right:20px;">
								<div class="textareaTl">
									<div class="textareaTr">
										<div class="textareaTc"></div>
									</div>
								</div>
								<div class="textareaLay">
									<textarea id="ape726" name="ape726" class="mini-textarea" required="true"	emptyText="请输入查实违规行为..." style="height: 60px;"></textarea>
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
						<td style="text-align:center; padding-top: 10px; padding-right: 20px;" colspan="4" class="mainlistCon">
						    <span class="btnMini">
						    	<em>
						    		<input id="saveButton_03" type="button" value="保存" onclick="saveRegVerd_3()"/>
						    	</em>
						    </span>
						    <span class="btnMini">
						    	<em>
						    		<input type="button" value="返回" onclick="revert()"/>
						    	</em>
						    </span>
						</td>
					</tr>
				</table>
			</form>
		</fieldset>
		
		<script type="text/javascript">
			mini.parse();
			
			var grid = mini.get("grid1");
			var aaz077;
			var aaaz318;
			var apa709;
			var form1 = new mini.Form("form1");
			var form2 = new mini.Form("form2");
			var form3 = new mini.Form("form3");
    		
    		//标准方法接口定义
     		function setData(data){
     			data = mini.clone(data);
     			aaz077= data.aaz077;
     			aaz318 = data.aaz318;
     			//apa709 = data.apa709;
     			grid.load({aaz077:data.aaz077,aaz318:data.aaz318});
     			$.ajax({
     				url:"${pageContext.request.contextPath}/common/loadBeAuditTargetByAaz077.action?method=loadBeAuditTargetInfoByAaz077",
     				type:"post",
     				data: {aaz077: data.aaz077},
     				success: function (text){
     					var data = mini.decode(text);
     					apa709 = text.apa709;
     					if(data.apa709 == "1"){
     						document.getElementById("form1").style.display="block";
     						mini.get("apa701_1").setValue(data.apa701);
     					}
     					if(data.apa709 == "2"){
     						document.getElementById("form2").style.display="block";
     						mini.get("apa701_2").setValue(data.apa701);
     					}
     					if(data.apa709 == "3"){
     						document.getElementById("form3").style.display="block";
     						mini.get("apa701_3").setValue(data.apa701);
     					}
     				}
     			});
     			
     		}
     		
     		//操作
			function rendererGrid1(e){
				var grid1 = e.sender;
            	var record = e.record;
            	var rowIndex = e.rowIndex;
            	var s = "<a href='###' onclick = searchSurveyRecordInfo('" + record.aaz148 + "') >记录详情</a> ";
            	return s;
			}
			
			function searchSurveyRecordInfo(aaz148){
				 mini.open({
                	url: "${pageContext.request.contextPath}/pages/k3/f10301004/f10301004_surveyRecordInfo.jsp",
                	title: "调查记录详情", 
                	width: 800, 
                	height: 400,
                	onload: function () {
                    	var iframe = this.getIFrameEl();
                    	var data = {aaz148 : aaz148};
                    	iframe.contentWindow.setData(data);
                	},
                	ondestroy: function (action) {
                	}
            	});
			}
			//保存参保人
			function saveRegVerd_1(){
				var data = form1.getData();
				if(data.ape752 != ""){
					onAmount(data.ape752);
				}
				if(data.aae257 != ""){
					onAmount(data.aae257);
				}
				
				form1.validate();
		        if (form1.isValid() == false) {
		            return;
		        }
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		        json = mini.encode(data);
		       	saveData(json,"01");
			}
			//保存医师
			function saveRegVerd_2(){
				var data = form2.getData();
				if(data.ape752 != ""){
					//onAmount(data.ape752);
				}
				form2.validate();
		        if (form2.isValid() == false) {
		            return;
		        }
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		        json = mini.encode(data);
		       	saveData(json,"02");
			}
			
			//保存医疗机构
			function saveRegVerd_3(){
				var data = form3.getData();
				if(data.ape752 != ""){
					onAmount(data.ape752);
				}
				if(data.aae257 != ""){
					onAmount(data.aae257);
				}
				form3.validate();
		        if (form3.isValid() == false) {
		            return;
		        }
		        data.aaz077=aaz077;
		        data.aaz318=aaz318;
		        var json = mini.encode(data);
		       	saveData(json,"03");
			}
			
			function saveData(data,type){
        		mini.mask({el: document.body,cls: 'mini-mask-loading',html: '处理中...'});
				$.ajax({
					url: "${pageContext.request.contextPath}/k3/f10301006/saveAuditVerdict.action",
		            type: "post",
		            data: { data : data,
		            		apa709 :apa709},
		            success: function (text){
		            	mini.unmask(document.body);
		            	if(text.success){
		            		mini.showMessageBox({
		            			title: "提示",
		            			message: "稽核结论登记成功",
		            			buttons: ["确定"],
		            			iconCls: "mini-messagebox-info",
		            			callback: function(action){
		            				if(type == "01"){
		            					$("#saveButton_01").attr("disabled","disabled");
		            				}
		            				if(type == "02"){
		            					$("#saveButton_02").attr("disabled","disabled");
		            				}
		            				if(type == "03"){
		            					$("#saveButton_03").attr("disabled","disabled");
		            				}
		            				grid.reload();
		            			}
		            		});
		            	}else{
		            		mini.alert(text.msg);
		            	}
		            }
				});
			}
			
			//验证违规金额
			function onAmount(value){
				if(isAmount(value) == false){
					var errorText = "金额输入有误:必须是数字（小数保留两位）";
					mini.alert(errorText);
					return ;
				}
			} 
			var amounts = [/^\d{1,14}$/,/^\d{1,14}\.\d{1,2}$/];
			function isAmount(v){
				if(amounts[0].test(v)){
					return true;
				}else if(amounts[1].test(v)){
					return true;
				}
				return false;
			}
			
			function apa168Changed_1(){
				var apa168 = mini.get("apa168_1").getValue();
				if(apa168 == "1"){
					mini.get("ade189_1").setEnabled(true);
					mini.get("aae257_1").setEnabled(true);
					mini.get("apa169_1").setEnabled(true);
				}else{
					mini.get("ade189_1").setValue("");
					mini.get("aae257_1").setValue("");
					mini.get("apa169_1").setValue("0");
					mini.get("ade189_1").setEnabled(false);
					mini.get("aae257_1").setEnabled(false);
					mini.get("apa169_1").setEnabled(false);
				}
			}
			function apa168Changed_2(){
				var apa168 = mini.get("apa168_2").getValue();
				if(apa168 == "1"){
					mini.get("ade189_2").setEnabled(true);
					mini.get("apa169_2").setEnabled(true);
				}else{
					mini.get("ade189_2").setValue("");
					mini.get("apa169_2").setValue("0");
					mini.get("ade189_2").setEnabled(false);
					mini.get("apa169_2").setEnabled(false);
				}
			}
			function apa168Changed_3(){
				var apa168 = mini.get("apa168_3").getValue();
				if(apa168 == "1"){
					mini.get("ade189_3").setEnabled(true);
					mini.get("aae257_3").setEnabled(true);
					mini.get("apa169_3").setEnabled(true);
					mini.get("apa457").setEnabled(true);
				}else{
					mini.get("ade189_3").setValue("");
					mini.get("aae257_3").setEnabled("");
					mini.get("apa169_3").setValue("0");
					mini.get("apa457").setValue("0");
					mini.get("ade189_3").setEnabled(false);
					mini.get("aae257_3").setEnabled(false);
					mini.get("apa169_3").setEnabled(false);
					mini.get("apa457").setEnabled(false);
				}
			}
			
			function onApa763Changed(){
				var apa763 = mini.get("apa763").getValue();
				if(apa763 == "1"){
					mini.get("ape741_01").setEnabled(true);
					mini.get("ape742_01").setEnabled(true);
				}else{
					mini.get("ape741_01").setValue("");
					mini.get("ape742_01").setValue("");
					mini.get("ape741_01").setEnabled(false);
					mini.get("ape742_01").setEnabled(false);
				}
			}
			
			function onApa163Changed(){
				var apa163 = mini.get("apa163_01").getValue();
				if(apa163 == "1"){
					mini.get("apa133").setEnabled(true);
					mini.get("apa134").setEnabled(true);
				}else{
					mini.get("apa133").setValue("");
					mini.get("apa134").setValue("");
					mini.get("apa133").setEnabled(false);
					mini.get("apa134").setEnabled(false);
				}
			}
			
			function CloseWindow(action) {
         		if (window.CloseOwnerWindow){
              		return window.CloseOwnerWindow(action);
         		}else{
             		window.close();
         		}            
     		}
     		function closeWin(){
				CloseWindow();
			}
			//返回
			function revert(){
				closeWin();
			}
			
			function onValueChangedApe741(){
		    	var ape741 = mini.get("ape741_01").getValue();
		    	mini.get("ape741s").setValue(getDateYmd(ape741));
		    }
			
			function onValueChangedApe742(){
		    	var ape742Date = mini.get("ape742_01").getValue();
		    	mini.get("ape742s").setValue(getDateYmd(ape742Date));
		    }
		    
			function onValueChangedApa133(){
		    	var apa133 = mini.get("apa133").getValue();
		    	mini.get("apa133s").setValue(getDateYmd(apa133));
		    }
			
			function onValueChangedApa134(){
		    	var apa134 = mini.get("apa134").getValue();
		    	mini.get("apa134s").setValue(getDateYmd(apa134));
		    }
			
			function onValueChangedApe741s(){
		    	var ape741 = mini.get("ape741_2").getValue();
		    	mini.get("ape741s2").setValue(getDateYmd(ape741));
		    }
			
			function onValueChangedApe742s(){
		    	var ape742 = mini.get("ape742_2").getValue();
		    	mini.get("ape742s2").setValue(getDateYmd(ape742));
		    }
			
			function onValueChangedApe741ss(){
		    	var ape741 = mini.get("ape741_3").getValue();
		    	mini.get("ape741s3").setValue(getDateYmd(ape741));
		    }
			
			function onValueChangedApe742ss(){
		    	var ape742 = mini.get("ape742_3").getValue();
		    	mini.get("ape742s3").setValue(getDateYmd(ape742));
		    }
			
		    function getDateYmd(date) {
		    	var year = date.getFullYear();
		    	var month = date.getMonth() + 1;
		    	
		    	if (month.toString().length == "1") {
					month = "0" + month;
				}
		    	var day = date.getDate();
		    	if (day.toString().length == "1") {
					day = "0" + day;
				}
		    	var time = year + "" + month + "" + day;
		    	return time;
		    	
		    }
		</script>
	</body>
</html>