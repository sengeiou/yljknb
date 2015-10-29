<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>规则分类统计</title>
<%@ include file="../../../pages/pub/pubsource.jsp"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/highcharts/highcharts-3d.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/pagertree.js"></script>
	
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/scripts/boot.js"></script>

<script type="text/javascript">
	var aka130str = [ {
		id : '1',
		text : '住院'
	}, {
		id : '2',
		text : '门诊'
	} ];
</script>
</head>
<body>
	<div style="width: 100%; height: 100%">
		<div id="editForm1" class="cxTabbox">
		<input id="baz001" name="baz001" class="mini-hidden">
			<table class="cxTab" cellpadding="0" cellspacing="0" border="0"
				width="100%">
				<tr>
					<td class="textR">就诊开始日期：</td>
					<td>
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input name="akc194s" id="akc194s" class="mini-datepicker"
										format="yyyy-MM-dd" emptyText="" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">就诊结束日期：</td>
					<td>
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input name="akc194e" id="akc194e" class="mini-datepicker"
										format="yyyy-MM-dd" emptyText="" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR">就诊类型：</td>
					<td>
						<div class="inputL" style="width: 130px">
							<div class="inputR">
								<div class="inputC">
									<input name="aka130" id="aka130" class="mini-combobox"
										emptyText="请选择..." data="aka130str" />
								</div>
							</div>
						</div>
					</td>
					<td class="textR" colspan="2" style="text-align: right;">
						<div style="margin-left:87px;">
							<input type="button" value="" class="cxsubmit"
								onclick="search();" /> <input type="button" value=""
								class="cxreset" onclick="reset();" /><input id="aaa168"
								name="aaa168" class="mini-textbox" emptyText="" visible="false" />
							<input id="akb020" name="akb020" class="mini-textbox"
								emptyText="" visible="false" />
						</div></td>
				</tr>
			</table>
		</div>
		<div class="mini-splitter nobor" style="width: 100%; height: 240px;">
			<div size="50%" showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx">规则分类统计</span>
				</h3>
				<div id="chartPie" style="width: 100%; height: 200px;"></div>
			</div>
			<div showCollapseButton="false" class="listTit">
				<h3 class="cxTit fL">
					<span class="iconCx" id="titleText">医院违规明细统计</span>
				</h3>
				<div id="grid1" class="mini-datagrid" idField="id"
					style="width: 100%; height: 202px;" allowResize="true"
					onrowclick="queryDetail" multiSelect="false" pageSize="5"
					sizeList="[5]"
					url="${pageContext.request.contextPath}/k2/f10202002/queryF10202002Rules.action">
					<div property="columns">
						<div type="checkcolumn"></div>
						<div field="akb021" width="150" headerAlign="center"
							align="center">医疗机构名称</div>
						<div field="akb020" width="60" headerAlign="center" align="center">
							医疗机构编码</div>
						<div field="aaa027" width="60" headerAlign="center" align="center">
							统筹区</div>
						<div field="wfmxs" width="100" headerAlign="center" align="center">
							违规明细数</div>
					</div>
				</div>
			</div>
		</div>
	</div>
		<div id="detailgrid1_Form" style="display: none;">
				<div id="detailgrid1">
				</div>
		</div>
	<div id="tabs1" class="mini-tabs" activeIndex="0" style="width: 100%;"
		plain="false">
		<div title="违规明细信息" name="panel1">
			<div id="grid2" class="mini-datagrid" style="height: 200px;"
				idField="id" multiSelect="true" allowResize="false"
				 onshowrowdetail="onShowRowDetail1" 
				allowResize="true" pageSize="5" sizeList="[5]"s
				url="${pageContext.request.contextPath}/k2/f10202002/queryF10202002Detail.action"
			 >
				<div property="columns">
					<div type="indexcolumn"></div>
					<div type="expandcolumn" >~</div>
					<div field="baz001" width="80" headerAlign="center" align="center"
						allowSort="true" visible="false">baz001</div>
					<div field="baz003" width="80" headerAlign="center" align="center"
						allowSort="true" visible="false">baz003</div>
					<div field="aac003" width="80" headerAlign="center" align="center"
						allowSort="true" >姓名</div>
					
					<div field="aac002" width="150" headerAlign="center" align="center"
						allowSort="true">社会保障号</div>
					<div field="aac004" width="60" headerAlign="center" align="center"
						allowSort="true" type="comboboxcolumn">
						性别 <input property="editor" class="mini-combobox"
							style="width: 100%" data="${dic['AAC004']}">
					</div>
					<div field="aac006" width="80" headerAlign="center" align="center"
						allowSort="true">出生日期</div>
					<div field="ake001" width="150" headerAlign="center" align="center"
						allowSort="true">三大目录编码</div>
					<div field="ake002" width="100" headerAlign="center" align="center"
						allowSort="true">三大目录名称</div>
					<div field="ake003" width="100" headerAlign="center" align="center"
						allowSort="true" type="comboboxcolumn">
						三大目录类别 <input property="editor" class="mini-combobox"
							style="width: 100%" data="${dic['AKE003']}">
					</div>
					<div field="akc226" width="60" headerAlign="center" align="center"
						allowSort="true">数量</div>
					<div field="akc225" width="60" headerAlign="center" align="center"
						allowSort="true">单价</div>
					<div field="akb065" width="60" headerAlign="center" align="center"
						allowSort="true">合计</div>
					<div field="aaa167" width="100" headerAlign="center" align="center"
						allowSort="true">违反规则</div>
					<div field="aaa133" width="150" headerAlign="center" align="center"
						allowSort="true">违规说明</div>
				</div>
			</div>
		</div>
	</div>
	</div>
