/************************************************画图**********************************************************/
	//区域图
	//data:[1,2,22,44......]
	function showAreaChartReoprt(divId, title, tSeriesName, tdatas, ySeriesName, ydatas){
		$('#' + divId).highcharts({
			 chart: {
		            type: 'area',
		            backgroundColor: null,
		            plotBackgroundColor: null,
		            plotBorderWidth: null,
		            plotShadow: false
		        },
		        credits:false,
		        title: {
		            text: title,
		            style:{
		            	"fontSize": "18px!important"
		                }
		        },
		        xAxis: {
		            labels: {
		                formatter: function() {
		                    return this.value; // clean, unformatted number for year
		                }
		            }
		        },
		        yAxis: {
		            title: {text: ' ' },
		            labels: {
		                formatter: function() {
		                    return this.value;
		                }
		            }
		        },
		        tooltip: {
		            pointFormat: '{series.name}:<b>{point.y:,.0f}</b>'
		        },
		        plotOptions: {
		            area: {
		                pointStart: 1,
		                marker: {
		                    enabled: true,
		                    //symbol: 'circle',
		                    //radius: 2,
		                    states: {
		                        hover: {
		                            enabled: true
		                        }
		                    }
		                }
		            }
		        },
		        series: [{
		            name: tSeriesName,
		            data: tdatas
		        }, {
		            name: ySeriesName,
		            data: ydatas
		        }]
	    });  
	}
	//饼图
	//datas:[{name: 'Chrome', y: 12.8, sliced: true, selected: true}, {name: 'Firefox', y: 45.0}, ...]
	function showPieChartReoprt(divId, title, datas){
		$('#' + divId).highcharts({
	        chart: {
	        	backgroundColor: null,
	            plotBackgroundColor: null,
	            plotBorderWidth: null,
	            plotShadow: false,
	            options3d: {
	                enabled: true,
	                alpha: 60,
	                beta: 0
	            }
	        },
	        credits:false,
	        colors: ['#4F81BD', '#C0504D', '#9BBB59', '#8064A2','#539987'],
	        title: {
	            text: title,
	            style:{
	            	"fontSize": "18px!important"
	                }
	        },
	        tooltip: {
	    	    pointFormat: '<b>{point.percentage:.1f}%</b>'
	        },
		    pane: {
//		        startAngle: 0,
//		        endAngle: 360
		    	size: '90%'
		    },
	        plotOptions: {
	            pie: {
	                allowPointSelect: true,
	                cursor: 'pointer',
	                depth: 40,
	                dataLabels: {
	                    enabled: false,
	                    color: '#000000',
	                    connectorColor: '#000000',
	                    format: '<b>{point.name}</b>: {point.percentage:.1f} %'
	                },
	                showInLegend: true
	            }
	        },
	        legend: {
	        	layout: 'vertical',
	        	verticalAlign: 'middle',
	        	align: 'right'
	        	//x:-150
	        },
	        series: [{
	            type: 'pie',
	            name: 'Browser share',
	            data: datas
	            	/* [{name: 'Chrome', y: 12.8, sliced: true, selected: true}, 
	                   {name: 'Firefox', y: 26.8}, 
	                   {name: 'IE', y: 45.0}, 
	                   {name: 'Safari', y: 8.5}, 
	                   {name: 'Opera', y: 6.2}
					] */
	        }]
	    });
	}
	//条形图
	//xAxisCategories:['Africa', 'America', 'Asia', 'Europe', 'Oceania']
	//datas：[107, 31, 635, 203, 2]   
	function showBarChartReoprt(divId, title, xAxisCategories, tdatas, seriesName, clickFuc){
		if(seriesName == null) seriesName = "次数";
		$('#' + divId).highcharts({                                           
	        chart: {                                                           
	            type: 'bar',
	            backgroundColor: null,
	            plotBackgroundColor: null,
	            plotBorderWidth: null,
	            plotShadow: false
//	            spacing: [10, 40, 35, 20]
//	            margin: [20,20,20,20],
//	            plotBorderColor: null
	        },
	        title: {                                                           
	            text: title,  
	            style:{
	            	"fontSize": "18px!important"
	                }
	        },                                                                 
	        xAxis: {                                                           
	            categories: xAxisCategories,
	            title: {                                                       
	                text: null                                                 
	            }                                                              
	        },                                                                 
	        yAxis: {                                                           
	            min: 0,                                                        
	            title: {                                                       
	                text: ' ',                             
	                align: 'high'                                              
	            },                                                             
	            labels: {                                                      
	                overflow: 'justify'                                        
	            }                                                              
	        },                                                            
	        tooltip: {                                                         
	            valueSuffix: ''                                       
	        },                                                                 
	        plotOptions: {                                                     
	            bar: {                                                         
	                dataLabels: {                                              
	                    enabled: true                                          
	                }                                                          
	            }                                                              
	        },                                                                 
	        legend: {                                                          
	            layout: 'vertical',                                            
	            align: 'right',                                                
	            verticalAlign: 'top',                                          
	            x: -1000,     //为0，不显示方块                                                   
	            y: 0,                                                        
	            floating: true,                                                
	            borderWidth: 1,   
	            borderColor:'#FFFFFF',  
	            backgroundColor: '#FFFFFF',                                    
	            shadow: true                                                   
	        },                                                                 
	        credits: {                                                         
	            enabled: false                                                 
	        },                                                                 
	        series: [{                                                         
	            name: seriesName,                                             
	            data: tdatas,
	            events: {
		            click: function(event) {
		            	clickFuc(event);
		            }
		        }
	        }]                                                                 
	    });           
	}
	//极地图
	//data[{type: 'area', name: 'Area', data: [1, 8, 2, 7, 3, 6, 4, 5]}]
	function showPolarChartReoprt(divId, title, xAxisCategories, data){
		$('#' + divId).highcharts({
		    chart: {
				borderWidth: 0,
				backgroundColor: null,
				//plotBackgroundImage: '../images/02_12_3.png',
		        polar: true
		    },
		    credits:false,
		    title: {
		        text: title,
		        style:{
	            	"fontSize": "18px!important"
	                }
		    },
		    pane: {
//		        startAngle: 0,
//		        endAngle: 360
		    	size: '80%'
		    },
		    xAxis: {
//		        tickInterval: 45,
//		        min: 0,
//		        max: 360,
		        categories: xAxisCategories,
		 	    tickmarkPlacement: 'on',
		 	    lineWidth: 0,
		        labels: {
		        	formatter: function () {
		        		return this.value;
		        	}
		        }
		    },
		    yAxis: {
		        min: 0
		    },
		    /*plotOptions: {
		        series: {
		            pointStart: 0,
		            pointInterval: 45
		        },
		        column: {
		            pointPadding: 0,
		            groupPadding: 0
		        }
		    },*/
		    series: data
		    /*[{
		        type: 'column',
		        name: 'Column',
		        data: [8, 7, 6, 5, 4, 3, 2, 1],
		        pointPlacement: 'between'
		    }, {
		        type: 'line',
		        name: 'Line',
		        data: [1, 2, 3, 4, 5, 6, 7, 8]
		    },
		    {
		        type: 'area',
		        name: 'Area',
		        data: [1, 8, 2, 7, 3, 6, 4, 5]
		    }] */
		});
	}
	//折线图
	//xAxisCategories:['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
	function showLineChartReoprt(divId, title, xAxisCategories, data){
		$('#' + divId).highcharts({
			credits:false,
	        title: {
	            text: title,
	            style:{
	            	"fontSize": "18px!important"
	                },
	            backgroundColor: null,
	            x: -20 //center
	        },
//	        subtitle: {
//	            text: 'Source: WorldClimate.com',
//	            x: -20
//	        },
	        xAxis: {
	            categories: xAxisCategories
	        },
		    yAxis: {
		        min: 0
		    },
//	        tooltip: {
//	            valueSuffix: '月'
//	        },
	        legend: {
	            layout: 'vertical',
	            align: 'right',
	            verticalAlign: 'middle',
	            borderWidth: 0
	        },
	        series: data
//	        [{
//	            name: 'Tokyo',
//	            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
//	        }, {
//	            name: 'New York',
//	            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
//	        }, {
//	            name: 'Berlin',
//	            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
//	        }, {
//	            name: 'London',
//	            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
//	        }]
	    });
	}
	
	
	//医师接诊排行饼图
	//datas:[{name: 'Chrome', y: 12.8, sliced: true, selected: true}, {name: 'Firefox', y: 45.0}, ...]
	function showPieChartYsJzphReoprt(divId, title, datas){
		$('#' + divId).highcharts({
	        chart: {
	        	backgroundColor: null,
	            plotBackgroundColor: null,
	            plotBorderWidth: null,
	            plotShadow: false,
	            options3d: {
	                enabled: true,
	                alpha: 60,
	                beta: 0
	            }
	        },
	        credits:false,
	        colors: ['rgb(244,191,89)', 'rgb(96,185,65)', 'rgb(101,215,208)', 'rgb(76,120,193)','rgb(234,180,213)'],
	        title: {
	            text: title,
	            style:{
	            	"fontSize": "18px!important"
                }
	        },
	        tooltip: {
	    	    pointFormat: '<b>{point.percentage:.1f}%</b>'
	        },
		    pane: {
//		        startAngle: 0,
//		        endAngle: 360
		    	size: '90%'
		    },
	        plotOptions: {
	            pie: {
	                allowPointSelect: true,
	                cursor: 'pointer',
	                depth: 40,
	                dataLabels: {
	                    enabled: false,
	                    color: '#000000',
	                    connectorColor: '#000000',
	                    format: '<b>{point.name}</b>: {point.percentage:.1f} %'
	                },
	                showInLegend: true
	            }
	        },
	        legend: {
	        	layout: 'vertical',
	        	verticalAlign: 'middle',
	        	align: 'right'
	        	//x:-150
	        },
	        series: [{
	            type: 'pie',
	            name: 'Browser share',
	            data: datas
	            	/* [{name: 'Chrome', y: 12.8, sliced: true, selected: true}, 
	                   {name: 'Firefox', y: 26.8}, 
	                   {name: 'IE', y: 45.0}, 
	                   {name: 'Safari', y: 8.5}, 
	                   {name: 'Opera', y: 6.2}
					] */
	        }]
	    });
	}