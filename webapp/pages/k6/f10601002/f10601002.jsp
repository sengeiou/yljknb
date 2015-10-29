<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>参保人群就医发展趋势分析</title>
		<%@ include file="../../../pages/pub/pubsource.jsp"%>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>
	</head>
	<body>
		<fieldset style="width: 100%; border: solid 0px #aaa;">
			<div id="editForm1" class="cxTabbox">
				<form id="form1" action="#">
					<div id="" style="margin: 10px; position: relative;">
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%" >
							<tr>
								<td class="textR"><span style="color: red;">*</span>统计周期：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input onvaluechanged="changeDate" id="ape032" name="ape032" class="mini-combobox" value="M"
													emptyText="请选择..." data="${dic['APE032']}" required="true" />
											</div>
										</div>
									</div>
								</td>
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
								<td class="textR"><span style="color: red;">*</span>分析指标：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="psqs" name="psqs" class="mini-combobox"
													emptyText="请选择..."  data="${dic['PSQS'] }" 
													 value="AKE098" required="true"/>
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
							</tr>
							<tr>
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
								<%--<td class="textR">身份类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akc021" name="akc021" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKC021'] }" />
											</div>
										</div>
									</div>
								</td>
								--%>
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
							</tr>
							<tr>
								
								<%--<td class="textR">
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
								--%>
								<td style="text-align: right; padding-top: 5px; padding-right:10px;"
									colspan="10">
									<input type="button"value="" class="cxsubmit" onclick="search();" />
									<input type="button" value="" class="cxreset" onclick="resetf();"/>
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
						<span class="iconCx" id="span1">移动平均趋势</span>
					</h3>
					<div showCollapseButton="false" class="listTit">
						<div id="moveAverage" style="width: 100%; height: 210px;"></div>
					</div>
				</div>
			</div>
		</fieldset>
		<fieldset>
			<div showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx" id="titleText">发展趋势表</span>
				</h3>
				<div class="fR pT5R9">
					<span class="btnMini">
						<em>
							<input type="button" value="问题登记" onclick="problemReg()"/>
						</em>
					</span>
				</div>
				<div id="grid1" class="mini-datagrid" multiSelect="false"
					style="width: 100%; height: 141px;" allowResize="true" 
					url="${pageContext.request.contextPath}/k6/f10601002/querySeeDoctTrend.action" >
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="aae041" width="140" headerAlign="center" align="center" >
							统计范围
						</div>
						<div field="cur_pred" width="140" headerAlign="center" align="center"
							allowSort="true" dataType="float">
							本期数
						</div>
						<div field="sam_pred" width="140" headerAlign="center" align="center"
							allowSort="true" dataType="float">
							上年同期数
						</div>
						<div field="pre_pred" width="140" headerAlign="center" align="center"
							allowSort="true" dataType="float">
							上期数
						</div>
						<div field="sam_rate" width="140" headerAlign="center" align="center"
							allowSort="true"  dataType="float">
							同比增长率(%)
						</div>
						<div field="pre_rate" width="140" headerAlign="center" align="center"
							allowSort="true" dataType="float">
							环比增长率(%)
						</div>
						<div field="tre_mean" width="140" headerAlign="center" align="center"
							allowSort="true" dataType="float">
							移动平均
						</div>
						<div field="proccid" width="140" headerAlign="center" align="center" visible="false"
							allowSort="true">
						</div>
						<div field="aaa027" width="140" headerAlign="center" align="center"  visible="false"
							allowSort="true">
						</div>
					</div>
				</div>
			</div>
		</fieldset>
		<script type="text/javascript">
			mini.parse();
			
			$(document).ready(function(){
				GetDate();
				changeDate();
				title = "就诊人次按月移动平均";
				document.getElementById("span1").innerHTML=title;
				});

			var titleA=null; //月、季度、年
			var titleB=null;//分析内容
			var titleC=null; //图纵坐标风格
			function changeApeAndTitle(){
				var ape032=mini.get("ape032").getValue();
				var psqs=mini.get("psqs").getValue();
				if(ape032=="M"){
					titleA = "月";
					}
				else if(ape032=="S"){
					titleA = "季度";
					}
				else if(ape032=="Y"){
					titleA = "年";
					}
				if(psqs=="AKC264"){
					titleB="医疗费用";
					titleC="";
					}
				else if(psqs=="AKE096"){
					titleB="就诊人数";
					titleC="";
					}
				else if(psqs=="AKE098"){
					titleB="就诊人次";
					titleC="";
					}
				else if(psqs=="CJFY"){
					titleB="次均医疗费用";
					titleC="";
					}
				else if(psqs=="FSL"){
					titleB="发生率";
					titleC="%";
					}
				else if(psqs=="JZL"){
					titleB="就诊率";
					titleC="%";
					}
				else if(psqs=="RJFY"){
					titleB="人均医疗费用";
					titleC="";
					}
				else if(psqs=="YPFY"){
					titleB="药品费用";
					titleC="";
					}
				document.getElementById("span1").innerHTML=titleB+"按"+titleA+"移动平均";
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
			function search(){
				if(validMyDate()){
					changeApeAndTitle();
					var grid1=mini.get("grid1");
					var queryForm = new mini.Form("form1");
					var data = queryForm.getData(true);
					grid1.load(data);
					var url="${pageContext.request.contextPath}/k6/f10601002/queryMoveAverage.action";
					getChartData(url, data, function(datas) {
						showXYChart('moveAverage', '', datas);
					});
				}
			}
			function showXYChart(divId, title, datas) {
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
							formatter: function() {
								var psqs=mini.get("psqs").getValue();
								if(psqs=="JZL"||psqs=="FSL"){
									return (this.value).toFixed(0)+"%";
								}
								else{
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
				
		               		},
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
						format : '{value}',
						style : {
							color : '#4572A7'
						},
						enabled:false
					},
					opposite : true
					
				}],
					tooltip : {
						shared : true
					},
					legend : {
						layout : 'horizontal',
						align : 'left',
						y : 10,
						x : 70,
						verticalAlign : 'top',
						floating : true,
						backgroundColor : '#FFFFFF'
					},
					series : [ {
						name : titleB,
						color : '#4572A7',
						type : 'column',
						data : datas.dates1,
						tooltip : {
						}

					}, {
						name : '移动平均',
						color : '#89A54E',
						type : 'spline',
						data : datas.dates2,
						yAxis : 1,
						tooltip : {
						}
					} ]
				});
			}
	function resetf(){
		mini.get("ape032").setValue("M");
		changeDate();
		mini.get("psqs").setValue("AKE098");
		mini.get("aae140").setValue("310");
		mini.get("aaz107").setValue("");
		mini.get("aka101").setValue("");
	//	mini.get("akc021").setValue("");
		mini.get("akb022").setValue("");
		mini.get("aka130").setValue("");
	//	mini.get("aka122").setValue("");
		mini.get("aaa027").setValue("");

	//	mini.get("aka122").setText("");
		mini.get("aaz107").setText("");
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
	//按照统计周期，起始年月，终止年月进行判断
	   function isNotNullThree()
		{
			var ape032 = mini.get("ape032").getValue();
			var aae041 = mini.get("aae041").getFormValue();
			var aae042 = mini.get("aae042").getFormValue();
			if((ape032 != ""&&ape032 != null)&&(aae041 != ""&&aae041 != null)&&(aae042 != ""&&aae042 != null))
			{
			    return true;
			}
			else
			{
			    return false;
			}
		}
	   function validMyDate(){
			var ape032 = mini.get("ape032").getValue();
			var aae041 = mini.get("aae041").getFormValue();
			var aae042 = mini.get("aae042").getFormValue();
		    var aae041sub = aae041.substring(0,4)+aae041.substring(5,7);
		    var aae042sub = aae042.substring(0,4)+aae042.substring(5,7);
	        if(isNotNullThree())
	        { 
	            var diff = parseInt(aae042sub)-parseInt(aae041sub);
	            if(diff<0)
	            {
	        	    mini.alert("起始年月不能晚于终止年月，请重新录入！","录入错误");
	        	    return false;
	            }
	            var yearBeg = aae041.substring(0,4);
	            var yearEnd = aae042.substring(0,4);
	            if(ape032 == "S" || ape032 == "M") 
	            {
	            	if(yearBeg != yearEnd)
	                {
	            		mini.alert("起始终止年度需为同一年度，请重新录入！","录入错误");
	            	    return false;
	                }
	            }
	            var monthBeg = aae041.substring(5,7);
	            var monthEnd = aae042.substring(5,7);
	        	if(ape032 == "S")
	            {
	                if(monthBeg == "01" ||monthBeg == "04" ||monthBeg == "07" ||monthBeg == "10" )
	                {
	                    if(monthEnd != "03" && monthEnd != "06" && monthEnd != "09" && monthEnd != "12")
	                    {
	                	    mini.alert("起始年月与终止年月不为季度阈值，请重新录入！","录入错误");
	                	    return false;
	                    }
	                }
	                else
	                {
	            	    mini.alert("起始年月与终止年月不为季度阈值，请重新录入！","录入错误");
	            	    return false;
	                }
	            }
	            if(ape032 == "Y")
	            {
	                if(monthBeg != "01"||monthEnd !="12")
	                {
	            	    mini.alert("起始年月与终止年月不为年度阈值，请重新录入！","录入错误");
	            	    return false;
	                }
	            }

	        }
	        else{
	        	mini.alert("起始年月与终止年月不为空，请重新录入！","录入错误");
	        	return false;
	        }
	        return true;
		}

		var monthStart;
		var monthEnd;
		var quarterStart;
		var quarterEnd;
		var yearStart;
		var yearEnd;
		function GetDate(){
			var quarter;
			var myDate=new Date();
			var year=myDate.getFullYear();
			var month=myDate.getMonth()+1;
			yearStart="2011-01";
			yearEnd=(year-1)+"-12";
			if(month>1){
				monthStart=year+"-01"
				monthEnd=year+"-"+(month-1)
			}else{
				monthStart=(year-1)+"-01";
				monthEnd=(year-1)+"-12";
			}
			quarter=Math.ceil(month/3);
			if(quarter=="1"){
				quarterStart=(year-1)+"-10";
				quarterEnd=(year-1)+"-12";
			}else{
				quarterStart=year+"-0"+(quarter*3-5);
				quarterEnd=year+"-0"+(quarter*3-3);
			}
		}
		function changeDate(){
			var ape032=mini.get("ape032").getValue();
			var aae041 = mini.get("aae041");
			var aae042 = mini.get("aae042");
			if(ape032=="M"){
				aae041.setValue(monthStart);
				aae042.setValue(monthEnd);
				}
			else if(ape032=="S"){
				aae041.setValue(quarterStart);
				aae042.setValue(quarterEnd);
				}
			else if(ape032=="Y"){
				aae041.setValue(yearStart);
				aae042.setValue(yearEnd);
				}
		}
</script>
	</body>
</html>