<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>病种信息</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
	</head>
	<body>
		
		<form id="form_info" action="" method="post">
			<input id="jb" name="jb" class="mini-hidden" required="true"/>
			<input id="lx" name="lx" class="mini-hidden" required="true"/>
		</form>
		
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="chartStrip" style="width: 100%; height: 440px;"></div>
	</fieldset>
	
	<fieldset style="width: 100%; border: solid 0px #aaa;">
		<div class="mainlistCon">
			<div id="grid1" class="mini-datagrid"
				style="width: 100%; height: 130px;" idField="id" multiSelect="true"
				allowResize="false" sizeList="[3]" pageSize="3" onrowdblclick="onRowDblclick"
				url="${pageContext.request.contextPath}/k6/f10604001/queryFyYyTemp.action">
				<div property="columns">
					<div type="indexcolumn"></div>
					<div field="yymc" width="100" headerAlign="center" align="center">医院名称</div>
					<div field="zfy" width="100" headerAlign="center" align="center">总费用</div>
					<div field="rc" width="100" headerAlign="center" align="center">总人次</div>
					<div field="pjfy" width="100" headerAlign="center" align="center">平均费用</div>
					<div field="pjfybz" width="100" headerAlign="center" align="center">医院平均费用</div>
				</div>
			</div>
		</div>
	</fieldset>
	
<script type="text/javascript">
	mini.parse();
		
	var grid1 = mini.get("grid1");
	
	var form = new mini.Form("form_info");
	
	function setData(data){
		data = mini.clone(data);
		form.setData(data);
		grid1.load({jb:data.jb,lx:data.lx});
		
		var url = '${pageContext.request.contextPath}/k6/f10604001/queryFyYyTempScrip.action';
		getChartData(url, data, function(datas) {
			showPieChart('chartStrip', '', datas , "grid1", "editForm1");
		});
		//showPieChart('chartStrip', '', '' , "grid1", "editForm1");
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
				$('#' + divId).highcharts({
					 chart: {
			            zoomType: 'xy'
			        },
			        title: {
			            text: ''
			        },
			        subtitle: {
			            text: ''
			        },
			        xAxis: [{
			        	labels: {
			        		rotation: -45,
			        		style: {
			                	fontSize: '8px'
			                }
			        	},
			            categories: datas.xAxisCategories
			        }],
			        yAxis: [{ // Primary yAxis
			            labels: {
			                format: '{value}元',
			                style: {
			                    color: '#89A54E'
			                }
			            },
			            title: {
			                text: '',
			                style: {
			                    color: '#89A54E'
			                }
			            }
			        }, { // Secondary yAxis
			            title: {
			                text: '',
			                style: {
			                    color: '#4572A7'
			                }
			            },
			            labels: {
			                format: '',
			                style: {
			                    color: '#4572A7'
			                }
			            },
			            opposite: true
			        }],
			        tooltip: {
			            shared: true
			        },
			        legend: {
			            layout: 'vertical',
			            align: 'left',
			            x: 120,
			            verticalAlign: 'top',
			            y: 100,
			            floating: true,
			            backgroundColor: '#FFFFFF'
			        },
			        series: [{
			            name: '平均费用',
			            color: '#4572A7',
			            type: 'column',
			            data: datas.dates1,
			            tooltip: {
			                valueSuffix: '元'
			            }
			
			        }, {
			            name: '平均费用标准',
			            color: '#89A54E',
			            type: 'spline',
			            data: datas.dates2,
			            tooltip: {
			                //valueSuffix: '元'
			            }
			        }]
				});
			}
	
	
	
</script>
		
	</body>
</html>