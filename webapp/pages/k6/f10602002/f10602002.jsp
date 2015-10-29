<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医师三目费用构成分析</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
		<script type="text/javascript">
		tx=[{
			'id':'1',
			'text':'饼状图',
		},{
			'id':'2',
			'text':'柱状图'
		}];
		</script>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<div id="" style="margin: 10px; position: relative;">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td class="textR"><span style="color: red;">*</span>起始年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae041" name="aae041" format="yyyy-MM" class="mini-monthpicker" 
													onvaluechanged="" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>终止年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae042" name="aae042" format="yyyy-MM" class="mini-monthpicker" 
												onblur="" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>排名数量：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="rank" name="rank" class="mini-textbox" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">统筹区编码：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa027" name="aaa027" class="mini-combobox"
													emptyText="请选择..." data="${dic['AAA027'] }" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">险种类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae140" name="aae140" class="mini-combobox"
													emptyText="请选择..." data="${dic['AAE140'] }" value="310" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">
									医疗机构ID：
								</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaz107" name="aaz107" class="mini-buttonedit"
													onbuttonclick="onButtonEdit1" emptyText="" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">医疗机构类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb022" name="akb022" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKB022'] }" />
											</div>
										</div>
									</div>
								</td>
								
								<td class="textR">医院等级：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka101" name="aka101" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKA101'] }" value=""/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">医疗发票项目：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka063" name="aka063" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKA063']}" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">
									疾病分类：
								</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka122" name="aka122" class="mini-buttonedit"
													onbuttonclick="onButtonEdit2" emptyText="" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">就诊类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka130" name="aka130" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKA130'] }" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">专业技术职务：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaf009" name="aaf009" class="mini-combobox"
													emptyText="请选择..." data="${dic['AAF009'] }" />
											</div>
										</div>
									</div>
								</td>
								<td style="text-align: right; padding-top: 5px; padding-right:10px;"
									colspan="6">
									<input type="button"value="" class="cxsubmit" onclick="search();" />
									<input type="button" value="" class="cxreset" onclick="resetf();"/>
									<input id="id" name="id" class="mini-hidden" />
									<input id="aka065" name="aka065" class="mini-hidden"  />
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</fieldset>
		<fieldset>
			<div class="mini-splitter nobor"
				style="width: 100%; height: 350px;">
				<div size="55%" showCollapseButton="false" class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">三大目录类别(<font color=red>可单击选择</font>)</span>
					</h3>
					<div id="chartPie" style="width: 100%; height: 210px;">

					</div>
					<div id="" style="width: 100%; height: 50px;">

					</div>
					<div id="radio1" class="mini-radiobuttonlist" repeatItems="1"
						repeatLayout="table" repeatDirection="vertical" textField="text"
						valueField="id" value="1" data="tx" onvaluechanged="changetx();">
					</div>
				</div>
				<div showCollapseButton="false" class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx" ><span id="span1"></span><span>收费项目等级分类(<font color=red>可双击选择</font>)</span></span>
					</h3>
					<div class="fR pT5R9">
						<span class="btnMini">
							<em>
								<input type="button" value="问题登记" onclick="problemReg()"/>
							</em>
						</span>
						<span class="btnMini">
							<em>
								<input type="button" value="占比排名" onclick="zbpm()"/>
							</em>
						</span>
					</div>
					<div id="grid1" class="mini-datagrid" idField="id"
						style="width: 100%; height: 310px;" allowResize="true"
						onrowclick="queryDetail" multiSelect="false" onrowdblclick="onRowDblclick" onselect="onSelect"
						url="${pageContext.request.contextPath}/k6/f10602002/queryCharge.action">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="aka065" width="100" headerAlign="center" align="center"
								 >
								收费项目等级
							</div>
							<div field="akc264" width="100" headerAlign="center" dataType="float"
								align="center"  >
								本项目等级费用
							</div>
							<div field="ratio" width="100" headerAlign="center" align="center" dataType="float"
								 >
								占分项费用比(%)
							</div>
							<div field="allratio" width="100" headerAlign="center" align="center" dataType="float"
								 >
								总费用占比(%)
							</div>
						</div>
					</div>
				</div>
			</div>
		</fieldset>
		<script type="text/javascript">
			mini.parse();
			$(document).ready(function(){
				getDate();
				mini.get("aae041").setValue(monthStart);
				mini.get("aae042").setValue(monthEnd);
				mini.get("rank").setValue("10");
				});
			function resetf(){
				getDate();
				mini.get("aae041").setValue(monthStart);
				mini.get("aae042").setValue(monthEnd);
				mini.get("aae140").setValue("310");
				mini.get("rank").setValue("10");
				mini.get("aaz107").setValue("");
				mini.get("aaz107").setText("");
				mini.get("aka101").setValue("");
				mini.get("akb022").setValue("");
				mini.get("aka130").setValue("");
				mini.get("aka122").setValue("");
				mini.get("aka122").setText("");
				mini.get("aaa027").setValue("");
				mini.get("aaf009").setValue("");
				mini.get("aka063").setValue("");
			}
			var monthStart;
			var monthEnd;
			function getDate(){
				var myDate=new Date();
				var year=myDate.getFullYear();
				var month=myDate.getMonth()+1;
				if(month>10){
					monthStart=year+"-"+(month-1);
					monthEnd=year+"-"+(month-1);
				}
				else if(month>1){
					monthStart=year+"-0"+(month-1);
					monthEnd=year+"-0"+(month-1);
				}
				else{
					monthStart=(year-1)+"-12";
					monthEnd=(year-1)+"-12";
				}
			}
			function zbpm(){
				var grid=mini.get("grid1");
				var record = grid.getSelected();
				if(record){
					var queryForm = new mini.Form("form1");
					var data = queryForm.getData(true);
					mini.open({
						url : "${pageContext.request.contextPath}/pages/k6/f10602002/f10602002_info.jsp",
						title : "收费项目等级为"+"<font color=red>"+record.aka065+"</font>的费用占比医师排名",
						width : 900,
						height : 510,
						onload : function() {
							var iframe = this.getIFrameEl();
							iframe.contentWindow.setData(data);
						},
						ondestroy : function(action) {
						}
					});

				}
				else{
					alert("请选择一条收费项目等级分类信息！");
				}
			}
			function onRowDblclick(e){
				var grid = e.sender;
				var record = grid.getSelected();
				mini.get("aka065").setValue(record.aka065);
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true);
				mini.open({
					url : "${pageContext.request.contextPath}/pages/k6/f10602002/f10602002_info.jsp",
					title : "收费项目等级为"+"<font color=red>"+record.aka065+"</font>的费用占比医师排名",
					width : 900,
					height : 510,
					onload : function() {
						var iframe = this.getIFrameEl();
						iframe.contentWindow.setData(data);
					},
					ondestroy : function(action) {
					}
				});
			}
			function onSelect(e){
				var grid = e.sender;
				var record = grid.getSelected();
				mini.get("aka065").setValue(record.aka065);
			}
			function changetx(){
				search();
			}
			function search(){
				mini.get("aka065").setValue("");
				var radio1=mini.get("radio1");
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true);
				var url= '${pageContext.request.contextPath}/k6/f10602002/queryInvoice.action';
				getChartData(url, data, function(datas) {
					if(radio1.getValue()=="1")
						showPieChart('chartPie', '', datas, "grid1", "editForm1");
					else if(radio1.getValue()=="2")
						showColumnChart('chartPie', '', datas, "grid1", "editForm1");
				});
			}
			function getChartData(url, params, callback) {
				$.ajax(url, {
					type : 'POST',
					data : params,
					cache : false,
					async : true,
					dataType : 'json',
					success : function(data) {
						callback(data);
					}
				});
			}
			function showColumnChart(divId, title, tdatas, gridId, formId) {
				$('#' + divId).highcharts(
						{
							chart : {
								type : 'column'
							},
							plotOptions : {
								column : {
									colorByPoint : true,
									colors : [ '#7cb5ec', '#434348', '#90ed7d',
											'#f7a35c', '#8085e9', '#f15c80',
											'#e4d354', '#8085e8', '#8d4653',
											'#91e8e1' ]
								}
							},
							title : {
								text : ''
							},
							xAxis : {
								categories : [],
								labels : {
									rotation : 0,
									align : 'center',
									style : {
										fontSize : '12px',
										fontFamily : 'Verdana, sans-serif'
									}
								}
							},
							yAxis : {
								min : 0,
								title : {
									text : ''
								},
								labels:{
									formatter: function() {
										var maxElement = this.axis.max;
										if(maxElement>100000000){
		                					return (this.value/100000000).toFixed(0) +"亿";
										}
										else if(maxElement>10000){
		                    				return (this.value/10000).toFixed(0) +"万";
										}
										else{
											return (this.value/1).toFixed(0) +"";
										}
									}
								}
							},
							legend : {
								enabled : false
							},
							tooltip : {
								pointFormat : '<b>{point.y}元</b>',
							},
							series : [ {
								name : '',
								data : tdatas,
								dataLabels : {
									enabled : false,
									rotation : 0,
									color : '#FFFFFF',
									align : 'right',
									x : 4,
									y : 10,
									style : {
										fontSize : '13px',
										fontFamily : 'Verdana, sans-serif',
										textShadow : '0 0 3px black'
									}
								},
								events : {
										click : function(event){
											var x=event.point.id;
											mini.get("id").setValue(x);
											getList(event.point.name);
	
										}
	
									}
							} ]
						});
			}
			function showPieChart(divId, title, datas, gridId, formId) {
				$('#' + divId)
						.highcharts(
								{
									chart : {
										backgroundColor : null,
										plotBackgroundColor : null,
										plotBorderWidth : null,
										plotShadow : false
									},
									colors : [ '#4F81BD', '#C0504D', '#9BBB59',
											'#8064A2', '#54FF9F', '#548B54',
											'#4F94CD', '#4876FF', '#40E0D0',
											'#1E90FF' ],
									credits : {
										enabled : false
									},
									title : {
										text : title
									},
									tooltip : {
										pointFormat : '<b>所占比例：{point.percentage:.1f}%</b><br><b>费用：{point.y}</b>'
									},
									pane : {
										size : '100%'
									},
									plotOptions : {
										pie : {
											allowPointSelect : true,
											cursor : 'pointer',
											dataLabels : {
												enabled : false,
												color : '#000000',
												connectorColor : '#000000',
												format : '<b>{point.name}</b>: {point.percentage:.1f} %'
											},
											showInLegend : true
										}
									},
									legend : {
										layout : 'vertical',
										verticalAlign : 'middle',
										align : 'right'
									},
									series : [ {
										type : 'pie',
										name : 'share',
										data : datas,
										events : {
											click : function(event){
												var x=event.point.id;
												mini.get("id").setValue(x);
												getList(event.point.name);

											}

										}
									} ]
								});
			}
			
			function onButtonEdit1(e) {

				var btnEdit = this;

				var akb022 = mini.get("akb022");
				var aka101 = mini.get("aka101");
				mini
						.open( {
							url : "${pageContext.request.contextPath}/pages/pub/selectMedi.jsp",
							title : "查询案件信息",
							width : 800,
							height : 480,
							ondestroy : function(action) {
								if (action == "ok") {
									var iframe = this.getIFrameEl();
									var data = iframe.contentWindow.GetData();
									data = mini.clone(data);
									btnEdit.setValue(data.aaz107);
									btnEdit.setText(data.aaz107);
									akb022.setValue(data.akb022);
									aka101.setValue(data.aka101);
								}
							}
						});
			}
			function onButtonEdit2(e) {
				var btnEdit = this;
				mini
						.open( {
							url : "${pageContext.request.contextPath}/pages/pub/selectDise.jsp",
							title : "查询疾病信息",
							width : 800,
							height : 480,
							ondestroy : function(action) {
								if (action == "ok") {
									var iframe = this.getIFrameEl();
									var data = iframe.contentWindow.GetData();
									data = mini.clone(data);
									btnEdit.setValue(data.aka122);
									btnEdit.setText(data.aka122);
								}
							}
						});
			}
			function getList(title){
				document.getElementById("span1").innerHTML=title;
				var gird1=mini.get("grid1");
				var queryForm = new mini.Form("form1");
				var data = queryForm.getData(true);
				gird1.load(data);
			}
			//问题登记
			function problemReg(){
				 mini.open({
		            url: "${pageContext.request.contextPath}/pages/pub/analproblem.jsp",
		            title: "分析疑点问题", 
		            width: 800, 
		            height: 300,
		            onload: function () {
		                var iframe = this.getIFrameEl();
		            },
		            ondestroy: function (action) {
		                
		            }
	        	});
			}
		</script>
	</body>
</html>