<script type="text/javascript">
	mini.parse();

   function onShowRowDetail1(e) {
        var grid = e.sender;
        var row = e.record;
      //  alert(row.baz001);
     //  alert(row.baz003);
        var td = grid.getRowDetailCellEl(row);
        td.appendChild(detailgrid1_Form);
        detailgrid1_Form.style.display = "block";
        $("#detailgrid1").html("");
        $.ajax({
            url: "${pageContext.request.contextPath}/k2/f10202002/queryKc62ByBaz001.action",
            type: "post",
            data: { baz001: row.baz001,baz003: row.baz003 },
            success: function (text) {
         	if(text.success){
               var htmlStr = "";
               
               if(text.result.length>1){
                  for(var i=1;i<=text.result.length;i++){
                    var resp = text.result[i];
	                htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
	                htmlStr += "<span>";
	                htmlStr += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["aac003"].trim() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"; 
	                htmlStr += "</span>";
	                htmlStr += resp["aac002"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                if(resp["aac004"]=='1'){
	                 htmlStr +='男'+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                }else{
	                 htmlStr +='女'+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                }
	                htmlStr += resp["aac006"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["ake001"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["ake002"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                var ake003;
	                switch(parseInt(resp["ake003"])){
						case 1:
							ake003='药品';
						break; 
						case 2:
							ake003='诊疗项目';
						break; 
						case 3:
							ake003='服务设施';
						break; 
						case 4:
							ake003='医用材料';
						}
	                htmlStr += ake003+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akc226"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akc225"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akb065"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["aaa167"]+"<br/>";
	                //htmlStr += resp["aaa133"]; 违规说明 
	                htmlStr += "</div>";
               }
               }else{
	                var resp = text.result[0];
	                htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
	                htmlStr += "<span>";
	                htmlStr += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["aac003"].trim() + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"; 
	                htmlStr += "</span>";
	                htmlStr += resp["aac002"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                if(resp["aac004"]=='1'){
	                 htmlStr +='男'+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                }else{
	                 htmlStr +='女'+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                }
	                htmlStr += resp["aac006"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["ake001"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["ake002"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                var ake003;
	                switch(parseInt(resp["ake003"])){
						case 1:
							ake003='药品';
						break; 
						case 2:
							ake003='诊疗项目';
						break; 
						case 3:
							ake003='服务设施';
						break; 
						case 4:
							ake003='医用材料';
						}
	                htmlStr += ake003+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akc226"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akc225"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["akb065"]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	                htmlStr += resp["aaa167"];
	                //htmlStr += resp["aaa133"]; 违规说明 
	                htmlStr += "</div>";
               }
                	
            	$("#detailgrid1").append(htmlStr);
            	}else{
                	mini.alert(text.msg);
                }  
         
                //	for(var i=0;i<text.result[0].length;i++){
                ////		htmlStr += "<div style='padding:6px 10px 6px 62px;'>";
                	//	htmlStr += "<span>";
                //		htmlStr += text.result[0].kc73List[i].aaa167 + "："; 
                	//	htmlStr += "</span>";
                	//	htmlStr += text.result[0].kc73List[i].aaa133;
                	//	htmlStr += "</div>";
                //    }
                	
            	
            }
        });
    }
		function search() {
			var form = new mini.Form("#editForm1");
			var data = form.getData(true);
			var url = '${pageContext.request.contextPath}/k2/f10202002/getF10202002Chart.action';
			getChartData(url, data, function(datas) {
				showPieChart('chartPie', '', datas, "grid1", "editForm1");
			});
		}
	
		function queryDetail(e) {
			var grid = e.sender;
			var record = grid.getSelected();
			if (record) {
				form = new mini.Form("#editForm1");
				mini.get("akb020").setValue(record.akb020);
				var data = form.getData(true);
				var grid2 = mini.get("grid2");
				grid2.load(data);
			} else {
				mini.alert("请双击选择数据!");
				return false;
			}
		}
		function reset() {
			var form = new mini.Form("#editForm1");
			form.reset();
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
								subtitle : {
									text : '总人数' + datas.zs,
									align : 'right',
									verticalAlign : 'bottom'
								},
								title : {
									text : title
								},
								tooltip : {
									pointFormat : '<b>{point.y}人</b><br/><b>{point.percentage:.1f}%</b>'
								},
								pane : {
									size : '100%'
								},
								plotOptions : {
									pie : {
										allowPointSelect : true,
										cursor : 'pointer',
										dataLabels : {
											enabled : true,
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
									data : datas.datas,
									events : {
										click : function(event) {
											var code = event.point.code;
											mini.get("aaa168").setValue(code);
											var data = new mini.Form("#"
													+ formId).getData();
											var grid = mini.get(gridId);
											grid.load(data);
										}
									}
								} ]
							});
		}
	</script>
</body>
</html>