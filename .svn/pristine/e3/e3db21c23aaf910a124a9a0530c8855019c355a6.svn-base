<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*,java.text.SimpleDateFormat"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>医疗服务机构分项费用发展趋势分析</title>
<%
	Calendar c = Calendar.getInstance();
	c.add(Calendar.MONTH, -1);
	SimpleDateFormat sdfmonth = new SimpleDateFormat("yyyy-MM");
	String month_date = sdfmonth.format(c.getTime());
	c.set(Calendar.MONTH, 0);
	String month_date_s = sdfmonth.format(c.getTime());
%>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
</head>
<body>
	<fieldset style="width: 100%; border: solid 0px #aaa;">
		<div id="editForm1" class="cxTabbox">
			<form id="form1" action="#">
				<div id="" style="margin: 10px; position: relative;">
					<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<td class="textR"><span style="color: red;">*</span>统计周期：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ape032" name="ape032" class="mini-combobox"
												value="M" emptyText="请选择..." data="${dic['APE032']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR"><span style="color: red;">*</span>起始年月：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae041" name="aae041" value="<%=month_date_s%>"
												class="mini-monthpicker" onvaluechanged="onTimeChanged" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR"><span style="color: red;">*</span>终止年月：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae042" name="aae042" value="<%=month_date%>"
												class="mini-monthpicker" onvaluechanged="onTimeChanged" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR"><span style="color: red;">*</span>分析指标：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="fxqs" name="fxqs" class="mini-combobox"
												value="AKC264" emptyText="请选择..." data="${dic['FXQS']}" />
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
							<td class="textR">险种类型：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aae140" name="aae140" class="mini-combobox"
												value="310" emptyText="请选择..." data="${dic['AAE140']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">医疗机构ID：</td>
							<td>
								<div class="inputL" style="width: 130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aaz107" name="aaz107" class="mini-buttonedit"
												onbuttonclick="checkYLJG" emptyText="" />
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
												emptyText="请选择..." data="${dic['AKB022']}" />
										</div>
									</div>
								</div>
							</td>
						</tr>
						<tr>
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
							<td class="textR">收费项目等级：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="aka065" name="aka065" class="mini-combobox"
												emptyText="请选择..." data="${dic['AKA065']}" />
										</div>
									</div>
								</div>
							</td>
							<td class="textR">三大目录类别：</td>
							<td>
								<div class="inputL" style="width:130px">
									<div class="inputR">
										<div class="inputC">
											<input id="ake003" name="ake003" class="mini-combobox"
												emptyText="请选择..." data="${dic['AKE003']}" />
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
							<td class="textR">医疗发票类别：</td>
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
							<td style="text-align: right; padding-top: 5px; padding-right:25px;"
								colspan="4">
								<input type="button" value="" class="cxsubmit" onclick="search();" /> 
								<input type="reset" value="" class="cxreset" onclick="resetForm();" />
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</fieldset>
	<fieldset>
		<div style="width: 100%; height: 250px;">
			<div size="35%" showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx" id="span1">图表信息</span>
				</h3>
				<div id="chartColumnLine" style="width: 100%; height: 175px;"></div>
			</div>
		</div>
	</fieldset>
	<fieldset>
		<div showCollapseButton="false" class="listTit">
			<h3 class="cxTit fL">
				<span class="iconCx" id="titleText">发展趋势表</span>
			</h3>
			<div class="fR pT5R9">
				<span class="btnMini"> <em> <input type="button"
						value="问题登记" onclick="problemReg()" /> </em> </span>
			</div>
			<div id="grid" class="mini-datagrid" idField="" multiSelect="false"
				style="width: 100%; height: 126px;" allowResize="true" pageSize="3"
				url="${pageContext.request.contextPath}/k6/f10603007/viewTrend.action">
				<div property="columns">
					<div type="indexcolumn"></div>
					<div field="aae041" width="140" headerAlign="center" align="center"allowSort="true">统计本月</div>
					<div field="cur_pred" width="140" headerAlign="center"align="center" allowSort="true">本期数</div>
					<div field="sam_pred" width="140" headerAlign="center"align="center" allowSort="true">上年同期数</div>
					<div field="pre_pred" width="140" headerAlign="center"align="center" allowSort="true">上期数</div>
					<div field="sam_rate" width="140" headerAlign="center"align="center" allowSort="true">同比增长率(%)</div>
					<div field="pre_rate" width="140" headerAlign="center"align="center" allowSort="true">环比增长率(%)</div>
					<div field="tre_mean" width="140" headerAlign="center"align="center" allowSort="true">移动平均</div>
					<div field="analid" visible="false">id</div>
					<div field="aaa027" visible="false">统筹区编码</div>
				</div>
			</div>
		</div>
	</fieldset>
	<script type="text/javascript">
		mini.parse();
		var form = new mini.Form("form1");
		function search() {
			if (onTimeChanged()) {
				changeApeAndTitle();
				var data = form.getData(true);
				var grid = mini.get("grid");
				var json = mini.encode(data);
				var url = '${pageContext.request.contextPath}/k6/f10603007/buildData.action';
				getChartData(
						url,
						json,
						function(datas) {
							var queryParams = {
								analid : datas.analid,
								submitData : json
							};
							grid.load(queryParams);
							getChartData(
									'${pageContext.request.contextPath}/k6/f10603007/queryMoveAverage.action',
									datas.analid, function(Chartdatas) {
										showChartColumnLine('chartColumnLine',
												'', Chartdatas, '', '');
									});
						});
			}
		}
		
		var titleA=null; //月、季度、年
		var titleB=null;//分析内容
		function changeApeAndTitle(){
			var ape032 = mini.get("ape032").getValue();
			var fxqs = mini.get("fxqs").getValue();
			if(ape032 == "M"){
				titleA = "月";
			}else if(ape032 == "S"){
				titleA = "季度";
			}else if(ape032 == "Y"){
				titleA = "年";
			}
			if(fxqs == "AKC264"){
				titleB = "总费用";
			}else if(fxqs == "CJFY"){
				titleB = "次均费用";
			}else if(fxqs == "RJFY"){
				titleB = "人均费用";
			}
			document.getElementById("span1").innerHTML=titleB+"按"+titleA+"移动平均" + "图表信息";
		}
		
		function getChartData(url, params, callback) {
			$.ajax(url, {
				type : 'POST',
				data : {
					submitData : params
				},
				cache : false,
				dataType : 'json',
				success : function(data) {
					callback(data);
				}
			});
		}
		function onTimeChanged() {
			var aae041StarDate = mini.get("aae041").getFormValue();
			var aae042EndDate = mini.get("aae042").getFormValue();
			if (aae041StarDate.substring(0, 4) != aae042EndDate.substring(0, 4)) {
				mini.alert("选择日期不能跨年");
				return false;
			}
			if (aae041StarDate > aae042EndDate) {
				mini.alert("结束日期不能小于开始日期");
				return false;
			}
			return true;
		}
		//弹出医疗机构
		function checkYLJG(e) {
			var btnEdit = this;
			var akb022 = mini.get("akb022");
			var aka101 = mini.get("aka101");
			mini.open({
				url : "/yljk/pages/pub/selectMedi.jsp",
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
		function resetForm() {
			form.reset();
		}
		

		function showChartColumnLine(divId, title, datas, seriesName, clickFuc) {
			$('#'+divId).highcharts({
		        chart: {
		            
		        },
		        title: {
		            text: ''
		        },
		        xAxis: {
		            categories: datas.xAxisCategories
		        },
		        yAxis: {
		            min: 0,
		            title: {
		                text: ''
		            }
		        },
		        legend: {                                                          
				            layout: 'vertical',
				            backgroundColor: 'white',
				            align: 'left',
				            verticalAlign: 'top',
				            y: 10,
				            x: 70,
				            borderWidth: 1,
				            borderRadius: 0,
				            title: {
				                //text: ':: 拖动我'
				            },
				            floating: false,
				            draggable: false,
				            zIndex: 20,
				            enabled : false
				    },   
		        plotOptions: {
		            column: {
		                pointPadding: 0.2,
		                borderWidth: 0,
		                colorByPoint : true,
						colors : [ '#7cb5ec', '#434348', '#90ed7d',
									'#f7a35c', '#8085e9', '#f15c80',
									'#e4d354', '#8085e8', '#8d4653',
									'#91e8e1' ]	
		            },
		            bar: {                                                         
				             dataLabels: {                                              
				                   enabled: true                                          
				              }                                                       
				        } 
		        },
		        series: [{
		            type: 'column',
		            name: '费用',
		            data: datas.column
		
		        }, {
		            type: 'line',
		            name: '移动平均',
		            data: datas.line
		
		        }]
		    });
		}
	</script>
</body>
</html>