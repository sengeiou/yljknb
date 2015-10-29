<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医院排名</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
	</head>
	<body>		
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="zbph" style="width: 100%; height: 440px;"></div>
		</fieldset>
	
<script type="text/javascript">
	mini.parse();	
	function setData(data){
		data = mini.clone(data);
		var url='${pageContext.request.contextPath}/k6/f10603001/queryMedicalRank.action';
		getChartData(url, data, function(datas) {
			showColumnChart('zbph', '', datas, " ", " ");
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
	function showColumnChart(divId, title, datas, gridId, formId) {
		$('#' + divId).highcharts({
			chart : {
				options3d: {
            	}
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
			yAxis : [ { 
				labels : {
					format : '{value}%',
					style : {
						color : '#4572A7'
					}
				},
				title : {
					text : '',
					style : {
						color : '#89A54E'
					}
				}
			},{
			title : {
				text : '',
				style : {
					color : '#4572A7'
				}
			},
			labels : {
				format : '{value}%',
				style : {
					color : '#4572A7'
				},
				enabled:false
			},
			opposite : true
			
		}],
			tooltip : {
				shared : true,
				valueSuffix:'%'
			},
			legend : {
				layout : 'horizontal',
				align : 'left',
				x : 120,
				verticalAlign : 'top',
				y : 100,
				floating : true,
				backgroundColor : '#FFFFFF'
			},
			series : [ {
				name : '占自己总费用比例',
				color : '#4572A7',
				type : 'column',
				data : datas.dates1,
				tooltip : {
				}

			}]
		});
	}
</script>
		
	</body>
</html>