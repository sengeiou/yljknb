<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>统计分析1</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
<script type="text/javascript">
	yydj = [ {
		'id' : '0',
		'text' : '全部'
	}, {
		'id' : '1',
		'text' : '二级医院'
	}, {
		'id' : '2',
		'text' : '三级医院'
	} ];

	bzlx = [ {
		'id' : '1',
		'text' : '结节性甲状腺肿'
	}, {
		'id' : '2',
		'text' : '膀胱肿瘤'
	}, {
		'id' : '3',
		'text' : '输卵管妊娠'
	}, {
		'id' : '4',
		'text' : '卵巢良性肿瘤'
	}, {
		'id' : '5',
		'text' : '慢性扁桃体炎'
	} ];
	xmlx = [ {
		'id' : '化验费',
		'text' : '化验费'
	}, {
		'id' : '检查费',
		'text' : '检查费'
	}, {
		'id' : '手术费',
		'text' : '手术费'
	}, {
		'id' : '西药费',
		'text' : '西药费'
	} ];
</script>
</head>
<body>
	<div id="tabs1" class="mini-tabs" activeIndex="0" style="width: 100%; "
		plain="false" onactivechanged="activeChanged">
		<div title="各级医疗机构费用类别占比" name="panel1" style="width: 100%; ">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div id="editForm1" class="cxTabbox">
					<form id="form1" action="#">
						<div id="" style="margin: 10px; position: relative;">
							<table style="width: 60%;" class="cxTab">
								<tr>
									<td class="textR">医院等级:</td>
									<td>
										<div class="inputL" style="width:130px">
											<div class="inputR">
												<div class="inputC">
													<input id="jb" name="jb" value="0" class="mini-combobox"
														data="yydj" emptyText="请选择..." />
												</div>
											</div>
										</div>
									</td>
									<td class="textR">病种类型:</td>
									<td>
										<div class="inputL" style="width:130px">
											<div class="inputR">
												<div class="inputC">
													<input id="lx1" name="lx1" value="1" class="mini-combobox"
														data="bzlx" emptyText="请选择..." />
												</div>
											</div>
										</div>
									</td>
									<td
										style="text-align: left; padding-top: 2px; padding-right: 20px;">
										<input type="button" value="" class="cxsubmit"
										onclick="search1()" /> <input type="reset" value=""
										class="cxreset" />
									</td>
								</tr>
							</table>
						</div>
					</form>
				</div>
			</fieldset>

			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mini-splitter nobor" style="width: 100%; height: 285px;">
					<div size="50%" showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">医疗机构费用类别占比列表</span>
						</h3>
						<div id="grid1" class="mini-datagrid" idField="id"
							style="width: 100%; height: 250px;" multiSelect="false"
							allowResize="true" sizeList="[9]" pageSize="9"
							url="${pageContext.request.contextPath}/k6/f10604001/queryFyzb.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="fylb" width="80" headerAlign="center" align="center">费用类别</div>
								<div field="zfy" width="80" headerAlign="center" align="center">总费用</div>
								<div field="pjfy" width="80" headerAlign="center" align="center">平均费用</div>
								<div field="fyzb" width="80" headerAlign="center" align="center">费用占比</div>
							</div>
						</div>
					</div>
					<div showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">医疗机构费用统计图标</span>
						</h3>
						<div id="chartPie" style="width: 100%; height: 250px;"></div>
					</div>
				</div>
			</fieldset>

			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mainlistCon">
					<div class="listTit">
						<h3 class="cxTit pTb8">
							<span class="iconCx">各级医疗机构费用类别占比列表</span>
						</h3>
					</div>

					<div id="grid2" class="mini-datagrid"
						style="width: 100%; height: 104px;" idField="id"
						multiSelect="true" allowResize="false" sizeList="[2]" pageSize="2"
						onrowdblclick="onRowDblclick"
						url="${pageContext.request.contextPath}/k6/f10604001/queryFyZTemp.action">
						<div property="columns">
							<div type="indexcolumn"></div>
							<div field="jgdj" width="100" headerAlign="center" align="center">机构等级</div>
							<div field="zfy" width="100" headerAlign="center" align="center">总费用</div>
							<div field="rc" width="100" headerAlign="center" align="center">总人次</div>
							<div field="pjfy" width="100" headerAlign="center" align="center">平均费用</div>
							<div field="bzc" width="100" headerAlign="center" align="center">标准差</div>
							<div field="sx" width="100" headerAlign="center" align="center">下限</div>
							<div field="xx" width="100" headerAlign="center" align="center">上限</div>
							<div field="lx" width="100" headerAlign="center" align="center"
								type="comboboxcolumn" visible="false">
								类型<input property="editor" class="mini-combobox"
									style="width:100%" data="bzlx" />
							</div>
						</div>
					</div>
				</div>
			</fieldset>
		</div>
		<div title="化验、用药排名" name="panel2" style="width: 100%; ">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div id="editForm2" class="cxTabbox">
					<form id="form2" action="#">
						<div id="" style="margin: 10px; position: relative;">
							<table style="width: 60%;" class="cxTab">
								<tr>
									<td class="textR">项目类型:</td>
									<td>
										<div class="inputL" style="width:130px">
											<div class="inputR">
												<div class="inputC">
													<input id="xmlb" name="xmlb" value="化验费"
														class="mini-combobox" data="xmlx" emptyText="请选择..." />
												</div>
											</div>
										</div></td>
									<td class="textR">病种类型:</td>
									<td>
										<div class="inputL" style="width:130px">
											<div class="inputR">
												<div class="inputC">
													<input id="lx2" name="lx2" value="1" class="mini-combobox"
														data="bzlx" emptyText="请选择..." />
												</div>
											</div>
										</div></td>
									<td
										style="text-align: left; padding-top: 2px; padding-right: 20px;">
										<input type="button" value="" class="cxsubmit"
										onclick="search2()" /> <input type="reset" value=""
										class="cxreset" onclick="" /></td>
								</tr>
							</table>
						</div>
					</form>
				</div>
			</fieldset>

			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mini-splitter nobor" style="width: 100%; height: 426px;">
					<div size="50%" showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">化验、用药排名</span>
						</h3>
						<div id="grid3" class="mini-datagrid" idField="id"
							style="width: 100%; height: 390px;" multiSelect="false"
							allowResize="true" sizeList="[15]" pageSize="15"
							url="${pageContext.request.contextPath}/k6/f10604001/queryPmTemp.action">
							<div property="columns">
								<div type="indexcolumn" width="20"></div>
								<div field="xmlb" width="100" headerAlign="center"
									align="center">项目类别</div>
								<div field="xmmc" width="100" headerAlign="center"
									align="center">项目名称</div>
								<div field="pc" width="100" headerAlign="center" align="center">使用频次</div>
							</div>
						</div>
					</div>
					<div showCollapseButton="false" class="listTit">
						<h3 class="cxTit fL">
							<span class="iconCx">化验、用药排名柱状图（TOP 10）</span>
						</h3>
						<div id="chartColumn" style="width: 100%; height: 390px;"></div>
					</div>
				</div>
			</fieldset>
		</div>
		<div title="按年龄、性别分析" name="panel3" style="width: 100%; ">
			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div id="editForm3" class="cxTabbox">
					<form id="form3" action="#">
						<div id="" style="margin: 10px; position: relative;">
							<table style="width: 38%;" class="cxTab">
								<tr>
									<td class="textR">病种类型:</td>
									<td>
										<div class="inputL" style="width:130px">
											<div class="inputR">
												<div class="inputC">
													<input id="lx3" name="lx3" class="mini-combobox"
														data="bzlx" emptyText="请选择..." />
												</div>
											</div>
										</div></td>
									<td
										style="text-align: left; padding-top: 2px; padding-right: 20px;">
										<input type="button" value="" class="cxsubmit"
										onclick="search3()" /> <input type="reset" value=""
										class="cxreset" /></td>
								</tr>
							</table>
						</div>
					</form>
				</div>
			</fieldset>

			<fieldset style="width: 100%; border: solid 0px #aaa;">
				<div class="mini-splitter nobor" style="width: 100%; height: 420px;">
					<div size="50%" showCollapseButton="false" class="listTit">

						<div id="grid4" class="mini-datagrid" idField="id"
							style="width: 100%; height: 200px;" onrowclick="queryDetail"
							multiSelect="false" allowResize="true"
							url="${pageContext.request.contextPath}/k6/f10604001/loadFxTempXb.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="xb" width="100" headerAlign="center" align="center">性别</div>
								<div field="zfy" width="100" headerAlign="center" align="center">总费用</div>
								<div field="rc" width="100" headerAlign="center" align="center">总人次</div>
								<div field="pffy" width="100" headerAlign="center"
									align="center">平均费用</div>
							</div>
						</div>

						<div id="grid5" class="mini-datagrid" idField="id"
							style="width: 100%; height: 200px;" onrowclick="queryDetail"
							multiSelect="false" allowResize="true"
							url="${pageContext.request.contextPath}/k6/f10604001/loadFxTempNld.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="nld" width="100" headerAlign="center" align="center">年龄段</div>
								<div field="zfy" width="100" headerAlign="center" align="center">总费用</div>
								<div field="rc" width="100" headerAlign="center" align="center">总人次</div>
								<div field="pffy" width="100" headerAlign="center"
									align="center">平均费用</div>
							</div>
						</div>

					</div>
					<div showCollapseButton="false" class="listTit">
						<div id="chartStrip" style="width: 100%; height: 400px;"></div>
					</div>
				</div>
			</fieldset>
		</div>
	</div>
	<script type="text/javascript">
		mini.parse();
		function activeChanged(e) {
			if (e.tab.title == '各级医疗机构费用类别占比') {
				search1();
			} else if (e.tab.title == '化验、用药排名') {
				search2();
			} else if (e.tab.title == '按年龄、性别分析') {
				search3();
			}
		}
		function search1() {
			var grid1 = mini.get("grid1");
			var grid2 = mini.get("grid2");
			var queryParams = {
				jb : mini.get("jb").getValue(),
				lx : mini.get("lx1").getValue()
			};
			grid1.load(queryParams);
			grid2.load(queryParams);
			var url = '${pageContext.request.contextPath}/k6/f10604001/queryPie.action';
			getChartData(url, queryParams, function(datas) {
				showPieChart('chartPie', '', datas, "grid1", "editForm1");
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
									pointFormat : '<b>{point.percentage:.1f}%</b>'
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
									events : {}
								} ]
							});
		}

		function onRowDblclick(e) {
			var grid = e.sender;
			var record = grid.getSelected();
			var yydj;
			if (record.jgdj == '二级医疗机构') {
				yydj = 1;
			} else if (record.jgdj == '三级医疗机构') {
				yydj = 2;
			}
			mini
					.open({
						url : "${pageContext.request.contextPath}/pages/k6/f10604001/f10604001_info.jsp",
						title : "",
						width : 900,
						height : 610,
						onload : function() {
							var iframe = this.getIFrameEl();
							var data = {
								jb : yydj,
								lx : record.lx
							};
							iframe.contentWindow.setData(data);
						},
						ondestroy : function(action) {
						}
					});
		}
		function search2() {
			var grid3 = mini.get("grid3");
			var queryParams = {
				xmlb : mini.get("xmlb").getValue(),
				lx : mini.get("lx2").getValue()
			};
			grid3.load(queryParams);
			var url = '${pageContext.request.contextPath}/k6/f10604001/queryColumn.action';
			getChartData(url, queryParams, function(datas) {
				showColumnChart('chartColumn', '', datas.xAxisCategories,
						datas.dates, "grid3", "editForm2");
			});
		}
		function showColumnChart(divId, title, xAxisCategories, tdatas,
				seriesName, clickFuc) {
			$('#' + divId).highcharts(
					{
						chart : {
							margin : [ 50, 50, 100, 80 ],
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
							categories : xAxisCategories,
							labels : {
								rotation : -45,
								align : 'right',
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
							}
						},
						legend : {
							enabled : false
						},
						tooltip : {
							pointFormat : '<b>{point.y}人次</b>',
						},
						series : [ {
							name : 'Population',
							data : tdatas,
							dataLabels : {
								enabled : false,
								rotation : -90,
								color : '#FFFFFF',
								align : 'right',
								x : 4,
								y : 10,
								style : {
									fontSize : '13px',
									fontFamily : 'Verdana, sans-serif',
									textShadow : '0 0 3px black'
								}
							}
						} ]
					});
		}
		mini.get("lx3").setValue("1");
		function search3() {
			var grid4 = mini.get("grid4");
			var grid5 = mini.get("grid5");
			var queryParams = {
				lx : mini.get("lx3").getValue()
			};

			grid4.load(queryParams);
			grid5.load(queryParams);

			var url = '${pageContext.request.contextPath}/k6/f10604001/queryStrip.action';
			getChartData(url, queryParams, function(datas) {
				showXYChart('chartStrip', '', datas, "grid4", "editForm3");
			});
		}
		function showXYChart(divId, title, datas, gridId, formId) {
			$('#' + divId).highcharts({
				chart : {
					zoomType : 'xy'
				},
				title : {
					text : ''
				},
				subtitle : {
					text : ''
				},
				xAxis : [ {
					categories : datas.xAxisCategories
				} ],
				yAxis : [ { // Primary yAxis
					labels : {
						format : '{value}人次',
						style : {
							color : '#89A54E'
						}
					},
					title : {
						text : '',
						style : {
							color : '#89A54E'
						}
					}
				}, { // Secondary yAxis
					title : {
						text : '',
						style : {
							color : '#4572A7'
						}
					},
					labels : {
						format : '{value}元',
						style : {
							color : '#4572A7'
						}
					},
					opposite : true
				} ],
				tooltip : {
					shared : true
				},
				legend : {
					layout : 'vertical',
					align : 'left',
					x : 120,
					verticalAlign : 'top',
					y : 100,
					floating : true,
					backgroundColor : '#FFFFFF'
				},
				series : [ {
					name : '总人次',
					color : '#4572A7',
					type : 'column',
					data : datas.dates1,
					tooltip : {
						valueSuffix : '人次'
					}

				}, {
					name : '平均费用',
					color : '#89A54E',
					type : 'spline',
					data : datas.dates2,
					yAxis : 1,
					tooltip : {
						valueSuffix : '元'
					}
				} ]
			});
		}
	</script>
</body>
</html>