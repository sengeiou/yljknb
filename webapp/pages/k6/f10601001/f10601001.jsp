<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>参保人医疗费用情况分析</title>
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
						<table class="cxTab" cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td class="textR"><span style="color: red;">*</span>起始年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae041Star" name="aae041Star" class="mini-monthpicker" 
													onvaluechanged="onValueChanged1" format="yyyy-MM" required="true"/>
												<input id="aae041s" name="aae041s" class="mini-hidden" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>终止年月：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae042End" name="aae042End" class="mini-monthpicker"
											    	 onvaluechanged="onValueChanged2" format="yyyy-MM" required="true"/>
											    <input id="aae042s" name="aae042s" class="mini-hidden" />
											</div>
										</div>
									</div>
								</td>
								<td class="textR"><span style="color: red;">*</span>排名数量：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="rank" name="rank" value="10" class="mini-textbox" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">险种类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aae140" name="aae140" class="mini-combobox" emptyText="请选择..." 
													data="${dic['AAE140']}" textField="text" valueField="id" required="true"/>
											</div>
										</div>
									</div>
								</td>
								<td class="textR">就诊类型：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka130" name="aka130" class="mini-combobox" emptyText="请选择..." 
													data="${dic['AKA130']}" textField="text" valueField="id" required="true"/>
											</div>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<%-- <td class="textR">统筹区编码：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aaa027" name="aaa027" class="mini-combobox" emptyText="请选择..."
											   		data="${dic['AAA027']}" textField="text" valueField="id" required="true"/>
											</div>
										</div>
									</div>
								</td> --%>
								<%-- <td class="textR">身份类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akc021" name="akc021" class="mini-combobox" emptyText="请选择..."
													data="${dic['AKC021']}" textField="text" valueField="id" required="true" />
											</div>
										</div>
									</div>
								</td> --%>
								<td class="textR">医疗机构ID：</td>
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
								<!-- <td class="textR">疾病分类：</td>
								<td>
									<div class="inputL" style="width: 130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka122" name="aka122" class="mini-buttonedit"
													onbuttonclick="onButtonEdit2" emptyText="" />
											</div>
										</div>
									</div>
								</td> -->
								<td class="textR">医疗机构类别：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="akb022" name="akb022" class="mini-combobox"
													data="${dic['AKB022']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td>
								<td style="text-align: right; padding-top: 5px; padding-right:10px;"
									colspan="8">
									<input type="button"value="" class="cxsubmit" onclick="search()" />
									<input type="reset" value="" class="cxreset" onclick="resetForm()"/>
								</td>
							</tr>
							<tr>
								<%-- <td class="textR">医院等级：</td>
								<td>
									<div class="inputL" style="width:130px">
										<div class="inputR">
											<div class="inputC">
												<input id="aka101" name="aka101" class="mini-combobox" 
													data="${dic['AKA101']}" textField="text" valueField="id"
													required="true" emptyText="请选择..." />
											</div>
										</div>
									</div>
								</td> --%>
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
					<div id="insurExpen" style="width: 100%; height: 210px;"></div>
				</div>
			</div>
		</fieldset>
		<fieldset>
			<div showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx" id="titleText">详细信息(<font color=red>可双击查看就诊信息</font>)</span>
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
							style="width: 100%; height: 141px;" allowResize="true" onrowdblclick="onRowDblclick1"
							url="${pageContext.request.contextPath}/k6/f10601001/loadInsurCensu.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaz107" width="100" headerAlign="center" align="center" visible="false">机构编号</div>
								<div field="aac001" width="100" headerAlign="center" align="center" visible="false">人员编号</div>
								<div field="aka122" width="100" headerAlign="center" align="center" visible="false">疾病分类</div>
								<div field="aaa027" width="100" headerAlign="center" align="center" visible="false">统筹区编码</div>
								<div field="aae140" width="100" headerAlign="center" align="center" visible="false">险种类型</div>
								<div field="aae041" width="100" headerAlign="center" align="center" allowSort="true">就诊年月</div>
								<div field="aae041Star" width="100" headerAlign="center" dateFormat="yyyy-MM" visible="false">就诊年月</div>
								<div field="akc021" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									身份类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKC021']}">
								</div>
								<div field="aka130" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									就诊类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKA130']}">
								</div>
								<div field="ake052" width="100" headerAlign="center" align="center" allowSort="true">就诊次数</div>
								<div field="akc264" width="100" headerAlign="center" align="center" allowSort="true">医疗费用</div>
								<div field="akc254" width="100" headerAlign="center" align="center" allowSort="true">个人自付费用</div>
								<div field="akc253" width="100" headerAlign="center" align="center" allowSort="true">自费费用</div>
								<div field="cjfy" width="100" headerAlign="center" align="center" allowSort="true">次均费用</div>
							</div>
						</div>
					</div>
					<div title="疾病分类" name="">
						<div id="grid2" class="mini-datagrid" idField="" multiSelect="false"
							style="width: 100%; height: 141px;" allowResize="true" onrowdblclick="onRowDblclick2"
							url="${pageContext.request.contextPath}/k6/f10601001/loadInsurDise.action">
							<div property="columns">
								<div type="indexcolumn"></div>
								<div field="aaz107" width="100" headerAlign="center" align="center" visible="false">机构编号</div>
								<div field="aac001" width="100" headerAlign="center" align="center" visible="false">人员编号</div>
								<div field="aaa027" width="100" headerAlign="center" align="center" visible="false">统筹区编码</div>
								<div field="aae140" width="100" headerAlign="center" align="center" visible="false">险种类型</div>
								<div field="aae041" width="100" headerAlign="center" align="center" allowSort="true">就诊年月</div>
								<div field="aae041Star" width="100" headerAlign="center" dateFormat="yyyy-MM" visible="false">就诊年月</div>
								<div field="akc021" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn">
									身份类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKC021']}">
								</div>
								<div field="aka130" width="100" headerAlign="center" align="center" allowSort="true" type="comboboxcolumn" visible="false">
									就诊类别<input property="editor" class="mini-combobox" style="width:100%" data="${dic['AKA130']}">
								</div>
								<div field="aka121" width="100" headerAlign="center" align="center" allowSort="true">疾病分类名称</div>
								<div field="aka122" width="100" headerAlign="center" align="center" allowSort="true">疾病分类</div>
								<div field="ake052" width="100" headerAlign="center" align="center" allowSort="true">就诊次数</div>
								<div field="akc264" width="100" headerAlign="center" align="center" allowSort="true">医疗费用</div>
								<div field="akc254" width="100" headerAlign="center" align="center" allowSort="true">个人自付费用</div>
								<div field="akc253" width="100" headerAlign="center" align="center" allowSort="true">自费费用</div>
								<div field="cjfy" width="100" headerAlign="center" align="center" allowSort="true">次均费用</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</fieldset>
		<script type="text/javascript">
			mini.parse();
			
			mini.get("aae041Star").setValue(new Date());
			var aae041StarDate = mini.get("aae041Star").getValue();
			mini.get("aae041s").setValue(getDateYmd(aae041StarDate));
			
			mini.get("aae042End").setValue(new Date());
			var aae042EndDate = mini.get("aae042End").getValue();
			mini.get("aae042s").setValue(getDateYmd(aae042EndDate));
			
			var form = new mini.Form("form1");
			
			var grid1 = mini.get("grid1");
			
			var grid2 = mini.get("grid2");
			
			function search(){
				changeApeAndTitle();
				var data = form.getData(true);
				var url = "${pageContext.request.contextPath}/k6/f10601001/loadInsurVisit.action";
				var json = mini.encode(data);
				getChartData(url, json, function(datas) {
					showBarChartAnal('insurExpen','', datas ,'','');
				});
			}
			
			//图表标题
			function changeApeAndTitle(){
				var rank = mini.get("rank").getValue();
				document.getElementById("span1").innerHTML = "参保人医疗费用排名前" + rank + "图表信息"
			}
			
			function getChartData(url, params, callback) {
				$.ajax(url, {
					type : 'POST',
					data : { submitData: params },
					cache : false,
					async : true,
					dataType : 'json',
					success : function(data) {
						callback(data);
					}
				});
			}
			
			function showBarChartAnal(divId, title, datas , seriesName, clickFuc){
				if(seriesName == null) seriesName = "次数";
				var chart = new Highcharts.Chart({
					chart: {
			            renderTo: divId,
			            type: 'column',
			            margin: [25,30,25,80],
			            options3d: {
			                enabled: false,
			                alpha: 0,
			                beta: 0,
			                depth: 0,
			                viewDistance: 25
			            }
			        },
			        title: {
			            text: ''
			        },
			        subtitle: {
			            text: ''
			        },
			        xAxis: {
			            categories: datas.xAxisCategories,
			            labels : {
							rotation : 0,
							align : 'center',
							style : {
								fontSize : '12px',
								fontFamily : 'Verdana, sans-serif'
							}
						}
			        },
			        yAxis: {
			            min: 0,                                                        
				        title: {                                                       
				          text: ' ',                             
				          align: 'high'                                              
				        },                                                             
				        labels: {                                                      
				           overflow: 'justify',
				           style : {
								color : '#4572A7'
						   }                                       
				        }       
			        },
			        plotOptions: {
			           column: {
                			depth: 25,
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
			        credits: {                                                 
				            enabled: false                                      
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
			        tooltip: {                                                         
				            valueSuffix: ''                                       
				        }, 
			        series: [{
			        	type: 'column',
			            name: '参保人医疗费用情况',
			            data: datas.datas1,
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
			            events :{
			            	click : function(event){
			            		var x = event.point.id;//获取横坐标的值
			            		//var strs= new Array(); //定义一数组
			            		//strs = x.split("."); //字符分割 
			            		var aac001 = x;//获取参保人ID
			            		var data = form.getData(true);
			            		var json = mini.encode(data);
			            		grid1.load({aac001 : aac001 , submitData : json});
			            		grid2.load({aac001 : aac001 , submitData : json});
			            	}
			            }
			        }]
				});                                       
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
			
			//弹出疾病分类
			function onButtonEdit2(e){
				var btnEdit = this;
				mini.open({
					url:"${pageContext.request.contextPath}/pages/pub/selectDise.jsp",
					title:"查询疾病信息",
					width: 800,
                	height: 480,
                	ondestroy: function (action){
                		if (action == "ok"){
                			var iframe = this.getIFrameEl();
                			var data = iframe.contentWindow.GetData();
                			data = mini.clone(data);
                			btnEdit.setValue(data.aka122);
                			btnEdit.setText(data.aka122);
                		}
                	}
				});
			}
			
			function onValueChanged1(e){
				var aae041StarDate = mini.get("aae041Star").getValue();
				mini.get("aae041s").setValue(getDateYmd(aae041StarDate));
			}
			
			function onValueChanged2(e){
				var aae041StarDate = mini.get("aae041Star").getValue();
				var aae042EndDate = mini.get("aae042End").getValue();
				if(aae041StarDate > aae042EndDate){
					mini.alert("结束日期不能小于开始日期");
					mini.get("aae042s").setValue("");
					mini.get("aae042End").setValue("");
				}else{
					mini.get("aae042s").setValue(getDateYmd(aae042EndDate));
				}
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
				
				if(row1){
					 mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10601001/f10601001_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : row1.aae041,aac001 : row1.aac001 , aae041Star : row1.aae041Star};
							iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			                
			            }
	        		}); 
				}else if(row2){
					mini.open({
			            url: "${pageContext.request.contextPath}/pages/k6/f10601001/f10601001_visinfo.jsp",
			            title: "分析疑点问题", 
			            width: 1000, 
			            height: 600,
			            onload: function () {
			                var iframe = this.getIFrameEl();
			                var data = {aae041 : row2.aae041,aac001 : row2.aac001,aae041Star : row2.aae041Star};
							iframe.contentWindow.setData(data);
			            },
			            ondestroy: function (action) {
			                
			            }
	        		});
				}else{
					mini.alert("请选择参保人结算信息");
				}
			}
			
			//医疗诶别双击查看就诊信息
			function onRowDblclick1(e){
				var grid = e.sender;
				var record = e.record;
				mini.open({
			    	url: "${pageContext.request.contextPath}/pages/k6/f10601001/f10601001_visinfo.jsp",
			        title: "分析疑点问题", 
			        width: 1000, 
			        height: 600,
			        onload: function () {
			        	var iframe = this.getIFrameEl();
			            var data = {aae041 : record.aae041,aac001 : record.aac001,aae041Star : record.aae041Star};
						iframe.contentWindow.setData(data);
			        },
			        ondestroy: function (action) {
			        	
			       }
	        	});
			}
			
			//疾病分类双击查看就诊信息
			function onRowDblclick2(e){
				var grid = e.sender;
				var record = e.record;
				mini.open({
			    	url: "${pageContext.request.contextPath}/pages/k6/f10601001/f10601001_visinfo.jsp",
			        title: "分析疑点问题", 
			        width: 1000, 
			        height: 600,
			        onload: function () {
			        	var iframe = this.getIFrameEl();
			            var data = {aae041 : record.aae041,aac001 : record.aac001,aae041Star : record.aae041Star};
						iframe.contentWindow.setData(data);
			        },
			        ondestroy: function (action) {
			        	
			       }
	        	});
			}
			
			function getDateYmd(date){   
			    var thisYear = date.getFullYear() + "";   
			    var thisMonth = date.getMonth() + 1 + "";   
			    //如果月份长度是一位则前面补0   
			    if(thisMonth<10) thisMonth = "0" + thisMonth;   
			       
			    var thisDay = date.getDate() + "";   
			    //如果天的长度是一位则前面补0   
			    if(thisDay<10) thisDay = "0" + thisDay;
			       
			    return thisYear + "" + thisMonth + "" + thisDay + "";   
			}
			
			function resetForm(){
				form.reset();
				mini.get("rank").setValue("10");
				
				mini.get("aae041Star").setValue(new Date());
				var aae041StarDate = mini.get("aae041Star").getValue();
				mini.get("aae041s").setValue(getDateYmd(aae041StarDate));
			
				mini.get("aae042End").setValue(new Date());
				var aae042EndDate = mini.get("aae042End").getValue();
				mini.get("aae042s").setValue(getDateYmd(aae042EndDate));
			}
		</script>
	</body>
</html>