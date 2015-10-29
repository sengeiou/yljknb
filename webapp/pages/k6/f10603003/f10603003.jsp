<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗服务机构住院综合分析</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js">
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
								<td class="textR">分析指标：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="fxfee" name="fxfee" class="mini-combobox"
													emptyText="请选择..." data="${dic['FXFEE']} " value="CJFY"/>
											</div>
										</div>
									</div>
								</td>
								
								<td class="textR"><span style="color: red;">*</span>排名数量：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="rank" name="rank" class="mini-textbox" required="true" />
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
													emptyText="请选择..." data="${dic['AAE140']} " value="310" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td class="textR">统筹区编码：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa027" name="aaa027" class="mini-combobox"
													emptyText="请选择..." data="${dic['AAA027']}" />
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
													emptyText="请选择..." data="${dic['AKA101']}" />
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
								
								<td class="textR">身份类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akc021" name="akc021" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKC021']}" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR">就诊类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka130" name="aka130" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKA130']}" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td style="text-align: right; padding-top: 5px; padding-right:10px;"
									colspan="10">
									<input type="button"value="" class="cxsubmit" onclick="search();" />
									<input type="button" value="" class="cxreset" onclick="resetf();"/>
									<input id="aaz107" name="aaz107" class="mini-hidden" />
									<input id="akb022" name="akb022" class="mini-hidden" />
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</fieldset>
		<fieldset>
			<div style="width: 100%; height: 230px;">
				<div size="35%" showCollapseButton="false" class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx"><span id="tA"></span>排名前<span id="tB"></span></span>
					</h3>
					<div id="chartColumn" style="width: 100%; height: 190px;">

					</div>
				</div>
			</div>
		</fieldset>
		<fieldset>
			<div showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx" id="titleText">详细信息</span>
				</h3>
				<div class="fR pT5R9">
					<span class="btnMini">
						<em>
							<input type="button" value="问题登记" onclick="problemReg()"/>
						</em>
					</span>
					<span class="btnMini">
						<em>
							<input type="button" value="就诊信息" onclick="visitInfo()"/>
						</em>
					</span>
				</div>
				<div id="" class="mini-tabs" activeIndex="0" style="width: 100%;"
					plain="false">
					<div title="就诊类别" name="">
						<div id="grid1" class="mini-datagrid" idField="" multiSelect="false"
							style="width: 100%; height: 141px;" allowResize="true" onrowdblclick="onRowDblclick" 
							url="${pageContext.request.contextPath}/k6/f10603003/queryMedical.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaz107" width="100" headerAlign="center" align="center">医疗机构编号</div>
								<div field="aae041" width="100" headerAlign="center" align="center" dateFormat="yyyy-MM">
									就诊年月
								</div>
								<div field="aka130" width="100" headerAlign="center" align="center"
									allowSort="true">
									就诊类别
								</div>
								<div field="akc264" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									医疗费用
								</div>
								<div field="akc254" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									个人自付费用
								</div>
								<div field="akb068" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									统筹报销费用
								</div>
								<div field="akc253" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									自费费用
								</div>
								<div field="bsbl" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									报销比例(%)
								</div>
								
								<div field="ake028" width="65" headerAlign="center" align="center" dataType="int"
									allowSort="true">
									住院天数
								</div>
								
								<div field="ypfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true"> 
									药品费占医疗费用(%)
								</div>
								
								<div field="zlfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									诊疗费占医疗费用(%)
								</div>
							</div>
						</div>
					</div>
					<div title="身份类别" name="">
						<div id="grid2" class="mini-datagrid" idField="" multiSelect="false"
							style="width: 100%; height: 141px;" allowResize="true" onrowdblclick="onRowDblclick" 
							url="${pageContext.request.contextPath}/k6/f10603003/queryIdentify.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaz107" width="100" headerAlign="center" align="center">医疗机构编号</div>
								<div field="aae041" width="100" headerAlign="center" align="center" dateFormat="yyyy-MM">
									就诊年月
								</div>
								<div field="akc021" width="100" headerAlign="center" align="center"
									allowSort="true">
									身份类别
								</div>
								<div field="akc264" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									医疗费用
								</div>
								<div field="akc254" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									个人自付费用
								</div>
								<div field="akb068" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									统筹报销费用
								</div>
								<div field="akc253" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									自费费用
								</div>
								<div field="bsbl" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									报销比例(%)
								</div>
								
								<div field="ake028" width="65" headerAlign="center" align="center" dataType="int"
									allowSort="true">
									住院天数
								</div>
								
								<div field="ypfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									药品费占医疗费用(%)
								</div>
								
								<div field="zlfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									诊疗费占医疗费用(%)
								</div>
							</div>
						</div>
					</div>
					<div title="疾病分类" name="">
						<div id="grid3" class="mini-datagrid" idField="" multiSelect="false"
							style="width: 100%; height: 141px;" allowResize="true" onrowdblclick="onRowDblclick" 
							url="${pageContext.request.contextPath}/k6/f10603003/queryDisease.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaz107" width="100" headerAlign="center" align="center">医疗机构编号</div>
								<div field="aae041" width="100" headerAlign="center" align="center" dateFormat="yyyy-MM">
									就诊年月
								</div>
								<div field="aka121" width="100" headerAlign="center" align="center"
									allowSort="true">
									疾病分类名称
								</div>
								<div field="aka122" width="100" headerAlign="center" align="center"
									allowSort="true">
									疾病分类
								</div>
								<div field="akc264" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									医疗费用
								</div>
								<div field="akc254" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									个人自付费用
								</div>
								<div field="akb068" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									统筹报销费用
								</div>
								<div field="akc253" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									自费费用
								</div>
								<div field="bsbl" width="100" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									报销比例(%)
								</div>
								
								<div field="ake028" width="65" headerAlign="center" align="center" dataType="int"
									allowSort="true">
									住院天数
								</div>
								
								<div field="ypfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									药品费占医疗费用(%)
								</div>
								
								<div field="zlfbl" width="140" headerAlign="center" align="center" dataType="float"
									allowSort="true">
									诊疗费占医疗费用(%)
								</div>
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
				changeTitle();
				});
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
			var grid1 = mini.get("grid1");
			var grid2 = mini.get("grid2");
			var grid3 = mini.get("grid3");
			var form = new mini.Form("form1");
			function search(){
				changeTitle();
				mini.get("aaz107").setValue("");
				var data = form.getData(true);
				var url="${pageContext.request.contextPath}/k6/f10603003/queryMediPartFee.action";
				getChartData(url, data, function(datas) {
					showColumnChart('chartColumn', '', datas, "grid1", "editForm1");
				});
			}
			function resetf(){
				getDate();
				mini.get("aae041").setValue(monthStart);
				mini.get("aae042").setValue(monthEnd);
				mini.get("rank").setValue("10");
				mini.get("aae140").setValue("310");
				mini.get("fxfee").setValue("CJFY");
				mini.get("aaz107").setValue("");
				mini.get("aaa027").setValue("");
				mini.get("aka101").setValue("");
				mini.get("aka122").setValue("");
				mini.get("aka122").setText("");
				mini.get("aka130").setValue("");
				mini.get("akc021").setValue("");
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
								labels : {
									format : '{value}元',
									style : {
										color : '#4572A7'
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
											mini.get("aaz107").setValue(x);
											var data = form.getData(true);
											grid1.load(data);
											grid2.load(data);
											grid3.load(data);
										}
	
									}
							} ]
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
			//就诊信息
			function visitInfo(){
				var row1 = grid1.getSelected(); //确定选中的哪一行
				var row2 = grid2.getSelected(); //确定选中的哪一行
				var row3 = grid3.getSelected(); //确定选中的哪一行
				if(row1){
					 mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10603004/f10603004_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : row1.aae041,aaz107 : row1.aaz107};
			                iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			            		
			            }
	        		});
				}else if(row2){
					 mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10603004/f10603004_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : row2.aae041,aaz107 : row2.aaz107};
			                iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			            		
			            }
	        		});
				}else if(row3){
					mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10603004/f10603004_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : row3.aae041,aaz107 : row3.aaz107};
			                iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			            		
			            }
	        		});
				}else{
					mini.alert("请选择一条医疗机构详细信息");
				}
			}
			function changeTitle(){
				var titleA=mini.get("fxfee").getText();
				document.getElementById("tA").innerHTML=titleA;
				var titleB=mini.get("rank").getValue();
				document.getElementById("tB").innerHTML=titleB;
			}
			function onRowDblclick(e){
				var grid = e.sender;
				var record = grid.getSelected();
				 mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10603004/f10603004_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : record.aae041,aaz107 : record.aaz107};
			                iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			            		
			            }
	        		});
			}
		</script>
	</body>
</html>