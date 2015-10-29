<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<%@page import="java.util.*,java.text.SimpleDateFormat"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>医疗服务机构接诊人次发展趋势分析</title>
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
			src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js">
		</script>
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
												<input id="ape032" name="ape032" class="mini-combobox" value="M"
													emptyText="请选择..." data="${dic['APE032']}" required="true" onvaluechanged="changeDate" />
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
													value="<%=month_date_s%>" onvaluechanged="" required="true" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>终止年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae042" name="aae042" format="yyyy-MM" value="<%=month_date_s%>" onvaluechanged="" 
											    	class="mini-monthpicker" required="true" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>分析指标：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="mdrc" name="mdrc" class="mini-combobox" 
												value="AKE096"
												emptyText="请选择..." data="${dic['MDRC']}" />
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
													emptyText="请选择..." data="${dic['AAA027']}" textField="text" valueField="id" required="true" />
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
													emptyText="请选择..."  
													data="${dic['AAE140']}" textField="text" valueField="id" required="true"/>
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
								<td class="textR">医疗机构类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb022" name="akb022" class="mini-combobox"
													emptyText="请选择..." data="${dic['AKB022']}" textField="text" valueField="id"
													required="true" />
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
													emptyText="请选择..." data="${dic['AKA130']}" textField="text" valueField="id" required="true" />
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
													emptyText="请选择..." data="${dic['AKA101']}" textField="text" valueField="id"
													required="true" />
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td style="text-align: right; padding-top: 5px; padding-right:10px;"
									colspan="10">
									<input type="button"value="" class="cxsubmit" onclick="search();" />
									<input type="reset" value="" class="cxreset" onclick="resetForm();"/>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</fieldset>
		<fieldset>
			<div style="width: 100%; height: 200px;">
				<div size="35%" showCollapseButton="false" class="listTit">
					<h3 class="cxTit fL">
						<span class="iconCx">移动平均</span>
					</h3>
					<div id="chartColumnLine" style="width: 100%; height: 170px;">

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
				<div id="grid" class="mini-datagrid" idField="" multiSelect="false"
					style="width: 100%; height: 141px;" allowResize="true" 
					url="${pageContext.request.contextPath }/k6/f10603005/viewTrend.action">
					<div property="columns">
						<div type="indexcolumn"></div>
						<div field="aae041" width="140" headerAlign="center" align="center"
							allowSort="true">
							统计本月
						</div>
						<div field="cur_pred" width="140" headerAlign="center" align="center"
							allowSort="true">
							本期数
						</div>
						<div field="sam_pred" width="140" headerAlign="center" align="center"
							allowSort="true">
							上年同期数
						</div>
						<div field="pre_pred" width="140" headerAlign="center" align="center"
							allowSort="true">
							上期数
						</div>
						<div field="sam_rate" width="140" headerAlign="center" align="center"
							allowSort="true">
							同比增长率(%)
						</div>
						<div field="pre_rate" width="140" headerAlign="center" align="center"
							allowSort="true">
							环比增长率(%)
						</div>
						<div field="tre_mean" width="140" headerAlign="center" align="center"
							allowSort="true">
							移动平均
						</div>
						<div field="analid" visible="false">id</div>
					</div>
				</div>
			</div>
		</fieldset>
		<script type="text/javascript">
			mini.parse();
			var form = new mini.Form("form1");
			GetDate();
			changeDate();
			function search(){
			
				if(validMyDate()){
					var data = form.getData(true);
					var grid = mini.get("grid");
					var url = '${pageContext.request.contextPath}/k6/f10603005/queryMoveAverage.action';
					var json = mini.encode(data);
					getChartData(url, json, function(datas) {
						grid.load({submitData : json , analid :  datas.analid});
						showChartColumnLine('chartColumnLine','', datas ,'','');
					});
					
				}
			}
			
		//弹出医疗机构
		function onButtonEdit1(e){
			var btnEdit = this;
			var akb022 = mini.get("akb022");
			var aka101 = mini.get("aka101");
			mini.open({
				url:"${pageContext.request.contextPath}/pages/pub/selectMedi.jsp",
				title:"查询案件信息",
				width: 800,
               	height: 480,
               	ondestroy: function (action){
               		if (action == "ok"){
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
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            type: 'column',
            name: '时间',
            data: datas.dates1

        },{
            type: 'line',
            name: '人次',
            data: datas.dates2

        }]
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
				mini.alert("起始终止年度不能为空，请重新录入！","录入错误");
			    return false;
			}
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
			yearStart=year+"-1";
			yearEnd=year+"-12";
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
			//统计周期
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
		
		function validMyDate(){
		var isNull=isNotNullThree();
			var ape032 = mini.get("ape032").getValue();
			var aae041 = mini.get("aae041").getFormValue();
			var aae042 = mini.get("aae042").getFormValue();
		    var aae041sub = aae041.substring(0,4)+aae041.substring(5,7);
		    var aae042sub = aae042.substring(0,4)+aae042.substring(5,7);
	        if(isNull)
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
	            
	        return true;

	        }else{
	        	return isNull
	        }
		}
		</script>
	</body>
</html>