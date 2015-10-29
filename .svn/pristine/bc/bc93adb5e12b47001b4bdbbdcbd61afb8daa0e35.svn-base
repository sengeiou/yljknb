<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>立案登记</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
	</head>
	<body>
		<form id="form1" action="" method="post">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<legend></legend>
				<h3 class="cxTit pTb8"><span class="iconCx">立案信息</span></h3>
				<div id="editForm1" style="margin: 10px; position: relative;">
					<input id="aae426" name="aae426" value="" class="mini-hidden" />
					<input id="aaz318" name="aaz318" value="" class="mini-hidden" />
					<input id="aaz281" name="aaz281" value="" class="mini-hidden" />
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<!-- <td class="textR"><span style="color: red;">*</span>案件编号</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abz001" name="abz001" class="mini-textbox" required="true" />
										</div>
									</div>
								</div>
							</td> -->
							<td class="textR"><span style="color: red;">*</span>案件来源</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="abb006" name="abb006" class="mini-combobox"
												data="${dic['ABB006']}" textField="text" valueField="id"
												required="true" enabled="false"/>
										</div>
									</div>
								</div>
							</td>
						<td class="textR"><span style="color: red;">*</span>立案登记日期：</td>
						<td>
							<div class="inputL" style="width:130px">
								<div class="inputR">
									<div class="inputC">
										<input id="ape047s" name="ape047s" format="yyyy-MM-dd" class="mini-datepicker" 
								   			   onvaluechanged="onValueChanged" vtype="date:yyyyMMdd" allowInput="false"/>
										<input id="ape047" name="ape047" value="" class="mini-hidden" required="true"/>
									</div>
								</div>
							</div>
						</td>
							<td class="textR"><span style="color: red;">*</span>统筹区：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaa027" name="aaa027" class="mini-combobox"
												data="${dic['AAA027']}" textField="text" valueField="id"
												required="true" />
										</div>
									</div>
								</div>
							</td>
							<!--
							<td class="textR"><span style="color: red;">*</span>立案登记日期：</td>
							<td>
								<div class="inputL" style="width:90px">
									<div class="inputR">
									<div class="inputC">
										<input id="ape711s" name="ape711s" class="mini-datepicker" format="yyyy-MM-dd"
										onvaluechanged="onValueChanged" allowInput="false"  required="true"/>
										<input id="ape711" name="ape711" value="" class="mini-hidden" required="true" />
									</div>
								</div>
								</div>
							</td>-->
						</tr>
						<tr>
							<td class="textR"><span style="color: red;">*</span>案情描述：</td>
							<td colspan="6">
								<div style="padding-right:30px;">
									<div class="textareaTl">
										<div class="textareaTr">
											<div class="textareaTc">
											</div>
										</div>
									</div>
									<div class="textareaLay">
										<input id="apf094" name="apf094" class="mini-textarea" style="width:100%;" 
											required="true" vtype="maxLength:4000" />
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
					</table>
				</div>
			</fieldset>
			
			<fieldset style="border: solid 0px #aaa; position: relative;">
				<h3 class="cxTit fL"><span class="iconCx">被稽核对象信息</span></h3>
				<div style="margin:10px;">
					<div id="f10301002_tabs" class="mini-tabs" activeIndex="0" style="width:100%;height:230px;" plain="false"
						buttons="#tabsButtons">
						<div title="参保人">
							<div class="mainlistCon">
								<div class="listTit">
									<div class="fL pT5R9">
										<span class="btnMini">
											<em>
												<input type="button" value="添加" onclick="addPerson()"/>
											</em>
										</span>
										<span class="btnMini">
											<em>
												<input type="button" value="删除" onclick="removePerson()"/>
											</em>
										</span>
									</div>
								</div>
								
								<div id="datagrid1" class="mini-datagrid" style="width: 100%; height: 150px;" allowResize="true"
									allowCellEdit="true" allowRowSelect="true" allowCellSelect="true" idField="id" multiSelect="true" 
									showPager="false">
										<div property="columns">
											<div type="indexcolumn"></div>
											<div field="apa701" width="180" headerAlign="center" type="comboboxcolumn">
												稽核问题类型<input property="editor" class="mini-combobox" multiSelect="true" style="width: 100%;" 
															data="${dic['APE701']}" />
											</div>
											<div field="aac001" width="80" headerAlign="center" allowSort="true">医保号</div>
											<div field="aac002" width="80" headerAlign="center" allowSort="true">社会保障号码</div>
											<div field="aac003" width="80" headerAlign="center" allowSort="true">姓名</div>
											<div field="aac004" width="40" headerAlign="center" type="comboboxcolumn">
												性别<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AAC004']}" />
											</div>
											<div field="aac006" width="80" headerAlign="center">出生日期</div>
											<div field="aac084" width="80" headerAlign="center" type="comboboxcolumn">
												离退休状态<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AAC084']}" />
											</div>
											<div field="apa151" width="80" headerAlign="center">监控等级</div>
											<div field="aae005" width="80" headerAlign="center">联系电话</div>
											<div field="aaz077" width="80" headerAlign="center">对象ID</div>
											<div field="staff" width="80" headerAlign="center">人员</div>
											<div field="unit" width="80" headerAlign="center">单位</div>
										</div>
								</div>
							</div>
						</div>
							
						<div title="医师">
							<div class="mainlistCon">
								<div class="listTit">
									<div class="fL pT5R9">
										<span class="btnMini">
											<em>
												<input type="button" value="添加" onclick="addDoctor()"/>
											</em>
										</span>
										<span class="btnMini">
											<em>
												<input type="button" value="删除" onclick="removeDoctor()"/>
											</em>
										</span>
									</div>
								</div>
								
								<div id="datagrid2" class="mini-datagrid" style="width: 100%; height: 150px;" allowResize="true"
									allowCellEdit="true" allowRowSelect="true" allowCellSelect="true" idField="id" 
									multiSelect="true" showPager="false">
										<div property="columns">
											<div type="indexcolumn"></div>
											<div field="apa701" width="180" headerAlign="center" allowSort="true" type="comboboxcolumn">
												稽核问题类型<input property="editor" class="mini-combobox" multiSelect="true" style="width: 100%;" 
															data="${dic['APE702']}" />
											</div>
											<div field="aaz263" width="80" headerAlign="center">医护人员编号</div>
											<div field="akb020" width="80" headerAlign="center">两定机构编号</div>
											<div field="aac003" width="60" headerAlign="center">姓名</div>
											<div field="aab014" width="80" headerAlign="center">公民身份号码</div>
											<div field="aae005" width="80" headerAlign="center">联系电话</div>
											<div field="akb021" width="80" headerAlign="center">两定机构</div>
											<div field="aaz307" width="80" headerAlign="center">科室</div>
											<div field="akc049" width="80" headerAlign="center" type="comboboxcolumn">
												行政职务<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AKC049']}" />
											</div>
											<div field="aaf009" width="80" headerAlign="center" type="comboboxcolumn">
												专业技术职务<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AAF009']}" />
											</div>
											<div field="akc056" width="80" headerAlign="center">执业证编码</div>
											<div field="aaz077" width="80" headerAlign="center">对象ID</div>
											<div field="staff" width="80" headerAlign="center">人员</div>
											<div field="unit" width="80" headerAlign="center">单位</div>
										</div>
								</div>
							</div>
						</div>
						
						<div title="两定机构">
							<div class="mainlistCon">
								<div class="listTit">
									<div class="fL pT5R9">
										<span class="btnMini">
											<em>
												<input type="button" value="添加" onclick="addOrganize()"/>
											</em>
										</span>
										<span class="btnMini">
											<em>
												<input type="button" value="删除" onclick="removeOrganize()"/>
											</em>
										</span>
									</div>
								</div>
								
								<div id="datagrid3"class="mini-datagrid" style="width:100%; height: 150px;" allowResize="true"
									allowCellEdit="true" allowRowSelect="true" allowCellSelect="true" idField="id" 
									multiSelect="true" showPager="false">
									<div property="columns">
										<div type="indexcolumn"></div>
										<div type="comboboxcolumn" autoShowPopup="true" name="apa701" field="apa701" width="180" 
											headerAlign="center" allowSort="true">
											稽核问题类型<input property="editor" class="mini-combobox" multiSelect="true" allowInput="true" style="width: 100%;" 
														data="${dic['APA701']}" />
										</div>
										<div field="akb020" width="80" headerAlign="center">两定机构编号</div>
										<div field="akb021" width="60" headerAlign="center" >
											两定机构名称
										</div>
										<div field="akb022" width="80" headerAlign="center" type="comboboxcolumn">
											两定机构类型<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AKB022']}" />
										</div>
										<div field="aka101" width="80" headerAlign="center" type="comboboxcolumn">
											两定机构等级<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AKA101']}" />
										</div>
										<div field="akb011" width="80" headerAlign="center" type="comboboxcolumn">
											联网结算<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB011']}" />
										</div>
										<div field="akb023" width="80" headerAlign="center" type="comboboxcolumn">
											机构分类代码 <input property="editor" class="mini-combobox" style="width: 100%;" 
														data="${dic['AKB023']}" />
										</div>
										<div field="akb100" width="80" headerAlign="center" type="comboboxcolumn">
											分院标志<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB100']}" />
										</div>
										<div field="akb101" width="80" headerAlign="center" type="comboboxcolumn">
											上级两定机构<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB101']}" />
										</div>
										<div field="aae004" width="80" headerAlign="center">医保联系人</div>
										<div field="aae006" width="80" headerAlign="center">机构地址</div>
										<div field="aae007" width="80" headerAlign="center">邮政编码人</div>
										<div field="aae005" width="80" headerAlign="center">联系电话</div>
										<div field="aaz107" width="80" headerAlign="center">两定机构ID</div>
										<div field="aaz077" width="80" headerAlign="center">对象ID</div>
										<div field="staff" width="80" headerAlign="center">人员</div>
										<div field="unit" width="80" headerAlign="center">单位</div>
									</div>
								</div>
							</div>
						</div>
						
						
						<div title="其它">
						<div id="f10301002_tabs_2" class="mini-tabs" activeIndex="0" style="width:100%;height:250px;" plain="false"
								buttons="#tabsButtons" >
									
							<div title="人员">
								<div class="mainlistCon">
									<div class="listTit">
										<div class="fL pT5R9">
											<span class="btnMini">
												<em>
													<input type="button" value="添加" onclick="addStaff()"/>
												</em>
											</span>
											<span class="btnMini">
												<em>
													<input type="button" value="删除" onclick="removeStaff()"/>
												</em>
											</span>
										</div>
									</div>
									
									<div id="datagrid4" class="mini-datagrid" style="width: 100%; height: 150px;" allowResize="true"
									allowCellEdit="true" allowRowSelect="true" allowCellSelect="true" idField="id" multiSelect="true" 
									showPager="false">
										<div property="columns">
											<div type="indexcolumn"></div>
											<div field="apa701" width="120" headerAlign="center" type="comboboxcolumn">
												稽核问题类型<input property="editor" class="mini-combobox" multiSelect="true" style="width: 100%;" 
															data="${dic['APA701']}" />
											</div>
											<div field="aac001" width="80" headerAlign="center" allowSort="true">人员编号</div>
											<div field="aac002" width="80" headerAlign="center" allowSort="true">社会保障号码</div>
											<div field="aac003" width="80" headerAlign="center" allowSort="true">姓名</div>
											<div field="aac004" width="40" headerAlign="center" type="comboboxcolumn">
												性别<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AAC004']}" />
											</div>
											<div field="aac006" width="80" headerAlign="center">出生日期</div>
											<div field="aac084" width="80" headerAlign="center" type="comboboxcolumn">
												离退休状态<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AAC084']}" />
											</div>
											<div field="apa151" width="80" headerAlign="center">监控等级</div>
											<div field="aae005" width="80" headerAlign="center">联系电话</div>
											<div field="aaz077" width="80" headerAlign="center">对象ID</div>
											<div field="staff" width="80" headerAlign="center">人员</div>
											<div field="unit" width="80" headerAlign="center">单位</div>
										</div>
								</div>
								</div>
							</div>
							
							<div title="单位">
								<div class="mainlistCon">
									<div class="listTit">
										<div class="fL pT5R9">
											<span class="btnMini">
												<em>
													<input type="button" value="添加" onclick="addUnit()"/>
												</em>
											</span>
											<span class="btnMini">
												<em>
													<input type="button" value="删除" onclick="removeUnit()"/>
												</em>
											</span>
										</div>
									</div>
									
									<div id="datagrid5" class="mini-datagrid" style="width:100%; height: 150px;" allowResize="true"
									allowCellEdit="true" allowRowSelect="true" allowCellSelect="true" idField="id" 
									multiSelect="true" showPager="false">
									<div property="columns">
										<div type="indexcolumn"></div>
										<div type="comboboxcolumn" autoShowPopup="true" name="apa701" field="apa701" width="120" 
											headerAlign="center" allowSort="true">
											稽核问题类型<input property="editor" class="mini-combobox" style="width: 100%;" 
														data="${dic['APA701']}" />
										</div>
										<div field="akb020" width="80" headerAlign="center">两定机构编号</div>
										<div field="akb021" width="60" headerAlign="center" >
											两定机构名称
										</div>
										<div field="akb022" width="80" headerAlign="center" type="comboboxcolumn">
											两定机构类型<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AKB022']}" />
										</div>
										<div field="aka101" width="80" headerAlign="center" type="comboboxcolumn">
											两定机构等级<input property="editor" class="mini-combobox" style="width: 100%;" 
															data="${dic['AKA101']}" />
										</div>
										<div field="akb011" width="80" headerAlign="center" type="comboboxcolumn">
											联网结算<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB011']}" />
										</div>
										<div field="akb023" width="80" headerAlign="center" type="comboboxcolumn">
											机构分类代码 <input property="editor" class="mini-combobox" style="width: 100%;" 
														data="${dic['AKB023']}" />
										</div>
										<div field="akb100" width="80" headerAlign="center" type="comboboxcolumn">
											分院标志<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB100']}" />
										</div>
										<div field="akb101" width="80" headerAlign="center" type="comboboxcolumn">
											上级两定机构<input property="editor" class="mini-combobox" style="width: 100%;" 
													data="${dic['AKB101']}" />
										</div>
										<div field="aae004" width="80" headerAlign="center">医保联系人</div>
										<div field="aae006" width="80" headerAlign="center">机构地址</div>
										<div field="aae007" width="80" headerAlign="center">邮政编码人</div>
										<div field="aae005" width="80" headerAlign="center">联系电话</div>
										<div field="aaz107" width="80" headerAlign="center">两定机构ID</div>
										<div field="aaz077" width="80" headerAlign="center">对象ID</div>
										<div field="staff" width="80" headerAlign="center">人员</div>
										<div field="unit" width="80" headerAlign="center">单位</div>
									</div>
								</div>
								</div>
							</div>
						</div>	
					</div>
				</div>
			</fieldset>

			<div style="margin:10px;text-align:center;" class="mainlistCon">
				<span class="btnMini">
					<em>
						<input type="button" value="保存" onclick="save()" id="s_btn" name="s_btn"/>
					</em>
				</span>
				<!-- <span class="btnMini">
					<em>
						<input type="button" value="删除" onclick="remove()" id="d_btn" name="d_btn"/>
					</em>
				</span> -->
				<span class="btnMini">
					<em>
						<input type="button" value="返回" onclick="closeWin()" id="b_btn" name="b_btn"/>
					</em>
				</span>
		    </div>
		</form>
		
		<script type="text/javascript">
			mini.parse();
			
			var form = new mini.Form("form1");
			var datagrid1 = mini.get("datagrid1");
			var datagrid2 = mini.get("datagrid2");
			var datagrid3 = mini.get("datagrid3");
			var datagrid4 = mini.get("datagrid4");
			var datagrid5 = mini.get("datagrid5");
			
			function setData(data){
				var data = mini.clone(data);
				$.ajax({
					url : "${pageContext.request.contextPath}/k3/f10301002/findAuditFile.action",
					type : "post",
					data : {
						aaz281 : data.aaz281,
						apa165 : data.apa165,
						aaa027 : data.aaa027,
						apa703 : data.apa703
					},
					success : function(text){
						var data = mini.decode(text);
						form.setData(data);
						datagrid1.setData(data.personList);
						datagrid2.setData(data.doctorList);
						datagrid3.setData(data.organList);
						
						//var del = mini.get("d_btn");
						var save = mini.get("s_btn");
						//var abz001 = data.abz001;
						var aae426 = data.aae426;
						/* if(abz001 == ''){
							del.setEnabled(false);
						} */
					}
				});
			}
			
			function newsetData(){
				$.ajax({
					url : "${pageContext.request.contextPath}/k3/f10301002/findAuditFile.action",
					type : "post",
					data : {
					},
					success : function(text) {
						var form = new mini.Form("#form1");
						var data = mini.decode(text);
						form.setData(data);
					}
				});
			}
			
			function save(){
				var form = new mini.Form("form1");
				form.validate();
				if(form.isValid()==true){
					var grid1 = new mini.get("datagrid1");
					var grid2 = new mini.get("datagrid2");
					var grid3 = new mini.get("datagrid3");
					var grid4 = new mini.get("datagrid4");
					var grid5 = new mini.get("datagrid5");
					var data1 = grid1.getChanges();
					var data2 = grid2.getChanges();
					var data3 = grid3.getChanges();
					var data4 = grid4.getChanges();
					var data5 = grid5.getChanges();
					var json1 = mini.encode(data1);
					var json2 = mini.encode(data2);
					var json3 = mini.encode(data3);
					var json4 = mini.encode(data4);
					var json5 = mini.encode(data5);
					if((grid1.getData().length+grid2.getData().length+grid3.getData().length+grid4.getData().length+grid5.getData().length)>0){
						var data = form.getData();      //获取表单多个控件的数据
		            	var json = mini.encode(data);
		            	if (data1 != "") {
							if (data1[0].apa701 == null || data1[0].apa701 == "") {
								mini.alert("请选择稽核问题类型");
							} else {
								$.ajax({
					                url: "${pageContext.request.contextPath}/k3/f10301002/saveAuditFile.action?method=saveAuditFile",
					                type: "post",
					                data: { submitData: json ,grid1:json1,grid2:json2,grid3:json3,grid4:json4,grid5:json5},
					                success: function (text) {
					                    if(text.success){
					                    	mini.showMessageBox({
					                    		title: "提示",
							            		message: "保存成功",
							            		buttons: ["确定"],
							            		iconCls: "mini-messagebox-info",
							            		callback: function(action){
							            			closeWin();
							            		}
					                    	});
					                    }else{
					                        mini.alert(text.msg);
					                    }
					                }
				            	});
							}
						} else if(data2 != "") {
							if (data2[0].apa701 == null || data2[0].apa701 == "") {
								mini.alert("请选择稽核问题类型");
							} else {
								$.ajax({
					                url: "${pageContext.request.contextPath}/k3/f10301002/saveAuditFile.action?method=saveAuditFile",
					                type: "post",
					                data: { submitData: json ,grid1:json1,grid2:json2,grid3:json3,grid4:json4,grid5:json5},
					                success: function (text) {
					                    if(text.success){
					                    	mini.showMessageBox({
					                    		title: "提示",
							            		message: "保存成功",
							            		buttons: ["确定"],
							            		iconCls: "mini-messagebox-info",
							            		callback: function(action){
							            			closeWin();
							            		}
					                    	});
					                    }else{
					                        mini.alert(text.msg);
					                    }
					                }
				            	});
							}
						}else if(data3 != "") {
							if (data3[0].apa701 == null || data3[0].apa701 == "") {
								mini.alert("请选择稽核问题类型");
							} else {
								$.ajax({
					                url: "${pageContext.request.contextPath}/k3/f10301002/saveAuditFile.action?method=saveAuditFile",
					                type: "post",
					                data: { submitData: json ,grid1:json1,grid2:json2,grid3:json3,grid4:json4,grid5:json5},
					                success: function (text) {
					                    if(text.success){
					                    	mini.showMessageBox({
					                    		title: "提示",
							            		message: "保存成功",
							            		buttons: ["确定"],
							            		iconCls: "mini-messagebox-info",
							            		callback: function(action){
							            			closeWin();
							            		}
					                    	});
					                    }else{
					                        mini.alert(text.msg);
					                    }
					                }
				            	});
							}
						}
					}else{
						mini.alert("本案件无被稽核对象，请添加稽核对象！");
						return;
					}
				}
			}
			
			/* function remove(){
				$.ajax({
					url : "${pageContext.request.contextPath}/k3/f10301002/deleteCase.action?method=deleteCase",
					type : "post",
					data : {
					   aaz281 : mini.get("aaz281").getValue(),
					   aaz318 : mini.get("aaz318").getValue(),
					   abz001 : mini.get("abz001").getValue()
					},
					success : function(text) {
						if(text.success){
							mini.showMessageBox({
		        				title: "提示",
		        				message: "删除成功",
		        				buttons: ["确定"],
		        				iconCls: "mini-messagebox-info",
		        				callback: function(action){
		            				closeWin();
		         			}}); 
						}else{
							mini.alert(text.msg);
						}
					}
				});
			} */
			
			function addOrganize(){
				mini.open({
					url : "${pageContext.request.contextPath}/pages/pub/selectmedinstitution.jsp",
					title : "两地机构信息",
					width : 800,
					height : 400,
					onload : function() {
		            },
		            ondestroy: function (action) {
		               if (action == "ok") {
			               var iframe = this.getIFrameEl();
			               var data = iframe.contentWindow.GetData();
			               data = mini.clone(data);
			               var newrow = data;
			               var grid = new mini.get("datagrid3");
			               var flag=true;
			               for(var i=0;i<grid.getData().length;i++){
			               		var row = grid.getRow(i);
			               		if(row.aaz107==newrow.aaz107){
			               			flag=false;
			               		} 
			               }
			               if(flag){
			               		grid.addRow(newrow,0);
			               }else{
			               		alert("该对象已经添加了");
			               		return;
			               }
		               }
		            }
		        });
			}
			
			function addDoctor(){
				mini.open({
					url : "${pageContext.request.contextPath}/pages/pub/selectdoctor.jsp",
					title : "医护人员信息",
					width : 800,
					height : 400,
					onload : function() {
		            },
		            ondestroy: function (action) {
		               if (action == "ok") {
			               var iframe = this.getIFrameEl();
			               var data = iframe.contentWindow.GetData();
			               data = mini.clone(data);
			               var newrow = data;
			               var grid = new mini.get("datagrid2");
			               var flag=true;
			               for(var i=0;i<grid.getData().length;i++){
			               		var row = grid.getRow(i);
			               		if(row.aaz263==newrow.aaz263){
			               			flag=false;
			               		} 
			               }
			               if(flag){
			               		grid.addRow(newrow,0);
			               }else{
			               		alert("该对象已经添加了");
			               		return;
			               }
		               }
		            }
		        });
			}
			
			function addPerson(){
				mini.open({
					url : "${pageContext.request.contextPath}/pages/pub/selectperson.jsp",
					title : "参保人员信息",
					width : 800,
					height : 400,
					onload : function() {
		            },
		            ondestroy: function (action) {
		               if (action == "ok") {
			               var iframe = this.getIFrameEl();
			               var data = iframe.contentWindow.GetData();
			               data = mini.clone(data);
			               var newrow = data;
			               var grid = new mini.get("datagrid1");
			               var flag=true;
			               for(var i=0;i<grid.getData().length;i++){
			               		var row = grid.getRow(i);
			               		if(row.aac001==newrow.aac001){
			               			flag=false;
			               		} 
			               }
			               if(flag){
			               		grid.addRow(newrow,0);
			               }else{
			               		alert("该对象已经添加了");
			               		return;
			               }
		               }
		            }
		        });
			}
			
			function removePerson(){
				var grid = new mini.get("datagrid1");
				var row = grid.getSelected();
				if (row!=null) {
					mini.confirm("确定删除选中的参保人","确认",
						function(action){
							if (action == "ok"){
								grid.removeRow(row, false);
							}else{
								//
							}
						}
					);
					/* if (confirm("确定删除选中记录？")) {
						grid.removeRow(row, false);
					} */
				} else {
					alert("请选中一条记录");
				}
			}
			
			function removeDoctor(){
				var grid = new mini.get("datagrid2");
				var row = grid.getSelected();
				if (row!=null) {
					mini.confirm("确定删除选中的医师","确认",
						function(action){
							if (action == "ok"){
								grid.removeRow(row, false);
							}else{
								//
							}
						}
					);
					/* if (confirm("确定删除选中记录？")) {
						grid.removeRow(row, false);
					} */
				} else {
					alert("请选中一条记录");
				}
			}
			
			function removeOrganize(){
				var grid = new mini.get("datagrid3");
				var row = grid.getSelected();
				if (row!=null) {
					mini.confirm("确定删除选中的两定机构","确认",
						function(action){
							if (action == "ok"){
								grid.removeRow(row, false);
							}else{
								//
							}
						}
					);
					/* if (confirm("确定删除选中记录？")) {
						grid.removeRow(row, false);
					} */
				} else {
					alert("请选中一条记录");
				}
			}
			
			//添加人员
			function addStaff(){
				mini.open({
					url : "${pageContext.request.contextPath}/pages/pub/select_other_staff.jsp",
					title : "人员信息",
					width : 800,
					height : 400,
					onload : function() {
		            },
		            ondestroy: function (action) {
		               if (action == "ok") {
			               var iframe = this.getIFrameEl();
			               var data = iframe.contentWindow.GetData();
			               data = mini.clone(data);
			               var newrow = data;
			               var grid = new mini.get("datagrid4");
			               var flag=true;
			               for(var i=0;i<grid.getData().length;i++){
			               		var row = grid.getRow(i);
			               		if(row.aac001==newrow.aac001){
			               			flag=false;
			               		} 
			               }
			               if(flag){
			               		grid.addRow(newrow,0);
			               }else{
			               		alert("该对象已经添加了");
			               		return;
			               }
		               }
		            }
		        });
			}
			
			/**删除人员**/
			function removeStaff(){
				var grid = new mini.get("datagrid4");
				var row = grid.getSelected();
				if (row!=null) {
					mini.confirm("确定删除选中的参保人","确认",
						function(action){
							if (action == "ok"){
								grid.removeRow(row, false);
							}else{
								//
							}
						}
					);
				} else {
					alert("请选中一条记录");
				}
			}
			
			/**添加单位信息**/
			function addUnit(){
				mini.open({
					url : "${pageContext.request.contextPath}/pages/pub/select_other_unit.jsp",
					title : "单位信息",
					width : 800,
					height : 400,
					onload : function() {
		            },
		            ondestroy: function (action) {
		               if (action == "ok") {
			               var iframe = this.getIFrameEl();
			               var data = iframe.contentWindow.GetData();
			               data = mini.clone(data);
			               var newrow = data;
			               var grid = new mini.get("datagrid5");
			               var flag=true;
			               for(var i=0;i<grid.getData().length;i++){
			               		var row = grid.getRow(i);
			               		if(row.aaz107==newrow.aaz107){
			               			flag=false;
			               		} 
			               }
			               if(flag){
			               		grid.addRow(newrow,0);
			               }else{
			               		alert("该对象已经添加了");
			               		return;
			               }
		               }
		            }
		        });
			}
			
			/**移除单位信息**/
			function removeUnit(){
				var grid = new mini.get("datagrid5");
				var row = grid.getSelected();
				if (row!=null) {
					mini.confirm("确定删除选中的单位","确认",
						function(action){
							if (action == "ok"){
								grid.removeRow(row, false);
							}else{
								//
							}
						}
					);
					/* if (confirm("确定删除选中记录？")) {
						grid.removeRow(row, false);
					} */
				} else {
					alert("请选中一条记录");
				}
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
		     
		     function onValueChanged(){
		        var ape047Date = mini.get("ape047s").getValue();
		        if(ape047Date==""){
		        	 mini.get("ape047").setValue("");
		        }else{
		        	 mini.get("ape047").setValue(getDateYmd(ape047Date));
		        }
		       
		    }
		     
	     	function getDateYmd(date) {
		    	var year = date.getFullYear();
		    	var month = (date.getMonth() + 1).toString();
		    	var day = (date.getDate()).toString();
		    	if(month.length == 1) {
		    		month = "0" + month;
		    	}
		    	if(day.length == 1) {
		    		day = "0" + day;
		    	}
		    	return year + month + day;
		    }
		</script>
	</body>
</html>
